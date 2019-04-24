class android.support.v4.view.d$c implements android.support.v4.view.d$a {
  android.support.v4.view.d$c(android.content.Context, android.view.GestureDetector$OnGestureListener, android.os.Handler);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #18                 // class android/view/GestureDetector
       8: dup
       9: aload_1
      10: aload_2
      11: aload_3
      12: invokespecial #20                 // Method android/view/GestureDetector."<init>":(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
      15: putfield      #22                 // Field a:Landroid/view/GestureDetector;
      18: return

  public boolean a(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/view/GestureDetector;
       4: aload_1
       5: invokevirtual #27                 // Method android/view/GestureDetector.onTouchEvent:(Landroid/view/MotionEvent;)Z
       8: ireturn
}
