class ryey.easer.core.a$b$1 implements android.content.ServiceConnection {
  final ryey.easer.core.a$b a;

  ryey.easer.core.a$b$1(ryey.easer.core.a$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Lryey/easer/core/a$b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onServiceConnected(android.content.ComponentName, android.os.IBinder);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Lryey/easer/core/a$b;
       4: invokestatic  #26                 // Method ryey/easer/core/a$b.a:(Lryey/easer/core/a$b;)Lryey/easer/core/a$a;
       7: aload_2
       8: checkcast     #28                 // class ryey/easer/core/ProfileLoaderService$a
      11: invokevirtual #33                 // Method ryey/easer/core/a$a.a:(Lryey/easer/core/ProfileLoaderService$a;)V
      14: return

  public void onServiceDisconnected(android.content.ComponentName);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Lryey/easer/core/a$b;
       4: invokestatic  #26                 // Method ryey/easer/core/a$b.a:(Lryey/easer/core/a$b;)Lryey/easer/core/a$a;
       7: invokevirtual #37                 // Method ryey/easer/core/a$a.a:()V
      10: return
}
