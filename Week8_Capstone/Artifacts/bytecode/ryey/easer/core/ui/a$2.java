class ryey.easer.core.ui.a$2 implements android.content.ServiceConnection {
  final ryey.easer.core.ui.a a;

  ryey.easer.core.ui.a$2(ryey.easer.core.ui.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lryey/easer/core/ui/a;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onServiceConnected(android.content.ComponentName, android.os.IBinder);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lryey/easer/core/ui/a;
       4: aload_2
       5: checkcast     #22                 // class ryey/easer/core/log/ActivityLogService$a
       8: putfield      #26                 // Field ryey/easer/core/ui/a.e:Lryey/easer/core/log/ActivityLogService$a;
      11: aload_0
      12: getfield      #14                 // Field a:Lryey/easer/core/ui/a;
      15: getfield      #30                 // Field ryey/easer/core/ui/a.d:Z
      18: ifeq          36
      21: aload_0
      22: getfield      #14                 // Field a:Lryey/easer/core/ui/a;
      25: invokestatic  #33                 // Method ryey/easer/core/ui/a.b:(Lryey/easer/core/ui/a;)V
      28: aload_0
      29: getfield      #14                 // Field a:Lryey/easer/core/ui/a;
      32: iconst_0
      33: putfield      #30                 // Field ryey/easer/core/ui/a.d:Z
      36: return

  public void onServiceDisconnected(android.content.ComponentName);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lryey/easer/core/ui/a;
       4: aconst_null
       5: putfield      #26                 // Field ryey/easer/core/ui/a.e:Lryey/easer/core/log/ActivityLogService$a;
       8: return
}
