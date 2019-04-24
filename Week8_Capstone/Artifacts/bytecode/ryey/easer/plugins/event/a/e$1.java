class ryey.easer.plugins.event.a.e$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.event.a.e a;

  ryey.easer.plugins.event.a.e$1(ryey.easer.plugins.event.a.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/a/e;
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
       9: istore_3
      10: iload_3
      11: ldc           #31                 // int -1886648615
      13: if_icmpeq     39
      16: iload_3
      17: ldc           #32                 // int 1019184907
      19: if_icmpeq     25
      22: goto          53
      25: aload_1
      26: ldc           #34                 // String android.intent.action.ACTION_POWER_CONNECTED
      28: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      31: ifeq          53
      34: iconst_0
      35: istore_3
      36: goto          55
      39: aload_1
      40: ldc           #40                 // String android.intent.action.ACTION_POWER_DISCONNECTED
      42: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      45: ifeq          53
      48: iconst_1
      49: istore_3
      50: goto          55
      53: iconst_m1
      54: istore_3
      55: iload_3
      56: tableswitch   { // 0 to 1
                     0: 90
                     1: 81
               default: 80
          }
      80: return
      81: aload_0
      82: getfield      #12                 // Field a:Lryey/easer/plugins/event/a/e;
      85: iconst_0
      86: invokestatic  #43                 // Method ryey/easer/plugins/event/a/e.a:(Lryey/easer/plugins/event/a/e;Z)V
      89: return
      90: aload_0
      91: getfield      #12                 // Field a:Lryey/easer/plugins/event/a/e;
      94: iconst_1
      95: invokestatic  #43                 // Method ryey/easer/plugins/event/a/e.a:(Lryey/easer/plugins/event/a/e;Z)V
      98: return
}
