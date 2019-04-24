final class com.google.common.base.CharMatcher$BreakingWhitespace extends com.google.common.base.CharMatcher {
  static final com.google.common.base.CharMatcher INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/CharMatcher$BreakingWhitespace
       3: dup
       4: invokespecial #12                 // Method "<init>":()V
       7: putstatic     #14                 // Field INSTANCE:Lcom/google/common/base/CharMatcher;
      10: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #21                 // class java/lang/Character
       5: invokespecial #24                 // Method com/google/common/base/CharMatcher.apply:(Ljava/lang/Character;)Z
       8: ireturn

  public boolean matches(char);
    Code:
       0: iload_1
       1: bipush        32
       3: if_icmpeq     120
       6: iload_1
       7: sipush        133
      10: if_icmpeq     120
      13: iload_1
      14: sipush        5760
      17: if_icmpeq     120
      20: iload_1
      21: sipush        8199
      24: if_icmpeq     118
      27: iload_1
      28: sipush        8287
      31: if_icmpeq     120
      34: iload_1
      35: sipush        12288
      38: if_icmpeq     120
      41: iload_1
      42: tableswitch   { // 9 to 13
                     9: 120
                    10: 120
                    11: 120
                    12: 120
                    13: 120
               default: 76
          }
      76: iload_1
      77: tableswitch   { // 8232 to 8233
                  8232: 120
                  8233: 120
               default: 100
          }
     100: iload_1
     101: sipush        8192
     104: if_icmplt     116
     107: iload_1
     108: sipush        8202
     111: if_icmpgt     116
     114: iconst_1
     115: ireturn
     116: iconst_0
     117: ireturn
     118: iconst_0
     119: ireturn
     120: iconst_1
     121: ireturn

  public java.lang.String toString();
    Code:
       0: ldc           #31                 // String CharMatcher.breakingWhitespace()
       2: areturn
}
