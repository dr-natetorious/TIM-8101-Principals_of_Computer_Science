public class ryey.easer.plugins.a.k.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.k.a> {
  ryey.easer.plugins.a.k.e(android.content.Context, ryey.easer.plugins.a.k.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #16                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/a/k/e$1
      13: dup
      14: aload_0
      15: invokespecial #19                 // Method ryey/easer/plugins/a/k/e$1."<init>":(Lryey/easer/plugins/a/k/e;)V
      18: putfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #23                 // class android/content/IntentFilter
      25: dup
      26: invokespecial #26                 // Method android/content/IntentFilter."<init>":()V
      29: putfield      #28                 // Field b:Landroid/content/IntentFilter;
      32: aload_0
      33: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      36: ldc           #30                 // String android.net.wifi.STATE_CHANGE
      38: invokevirtual #34                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      41: aload_1
      42: invokevirtual #40                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      45: ldc           #42                 // String wifi
      47: invokevirtual #46                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      50: checkcast     #48                 // class android/net/wifi/WifiManager
      53: astore_1
      54: aload_1
      55: ifnonnull     68
      58: ldc           #50                 // String [WifiTracker] WifiManager is null
      60: iconst_0
      61: anewarray     #52                 // class java/lang/Object
      64: invokestatic  #58                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      67: return
      68: aload_1
      69: invokevirtual #62                 // Method android/net/wifi/WifiManager.isWifiEnabled:()Z
      72: ifeq          83
      75: aload_0
      76: aload_1
      77: invokevirtual #66                 // Method android/net/wifi/WifiManager.getConnectionInfo:()Landroid/net/wifi/WifiInfo;
      80: invokespecial #69                 // Method a:(Landroid/net/wifi/WifiInfo;)V
      83: return

  static void a(ryey.easer.plugins.a.k.e, android.net.wifi.WifiInfo);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #69                 // Method a:(Landroid/net/wifi/WifiInfo;)V
       5: return

  static void a(ryey.easer.plugins.a.k.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #88                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static void b(ryey.easer.plugins.a.k.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #88                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static void c(ryey.easer.plugins.a.k.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #88                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #126                // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      12: invokevirtual #130                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #126                // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: invokevirtual #134                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
