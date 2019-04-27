#!/bin/bash

# Set globals here...
apk_url=$1
do_decompile= true
apk_local=apk.zip


function header(){
  echo
  echo "=========================="
  echo "$*"
  echo "=========================="
  echo  
}

if [ ! $do_decompile ];
then
  header "WARNING: DECOMPILE IS NOT ENABLED"
  echo "Only soft extraction will be performed"
  echo
fi  

# Make temporary directory for this
header Creating temp path
base_path=/tmp/decompile 
rm -rf $base_path
mkdir -p $base_path
pushd $base_path

# Download the payload locally
header "Downloading: $apk_url...."

if [[ $apk_url == s3* ]]; 
then 
  aws s3 cp $apk_url $apk_local 


  # outdir=s3://apk.natetorio.us/`basename $apk_url`
  # exists=`aws s3 ls $outdir | wc -l`
  # if [ $exists -gt 0 ];
  # then
  #   header "exit early: already exists"
  #   exit 0
  # fi 

else
  curl -o $apk_local $apk_url
fi
  

# Get the resources...
header "APKTool: Get Resources..."
rm -rf $apklocal.out
apktool d -s $apk_local

# Get the classes.dex...
header "Get classes.dex..."
mkdir -p apk
pushd apk
  rm -rf *
  unzip ../$apk_local
popd

header "Convert classes.dex to classes.jar..."
cp apk/classes.dex .
/usr/bin/dex2jar/d2j-dex2jar.sh -f -o classes.jar classes.dex

# Crack open the classes.jar...
if [ $do_decompile ];
then
  header "Crack open the jar..."
  mkdir -p bytecode
  pushd bytecode
    rm -rf *
    unzip -o ../classes.jar

    header "Extracting byte code..."
    for x in `find -name *.class`;
    do
      echo "Class: $x"
      outfile=`echo $x | sed s/\.class/\.java/`
      javap -c -p $x > $outfile
    done
  popd
fi

# Upload the content back to
outdir=s3://apk.natetorio.us/`basename $apk_url`
header "Upload the files to S3"
aws s3 cp --recursive $base_path $outdir