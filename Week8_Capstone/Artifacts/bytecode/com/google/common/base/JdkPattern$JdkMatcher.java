final class com.google.common.base.JdkPattern$JdkMatcher extends com.google.common.base.CommonMatcher {
  final java.util.regex.Matcher matcher;

  com.google.common.base.JdkPattern$JdkMatcher(java.util.regex.Matcher);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method com/google/common/base/CommonMatcher."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #20                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #22                 // class java/util/regex/Matcher
      12: putfield      #24                 // Field matcher:Ljava/util/regex/Matcher;
      15: return

  int end();
    Code:
       0: aload_0
       1: getfield      #24                 // Field matcher:Ljava/util/regex/Matcher;
       4: invokevirtual #29                 // Method java/util/regex/Matcher.end:()I
       7: ireturn

  boolean find();
    Code:
       0: aload_0
       1: getfield      #24                 // Field matcher:Ljava/util/regex/Matcher;
       4: invokevirtual #33                 // Method java/util/regex/Matcher.find:()Z
       7: ireturn

  boolean find(int);
    Code:
       0: aload_0
       1: getfield      #24                 // Field matcher:Ljava/util/regex/Matcher;
       4: iload_1
       5: invokevirtual #36                 // Method java/util/regex/Matcher.find:(I)Z
       8: ireturn

  boolean matches();
    Code:
       0: aload_0
       1: getfield      #24                 // Field matcher:Ljava/util/regex/Matcher;
       4: invokevirtual #39                 // Method java/util/regex/Matcher.matches:()Z
       7: ireturn

  java.lang.String replaceAll(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #24                 // Field matcher:Ljava/util/regex/Matcher;
       4: aload_1
       5: invokevirtual #43                 // Method java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
       8: areturn

  int start();
    Code:
       0: aload_0
       1: getfield      #24                 // Field matcher:Ljava/util/regex/Matcher;
       4: invokevirtual #46                 // Method java/util/regex/Matcher.start:()I
       7: ireturn
}
