class android.support.transition.g$1 extends android.support.transition.v {
  final android.view.View a;

  final android.support.transition.g b;

  android.support.transition.g$1(android.support.transition.g, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field b:Landroid/support/transition/g;
       5: aload_0
       6: aload_2
       7: putfield      #18                 // Field a:Landroid/view/View;
      10: aload_0
      11: invokespecial #21                 // Method android/support/transition/v."<init>":()V
      14: return

  public void a(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/view/View;
       4: fconst_1
       5: invokestatic  #28                 // Method android/support/transition/am.a:(Landroid/view/View;F)V
       8: aload_0
       9: getfield      #18                 // Field a:Landroid/view/View;
      12: invokestatic  #32                 // Method android/support/transition/am.e:(Landroid/view/View;)V
      15: aload_1
      16: aload_0
      17: invokevirtual #37                 // Method android/support/transition/u.b:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
      20: pop
      21: return
}
