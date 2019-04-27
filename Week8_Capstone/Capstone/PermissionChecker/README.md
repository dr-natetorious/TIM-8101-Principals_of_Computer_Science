# What what it works!!

graph = TinkerGraph.open()
graph.io(graphml()).readGraph('/files/manifests.graphml')
graph.traversal().V('perm__android.permission.WRITE_CALENDAR').inE().outV().outE().inV().has('node_type','service').count()