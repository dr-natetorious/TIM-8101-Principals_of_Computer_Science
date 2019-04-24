class android.support.v7.widget.am$4 extends android.animation.AnimatorListenerAdapter {
  final android.support.v7.widget.RecyclerView$x a;

  final android.view.ViewPropertyAnimator b;

  final android.view.View c;

  final android.support.v7.widget.am d;

  android.support.v7.widget.am$4(android.support.v7.widget.am, android.support.v7.widget.RecyclerView$x, android.view.ViewPropertyAnimator, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field d:Landroid/support/v7/widget/am;
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      10: aload_0
      11: aload_3
      12: putfield      #25                 // Field b:Landroid/view/ViewPropertyAnimator;
      15: aload_0
      16: aload         4
      18: putfield      #27                 // Field c:Landroid/view/View;
      21: aload_0
      22: invokespecial #30                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      25: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/view/ViewPropertyAnimator;
       4: aconst_null
       5: invokevirtual #39                 // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
       8: pop
       9: aload_0
      10: getfield      #27                 // Field c:Landroid/view/View;
      13: fconst_1
      14: invokevirtual #45                 // Method android/view/View.setAlpha:(F)V
      17: aload_0
      18: getfield      #21                 // Field d:Landroid/support/v7/widget/am;
      21: aload_0
      22: getfield      #23                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      25: invokevirtual #48                 // Method android/support/v7/widget/am.i:(Landroid/support/v7/widget/RecyclerView$x;)V
      28: aload_0
      29: getfield      #21                 // Field d:Landroid/support/v7/widget/am;
      32: getfield      #52                 // Field android/support/v7/widget/am.f:Ljava/util/ArrayList;
      35: aload_0
      36: getfield      #23                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      39: invokevirtual #58                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      42: pop
      43: aload_0
      44: getfield      #21                 // Field d:Landroid/support/v7/widget/am;
      47: invokevirtual #60                 // Method android/support/v7/widget/am.c:()V
      50: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #21                 // Field d:Landroid/support/v7/widget/am;
       4: aload_0
       5: getfield      #23                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
       8: invokevirtual #64                 // Method android/support/v7/widget/am.l:(Landroid/support/v7/widget/RecyclerView$x;)V
      11: return
}
