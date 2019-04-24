class android.support.v7.view.menu.k$d extends android.support.v7.view.menu.d<android.view.MenuItem$OnMenuItemClickListener> implements android.view.MenuItem$OnMenuItemClickListener {
  final android.support.v7.view.menu.k a;

  android.support.v7.view.menu.k$d(android.support.v7.view.menu.k, android.view.MenuItem$OnMenuItemClickListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v7/view/menu/k;
       5: aload_0
       6: aload_2
       7: invokespecial #19                 // Method android/support/v7/view/menu/d."<init>":(Ljava/lang/Object;)V
      10: return

  public boolean onMenuItemClick(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #26                 // Field b:Ljava/lang/Object;
       4: checkcast     #7                  // class android/view/MenuItem$OnMenuItemClickListener
       7: aload_0
       8: getfield      #16                 // Field a:Landroid/support/v7/view/menu/k;
      11: aload_1
      12: invokevirtual #29                 // Method android/support/v7/view/menu/k.a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      15: invokeinterface #31,  2           // InterfaceMethod android/view/MenuItem$OnMenuItemClickListener.onMenuItemClick:(Landroid/view/MenuItem;)Z
      20: ireturn
}
