class com.google.common.a.g$c implements java.util.Iterator<K> {
  final java.util.Set<K> a;

  com.google.common.a.g$e<K, V> b;

  com.google.common.a.g$e<K, V> c;

  int d;

  final com.google.common.a.g e;

  com.google.common.a.g$c(com.google.common.a.g, com.google.common.a.g$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #57                 // Method "<init>":(Lcom/google/common/a/g;)V
       5: return

  public boolean hasNext();
    Code:
       0: aload_0
       1: invokespecial #64                 // Method a:()V
       4: aload_0
       5: getfield      #48                 // Field b:Lcom/google/common/a/g$e;
       8: ifnull        13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public K next();
    Code:
       0: aload_0
       1: invokespecial #64                 // Method a:()V
       4: aload_0
       5: getfield      #48                 // Field b:Lcom/google/common/a/g$e;
       8: invokestatic  #70                 // Method com/google/common/a/g.f:(Ljava/lang/Object;)V
      11: aload_0
      12: aload_0
      13: getfield      #48                 // Field b:Lcom/google/common/a/g$e;
      16: putfield      #72                 // Field c:Lcom/google/common/a/g$e;
      19: aload_0
      20: getfield      #43                 // Field a:Ljava/util/Set;
      23: aload_0
      24: getfield      #72                 // Field c:Lcom/google/common/a/g$e;
      27: getfield      #77                 // Field com/google/common/a/g$e.a:Ljava/lang/Object;
      30: invokeinterface #81,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      35: pop
      36: aload_0
      37: aload_0
      38: getfield      #48                 // Field b:Lcom/google/common/a/g$e;
      41: getfield      #82                 // Field com/google/common/a/g$e.c:Lcom/google/common/a/g$e;
      44: putfield      #48                 // Field b:Lcom/google/common/a/g$e;
      47: aload_0
      48: getfield      #48                 // Field b:Lcom/google/common/a/g$e;
      51: ifnull        73
      54: aload_0
      55: getfield      #43                 // Field a:Ljava/util/Set;
      58: aload_0
      59: getfield      #48                 // Field b:Lcom/google/common/a/g$e;
      62: getfield      #77                 // Field com/google/common/a/g$e.a:Ljava/lang/Object;
      65: invokeinterface #81,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      70: ifeq          36
      73: aload_0
      74: getfield      #72                 // Field c:Lcom/google/common/a/g$e;
      77: getfield      #77                 // Field com/google/common/a/g$e.a:Ljava/lang/Object;
      80: areturn

  public void remove();
    Code:
       0: aload_0
       1: invokespecial #64                 // Method a:()V
       4: aload_0
       5: getfield      #72                 // Field c:Lcom/google/common/a/g$e;
       8: ifnull        16
      11: iconst_1
      12: istore_1
      13: goto          18
      16: iconst_0
      17: istore_1
      18: iload_1
      19: invokestatic  #90                 // Method com/google/common/a/d.a:(Z)V
      22: aload_0
      23: getfield      #24                 // Field e:Lcom/google/common/a/g;
      26: aload_0
      27: getfield      #72                 // Field c:Lcom/google/common/a/g$e;
      30: getfield      #77                 // Field com/google/common/a/g$e.a:Ljava/lang/Object;
      33: invokestatic  #93                 // Method com/google/common/a/g.a:(Lcom/google/common/a/g;Ljava/lang/Object;)V
      36: aload_0
      37: aconst_null
      38: putfield      #72                 // Field c:Lcom/google/common/a/g$e;
      41: aload_0
      42: aload_0
      43: getfield      #24                 // Field e:Lcom/google/common/a/g;
      46: invokestatic  #51                 // Method com/google/common/a/g.a:(Lcom/google/common/a/g;)I
      49: putfield      #53                 // Field d:I
      52: return
}
