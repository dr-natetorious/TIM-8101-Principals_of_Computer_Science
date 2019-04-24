public final class android.support.v4.view.i {
  public static boolean a(android.view.MotionEvent, int);
    Code:
       0: aload_0
       1: invokevirtual #12                 // Method android/view/MotionEvent.getSource:()I
       4: iload_1
       5: iand
       6: iload_1
       7: if_icmpne     12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn
}
