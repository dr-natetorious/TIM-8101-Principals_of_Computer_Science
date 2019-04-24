public final class com.google.common.base.Ascii {
  public static final byte ACK;

  public static final byte BEL;

  public static final byte BS;

  public static final byte CAN;

  public static final byte CR;

  public static final byte DC1;

  public static final byte DC2;

  public static final byte DC3;

  public static final byte DC4;

  public static final byte DEL;

  public static final byte DLE;

  public static final byte EM;

  public static final byte ENQ;

  public static final byte EOT;

  public static final byte ESC;

  public static final byte ETB;

  public static final byte ETX;

  public static final byte FF;

  public static final byte FS;

  public static final byte GS;

  public static final byte HT;

  public static final byte LF;

  public static final char MAX;

  public static final char MIN;

  public static final byte NAK;

  public static final byte NL;

  public static final byte NUL;

  public static final byte RS;

  public static final byte SI;

  public static final byte SO;

  public static final byte SOH;

  public static final byte SP;

  public static final byte SPACE;

  public static final byte STX;

  public static final byte SUB;

  public static final byte SYN;

  public static final byte US;

  public static final byte VT;

  public static final byte XOFF;

  public static final byte XON;

  public static boolean equalsIgnoreCase(java.lang.CharSequence, java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokeinterface #93,  1           // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore        5
       8: aload_0
       9: aload_1
      10: if_acmpne     15
      13: iconst_1
      14: ireturn
      15: iload         5
      17: aload_1
      18: invokeinterface #93,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      23: if_icmpeq     28
      26: iconst_0
      27: ireturn
      28: iconst_0
      29: istore        4
      31: iload         4
      33: iload         5
      35: if_icmpge     97
      38: aload_0
      39: iload         4
      41: invokeinterface #97,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      46: istore_2
      47: aload_1
      48: iload         4
      50: invokeinterface #97,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      55: istore_3
      56: iload_2
      57: iload_3
      58: if_icmpne     64
      61: goto          86
      64: iload_2
      65: invokestatic  #101                // Method getAlphaIndex:(C)I
      68: istore        6
      70: iload         6
      72: bipush        26
      74: if_icmpge     95
      77: iload         6
      79: iload_3
      80: invokestatic  #101                // Method getAlphaIndex:(C)I
      83: if_icmpne     95
      86: iload         4
      88: iconst_1
      89: iadd
      90: istore        4
      92: goto          31
      95: iconst_0
      96: ireturn
      97: iconst_1
      98: ireturn

  public static boolean isLowerCase(char);
    Code:
       0: iload_0
       1: bipush        97
       3: if_icmplt     14
       6: iload_0
       7: bipush        122
       9: if_icmpgt     14
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn

  public static boolean isUpperCase(char);
    Code:
       0: iload_0
       1: bipush        65
       3: if_icmplt     14
       6: iload_0
       7: bipush        90
       9: if_icmpgt     14
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn

  public static char toLowerCase(char);
    Code:
       0: iload_0
       1: istore_1
       2: iload_0
       3: invokestatic  #108                // Method isUpperCase:(C)Z
       6: ifeq          15
       9: iload_0
      10: bipush        32
      12: ixor
      13: i2c
      14: istore_1
      15: iload_1
      16: ireturn

  public static java.lang.String toLowerCase(java.lang.CharSequence);
    Code:
       0: aload_0
       1: instanceof    #111                // class java/lang/String
       4: ifeq          15
       7: aload_0
       8: checkcast     #111                // class java/lang/String
      11: invokestatic  #114                // Method toLowerCase:(Ljava/lang/String;)Ljava/lang/String;
      14: areturn
      15: aload_0
      16: invokeinterface #93,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      21: newarray       char
      23: astore_2
      24: iconst_0
      25: istore_1
      26: iload_1
      27: aload_2
      28: arraylength
      29: if_icmpge     52
      32: aload_2
      33: iload_1
      34: aload_0
      35: iload_1
      36: invokeinterface #97,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      41: invokestatic  #116                // Method toLowerCase:(C)C
      44: castore
      45: iload_1
      46: iconst_1
      47: iadd
      48: istore_1
      49: goto          26
      52: aload_2
      53: invokestatic  #120                // Method java/lang/String.valueOf:([C)Ljava/lang/String;
      56: areturn

  public static java.lang.String toLowerCase(java.lang.String);
    Code:
       0: aload_0
       1: invokevirtual #121                // Method java/lang/String.length:()I
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iload_2
       8: iload_3
       9: if_icmpge     71
      12: aload_0
      13: iload_2
      14: invokevirtual #122                // Method java/lang/String.charAt:(I)C
      17: invokestatic  #108                // Method isUpperCase:(C)Z
      20: ifeq          64
      23: aload_0
      24: invokevirtual #126                // Method java/lang/String.toCharArray:()[C
      27: astore_0
      28: iload_2
      29: iload_3
      30: if_icmpge     59
      33: aload_0
      34: iload_2
      35: caload
      36: istore_1
      37: iload_1
      38: invokestatic  #108                // Method isUpperCase:(C)Z
      41: ifeq          52
      44: aload_0
      45: iload_2
      46: iload_1
      47: bipush        32
      49: ixor
      50: i2c
      51: castore
      52: iload_2
      53: iconst_1
      54: iadd
      55: istore_2
      56: goto          28
      59: aload_0
      60: invokestatic  #120                // Method java/lang/String.valueOf:([C)Ljava/lang/String;
      63: areturn
      64: iload_2
      65: iconst_1
      66: iadd
      67: istore_2
      68: goto          7
      71: aload_0
      72: areturn

  public static char toUpperCase(char);
    Code:
       0: iload_0
       1: istore_1
       2: iload_0
       3: invokestatic  #129                // Method isLowerCase:(C)Z
       6: ifeq          15
       9: iload_0
      10: bipush        95
      12: iand
      13: i2c
      14: istore_1
      15: iload_1
      16: ireturn

  public static java.lang.String toUpperCase(java.lang.CharSequence);
    Code:
       0: aload_0
       1: instanceof    #111                // class java/lang/String
       4: ifeq          15
       7: aload_0
       8: checkcast     #111                // class java/lang/String
      11: invokestatic  #131                // Method toUpperCase:(Ljava/lang/String;)Ljava/lang/String;
      14: areturn
      15: aload_0
      16: invokeinterface #93,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      21: newarray       char
      23: astore_2
      24: iconst_0
      25: istore_1
      26: iload_1
      27: aload_2
      28: arraylength
      29: if_icmpge     52
      32: aload_2
      33: iload_1
      34: aload_0
      35: iload_1
      36: invokeinterface #97,  2           // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      41: invokestatic  #133                // Method toUpperCase:(C)C
      44: castore
      45: iload_1
      46: iconst_1
      47: iadd
      48: istore_1
      49: goto          26
      52: aload_2
      53: invokestatic  #120                // Method java/lang/String.valueOf:([C)Ljava/lang/String;
      56: areturn

  public static java.lang.String toUpperCase(java.lang.String);
    Code:
       0: aload_0
       1: invokevirtual #121                // Method java/lang/String.length:()I
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iload_2
       8: iload_3
       9: if_icmpge     71
      12: aload_0
      13: iload_2
      14: invokevirtual #122                // Method java/lang/String.charAt:(I)C
      17: invokestatic  #129                // Method isLowerCase:(C)Z
      20: ifeq          64
      23: aload_0
      24: invokevirtual #126                // Method java/lang/String.toCharArray:()[C
      27: astore_0
      28: iload_2
      29: iload_3
      30: if_icmpge     59
      33: aload_0
      34: iload_2
      35: caload
      36: istore_1
      37: iload_1
      38: invokestatic  #129                // Method isLowerCase:(C)Z
      41: ifeq          52
      44: aload_0
      45: iload_2
      46: iload_1
      47: bipush        95
      49: iand
      50: i2c
      51: castore
      52: iload_2
      53: iconst_1
      54: iadd
      55: istore_2
      56: goto          28
      59: aload_0
      60: invokestatic  #120                // Method java/lang/String.valueOf:([C)Ljava/lang/String;
      63: areturn
      64: iload_2
      65: iconst_1
      66: iadd
      67: istore_2
      68: goto          7
      71: aload_0
      72: areturn

  public static java.lang.String truncate(java.lang.CharSequence, int, java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #141                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iload_1
       6: aload_2
       7: invokevirtual #121                // Method java/lang/String.length:()I
      10: isub
      11: istore_3
      12: iload_3
      13: iflt          22
      16: iconst_1
      17: istore        4
      19: goto          25
      22: iconst_0
      23: istore        4
      25: iload         4
      27: ldc           #143                // String maxLength (%s) must be >= length of the truncation indicator (%s)
      29: iload_1
      30: aload_2
      31: invokevirtual #121                // Method java/lang/String.length:()I
      34: invokestatic  #147                // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;II)V
      37: aload_0
      38: astore        5
      40: aload_0
      41: invokeinterface #93,  1           // InterfaceMethod java/lang/CharSequence.length:()I
      46: iload_1
      47: if_icmpgt     70
      50: aload_0
      51: invokeinterface #151,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      56: astore_0
      57: aload_0
      58: astore        5
      60: aload_0
      61: invokevirtual #121                // Method java/lang/String.length:()I
      64: iload_1
      65: if_icmpgt     70
      68: aload_0
      69: areturn
      70: new           #153                // class java/lang/StringBuilder
      73: dup
      74: iload_1
      75: invokespecial #156                // Method java/lang/StringBuilder."<init>":(I)V
      78: astore_0
      79: aload_0
      80: aload         5
      82: iconst_0
      83: iload_3
      84: invokevirtual #160                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
      87: pop
      88: aload_0
      89: aload_2
      90: invokevirtual #163                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      93: pop
      94: aload_0
      95: invokevirtual #164                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      98: areturn
}
