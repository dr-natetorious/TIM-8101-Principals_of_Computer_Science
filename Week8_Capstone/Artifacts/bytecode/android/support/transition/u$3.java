class android.support.transition.u$3 extends android.animation.AnimatorListenerAdapter {
  final android.support.transition.u a;

  android.support.transition.u$3(android.support.transition.u);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/transition/u;
       5: aload_0
       6: invokespecial #17                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
       9: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/transition/u;
       4: invokevirtual #22                 // Method android/support/transition/u.k:()V
       7: aload_1
       8: aload_0
       9: invokevirtual #28                 // Method android/animation/Animator.removeListener:(Landroid/animation/Animator$AnimatorListener;)V
      12: return
}
