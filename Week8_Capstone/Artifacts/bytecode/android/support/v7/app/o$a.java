final class android.support.v7.app.o$a implements android.support.v7.view.menu.o$a {
  final android.support.v7.app.o a;

  android.support.v7.app.o$a(android.support.v7.app.o);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v7/app/o;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: iconst_1
      10: putfield      #23                 // Field b:Z
      13: aload_0
      14: getfield      #16                 // Field a:Landroid/support/v7/app/o;
      17: getfield      #26                 // Field android/support/v7/app/o.a:Landroid/support/v7/widget/al;
      20: invokeinterface #31,  1           // InterfaceMethod android/support/v7/widget/al.n:()V
      25: aload_0
      26: getfield      #16                 // Field a:Landroid/support/v7/app/o;
      29: getfield      #35                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
      32: ifnull        50
      35: aload_0
      36: getfield      #16                 // Field a:Landroid/support/v7/app/o;
      39: getfield      #35                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
      42: bipush        108
      44: aload_1
      45: invokeinterface #41,  3           // InterfaceMethod android/view/Window$Callback.onPanelClosed:(ILandroid/view/Menu;)V
      50: aload_0
      51: iconst_0
      52: putfield      #23                 // Field b:Z
      55: return

  public boolean a(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v7/app/o;
       4: getfield      #35                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
       7: ifnull        28
      10: aload_0
      11: getfield      #16                 // Field a:Landroid/support/v7/app/o;
      14: getfield      #35                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
      17: bipush        108
      19: aload_1
      20: invokeinterface #46,  3           // InterfaceMethod android/view/Window$Callback.onMenuOpened:(ILandroid/view/Menu;)Z
      25: pop
      26: iconst_1
      27: ireturn
      28: iconst_0
      29: ireturn
}
