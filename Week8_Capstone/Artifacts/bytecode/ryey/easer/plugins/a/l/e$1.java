class ryey.easer.plugins.a.l.e$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.a.l.e a;

  ryey.easer.plugins.a.l.e$1(ryey.easer.plugins.a.l.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/a/l/e;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #20                 // String android.net.wifi.WIFI_STATE_CHANGED
       2: aload_2
       3: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       6: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifeq          88
      12: aload_2
      13: ldc           #34                 // String wifi_state
      15: iconst_4
      16: invokevirtual #38                 // Method android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
      19: istore_3
      20: iload_3
      21: iconst_1
      22: if_icmpeq     63
      25: iload_3
      26: iconst_3
      27: if_icmpeq     39
      30: aload_0
      31: getfield      #12                 // Field a:Lryey/easer/plugins/a/l/e;
      34: aconst_null
      35: invokestatic  #42                 // Method ryey/easer/plugins/a/l/e.c:(Lryey/easer/plugins/a/l/e;Ljava/lang/Boolean;)V
      38: return
      39: aload_0
      40: getfield      #12                 // Field a:Lryey/easer/plugins/a/l/e;
      43: aload_0
      44: getfield      #12                 // Field a:Lryey/easer/plugins/a/l/e;
      47: invokestatic  #46                 // Method ryey/easer/plugins/a/l/e.b:(Lryey/easer/plugins/a/l/e;)Lryey/easer/commons/local_plugin/a/a;
      50: checkcast     #48                 // class ryey/easer/plugins/a/l/a
      53: getfield      #51                 // Field ryey/easer/plugins/a/l/a.a:Z
      56: invokestatic  #57                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      59: invokestatic  #59                 // Method ryey/easer/plugins/a/l/e.b:(Lryey/easer/plugins/a/l/e;Ljava/lang/Boolean;)V
      62: return
      63: aload_0
      64: getfield      #12                 // Field a:Lryey/easer/plugins/a/l/e;
      67: iconst_1
      68: aload_0
      69: getfield      #12                 // Field a:Lryey/easer/plugins/a/l/e;
      72: invokestatic  #61                 // Method ryey/easer/plugins/a/l/e.a:(Lryey/easer/plugins/a/l/e;)Lryey/easer/commons/local_plugin/a/a;
      75: checkcast     #48                 // class ryey/easer/plugins/a/l/a
      78: getfield      #51                 // Field ryey/easer/plugins/a/l/a.a:Z
      81: ixor
      82: invokestatic  #57                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      85: invokestatic  #63                 // Method ryey/easer/plugins/a/l/e.a:(Lryey/easer/plugins/a/l/e;Ljava/lang/Boolean;)V
      88: return
}
