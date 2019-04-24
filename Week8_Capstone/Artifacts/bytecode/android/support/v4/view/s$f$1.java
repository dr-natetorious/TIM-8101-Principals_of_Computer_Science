class android.support.v4.view.s$f$1 implements android.view.View$OnApplyWindowInsetsListener {
  final android.support.v4.view.p a;

  final android.support.v4.view.s$f b;

  android.support.v4.view.s$f$1(android.support.v4.view.s$f, android.support.v4.view.p);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field b:Landroid/support/v4/view/s$f;
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Landroid/support/v4/view/p;
      10: aload_0
      11: invokespecial #26                 // Method java/lang/Object."<init>":()V
      14: return

  public android.view.WindowInsets onApplyWindowInsets(android.view.View, android.view.WindowInsets);
    Code:
       0: aload_2
       1: invokestatic  #34                 // Method android/support/v4/view/ab.a:(Ljava/lang/Object;)Landroid/support/v4/view/ab;
       4: astore_2
       5: aload_0
       6: getfield      #23                 // Field a:Landroid/support/v4/view/p;
       9: aload_1
      10: aload_2
      11: invokeinterface #39,  3           // InterfaceMethod android/support/v4/view/p.a:(Landroid/view/View;Landroid/support/v4/view/ab;)Landroid/support/v4/view/ab;
      16: invokestatic  #42                 // Method android/support/v4/view/ab.a:(Landroid/support/v4/view/ab;)Ljava/lang/Object;
      19: checkcast     #44                 // class android/view/WindowInsets
      22: areturn
}
