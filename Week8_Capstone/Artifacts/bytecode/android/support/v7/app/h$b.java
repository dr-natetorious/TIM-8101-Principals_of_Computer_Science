class android.support.v7.app.h$b extends android.support.v7.view.i {
  final android.support.v7.app.h a;

  android.support.v7.app.h$b(android.support.v7.app.h, android.view.Window$Callback);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v7/app/h;
       5: aload_0
       6: aload_2
       7: invokespecial #16                 // Method android/support/v7/view/i."<init>":(Landroid/view/Window$Callback;)V
      10: return

  public boolean dispatchKeyEvent(android.view.KeyEvent);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/app/h;
       4: aload_1
       5: invokevirtual #21                 // Method android/support/v7/app/h.a:(Landroid/view/KeyEvent;)Z
       8: ifne          24
      11: aload_0
      12: aload_1
      13: invokespecial #23                 // Method android/support/v7/view/i.dispatchKeyEvent:(Landroid/view/KeyEvent;)Z
      16: ifeq          22
      19: goto          24
      22: iconst_0
      23: ireturn
      24: iconst_1
      25: ireturn

  public boolean dispatchKeyShortcutEvent(android.view.KeyEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #26                 // Method android/support/v7/view/i.dispatchKeyShortcutEvent:(Landroid/view/KeyEvent;)Z
       5: ifne          28
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v7/app/h;
      12: aload_1
      13: invokevirtual #32                 // Method android/view/KeyEvent.getKeyCode:()I
      16: aload_1
      17: invokevirtual #35                 // Method android/support/v7/app/h.a:(ILandroid/view/KeyEvent;)Z
      20: ifeq          26
      23: goto          28
      26: iconst_0
      27: ireturn
      28: iconst_1
      29: ireturn

  public void onContentChanged();
    Code:
       0: return

  public boolean onCreatePanelMenu(int, android.view.Menu);
    Code:
       0: iload_1
       1: ifne          13
       4: aload_2
       5: instanceof    #41                 // class android/support/v7/view/menu/h
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: iload_1
      15: aload_2
      16: invokespecial #43                 // Method android/support/v7/view/i.onCreatePanelMenu:(ILandroid/view/Menu;)Z
      19: ireturn

  public boolean onMenuOpened(int, android.view.Menu);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokespecial #46                 // Method android/support/v7/view/i.onMenuOpened:(ILandroid/view/Menu;)Z
       6: pop
       7: aload_0
       8: getfield      #13                 // Field a:Landroid/support/v7/app/h;
      11: iload_1
      12: aload_2
      13: invokevirtual #48                 // Method android/support/v7/app/h.b:(ILandroid/view/Menu;)Z
      16: pop
      17: iconst_1
      18: ireturn

  public void onPanelClosed(int, android.view.Menu);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokespecial #52                 // Method android/support/v7/view/i.onPanelClosed:(ILandroid/view/Menu;)V
       6: aload_0
       7: getfield      #13                 // Field a:Landroid/support/v7/app/h;
      10: iload_1
      11: aload_2
      12: invokevirtual #54                 // Method android/support/v7/app/h.a:(ILandroid/view/Menu;)V
      15: return

  public boolean onPreparePanel(int, android.view.View, android.view.Menu);
    Code:
       0: aload_3
       1: instanceof    #41                 // class android/support/v7/view/menu/h
       4: ifeq          16
       7: aload_3
       8: checkcast     #41                 // class android/support/v7/view/menu/h
      11: astore        5
      13: goto          19
      16: aconst_null
      17: astore        5
      19: iload_1
      20: ifne          30
      23: aload         5
      25: ifnonnull     30
      28: iconst_0
      29: ireturn
      30: aload         5
      32: ifnull        41
      35: aload         5
      37: iconst_1
      38: invokevirtual #60                 // Method android/support/v7/view/menu/h.c:(Z)V
      41: aload_0
      42: iload_1
      43: aload_2
      44: aload_3
      45: invokespecial #62                 // Method android/support/v7/view/i.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
      48: istore        4
      50: aload         5
      52: ifnull        61
      55: aload         5
      57: iconst_0
      58: invokevirtual #60                 // Method android/support/v7/view/menu/h.c:(Z)V
      61: iload         4
      63: ireturn
}
