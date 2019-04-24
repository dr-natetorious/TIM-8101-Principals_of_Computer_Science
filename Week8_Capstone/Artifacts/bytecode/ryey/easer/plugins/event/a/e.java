public class ryey.easer.plugins.event.a.e extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.a.a> {
  public ryey.easer.plugins.event.a.e(android.content.Context, ryey.easer.plugins.event.a.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #18                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/a/a;ZZ)V
       8: return

  ryey.easer.plugins.event.a.e(android.content.Context, ryey.easer.plugins.event.a.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #22                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/event/a/e$1
      13: dup
      14: aload_0
      15: invokespecial #25                 // Method ryey/easer/plugins/event/a/e$1."<init>":(Lryey/easer/plugins/event/a/e;)V
      18: putfield      #27                 // Field h:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #29                 // class android/content/IntentFilter
      25: dup
      26: invokespecial #32                 // Method android/content/IntentFilter."<init>":()V
      29: putfield      #34                 // Field i:Landroid/content/IntentFilter;
      32: aload_0
      33: getfield      #34                 // Field i:Landroid/content/IntentFilter;
      36: ldc           #36                 // String android.intent.action.ACTION_POWER_CONNECTED
      38: invokevirtual #40                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      41: aload_0
      42: getfield      #34                 // Field i:Landroid/content/IntentFilter;
      45: ldc           #42                 // String android.intent.action.ACTION_POWER_DISCONNECTED
      47: invokevirtual #40                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      50: aload_0
      51: aload_2
      52: getfield      #48                 // Field ryey/easer/plugins/event/a/a.a:Ljava/lang/Integer;
      55: invokevirtual #54                 // Method java/lang/Integer.intValue:()I
      58: putfield      #56                 // Field g:I
      61: return

  static void a(ryey.easer.plugins.event.a.e, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #61                 // Method b:(Z)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #66                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #27                 // Field h:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #34                 // Field i:Landroid/content/IntentFilter;
      12: invokevirtual #72                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #66                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #27                 // Field h:Landroid/content/BroadcastReceiver;
       8: invokevirtual #76                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
