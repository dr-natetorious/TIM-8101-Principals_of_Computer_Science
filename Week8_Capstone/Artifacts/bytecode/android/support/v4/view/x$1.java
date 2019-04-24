class android.support.v4.view.x$1 extends android.animation.AnimatorListenerAdapter {
  final android.support.v4.view.y a;

  final android.view.View b;

  final android.support.v4.view.x c;

  android.support.v4.view.x$1(android.support.v4.view.x, android.support.v4.view.y, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field c:Landroid/support/v4/view/x;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field a:Landroid/support/v4/view/y;
      10: aload_0
      11: aload_3
      12: putfield      #22                 // Field b:Landroid/view/View;
      15: aload_0
      16: invokespecial #25                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      19: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/y;
       4: aload_0
       5: getfield      #22                 // Field b:Landroid/view/View;
       8: invokeinterface #33,  2           // InterfaceMethod android/support/v4/view/y.c:(Landroid/view/View;)V
      13: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/y;
       4: aload_0
       5: getfield      #22                 // Field b:Landroid/view/View;
       8: invokeinterface #36,  2           // InterfaceMethod android/support/v4/view/y.b:(Landroid/view/View;)V
      13: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/y;
       4: aload_0
       5: getfield      #22                 // Field b:Landroid/view/View;
       8: invokeinterface #39,  2           // InterfaceMethod android/support/v4/view/y.a:(Landroid/view/View;)V
      13: return
}
