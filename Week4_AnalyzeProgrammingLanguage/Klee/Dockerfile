FROM klee/klee:2.0
LABEL Author="Nate Bachmeier"
LABEL Purpose="Follow along with Klee Tutorial"

RUN sudo apt-get -y update && sudo apt-get -y install nano vim

ENV KLEE_INC "~klee/klee_src/inc"
ENV KLEE_LIB "~klee/klee_build/lib"
ENV LD_LIBRARY_PATH "~klee/klee_build/lib:${LD_LIBRARY_PATH}"