class com.google.common.a.l$a$a extends com.google.common.a.j$b<K, java.util.Collection<V>> {
  final com.google.common.a.l$a a;

  com.google.common.a.l$a$a(com.google.common.a.l$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lcom/google/common/a/l$a;
       5: aload_0
       6: invokespecial #20                 // Method com/google/common/a/j$b."<init>":()V
       9: return

  java.util.Map<K, java.util.Collection<V>> a();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lcom/google/common/a/l$a;
       4: areturn

  public java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> iterator();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lcom/google/common/a/l$a;
       4: invokestatic  #29                 // Method com/google/common/a/l$a.a:(Lcom/google/common/a/l$a;)Lcom/google/common/a/k;
       7: invokeinterface #35,  1           // InterfaceMethod com/google/common/a/k.e:()Ljava/util/Set;
      12: new           #12                 // class com/google/common/a/l$a$a$1
      15: dup
      16: aload_0
      17: invokespecial #38                 // Method com/google/common/a/l$a$a$1."<init>":(Lcom/google/common/a/l$a$a;)V
      20: invokestatic  #43                 // Method com/google/common/a/j.a:(Ljava/util/Set;Lcom/google/common/base/Function;)Ljava/util/Iterator;
      23: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #49                 // Method contains:(Ljava/lang/Object;)Z
       5: ifne          10
       8: iconst_0
       9: ireturn
      10: aload_1
      11: checkcast     #51                 // class java/util/Map$Entry
      14: astore_1
      15: aload_0
      16: getfield      #17                 // Field a:Lcom/google/common/a/l$a;
      19: aload_1
      20: invokeinterface #55,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      25: invokevirtual #58                 // Method com/google/common/a/l$a.a:(Ljava/lang/Object;)V
      28: iconst_1
      29: ireturn
}
