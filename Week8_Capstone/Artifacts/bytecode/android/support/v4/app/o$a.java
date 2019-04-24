class android.support.v4.app.o$a extends android.support.v4.app.o$b {
  android.view.View a;

  android.support.v4.app.o$a(android.view.View, android.view.animation.Animation$AnimationListener);
    Code:
       0: aload_0
       1: aload_2
       2: aconst_null
       3: invokespecial #15                 // Method android/support/v4/app/o$b."<init>":(Landroid/view/animation/Animation$AnimationListener;Landroid/support/v4/app/o$1;)V
       6: aload_0
       7: aload_1
       8: putfield      #17                 // Field a:Landroid/view/View;
      11: return

  public void onAnimationEnd(android.view.animation.Animation);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/view/View;
       4: invokestatic  #26                 // Method android/support/v4/view/s.z:(Landroid/view/View;)Z
       7: ifne          33
      10: getstatic     #32                 // Field android/os/Build$VERSION.SDK_INT:I
      13: bipush        24
      15: if_icmplt     21
      18: goto          33
      21: aload_0
      22: getfield      #17                 // Field a:Landroid/view/View;
      25: iconst_0
      26: aconst_null
      27: invokevirtual #38                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
      30: goto          49
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/view/View;
      37: new           #9                  // class android/support/v4/app/o$a$1
      40: dup
      41: aload_0
      42: invokespecial #41                 // Method android/support/v4/app/o$a$1."<init>":(Landroid/support/v4/app/o$a;)V
      45: invokevirtual #45                 // Method android/view/View.post:(Ljava/lang/Runnable;)Z
      48: pop
      49: aload_0
      50: aload_1
      51: invokespecial #47                 // Method android/support/v4/app/o$b.onAnimationEnd:(Landroid/view/animation/Animation;)V
      54: return
}
