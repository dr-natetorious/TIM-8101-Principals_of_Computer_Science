abstract class com.google.common.base.CharMatcher$NamedFastMatcher extends com.google.common.base.CharMatcher$FastMatcher {
  com.google.common.base.CharMatcher$NamedFastMatcher(java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method com/google/common/base/CharMatcher$FastMatcher."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #20                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #22                 // class java/lang/String
      12: putfield      #24                 // Field description:Ljava/lang/String;
      15: return

  public final java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #24                 // Field description:Ljava/lang/String;
       4: areturn
}
