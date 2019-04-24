class ryey.easer.plugins.a.k.e$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.a.k.e a;

  ryey.easer.plugins.a.k.e$1(ryey.easer.plugins.a.k.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/a/k/e;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #20                 // String android.net.wifi.STATE_CHANGE
       2: aload_2
       3: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       6: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifeq          164
      12: aload_2
      13: ldc           #34                 // String networkInfo
      15: invokevirtual #38                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      18: checkcast     #40                 // class android/net/NetworkInfo
      21: astore_3
      22: aload_3
      23: ifnonnull     35
      26: aload_0
      27: getfield      #12                 // Field a:Lryey/easer/plugins/a/k/e;
      30: aconst_null
      31: invokestatic  #43                 // Method ryey/easer/plugins/a/k/e.a:(Lryey/easer/plugins/a/k/e;Ljava/lang/Boolean;)V
      34: return
      35: aload_3
      36: invokevirtual #47                 // Method android/net/NetworkInfo.isConnected:()Z
      39: ifeq          103
      42: aload_2
      43: ldc           #49                 // String wifiInfo
      45: invokevirtual #38                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      48: checkcast     #51                 // class android/net/wifi/WifiInfo
      51: astore_3
      52: aload_3
      53: astore_2
      54: aload_3
      55: ifnonnull     94
      58: aload_1
      59: invokevirtual #57                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      62: ldc           #59                 // String wifi
      64: invokevirtual #63                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      67: checkcast     #65                 // class android/net/wifi/WifiManager
      70: astore_1
      71: aload_1
      72: ifnonnull     85
      75: ldc           #67                 // String [WifiTracker] WifiManager is null
      77: iconst_0
      78: anewarray     #69                 // class java/lang/Object
      81: invokestatic  #75                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      84: return
      85: aload_1
      86: invokevirtual #79                 // Method android/net/wifi/WifiManager.getConnectionInfo:()Landroid/net/wifi/WifiInfo;
      89: astore_2
      90: aload_2
      91: invokestatic  #82                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      94: aload_0
      95: getfield      #12                 // Field a:Lryey/easer/plugins/a/k/e;
      98: aload_2
      99: invokestatic  #85                 // Method ryey/easer/plugins/a/k/e.a:(Lryey/easer/plugins/a/k/e;Landroid/net/wifi/WifiInfo;)V
     102: return
     103: aload_3
     104: invokevirtual #88                 // Method android/net/NetworkInfo.isConnectedOrConnecting:()Z
     107: ifne          164
     110: aload_1
     111: invokevirtual #57                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
     114: ldc           #59                 // String wifi
     116: invokevirtual #63                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
     119: checkcast     #65                 // class android/net/wifi/WifiManager
     122: astore_1
     123: aload_1
     124: ifnonnull     137
     127: ldc           #67                 // String [WifiTracker] WifiManager is null
     129: iconst_0
     130: anewarray     #69                 // class java/lang/Object
     133: invokestatic  #75                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
     136: return
     137: aload_1
     138: invokevirtual #91                 // Method android/net/wifi/WifiManager.isWifiEnabled:()Z
     141: ifne          153
     144: aload_0
     145: getfield      #12                 // Field a:Lryey/easer/plugins/a/k/e;
     148: aconst_null
     149: invokestatic  #94                 // Method ryey/easer/plugins/a/k/e.b:(Lryey/easer/plugins/a/k/e;Ljava/lang/Boolean;)V
     152: return
     153: aload_0
     154: getfield      #12                 // Field a:Lryey/easer/plugins/a/k/e;
     157: iconst_0
     158: invokestatic  #100                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     161: invokestatic  #103                // Method ryey/easer/plugins/a/k/e.c:(Lryey/easer/plugins/a/k/e;Ljava/lang/Boolean;)V
     164: return
}
