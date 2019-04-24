public class ryey.easer.plugins.event.p.a extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.p.b> {
  ryey.easer.plugins.event.p.a(android.content.Context, ryey.easer.plugins.event.p.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #16                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/p/b;ZZ)V
       8: return

  ryey.easer.plugins.event.p.a(android.content.Context, ryey.easer.plugins.event.p.b, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #20                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/event/p/a$1
      13: dup
      14: aload_0
      15: invokespecial #23                 // Method ryey/easer/plugins/event/p/a$1."<init>":(Lryey/easer/plugins/event/p/a;)V
      18: putfield      #25                 // Field g:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #27                 // class android/content/IntentFilter
      25: dup
      26: invokespecial #30                 // Method android/content/IntentFilter."<init>":()V
      29: putfield      #32                 // Field h:Landroid/content/IntentFilter;
      32: aload_0
      33: getfield      #32                 // Field h:Landroid/content/IntentFilter;
      36: ldc           #34                 // String android.net.wifi.STATE_CHANGE
      38: invokevirtual #38                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      41: return

  static void a(ryey.easer.plugins.event.p.a, android.net.wifi.WifiInfo);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #55                 // Method a:(Landroid/net/wifi/WifiInfo;)V
       5: return

  static void a(ryey.easer.plugins.event.p.a, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #52                 // Method a:(Z)V
       5: return

  static void b(ryey.easer.plugins.event.p.a, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #52                 // Method a:(Z)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #90                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #25                 // Field g:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #32                 // Field h:Landroid/content/IntentFilter;
      12: invokevirtual #96                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #90                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #25                 // Field g:Landroid/content/BroadcastReceiver;
       8: invokevirtual #100                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
