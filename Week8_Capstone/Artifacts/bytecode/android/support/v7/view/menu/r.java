class android.support.v7.view.menu.r extends android.support.v7.view.menu.c<android.support.v4.c.a.a> implements android.view.Menu {
  android.support.v7.view.menu.r(android.content.Context, android.support.v4.c.a.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #12                 // Method android/support/v7/view/menu/c."<init>":(Landroid/content/Context;Ljava/lang/Object;)V
       6: return

  public android.view.MenuItem add(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: invokeinterface #23,  2           // InterfaceMethod android/support/v4/c/a/a.add:(I)Landroid/view/MenuItem;
      14: invokevirtual #27                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      17: areturn

  public android.view.MenuItem add(int, int, int, int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: iload_2
      10: iload_3
      11: iload         4
      13: invokeinterface #30,  5           // InterfaceMethod android/support/v4/c/a/a.add:(IIII)Landroid/view/MenuItem;
      18: invokevirtual #27                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      21: areturn

  public android.view.MenuItem add(int, int, int, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: iload_2
      10: iload_3
      11: aload         4
      13: invokeinterface #33,  5           // InterfaceMethod android/support/v4/c/a/a.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
      18: invokevirtual #27                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      21: areturn

  public android.view.MenuItem add(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: aload_1
       9: invokeinterface #36,  2           // InterfaceMethod android/support/v4/c/a/a.add:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
      14: invokevirtual #27                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      17: areturn

  public int addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]);
    Code:
       0: aload         8
       2: ifnull        16
       5: aload         8
       7: arraylength
       8: anewarray     #40                 // class android/view/MenuItem
      11: astore        9
      13: goto          19
      16: aconst_null
      17: astore        9
      19: aload_0
      20: getfield      #19                 // Field b:Ljava/lang/Object;
      23: checkcast     #21                 // class android/support/v4/c/a/a
      26: iload_1
      27: iload_2
      28: iload_3
      29: aload         4
      31: aload         5
      33: aload         6
      35: iload         7
      37: aload         9
      39: invokeinterface #42,  9           // InterfaceMethod android/support/v4/c/a/a.addIntentOptions:(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
      44: istore_2
      45: aload         9
      47: ifnull        80
      50: iconst_0
      51: istore_1
      52: aload         9
      54: arraylength
      55: istore_3
      56: iload_1
      57: iload_3
      58: if_icmpge     80
      61: aload         8
      63: iload_1
      64: aload_0
      65: aload         9
      67: iload_1
      68: aaload
      69: invokevirtual #27                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      72: aastore
      73: iload_1
      74: iconst_1
      75: iadd
      76: istore_1
      77: goto          56
      80: iload_2
      81: ireturn

  public android.view.SubMenu addSubMenu(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: invokeinterface #46,  2           // InterfaceMethod android/support/v4/c/a/a.addSubMenu:(I)Landroid/view/SubMenu;
      14: invokevirtual #49                 // Method a:(Landroid/view/SubMenu;)Landroid/view/SubMenu;
      17: areturn

  public android.view.SubMenu addSubMenu(int, int, int, int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: iload_2
      10: iload_3
      11: iload         4
      13: invokeinterface #52,  5           // InterfaceMethod android/support/v4/c/a/a.addSubMenu:(IIII)Landroid/view/SubMenu;
      18: invokevirtual #49                 // Method a:(Landroid/view/SubMenu;)Landroid/view/SubMenu;
      21: areturn

  public android.view.SubMenu addSubMenu(int, int, int, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: iload_2
      10: iload_3
      11: aload         4
      13: invokeinterface #55,  5           // InterfaceMethod android/support/v4/c/a/a.addSubMenu:(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
      18: invokevirtual #49                 // Method a:(Landroid/view/SubMenu;)Landroid/view/SubMenu;
      21: areturn

  public android.view.SubMenu addSubMenu(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: aload_1
       9: invokeinterface #58,  2           // InterfaceMethod android/support/v4/c/a/a.addSubMenu:(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
      14: invokevirtual #49                 // Method a:(Landroid/view/SubMenu;)Landroid/view/SubMenu;
      17: areturn

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #62                 // Method a:()V
       4: aload_0
       5: getfield      #19                 // Field b:Ljava/lang/Object;
       8: checkcast     #21                 // class android/support/v4/c/a/a
      11: invokeinterface #64,  1           // InterfaceMethod android/support/v4/c/a/a.clear:()V
      16: return

  public void close();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: invokeinterface #67,  1           // InterfaceMethod android/support/v4/c/a/a.close:()V
      12: return

  public android.view.MenuItem findItem(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: invokeinterface #70,  2           // InterfaceMethod android/support/v4/c/a/a.findItem:(I)Landroid/view/MenuItem;
      14: invokevirtual #27                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      17: areturn

  public android.view.MenuItem getItem(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #19                 // Field b:Ljava/lang/Object;
       5: checkcast     #21                 // class android/support/v4/c/a/a
       8: iload_1
       9: invokeinterface #73,  2           // InterfaceMethod android/support/v4/c/a/a.getItem:(I)Landroid/view/MenuItem;
      14: invokevirtual #27                 // Method a:(Landroid/view/MenuItem;)Landroid/view/MenuItem;
      17: areturn

  public boolean hasVisibleItems();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: invokeinterface #77,  1           // InterfaceMethod android/support/v4/c/a/a.hasVisibleItems:()Z
      12: ireturn

  public boolean isShortcutKey(int, android.view.KeyEvent);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: iload_1
       8: aload_2
       9: invokeinterface #81,  3           // InterfaceMethod android/support/v4/c/a/a.isShortcutKey:(ILandroid/view/KeyEvent;)Z
      14: ireturn

  public boolean performIdentifierAction(int, int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: iload_1
       8: iload_2
       9: invokeinterface #85,  3           // InterfaceMethod android/support/v4/c/a/a.performIdentifierAction:(II)Z
      14: ireturn

  public boolean performShortcut(int, android.view.KeyEvent, int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: iload_1
       8: aload_2
       9: iload_3
      10: invokeinterface #89,  4           // InterfaceMethod android/support/v4/c/a/a.performShortcut:(ILandroid/view/KeyEvent;I)Z
      15: ireturn

  public void removeGroup(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #93                 // Method a:(I)V
       5: aload_0
       6: getfield      #19                 // Field b:Ljava/lang/Object;
       9: checkcast     #21                 // class android/support/v4/c/a/a
      12: iload_1
      13: invokeinterface #95,  2           // InterfaceMethod android/support/v4/c/a/a.removeGroup:(I)V
      18: return

  public void removeItem(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #98                 // Method b:(I)V
       5: aload_0
       6: getfield      #19                 // Field b:Ljava/lang/Object;
       9: checkcast     #21                 // class android/support/v4/c/a/a
      12: iload_1
      13: invokeinterface #100,  2          // InterfaceMethod android/support/v4/c/a/a.removeItem:(I)V
      18: return

  public void setGroupCheckable(int, boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: iload_1
       8: iload_2
       9: iload_3
      10: invokeinterface #104,  4          // InterfaceMethod android/support/v4/c/a/a.setGroupCheckable:(IZZ)V
      15: return

  public void setGroupEnabled(int, boolean);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: iload_1
       8: iload_2
       9: invokeinterface #108,  3          // InterfaceMethod android/support/v4/c/a/a.setGroupEnabled:(IZ)V
      14: return

  public void setGroupVisible(int, boolean);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: iload_1
       8: iload_2
       9: invokeinterface #111,  3          // InterfaceMethod android/support/v4/c/a/a.setGroupVisible:(IZ)V
      14: return

  public void setQwertyMode(boolean);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: iload_1
       8: invokeinterface #115,  2          // InterfaceMethod android/support/v4/c/a/a.setQwertyMode:(Z)V
      13: return

  public int size();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Ljava/lang/Object;
       4: checkcast     #21                 // class android/support/v4/c/a/a
       7: invokeinterface #119,  1          // InterfaceMethod android/support/v4/c/a/a.size:()I
      12: ireturn
}
