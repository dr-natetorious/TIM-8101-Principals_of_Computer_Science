final class com.google.common.base.CharMatcher$JavaIsoControl extends com.google.common.base.CharMatcher$NamedFastMatcher {
  static final com.google.common.base.CharMatcher$JavaIsoControl INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/CharMatcher$JavaIsoControl
       3: dup
       4: invokespecial #14                 // Method "<init>":()V
       7: putstatic     #16                 // Field INSTANCE:Lcom/google/common/base/CharMatcher$JavaIsoControl;
      10: return

  public boolean matches(char);
    Code:
       0: iload_1
       1: bipush        31
       3: if_icmple     24
       6: iload_1
       7: bipush        127
       9: if_icmplt     22
      12: iload_1
      13: sipush        159
      16: if_icmpgt     22
      19: goto          24
      22: iconst_0
      23: ireturn
      24: iconst_1
      25: ireturn
}
