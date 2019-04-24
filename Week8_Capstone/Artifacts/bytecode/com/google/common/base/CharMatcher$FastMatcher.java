abstract class com.google.common.base.CharMatcher$FastMatcher extends com.google.common.base.CharMatcher {
  com.google.common.base.CharMatcher$FastMatcher();
    Code:
       0: aload_0
       1: invokespecial #9                  // Method com/google/common/base/CharMatcher."<init>":()V
       4: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #15                 // class java/lang/Character
       5: invokespecial #18                 // Method com/google/common/base/CharMatcher.apply:(Ljava/lang/Character;)Z
       8: ireturn

  public com.google.common.base.CharMatcher negate();
    Code:
       0: new           #23                 // class com/google/common/base/CharMatcher$NegatedFastMatcher
       3: dup
       4: aload_0
       5: invokespecial #26                 // Method com/google/common/base/CharMatcher$NegatedFastMatcher."<init>":(Lcom/google/common/base/CharMatcher;)V
       8: areturn

  public final com.google.common.base.CharMatcher precomputed();
    Code:
       0: aload_0
       1: areturn
}
