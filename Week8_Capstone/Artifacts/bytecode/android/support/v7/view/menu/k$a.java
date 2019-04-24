class android.support.v7.view.menu.k$a extends android.support.v4.view.c {
  final android.view.ActionProvider a;

  final android.support.v7.view.menu.k b;

  public android.support.v7.view.menu.k$a(android.support.v7.view.menu.k, android.content.Context, android.view.ActionProvider);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field b:Landroid/support/v7/view/menu/k;
       5: aload_0
       6: aload_2
       7: invokespecial #17                 // Method android/support/v4/view/c."<init>":(Landroid/content/Context;)V
      10: aload_0
      11: aload_3
      12: putfield      #19                 // Field a:Landroid/view/ActionProvider;
      15: return

  public android.view.View a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/view/ActionProvider;
       4: invokevirtual #26                 // Method android/view/ActionProvider.onCreateActionView:()Landroid/view/View;
       7: areturn

  public void a(android.view.SubMenu);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/view/ActionProvider;
       4: aload_0
       5: getfield      #14                 // Field b:Landroid/support/v7/view/menu/k;
       8: aload_1
       9: invokevirtual #30                 // Method android/support/v7/view/menu/k.a:(Landroid/view/SubMenu;)Landroid/view/SubMenu;
      12: invokevirtual #33                 // Method android/view/ActionProvider.onPrepareSubMenu:(Landroid/view/SubMenu;)V
      15: return

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/view/ActionProvider;
       4: invokevirtual #38                 // Method android/view/ActionProvider.onPerformDefaultAction:()Z
       7: ireturn

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/view/ActionProvider;
       4: invokevirtual #42                 // Method android/view/ActionProvider.hasSubMenu:()Z
       7: ireturn
}
