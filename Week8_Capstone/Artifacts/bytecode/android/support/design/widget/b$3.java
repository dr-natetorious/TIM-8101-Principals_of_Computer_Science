class android.support.design.widget.b$3 implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final android.support.design.widget.b a;

  android.support.design.widget.b$3(android.support.design.widget.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/design/widget/b;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: iconst_0
      11: putfield      #24                 // Field b:I
      14: return

  public void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: aload_1
       1: invokevirtual #33                 // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
       4: checkcast     #35                 // class java/lang/Integer
       7: invokevirtual #39                 // Method java/lang/Integer.intValue:()I
      10: istore_2
      11: invokestatic  #43                 // Method android/support/design/widget/b.f:()Z
      14: ifeq          36
      17: aload_0
      18: getfield      #19                 // Field a:Landroid/support/design/widget/b;
      21: getfield      #46                 // Field android/support/design/widget/b.b:Landroid/support/design/widget/b$f;
      24: iload_2
      25: aload_0
      26: getfield      #24                 // Field b:I
      29: isub
      30: invokestatic  #51                 // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
      33: goto          48
      36: aload_0
      37: getfield      #19                 // Field a:Landroid/support/design/widget/b;
      40: getfield      #46                 // Field android/support/design/widget/b.b:Landroid/support/design/widget/b$f;
      43: iload_2
      44: i2f
      45: invokevirtual #57                 // Method android/support/design/widget/b$f.setTranslationY:(F)V
      48: aload_0
      49: iload_2
      50: putfield      #24                 // Field b:I
      53: return
}
