class android.support.v4.app.o$3 extends android.animation.AnimatorListenerAdapter {
  final android.view.ViewGroup a;

  final android.view.View b;

  final android.support.v4.app.i c;

  final android.support.v4.app.o d;

  android.support.v4.app.o$3(android.support.v4.app.o, android.view.ViewGroup, android.view.View, android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field d:Landroid/support/v4/app/o;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/view/ViewGroup;
      10: aload_0
      11: aload_3
      12: putfield      #24                 // Field b:Landroid/view/View;
      15: aload_0
      16: aload         4
      18: putfield      #26                 // Field c:Landroid/support/v4/app/i;
      21: aload_0
      22: invokespecial #29                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      25: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/view/ViewGroup;
       4: aload_0
       5: getfield      #24                 // Field b:Landroid/view/View;
       8: invokevirtual #38                 // Method android/view/ViewGroup.endViewTransition:(Landroid/view/View;)V
      11: aload_0
      12: getfield      #26                 // Field c:Landroid/support/v4/app/i;
      15: invokevirtual #44                 // Method android/support/v4/app/i.getAnimator:()Landroid/animation/Animator;
      18: astore_1
      19: aload_0
      20: getfield      #26                 // Field c:Landroid/support/v4/app/i;
      23: aconst_null
      24: invokevirtual #47                 // Method android/support/v4/app/i.setAnimator:(Landroid/animation/Animator;)V
      27: aload_1
      28: ifnull        66
      31: aload_0
      32: getfield      #22                 // Field a:Landroid/view/ViewGroup;
      35: aload_0
      36: getfield      #24                 // Field b:Landroid/view/View;
      39: invokevirtual #51                 // Method android/view/ViewGroup.indexOfChild:(Landroid/view/View;)I
      42: ifge          66
      45: aload_0
      46: getfield      #20                 // Field d:Landroid/support/v4/app/o;
      49: aload_0
      50: getfield      #26                 // Field c:Landroid/support/v4/app/i;
      53: aload_0
      54: getfield      #26                 // Field c:Landroid/support/v4/app/i;
      57: invokevirtual #55                 // Method android/support/v4/app/i.getStateAfterAnimating:()I
      60: iconst_0
      61: iconst_0
      62: iconst_0
      63: invokevirtual #58                 // Method android/support/v4/app/o.a:(Landroid/support/v4/app/i;IIIZ)V
      66: return
}
