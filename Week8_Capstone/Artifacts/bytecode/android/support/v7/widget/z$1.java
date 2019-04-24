class android.support.v7.widget.z$1 extends android.support.v7.widget.as {
  final android.support.v7.widget.z$b a;

  final android.support.v7.widget.z b;

  android.support.v7.widget.z$1(android.support.v7.widget.z, android.view.View, android.support.v7.widget.z$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field b:Landroid/support/v7/widget/z;
       5: aload_0
       6: aload_3
       7: putfield      #18                 // Field a:Landroid/support/v7/widget/z$b;
      10: aload_0
      11: aload_2
      12: invokespecial #21                 // Method android/support/v7/widget/as."<init>":(Landroid/view/View;)V
      15: return

  public android.support.v7.view.menu.s a();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v7/widget/z$b;
       4: areturn

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #16                 // Field b:Landroid/support/v7/widget/z;
       4: invokestatic  #27                 // Method android/support/v7/widget/z.a:(Landroid/support/v7/widget/z;)Landroid/support/v7/widget/z$b;
       7: invokevirtual #32                 // Method android/support/v7/widget/z$b.f:()Z
      10: ifne          23
      13: aload_0
      14: getfield      #16                 // Field b:Landroid/support/v7/widget/z;
      17: invokestatic  #27                 // Method android/support/v7/widget/z.a:(Landroid/support/v7/widget/z;)Landroid/support/v7/widget/z$b;
      20: invokevirtual #36                 // Method android/support/v7/widget/z$b.d:()V
      23: iconst_1
      24: ireturn
}
