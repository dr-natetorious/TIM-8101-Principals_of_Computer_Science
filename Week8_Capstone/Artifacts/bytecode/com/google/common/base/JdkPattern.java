final class com.google.common.base.JdkPattern extends com.google.common.base.CommonPattern implements java.io.Serializable {
  com.google.common.base.JdkPattern(java.util.regex.Pattern);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method com/google/common/base/CommonPattern."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #26                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #28                 // class java/util/regex/Pattern
      12: putfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
      15: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/JdkPattern
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
      13: aload_1
      14: checkcast     #2                  // class com/google/common/base/JdkPattern
      17: getfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
      20: invokevirtual #37                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      23: ireturn

  int flags();
    Code:
       0: aload_0
       1: getfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
       4: invokevirtual #41                 // Method java/util/regex/Pattern.flags:()I
       7: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
       4: invokevirtual #44                 // Method java/lang/Object.hashCode:()I
       7: ireturn

  com.google.common.base.CommonMatcher matcher(java.lang.CharSequence);
    Code:
       0: new           #8                  // class com/google/common/base/JdkPattern$JdkMatcher
       3: dup
       4: aload_0
       5: getfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
       8: aload_1
       9: invokevirtual #49                 // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      12: invokespecial #52                 // Method com/google/common/base/JdkPattern$JdkMatcher."<init>":(Ljava/util/regex/Matcher;)V
      15: areturn

  java.lang.String pattern();
    Code:
       0: aload_0
       1: getfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
       4: invokevirtual #55                 // Method java/util/regex/Pattern.pattern:()Ljava/lang/String;
       7: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #30                 // Field pattern:Ljava/util/regex/Pattern;
       4: invokevirtual #58                 // Method java/util/regex/Pattern.toString:()Ljava/lang/String;
       7: areturn
}
