class com.google.common.a.l$a$a$1 implements com.google.common.base.Function<K, java.util.Collection<V>> {
  final com.google.common.a.l$a$a a;

  com.google.common.a.l$a$a$1(com.google.common.a.l$a$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field a:Lcom/google/common/a/l$a$a;
       5: aload_0
       6: invokespecial #25                 // Method java/lang/Object."<init>":()V
       9: return

  public java.util.Collection<V> a(K);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Lcom/google/common/a/l$a$a;
       4: getfield      #30                 // Field com/google/common/a/l$a$a.a:Lcom/google/common/a/l$a;
       7: invokestatic  #33                 // Method com/google/common/a/l$a.a:(Lcom/google/common/a/l$a;)Lcom/google/common/a/k;
      10: aload_1
      11: invokeinterface #38,  2           // InterfaceMethod com/google/common/a/k.d:(Ljava/lang/Object;)Ljava/util/Collection;
      16: areturn

  public java.lang.Object apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #44                 // Method a:(Ljava/lang/Object;)Ljava/util/Collection;
       5: areturn
}
