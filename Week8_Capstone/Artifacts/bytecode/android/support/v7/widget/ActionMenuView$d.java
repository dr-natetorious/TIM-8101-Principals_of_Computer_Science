class android.support.v7.widget.ActionMenuView$d implements android.support.v7.view.menu.h$a {
  final android.support.v7.widget.ActionMenuView a;

  android.support.v7.widget.ActionMenuView$d(android.support.v7.widget.ActionMenuView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/widget/ActionMenuView;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v7/widget/ActionMenuView;
       4: getfield      #23                 // Field android/support/v7/widget/ActionMenuView.a:Landroid/support/v7/view/menu/h$a;
       7: ifnull        23
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/v7/widget/ActionMenuView;
      14: getfield      #23                 // Field android/support/v7/widget/ActionMenuView.a:Landroid/support/v7/view/menu/h$a;
      17: aload_1
      18: invokeinterface #25,  2           // InterfaceMethod android/support/v7/view/menu/h$a.a:(Landroid/support/v7/view/menu/h;)V
      23: return

  public boolean a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v7/widget/ActionMenuView;
       4: getfield      #30                 // Field android/support/v7/widget/ActionMenuView.b:Landroid/support/v7/widget/ActionMenuView$e;
       7: ifnull        28
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/v7/widget/ActionMenuView;
      14: getfield      #30                 // Field android/support/v7/widget/ActionMenuView.b:Landroid/support/v7/widget/ActionMenuView$e;
      17: aload_2
      18: invokeinterface #35,  2           // InterfaceMethod android/support/v7/widget/ActionMenuView$e.a:(Landroid/view/MenuItem;)Z
      23: ifeq          28
      26: iconst_1
      27: ireturn
      28: iconst_0
      29: ireturn
}
