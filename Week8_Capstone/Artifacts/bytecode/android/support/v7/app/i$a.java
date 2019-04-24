class android.support.v7.app.i$a extends android.support.v7.app.k$a {
  final android.support.v7.app.i b;

  android.support.v7.app.i$a(android.support.v7.app.i, android.view.Window$Callback);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field b:Landroid/support/v7/app/i;
       5: aload_0
       6: aload_1
       7: aload_2
       8: invokespecial #16                 // Method android/support/v7/app/k$a."<init>":(Landroid/support/v7/app/k;Landroid/view/Window$Callback;)V
      11: return

  public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup>, android.view.Menu, int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field b:Landroid/support/v7/app/i;
       4: iconst_0
       5: iconst_1
       6: invokevirtual #22                 // Method android/support/v7/app/i.a:(IZ)Landroid/support/v7/app/l$d;
       9: astore        5
      11: aload_2
      12: astore        4
      14: aload         5
      16: ifnull        37
      19: aload_2
      20: astore        4
      22: aload         5
      24: getfield      #28                 // Field android/support/v7/app/l$d.j:Landroid/support/v7/view/menu/h;
      27: ifnull        37
      30: aload         5
      32: getfield      #28                 // Field android/support/v7/app/l$d.j:Landroid/support/v7/view/menu/h;
      35: astore        4
      37: aload_0
      38: aload_1
      39: aload         4
      41: iload_3
      42: invokespecial #30                 // Method android/support/v7/app/k$a.onProvideKeyboardShortcuts:(Ljava/util/List;Landroid/view/Menu;I)V
      45: return
}
