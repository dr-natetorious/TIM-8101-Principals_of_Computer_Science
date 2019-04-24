public final class android.support.v4.view.e {
  public static int a(int, int);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        17
       5: if_icmplt     14
       8: iload_0
       9: iload_1
      10: invokestatic  #17                 // Method android/view/Gravity.getAbsoluteGravity:(II)I
      13: ireturn
      14: iload_0
      15: ldc           #18                 // int -8388609
      17: iand
      18: ireturn

  public static void a(int, int, int, android.graphics.Rect, android.graphics.Rect, int);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        17
       5: if_icmplt     20
       8: iload_0
       9: iload_1
      10: iload_2
      11: aload_3
      12: aload         4
      14: iload         5
      16: invokestatic  #23                 // Method android/view/Gravity.apply:(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
      19: return
      20: iload_0
      21: iload_1
      22: iload_2
      23: aload_3
      24: aload         4
      26: invokestatic  #26                 // Method android/view/Gravity.apply:(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V
      29: return
}
