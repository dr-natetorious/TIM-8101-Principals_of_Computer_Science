class com.google.common.a.b$a extends com.google.common.a.l$b<K, V> {
  final com.google.common.a.b a;

  com.google.common.a.b$a(com.google.common.a.b, com.google.common.a.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #20                 // Method "<init>":(Lcom/google/common/a/b;)V
       5: return

  com.google.common.a.k<K, V> a();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Lcom/google/common/a/b;
       4: areturn

  public java.util.Iterator<java.util.Map$Entry<K, V>> iterator();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Lcom/google/common/a/b;
       4: invokevirtual #28                 // Method com/google/common/a/b.d:()Ljava/util/Iterator;
       7: areturn
}
