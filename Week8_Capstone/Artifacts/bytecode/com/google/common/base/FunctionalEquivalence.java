final class com.google.common.base.FunctionalEquivalence<F, T> extends com.google.common.base.Equivalence<F> implements java.io.Serializable {
  com.google.common.base.FunctionalEquivalence(com.google.common.base.Function<F, ? extends T>, com.google.common.base.Equivalence<T>);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method com/google/common/base/Equivalence."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #28                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #30                 // class com/google/common/base/Function
      12: putfield      #32                 // Field function:Lcom/google/common/base/Function;
      15: aload_0
      16: aload_2
      17: invokestatic  #28                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      20: checkcast     #5                  // class com/google/common/base/Equivalence
      23: putfield      #34                 // Field resultEquivalence:Lcom/google/common/base/Equivalence;
      26: return

  protected boolean doEquivalent(F, F);
    Code:
       0: aload_0
       1: getfield      #34                 // Field resultEquivalence:Lcom/google/common/base/Equivalence;
       4: aload_0
       5: getfield      #32                 // Field function:Lcom/google/common/base/Function;
       8: aload_1
       9: invokeinterface #42,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      14: aload_0
      15: getfield      #32                 // Field function:Lcom/google/common/base/Function;
      18: aload_2
      19: invokeinterface #42,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      24: invokevirtual #45                 // Method com/google/common/base/Equivalence.equivalent:(Ljava/lang/Object;Ljava/lang/Object;)Z
      27: ireturn

  protected int doHash(F);
    Code:
       0: aload_0
       1: getfield      #34                 // Field resultEquivalence:Lcom/google/common/base/Equivalence;
       4: aload_0
       5: getfield      #32                 // Field function:Lcom/google/common/base/Function;
       8: aload_1
       9: invokeinterface #42,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      14: invokevirtual #51                 // Method com/google/common/base/Equivalence.hash:(Ljava/lang/Object;)I
      17: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class com/google/common/base/FunctionalEquivalence
      11: ifeq          53
      14: aload_1
      15: checkcast     #2                  // class com/google/common/base/FunctionalEquivalence
      18: astore_1
      19: aload_0
      20: getfield      #32                 // Field function:Lcom/google/common/base/Function;
      23: aload_1
      24: getfield      #32                 // Field function:Lcom/google/common/base/Function;
      27: invokeinterface #56,  2           // InterfaceMethod com/google/common/base/Function.equals:(Ljava/lang/Object;)Z
      32: ifeq          51
      35: aload_0
      36: getfield      #34                 // Field resultEquivalence:Lcom/google/common/base/Equivalence;
      39: aload_1
      40: getfield      #34                 // Field resultEquivalence:Lcom/google/common/base/Equivalence;
      43: invokevirtual #59                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      46: ifeq          51
      49: iconst_1
      50: ireturn
      51: iconst_0
      52: ireturn
      53: iconst_0
      54: ireturn

  public int hashCode();
    Code:
       0: iconst_2
       1: anewarray     #58                 // class java/lang/Object
       4: dup
       5: iconst_0
       6: aload_0
       7: getfield      #32                 // Field function:Lcom/google/common/base/Function;
      10: aastore
      11: dup
      12: iconst_1
      13: aload_0
      14: getfield      #34                 // Field resultEquivalence:Lcom/google/common/base/Equivalence;
      17: aastore
      18: invokestatic  #66                 // Method com/google/common/base/Objects.hashCode:([Ljava/lang/Object;)I
      21: ireturn

  public java.lang.String toString();
    Code:
       0: new           #70                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #71                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #34                 // Field resultEquivalence:Lcom/google/common/base/Equivalence;
      13: invokevirtual #75                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #77                 // String .onResultOf(
      20: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #32                 // Field function:Lcom/google/common/base/Function;
      29: invokevirtual #75                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: ldc           #82                 // String )
      36: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: invokevirtual #84                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: areturn
}
