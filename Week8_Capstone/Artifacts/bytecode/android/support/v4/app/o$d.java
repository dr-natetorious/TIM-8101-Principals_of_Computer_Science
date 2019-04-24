class android.support.v4.app.o$d extends android.animation.AnimatorListenerAdapter {
  android.view.View a;

  android.support.v4.app.o$d(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #16                 // Field a:Landroid/view/View;
       9: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/view/View;
       4: iconst_0
       5: aconst_null
       6: invokevirtual #25                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
       9: aload_1
      10: aload_0
      11: invokevirtual #31                 // Method android/animation/Animator.removeListener:(Landroid/animation/Animator$AnimatorListener;)V
      14: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/view/View;
       4: iconst_2
       5: aconst_null
       6: invokevirtual #25                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
       9: return
}
