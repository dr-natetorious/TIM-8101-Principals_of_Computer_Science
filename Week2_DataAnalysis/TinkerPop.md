# What is Apache TinkerPop ?

It is an Graph Database server which you write Gremlin based queries.

## How do I start one locally?

A [docker image](https://hub.docker.com/r/tinkerpop/gremlin-server) can be launched as:

```
docker run -it -p 8182:8182 tinkerpop/gremlin-server
docker run -it docker pull tinkerpop/gremlin-console
```

## How do I build the graph?

A [guide](http://tinkerpop.apache.org/docs/3.1.0-incubating/tutorials-getting-started.html) is provided here.

```
graph = TinkerGraph.open()
g = graph.traversal()

v1 = g.addV('taco')
same = g.V().hasLabel('taco')
also_same = g.V(v1)
```