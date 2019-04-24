class com.google.common.base.Predicates$CompositionPredicate<A, B> implements com.google.common.base.Predicate<A>, java.io.Serializable {
  final com.google.common.base.Function<A, ? extends B> f;

  final com.google.common.base.Predicate<B> p;

  com.google.common.base.Predicates$CompositionPredicate(com.google.common.base.Predicate, com.google.common.base.Function, com.google.common.base.Predicates$1);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #45                 // Method "<init>":(Lcom/google/common/base/Predicate;Lcom/google/common/base/Function;)V
       6: return

  public boolean apply(A);
    Code:
       0: aload_0
       1: getfield      #35                 // Field p:Lcom/google/common/base/Predicate;
       4: aload_0
       5: getfield      #39                 // Field f:Lcom/google/common/base/Function;
       8: aload_1
       9: invokeinterface #49,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      14: invokeinterface #51,  2           // InterfaceMethod com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
      19: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Predicates$CompositionPredicate
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          58
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Predicates$CompositionPredicate
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #39                 // Field f:Lcom/google/common/base/Function;
      26: aload_1
      27: getfield      #39                 // Field f:Lcom/google/common/base/Function;
      30: invokeinterface #55,  2           // InterfaceMethod com/google/common/base/Function.equals:(Ljava/lang/Object;)Z
      35: ifeq          58
      38: iload_3
      39: istore_2
      40: aload_0
      41: getfield      #35                 // Field p:Lcom/google/common/base/Predicate;
      44: aload_1
      45: getfield      #35                 // Field p:Lcom/google/common/base/Predicate;
      48: invokeinterface #56,  2           // InterfaceMethod com/google/common/base/Predicate.equals:(Ljava/lang/Object;)Z
      53: ifeq          58
      56: iconst_1
      57: istore_2
      58: iload_2
      59: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #39                 // Field f:Lcom/google/common/base/Function;
       4: invokevirtual #60                 // Method java/lang/Object.hashCode:()I
       7: aload_0
       8: getfield      #35                 // Field p:Lcom/google/common/base/Predicate;
      11: invokevirtual #60                 // Method java/lang/Object.hashCode:()I
      14: ixor
      15: ireturn

  public java.lang.String toString();
    Code:
       0: new           #64                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #65                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #35                 // Field p:Lcom/google/common/base/Predicate;
      13: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #71                 // String (
      20: invokevirtual #74                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #39                 // Field f:Lcom/google/common/base/Function;
      29: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: ldc           #76                 // String )
      36: invokevirtual #74                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: areturn
}
