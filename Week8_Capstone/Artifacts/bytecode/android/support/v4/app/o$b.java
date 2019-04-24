class android.support.v4.app.o$b implements android.view.animation.Animation$AnimationListener {
  android.support.v4.app.o$b(android.view.animation.Animation$AnimationListener, android.support.v4.app.o$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #22                 // Method "<init>":(Landroid/view/animation/Animation$AnimationListener;)V
       5: return

  public void onAnimationEnd(android.view.animation.Animation);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/view/animation/Animation$AnimationListener;
       4: ifnull        17
       7: aload_0
       8: getfield      #18                 // Field a:Landroid/view/animation/Animation$AnimationListener;
      11: aload_1
      12: invokeinterface #26,  2           // InterfaceMethod android/view/animation/Animation$AnimationListener.onAnimationEnd:(Landroid/view/animation/Animation;)V
      17: return

  public void onAnimationRepeat(android.view.animation.Animation);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/view/animation/Animation$AnimationListener;
       4: ifnull        17
       7: aload_0
       8: getfield      #18                 // Field a:Landroid/view/animation/Animation$AnimationListener;
      11: aload_1
      12: invokeinterface #29,  2           // InterfaceMethod android/view/animation/Animation$AnimationListener.onAnimationRepeat:(Landroid/view/animation/Animation;)V
      17: return

  public void onAnimationStart(android.view.animation.Animation);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/view/animation/Animation$AnimationListener;
       4: ifnull        17
       7: aload_0
       8: getfield      #18                 // Field a:Landroid/view/animation/Animation$AnimationListener;
      11: aload_1
      12: invokeinterface #32,  2           // InterfaceMethod android/view/animation/Animation$AnimationListener.onAnimationStart:(Landroid/view/animation/Animation;)V
      17: return
}
