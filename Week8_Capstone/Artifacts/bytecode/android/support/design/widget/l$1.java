class android.support.design.widget.l$1 extends android.animation.AnimatorListenerAdapter {
  final android.support.design.widget.l a;

  android.support.design.widget.l$1(android.support.design.widget.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/design/widget/l;
       5: aload_0
       6: invokespecial #15                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
       9: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/design/widget/l;
       4: getfield      #21                 // Field android/support/design/widget/l.a:Landroid/animation/ValueAnimator;
       7: aload_1
       8: if_acmpne     19
      11: aload_0
      12: getfield      #12                 // Field a:Landroid/support/design/widget/l;
      15: aconst_null
      16: putfield      #21                 // Field android/support/design/widget/l.a:Landroid/animation/ValueAnimator;
      19: return
}
