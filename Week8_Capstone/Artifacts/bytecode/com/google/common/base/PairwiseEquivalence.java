final class com.google.common.base.PairwiseEquivalence<T> extends com.google.common.base.Equivalence<java.lang.Iterable<T>> implements java.io.Serializable {
  final com.google.common.base.Equivalence<? super T> elementEquivalence;

  com.google.common.base.PairwiseEquivalence(com.google.common.base.Equivalence<? super T>);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method com/google/common/base/Equivalence."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #25                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #5                  // class com/google/common/base/Equivalence
      12: putfield      #27                 // Field elementEquivalence:Lcom/google/common/base/Equivalence;
      15: return

  protected boolean doEquivalent(java.lang.Iterable<T>, java.lang.Iterable<T>);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       6: astore_1
       7: aload_2
       8: invokeinterface #38,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      13: astore_2
      14: aload_1
      15: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      20: istore_3
      21: iconst_0
      22: istore        4
      24: iload_3
      25: ifeq          61
      28: aload_2
      29: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      34: ifeq          61
      37: aload_0
      38: getfield      #27                 // Field elementEquivalence:Lcom/google/common/base/Equivalence;
      41: aload_1
      42: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      47: aload_2
      48: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      53: invokevirtual #52                 // Method com/google/common/base/Equivalence.equivalent:(Ljava/lang/Object;Ljava/lang/Object;)Z
      56: ifne          14
      59: iconst_0
      60: ireturn
      61: iload         4
      63: istore_3
      64: aload_1
      65: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      70: ifne          87
      73: iload         4
      75: istore_3
      76: aload_2
      77: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      82: ifne          87
      85: iconst_1
      86: istore_3
      87: iload_3
      88: ireturn

  protected boolean doEquivalent(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #34                 // class java/lang/Iterable
       5: aload_2
       6: checkcast     #34                 // class java/lang/Iterable
       9: invokevirtual #55                 // Method doEquivalent:(Ljava/lang/Iterable;Ljava/lang/Iterable;)Z
      12: ireturn

  protected int doHash(java.lang.Iterable<T>);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       6: astore_1
       7: ldc           #58                 // int 78721
       9: istore_2
      10: aload_1
      11: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          44
      19: aload_1
      20: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: astore_3
      26: iload_2
      27: sipush        24943
      30: imul
      31: aload_0
      32: getfield      #27                 // Field elementEquivalence:Lcom/google/common/base/Equivalence;
      35: aload_3
      36: invokevirtual #62                 // Method com/google/common/base/Equivalence.hash:(Ljava/lang/Object;)I
      39: iadd
      40: istore_2
      41: goto          10
      44: iload_2
      45: ireturn

  protected int doHash(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #34                 // class java/lang/Iterable
       5: invokevirtual #65                 // Method doHash:(Ljava/lang/Iterable;)I
       8: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/PairwiseEquivalence
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/PairwiseEquivalence
      11: astore_1
      12: aload_0
      13: getfield      #27                 // Field elementEquivalence:Lcom/google/common/base/Equivalence;
      16: aload_1
      17: getfield      #27                 // Field elementEquivalence:Lcom/google/common/base/Equivalence;
      20: invokevirtual #71                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #27                 // Field elementEquivalence:Lcom/google/common/base/Equivalence;
       4: invokevirtual #75                 // Method java/lang/Object.hashCode:()I
       7: ldc           #76                 // int 1185147655
       9: ixor
      10: ireturn

  public java.lang.String toString();
    Code:
       0: new           #80                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #81                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #27                 // Field elementEquivalence:Lcom/google/common/base/Equivalence;
      13: invokevirtual #85                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #87                 // String .pairwise()
      20: invokevirtual #90                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: invokevirtual #92                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      28: areturn
}
