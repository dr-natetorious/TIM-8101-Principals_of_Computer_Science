class android.support.v7.app.o$2 implements android.support.v7.widget.Toolbar$c {
  final android.support.v7.app.o a;

  android.support.v7.app.o$2(android.support.v7.app.o);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/app/o;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean a(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/o;
       4: getfield      #23                 // Field android/support/v7/app/o.c:Landroid/view/Window$Callback;
       7: iconst_0
       8: aload_1
       9: invokeinterface #29,  3           // InterfaceMethod android/view/Window$Callback.onMenuItemSelected:(ILandroid/view/MenuItem;)Z
      14: ireturn
}
