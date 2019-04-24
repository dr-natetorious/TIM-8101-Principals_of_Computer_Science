class android.support.design.widget.b$2 extends android.animation.AnimatorListenerAdapter {
  final int a;

  final android.support.design.widget.b b;

  android.support.design.widget.b$2(android.support.design.widget.b, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field b:Landroid/support/design/widget/b;
       5: aload_0
       6: iload_2
       7: putfield      #19                 // Field a:I
      10: aload_0
      11: invokespecial #22                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      14: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/support/design/widget/b;
       4: aload_0
       5: getfield      #19                 // Field a:I
       8: invokevirtual #28                 // Method android/support/design/widget/b.c:(I)V
      11: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/support/design/widget/b;
       4: invokestatic  #32                 // Method android/support/design/widget/b.a:(Landroid/support/design/widget/b;)Landroid/support/design/widget/b$c;
       7: iconst_0
       8: sipush        180
      11: invokeinterface #37,  3           // InterfaceMethod android/support/design/widget/b$c.b:(II)V
      16: return
}
