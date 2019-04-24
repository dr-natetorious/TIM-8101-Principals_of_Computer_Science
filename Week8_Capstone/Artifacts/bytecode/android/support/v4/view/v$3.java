class android.support.v4.view.v$3 implements java.lang.Runnable {
  final android.support.v4.view.v a;

  android.support.v4.view.v$3(android.support.v4.view.v);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v4/view/v;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v4/view/v;
       4: iconst_0
       5: invokevirtual #23                 // Method android/support/v4/view/v.setScrollState:(I)V
       8: aload_0
       9: getfield      #14                 // Field a:Landroid/support/v4/view/v;
      12: invokevirtual #26                 // Method android/support/v4/view/v.populate:()V
      15: return
}
