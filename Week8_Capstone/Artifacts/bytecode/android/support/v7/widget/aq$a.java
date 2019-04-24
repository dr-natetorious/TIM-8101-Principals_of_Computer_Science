class android.support.v7.widget.aq$a extends android.animation.AnimatorListenerAdapter {
  final android.support.v7.widget.aq a;

  android.support.v7.widget.aq$a(android.support.v7.widget.aq, android.support.v7.widget.aq$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #23                 // Method "<init>":(Landroid/support/v7/widget/aq;)V
       5: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #19                 // Field b:Z
       5: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Z
       4: ifeq          13
       7: aload_0
       8: iconst_0
       9: putfield      #19                 // Field b:Z
      12: return
      13: aload_0
      14: getfield      #14                 // Field a:Landroid/support/v7/widget/aq;
      17: invokestatic  #29                 // Method android/support/v7/widget/aq.a:(Landroid/support/v7/widget/aq;)Landroid/animation/ValueAnimator;
      20: invokevirtual #35                 // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
      23: checkcast     #37                 // class java/lang/Float
      26: invokevirtual #41                 // Method java/lang/Float.floatValue:()F
      29: fconst_0
      30: fcmpl
      31: ifne          52
      34: aload_0
      35: getfield      #14                 // Field a:Landroid/support/v7/widget/aq;
      38: iconst_0
      39: invokestatic  #44                 // Method android/support/v7/widget/aq.a:(Landroid/support/v7/widget/aq;I)I
      42: pop
      43: aload_0
      44: getfield      #14                 // Field a:Landroid/support/v7/widget/aq;
      47: iconst_0
      48: invokestatic  #47                 // Method android/support/v7/widget/aq.b:(Landroid/support/v7/widget/aq;I)V
      51: return
      52: aload_0
      53: getfield      #14                 // Field a:Landroid/support/v7/widget/aq;
      56: iconst_2
      57: invokestatic  #44                 // Method android/support/v7/widget/aq.a:(Landroid/support/v7/widget/aq;I)I
      60: pop
      61: aload_0
      62: getfield      #14                 // Field a:Landroid/support/v7/widget/aq;
      65: invokestatic  #49                 // Method android/support/v7/widget/aq.b:(Landroid/support/v7/widget/aq;)V
      68: return
}
