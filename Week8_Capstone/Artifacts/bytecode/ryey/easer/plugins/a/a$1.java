class ryey.easer.plugins.a.a$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.a.a a;

  ryey.easer.plugins.a.a$1(ryey.easer.plugins.a.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/a/a;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #20                 // String self notifying Intent received. action: %s
       2: iconst_1
       3: anewarray     #22                 // class java/lang/Object
       6: dup
       7: iconst_0
       8: aload_2
       9: invokevirtual #28                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      12: aastore
      13: invokestatic  #33                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      16: aload_2
      17: invokevirtual #28                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      20: ldc           #35                 // String ryey.easer.tracker.SATISFIED
      22: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      25: ifeq          36
      28: aload_0
      29: getfield      #12                 // Field a:Lryey/easer/plugins/a/a;
      32: invokevirtual #44                 // Method ryey/easer/plugins/a/a.d:()V
      35: return
      36: aload_2
      37: invokevirtual #28                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      40: ldc           #46                 // String ryey.easer.tracker.UNSATISFIED
      42: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      45: ifeq          55
      48: aload_0
      49: getfield      #12                 // Field a:Lryey/easer/plugins/a/a;
      52: invokevirtual #49                 // Method ryey/easer/plugins/a/a.e:()V
      55: return
}
