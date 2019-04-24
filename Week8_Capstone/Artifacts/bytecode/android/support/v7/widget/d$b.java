class android.support.v7.widget.d$b extends android.support.v7.view.menu.ActionMenuItemView$b {
  final android.support.v7.widget.d a;

  android.support.v7.widget.d$b(android.support.v7.widget.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v7/widget/d;
       5: aload_0
       6: invokespecial #16                 // Method android/support/v7/view/menu/ActionMenuItemView$b."<init>":()V
       9: return

  public android.support.v7.view.menu.s a();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/d;
       4: getfield      #22                 // Field android/support/v7/widget/d.i:Landroid/support/v7/widget/d$a;
       7: ifnull        21
      10: aload_0
      11: getfield      #13                 // Field a:Landroid/support/v7/widget/d;
      14: getfield      #22                 // Field android/support/v7/widget/d.i:Landroid/support/v7/widget/d$a;
      17: invokevirtual #27                 // Method android/support/v7/widget/d$a.b:()Landroid/support/v7/view/menu/m;
      20: areturn
      21: aconst_null
      22: areturn
}
