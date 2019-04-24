class android.support.v7.widget.aq$b implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final android.support.v7.widget.aq a;

  android.support.v7.widget.aq$b(android.support.v7.widget.aq, android.support.v7.widget.aq$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #22                 // Method "<init>":(Landroid/support/v7/widget/aq;)V
       5: return

  public void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: aload_1
       1: invokevirtual #30                 // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
       4: checkcast     #32                 // class java/lang/Float
       7: invokevirtual #36                 // Method java/lang/Float.floatValue:()F
      10: ldc           #37                 // float 255.0f
      12: fmul
      13: f2i
      14: istore_2
      15: aload_0
      16: getfield      #15                 // Field a:Landroid/support/v7/widget/aq;
      19: invokestatic  #41                 // Method android/support/v7/widget/aq.c:(Landroid/support/v7/widget/aq;)Landroid/graphics/drawable/StateListDrawable;
      22: iload_2
      23: invokevirtual #47                 // Method android/graphics/drawable/StateListDrawable.setAlpha:(I)V
      26: aload_0
      27: getfield      #15                 // Field a:Landroid/support/v7/widget/aq;
      30: invokestatic  #51                 // Method android/support/v7/widget/aq.d:(Landroid/support/v7/widget/aq;)Landroid/graphics/drawable/Drawable;
      33: iload_2
      34: invokevirtual #54                 // Method android/graphics/drawable/Drawable.setAlpha:(I)V
      37: aload_0
      38: getfield      #15                 // Field a:Landroid/support/v7/widget/aq;
      41: invokestatic  #56                 // Method android/support/v7/widget/aq.b:(Landroid/support/v7/widget/aq;)V
      44: return
}
