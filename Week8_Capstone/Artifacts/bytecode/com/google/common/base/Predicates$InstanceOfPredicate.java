class com.google.common.base.Predicates$InstanceOfPredicate implements com.google.common.base.Predicate<java.lang.Object>, java.io.Serializable {
  com.google.common.base.Predicates$InstanceOfPredicate(java.lang.Class, com.google.common.base.Predicates$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Ljava/lang/Class;)V
       5: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #34                 // Field clazz:Ljava/lang/Class;
       4: aload_1
       5: invokevirtual #45                 // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
       8: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Predicates$InstanceOfPredicate
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          35
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Predicates$InstanceOfPredicate
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #34                 // Field clazz:Ljava/lang/Class;
      26: aload_1
      27: getfield      #34                 // Field clazz:Ljava/lang/Class;
      30: if_acmpne     35
      33: iconst_1
      34: istore_2
      35: iload_2
      36: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #34                 // Field clazz:Ljava/lang/Class;
       4: invokevirtual #50                 // Method java/lang/Object.hashCode:()I
       7: ireturn

  public java.lang.String toString();
    Code:
       0: new           #54                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #55                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #57                 // String Predicates.instanceOf(
      11: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #34                 // Field clazz:Ljava/lang/Class;
      20: invokevirtual #64                 // Method java/lang/Class.getName:()Ljava/lang/String;
      23: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #66                 // String )
      30: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      38: areturn
}
