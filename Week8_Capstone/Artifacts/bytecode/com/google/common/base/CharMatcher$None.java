final class com.google.common.base.CharMatcher$None extends com.google.common.base.CharMatcher$NamedFastMatcher {
  static final com.google.common.base.CharMatcher$None INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/CharMatcher$None
       3: dup
       4: invokespecial #14                 // Method "<init>":()V
       7: putstatic     #16                 // Field INSTANCE:Lcom/google/common/base/CharMatcher$None;
      10: return

  public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: areturn

  public java.lang.String collapseFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: areturn

  public int countIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iconst_0
       6: ireturn

  public int indexIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iconst_m1
       6: ireturn

  public int indexIn(java.lang.CharSequence, int);
    Code:
       0: iload_2
       1: aload_1
       2: invokeinterface #46,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       7: invokestatic  #50                 // Method com/google/common/base/Preconditions.checkPositionIndex:(II)I
      10: pop
      11: iconst_m1
      12: ireturn

  public int lastIndexIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iconst_m1
       6: ireturn

  public boolean matches(char);
    Code:
       0: iconst_0
       1: ireturn

  public boolean matchesAllOf(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #46,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: ifne          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public boolean matchesNoneOf(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iconst_1
       6: ireturn

  public com.google.common.base.CharMatcher negate();
    Code:
       0: invokestatic  #61                 // Method any:()Lcom/google/common/base/CharMatcher;
       3: areturn

  public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: checkcast     #6                  // class com/google/common/base/CharMatcher
       7: areturn

  public java.lang.String removeFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: areturn

  public java.lang.String replaceFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: areturn

  public java.lang.String replaceFrom(java.lang.CharSequence, java.lang.CharSequence);
    Code:
       0: aload_2
       1: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      11: areturn

  public java.lang.String trimFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: areturn

  public java.lang.String trimLeadingFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: areturn

  public java.lang.String trimTrailingFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: areturn
}
