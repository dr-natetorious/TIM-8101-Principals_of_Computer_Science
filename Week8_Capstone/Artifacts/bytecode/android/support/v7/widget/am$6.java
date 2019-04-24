class android.support.v7.widget.am$6 extends android.animation.AnimatorListenerAdapter {
  final android.support.v7.widget.RecyclerView$x a;

  final int b;

  final android.view.View c;

  final int d;

  final android.view.ViewPropertyAnimator e;

  final android.support.v7.widget.am f;

  android.support.v7.widget.am$6(android.support.v7.widget.am, android.support.v7.widget.RecyclerView$x, int, android.view.View, int, android.view.ViewPropertyAnimator);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #23                 // Field f:Landroid/support/v7/widget/am;
       5: aload_0
       6: aload_2
       7: putfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      10: aload_0
      11: iload_3
      12: putfield      #27                 // Field b:I
      15: aload_0
      16: aload         4
      18: putfield      #29                 // Field c:Landroid/view/View;
      21: aload_0
      22: iload         5
      24: putfield      #31                 // Field d:I
      27: aload_0
      28: aload         6
      30: putfield      #33                 // Field e:Landroid/view/ViewPropertyAnimator;
      33: aload_0
      34: invokespecial #36                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      37: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:I
       4: ifeq          15
       7: aload_0
       8: getfield      #29                 // Field c:Landroid/view/View;
      11: fconst_0
      12: invokevirtual #45                 // Method android/view/View.setTranslationX:(F)V
      15: aload_0
      16: getfield      #31                 // Field d:I
      19: ifeq          30
      22: aload_0
      23: getfield      #29                 // Field c:Landroid/view/View;
      26: fconst_0
      27: invokevirtual #48                 // Method android/view/View.setTranslationY:(F)V
      30: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #33                 // Field e:Landroid/view/ViewPropertyAnimator;
       4: aconst_null
       5: invokevirtual #55                 // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
       8: pop
       9: aload_0
      10: getfield      #23                 // Field f:Landroid/support/v7/widget/am;
      13: aload_0
      14: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      17: invokevirtual #59                 // Method android/support/v7/widget/am.j:(Landroid/support/v7/widget/RecyclerView$x;)V
      20: aload_0
      21: getfield      #23                 // Field f:Landroid/support/v7/widget/am;
      24: getfield      #62                 // Field android/support/v7/widget/am.e:Ljava/util/ArrayList;
      27: aload_0
      28: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      31: invokevirtual #68                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      34: pop
      35: aload_0
      36: getfield      #23                 // Field f:Landroid/support/v7/widget/am;
      39: invokevirtual #70                 // Method android/support/v7/widget/am.c:()V
      42: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #23                 // Field f:Landroid/support/v7/widget/am;
       4: aload_0
       5: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
       8: invokevirtual #74                 // Method android/support/v7/widget/am.m:(Landroid/support/v7/widget/RecyclerView$x;)V
      11: return
}
