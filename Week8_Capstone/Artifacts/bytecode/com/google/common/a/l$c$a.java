class com.google.common.a.l$c$a extends com.google.common.a.n$c<K> {
  final com.google.common.a.l$c a;

  com.google.common.a.l$c$a(com.google.common.a.l$c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Lcom/google/common/a/l$c;
       5: aload_0
       6: invokespecial #19                 // Method com/google/common/a/n$c."<init>":()V
       9: return

  com.google.common.a.m<K> a();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Lcom/google/common/a/l$c;
       4: areturn

  public boolean contains(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #27                 // class com/google/common/a/m$a
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          75
      15: aload_1
      16: checkcast     #27                 // class com/google/common/a/m$a
      19: astore_1
      20: aload_0
      21: getfield      #16                 // Field a:Lcom/google/common/a/l$c;
      24: getfield      #30                 // Field com/google/common/a/l$c.a:Lcom/google/common/a/k;
      27: invokeinterface #36,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
      32: aload_1
      33: invokeinterface #39,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      38: invokeinterface #45,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      43: checkcast     #47                 // class java/util/Collection
      46: astore        5
      48: iload_3
      49: istore_2
      50: aload         5
      52: ifnull        75
      55: iload_3
      56: istore_2
      57: aload         5
      59: invokeinterface #51,  1           // InterfaceMethod java/util/Collection.size:()I
      64: aload_1
      65: invokeinterface #54,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      70: if_icmpne     75
      73: iconst_1
      74: istore_2
      75: iload_2
      76: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Lcom/google/common/a/l$c;
       4: getfield      #30                 // Field com/google/common/a/l$c.a:Lcom/google/common/a/k;
       7: invokeinterface #58,  1           // InterfaceMethod com/google/common/a/k.a:()Z
      12: ireturn

  public java.util.Iterator<com.google.common.a.m$a<K>> iterator();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Lcom/google/common/a/l$c;
       4: invokevirtual #62                 // Method com/google/common/a/l$c.c:()Ljava/util/Iterator;
       7: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #27                 // class com/google/common/a/m$a
       4: ifeq          66
       7: aload_1
       8: checkcast     #27                 // class com/google/common/a/m$a
      11: astore_1
      12: aload_0
      13: getfield      #16                 // Field a:Lcom/google/common/a/l$c;
      16: getfield      #30                 // Field com/google/common/a/l$c.a:Lcom/google/common/a/k;
      19: invokeinterface #36,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
      24: aload_1
      25: invokeinterface #39,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      30: invokeinterface #45,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      35: checkcast     #47                 // class java/util/Collection
      38: astore_2
      39: aload_2
      40: ifnull        66
      43: aload_2
      44: invokeinterface #51,  1           // InterfaceMethod java/util/Collection.size:()I
      49: aload_1
      50: invokeinterface #54,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      55: if_icmpne     66
      58: aload_2
      59: invokeinterface #67,  1           // InterfaceMethod java/util/Collection.clear:()V
      64: iconst_1
      65: ireturn
      66: iconst_0
      67: ireturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Lcom/google/common/a/l$c;
       4: invokevirtual #70                 // Method com/google/common/a/l$c.d:()I
       7: ireturn
}
