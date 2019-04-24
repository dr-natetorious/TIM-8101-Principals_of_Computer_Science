public final class com.google.common.base.Equivalence$Wrapper<T> implements java.io.Serializable {
  com.google.common.base.Equivalence$Wrapper(com.google.common.base.Equivalence, java.lang.Object, com.google.common.base.Equivalence$1);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #41                 // Method "<init>":(Lcom/google/common/base/Equivalence;Ljava/lang/Object;)V
       6: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class com/google/common/base/Equivalence$Wrapper
      11: ifeq          49
      14: aload_1
      15: checkcast     #2                  // class com/google/common/base/Equivalence$Wrapper
      18: astore_1
      19: aload_0
      20: getfield      #33                 // Field equivalence:Lcom/google/common/base/Equivalence;
      23: aload_1
      24: getfield      #33                 // Field equivalence:Lcom/google/common/base/Equivalence;
      27: invokevirtual #45                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      30: ifeq          49
      33: aload_0
      34: getfield      #33                 // Field equivalence:Lcom/google/common/base/Equivalence;
      37: aload_0
      38: getfield      #35                 // Field reference:Ljava/lang/Object;
      41: aload_1
      42: getfield      #35                 // Field reference:Ljava/lang/Object;
      45: invokevirtual #49                 // Method com/google/common/base/Equivalence.equivalent:(Ljava/lang/Object;Ljava/lang/Object;)Z
      48: ireturn
      49: iconst_0
      50: ireturn

  public T get();
    Code:
       0: aload_0
       1: getfield      #35                 // Field reference:Ljava/lang/Object;
       4: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #33                 // Field equivalence:Lcom/google/common/base/Equivalence;
       4: aload_0
       5: getfield      #35                 // Field reference:Ljava/lang/Object;
       8: invokevirtual #58                 // Method com/google/common/base/Equivalence.hash:(Ljava/lang/Object;)I
      11: ireturn

  public java.lang.String toString();
    Code:
       0: new           #62                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #63                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #33                 // Field equivalence:Lcom/google/common/base/Equivalence;
      13: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #69                 // String .wrap(
      20: invokevirtual #72                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #35                 // Field reference:Ljava/lang/Object;
      29: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: ldc           #74                 // String )
      36: invokevirtual #72                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: invokevirtual #76                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: areturn
}
