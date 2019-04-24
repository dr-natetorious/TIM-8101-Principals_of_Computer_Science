abstract class android.support.design.widget.e$e extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final android.support.design.widget.e b;

  android.support.design.widget.e$e(android.support.design.widget.e, android.support.design.widget.e$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #27                 // Method "<init>":(Landroid/support/design/widget/e;)V
       5: return

  protected abstract float a();

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Landroid/support/design/widget/e;
       4: getfield      #33                 // Field android/support/design/widget/e.c:Landroid/support/design/widget/i;
       7: aload_0
       8: getfield      #35                 // Field d:F
      11: invokevirtual #40                 // Method android/support/design/widget/i.b:(F)V
      14: aload_0
      15: iconst_0
      16: putfield      #42                 // Field a:Z
      19: return

  public void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: aload_0
       1: getfield      #42                 // Field a:Z
       4: ifne          34
       7: aload_0
       8: aload_0
       9: getfield      #20                 // Field b:Landroid/support/design/widget/e;
      12: getfield      #33                 // Field android/support/design/widget/e.c:Landroid/support/design/widget/i;
      15: invokevirtual #46                 // Method android/support/design/widget/i.a:()F
      18: putfield      #48                 // Field c:F
      21: aload_0
      22: aload_0
      23: invokevirtual #49                 // Method a:()F
      26: putfield      #35                 // Field d:F
      29: aload_0
      30: iconst_1
      31: putfield      #42                 // Field a:Z
      34: aload_0
      35: getfield      #20                 // Field b:Landroid/support/design/widget/e;
      38: getfield      #33                 // Field android/support/design/widget/e.c:Landroid/support/design/widget/i;
      41: aload_0
      42: getfield      #48                 // Field c:F
      45: aload_0
      46: getfield      #35                 // Field d:F
      49: aload_0
      50: getfield      #48                 // Field c:F
      53: fsub
      54: aload_1
      55: invokevirtual #54                 // Method android/animation/ValueAnimator.getAnimatedFraction:()F
      58: fmul
      59: fadd
      60: invokevirtual #40                 // Method android/support/design/widget/i.b:(F)V
      63: return
}
