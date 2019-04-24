class de.blox.graphview.g$a extends android.view.GestureDetector$SimpleOnGestureListener {
  final de.blox.graphview.g a;

  de.blox.graphview.g$a(de.blox.graphview.g, de.blox.graphview.g$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #19                 // Method "<init>":(Lde/blox/graphview/g;)V
       5: return

  public boolean onDown(android.view.MotionEvent);
    Code:
       0: iconst_1
       1: ireturn

  public void onLongPress(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lde/blox/graphview/g;
       4: aload_1
       5: invokevirtual #29                 // Method android/view/MotionEvent.getX:()F
       8: f2i
       9: aload_1
      10: invokevirtual #32                 // Method android/view/MotionEvent.getY:()F
      13: f2i
      14: invokestatic  #36                 // Method de/blox/graphview/g.b:(Lde/blox/graphview/g;II)V
      17: return

  public boolean onSingleTapUp(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lde/blox/graphview/g;
       4: aload_1
       5: invokevirtual #29                 // Method android/view/MotionEvent.getX:()F
       8: f2i
       9: aload_1
      10: invokevirtual #32                 // Method android/view/MotionEvent.getY:()F
      13: f2i
      14: invokestatic  #39                 // Method de/blox/graphview/g.a:(Lde/blox/graphview/g;II)V
      17: iconst_1
      18: ireturn
}
