public final class com.google.common.base.Utf8 {
  public static int encodedLength(java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokeinterface #17,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore        4
       8: iconst_0
       9: istore_2
      10: iload_2
      11: iload         4
      13: if_icmpge     36
      16: aload_0
      17: iload_2
      18: invokeinterface #21,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      23: sipush        128
      26: if_icmpge     36
      29: iload_2
      30: iconst_1
      31: iadd
      32: istore_2
      33: goto          10
      36: iload         4
      38: istore_1
      39: iload_1
      40: istore_3
      41: iload_2
      42: iload         4
      44: if_icmpge     87
      47: aload_0
      48: iload_2
      49: invokeinterface #21,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      54: istore_3
      55: iload_3
      56: sipush        2048
      59: if_icmpge     79
      62: iload_1
      63: bipush        127
      65: iload_3
      66: isub
      67: bipush        31
      69: iushr
      70: iadd
      71: istore_1
      72: iload_2
      73: iconst_1
      74: iadd
      75: istore_2
      76: goto          39
      79: iload_1
      80: aload_0
      81: iload_2
      82: invokestatic  #25                 // Method encodedLengthGeneral:(Ljava/lang/CharSequence;I)I
      85: iadd
      86: istore_3
      87: iload_3
      88: iload         4
      90: if_icmpge     131
      93: new           #27                 // class java/lang/StringBuilder
      96: dup
      97: invokespecial #28                 // Method java/lang/StringBuilder."<init>":()V
     100: astore_0
     101: aload_0
     102: ldc           #30                 // String UTF-8 length does not fit in int:
     104: invokevirtual #34                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     107: pop
     108: aload_0
     109: iload_3
     110: i2l
     111: ldc2_w        #35                 // long 4294967296l
     114: ladd
     115: invokevirtual #39                 // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
     118: pop
     119: new           #41                 // class java/lang/IllegalArgumentException
     122: dup
     123: aload_0
     124: invokevirtual #45                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     127: invokespecial #48                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     130: athrow
     131: iload_3
     132: ireturn

  public static boolean isWellFormed(byte[]);
    Code:
       0: aload_0
       1: iconst_0
       2: aload_0
       3: arraylength
       4: invokestatic  #64                 // Method isWellFormed:([BII)Z
       7: ireturn

  public static boolean isWellFormed(byte[], int, int);
    Code:
       0: iload_2
       1: iload_1
       2: iadd
       3: istore_2
       4: iload_1
       5: iload_2
       6: aload_0
       7: arraylength
       8: invokestatic  #70                 // Method com/google/common/base/Preconditions.checkPositionIndexes:(III)V
      11: iload_1
      12: iload_2
      13: if_icmpge     36
      16: aload_0
      17: iload_1
      18: baload
      19: ifge          29
      22: aload_0
      23: iload_1
      24: iload_2
      25: invokestatic  #73                 // Method isWellFormedSlowPath:([BII)Z
      28: ireturn
      29: iload_1
      30: iconst_1
      31: iadd
      32: istore_1
      33: goto          11
      36: iconst_1
      37: ireturn
}
