final class com.google.common.base.CharMatcher$Any extends com.google.common.base.CharMatcher$NamedFastMatcher {
  static final com.google.common.base.CharMatcher$Any INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/CharMatcher$Any
       3: dup
       4: invokespecial #14                 // Method "<init>":()V
       7: putstatic     #16                 // Field INSTANCE:Lcom/google/common/base/CharMatcher$Any;
      10: return

  public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: checkcast     #6                  // class com/google/common/base/CharMatcher
       7: areturn

  public java.lang.String collapseFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: ifne          12
       9: ldc           #40                 // String
      11: areturn
      12: iload_2
      13: invokestatic  #46                 // Method java/lang/String.valueOf:(C)Ljava/lang/String;
      16: areturn

  public int countIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: ireturn

  public int indexIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: ifne          11
       9: iconst_m1
      10: ireturn
      11: iconst_0
      12: ireturn

  public int indexIn(java.lang.CharSequence, int);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore        4
       8: iload_2
       9: iload         4
      11: invokestatic  #54                 // Method com/google/common/base/Preconditions.checkPositionIndex:(II)I
      14: pop
      15: iload_2
      16: istore_3
      17: iload_2
      18: iload         4
      20: if_icmpne     25
      23: iconst_m1
      24: istore_3
      25: iload_3
      26: ireturn

  public int lastIndexIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: iconst_1
       7: isub
       8: ireturn

  public boolean matches(char);
    Code:
       0: iconst_1
       1: ireturn

  public boolean matchesAllOf(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iconst_1
       6: ireturn

  public boolean matchesNoneOf(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: ifne          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public com.google.common.base.CharMatcher negate();
    Code:
       0: invokestatic  #65                 // Method none:()Lcom/google/common/base/CharMatcher;
       3: areturn

  public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: areturn

  public java.lang.String removeFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: ldc           #40                 // String
       7: areturn

  public java.lang.String replaceFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: newarray       char
       8: astore_1
       9: aload_1
      10: iload_2
      11: invokestatic  #75                 // Method java/util/Arrays.fill:([CC)V
      14: new           #42                 // class java/lang/String
      17: dup
      18: aload_1
      19: invokespecial #78                 // Method java/lang/String."<init>":([C)V
      22: areturn

  public java.lang.String replaceFrom(java.lang.CharSequence, java.lang.CharSequence);
    Code:
       0: new           #81                 // class java/lang/StringBuilder
       3: dup
       4: aload_1
       5: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      10: aload_2
      11: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      16: imul
      17: invokespecial #84                 // Method java/lang/StringBuilder."<init>":(I)V
      20: astore        4
      22: iconst_0
      23: istore_3
      24: iload_3
      25: aload_1
      26: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      31: if_icmpge     48
      34: aload         4
      36: aload_2
      37: invokevirtual #88                 // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
      40: pop
      41: iload_3
      42: iconst_1
      43: iadd
      44: istore_3
      45: goto          24
      48: aload         4
      50: invokevirtual #92                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      53: areturn

  public java.lang.String trimFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: ldc           #40                 // String
       7: areturn
}
