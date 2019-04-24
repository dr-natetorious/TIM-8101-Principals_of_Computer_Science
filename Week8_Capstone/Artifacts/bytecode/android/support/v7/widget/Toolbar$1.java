class android.support.v7.widget.Toolbar$1 implements android.support.v7.widget.ActionMenuView$e {
  final android.support.v7.widget.Toolbar a;

  android.support.v7.widget.Toolbar$1(android.support.v7.widget.Toolbar);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/widget/Toolbar;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean a(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: getfield      #23                 // Field android/support/v7/widget/Toolbar.d:Landroid/support/v7/widget/Toolbar$c;
       7: ifnull        24
      10: aload_0
      11: getfield      #14                 // Field a:Landroid/support/v7/widget/Toolbar;
      14: getfield      #23                 // Field android/support/v7/widget/Toolbar.d:Landroid/support/v7/widget/Toolbar$c;
      17: aload_1
      18: invokeinterface #27,  2           // InterfaceMethod android/support/v7/widget/Toolbar$c.a:(Landroid/view/MenuItem;)Z
      23: ireturn
      24: iconst_0
      25: ireturn
}
