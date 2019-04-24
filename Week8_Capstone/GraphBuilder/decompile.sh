#!/bin/bash

# Set globals here...
apk_url=$1
apk_local=apk.zip


function header(){
  echo "=========================="
  echo "$*"
  echo "=========================="
}

# Download the payload locally
header "Downloading: $apk_url...."
curl -o $apk_local $apk_url

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
  javap -c $x > $outfile
done

popd
