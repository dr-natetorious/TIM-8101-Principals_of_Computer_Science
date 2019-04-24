class android.support.design.widget.b$4 implements android.view.animation.Animation$AnimationListener {
  final int a;

  final android.support.design.widget.b b;

  android.support.design.widget.b$4(android.support.design.widget.b, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Landroid/support/design/widget/b;
       5: aload_0
       6: iload_2
       7: putfield      #21                 // Field a:I
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public void onAnimationEnd(android.view.animation.Animation);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/design/widget/b;
       4: aload_0
       5: getfield      #21                 // Field a:I
       8: invokevirtual #30                 // Method android/support/design/widget/b.c:(I)V
      11: return

  public void onAnimationRepeat(android.view.animation.Animation);
    Code:
       0: return

  public void onAnimationStart(android.view.animation.Animation);
    Code:
       0: return
}
