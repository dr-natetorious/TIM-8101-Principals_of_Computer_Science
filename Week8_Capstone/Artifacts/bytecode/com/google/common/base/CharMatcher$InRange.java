final class com.google.common.base.CharMatcher$InRange extends com.google.common.base.CharMatcher$FastMatcher {
  com.google.common.base.CharMatcher$InRange(char, char);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method com/google/common/base/CharMatcher$FastMatcher."<init>":()V
       4: iload_2
       5: iload_1
       6: if_icmplt     14
       9: iconst_1
      10: istore_3
      11: goto          16
      14: iconst_0
      15: istore_3
      16: iload_3
      17: invokestatic  #21                 // Method com/google/common/base/Preconditions.checkArgument:(Z)V
      20: aload_0
      21: iload_1
      22: putfield      #23                 // Field startInclusive:C
      25: aload_0
      26: iload_2
      27: putfield      #25                 // Field endInclusive:C
      30: return

  public boolean matches(char);
    Code:
       0: aload_0
       1: getfield      #23                 // Field startInclusive:C
       4: iload_1
       5: if_icmpgt     18
       8: iload_1
       9: aload_0
      10: getfield      #25                 // Field endInclusive:C
      13: if_icmpgt     18
      16: iconst_1
      17: ireturn
      18: iconst_0
      19: ireturn

  void setBits(java.util.BitSet);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #23                 // Field startInclusive:C
       5: aload_0
       6: getfield      #25                 // Field endInclusive:C
       9: iconst_1
      10: iadd
      11: invokevirtual #36                 // Method java/util/BitSet.set:(II)V
      14: return

  public java.lang.String toString();
    Code:
       0: new           #40                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #41                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #43                 // String CharMatcher.inRange('
      11: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #23                 // Field startInclusive:C
      20: invokestatic  #51                 // Method com/google/common/base/CharMatcher.access$100:(C)Ljava/lang/String;
      23: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #53                 // String ', '
      30: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: aload_0
      36: getfield      #25                 // Field endInclusive:C
      39: invokestatic  #51                 // Method com/google/common/base/CharMatcher.access$100:(C)Ljava/lang/String;
      42: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      45: pop
      46: aload_1
      47: ldc           #55                 // String ')
      49: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_1
      54: invokevirtual #57                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      57: areturn
}
