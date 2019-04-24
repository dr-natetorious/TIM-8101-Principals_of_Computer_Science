class com.google.common.base.CharMatcher$Negated extends com.google.common.base.CharMatcher {
  final com.google.common.base.CharMatcher original;

  com.google.common.base.CharMatcher$Negated(com.google.common.base.CharMatcher);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method com/google/common/base/CharMatcher."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #18                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #4                  // class com/google/common/base/CharMatcher
      12: putfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
      15: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #26                 // class java/lang/Character
       5: invokespecial #29                 // Method com/google/common/base/CharMatcher.apply:(Ljava/lang/Character;)Z
       8: ireturn

  public int countIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: aload_0
       7: getfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
      10: aload_1
      11: invokevirtual #40                 // Method com/google/common/base/CharMatcher.countIn:(Ljava/lang/CharSequence;)I
      14: isub
      15: ireturn

  public boolean matches(char);
    Code:
       0: aload_0
       1: getfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
       4: iload_1
       5: invokevirtual #44                 // Method com/google/common/base/CharMatcher.matches:(C)Z
       8: iconst_1
       9: ixor
      10: ireturn

  public boolean matchesAllOf(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
       4: aload_1
       5: invokevirtual #49                 // Method com/google/common/base/CharMatcher.matchesNoneOf:(Ljava/lang/CharSequence;)Z
       8: ireturn

  public boolean matchesNoneOf(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
       4: aload_1
       5: invokevirtual #51                 // Method com/google/common/base/CharMatcher.matchesAllOf:(Ljava/lang/CharSequence;)Z
       8: ireturn

  public com.google.common.base.CharMatcher negate();
    Code:
       0: aload_0
       1: getfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
       4: areturn

  void setBits(java.util.BitSet);
    Code:
       0: new           #57                 // class java/util/BitSet
       3: dup
       4: invokespecial #58                 // Method java/util/BitSet."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
      12: aload_2
      13: invokevirtual #60                 // Method com/google/common/base/CharMatcher.setBits:(Ljava/util/BitSet;)V
      16: aload_2
      17: iconst_0
      18: ldc           #61                 // int 65536
      20: invokevirtual #65                 // Method java/util/BitSet.flip:(II)V
      23: aload_1
      24: aload_2
      25: invokevirtual #68                 // Method java/util/BitSet.or:(Ljava/util/BitSet;)V
      28: return

  public java.lang.String toString();
    Code:
       0: new           #72                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #73                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #20                 // Field original:Lcom/google/common/base/CharMatcher;
      13: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #79                 // String .negate()
      20: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: invokevirtual #84                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      28: areturn
}
