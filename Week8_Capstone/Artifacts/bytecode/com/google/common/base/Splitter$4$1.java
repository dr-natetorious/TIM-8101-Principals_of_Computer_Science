class com.google.common.base.Splitter$4$1 extends com.google.common.base.Splitter$SplittingIterator {
  final com.google.common.base.Splitter$4 this$0;

  com.google.common.base.Splitter$4$1(com.google.common.base.Splitter$4, com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$4;
       5: aload_0
       6: aload_2
       7: aload_3
       8: invokespecial #18                 // Method com/google/common/base/Splitter$SplittingIterator."<init>":(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)V
      11: return

  public int separatorEnd(int);
    Code:
       0: iload_1
       1: ireturn

  public int separatorStart(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$4;
       5: getfield      #26                 // Field com/google/common/base/Splitter$4.val$length:I
       8: iadd
       9: istore_1
      10: iload_1
      11: aload_0
      12: getfield      #30                 // Field toSplit:Ljava/lang/CharSequence;
      15: invokeinterface #36,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      20: if_icmpge     25
      23: iload_1
      24: ireturn
      25: iconst_m1
      26: ireturn
}
