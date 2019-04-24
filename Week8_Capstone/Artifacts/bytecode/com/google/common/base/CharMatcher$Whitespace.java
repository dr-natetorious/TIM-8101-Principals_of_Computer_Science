final class com.google.common.base.CharMatcher$Whitespace extends com.google.common.base.CharMatcher$NamedFastMatcher {
  static final com.google.common.base.CharMatcher$Whitespace INSTANCE;

  static final int MULTIPLIER;

  static final int SHIFT;

  static final java.lang.String TABLE;

  static {};
    Code:
       0: ldc           #17                 // String ??\r????????????\t ??????????\n??
       2: invokevirtual #25                 // Method java/lang/String.length:()I
       5: iconst_1
       6: isub
       7: invokestatic  #31                 // Method java/lang/Integer.numberOfLeadingZeros:(I)I
      10: putstatic     #33                 // Field SHIFT:I
      13: new           #2                  // class com/google/common/base/CharMatcher$Whitespace
      16: dup
      17: invokespecial #36                 // Method "<init>":()V
      20: putstatic     #38                 // Field INSTANCE:Lcom/google/common/base/CharMatcher$Whitespace;
      23: return

  com.google.common.base.CharMatcher$Whitespace();
    Code:
       0: aload_0
       1: ldc           #41                 // String CharMatcher.whitespace()
       3: invokespecial #44                 // Method com/google/common/base/CharMatcher$NamedFastMatcher."<init>":(Ljava/lang/String;)V
       6: return

  public boolean matches(char);
    Code:
       0: ldc           #17                 // String ??\r????????????\t ??????????\n??
       2: ldc           #12                 // int 1682554634
       4: iload_1
       5: imul
       6: getstatic     #33                 // Field SHIFT:I
       9: iushr
      10: invokevirtual #50                 // Method java/lang/String.charAt:(I)C
      13: iload_1
      14: if_icmpne     19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  void setBits(java.util.BitSet);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: ldc           #17                 // String ??\r????????????\t ??????????\n??
       5: invokevirtual #25                 // Method java/lang/String.length:()I
       8: if_icmpge     28
      11: aload_1
      12: ldc           #17                 // String ??\r????????????\t ??????????\n??
      14: iload_2
      15: invokevirtual #50                 // Method java/lang/String.charAt:(I)C
      18: invokevirtual #58                 // Method java/util/BitSet.set:(I)V
      21: iload_2
      22: iconst_1
      23: iadd
      24: istore_2
      25: goto          2
      28: return
}
