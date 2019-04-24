final class com.google.common.base.SmallCharMatcher extends com.google.common.base.CharMatcher$NamedFastMatcher {
  static final int MAX_SIZE;

  static int chooseTableSize(int);
    Code:
       0: iload_0
       1: iconst_1
       2: if_icmpne     7
       5: iconst_2
       6: ireturn
       7: iload_0
       8: iconst_1
       9: isub
      10: invokestatic  #42                 // Method java/lang/Integer.highestOneBit:(I)I
      13: iconst_1
      14: ishl
      15: istore_1
      16: iload_1
      17: i2d
      18: ldc2_w        #12                 // double 0.5d
      21: dmul
      22: iload_0
      23: i2d
      24: dcmpg
      25: ifge          35
      28: iload_1
      29: iconst_1
      30: ishl
      31: istore_1
      32: goto          16
      35: iload_1
      36: ireturn

  static com.google.common.base.CharMatcher from(java.util.BitSet, java.lang.String);
    Code:
       0: aload_0
       1: invokevirtual #50                 // Method java/util/BitSet.cardinality:()I
       4: istore_2
       5: aload_0
       6: iconst_0
       7: invokevirtual #53                 // Method java/util/BitSet.get:(I)Z
      10: istore        5
      12: iload_2
      13: invokestatic  #55                 // Method chooseTableSize:(I)I
      16: newarray       char
      18: astore        8
      20: aload         8
      22: arraylength
      23: istore        4
      25: aload_0
      26: iconst_0
      27: invokevirtual #58                 // Method java/util/BitSet.nextSetBit:(I)I
      30: istore_2
      31: lconst_0
      32: lstore        6
      34: iload_2
      35: istore_3
      36: iload_3
      37: iconst_m1
      38: if_icmpeq     92
      41: iload_3
      42: invokestatic  #61                 // Method smear:(I)I
      45: istore_2
      46: iload_2
      47: iload         4
      49: iconst_1
      50: isub
      51: iand
      52: istore_2
      53: aload         8
      55: iload_2
      56: caload
      57: ifne          85
      60: aload         8
      62: iload_2
      63: iload_3
      64: i2c
      65: castore
      66: aload_0
      67: iload_3
      68: iconst_1
      69: iadd
      70: invokevirtual #58                 // Method java/util/BitSet.nextSetBit:(I)I
      73: istore_2
      74: lload         6
      76: lconst_1
      77: iload_3
      78: lshl
      79: lor
      80: lstore        6
      82: goto          34
      85: iload_2
      86: iconst_1
      87: iadd
      88: istore_2
      89: goto          46
      92: new           #2                  // class com/google/common/base/SmallCharMatcher
      95: dup
      96: aload         8
      98: lload         6
     100: iload         5
     102: aload_1
     103: invokespecial #63                 // Method "<init>":([CJZLjava/lang/String;)V
     106: areturn

  static int smear(int);
    Code:
       0: iload_0
       1: ldc           #7                  // int -862048943
       3: imul
       4: bipush        15
       6: invokestatic  #67                 // Method java/lang/Integer.rotateLeft:(II)I
       9: ldc           #9                  // int 461845907
      11: imul
      12: ireturn

  public boolean matches(char);
    Code:
       0: iload_1
       1: ifne          9
       4: aload_0
       5: getfield      #32                 // Field containsZero:Z
       8: ireturn
       9: aload_0
      10: iload_1
      11: invokespecial #71                 // Method checkFilter:(I)Z
      14: ifne          19
      17: iconst_0
      18: ireturn
      19: aload_0
      20: getfield      #28                 // Field table:[C
      23: arraylength
      24: iconst_1
      25: isub
      26: istore        5
      28: iload_1
      29: invokestatic  #61                 // Method smear:(I)I
      32: iload         5
      34: iand
      35: istore_3
      36: iload_3
      37: istore_2
      38: aload_0
      39: getfield      #28                 // Field table:[C
      42: iload_2
      43: caload
      44: ifne          49
      47: iconst_0
      48: ireturn
      49: aload_0
      50: getfield      #28                 // Field table:[C
      53: iload_2
      54: caload
      55: iload_1
      56: if_icmpne     61
      59: iconst_1
      60: ireturn
      61: iload_2
      62: iconst_1
      63: iadd
      64: iload         5
      66: iand
      67: istore        4
      69: iload         4
      71: istore_2
      72: iload         4
      74: iload_3
      75: if_icmpne     38
      78: iconst_0
      79: ireturn

  void setBits(java.util.BitSet);
    Code:
       0: aload_0
       1: getfield      #32                 // Field containsZero:Z
       4: istore        5
       6: iconst_0
       7: istore_2
       8: iload         5
      10: ifeq          18
      13: aload_1
      14: iconst_0
      15: invokevirtual #77                 // Method java/util/BitSet.set:(I)V
      18: aload_0
      19: getfield      #28                 // Field table:[C
      22: astore        6
      24: aload         6
      26: arraylength
      27: istore_3
      28: iload_2
      29: iload_3
      30: if_icmpge     57
      33: aload         6
      35: iload_2
      36: caload
      37: istore        4
      39: iload         4
      41: ifeq          50
      44: aload_1
      45: iload         4
      47: invokevirtual #77                 // Method java/util/BitSet.set:(I)V
      50: iload_2
      51: iconst_1
      52: iadd
      53: istore_2
      54: goto          28
      57: return
}
