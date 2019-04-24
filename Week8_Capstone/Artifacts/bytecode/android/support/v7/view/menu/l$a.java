class android.support.v7.view.menu.l$a extends android.support.v7.view.menu.k$a implements android.view.ActionProvider$VisibilityListener {
  android.support.v4.view.c$b c;

  final android.support.v7.view.menu.l d;

  public android.support.v7.view.menu.l$a(android.support.v7.view.menu.l, android.content.Context, android.view.ActionProvider);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field d:Landroid/support/v7/view/menu/l;
       5: aload_0
       6: aload_1
       7: aload_2
       8: aload_3
       9: invokespecial #20                 // Method android/support/v7/view/menu/k$a."<init>":(Landroid/support/v7/view/menu/k;Landroid/content/Context;Landroid/view/ActionProvider;)V
      12: return

  public android.view.View a(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/view/ActionProvider;
       4: aload_1
       5: invokevirtual #30                 // Method android/view/ActionProvider.onCreateActionView:(Landroid/view/MenuItem;)Landroid/view/View;
       8: areturn

  public void a(android.support.v4.view.c$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #33                 // Field c:Landroid/support/v4/view/c$b;
       5: aload_0
       6: getfield      #25                 // Field a:Landroid/view/ActionProvider;
       9: astore_2
      10: aload_1
      11: ifnull        19
      14: aload_0
      15: astore_1
      16: goto          21
      19: aconst_null
      20: astore_1
      21: aload_2
      22: aload_1
      23: invokevirtual #37                 // Method android/view/ActionProvider.setVisibilityListener:(Landroid/view/ActionProvider$VisibilityListener;)V
      26: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/view/ActionProvider;
       4: invokevirtual #42                 // Method android/view/ActionProvider.overridesItemVisibility:()Z
       7: ireturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/view/ActionProvider;
       4: invokevirtual #45                 // Method android/view/ActionProvider.isVisible:()Z
       7: ireturn

  public void onActionProviderVisibilityChanged(boolean);
    Code:
       0: aload_0
       1: getfield      #33                 // Field c:Landroid/support/v4/view/c$b;
       4: ifnull        17
       7: aload_0
       8: getfield      #33                 // Field c:Landroid/support/v4/view/c$b;
      11: iload_1
      12: invokeinterface #51,  2           // InterfaceMethod android/support/v4/view/c$b.a:(Z)V
      17: return
}
