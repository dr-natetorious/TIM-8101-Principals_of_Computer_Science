class com.google.common.a.n$b$1 extends com.google.common.a.q<com.google.common.a.m$a<E>, E> {
  final com.google.common.a.n$b a;

  com.google.common.a.n$b$1(com.google.common.a.n$b, java.util.Iterator);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Lcom/google/common/a/n$b;
       5: aload_0
       6: aload_2
       7: invokespecial #22                 // Method com/google/common/a/q."<init>":(Ljava/util/Iterator;)V
      10: return

  E a(com.google.common.a.m$a<E>);
    Code:
       0: aload_1
       1: invokeinterface #29,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
       6: areturn

  java.lang.Object a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #26                 // class com/google/common/a/m$a
       5: invokevirtual #34                 // Method a:(Lcom/google/common/a/m$a;)Ljava/lang/Object;
       8: areturn
}
