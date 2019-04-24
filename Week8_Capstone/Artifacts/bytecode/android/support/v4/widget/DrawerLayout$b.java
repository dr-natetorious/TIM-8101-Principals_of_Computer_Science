final class android.support.v4.widget.DrawerLayout$b extends android.support.v4.view.b {
  android.support.v4.widget.DrawerLayout$b();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/view/b."<init>":()V
       4: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #16                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
       6: aload_1
       7: invokestatic  #20                 // Method android/support/v4/widget/DrawerLayout.l:(Landroid/view/View;)Z
      10: ifne          18
      13: aload_2
      14: aconst_null
      15: invokevirtual #26                 // Method android/support/v4/view/a/b.c:(Landroid/view/View;)V
      18: return
}
