class ryey.easer.core.f$3 implements java.util.concurrent.Callable<java.lang.Void> {
  final ryey.easer.core.f a;

  ryey.easer.core.f$3(ryey.easer.core.f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/f;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public java.lang.Void a();
    Code:
       0: invokestatic  #30                 // Method android/os/Message.obtain:()Landroid/os/Message;
       3: astore_1
       4: aload_1
       5: iconst_1
       6: putfield      #34                 // Field android/os/Message.what:I
       9: aload_1
      10: aload_0
      11: getfield      #17                 // Field a:Lryey/easer/core/f;
      14: getfield      #37                 // Field ryey/easer/core/f.a:Landroid/os/Messenger;
      17: putfield      #40                 // Field android/os/Message.replyTo:Landroid/os/Messenger;
      20: aload_0
      21: getfield      #17                 // Field a:Lryey/easer/core/f;
      24: invokestatic  #44                 // Method ryey/easer/core/f.b:(Lryey/easer/core/f;)Landroid/os/Messenger;
      27: aload_1
      28: invokevirtual #50                 // Method android/os/Messenger.send:(Landroid/os/Message;)V
      31: goto          39
      34: astore_1
      35: aload_1
      36: invokestatic  #55                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      39: aconst_null
      40: areturn
    Exception table:
       from    to  target type
          20    31    34   Class android/os/RemoteException

  public java.lang.Object call();
    Code:
       0: aload_0
       1: invokevirtual #59                 // Method a:()Ljava/lang/Void;
       4: areturn
}
