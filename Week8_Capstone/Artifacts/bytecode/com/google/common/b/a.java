public final class com.google.common.b.a {
  public static int a(long);
    Code:
       0: lload_0
       1: ldc2_w        #7                  // long 2147483647l
       4: lcmp
       5: ifle          11
       8: ldc           #9                  // int 2147483647
      10: ireturn
      11: lload_0
      12: ldc2_w        #10                 // long -2147483648l
      15: lcmp
      16: ifge          22
      19: ldc           #12                 // int -2147483648
      21: ireturn
      22: lload_0
      23: l2i
      24: ireturn
}
