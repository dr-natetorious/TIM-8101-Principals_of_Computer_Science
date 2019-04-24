class ryey.easer.plugins.event.p.a$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.event.p.a a;

  ryey.easer.plugins.event.p.a$1(ryey.easer.plugins.event.p.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/p/a;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #20                 // String android.net.wifi.STATE_CHANGE
       2: aload_2
       3: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       6: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifeq          95
      12: aload_2
      13: ldc           #34                 // String networkInfo
      15: invokevirtual #38                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      18: checkcast     #40                 // class android/net/NetworkInfo
      21: astore_3
      22: aload_3
      23: ifnonnull     35
      26: aload_0
      27: getfield      #12                 // Field a:Lryey/easer/plugins/event/p/a;
      30: iconst_0
      31: invokestatic  #43                 // Method ryey/easer/plugins/event/p/a.a:(Lryey/easer/plugins/event/p/a;Z)V
      34: return
      35: aload_3
      36: invokevirtual #47                 // Method android/net/NetworkInfo.isConnected:()Z
      39: ifeq          61
      42: aload_2
      43: ldc           #49                 // String wifiInfo
      45: invokevirtual #38                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      48: checkcast     #51                 // class android/net/wifi/WifiInfo
      51: astore_1
      52: aload_0
      53: getfield      #12                 // Field a:Lryey/easer/plugins/event/p/a;
      56: aload_1
      57: invokestatic  #54                 // Method ryey/easer/plugins/event/p/a.a:(Lryey/easer/plugins/event/p/a;Landroid/net/wifi/WifiInfo;)V
      60: return
      61: aload_3
      62: invokevirtual #57                 // Method android/net/NetworkInfo.isConnectedOrConnecting:()Z
      65: ifne          95
      68: aload_1
      69: invokevirtual #63                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      72: ldc           #65                 // String wifi
      74: invokevirtual #69                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      77: checkcast     #71                 // class android/net/wifi/WifiManager
      80: invokevirtual #74                 // Method android/net/wifi/WifiManager.isWifiEnabled:()Z
      83: ifne          87
      86: return
      87: aload_0
      88: getfield      #12                 // Field a:Lryey/easer/plugins/event/p/a;
      91: iconst_0
      92: invokestatic  #77                 // Method ryey/easer/plugins/event/p/a.b:(Lryey/easer/plugins/event/p/a;Z)V
      95: return
}
