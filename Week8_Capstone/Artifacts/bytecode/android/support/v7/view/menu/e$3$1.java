class android.support.v7.view.menu.e$3$1 implements java.lang.Runnable {
  final android.support.v7.view.menu.e$a a;

  final android.view.MenuItem b;

  final android.support.v7.view.menu.h c;

  final android.support.v7.view.menu.e$3 d;

  android.support.v7.view.menu.e$3$1(android.support.v7.view.menu.e$3, android.support.v7.view.menu.e$a, android.view.MenuItem, android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field d:Landroid/support/v7/view/menu/e$3;
       5: aload_0
       6: aload_2
       7: putfield      #24                 // Field a:Landroid/support/v7/view/menu/e$a;
      10: aload_0
      11: aload_3
      12: putfield      #26                 // Field b:Landroid/view/MenuItem;
      15: aload_0
      16: aload         4
      18: putfield      #28                 // Field c:Landroid/support/v7/view/menu/h;
      21: aload_0
      22: invokespecial #31                 // Method java/lang/Object."<init>":()V
      25: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Landroid/support/v7/view/menu/e$a;
       4: ifnull        40
       7: aload_0
       8: getfield      #22                 // Field d:Landroid/support/v7/view/menu/e$3;
      11: getfield      #36                 // Field android/support/v7/view/menu/e$3.a:Landroid/support/v7/view/menu/e;
      14: iconst_1
      15: putfield      #41                 // Field android/support/v7/view/menu/e.d:Z
      18: aload_0
      19: getfield      #24                 // Field a:Landroid/support/v7/view/menu/e$a;
      22: getfield      #45                 // Field android/support/v7/view/menu/e$a.b:Landroid/support/v7/view/menu/h;
      25: iconst_0
      26: invokevirtual #50                 // Method android/support/v7/view/menu/h.b:(Z)V
      29: aload_0
      30: getfield      #22                 // Field d:Landroid/support/v7/view/menu/e$3;
      33: getfield      #36                 // Field android/support/v7/view/menu/e$3.a:Landroid/support/v7/view/menu/e;
      36: iconst_0
      37: putfield      #41                 // Field android/support/v7/view/menu/e.d:Z
      40: aload_0
      41: getfield      #26                 // Field b:Landroid/view/MenuItem;
      44: invokeinterface #56,  1           // InterfaceMethod android/view/MenuItem.isEnabled:()Z
      49: ifeq          77
      52: aload_0
      53: getfield      #26                 // Field b:Landroid/view/MenuItem;
      56: invokeinterface #59,  1           // InterfaceMethod android/view/MenuItem.hasSubMenu:()Z
      61: ifeq          77
      64: aload_0
      65: getfield      #28                 // Field c:Landroid/support/v7/view/menu/h;
      68: aload_0
      69: getfield      #26                 // Field b:Landroid/view/MenuItem;
      72: iconst_4
      73: invokevirtual #62                 // Method android/support/v7/view/menu/h.a:(Landroid/view/MenuItem;I)Z
      76: pop
      77: return
}
