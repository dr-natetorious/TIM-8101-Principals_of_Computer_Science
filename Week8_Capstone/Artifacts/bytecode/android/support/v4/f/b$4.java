final class android.support.v4.f.b$4 implements java.util.Comparator<byte[]> {
  android.support.v4.f.b$4();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public int a(byte[], byte[]);
    Code:
       0: aload_1
       1: arraylength
       2: aload_2
       3: arraylength
       4: if_icmpeq     19
       7: aload_1
       8: arraylength
       9: istore_3
      10: aload_2
      11: arraylength
      12: istore        4
      14: iload_3
      15: iload         4
      17: isub
      18: ireturn
      19: iconst_0
      20: istore_3
      21: iload_3
      22: aload_1
      23: arraylength
      24: if_icmpge     63
      27: aload_1
      28: iload_3
      29: baload
      30: aload_2
      31: iload_3
      32: baload
      33: if_icmpeq     56
      36: aload_1
      37: iload_3
      38: baload
      39: istore        4
      41: aload_2
      42: iload_3
      43: baload
      44: istore        5
      46: iload         4
      48: istore_3
      49: iload         5
      51: istore        4
      53: goto          14
      56: iload_3
      57: iconst_1
      58: iadd
      59: istore_3
      60: goto          21
      63: iconst_0
      64: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #20                 // class "[B"
       5: aload_2
       6: checkcast     #20                 // class "[B"
       9: invokevirtual #22                 // Method a:([B[B)I
      12: ireturn
}
