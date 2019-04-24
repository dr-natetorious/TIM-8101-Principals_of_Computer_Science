public final class com.google.common.base.Strings {
  public static java.lang.String commonPrefix(java.lang.CharSequence, java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokestatic  #17                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: invokestatic  #17                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: aload_0
      11: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      16: aload_1
      17: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      22: invokestatic  #29                 // Method java/lang/Math.min:(II)I
      25: istore_3
      26: iconst_0
      27: istore_2
      28: iload_2
      29: iload_3
      30: if_icmpge     57
      33: aload_0
      34: iload_2
      35: invokeinterface #33,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      40: aload_1
      41: iload_2
      42: invokeinterface #33,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      47: if_icmpne     57
      50: iload_2
      51: iconst_1
      52: iadd
      53: istore_2
      54: goto          28
      57: iload_2
      58: iconst_1
      59: isub
      60: istore        4
      62: aload_0
      63: iload         4
      65: invokestatic  #37                 // Method validSurrogatePairAt:(Ljava/lang/CharSequence;I)Z
      68: ifne          82
      71: iload_2
      72: istore_3
      73: aload_1
      74: iload         4
      76: invokestatic  #37                 // Method validSurrogatePairAt:(Ljava/lang/CharSequence;I)Z
      79: ifeq          86
      82: iload_2
      83: iconst_1
      84: isub
      85: istore_3
      86: aload_0
      87: iconst_0
      88: iload_3
      89: invokeinterface #41,  3           // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
      94: invokeinterface #45,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      99: areturn

  public static java.lang.String commonSuffix(java.lang.CharSequence, java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokestatic  #17                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: invokestatic  #17                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: aload_0
      11: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      16: aload_1
      17: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      22: invokestatic  #29                 // Method java/lang/Math.min:(II)I
      25: istore_3
      26: iconst_0
      27: istore_2
      28: iload_2
      29: iload_3
      30: if_icmpge     75
      33: aload_0
      34: aload_0
      35: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      40: iload_2
      41: isub
      42: iconst_1
      43: isub
      44: invokeinterface #33,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      49: aload_1
      50: aload_1
      51: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      56: iload_2
      57: isub
      58: iconst_1
      59: isub
      60: invokeinterface #33,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      65: if_icmpne     75
      68: iload_2
      69: iconst_1
      70: iadd
      71: istore_2
      72: goto          28
      75: aload_0
      76: aload_0
      77: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      82: iload_2
      83: isub
      84: iconst_1
      85: isub
      86: invokestatic  #37                 // Method validSurrogatePairAt:(Ljava/lang/CharSequence;I)Z
      89: ifne          111
      92: iload_2
      93: istore_3
      94: aload_1
      95: aload_1
      96: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
     101: iload_2
     102: isub
     103: iconst_1
     104: isub
     105: invokestatic  #37                 // Method validSurrogatePairAt:(Ljava/lang/CharSequence;I)Z
     108: ifeq          115
     111: iload_2
     112: iconst_1
     113: isub
     114: istore_3
     115: aload_0
     116: aload_0
     117: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
     122: iload_3
     123: isub
     124: aload_0
     125: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
     130: invokeinterface #41,  3           // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
     135: invokeinterface #45,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
     140: areturn

  public static java.lang.String emptyToNull(java.lang.String);
    Code:
       0: aload_0
       1: astore_1
       2: aload_0
       3: invokestatic  #52                 // Method isNullOrEmpty:(Ljava/lang/String;)Z
       6: ifeq          11
       9: aconst_null
      10: astore_1
      11: aload_1
      12: areturn

  public static boolean isNullOrEmpty(java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #57                 // Method com/google/common/base/Platform.stringIsNullOrEmpty:(Ljava/lang/String;)Z
       4: ireturn

  public static java.lang.String nullToEmpty(java.lang.String);
    Code:
       0: aload_0
       1: astore_1
       2: aload_0
       3: ifnonnull     9
       6: ldc           #60                 // String
       8: astore_1
       9: aload_1
      10: areturn

  public static java.lang.String padEnd(java.lang.String, int, char);
    Code:
       0: aload_0
       1: invokestatic  #17                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: invokevirtual #65                 // Method java/lang/String.length:()I
       9: iload_1
      10: if_icmplt     15
      13: aload_0
      14: areturn
      15: new           #67                 // class java/lang/StringBuilder
      18: dup
      19: iload_1
      20: invokespecial #70                 // Method java/lang/StringBuilder."<init>":(I)V
      23: astore        4
      25: aload         4
      27: aload_0
      28: invokevirtual #74                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      31: pop
      32: aload_0
      33: invokevirtual #65                 // Method java/lang/String.length:()I
      36: istore_3
      37: iload_3
      38: iload_1
      39: if_icmpge     56
      42: aload         4
      44: iload_2
      45: invokevirtual #77                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      48: pop
      49: iload_3
      50: iconst_1
      51: iadd
      52: istore_3
      53: goto          37
      56: aload         4
      58: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      61: areturn

  public static java.lang.String padStart(java.lang.String, int, char);
    Code:
       0: aload_0
       1: invokestatic  #17                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: invokevirtual #65                 // Method java/lang/String.length:()I
       9: iload_1
      10: if_icmplt     15
      13: aload_0
      14: areturn
      15: new           #67                 // class java/lang/StringBuilder
      18: dup
      19: iload_1
      20: invokespecial #70                 // Method java/lang/StringBuilder."<init>":(I)V
      23: astore        4
      25: aload_0
      26: invokevirtual #65                 // Method java/lang/String.length:()I
      29: istore_3
      30: iload_3
      31: iload_1
      32: if_icmpge     49
      35: aload         4
      37: iload_2
      38: invokevirtual #77                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      41: pop
      42: iload_3
      43: iconst_1
      44: iadd
      45: istore_3
      46: goto          30
      49: aload         4
      51: aload_0
      52: invokevirtual #74                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      55: pop
      56: aload         4
      58: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      61: areturn

  public static java.lang.String repeat(java.lang.String, int);
    Code:
       0: aload_0
       1: invokestatic  #17                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iconst_1
       6: istore        4
       8: iload_1
       9: iconst_1
      10: if_icmpgt     40
      13: iload_1
      14: iflt          20
      17: goto          23
      20: iconst_0
      21: istore        4
      23: iload         4
      25: ldc           #83                 // String invalid count: %s
      27: iload_1
      28: invokestatic  #87                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;I)V
      31: iload_1
      32: ifne          38
      35: ldc           #60                 // String
      37: astore_0
      38: aload_0
      39: areturn
      40: aload_0
      41: invokevirtual #65                 // Method java/lang/String.length:()I
      44: istore_2
      45: iload_2
      46: i2l
      47: iload_1
      48: i2l
      49: lmul
      50: lstore        5
      52: lload         5
      54: l2i
      55: istore_3
      56: iload_3
      57: i2l
      58: lload         5
      60: lcmp
      61: ifeq          98
      64: new           #67                 // class java/lang/StringBuilder
      67: dup
      68: invokespecial #88                 // Method java/lang/StringBuilder."<init>":()V
      71: astore_0
      72: aload_0
      73: ldc           #90                 // String Required array size too large:
      75: invokevirtual #74                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload_0
      80: lload         5
      82: invokevirtual #93                 // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      85: pop
      86: new           #95                 // class java/lang/ArrayIndexOutOfBoundsException
      89: dup
      90: aload_0
      91: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      94: invokespecial #98                 // Method java/lang/ArrayIndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
      97: athrow
      98: iload_3
      99: newarray       char
     101: astore        7
     103: aload_0
     104: iconst_0
     105: iload_2
     106: aload         7
     108: iconst_0
     109: invokevirtual #102                // Method java/lang/String.getChars:(II[CI)V
     112: iload_2
     113: istore_1
     114: iload_3
     115: iload_1
     116: isub
     117: istore_2
     118: iload_1
     119: iload_2
     120: if_icmpge     140
     123: aload         7
     125: iconst_0
     126: aload         7
     128: iload_1
     129: iload_1
     130: invokestatic  #108                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     133: iload_1
     134: iconst_1
     135: ishl
     136: istore_1
     137: goto          114
     140: aload         7
     142: iconst_0
     143: aload         7
     145: iload_1
     146: iload_2
     147: invokestatic  #108                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     150: new           #64                 // class java/lang/String
     153: dup
     154: aload         7
     156: invokespecial #111                // Method java/lang/String."<init>":([C)V
     159: areturn

  static boolean validSurrogatePairAt(java.lang.CharSequence, int);
    Code:
       0: iload_1
       1: iflt          46
       4: iload_1
       5: aload_0
       6: invokeinterface #23,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      11: iconst_2
      12: isub
      13: if_icmpgt     46
      16: aload_0
      17: iload_1
      18: invokeinterface #33,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      23: invokestatic  #117                // Method java/lang/Character.isHighSurrogate:(C)Z
      26: ifeq          46
      29: aload_0
      30: iload_1
      31: iconst_1
      32: iadd
      33: invokeinterface #33,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      38: invokestatic  #120                // Method java/lang/Character.isLowSurrogate:(C)Z
      41: ifeq          46
      44: iconst_1
      45: ireturn
      46: iconst_0
      47: ireturn
}
