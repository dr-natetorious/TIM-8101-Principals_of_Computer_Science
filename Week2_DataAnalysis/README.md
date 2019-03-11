# How to startup the snap project

Run this docker image

```
docker build -t snaplab .
docker run -it -p 8888:8888 --name snappy snaplab
```