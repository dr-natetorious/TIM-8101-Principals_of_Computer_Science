# What is KLEE ?

A symbolic execution engine for finding test cases within a function under test.

## How Do I start Klee?

Runing the [devenv.bat](devenv.bat) will build the docker image and bind the `/Klee` local folder to `/src`.

## Where are things located in the image?

- klee source: `~klee/klee_src`
- klee bin   : `~klee/klee_build`

For convenience environment variables `KLEE_INC` and `KLEE_LIB` are set on the image.

## How do I build hello world?

```bash
# Build get_sign.c
pushd /src/tutorial
clang -I ~klee/klee_src/include -emit-llvm -c -g -O0 -Xclang -disable-O0-optnone get_sign.c
klee get_sign.bc

# Look at the output
find . | grep klee-out
ktest-tool klee-out-0/test000003.ktest

# Run a test case
gcc -I ~klee/klee_src/include/ -L ~klee/klee_build/lib get_sign.c -lkleeRuntest -o get_sign
KTEST_FILE=klee-out-0/test000001.ktest ./get_sign

# Look at the result value from the test
echo $?
```

## How do I build the regex example?

```bash
clang -I ~klee/klee_src/include -emit-llvm -c -g -O0 -Xclang -disable-O0-optnone Regexp.c
klee --only-output-states-covering-new Regexp.bc
```