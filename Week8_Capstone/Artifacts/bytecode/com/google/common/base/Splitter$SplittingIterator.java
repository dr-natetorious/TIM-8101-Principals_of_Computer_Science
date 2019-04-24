abstract class com.google.common.base.Splitter$SplittingIterator extends com.google.common.base.AbstractIterator<java.lang.String> {
  int limit;

  int offset;

  final boolean omitEmptyStrings;

  final java.lang.CharSequence toSplit;

  final com.google.common.base.CharMatcher trimmer;

  protected com.google.common.base.Splitter$SplittingIterator(com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method com/google/common/base/AbstractIterator."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #24                 // Field offset:I
       9: aload_0
      10: aload_1
      11: invokestatic  #28                 // Method com/google/common/base/Splitter.access$200:(Lcom/google/common/base/Splitter;)Lcom/google/common/base/CharMatcher;
      14: putfield      #30                 // Field trimmer:Lcom/google/common/base/CharMatcher;
      17: aload_0
      18: aload_1
      19: invokestatic  #34                 // Method com/google/common/base/Splitter.access$300:(Lcom/google/common/base/Splitter;)Z
      22: putfield      #36                 // Field omitEmptyStrings:Z
      25: aload_0
      26: aload_1
      27: invokestatic  #40                 // Method com/google/common/base/Splitter.access$400:(Lcom/google/common/base/Splitter;)I
      30: putfield      #42                 // Field limit:I
      33: aload_0
      34: aload_2
      35: putfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
      38: return

  protected java.lang.Object computeNext();
    Code:
       0: aload_0
       1: invokevirtual #50                 // Method computeNext:()Ljava/lang/String;
       4: areturn

  protected java.lang.String computeNext();
    Code:
       0: aload_0
       1: getfield      #24                 // Field offset:I
       4: istore_2
       5: aload_0
       6: getfield      #24                 // Field offset:I
       9: iconst_m1
      10: if_icmpeq     271
      13: aload_0
      14: aload_0
      15: getfield      #24                 // Field offset:I
      18: invokevirtual #54                 // Method separatorStart:(I)I
      21: istore_1
      22: iload_1
      23: iconst_m1
      24: if_icmpne     45
      27: aload_0
      28: getfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
      31: invokeinterface #60,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      36: istore_1
      37: aload_0
      38: iconst_m1
      39: putfield      #24                 // Field offset:I
      42: goto          54
      45: aload_0
      46: aload_0
      47: iload_1
      48: invokevirtual #63                 // Method separatorEnd:(I)I
      51: putfield      #24                 // Field offset:I
      54: iload_2
      55: istore_3
      56: aload_0
      57: getfield      #24                 // Field offset:I
      60: iload_2
      61: if_icmpne     98
      64: aload_0
      65: aload_0
      66: getfield      #24                 // Field offset:I
      69: iconst_1
      70: iadd
      71: putfield      #24                 // Field offset:I
      74: aload_0
      75: getfield      #24                 // Field offset:I
      78: aload_0
      79: getfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
      82: invokeinterface #60,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      87: if_icmple     5
      90: aload_0
      91: iconst_m1
      92: putfield      #24                 // Field offset:I
      95: goto          5
      98: iload_1
      99: istore_2
     100: iload_3
     101: iload_1
     102: if_icmpge     134
     105: iload_1
     106: istore_2
     107: aload_0
     108: getfield      #30                 // Field trimmer:Lcom/google/common/base/CharMatcher;
     111: aload_0
     112: getfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
     115: iload_3
     116: invokeinterface #67,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
     121: invokevirtual #73                 // Method com/google/common/base/CharMatcher.matches:(C)Z
     124: ifeq          134
     127: iload_3
     128: iconst_1
     129: iadd
     130: istore_3
     131: goto          98
     134: iload_2
     135: iload_3
     136: if_icmple     168
     139: aload_0
     140: getfield      #30                 // Field trimmer:Lcom/google/common/base/CharMatcher;
     143: aload_0
     144: getfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
     147: iload_2
     148: iconst_1
     149: isub
     150: invokeinterface #67,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
     155: invokevirtual #73                 // Method com/google/common/base/CharMatcher.matches:(C)Z
     158: ifeq          168
     161: iload_2
     162: iconst_1
     163: isub
     164: istore_2
     165: goto          134
     168: aload_0
     169: getfield      #36                 // Field omitEmptyStrings:Z
     172: ifeq          183
     175: iload_3
     176: iload_2
     177: if_icmpne     183
     180: goto          0
     183: aload_0
     184: getfield      #42                 // Field limit:I
     187: iconst_1
     188: if_icmpne     244
     191: aload_0
     192: getfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
     195: invokeinterface #60,  1           // InterfaceMethod java/lang/CharSequence.length:()I
     200: istore_1
     201: aload_0
     202: iconst_m1
     203: putfield      #24                 // Field offset:I
     206: iload_1
     207: istore_2
     208: iload_1
     209: iload_3
     210: if_icmple     254
     213: iload_1
     214: istore_2
     215: aload_0
     216: getfield      #30                 // Field trimmer:Lcom/google/common/base/CharMatcher;
     219: aload_0
     220: getfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
     223: iload_1
     224: iconst_1
     225: isub
     226: invokeinterface #67,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
     231: invokevirtual #73                 // Method com/google/common/base/CharMatcher.matches:(C)Z
     234: ifeq          254
     237: iload_1
     238: iconst_1
     239: isub
     240: istore_1
     241: goto          206
     244: aload_0
     245: aload_0
     246: getfield      #42                 // Field limit:I
     249: iconst_1
     250: isub
     251: putfield      #42                 // Field limit:I
     254: aload_0
     255: getfield      #44                 // Field toSplit:Ljava/lang/CharSequence;
     258: iload_3
     259: iload_2
     260: invokeinterface #77,  3           // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
     265: invokeinterface #80,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
     270: areturn
     271: aload_0
     272: invokevirtual #83                 // Method endOfData:()Ljava/lang/Object;
     275: checkcast     #85                 // class java/lang/String
     278: areturn

  abstract int separatorEnd(int);

  abstract int separatorStart(int);
}
