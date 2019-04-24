class android.support.v7.view.menu.ActionMenuItemView$a extends android.support.v7.widget.as {
  final android.support.v7.view.menu.ActionMenuItemView a;

  public android.support.v7.view.menu.ActionMenuItemView$a(android.support.v7.view.menu.ActionMenuItemView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v7/view/menu/ActionMenuItemView;
       5: aload_0
       6: aload_1
       7: invokespecial #15                 // Method android/support/v7/widget/as."<init>":(Landroid/view/View;)V
      10: return

  public android.support.v7.view.menu.s a();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/view/menu/ActionMenuItemView;
       4: getfield      #21                 // Field android/support/v7/view/menu/ActionMenuItemView.d:Landroid/support/v7/view/menu/ActionMenuItemView$b;
       7: ifnull        21
      10: aload_0
      11: getfield      #12                 // Field a:Landroid/support/v7/view/menu/ActionMenuItemView;
      14: getfield      #21                 // Field android/support/v7/view/menu/ActionMenuItemView.d:Landroid/support/v7/view/menu/ActionMenuItemView$b;
      17: invokevirtual #25                 // Method android/support/v7/view/menu/ActionMenuItemView$b.a:()Landroid/support/v7/view/menu/s;
      20: areturn
      21: aconst_null
      22: areturn

  protected boolean b();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/view/menu/ActionMenuItemView;
       4: getfield      #31                 // Field android/support/v7/view/menu/ActionMenuItemView.c:Landroid/support/v7/view/menu/h$b;
       7: astore_3
       8: iconst_0
       9: istore_2
      10: iload_2
      11: istore_1
      12: aload_3
      13: ifnull        64
      16: iload_2
      17: istore_1
      18: aload_0
      19: getfield      #12                 // Field a:Landroid/support/v7/view/menu/ActionMenuItemView;
      22: getfield      #31                 // Field android/support/v7/view/menu/ActionMenuItemView.c:Landroid/support/v7/view/menu/h$b;
      25: aload_0
      26: getfield      #12                 // Field a:Landroid/support/v7/view/menu/ActionMenuItemView;
      29: getfield      #34                 // Field android/support/v7/view/menu/ActionMenuItemView.b:Landroid/support/v7/view/menu/j;
      32: invokeinterface #39,  2           // InterfaceMethod android/support/v7/view/menu/h$b.a:(Landroid/support/v7/view/menu/j;)Z
      37: ifeq          64
      40: aload_0
      41: invokevirtual #40                 // Method a:()Landroid/support/v7/view/menu/s;
      44: astore_3
      45: iload_2
      46: istore_1
      47: aload_3
      48: ifnull        64
      51: iload_2
      52: istore_1
      53: aload_3
      54: invokeinterface #45,  1           // InterfaceMethod android/support/v7/view/menu/s.f:()Z
      59: ifeq          64
      62: iconst_1
      63: istore_1
      64: iload_1
      65: ireturn
}
