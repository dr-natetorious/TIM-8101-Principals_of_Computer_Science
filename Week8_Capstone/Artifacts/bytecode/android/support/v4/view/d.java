public final class android.support.v4.view.d {
  public android.support.v4.view.d(android.content.Context, android.view.GestureDetector$OnGestureListener);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aconst_null
       4: invokespecial #21                 // Method "<init>":(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
       7: return

  public android.support.v4.view.d(android.content.Context, android.view.GestureDetector$OnGestureListener, android.os.Handler);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: getstatic     #31                 // Field android/os/Build$VERSION.SDK_INT:I
       7: bipush        17
       9: if_icmple     29
      12: new           #14                 // class android/support/v4/view/d$c
      15: dup
      16: aload_1
      17: aload_2
      18: aload_3
      19: invokespecial #32                 // Method android/support/v4/view/d$c."<init>":(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
      22: astore_1
      23: aload_0
      24: aload_1
      25: putfield      #34                 // Field a:Landroid/support/v4/view/d$a;
      28: return
      29: new           #9                  // class android/support/v4/view/d$b
      32: dup
      33: aload_1
      34: aload_2
      35: aload_3
      36: invokespecial #35                 // Method android/support/v4/view/d$b."<init>":(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
      39: astore_1
      40: goto          23

  public boolean a(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Landroid/support/v4/view/d$a;
       4: aload_1
       5: invokeinterface #38,  2           // InterfaceMethod android/support/v4/view/d$a.a:(Landroid/view/MotionEvent;)Z
      10: ireturn
}
