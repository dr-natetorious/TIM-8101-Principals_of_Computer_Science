class android.support.transition.g$a extends android.animation.AnimatorListenerAdapter {
  android.support.transition.g$a(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #17                 // Field b:Z
       9: aload_0
      10: aload_1
      11: putfield      #19                 // Field a:Landroid/view/View;
      14: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/view/View;
       4: fconst_1
       5: invokestatic  #27                 // Method android/support/transition/am.a:(Landroid/view/View;F)V
       8: aload_0
       9: getfield      #17                 // Field b:Z
      12: ifeq          24
      15: aload_0
      16: getfield      #19                 // Field a:Landroid/view/View;
      19: iconst_0
      20: aconst_null
      21: invokevirtual #33                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
      24: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/view/View;
       4: invokestatic  #40                 // Method android/support/v4/view/s.q:(Landroid/view/View;)Z
       7: ifeq          34
      10: aload_0
      11: getfield      #19                 // Field a:Landroid/view/View;
      14: invokevirtual #44                 // Method android/view/View.getLayerType:()I
      17: ifne          34
      20: aload_0
      21: iconst_1
      22: putfield      #17                 // Field b:Z
      25: aload_0
      26: getfield      #19                 // Field a:Landroid/view/View;
      29: iconst_2
      30: aconst_null
      31: invokevirtual #33                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
      34: return
}
