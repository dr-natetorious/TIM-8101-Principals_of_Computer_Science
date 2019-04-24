class com.google.common.base.Splitter$3$1 extends com.google.common.base.Splitter$SplittingIterator {
  final com.google.common.base.Splitter$3 this$0;

  final com.google.common.base.CommonMatcher val$matcher;

  com.google.common.base.Splitter$3$1(com.google.common.base.Splitter$3, com.google.common.base.Splitter, java.lang.CharSequence, com.google.common.base.CommonMatcher);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field this$0:Lcom/google/common/base/Splitter$3;
       5: aload_0
       6: aload         4
       8: putfield      #19                 // Field val$matcher:Lcom/google/common/base/CommonMatcher;
      11: aload_0
      12: aload_2
      13: aload_3
      14: invokespecial #22                 // Method com/google/common/base/Splitter$SplittingIterator."<init>":(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)V
      17: return

  public int separatorEnd(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field val$matcher:Lcom/google/common/base/CommonMatcher;
       4: invokevirtual #31                 // Method com/google/common/base/CommonMatcher.end:()I
       7: ireturn

  public int separatorStart(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field val$matcher:Lcom/google/common/base/CommonMatcher;
       4: iload_1
       5: invokevirtual #36                 // Method com/google/common/base/CommonMatcher.find:(I)Z
       8: ifeq          19
      11: aload_0
      12: getfield      #19                 // Field val$matcher:Lcom/google/common/base/CommonMatcher;
      15: invokevirtual #39                 // Method com/google/common/base/CommonMatcher.start:()I
      18: ireturn
      19: iconst_m1
      20: ireturn
}
