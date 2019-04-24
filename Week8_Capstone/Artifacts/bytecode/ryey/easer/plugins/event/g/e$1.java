class ryey.easer.plugins.event.g.e$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.event.g.e a;

  ryey.easer.plugins.event.g.e$1(ryey.easer.plugins.event.g.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/g/e;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aload_2
       1: invokevirtual #24                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       4: astore_1
       5: aload_1
       6: invokevirtual #30                 // Method java/lang/String.hashCode:()I
       9: ldc           #31                 // int -1172645946
      11: if_icmpeq     17
      14: goto          31
      17: aload_1
      18: ldc           #33                 // String android.net.conn.CONNECTIVITY_CHANGE
      20: invokevirtual #37                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      23: ifeq          31
      26: iconst_0
      27: istore_3
      28: goto          33
      31: iconst_m1
      32: istore_3
      33: iload_3
      34: ifeq          38
      37: return
      38: aload_0
      39: getfield      #12                 // Field a:Lryey/easer/plugins/event/g/e;
      42: invokestatic  #39                 // Method ryey/easer/plugins/event/g/e.a:(Lryey/easer/plugins/event/g/e;)V
      45: return
}
