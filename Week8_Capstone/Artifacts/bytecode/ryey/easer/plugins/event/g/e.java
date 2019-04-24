class ryey.easer.plugins.event.g.e extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.g.a> {
  public ryey.easer.plugins.event.g.e(android.content.Context, ryey.easer.plugins.event.g.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #19                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/g/a;ZZ)V
       8: return

  ryey.easer.plugins.event.g.e(android.content.Context, ryey.easer.plugins.event.g.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #23                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/event/g/e$1
      13: dup
      14: aload_0
      15: invokespecial #26                 // Method ryey/easer/plugins/event/g/e$1."<init>":(Lryey/easer/plugins/event/g/e;)V
      18: putfield      #28                 // Field h:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #30                 // class android/content/IntentFilter
      25: dup
      26: invokespecial #33                 // Method android/content/IntentFilter."<init>":()V
      29: putfield      #35                 // Field i:Landroid/content/IntentFilter;
      32: aload_0
      33: getfield      #35                 // Field i:Landroid/content/IntentFilter;
      36: ldc           #37                 // String android.net.conn.CONNECTIVITY_CHANGE
      38: invokevirtual #41                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      41: aload_0
      42: aload_2
      43: getfield      #46                 // Field ryey/easer/plugins/event/g/a.a:Ljava/util/Set;
      46: putfield      #48                 // Field g:Ljava/util/Set;
      49: return

  static void a(ryey.easer.plugins.event.g.e);
    Code:
       0: aload_0
       1: invokespecial #74                 // Method c:()V
       4: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #77                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #28                 // Field h:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #35                 // Field i:Landroid/content/IntentFilter;
      12: invokevirtual #99                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #77                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #28                 // Field h:Landroid/content/BroadcastReceiver;
       8: invokevirtual #104                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
