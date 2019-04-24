final class com.google.common.base.CharMatcher$IsNot extends com.google.common.base.CharMatcher$FastMatcher {
  com.google.common.base.CharMatcher$IsNot(char);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method com/google/common/base/CharMatcher$FastMatcher."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #16                 // Field match:C
       9: return

  public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: astore_2
       2: aload_1
       3: aload_0
       4: getfield      #16                 // Field match:C
       7: invokevirtual #23                 // Method com/google/common/base/CharMatcher.matches:(C)Z
      10: ifeq          19
      13: aload_0
      14: aload_1
      15: invokespecial #25                 // Method com/google/common/base/CharMatcher$FastMatcher.and:(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/CharMatcher;
      18: astore_2
      19: aload_2
      20: areturn

  public boolean matches(char);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #16                 // Field match:C
       5: if_icmpeq     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public com.google.common.base.CharMatcher negate();
    Code:
       0: aload_0
       1: getfield      #16                 // Field match:C
       4: invokestatic  #31                 // Method is:(C)Lcom/google/common/base/CharMatcher;
       7: areturn

  public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #16                 // Field match:C
       5: invokevirtual #23                 // Method com/google/common/base/CharMatcher.matches:(C)Z
       8: ifeq          15
      11: invokestatic  #35                 // Method any:()Lcom/google/common/base/CharMatcher;
      14: areturn
      15: aload_0
      16: areturn

  void setBits(java.util.BitSet);
    Code:
       0: aload_1
       1: iconst_0
       2: aload_0
       3: getfield      #16                 // Field match:C
       6: invokevirtual #43                 // Method java/util/BitSet.set:(II)V
       9: aload_1
      10: aload_0
      11: getfield      #16                 // Field match:C
      14: iconst_1
      15: iadd
      16: ldc           #44                 // int 65536
      18: invokevirtual #43                 // Method java/util/BitSet.set:(II)V
      21: return

  public java.lang.String toString();
    Code:
       0: new           #48                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #49                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #51                 // String CharMatcher.isNot('
      11: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #16                 // Field match:C
      20: invokestatic  #59                 // Method com/google/common/base/CharMatcher.access$100:(C)Ljava/lang/String;
      23: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #61                 // String ')
      30: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: invokevirtual #63                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      38: areturn
}
