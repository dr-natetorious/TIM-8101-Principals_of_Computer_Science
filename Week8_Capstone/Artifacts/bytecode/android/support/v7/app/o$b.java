final class android.support.v7.app.o$b implements android.support.v7.view.menu.h$a {
  final android.support.v7.app.o a;

  android.support.v7.app.o$b(android.support.v7.app.o);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/app/o;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v7/app/o;
       4: getfield      #24                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
       7: ifnull        75
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/v7/app/o;
      14: getfield      #27                 // Field android/support/v7/app/o.a:Landroid/support/v7/widget/al;
      17: invokeinterface #33,  1           // InterfaceMethod android/support/v7/widget/al.i:()Z
      22: ifeq          41
      25: aload_0
      26: getfield      #15                 // Field a:Landroid/support/v7/app/o;
      29: getfield      #24                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
      32: bipush        108
      34: aload_1
      35: invokeinterface #39,  3           // InterfaceMethod android/view/Window$Callback.onPanelClosed:(ILandroid/view/Menu;)V
      40: return
      41: aload_0
      42: getfield      #15                 // Field a:Landroid/support/v7/app/o;
      45: getfield      #24                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
      48: iconst_0
      49: aconst_null
      50: aload_1
      51: invokeinterface #43,  4           // InterfaceMethod android/view/Window$Callback.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
      56: ifeq          75
      59: aload_0
      60: getfield      #15                 // Field a:Landroid/support/v7/app/o;
      63: getfield      #24                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
      66: bipush        108
      68: aload_1
      69: invokeinterface #47,  3           // InterfaceMethod android/view/Window$Callback.onMenuOpened:(ILandroid/view/Menu;)Z
      74: pop
      75: return

  public boolean a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: iconst_0
       1: ireturn
}
