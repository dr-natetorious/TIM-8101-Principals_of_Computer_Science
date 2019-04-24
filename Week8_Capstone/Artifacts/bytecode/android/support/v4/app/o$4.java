class android.support.v4.app.o$4 extends android.animation.AnimatorListenerAdapter {
  final android.view.ViewGroup a;

  final android.view.View b;

  final android.support.v4.app.i c;

  final android.support.v4.app.o d;

  android.support.v4.app.o$4(android.support.v4.app.o, android.view.ViewGroup, android.view.View, android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field d:Landroid/support/v4/app/o;
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Landroid/view/ViewGroup;
      10: aload_0
      11: aload_3
      12: putfield      #25                 // Field b:Landroid/view/View;
      15: aload_0
      16: aload         4
      18: putfield      #27                 // Field c:Landroid/support/v4/app/i;
      21: aload_0
      22: invokespecial #30                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      25: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/view/ViewGroup;
       4: aload_0
       5: getfield      #25                 // Field b:Landroid/view/View;
       8: invokevirtual #39                 // Method android/view/ViewGroup.endViewTransition:(Landroid/view/View;)V
      11: aload_1
      12: aload_0
      13: invokevirtual #45                 // Method android/animation/Animator.removeListener:(Landroid/animation/Animator$AnimatorListener;)V
      16: aload_0
      17: getfield      #27                 // Field c:Landroid/support/v4/app/i;
      20: getfield      #50                 // Field android/support/v4/app/i.mView:Landroid/view/View;
      23: ifnull        38
      26: aload_0
      27: getfield      #27                 // Field c:Landroid/support/v4/app/i;
      30: getfield      #50                 // Field android/support/v4/app/i.mView:Landroid/view/View;
      33: bipush        8
      35: invokevirtual #56                 // Method android/view/View.setVisibility:(I)V
      38: return
}
