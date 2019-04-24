class android.support.v7.widget.bq$1 implements android.view.View$OnClickListener {
  final android.support.v7.view.menu.a a;

  final android.support.v7.widget.bq b;

  android.support.v7.widget.bq$1(android.support.v7.widget.bq);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/support/v7/widget/bq;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: new           #23                 // class android/support/v7/view/menu/a
      13: dup
      14: aload_0
      15: getfield      #18                 // Field b:Landroid/support/v7/widget/bq;
      18: getfield      #26                 // Field android/support/v7/widget/bq.a:Landroid/support/v7/widget/Toolbar;
      21: invokevirtual #32                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
      24: iconst_0
      25: ldc           #33                 // int 16908332
      27: iconst_0
      28: iconst_0
      29: aload_0
      30: getfield      #18                 // Field b:Landroid/support/v7/widget/bq;
      33: getfield      #36                 // Field android/support/v7/widget/bq.b:Ljava/lang/CharSequence;
      36: invokespecial #39                 // Method android/support/v7/view/menu/a."<init>":(Landroid/content/Context;IIIILjava/lang/CharSequence;)V
      39: putfield      #41                 // Field a:Landroid/support/v7/view/menu/a;
      42: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #18                 // Field b:Landroid/support/v7/widget/bq;
       4: getfield      #48                 // Field android/support/v7/widget/bq.c:Landroid/view/Window$Callback;
       7: ifnull        38
      10: aload_0
      11: getfield      #18                 // Field b:Landroid/support/v7/widget/bq;
      14: getfield      #52                 // Field android/support/v7/widget/bq.d:Z
      17: ifeq          38
      20: aload_0
      21: getfield      #18                 // Field b:Landroid/support/v7/widget/bq;
      24: getfield      #48                 // Field android/support/v7/widget/bq.c:Landroid/view/Window$Callback;
      27: iconst_0
      28: aload_0
      29: getfield      #41                 // Field a:Landroid/support/v7/view/menu/a;
      32: invokeinterface #58,  3           // InterfaceMethod android/view/Window$Callback.onMenuItemSelected:(ILandroid/view/MenuItem;)Z
      37: pop
      38: return
}
