final class android.support.v7.c.a.c {
  static final boolean a;

  static {};
    Code:
       0: return

  public static int a(int);
    Code:
       0: iload_0
       1: iconst_4
       2: if_icmpgt     8
       5: bipush        8
       7: ireturn
       8: iload_0
       9: iconst_2
      10: imul
      11: ireturn

  public static int[] a(int[], int, int);
    Code:
       0: getstatic     #17                 // Field a:Z
       3: ifne          20
       6: iload_1
       7: aload_0
       8: arraylength
       9: if_icmple     20
      12: new           #19                 // class java/lang/AssertionError
      15: dup
      16: invokespecial #20                 // Method java/lang/AssertionError."<init>":()V
      19: athrow
      20: aload_0
      21: astore_3
      22: iload_1
      23: iconst_1
      24: iadd
      25: aload_0
      26: arraylength
      27: if_icmple     45
      30: iload_1
      31: invokestatic  #22                 // Method a:(I)I
      34: newarray       int
      36: astore_3
      37: aload_0
      38: iconst_0
      39: aload_3
      40: iconst_0
      41: iload_1
      42: invokestatic  #28                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      45: aload_3
      46: iload_1
      47: iload_2
      48: iastore
      49: aload_3
      50: areturn

  public static <T> T[] a(T[], int, T);
    Code:
       0: getstatic     #17                 // Field a:Z
       3: ifne          20
       6: iload_1
       7: aload_0
       8: arraylength
       9: if_icmple     20
      12: new           #19                 // class java/lang/AssertionError
      15: dup
      16: invokespecial #20                 // Method java/lang/AssertionError."<init>":()V
      19: athrow
      20: aload_0
      21: astore_3
      22: iload_1
      23: iconst_1
      24: iadd
      25: aload_0
      26: arraylength
      27: if_icmple     56
      30: aload_0
      31: invokevirtual #33                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      34: invokevirtual #38                 // Method java/lang/Class.getComponentType:()Ljava/lang/Class;
      37: iload_1
      38: invokestatic  #22                 // Method a:(I)I
      41: invokestatic  #44                 // Method java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
      44: checkcast     #46                 // class "[Ljava/lang/Object;"
      47: astore_3
      48: aload_0
      49: iconst_0
      50: aload_3
      51: iconst_0
      52: iload_1
      53: invokestatic  #28                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      56: aload_3
      57: iload_1
      58: aload_2
      59: aastore
      60: aload_3
      61: areturn
}
