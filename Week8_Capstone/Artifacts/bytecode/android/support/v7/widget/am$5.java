class android.support.v7.widget.am$5 extends android.animation.AnimatorListenerAdapter {
  final android.support.v7.widget.RecyclerView$x a;

  final android.view.View b;

  final android.view.ViewPropertyAnimator c;

  final android.support.v7.widget.am d;

  android.support.v7.widget.am$5(android.support.v7.widget.am, android.support.v7.widget.RecyclerView$x, android.view.View, android.view.ViewPropertyAnimator);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field d:Landroid/support/v7/widget/am;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      10: aload_0
      11: aload_3
      12: putfield      #24                 // Field b:Landroid/view/View;
      15: aload_0
      16: aload         4
      18: putfield      #26                 // Field c:Landroid/view/ViewPropertyAnimator;
      21: aload_0
      22: invokespecial #29                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      25: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Landroid/view/View;
       4: fconst_1
       5: invokevirtual #38                 // Method android/view/View.setAlpha:(F)V
       8: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #26                 // Field c:Landroid/view/ViewPropertyAnimator;
       4: aconst_null
       5: invokevirtual #45                 // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
       8: pop
       9: aload_0
      10: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
      13: aload_0
      14: getfield      #22                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      17: invokevirtual #48                 // Method android/support/v7/widget/am.k:(Landroid/support/v7/widget/RecyclerView$x;)V
      20: aload_0
      21: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
      24: getfield      #51                 // Field android/support/v7/widget/am.d:Ljava/util/ArrayList;
      27: aload_0
      28: getfield      #22                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      31: invokevirtual #57                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      34: pop
      35: aload_0
      36: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
      39: invokevirtual #59                 // Method android/support/v7/widget/am.c:()V
      42: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
       4: aload_0
       5: getfield      #22                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
       8: invokevirtual #63                 // Method android/support/v7/widget/am.n:(Landroid/support/v7/widget/RecyclerView$x;)V
      11: return
}
