class com.google.common.base.Splitter$1$1 extends com.google.common.base.Splitter$SplittingIterator {
  final com.google.common.base.Splitter$1 this$0;

  com.google.common.base.Splitter$1$1(com.google.common.base.Splitter$1, com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$1;
       5: aload_0
       6: aload_2
       7: aload_3
       8: invokespecial #18                 // Method com/google/common/base/Splitter$SplittingIterator."<init>":(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)V
      11: return

  int separatorEnd(int);
    Code:
       0: iload_1
       1: iconst_1
       2: iadd
       3: ireturn

  int separatorStart(int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$1;
       4: getfield      #26                 // Field com/google/common/base/Splitter$1.val$separatorMatcher:Lcom/google/common/base/CharMatcher;
       7: aload_0
       8: getfield      #30                 // Field toSplit:Ljava/lang/CharSequence;
      11: iload_1
      12: invokevirtual #36                 // Method com/google/common/base/CharMatcher.indexIn:(Ljava/lang/CharSequence;I)I
      15: ireturn
}
