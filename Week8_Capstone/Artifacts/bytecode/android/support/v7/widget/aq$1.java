class android.support.v7.widget.aq$1 implements java.lang.Runnable {
  final android.support.v7.widget.aq a;

  android.support.v7.widget.aq$1(android.support.v7.widget.aq);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/widget/aq;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/aq;
       4: sipush        500
       7: invokevirtual #22                 // Method android/support/v7/widget/aq.a:(I)V
      10: return
}
