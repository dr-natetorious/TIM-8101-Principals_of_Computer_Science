final class com.google.common.base.Platform$JdkPatternCompiler implements com.google.common.base.PatternCompiler {
  com.google.common.base.Platform$JdkPatternCompiler(com.google.common.base.Platform$1);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method "<init>":()V
       4: return

  public com.google.common.base.CommonPattern compile(java.lang.String);
    Code:
       0: new           #20                 // class com/google/common/base/JdkPattern
       3: dup
       4: aload_1
       5: invokestatic  #25                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
       8: invokespecial #28                 // Method com/google/common/base/JdkPattern."<init>":(Ljava/util/regex/Pattern;)V
      11: areturn
}
