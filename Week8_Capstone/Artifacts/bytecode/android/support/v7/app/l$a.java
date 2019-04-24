final class android.support.v7.app.l$a implements android.support.v7.view.menu.o$a {
  final android.support.v7.app.l a;

  android.support.v7.app.l$a(android.support.v7.app.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/app/l;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/l;
       4: aload_1
       5: invokevirtual #23                 // Method android/support/v7/app/l.b:(Landroid/support/v7/view/menu/h;)V
       8: return

  public boolean a(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/l;
       4: invokevirtual #28                 // Method android/support/v7/app/l.r:()Landroid/view/Window$Callback;
       7: astore_2
       8: aload_2
       9: ifnull        22
      12: aload_2
      13: bipush        108
      15: aload_1
      16: invokeinterface #34,  3           // InterfaceMethod android/view/Window$Callback.onMenuOpened:(ILandroid/view/Menu;)Z
      21: pop
      22: iconst_1
      23: ireturn
}
