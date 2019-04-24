#!/bin/bash

function header(){
  echo "=========================="
  echo "$*"
  echo "=========================="
}

for ix in `seq 1 63`;
do

    header "Page: $ix"
    curl -L https://f-droid.org/en/packages/$ix/index.html | grep 'package-header' | grep en | tr -d ' ' | cut -d '=' -f 3 | tr -d '">' > $ix.list
    for pkg in `cat $ix.list`; 
    do
        header "Page $ix: $pkg"

        curl -L -o package.html https://f-droid.org$pkg
        curl -L `cat package.html | grep .apk | grep -v FDroid | head -n 1 | cut -d = -f 2 | tr -d '">'` -o `basename $pkg.apk`
        curl -L `cat package.html | grep .src.tar.gz | cut -d = -f 2 | cut -d '"' -f 2 | head -n 1` -o `basename $pkg.src.tar.gz`
    done
done

