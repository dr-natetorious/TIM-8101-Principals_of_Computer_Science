class com.google.common.a.j$c<K, V> extends com.google.common.a.p$a<K> {
  final java.util.Map<K, V> a;

  com.google.common.a.j$c(java.util.Map<K, V>);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method com/google/common/a/p$a."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #22                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #24                 // class java/util/Map
      12: putfield      #26                 // Field a:Ljava/util/Map;
      15: return

  java.util.Map<K, V> a();
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/util/Map;
       4: areturn

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #36,  1           // InterfaceMethod java/util/Map.clear:()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: aload_1
       5: invokeinterface #41,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      10: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #45,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
       9: ireturn

  public java.util.Iterator<K> iterator();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #51,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       9: invokeinterface #55,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      14: invokestatic  #58                 // Method com/google/common/a/j.a:(Ljava/util/Iterator;)Ljava/util/Iterator;
      17: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #62                 // Method contains:(Ljava/lang/Object;)Z
       5: ifeq          21
       8: aload_0
       9: invokevirtual #34                 // Method a:()Ljava/util/Map;
      12: aload_1
      13: invokeinterface #64,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      18: pop
      19: iconst_1
      20: ireturn
      21: iconst_0
      22: ireturn

  public int size();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #68,  1           // InterfaceMethod java/util/Map.size:()I
       9: ireturn
}
