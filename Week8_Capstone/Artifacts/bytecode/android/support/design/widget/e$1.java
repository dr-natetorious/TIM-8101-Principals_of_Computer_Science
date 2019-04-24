class android.support.design.widget.e$1 extends android.animation.AnimatorListenerAdapter {
  final boolean a;

  final android.support.design.widget.e$c b;

  final android.support.design.widget.e c;

  android.support.design.widget.e$1(android.support.design.widget.e, boolean, android.support.design.widget.e$c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field c:Landroid/support/design/widget/e;
       5: aload_0
       6: iload_2
       7: putfield      #21                 // Field a:Z
      10: aload_0
      11: aload_3
      12: putfield      #23                 // Field b:Landroid/support/design/widget/e$c;
      15: aload_0
      16: invokespecial #26                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      19: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #31                 // Field d:Z
       5: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #19                 // Field c:Landroid/support/design/widget/e;
       4: iconst_0
       5: putfield      #35                 // Field android/support/design/widget/e.b:I
       8: aload_0
       9: getfield      #31                 // Field d:Z
      12: ifne          63
      15: aload_0
      16: getfield      #19                 // Field c:Landroid/support/design/widget/e;
      19: getfield      #39                 // Field android/support/design/widget/e.n:Landroid/support/design/widget/r;
      22: astore_1
      23: aload_0
      24: getfield      #21                 // Field a:Z
      27: ifeq          36
      30: bipush        8
      32: istore_2
      33: goto          38
      36: iconst_4
      37: istore_2
      38: aload_1
      39: iload_2
      40: aload_0
      41: getfield      #21                 // Field a:Z
      44: invokevirtual #44                 // Method android/support/design/widget/r.a:(IZ)V
      47: aload_0
      48: getfield      #23                 // Field b:Landroid/support/design/widget/e$c;
      51: ifnull        63
      54: aload_0
      55: getfield      #23                 // Field b:Landroid/support/design/widget/e$c;
      58: invokeinterface #48,  1           // InterfaceMethod android/support/design/widget/e$c.b:()V
      63: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #19                 // Field c:Landroid/support/design/widget/e;
       4: getfield      #39                 // Field android/support/design/widget/e.n:Landroid/support/design/widget/r;
       7: iconst_0
       8: aload_0
       9: getfield      #21                 // Field a:Z
      12: invokevirtual #44                 // Method android/support/design/widget/r.a:(IZ)V
      15: aload_0
      16: iconst_0
      17: putfield      #31                 // Field d:Z
      20: return
}
