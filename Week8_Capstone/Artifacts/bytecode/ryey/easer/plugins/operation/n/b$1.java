class ryey.easer.plugins.operation.n.b$1 implements android.content.ServiceConnection {
  final ryey.easer.plugins.operation.n.b a;

  ryey.easer.plugins.operation.n.b$1(ryey.easer.plugins.operation.n.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lryey/easer/plugins/operation/n/b;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onServiceConnected(android.content.ComponentName, android.os.IBinder);
    Code:
       0: aload_2
       1: checkcast     #22                 // class ryey/easer/core/EHService$a
       4: aload_0
       5: getfield      #14                 // Field a:Lryey/easer/plugins/operation/n/b;
       8: invokestatic  #25                 // Method ryey/easer/plugins/operation/n/b.a:(Lryey/easer/plugins/operation/n/b;)Lryey/easer/plugins/operation/n/c;
      11: getfield      #30                 // Field ryey/easer/plugins/operation/n/c.a:Ljava/lang/String;
      14: aload_0
      15: getfield      #14                 // Field a:Lryey/easer/plugins/operation/n/b;
      18: invokestatic  #25                 // Method ryey/easer/plugins/operation/n/b.a:(Lryey/easer/plugins/operation/n/b;)Lryey/easer/plugins/operation/n/c;
      21: getfield      #34                 // Field ryey/easer/plugins/operation/n/c.b:Z
      24: invokevirtual #37                 // Method ryey/easer/core/EHService$a.a:(Ljava/lang/String;Z)Z
      27: pop
      28: aload_0
      29: getfield      #14                 // Field a:Lryey/easer/plugins/operation/n/b;
      32: invokestatic  #40                 // Method ryey/easer/plugins/operation/n/b.b:(Lryey/easer/plugins/operation/n/b;)Landroid/content/Context;
      35: aload_0
      36: invokevirtual #46                 // Method android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
      39: return

  public void onServiceDisconnected(android.content.ComponentName);
    Code:
       0: return
}
