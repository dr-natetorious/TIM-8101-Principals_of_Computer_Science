class android.support.v7.widget.ActionBarOverlayLayout$1 extends android.animation.AnimatorListenerAdapter {
  final android.support.v7.widget.ActionBarOverlayLayout a;

  android.support.v7.widget.ActionBarOverlayLayout$1(android.support.v7.widget.ActionBarOverlayLayout);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
       5: aload_0
       6: invokespecial #15                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
       9: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
       4: aconst_null
       5: putfield      #22                 // Field android/support/v7/widget/ActionBarOverlayLayout.c:Landroid/view/ViewPropertyAnimator;
       8: aload_0
       9: getfield      #12                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
      12: iconst_0
      13: putfield      #26                 // Field android/support/v7/widget/ActionBarOverlayLayout.b:Z
      16: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
       4: aconst_null
       5: putfield      #22                 // Field android/support/v7/widget/ActionBarOverlayLayout.c:Landroid/view/ViewPropertyAnimator;
       8: aload_0
       9: getfield      #12                 // Field a:Landroid/support/v7/widget/ActionBarOverlayLayout;
      12: iconst_0
      13: putfield      #26                 // Field android/support/v7/widget/ActionBarOverlayLayout.b:Z
      16: return
}
