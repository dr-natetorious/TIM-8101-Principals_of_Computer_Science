class android.support.design.widget.e$2 extends android.animation.AnimatorListenerAdapter {
  final boolean a;

  final android.support.design.widget.e$c b;

  final android.support.design.widget.e c;

  android.support.design.widget.e$2(android.support.design.widget.e, boolean, android.support.design.widget.e$c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field c:Landroid/support/design/widget/e;
       5: aload_0
       6: iload_2
       7: putfield      #20                 // Field a:Z
      10: aload_0
      11: aload_3
      12: putfield      #22                 // Field b:Landroid/support/design/widget/e$c;
      15: aload_0
      16: invokespecial #25                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      19: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #18                 // Field c:Landroid/support/design/widget/e;
       4: iconst_0
       5: putfield      #31                 // Field android/support/design/widget/e.b:I
       8: aload_0
       9: getfield      #22                 // Field b:Landroid/support/design/widget/e$c;
      12: ifnull        24
      15: aload_0
      16: getfield      #22                 // Field b:Landroid/support/design/widget/e$c;
      19: invokeinterface #35,  1           // InterfaceMethod android/support/design/widget/e$c.a:()V
      24: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #18                 // Field c:Landroid/support/design/widget/e;
       4: getfield      #40                 // Field android/support/design/widget/e.n:Landroid/support/design/widget/r;
       7: iconst_0
       8: aload_0
       9: getfield      #20                 // Field a:Z
      12: invokevirtual #45                 // Method android/support/design/widget/r.a:(IZ)V
      15: return
}
