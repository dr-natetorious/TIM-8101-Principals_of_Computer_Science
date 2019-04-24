class android.support.v4.widget.d$a extends android.database.ContentObserver {
  final android.support.v4.widget.d a;

  android.support.v4.widget.d$a(android.support.v4.widget.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v4/widget/d;
       5: aload_0
       6: new           #14                 // class android/os/Handler
       9: dup
      10: invokespecial #17                 // Method android/os/Handler."<init>":()V
      13: invokespecial #20                 // Method android/database/ContentObserver."<init>":(Landroid/os/Handler;)V
      16: return

  public boolean deliverSelfNotifications();
    Code:
       0: iconst_1
       1: ireturn

  public void onChange(boolean);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v4/widget/d;
       4: invokevirtual #28                 // Method android/support/v4/widget/d.b:()V
       7: return
}
