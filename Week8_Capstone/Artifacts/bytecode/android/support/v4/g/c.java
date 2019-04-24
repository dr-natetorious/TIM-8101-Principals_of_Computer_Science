class android.support.v4.g.c {
  static final int[] a;

  static final long[] b;

  static final java.lang.Object[] c;

  static {};
    Code:
       0: iconst_0
       1: newarray       int
       3: putstatic     #14                 // Field a:[I
       6: iconst_0
       7: newarray       long
       9: putstatic     #16                 // Field b:[J
      12: iconst_0
      13: anewarray     #4                  // class java/lang/Object
      16: putstatic     #18                 // Field c:[Ljava/lang/Object;
      19: return

  public static int a(int);
    Code:
       0: iload_0
       1: iconst_4
       2: imul
       3: invokestatic  #22                 // Method c:(I)I
       6: iconst_4
       7: idiv
       8: ireturn

  static int a(int[], int, int);
    Code:
       0: iload_1
       1: iconst_1
       2: isub
       3: istore_1
       4: iconst_0
       5: istore_3
       6: iload_3
       7: iload_1
       8: if_icmpgt     55
      11: iload_3
      12: iload_1
      13: iadd
      14: iconst_1
      15: iushr
      16: istore        4
      18: aload_0
      19: iload         4
      21: iaload
      22: istore        5
      24: iload         5
      26: iload_2
      27: if_icmpge     38
      30: iload         4
      32: iconst_1
      33: iadd
      34: istore_3
      35: goto          6
      38: iload         5
      40: iload_2
      41: if_icmple     52
      44: iload         4
      46: iconst_1
      47: isub
      48: istore_1
      49: goto          6
      52: iload         4
      54: ireturn
      55: iload_3
      56: iconst_m1
      57: ixor
      58: ireturn

  static int a(long[], int, long);
    Code:
       0: iload_1
       1: iconst_1
       2: isub
       3: istore_1
       4: iconst_0
       5: istore        4
       7: iload         4
       9: iload_1
      10: if_icmpgt     61
      13: iload         4
      15: iload_1
      16: iadd
      17: iconst_1
      18: iushr
      19: istore        5
      21: aload_0
      22: iload         5
      24: laload
      25: lstore        6
      27: lload         6
      29: lload_2
      30: lcmp
      31: ifge          43
      34: iload         5
      36: iconst_1
      37: iadd
      38: istore        4
      40: goto          7
      43: lload         6
      45: lload_2
      46: lcmp
      47: ifle          58
      50: iload         5
      52: iconst_1
      53: isub
      54: istore_1
      55: goto          7
      58: iload         5
      60: ireturn
      61: iload         4
      63: iconst_m1
      64: ixor
      65: ireturn

  public static boolean a(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpeq     22
       5: aload_0
       6: ifnull        20
       9: aload_0
      10: aload_1
      11: invokevirtual #29                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      14: ifeq          20
      17: goto          22
      20: iconst_0
      21: ireturn
      22: iconst_1
      23: ireturn

  public static int b(int);
    Code:
       0: iload_0
       1: bipush        8
       3: imul
       4: invokestatic  #22                 // Method c:(I)I
       7: bipush        8
       9: idiv
      10: ireturn

  public static int c(int);
    Code:
       0: iconst_4
       1: istore_1
       2: iload_1
       3: bipush        32
       5: if_icmpge     29
       8: iconst_1
       9: iload_1
      10: ishl
      11: bipush        12
      13: isub
      14: istore_2
      15: iload_0
      16: iload_2
      17: if_icmpgt     22
      20: iload_2
      21: ireturn
      22: iload_1
      23: iconst_1
      24: iadd
      25: istore_1
      26: goto          2
      29: iload_0
      30: ireturn
}
