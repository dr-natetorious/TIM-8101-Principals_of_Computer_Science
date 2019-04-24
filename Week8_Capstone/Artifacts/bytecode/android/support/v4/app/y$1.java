class android.support.v4.app.y$1 implements java.lang.Runnable {
  final android.support.v4.app.y a;

  android.support.v4.app.y$1(android.support.v4.app.y);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v4/app/y;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v4/app/y;
       4: getfield      #23                 // Field android/support/v4/app/y.b:Landroid/widget/ListView;
       7: aload_0
       8: getfield      #14                 // Field a:Landroid/support/v4/app/y;
      11: getfield      #23                 // Field android/support/v4/app/y.b:Landroid/widget/ListView;
      14: invokevirtual #29                 // Method android/widget/ListView.focusableViewAvailable:(Landroid/view/View;)V
      17: return
}
