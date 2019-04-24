class ryey.easer.core.f$4 implements java.util.concurrent.Callable<java.lang.Void> {
  final java.lang.String a;

  final ryey.easer.c.a b;

  final ryey.easer.core.f c;

  ryey.easer.core.f$4(ryey.easer.core.f, java.lang.String, ryey.easer.c.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field c:Lryey/easer/core/f;
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Ljava/lang/String;
      10: aload_0
      11: aload_3
      12: putfield      #25                 // Field b:Lryey/easer/c/a;
      15: aload_0
      16: invokespecial #28                 // Method java/lang/Object."<init>":()V
      19: return

  public java.lang.Void a();
    Code:
       0: invokestatic  #38                 // Method android/os/Message.obtain:()Landroid/os/Message;
       3: astore_1
       4: aload_1
       5: iconst_3
       6: putfield      #42                 // Field android/os/Message.what:I
       9: aload_1
      10: invokevirtual #46                 // Method android/os/Message.getData:()Landroid/os/Bundle;
      13: ldc           #48                 // String ryey.easer.IPC.EXTRA.PLUGIN_ID
      15: aload_0
      16: getfield      #23                 // Field a:Ljava/lang/String;
      19: invokevirtual #54                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      22: aload_1
      23: invokevirtual #46                 // Method android/os/Message.getData:()Landroid/os/Bundle;
      26: ldc           #56                 // String ryey.easer.IPC.EXTRA.PLUGIN_DATA
      28: aload_0
      29: getfield      #25                 // Field b:Lryey/easer/c/a;
      32: invokevirtual #60                 // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      35: aload_0
      36: getfield      #21                 // Field c:Lryey/easer/core/f;
      39: invokestatic  #63                 // Method ryey/easer/core/f.b:(Lryey/easer/core/f;)Landroid/os/Messenger;
      42: aload_1
      43: invokevirtual #69                 // Method android/os/Messenger.send:(Landroid/os/Message;)V
      46: goto          54
      49: astore_1
      50: aload_1
      51: invokestatic  #74                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      54: aconst_null
      55: areturn
    Exception table:
       from    to  target type
          35    46    49   Class android/os/RemoteException

  public java.lang.Object call();
    Code:
       0: aload_0
       1: invokevirtual #78                 // Method a:()Ljava/lang/Void;
       4: areturn
}
