class android.support.transition.f$10 extends android.support.transition.v {
  boolean a;

  final android.view.ViewGroup b;

  final android.support.transition.f c;

  android.support.transition.f$10(android.support.transition.f, android.view.ViewGroup);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field c:Landroid/support/transition/f;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field b:Landroid/view/ViewGroup;
      10: aload_0
      11: invokespecial #23                 // Method android/support/transition/v."<init>":()V
      14: aload_0
      15: iconst_0
      16: putfield      #25                 // Field a:Z
      19: return

  public void a(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Z
       4: ifne          15
       7: aload_0
       8: getfield      #20                 // Field b:Landroid/view/ViewGroup;
      11: iconst_0
      12: invokestatic  #32                 // Method android/support/transition/af.a:(Landroid/view/ViewGroup;Z)V
      15: aload_1
      16: aload_0
      17: invokevirtual #37                 // Method android/support/transition/u.b:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
      20: pop
      21: return

  public void b(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Landroid/view/ViewGroup;
       4: iconst_0
       5: invokestatic  #32                 // Method android/support/transition/af.a:(Landroid/view/ViewGroup;Z)V
       8: return

  public void c(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Landroid/view/ViewGroup;
       4: iconst_1
       5: invokestatic  #32                 // Method android/support/transition/af.a:(Landroid/view/ViewGroup;Z)V
       8: return
}
