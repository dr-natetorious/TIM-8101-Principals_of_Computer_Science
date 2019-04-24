final class com.google.common.a.l$a<K, V> extends com.google.common.a.j$e<K, java.util.Collection<V>> {
  com.google.common.a.l$a(com.google.common.a.k<K, V>);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method com/google/common/a/j$e."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #25                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #27                 // class com/google/common/a/k
      12: putfield      #29                 // Field a:Lcom/google/common/a/k;
      15: return

  static com.google.common.a.k a(com.google.common.a.l$a);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lcom/google/common/a/k;
       4: areturn

  protected java.util.Set<java.util.Map$Entry<K, java.util.Collection<V>>> a();
    Code:
       0: new           #10                 // class com/google/common/a/l$a$a
       3: dup
       4: aload_0
       5: invokespecial #37                 // Method com/google/common/a/l$a$a."<init>":(Lcom/google/common/a/l$a;)V
       8: areturn

  void a(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #42,  1           // InterfaceMethod com/google/common/a/k.e:()Ljava/util/Set;
       9: aload_1
      10: invokeinterface #48,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
      15: pop
      16: return

  public java.util.Collection<V> b(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #53                 // Method containsKey:(Ljava/lang/Object;)Z
       5: ifeq          19
       8: aload_0
       9: getfield      #29                 // Field a:Lcom/google/common/a/k;
      12: aload_1
      13: invokeinterface #56,  2           // InterfaceMethod com/google/common/a/k.d:(Ljava/lang/Object;)Ljava/util/Collection;
      18: areturn
      19: aconst_null
      20: areturn

  public java.util.Collection<V> c(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #53                 // Method containsKey:(Ljava/lang/Object;)Z
       5: ifeq          19
       8: aload_0
       9: getfield      #29                 // Field a:Lcom/google/common/a/k;
      12: aload_1
      13: invokeinterface #60,  2           // InterfaceMethod com/google/common/a/k.e:(Ljava/lang/Object;)Ljava/util/Collection;
      18: areturn
      19: aconst_null
      20: areturn

  public void clear();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #64,  1           // InterfaceMethod com/google/common/a/k.m:()V
       9: return

  public boolean containsKey(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lcom/google/common/a/k;
       4: aload_1
       5: invokeinterface #66,  2           // InterfaceMethod com/google/common/a/k.a:(Ljava/lang/Object;)Z
      10: ireturn

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #69                 // Method b:(Ljava/lang/Object;)Ljava/util/Collection;
       5: areturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #73,  1           // InterfaceMethod com/google/common/a/k.a:()Z
       9: ireturn

  public java.util.Set<K> keySet();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #42,  1           // InterfaceMethod com/google/common/a/k.e:()Ljava/util/Set;
       9: areturn

  public java.lang.Object remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #77                 // Method c:(Ljava/lang/Object;)Ljava/util/Collection;
       5: areturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lcom/google/common/a/k;
       4: invokeinterface #42,  1           // InterfaceMethod com/google/common/a/k.e:()Ljava/util/Set;
       9: invokeinterface #81,  1           // InterfaceMethod java/util/Set.size:()I
      14: ireturn
}
