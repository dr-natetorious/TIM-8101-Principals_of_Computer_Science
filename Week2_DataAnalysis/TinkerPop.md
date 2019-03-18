# What is Apache TinkerPop ?

It is an Graph Database server which you write Gremlin based queries.

## How do I start one locally?

A [docker image](https://hub.docker.com/r/tinkerpop/gremlin-server) can be launched as:

```
docker run -it -p 8182:8182 tinkerpop/gremlin-server
docker run -it tinkerpop/gremlin-console
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

## How do I visualize my graphs?

The recommended program for TinkerPop is [Gephi](https://gephi.org/users/download/)

Instructions for sending to Gephi can be [found here](https://groups.google.com/forum/#!topic/gremlin-users/pT87rPvty0g).

That doesnt seem to work on Windows...

https://github.com/tinkerpop/blueprints/wiki/graphml-reader-and-writer-library

This is how you export to GraphML: graph.io(graphml()).writeGraph('/tmp/Facebook.graphml')

Then the file can be imported into Gephi.

To export a smaller chunk of the graph use:

```
gremlin> g.V(v_0).outE().subgraph('sg').cap('sg').next()
==>tinkergraph[vertices:348 edges:3319]
gremlin> subgraph = g.V(v_0).outE().subgraph('sg').cap('sg').next()
==>tinkergraph[vertices:348 edges:3319]
gremlin> subgraph.io(graphml()).writeGraph('/tmp/node-0.graphml')
```

## Where did the data sets come from?

- Marvel http://syntagmatic.github.io/exposedata/marvel/

- Facebook http://snap.stanford.edu/data/ego-Facebook.html

## Running Grephi on big box

- Create EC2 SPot instance

- Install Java https://www.java.com/en/download/windows-64bit.jsp

- Install OpenGL for NVidia Telsa http://us.download.nvidia.com/Windows/Quadro_Certified/398.75/398.75-tesla-desktop-win10-64bit-international.exe

- Install Grephi

## How DO I reload the graph?

```
docker cp Facebook.graphml tinker:/tmp
```

```
docker run -it tinkerpop/gremlin-console

Mar 16, 2019 5:54:30 AM java.util.prefs.FileSystemPreferences$1 run
INFO: Created user preferences directory.

         \,,,/
         (o o)
-----oOOo-(3)-oOOo-----
plugin activated: tinkerpop.server
plugin activated: tinkerpop.utilities
plugin activated: tinkerpop.tinkergraph
gremlin> graph = TinkerGraph.open();
==>tinkergraph[vertices:0 edges:0]
gremlin> graph.io(graphml()).readGraph('/tmp/Facebook.graphml');
==>null
gremlin> graph
==>tinkergraph[vertices:4031 edges:39368]
```
