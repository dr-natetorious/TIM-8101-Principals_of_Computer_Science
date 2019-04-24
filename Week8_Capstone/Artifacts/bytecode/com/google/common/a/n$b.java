abstract class com.google.common.a.n$b<E> extends com.google.common.a.p$a<E> {
  com.google.common.a.n$b();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method com/google/common/a/p$a."<init>":()V
       4: return

  abstract com.google.common.a.m<E> a();

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #20                 // Method a:()Lcom/google/common/a/m;
       4: invokeinterface #24,  1           // InterfaceMethod com/google/common/a/m.clear:()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: invokevirtual #20                 // Method a:()Lcom/google/common/a/m;
       4: aload_1
       5: invokeinterface #28,  2           // InterfaceMethod com/google/common/a/m.contains:(Ljava/lang/Object;)Z
      10: ireturn

  public boolean containsAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: invokevirtual #20                 // Method a:()Lcom/google/common/a/m;
       4: aload_1
       5: invokeinterface #32,  2           // InterfaceMethod com/google/common/a/m.containsAll:(Ljava/util/Collection;)Z
      10: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: invokevirtual #20                 // Method a:()Lcom/google/common/a/m;
       4: invokeinterface #38,  1           // InterfaceMethod com/google/common/a/m.isEmpty:()Z
       9: ireturn

  public java.util.Iterator<E> iterator();
    Code:
       0: new           #10                 // class com/google/common/a/n$b$1
       3: dup
       4: aload_0
       5: aload_0
       6: invokevirtual #20                 // Method a:()Lcom/google/common/a/m;
       9: invokeinterface #44,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
      14: invokeinterface #48,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      19: invokespecial #51                 // Method com/google/common/a/n$b$1."<init>":(Lcom/google/common/a/n$b;Ljava/util/Iterator;)V
      22: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: invokevirtual #20                 // Method a:()Lcom/google/common/a/m;
       4: aload_1
       5: ldc           #54                 // int 2147483647
       7: invokeinterface #57,  3           // InterfaceMethod com/google/common/a/m.b:(Ljava/lang/Object;I)I
      12: ifle          17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn

  public int size();
    Code:
       0: aload_0
       1: invokevirtual #20                 // Method a:()Lcom/google/common/a/m;
       4: invokeinterface #44,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
       9: invokeinterface #61,  1           // InterfaceMethod java/util/Set.size:()I
      14: ireturn
}
