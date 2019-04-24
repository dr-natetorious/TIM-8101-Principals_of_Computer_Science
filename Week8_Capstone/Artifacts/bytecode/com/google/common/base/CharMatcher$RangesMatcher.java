class com.google.common.base.CharMatcher$RangesMatcher extends com.google.common.base.CharMatcher {
  com.google.common.base.CharMatcher$RangesMatcher(java.lang.String, char[], char[]);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method com/google/common/base/CharMatcher."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field description:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #19                 // Field rangeStarts:[C
      14: aload_0
      15: aload_3
      16: putfield      #21                 // Field rangeEnds:[C
      19: aload_2
      20: arraylength
      21: aload_3
      22: arraylength
      23: if_icmpne     32
      26: iconst_1
      27: istore        6
      29: goto          35
      32: iconst_0
      33: istore        6
      35: iload         6
      37: invokestatic  #27                 // Method com/google/common/base/Preconditions.checkArgument:(Z)V
      40: iconst_0
      41: istore        4
      43: iload         4
      45: aload_2
      46: arraylength
      47: if_icmpge     120
      50: aload_2
      51: iload         4
      53: caload
      54: aload_3
      55: iload         4
      57: caload
      58: if_icmpgt     67
      61: iconst_1
      62: istore        6
      64: goto          70
      67: iconst_0
      68: istore        6
      70: iload         6
      72: invokestatic  #27                 // Method com/google/common/base/Preconditions.checkArgument:(Z)V
      75: iload         4
      77: iconst_1
      78: iadd
      79: istore        5
      81: iload         5
      83: aload_2
      84: arraylength
      85: if_icmpge     113
      88: aload_3
      89: iload         4
      91: caload
      92: aload_2
      93: iload         5
      95: caload
      96: if_icmpge     105
      99: iconst_1
     100: istore        6
     102: goto          108
     105: iconst_0
     106: istore        6
     108: iload         6
     110: invokestatic  #27                 // Method com/google/common/base/Preconditions.checkArgument:(Z)V
     113: iload         5
     115: istore        4
     117: goto          43
     120: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #33                 // class java/lang/Character
       5: invokespecial #36                 // Method com/google/common/base/CharMatcher.apply:(Ljava/lang/Character;)Z
       8: ireturn

  public boolean matches(char);
    Code:
       0: aload_0
       1: getfield      #19                 // Field rangeStarts:[C
       4: iload_1
       5: invokestatic  #45                 // Method java/util/Arrays.binarySearch:([CC)I
       8: istore_2
       9: iload_2
      10: iflt          15
      13: iconst_1
      14: ireturn
      15: iload_2
      16: iconst_m1
      17: ixor
      18: iconst_1
      19: isub
      20: istore_2
      21: iload_2
      22: iflt          37
      25: iload_1
      26: aload_0
      27: getfield      #21                 // Field rangeEnds:[C
      30: iload_2
      31: caload
      32: if_icmpgt     37
      35: iconst_1
      36: ireturn
      37: iconst_0
      38: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #17                 // Field description:Ljava/lang/String;
       4: areturn
}
