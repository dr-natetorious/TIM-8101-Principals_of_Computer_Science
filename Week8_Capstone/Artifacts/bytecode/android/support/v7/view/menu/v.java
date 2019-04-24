class android.support.v7.view.menu.v extends android.support.v7.view.menu.r implements android.view.SubMenu {
  android.support.v7.view.menu.v(android.content.Context, android.support.v4.c.a.c);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #11                 // Method android/support/v7/view/menu/r."<init>":(Landroid/content/Context;Landroid/support/v4/c/a/a;)V
       6: return

  public android.support.v4.c.a.c b();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Ljava/lang/Object;
       4: checkcast     #19                 // class android/support/v4/c/a/c
       7: areturn

  public void clearHeader();
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: invokeinterface #25,  1           // InterfaceMethod android/support/v4/c/a/c.clearHeader:()V
       9: return

  public android.view.MenuItem getItem();
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       5: invokeinterface #29,  1           // InterfaceMethod android/support/v4/c/a/c.getItem:()Landroid/view/MenuItem;
      10: invokevirtual #33                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      13: areturn

  public android.view.SubMenu setHeaderIcon(int);
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: iload_1
       5: invokeinterface #37,  2           // InterfaceMethod android/support/v4/c/a/c.setHeaderIcon:(I)Landroid/view/SubMenu;
      10: pop
      11: aload_0
      12: areturn

  public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: aload_1
       5: invokeinterface #40,  2           // InterfaceMethod android/support/v4/c/a/c.setHeaderIcon:(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
      10: pop
      11: aload_0
      12: areturn

  public android.view.SubMenu setHeaderTitle(int);
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: iload_1
       5: invokeinterface #43,  2           // InterfaceMethod android/support/v4/c/a/c.setHeaderTitle:(I)Landroid/view/SubMenu;
      10: pop
      11: aload_0
      12: areturn

  public android.view.SubMenu setHeaderTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: aload_1
       5: invokeinterface #46,  2           // InterfaceMethod android/support/v4/c/a/c.setHeaderTitle:(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
      10: pop
      11: aload_0
      12: areturn

  public android.view.SubMenu setHeaderView(android.view.View);
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: aload_1
       5: invokeinterface #50,  2           // InterfaceMethod android/support/v4/c/a/c.setHeaderView:(Landroid/view/View;)Landroid/view/SubMenu;
      10: pop
      11: aload_0
      12: areturn

  public android.view.SubMenu setIcon(int);
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: iload_1
       5: invokeinterface #53,  2           // InterfaceMethod android/support/v4/c/a/c.setIcon:(I)Landroid/view/SubMenu;
      10: pop
      11: aload_0
      12: areturn

  public android.view.SubMenu setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/support/v4/c/a/c;
       4: aload_1
       5: invokeinterface #55,  2           // InterfaceMethod android/support/v4/c/a/c.setIcon:(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
      10: pop
      11: aload_0
      12: areturn
}
