public class ryey.easer.plugins.a.l.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.l.a> {
  ryey.easer.plugins.a.l.e(android.content.Context, ryey.easer.plugins.a.l.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #18                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/a/l/e$1
      13: dup
      14: aload_0
      15: invokespecial #21                 // Method ryey/easer/plugins/a/l/e$1."<init>":(Lryey/easer/plugins/a/l/e;)V
      18: putfield      #23                 // Field b:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #25                 // class android/content/IntentFilter
      25: dup
      26: ldc           #27                 // String android.net.wifi.WIFI_STATE_CHANGED
      28: invokespecial #30                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      31: putfield      #32                 // Field c:Landroid/content/IntentFilter;
      34: aload_0
      35: aload_1
      36: invokevirtual #38                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      39: ldc           #40                 // String wifi
      41: invokevirtual #44                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      44: checkcast     #46                 // class android/net/wifi/WifiManager
      47: putfield      #48                 // Field a:Landroid/net/wifi/WifiManager;
      50: return

  static ryey.easer.commons.local_plugin.a.a a(ryey.easer.plugins.a.l.e);
    Code:
       0: aload_0
       1: getfield      #54                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void a(ryey.easer.plugins.a.l.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #58                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static ryey.easer.commons.local_plugin.a.a b(ryey.easer.plugins.a.l.e);
    Code:
       0: aload_0
       1: getfield      #54                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void b(ryey.easer.plugins.a.l.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #58                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static void c(ryey.easer.plugins.a.l.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #58                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #63                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #23                 // Field b:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #32                 // Field c:Landroid/content/IntentFilter;
      12: invokevirtual #67                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #63                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #23                 // Field b:Landroid/content/BroadcastReceiver;
       8: invokevirtual #71                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return

  public java.lang.Boolean c();
    Code:
       0: aload_0
       1: getfield      #48                 // Field a:Landroid/net/wifi/WifiManager;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #48                 // Field a:Landroid/net/wifi/WifiManager;
      13: invokevirtual #76                 // Method android/net/wifi/WifiManager.isWifiEnabled:()Z
      16: invokestatic  #82                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      19: areturn
}
