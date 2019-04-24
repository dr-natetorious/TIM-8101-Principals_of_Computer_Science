final class com.google.common.base.CharMatcher$IsEither extends com.google.common.base.CharMatcher$FastMatcher {
  com.google.common.base.CharMatcher$IsEither(char, char);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method com/google/common/base/CharMatcher$FastMatcher."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #17                 // Field match1:C
       9: aload_0
      10: iload_2
      11: putfield      #19                 // Field match2:C
      14: return

  public boolean matches(char);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #17                 // Field match1:C
       5: if_icmpeq     21
       8: iload_1
       9: aload_0
      10: getfield      #19                 // Field match2:C
      13: if_icmpne     19
      16: goto          21
      19: iconst_0
      20: ireturn
      21: iconst_1
      22: ireturn

  void setBits(java.util.BitSet);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #17                 // Field match1:C
       5: invokevirtual #30                 // Method java/util/BitSet.set:(I)V
       8: aload_1
       9: aload_0
      10: getfield      #19                 // Field match2:C
      13: invokevirtual #30                 // Method java/util/BitSet.set:(I)V
      16: return

  public java.lang.String toString();
    Code:
       0: new           #34                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #35                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #37                 // String CharMatcher.anyOf(\"
      11: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #17                 // Field match1:C
      20: invokestatic  #45                 // Method com/google/common/base/CharMatcher.access$100:(C)Ljava/lang/String;
      23: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: aload_0
      29: getfield      #19                 // Field match2:C
      32: invokestatic  #45                 // Method com/google/common/base/CharMatcher.access$100:(C)Ljava/lang/String;
      35: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: aload_1
      40: ldc           #47                 // String \")
      42: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      45: pop
      46: aload_1
      47: invokevirtual #49                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      50: areturn
}
