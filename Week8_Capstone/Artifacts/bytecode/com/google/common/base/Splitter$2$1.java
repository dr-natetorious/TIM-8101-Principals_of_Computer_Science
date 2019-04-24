class com.google.common.base.Splitter$2$1 extends com.google.common.base.Splitter$SplittingIterator {
  final com.google.common.base.Splitter$2 this$0;

  com.google.common.base.Splitter$2$1(com.google.common.base.Splitter$2, com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$2;
       5: aload_0
       6: aload_2
       7: aload_3
       8: invokespecial #18                 // Method com/google/common/base/Splitter$SplittingIterator."<init>":(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)V
      11: return

  public int separatorEnd(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$2;
       5: getfield      #25                 // Field com/google/common/base/Splitter$2.val$separator:Ljava/lang/String;
       8: invokevirtual #31                 // Method java/lang/String.length:()I
      11: iadd
      12: ireturn

  public int separatorStart(int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$2;
       4: getfield      #25                 // Field com/google/common/base/Splitter$2.val$separator:Ljava/lang/String;
       7: invokevirtual #31                 // Method java/lang/String.length:()I
      10: istore_3
      11: aload_0
      12: getfield      #36                 // Field toSplit:Ljava/lang/CharSequence;
      15: invokeinterface #39,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      20: istore        4
      22: iload_1
      23: iload         4
      25: iload_3
      26: isub
      27: if_icmpgt     79
      30: iconst_0
      31: istore_2
      32: iload_2
      33: iload_3
      34: if_icmpge     77
      37: aload_0
      38: getfield      #36                 // Field toSplit:Ljava/lang/CharSequence;
      41: iload_2
      42: iload_1
      43: iadd
      44: invokeinterface #43,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      49: aload_0
      50: getfield      #15                 // Field this$0:Lcom/google/common/base/Splitter$2;
      53: getfield      #25                 // Field com/google/common/base/Splitter$2.val$separator:Ljava/lang/String;
      56: iload_2
      57: invokevirtual #44                 // Method java/lang/String.charAt:(I)C
      60: if_icmpeq     70
      63: iload_1
      64: iconst_1
      65: iadd
      66: istore_1
      67: goto          22
      70: iload_2
      71: iconst_1
      72: iadd
      73: istore_2
      74: goto          32
      77: iload_1
      78: ireturn
      79: iconst_m1
      80: ireturn
}
