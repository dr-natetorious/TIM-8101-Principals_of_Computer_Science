class android.support.transition.u$2 extends android.animation.AnimatorListenerAdapter {
  final android.support.v4.g.a a;

  final android.support.transition.u b;

  android.support.transition.u$2(android.support.transition.u, android.support.v4.g.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field b:Landroid/support/transition/u;
       5: aload_0
       6: aload_2
       7: putfield      #18                 // Field a:Landroid/support/v4/g/a;
      10: aload_0
      11: invokespecial #21                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      14: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #30                 // Method android/support/v4/g/a.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: aload_0
      10: getfield      #16                 // Field b:Landroid/support/transition/u;
      13: invokestatic  #33                 // Method android/support/transition/u.a:(Landroid/support/transition/u;)Ljava/util/ArrayList;
      16: aload_1
      17: invokevirtual #38                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      20: pop
      21: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #16                 // Field b:Landroid/support/transition/u;
       4: invokestatic  #33                 // Method android/support/transition/u.a:(Landroid/support/transition/u;)Ljava/util/ArrayList;
       7: aload_1
       8: invokevirtual #42                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      11: pop
      12: return
}
