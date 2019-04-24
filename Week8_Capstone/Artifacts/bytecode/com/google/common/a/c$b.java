class com.google.common.a.c$b extends com.google.common.a.n$c<E> {
  final com.google.common.a.c a;

  com.google.common.a.c$b(com.google.common.a.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lcom/google/common/a/c;
       5: aload_0
       6: invokespecial #17                 // Method com/google/common/a/n$c."<init>":()V
       9: return

  com.google.common.a.m<E> a();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lcom/google/common/a/c;
       4: areturn

  public java.util.Iterator<com.google.common.a.m$a<E>> iterator();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lcom/google/common/a/c;
       4: invokevirtual #26                 // Method com/google/common/a/c.c:()Ljava/util/Iterator;
       7: areturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lcom/google/common/a/c;
       4: invokevirtual #32                 // Method com/google/common/a/c.d:()I
       7: ireturn
}
