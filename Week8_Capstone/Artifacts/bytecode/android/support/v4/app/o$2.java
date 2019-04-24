class android.support.v4.app.o$2 extends android.support.v4.app.o$b {
  final android.view.ViewGroup a;

  final android.support.v4.app.i b;

  final android.support.v4.app.o c;

  android.support.v4.app.o$2(android.support.v4.app.o, android.view.animation.Animation$AnimationListener, android.view.ViewGroup, android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field c:Landroid/support/v4/app/o;
       5: aload_0
       6: aload_3
       7: putfield      #22                 // Field a:Landroid/view/ViewGroup;
      10: aload_0
      11: aload         4
      13: putfield      #24                 // Field b:Landroid/support/v4/app/i;
      16: aload_0
      17: aload_2
      18: aconst_null
      19: invokespecial #27                 // Method android/support/v4/app/o$b."<init>":(Landroid/view/animation/Animation$AnimationListener;Landroid/support/v4/app/o$1;)V
      22: return

  public void onAnimationEnd(android.view.animation.Animation);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #32                 // Method android/support/v4/app/o$b.onAnimationEnd:(Landroid/view/animation/Animation;)V
       5: aload_0
       6: getfield      #22                 // Field a:Landroid/view/ViewGroup;
       9: new           #11                 // class android/support/v4/app/o$2$1
      12: dup
      13: aload_0
      14: invokespecial #35                 // Method android/support/v4/app/o$2$1."<init>":(Landroid/support/v4/app/o$2;)V
      17: invokevirtual #41                 // Method android/view/ViewGroup.post:(Ljava/lang/Runnable;)Z
      20: pop
      21: return
}
