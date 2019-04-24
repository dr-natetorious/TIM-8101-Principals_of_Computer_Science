final class com.google.common.base.CharMatcher$Ascii extends com.google.common.base.CharMatcher$NamedFastMatcher {
  static final com.google.common.base.CharMatcher$Ascii INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/CharMatcher$Ascii
       3: dup
       4: invokespecial #14                 // Method "<init>":()V
       7: putstatic     #16                 // Field INSTANCE:Lcom/google/common/base/CharMatcher$Ascii;
      10: return

  com.google.common.base.CharMatcher$Ascii();
    Code:
       0: aload_0
       1: ldc           #19                 // String CharMatcher.ascii()
       3: invokespecial #22                 // Method com/google/common/base/CharMatcher$NamedFastMatcher."<init>":(Ljava/lang/String;)V
       6: return

  public boolean matches(char);
    Code:
       0: iload_1
       1: bipush        127
       3: if_icmpgt     8
       6: iconst_1
       7: ireturn
       8: iconst_0
       9: ireturn
}
