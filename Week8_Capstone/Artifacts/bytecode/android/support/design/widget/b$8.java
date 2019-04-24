class android.support.design.widget.b$8 extends android.animation.AnimatorListenerAdapter {
  final android.support.design.widget.b a;

  android.support.design.widget.b$8(android.support.design.widget.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/design/widget/b;
       5: aload_0
       6: invokespecial #17                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
       9: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/b;
       4: invokevirtual #23                 // Method android/support/design/widget/b.d:()V
       7: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/b;
       4: invokestatic  #27                 // Method android/support/design/widget/b.a:(Landroid/support/design/widget/b;)Landroid/support/design/widget/b$c;
       7: bipush        70
       9: sipush        180
      12: invokeinterface #32,  3           // InterfaceMethod android/support/design/widget/b$c.a:(II)V
      17: return
}
