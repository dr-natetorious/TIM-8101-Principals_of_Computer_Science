class android.support.v4.a.c$1 extends android.os.Handler {
  final android.support.v4.a.c a;

  android.support.v4.a.c$1(android.support.v4.a.c, android.os.Looper);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v4/a/c;
       5: aload_0
       6: aload_2
       7: invokespecial #17                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
      10: return

  public void handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #26                 // Field android/os/Message.what:I
       4: iconst_1
       5: if_icmpeq     14
       8: aload_0
       9: aload_1
      10: invokespecial #28                 // Method android/os/Handler.handleMessage:(Landroid/os/Message;)V
      13: return
      14: aload_0
      15: getfield      #14                 // Field a:Landroid/support/v4/a/c;
      18: invokestatic  #31                 // Method android/support/v4/a/c.a:(Landroid/support/v4/a/c;)V
      21: return
}
