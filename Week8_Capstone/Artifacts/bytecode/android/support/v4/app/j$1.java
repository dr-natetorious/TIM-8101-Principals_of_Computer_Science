class android.support.v4.app.j$1 extends android.os.Handler {
  final android.support.v4.app.j a;

  android.support.v4.app.j$1(android.support.v4.app.j);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v4/app/j;
       5: aload_0
       6: invokespecial #15                 // Method android/os/Handler."<init>":()V
       9: return

  public void handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #24                 // Field android/os/Message.what:I
       4: tableswitch   { // 1 to 2
                     1: 53
                     2: 34
               default: 28
          }
      28: aload_0
      29: aload_1
      30: invokespecial #26                 // Method android/os/Handler.handleMessage:(Landroid/os/Message;)V
      33: return
      34: aload_0
      35: getfield      #12                 // Field a:Landroid/support/v4/app/j;
      38: invokevirtual #29                 // Method android/support/v4/app/j.onResumeFragments:()V
      41: aload_0
      42: getfield      #12                 // Field a:Landroid/support/v4/app/j;
      45: getfield      #33                 // Field android/support/v4/app/j.mFragments:Landroid/support/v4/app/l;
      48: invokevirtual #39                 // Method android/support/v4/app/l.n:()Z
      51: pop
      52: return
      53: aload_0
      54: getfield      #12                 // Field a:Landroid/support/v4/app/j;
      57: getfield      #43                 // Field android/support/v4/app/j.mStopped:Z
      60: ifeq          71
      63: aload_0
      64: getfield      #12                 // Field a:Landroid/support/v4/app/j;
      67: iconst_0
      68: invokevirtual #47                 // Method android/support/v4/app/j.doReallyStop:(Z)V
      71: return
}
