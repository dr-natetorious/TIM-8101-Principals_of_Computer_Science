class com.google.common.base.Functions$FunctionComposition<A, B, C> implements com.google.common.base.Function<A, C>, java.io.Serializable {
  public com.google.common.base.Functions$FunctionComposition(com.google.common.base.Function<B, C>, com.google.common.base.Function<A, ? extends B>);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #32                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #7                  // class com/google/common/base/Function
      12: putfield      #34                 // Field g:Lcom/google/common/base/Function;
      15: aload_0
      16: aload_2
      17: invokestatic  #32                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      20: checkcast     #7                  // class com/google/common/base/Function
      23: putfield      #36                 // Field f:Lcom/google/common/base/Function;
      26: return

  public C apply(A);
    Code:
       0: aload_0
       1: getfield      #34                 // Field g:Lcom/google/common/base/Function;
       4: aload_0
       5: getfield      #36                 // Field f:Lcom/google/common/base/Function;
       8: aload_1
       9: invokeinterface #42,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      14: invokeinterface #42,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      19: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Functions$FunctionComposition
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          58
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Functions$FunctionComposition
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #36                 // Field f:Lcom/google/common/base/Function;
      26: aload_1
      27: getfield      #36                 // Field f:Lcom/google/common/base/Function;
      30: invokeinterface #47,  2           // InterfaceMethod com/google/common/base/Function.equals:(Ljava/lang/Object;)Z
      35: ifeq          58
      38: iload_3
      39: istore_2
      40: aload_0
      41: getfield      #34                 // Field g:Lcom/google/common/base/Function;
      44: aload_1
      45: getfield      #34                 // Field g:Lcom/google/common/base/Function;
      48: invokeinterface #47,  2           // InterfaceMethod com/google/common/base/Function.equals:(Ljava/lang/Object;)Z
      53: ifeq          58
      56: iconst_1
      57: istore_2
      58: iload_2
      59: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #36                 // Field f:Lcom/google/common/base/Function;
       4: invokevirtual #51                 // Method java/lang/Object.hashCode:()I
       7: aload_0
       8: getfield      #34                 // Field g:Lcom/google/common/base/Function;
      11: invokevirtual #51                 // Method java/lang/Object.hashCode:()I
      14: ixor
      15: ireturn

  public java.lang.String toString();
    Code:
       0: new           #55                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #56                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #34                 // Field g:Lcom/google/common/base/Function;
      13: invokevirtual #60                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #62                 // String (
      20: invokevirtual #65                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #36                 // Field f:Lcom/google/common/base/Function;
      29: invokevirtual #60                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: ldc           #67                 // String )
      36: invokevirtual #65                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: invokevirtual #69                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: areturn
}
