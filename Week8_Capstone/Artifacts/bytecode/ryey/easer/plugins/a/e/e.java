public class ryey.easer.plugins.a.e.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.e.a> {
  ryey.easer.plugins.a.e.e(android.content.Context, ryey.easer.plugins.a.e.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #16                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/a/e/e$1
      13: dup
      14: aload_0
      15: invokespecial #19                 // Method ryey/easer/plugins/a/e/e$1."<init>":(Lryey/easer/plugins/a/e/e;)V
      18: putfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #23                 // class android/content/IntentFilter
      25: dup
      26: invokespecial #26                 // Method android/content/IntentFilter."<init>":()V
      29: putfield      #28                 // Field b:Landroid/content/IntentFilter;
      32: aload_0
      33: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      36: ldc           #30                 // String android.net.conn.CONNECTIVITY_CHANGE
      38: invokevirtual #34                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      41: aload_0
      42: invokespecial #37                 // Method d:()V
      45: return

  static void a(ryey.easer.plugins.a.e.e);
    Code:
       0: aload_0
       1: invokespecial #37                 // Method d:()V
       4: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #78                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      12: invokevirtual #100                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #78                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: invokevirtual #104                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
