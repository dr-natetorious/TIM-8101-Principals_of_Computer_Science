FROM ipython/notebook


# Build the source files...
WORKDIR /src
COPY snap-4.1.0-4.1-centos6.5-x64-py2.6.tar.gz /src
RUN tar -xvf snap-4.1.0-4.1-centos6.5-x64-py2.6.tar.gz

WORKDIR /src/snap-4.1.0-4.1-centos6.5-x64-py2.6
RUN python setup.py install

ENV PASSWORD "password"
