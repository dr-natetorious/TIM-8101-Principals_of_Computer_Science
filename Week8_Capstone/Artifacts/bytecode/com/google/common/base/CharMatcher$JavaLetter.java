final class com.google.common.base.CharMatcher$JavaLetter extends com.google.common.base.CharMatcher {
  static final com.google.common.base.CharMatcher$JavaLetter INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/CharMatcher$JavaLetter
       3: dup
       4: invokespecial #12                 // Method "<init>":()V
       7: putstatic     #14                 // Field INSTANCE:Lcom/google/common/base/CharMatcher$JavaLetter;
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
       1: invokestatic  #30                 // Method java/lang/Character.isLetter:(C)Z
       4: ireturn

  public java.lang.String toString();
    Code:
       0: ldc           #34                 // String CharMatcher.javaLetter()
       2: areturn
}
