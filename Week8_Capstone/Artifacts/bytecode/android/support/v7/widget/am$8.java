class android.support.v7.widget.am$8 extends android.animation.AnimatorListenerAdapter {
  final android.support.v7.widget.am$a a;

  final android.view.ViewPropertyAnimator b;

  final android.view.View c;

  final android.support.v7.widget.am d;

  android.support.v7.widget.am$8(android.support.v7.widget.am, android.support.v7.widget.am$a, android.view.ViewPropertyAnimator, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field d:Landroid/support/v7/widget/am;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/support/v7/widget/am$a;
      10: aload_0
      11: aload_3
      12: putfield      #24                 // Field b:Landroid/view/ViewPropertyAnimator;
      15: aload_0
      16: aload         4
      18: putfield      #26                 // Field c:Landroid/view/View;
      21: aload_0
      22: invokespecial #29                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      25: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Landroid/view/ViewPropertyAnimator;
       4: aconst_null
       5: invokevirtual #38                 // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
       8: pop
       9: aload_0
      10: getfield      #26                 // Field c:Landroid/view/View;
      13: fconst_1
      14: invokevirtual #44                 // Method android/view/View.setAlpha:(F)V
      17: aload_0
      18: getfield      #26                 // Field c:Landroid/view/View;
      21: fconst_0
      22: invokevirtual #47                 // Method android/view/View.setTranslationX:(F)V
      25: aload_0
      26: getfield      #26                 // Field c:Landroid/view/View;
      29: fconst_0
      30: invokevirtual #50                 // Method android/view/View.setTranslationY:(F)V
      33: aload_0
      34: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
      37: aload_0
      38: getfield      #22                 // Field a:Landroid/support/v7/widget/am$a;
      41: getfield      #55                 // Field android/support/v7/widget/am$a.b:Landroid/support/v7/widget/RecyclerView$x;
      44: iconst_0
      45: invokevirtual #58                 // Method android/support/v7/widget/am.a:(Landroid/support/v7/widget/RecyclerView$x;Z)V
      48: aload_0
      49: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
      52: getfield      #62                 // Field android/support/v7/widget/am.g:Ljava/util/ArrayList;
      55: aload_0
      56: getfield      #22                 // Field a:Landroid/support/v7/widget/am$a;
      59: getfield      #55                 // Field android/support/v7/widget/am$a.b:Landroid/support/v7/widget/RecyclerView$x;
      62: invokevirtual #68                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      65: pop
      66: aload_0
      67: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
      70: invokevirtual #70                 // Method android/support/v7/widget/am.c:()V
      73: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #20                 // Field d:Landroid/support/v7/widget/am;
       4: aload_0
       5: getfield      #22                 // Field a:Landroid/support/v7/widget/am$a;
       8: getfield      #55                 // Field android/support/v7/widget/am$a.b:Landroid/support/v7/widget/RecyclerView$x;
      11: iconst_0
      12: invokevirtual #73                 // Method android/support/v7/widget/am.b:(Landroid/support/v7/widget/RecyclerView$x;Z)V
      15: return
}
