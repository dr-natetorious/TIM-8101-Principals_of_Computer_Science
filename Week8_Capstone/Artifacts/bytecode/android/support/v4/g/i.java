public class android.support.v4.g.i {
  public static boolean a(java.lang.Object, java.lang.Object);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokestatic  #17                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      13: ireturn
      14: aload_0
      15: aload_1
      16: if_acmpeq     36
      19: aload_0
      20: ifnull        34
      23: aload_0
      24: aload_1
      25: invokevirtual #20                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      28: ifeq          34
      31: goto          36
      34: iconst_0
      35: ireturn
      36: iconst_1
      37: ireturn
}
