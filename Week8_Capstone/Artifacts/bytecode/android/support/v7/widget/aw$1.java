class android.support.v7.widget.aw$1 implements java.lang.Runnable {
  final android.support.v7.widget.aw a;

  android.support.v7.widget.aw$1(android.support.v7.widget.aw);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/widget/aw;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/aw;
       4: invokevirtual #26                 // Method android/support/v7/widget/aw.i:()Landroid/view/View;
       7: astore_1
       8: aload_1
       9: ifnull        26
      12: aload_1
      13: invokevirtual #32                 // Method android/view/View.getWindowToken:()Landroid/os/IBinder;
      16: ifnull        26
      19: aload_0
      20: getfield      #17                 // Field a:Landroid/support/v7/widget/aw;
      23: invokevirtual #35                 // Method android/support/v7/widget/aw.d:()V
      26: return
}
