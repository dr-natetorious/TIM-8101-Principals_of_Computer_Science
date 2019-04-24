class android.support.transition.f$2 extends android.animation.AnimatorListenerAdapter {
  final android.view.ViewGroup a;

  final android.graphics.drawable.BitmapDrawable b;

  final android.view.View c;

  final float d;

  final android.support.transition.f e;

  android.support.transition.f$2(android.support.transition.f, android.view.ViewGroup, android.graphics.drawable.BitmapDrawable, android.view.View, float);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field e:Landroid/support/transition/f;
       5: aload_0
       6: aload_2
       7: putfield      #24                 // Field a:Landroid/view/ViewGroup;
      10: aload_0
      11: aload_3
      12: putfield      #26                 // Field b:Landroid/graphics/drawable/BitmapDrawable;
      15: aload_0
      16: aload         4
      18: putfield      #28                 // Field c:Landroid/view/View;
      21: aload_0
      22: fload         5
      24: putfield      #30                 // Field d:F
      27: aload_0
      28: invokespecial #33                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      31: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Landroid/view/ViewGroup;
       4: invokestatic  #41                 // Method android/support/transition/am.a:(Landroid/view/View;)Landroid/support/transition/al;
       7: aload_0
       8: getfield      #26                 // Field b:Landroid/graphics/drawable/BitmapDrawable;
      11: invokeinterface #46,  2           // InterfaceMethod android/support/transition/al.b:(Landroid/graphics/drawable/Drawable;)V
      16: aload_0
      17: getfield      #28                 // Field c:Landroid/view/View;
      20: aload_0
      21: getfield      #30                 // Field d:F
      24: invokestatic  #49                 // Method android/support/transition/am.a:(Landroid/view/View;F)V
      27: return
}
