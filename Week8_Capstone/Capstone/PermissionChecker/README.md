# What what it works!!

graph = TinkerGraph.open()
graph.io(graphml()).readGraph('/files/manifests.graphml')
graph.traversal().V('perm__android.permission.WRITE_CALENDAR').inE().outV().outE().inV().has('node_type','service').count()

gremlin> graph.traversal().V().has('node_type','enabled_permission').inE().outV().outE().inV().has('node_type','service').dedup().count()
==>94
gremlin> graph.traversal().V().has('node_type','enabled_permission').inE().outV().outE().inV().has('node_type','service').dedup().count()
==>94
gremlin> graph.traversal().V().has('node_type','enabled_permission').inE().outV().has('node_type','manifest').dedup().count()
==>783
gremlin> graph.traversal().V().has('node_type','enabled_permission').inE().outV().outE().inV().has('node_type','service').dedup().count()
==>94
gremlin> graph.traversal().V().has('node_type','enabled_permission').inE().outV().outE().inV().has('node_type','receiver').dedup().count()
==>88

graph.traversal().V('perm__android.permission.SEND_SMS').inE().outV().outE().inV().has('node_type','service')