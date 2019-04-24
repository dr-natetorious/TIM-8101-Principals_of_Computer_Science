class com.google.common.base.Functions$PredicateFunction<T> implements com.google.common.base.Function<T, java.lang.Boolean>, java.io.Serializable {
  com.google.common.base.Functions$PredicateFunction(com.google.common.base.Predicate, com.google.common.base.Functions$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Lcom/google/common/base/Predicate;)V
       5: return

  public java.lang.Boolean apply(T);
    Code:
       0: aload_0
       1: getfield      #34                 // Field predicate:Lcom/google/common/base/Predicate;
       4: aload_1
       5: invokeinterface #45,  2           // InterfaceMethod com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
      10: invokestatic  #51                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      13: areturn

  public java.lang.Object apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #54                 // Method apply:(Ljava/lang/Object;)Ljava/lang/Boolean;
       5: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Functions$PredicateFunction
       4: ifeq          26
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Functions$PredicateFunction
      11: astore_1
      12: aload_0
      13: getfield      #34                 // Field predicate:Lcom/google/common/base/Predicate;
      16: aload_1
      17: getfield      #34                 // Field predicate:Lcom/google/common/base/Predicate;
      20: invokeinterface #57,  2           // InterfaceMethod com/google/common/base/Predicate.equals:(Ljava/lang/Object;)Z
      25: ireturn
      26: iconst_0
      27: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #34                 // Field predicate:Lcom/google/common/base/Predicate;
       4: invokevirtual #61                 // Method java/lang/Object.hashCode:()I
       7: ireturn

  public java.lang.String toString();
    Code:
       0: new           #65                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #66                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #68                 // String Functions.forPredicate(
      11: invokevirtual #72                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #34                 // Field predicate:Lcom/google/common/base/Predicate;
      20: invokevirtual #75                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #77                 // String )
      27: invokevirtual #72                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #79                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
