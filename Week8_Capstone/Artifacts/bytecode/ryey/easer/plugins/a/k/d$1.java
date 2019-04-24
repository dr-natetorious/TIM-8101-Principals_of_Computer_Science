class ryey.easer.plugins.a.k.d$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.a.k.d a;

  ryey.easer.plugins.a.k.d$1(ryey.easer.plugins.a.k.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/a/k/d;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #20                 // String android.net.wifi.SCAN_RESULTS
       2: aload_2
       3: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       6: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifeq          19
      12: aload_0
      13: getfield      #12                 // Field a:Lryey/easer/plugins/a/k/d;
      16: invokestatic  #34                 // Method ryey/easer/plugins/a/k/d.a:(Lryey/easer/plugins/a/k/d;)V
      19: return
}
