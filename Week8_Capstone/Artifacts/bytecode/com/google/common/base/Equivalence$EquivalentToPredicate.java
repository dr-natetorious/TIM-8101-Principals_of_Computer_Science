final class com.google.common.base.Equivalence$EquivalentToPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
  com.google.common.base.Equivalence$EquivalentToPredicate(com.google.common.base.Equivalence<T>, T);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #33                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #11                 // class com/google/common/base/Equivalence
      12: putfield      #35                 // Field equivalence:Lcom/google/common/base/Equivalence;
      15: aload_0
      16: aload_2
      17: putfield      #37                 // Field target:Ljava/lang/Object;
      20: return

  public boolean apply(T);
    Code:
       0: aload_0
       1: getfield      #35                 // Field equivalence:Lcom/google/common/base/Equivalence;
       4: aload_1
       5: aload_0
       6: getfield      #37                 // Field target:Ljava/lang/Object;
       9: invokevirtual #46                 // Method com/google/common/base/Equivalence.equivalent:(Ljava/lang/Object;Ljava/lang/Object;)Z
      12: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class com/google/common/base/Equivalence$EquivalentToPredicate
      11: ifeq          51
      14: aload_1
      15: checkcast     #2                  // class com/google/common/base/Equivalence$EquivalentToPredicate
      18: astore_1
      19: aload_0
      20: getfield      #35                 // Field equivalence:Lcom/google/common/base/Equivalence;
      23: aload_1
      24: getfield      #35                 // Field equivalence:Lcom/google/common/base/Equivalence;
      27: invokevirtual #50                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      30: ifeq          49
      33: aload_0
      34: getfield      #37                 // Field target:Ljava/lang/Object;
      37: aload_1
      38: getfield      #37                 // Field target:Ljava/lang/Object;
      41: invokestatic  #55                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      44: ifeq          49
      47: iconst_1
      48: ireturn
      49: iconst_0
      50: ireturn
      51: iconst_0
      52: ireturn

  public int hashCode();
    Code:
       0: iconst_2
       1: anewarray     #5                  // class java/lang/Object
       4: dup
       5: iconst_0
       6: aload_0
       7: getfield      #35                 // Field equivalence:Lcom/google/common/base/Equivalence;
      10: aastore
      11: dup
      12: iconst_1
      13: aload_0
      14: getfield      #37                 // Field target:Ljava/lang/Object;
      17: aastore
      18: invokestatic  #60                 // Method com/google/common/base/Objects.hashCode:([Ljava/lang/Object;)I
      21: ireturn

  public java.lang.String toString();
    Code:
       0: new           #64                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #65                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #35                 // Field equivalence:Lcom/google/common/base/Equivalence;
      13: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #71                 // String .equivalentTo(
      20: invokevirtual #74                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #37                 // Field target:Ljava/lang/Object;
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
