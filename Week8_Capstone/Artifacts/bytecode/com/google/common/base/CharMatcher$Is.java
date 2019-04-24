final class com.google.common.base.CharMatcher$Is extends com.google.common.base.CharMatcher$FastMatcher {
  com.google.common.base.CharMatcher$Is(char);
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
       1: aload_0
       2: getfield      #16                 // Field match:C
       5: invokevirtual #23                 // Method com/google/common/base/CharMatcher.matches:(C)Z
       8: ifeq          13
      11: aload_0
      12: areturn
      13: invokestatic  #27                 // Method none:()Lcom/google/common/base/CharMatcher;
      16: areturn

  public boolean matches(char);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #16                 // Field match:C
       5: if_icmpne     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public com.google.common.base.CharMatcher negate();
    Code:
       0: aload_0
       1: getfield      #16                 // Field match:C
       4: invokestatic  #32                 // Method isNot:(C)Lcom/google/common/base/CharMatcher;
       7: areturn

  public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #16                 // Field match:C
       5: invokevirtual #23                 // Method com/google/common/base/CharMatcher.matches:(C)Z
       8: ifeq          13
      11: aload_1
      12: areturn
      13: aload_0
      14: aload_1
      15: invokespecial #35                 // Method com/google/common/base/CharMatcher$FastMatcher.or:(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/CharMatcher;
      18: areturn

  public java.lang.String replaceFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #43,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: aload_0
       7: getfield      #16                 // Field match:C
      10: iload_2
      11: invokevirtual #49                 // Method java/lang/String.replace:(CC)Ljava/lang/String;
      14: areturn

  void setBits(java.util.BitSet);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #16                 // Field match:C
       5: invokevirtual #57                 // Method java/util/BitSet.set:(I)V
       8: return

  public java.lang.String toString();
    Code:
       0: new           #59                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #60                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #62                 // String CharMatcher.is('
      11: invokevirtual #66                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #16                 // Field match:C
      20: invokestatic  #70                 // Method com/google/common/base/CharMatcher.access$100:(C)Ljava/lang/String;
      23: invokevirtual #66                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #72                 // String ')
      30: invokevirtual #66                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: invokevirtual #73                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      38: areturn
}
