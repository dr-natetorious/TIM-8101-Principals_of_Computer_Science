class ryey.easer.core.f$2 implements java.util.concurrent.Callable<java.lang.Void> {
  final java.lang.String a;

  final ryey.easer.core.f b;

  ryey.easer.core.f$2(ryey.easer.core.f, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/core/f;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Ljava/lang/String;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public java.lang.Void a();
    Code:
       0: invokestatic  #34                 // Method android/os/Message.obtain:()Landroid/os/Message;
       3: astore_1
       4: aload_1
       5: iconst_0
       6: putfield      #38                 // Field android/os/Message.what:I
       9: aload_1
      10: aload_0
      11: getfield      #19                 // Field b:Lryey/easer/core/f;
      14: getfield      #41                 // Field ryey/easer/core/f.a:Landroid/os/Messenger;
      17: putfield      #44                 // Field android/os/Message.replyTo:Landroid/os/Messenger;
      20: new           #46                 // class android/os/Bundle
      23: dup
      24: invokespecial #47                 // Method android/os/Bundle."<init>":()V
      27: astore_2
      28: aload_2
      29: ldc           #49                 // String ryey.easer.IPC.EXTRA.PLUGIN_ID
      31: aload_0
      32: getfield      #21                 // Field a:Ljava/lang/String;
      35: invokevirtual #53                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      38: aload_1
      39: aload_2
      40: invokevirtual #57                 // Method android/os/Message.setData:(Landroid/os/Bundle;)V
      43: aload_0
      44: getfield      #19                 // Field b:Lryey/easer/core/f;
      47: invokestatic  #60                 // Method ryey/easer/core/f.b:(Lryey/easer/core/f;)Landroid/os/Messenger;
      50: aload_1
      51: invokevirtual #66                 // Method android/os/Messenger.send:(Landroid/os/Message;)V
      54: goto          62
      57: astore_1
      58: aload_1
      59: invokestatic  #71                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      62: aconst_null
      63: areturn
    Exception table:
       from    to  target type
          43    54    57   Class android/os/RemoteException

  public java.lang.Object call();
    Code:
       0: aload_0
       1: invokevirtual #75                 // Method a:()Ljava/lang/Void;
       4: areturn
}
