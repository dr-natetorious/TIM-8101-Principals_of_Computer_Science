public class android.support.v4.b.b {
  public static android.graphics.Path a(java.lang.String);
    Code:
       0: new           #27                 // class android/graphics/Path
       3: dup
       4: invokespecial #31                 // Method android/graphics/Path."<init>":()V
       7: astore_1
       8: aload_0
       9: invokestatic  #34                 // Method b:(Ljava/lang/String;)[Landroid/support/v4/b/b$b;
      12: astore_2
      13: aload_2
      14: ifnull        59
      17: aload_2
      18: aload_1
      19: invokestatic  #37                 // Method android/support/v4/b/b$b.a:([Landroid/support/v4/b/b$b;Landroid/graphics/Path;)V
      22: aload_1
      23: areturn
      24: astore_1
      25: new           #39                 // class java/lang/StringBuilder
      28: dup
      29: invokespecial #40                 // Method java/lang/StringBuilder."<init>":()V
      32: astore_2
      33: aload_2
      34: ldc           #42                 // String Error in parsing
      36: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_2
      41: aload_0
      42: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      45: pop
      46: new           #25                 // class java/lang/RuntimeException
      49: dup
      50: aload_2
      51: invokevirtual #50                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      54: aload_1
      55: invokespecial #53                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
      58: athrow
      59: aconst_null
      60: areturn
    Exception table:
       from    to  target type
          17    22    24   Class java/lang/RuntimeException

  public static boolean a(android.support.v4.b.b$b[], android.support.v4.b.b$b[]);
    Code:
       0: aload_0
       1: ifnull        72
       4: aload_1
       5: ifnonnull     10
       8: iconst_0
       9: ireturn
      10: aload_0
      11: arraylength
      12: aload_1
      13: arraylength
      14: if_icmpeq     19
      17: iconst_0
      18: ireturn
      19: iconst_0
      20: istore_2
      21: iload_2
      22: aload_0
      23: arraylength
      24: if_icmpge     70
      27: aload_0
      28: iload_2
      29: aaload
      30: getfield      #76                 // Field android/support/v4/b/b$b.a:C
      33: aload_1
      34: iload_2
      35: aaload
      36: getfield      #76                 // Field android/support/v4/b/b$b.a:C
      39: if_icmpne     68
      42: aload_0
      43: iload_2
      44: aaload
      45: getfield      #79                 // Field android/support/v4/b/b$b.b:[F
      48: arraylength
      49: aload_1
      50: iload_2
      51: aaload
      52: getfield      #79                 // Field android/support/v4/b/b$b.b:[F
      55: arraylength
      56: if_icmpeq     61
      59: iconst_0
      60: ireturn
      61: iload_2
      62: iconst_1
      63: iadd
      64: istore_2
      65: goto          21
      68: iconst_0
      69: ireturn
      70: iconst_1
      71: ireturn
      72: iconst_0
      73: ireturn

  static float[] a(float[], int, int);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmple     13
       5: new           #82                 // class java/lang/IllegalArgumentException
       8: dup
       9: invokespecial #83                 // Method java/lang/IllegalArgumentException."<init>":()V
      12: athrow
      13: aload_0
      14: arraylength
      15: istore_3
      16: iload_1
      17: iflt          57
      20: iload_1
      21: iload_3
      22: if_icmple     28
      25: goto          57
      28: iload_2
      29: iload_1
      30: isub
      31: istore_2
      32: iload_2
      33: iload_3
      34: iload_1
      35: isub
      36: invokestatic  #89                 // Method java/lang/Math.min:(II)I
      39: istore_3
      40: iload_2
      41: newarray       float
      43: astore        4
      45: aload_0
      46: iload_1
      47: aload         4
      49: iconst_0
      50: iload_3
      51: invokestatic  #95                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      54: aload         4
      56: areturn
      57: new           #97                 // class java/lang/ArrayIndexOutOfBoundsException
      60: dup
      61: invokespecial #98                 // Method java/lang/ArrayIndexOutOfBoundsException."<init>":()V
      64: athrow

  public static android.support.v4.b.b$b[] a(android.support.v4.b.b$b[]);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: aload_0
       7: arraylength
       8: anewarray     #9                  // class android/support/v4/b/b$b
      11: astore_2
      12: iconst_0
      13: istore_1
      14: iload_1
      15: aload_0
      16: arraylength
      17: if_icmpge     40
      20: aload_2
      21: iload_1
      22: new           #9                  // class android/support/v4/b/b$b
      25: dup
      26: aload_0
      27: iload_1
      28: aaload
      29: invokespecial #102                // Method android/support/v4/b/b$b."<init>":(Landroid/support/v4/b/b$b;)V
      32: aastore
      33: iload_1
      34: iconst_1
      35: iadd
      36: istore_1
      37: goto          14
      40: aload_2
      41: areturn

  public static void b(android.support.v4.b.b$b[], android.support.v4.b.b$b[]);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_1
       4: arraylength
       5: if_icmpge     63
       8: aload_0
       9: iload_2
      10: aaload
      11: aload_1
      12: iload_2
      13: aaload
      14: getfield      #76                 // Field android/support/v4/b/b$b.a:C
      17: putfield      #76                 // Field android/support/v4/b/b$b.a:C
      20: iconst_0
      21: istore_3
      22: iload_3
      23: aload_1
      24: iload_2
      25: aaload
      26: getfield      #79                 // Field android/support/v4/b/b$b.b:[F
      29: arraylength
      30: if_icmpge     56
      33: aload_0
      34: iload_2
      35: aaload
      36: getfield      #79                 // Field android/support/v4/b/b$b.b:[F
      39: iload_3
      40: aload_1
      41: iload_2
      42: aaload
      43: getfield      #79                 // Field android/support/v4/b/b$b.b:[F
      46: iload_3
      47: faload
      48: fastore
      49: iload_3
      50: iconst_1
      51: iadd
      52: istore_3
      53: goto          22
      56: iload_2
      57: iconst_1
      58: iadd
      59: istore_2
      60: goto          2
      63: return

  public static android.support.v4.b.b$b[] b(java.lang.String);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: new           #66                 // class java/util/ArrayList
       9: dup
      10: invokespecial #104                // Method java/util/ArrayList."<init>":()V
      13: astore_3
      14: iconst_1
      15: istore_2
      16: iconst_0
      17: istore_1
      18: iload_2
      19: aload_0
      20: invokevirtual #17                 // Method java/lang/String.length:()I
      23: if_icmpge     79
      26: aload_0
      27: iload_2
      28: invokestatic  #106                // Method a:(Ljava/lang/String;I)I
      31: istore_2
      32: aload_0
      33: iload_1
      34: iload_2
      35: invokevirtual #110                // Method java/lang/String.substring:(II)Ljava/lang/String;
      38: invokevirtual #113                // Method java/lang/String.trim:()Ljava/lang/String;
      41: astore        4
      43: aload         4
      45: invokevirtual #17                 // Method java/lang/String.length:()I
      48: ifle          70
      51: aload         4
      53: invokestatic  #117                // Method c:(Ljava/lang/String;)[F
      56: astore        5
      58: aload_3
      59: aload         4
      61: iconst_0
      62: invokevirtual #21                 // Method java/lang/String.charAt:(I)C
      65: aload         5
      67: invokestatic  #119                // Method a:(Ljava/util/ArrayList;C[F)V
      70: iload_2
      71: istore_1
      72: iload_2
      73: iconst_1
      74: iadd
      75: istore_2
      76: goto          18
      79: iload_2
      80: iload_1
      81: isub
      82: iconst_1
      83: if_icmpne     106
      86: iload_1
      87: aload_0
      88: invokevirtual #17                 // Method java/lang/String.length:()I
      91: if_icmpge     106
      94: aload_3
      95: aload_0
      96: iload_1
      97: invokevirtual #21                 // Method java/lang/String.charAt:(I)C
     100: iconst_0
     101: newarray       float
     103: invokestatic  #119                // Method a:(Ljava/util/ArrayList;C[F)V
     106: aload_3
     107: aload_3
     108: invokevirtual #122                // Method java/util/ArrayList.size:()I
     111: anewarray     #9                  // class android/support/v4/b/b$b
     114: invokevirtual #126                // Method java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
     117: checkcast     #128                // class "[Landroid/support/v4/b/b$b;"
     120: areturn
}
