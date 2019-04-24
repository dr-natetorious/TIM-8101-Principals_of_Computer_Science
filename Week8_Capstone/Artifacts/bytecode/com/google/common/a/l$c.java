class com.google.common.a.l$c<K, V> extends com.google.common.a.c<K> {
  final com.google.common.a.k<K, V> a;

  com.google.common.a.l$c(com.google.common.a.k<K, V>);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method com/google/common/a/c."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #24                 // Field a:Lcom/google/common/a/k;
       9: return

  public int a(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #34,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
       9: aload_1
      10: invokestatic  #39                 // Method com/google/common/a/j.a:(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
      13: checkcast     #41                 // class java/util/Collection
      16: astore_1
      17: aload_1
      18: ifnonnull     23
      21: iconst_0
      22: ireturn
      23: aload_1
      24: invokeinterface #45,  1           // InterfaceMethod java/util/Collection.size:()I
      29: ireturn

  public java.util.Set<K> a();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #49,  1           // InterfaceMethod com/google/common/a/k.e:()Ljava/util/Set;
       9: areturn

  public int b(java.lang.Object, int);
    Code:
       0: iload_2
       1: ldc           #54                 // String occurrences
       3: invokestatic  #59                 // Method com/google/common/a/d.a:(ILjava/lang/String;)I
       6: pop
       7: iload_2
       8: ifne          17
      11: aload_0
      12: aload_1
      13: invokevirtual #61                 // Method a:(Ljava/lang/Object;)I
      16: ireturn
      17: aload_0
      18: getfield      #24                 // Field a:Lcom/google/common/a/k;
      21: invokeinterface #34,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
      26: aload_1
      27: invokestatic  #39                 // Method com/google/common/a/j.a:(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
      30: checkcast     #41                 // class java/util/Collection
      33: astore_1
      34: iconst_0
      35: istore_3
      36: aload_1
      37: ifnonnull     42
      40: iconst_0
      41: ireturn
      42: aload_1
      43: invokeinterface #45,  1           // InterfaceMethod java/util/Collection.size:()I
      48: istore        4
      50: iload_2
      51: iload         4
      53: if_icmplt     65
      56: aload_1
      57: invokeinterface #64,  1           // InterfaceMethod java/util/Collection.clear:()V
      62: iload         4
      64: ireturn
      65: aload_1
      66: invokeinterface #68,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      71: astore_1
      72: iload_3
      73: iload_2
      74: if_icmpge     97
      77: aload_1
      78: invokeinterface #74,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      83: pop
      84: aload_1
      85: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.remove:()V
      90: iload_3
      91: iconst_1
      92: iadd
      93: istore_3
      94: goto          72
      97: iload         4
      99: ireturn

  java.util.Iterator<com.google.common.a.m$a<K>> c();
    Code:
       0: new           #10                 // class com/google/common/a/l$c$1
       3: dup
       4: aload_0
       5: aload_0
       6: getfield      #24                 // Field a:Lcom/google/common/a/k;
       9: invokeinterface #34,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
      14: invokeinterface #82,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
      19: invokeinterface #85,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      24: invokespecial #88                 // Method com/google/common/a/l$c$1."<init>":(Lcom/google/common/a/l$c;Ljava/util/Iterator;)V
      27: areturn

  public void clear();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #92,  1           // InterfaceMethod com/google/common/a/k.m:()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Lcom/google/common/a/k;
       4: aload_1
       5: invokeinterface #96,  2           // InterfaceMethod com/google/common/a/k.a:(Ljava/lang/Object;)Z
      10: ireturn

  int d();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #34,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
       9: invokeinterface #98,  1           // InterfaceMethod java/util/Map.size:()I
      14: ireturn

  java.util.Set<com.google.common.a.m$a<K>> f();
    Code:
       0: new           #14                 // class com/google/common/a/l$c$a
       3: dup
       4: aload_0
       5: invokespecial #102                // Method com/google/common/a/l$c$a."<init>":(Lcom/google/common/a/l$c;)V
       8: areturn

  public java.util.Iterator<K> iterator();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #106,  1          // InterfaceMethod com/google/common/a/k.b:()Ljava/util/Collection;
       9: invokeinterface #68,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      14: invokestatic  #109                // Method com/google/common/a/j.a:(Ljava/util/Iterator;)Ljava/util/Iterator;
      17: areturn
}
