class android.support.design.widget.b$9 implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final int a;

  final android.support.design.widget.b b;

  android.support.design.widget.b$9(android.support.design.widget.b, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Landroid/support/design/widget/b;
       5: aload_0
       6: iload_2
       7: putfield      #21                 // Field a:I
      10: aload_0
      11: invokespecial #23                 // Method java/lang/Object."<init>":()V
      14: aload_0
      15: aload_0
      16: getfield      #21                 // Field a:I
      19: putfield      #25                 // Field c:I
      22: return

  public void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: aload_1
       1: invokevirtual #34                 // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
       4: checkcast     #36                 // class java/lang/Integer
       7: invokevirtual #40                 // Method java/lang/Integer.intValue:()I
      10: istore_2
      11: invokestatic  #44                 // Method android/support/design/widget/b.f:()Z
      14: ifeq          36
      17: aload_0
      18: getfield      #19                 // Field b:Landroid/support/design/widget/b;
      21: getfield      #47                 // Field android/support/design/widget/b.b:Landroid/support/design/widget/b$f;
      24: iload_2
      25: aload_0
      26: getfield      #25                 // Field c:I
      29: isub
      30: invokestatic  #52                 // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
      33: goto          48
      36: aload_0
      37: getfield      #19                 // Field b:Landroid/support/design/widget/b;
      40: getfield      #47                 // Field android/support/design/widget/b.b:Landroid/support/design/widget/b$f;
      43: iload_2
      44: i2f
      45: invokevirtual #58                 // Method android/support/design/widget/b$f.setTranslationY:(F)V
      48: aload_0
      49: iload_2
      50: putfield      #25                 // Field c:I
      53: return
}
