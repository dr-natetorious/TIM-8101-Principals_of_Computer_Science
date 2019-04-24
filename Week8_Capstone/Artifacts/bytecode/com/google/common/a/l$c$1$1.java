class com.google.common.a.l$c$1$1 extends com.google.common.a.n$a<K> {
  final java.util.Map$Entry a;

  final com.google.common.a.l$c$1 b;

  com.google.common.a.l$c$1$1(com.google.common.a.l$c$1, java.util.Map$Entry);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field b:Lcom/google/common/a/l$c$1;
       5: aload_0
       6: aload_2
       7: putfield      #24                 // Field a:Ljava/util/Map$Entry;
      10: aload_0
      11: invokespecial #27                 // Method com/google/common/a/n$a."<init>":()V
      14: return

  public K a();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/util/Map$Entry;
       4: invokeinterface #34,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       9: areturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/util/Map$Entry;
       4: invokeinterface #40,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       9: checkcast     #42                 // class java/util/Collection
      12: invokeinterface #45,  1           // InterfaceMethod java/util/Collection.size:()I
      17: ireturn
}
