public final class com.google.common.base.Objects extends com.google.common.base.ExtraObjectsMethodsForWeb {
  public static boolean equal(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpeq     22
       5: aload_0
       6: ifnull        20
       9: aload_0
      10: aload_1
      11: invokevirtual #17                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      14: ifeq          20
      17: goto          22
      20: iconst_0
      21: ireturn
      22: iconst_1
      23: ireturn

  public static int hashCode(java.lang.Object...);
    Code:
       0: aload_0
       1: invokestatic  #23                 // Method java/util/Arrays.hashCode:([Ljava/lang/Object;)I
       4: ireturn
}
