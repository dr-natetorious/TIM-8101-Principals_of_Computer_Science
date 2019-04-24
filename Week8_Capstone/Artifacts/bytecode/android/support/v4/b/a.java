public final class android.support.v4.b.a {
  static {};
    Code:
       0: new           #11                 // class java/lang/ThreadLocal
       3: dup
       4: invokespecial #14                 // Method java/lang/ThreadLocal."<init>":()V
       7: putstatic     #16                 // Field a:Ljava/lang/ThreadLocal;
      10: return

  public static int a(int, int);
    Code:
       0: iload_1
       1: invokestatic  #24                 // Method android/graphics/Color.alpha:(I)I
       4: istore_2
       5: iload_0
       6: invokestatic  #24                 // Method android/graphics/Color.alpha:(I)I
       9: istore_3
      10: iload_3
      11: iload_2
      12: invokestatic  #27                 // Method c:(II)I
      15: istore        4
      17: iload         4
      19: iload_0
      20: invokestatic  #30                 // Method android/graphics/Color.red:(I)I
      23: iload_3
      24: iload_1
      25: invokestatic  #30                 // Method android/graphics/Color.red:(I)I
      28: iload_2
      29: iload         4
      31: invokestatic  #33                 // Method a:(IIIII)I
      34: iload_0
      35: invokestatic  #36                 // Method android/graphics/Color.green:(I)I
      38: iload_3
      39: iload_1
      40: invokestatic  #36                 // Method android/graphics/Color.green:(I)I
      43: iload_2
      44: iload         4
      46: invokestatic  #33                 // Method a:(IIIII)I
      49: iload_0
      50: invokestatic  #39                 // Method android/graphics/Color.blue:(I)I
      53: iload_3
      54: iload_1
      55: invokestatic  #39                 // Method android/graphics/Color.blue:(I)I
      58: iload_2
      59: iload         4
      61: invokestatic  #33                 // Method a:(IIIII)I
      64: invokestatic  #43                 // Method android/graphics/Color.argb:(IIII)I
      67: ireturn

  public static int b(int, int);
    Code:
       0: iload_1
       1: iflt          24
       4: iload_1
       5: sipush        255
       8: if_icmple     14
      11: goto          24
      14: iload_0
      15: ldc           #45                 // int 16777215
      17: iand
      18: iload_1
      19: bipush        24
      21: ishl
      22: ior
      23: ireturn
      24: new           #47                 // class java/lang/IllegalArgumentException
      27: dup
      28: ldc           #49                 // String alpha must be between 0 and 255.
      30: invokespecial #52                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      33: athrow
}
