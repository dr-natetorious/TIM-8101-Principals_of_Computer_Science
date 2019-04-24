class android.support.v7.app.b$1 implements android.view.View$OnClickListener {
  final android.support.v7.app.b a;

  android.support.v7.app.b$1(android.support.v7.app.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v7/app/b;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v7/app/b;
       4: getfield      #25                 // Field android/support/v7/app/b.a:Z
       7: ifeq          18
      10: aload_0
      11: getfield      #16                 // Field a:Landroid/support/v7/app/b;
      14: invokevirtual #28                 // Method android/support/v7/app/b.b:()V
      17: return
      18: aload_0
      19: getfield      #16                 // Field a:Landroid/support/v7/app/b;
      22: getfield      #31                 // Field android/support/v7/app/b.b:Landroid/view/View$OnClickListener;
      25: ifnull        41
      28: aload_0
      29: getfield      #16                 // Field a:Landroid/support/v7/app/b;
      32: getfield      #31                 // Field android/support/v7/app/b.b:Landroid/view/View$OnClickListener;
      35: aload_1
      36: invokeinterface #33,  2           // InterfaceMethod android/view/View$OnClickListener.onClick:(Landroid/view/View;)V
      41: return
}
