#!/bin/bash

echo "Tutorial 1"

clang -I ~klee/klee_src/include -emit-llvm -c -g -O0 -Xclang -disable-O0-optnone get_sign.c

