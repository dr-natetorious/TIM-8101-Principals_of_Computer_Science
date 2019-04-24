class android.support.v4.view.x$2 implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final android.support.v4.view.aa a;

  final android.view.View b;

  final android.support.v4.view.x c;

  android.support.v4.view.x$2(android.support.v4.view.x, android.support.v4.view.aa, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field c:Landroid/support/v4/view/x;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/support/v4/view/aa;
      10: aload_0
      11: aload_3
      12: putfield      #24                 // Field b:Landroid/view/View;
      15: aload_0
      16: invokespecial #27                 // Method java/lang/Object."<init>":()V
      19: return

  public void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v4/view/aa;
       4: aload_0
       5: getfield      #24                 // Field b:Landroid/view/View;
       8: invokeinterface #35,  2           // InterfaceMethod android/support/v4/view/aa.a:(Landroid/view/View;)V
      13: return
}
