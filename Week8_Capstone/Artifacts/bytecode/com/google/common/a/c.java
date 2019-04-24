abstract class com.google.common.a.c<E> extends java.util.AbstractCollection<E> implements com.google.common.a.m<E> {
  com.google.common.a.c();
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/util/AbstractCollection."<init>":()V
       4: return

  public int a(java.lang.Object);
    Code:
       0: aload_0
       1: invokevirtual #26                 // Method e:()Ljava/util/Set;
       4: invokeinterface #32,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #38,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          49
      19: aload_2
      20: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #44                 // class com/google/common/a/m$a
      28: astore_3
      29: aload_3
      30: invokeinterface #46,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      35: aload_1
      36: invokestatic  #52                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      39: ifeq          10
      42: aload_3
      43: invokeinterface #55,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      48: ireturn
      49: iconst_0
      50: ireturn

  public int a(E, int);
    Code:
       0: new           #59                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #60                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public java.util.Set<E> a();
    Code:
       0: aload_0
       1: getfield      #65                 // Field a:Ljava/util/Set;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #67                 // Method b:()Ljava/util/Set;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #65                 // Field a:Ljava/util/Set;
      21: aload_1
      22: areturn

  public boolean a(E, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: invokestatic  #74                 // Method com/google/common/a/n.a:(Lcom/google/common/a/m;Ljava/lang/Object;II)Z
       7: ireturn

  public boolean add(E);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_1
       3: invokevirtual #79                 // Method a:(Ljava/lang/Object;I)I
       6: pop
       7: iconst_1
       8: ireturn

  public boolean addAll(java.util.Collection<? extends E>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #85                 // Method com/google/common/a/n.a:(Lcom/google/common/a/m;Ljava/util/Collection;)Z
       5: ireturn

  public int b(java.lang.Object, int);
    Code:
       0: new           #59                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #60                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  java.util.Set<E> b();
    Code:
       0: new           #9                  // class com/google/common/a/c$a
       3: dup
       4: aload_0
       5: invokespecial #89                 // Method com/google/common/a/c$a."<init>":(Lcom/google/common/a/c;)V
       8: areturn

  public int c(E, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokestatic  #93                 // Method com/google/common/a/n.a:(Lcom/google/common/a/m;Ljava/lang/Object;I)I
       6: ireturn

  abstract java.util.Iterator<com.google.common.a.m$a<E>> c();

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #96                 // Method c:()Ljava/util/Iterator;
       4: invokestatic  #101                // Method com/google/common/a/f.a:(Ljava/util/Iterator;)V
       7: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #104                // Method a:(Ljava/lang/Object;)I
       5: ifle          10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  abstract int d();

  public java.util.Set<com.google.common.a.m$a<E>> e();
    Code:
       0: aload_0
       1: getfield      #107                // Field b:Ljava/util/Set;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #110                // Method f:()Ljava/util/Set;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #107                // Field b:Ljava/util/Set;
      21: aload_1
      22: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #115                // Method com/google/common/a/n.a:(Lcom/google/common/a/m;Ljava/lang/Object;)Z
       5: ireturn

  java.util.Set<com.google.common.a.m$a<E>> f();
    Code:
       0: new           #12                 // class com/google/common/a/c$b
       3: dup
       4: aload_0
       5: invokespecial #116                // Method com/google/common/a/c$b."<init>":(Lcom/google/common/a/c;)V
       8: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: invokevirtual #26                 // Method e:()Ljava/util/Set;
       4: invokeinterface #119,  1          // InterfaceMethod java/util/Set.hashCode:()I
       9: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: invokevirtual #26                 // Method e:()Ljava/util/Set;
       4: invokeinterface #122,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
       9: ireturn

  public java.util.Iterator<E> iterator();
    Code:
       0: aload_0
       1: invokestatic  #125                // Method com/google/common/a/n.a:(Lcom/google/common/a/m;)Ljava/util/Iterator;
       4: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_1
       3: invokevirtual #129                // Method b:(Ljava/lang/Object;I)I
       6: ifle          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #132                // Method com/google/common/a/n.b:(Lcom/google/common/a/m;Ljava/util/Collection;)Z
       5: ireturn

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #136                // Method com/google/common/a/n.c:(Lcom/google/common/a/m;Ljava/util/Collection;)Z
       5: ireturn

  public int size();
    Code:
       0: aload_0
       1: invokestatic  #140                // Method com/google/common/a/n.b:(Lcom/google/common/a/m;)I
       4: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokevirtual #26                 // Method e:()Ljava/util/Set;
       4: invokevirtual #146                // Method java/lang/Object.toString:()Ljava/lang/String;
       7: areturn
}
