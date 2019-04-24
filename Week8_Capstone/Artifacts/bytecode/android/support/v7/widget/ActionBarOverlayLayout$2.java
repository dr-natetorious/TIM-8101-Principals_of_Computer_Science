class android.support.v7.widget.ActionBarOverlayLayout$2 implements java.lang.Runnable {
  final android.support.v7.widget.ActionBarOverlayLayout a;

  android.support.v7.widget.ActionBarOverlayLayout$2(android.support.v7.widget.ActionBarOverlayLayout);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
       4: invokevirtual #22                 // Method android/support/v7/widget/ActionBarOverlayLayout.d:()V
       7: aload_0
       8: getfield      #14                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
      11: aload_0
      12: getfield      #14                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
      15: getfield      #25                 // Field android/support/v7/widget/ActionBarOverlayLayout.a:Landroid/support/v7/widget/ActionBarContainer;
      18: invokevirtual #31                 // Method android/support/v7/widget/ActionBarContainer.animate:()Landroid/view/ViewPropertyAnimator;
      21: fconst_0
      22: invokevirtual #37                 // Method android/view/ViewPropertyAnimator.translationY:(F)Landroid/view/ViewPropertyAnimator;
      25: aload_0
      26: getfield      #14                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
      29: getfield      #40                 // Field android/support/v7/widget/ActionBarOverlayLayout.d:Landroid/animation/AnimatorListenerAdapter;
      32: invokevirtual #44                 // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
      35: putfield      #48                 // Field android/support/v7/widget/ActionBarOverlayLayout.c:Landroid/view/ViewPropertyAnimator;
      38: return
}
