FROM ipython/notebook

RUN apt-get -y update

# Build the source files...
WORKDIR /src
COPY snap-4.1.0-4.1-centos6.5-x64-py2.6.tar.gz /src
RUN tar -xvf snap-4.1.0-4.1-centos6.5-x64-py2.6.tar.gz

WORKDIR /src/snap-4.1.0-4.1-centos6.5-x64-py2.6
RUN python setup.py install

ENV PASSWORD "password"

# Setup Google Test
RUN apt-get -y install libgtest-dev cmake
WORKDIR /usr/src/gtest
RUN cmake CMakeLists.txt
RUN make
RUN cp *.a /usr/lib

# Setup graphviz
RUN apt-get -y install graphviz

# Build the snap bits...
WORKDIR /src
COPY Snap-4.1.zip /src
RUN apt-get -y install zip
RUN unzip Snap-4.1.zip
WORKDIR /src/Snap-4.1
RUN make

WORKDIR /home/jovyan/work

