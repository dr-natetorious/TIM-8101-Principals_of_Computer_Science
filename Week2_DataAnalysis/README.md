# How to startup the snap project

Snap is not compatible with Python3 and requires python2.7

You need to use ipython not the modern jupyter to work around the issue.

Note that the SSL certificate will not be valid and you will need to bypass it in chrome.

```
docker build -t snaplab .
docker run -it --rm -p 8888:8888 --name snappy -v %cd%:/home/jovyan/work  snaplab

start https://localhost:8888
default password: password
```