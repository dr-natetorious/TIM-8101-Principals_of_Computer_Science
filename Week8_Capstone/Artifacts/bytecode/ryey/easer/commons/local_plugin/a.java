public interface ryey.easer.commons.local_plugin.a<T extends ryey.easer.commons.local_plugin.f> {
  public abstract java.lang.Class<T> a();
}

graph.traversal().V().has('node_type','enabled_permission').inE().outV().outE().inV().has('is_background','true').inE().outV().has('node_type','manifest').dedup()