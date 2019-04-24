public class ryey.easer.plugins.a.c.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.c.a> {
  static {};
    Code:
       0: new           #17                 // class android/content/IntentFilter
       3: dup
       4: ldc           #19                 // String android.bluetooth.adapter.action.STATE_CHANGED
       6: invokespecial #23                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
       9: putstatic     #25                 // Field c:Landroid/content/IntentFilter;
      12: return

  ryey.easer.plugins.a.c.e(android.content.Context, ryey.easer.plugins.a.c.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #30                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/a/c/e$1
      13: dup
      14: aload_0
      15: invokespecial #33                 // Method ryey/easer/plugins/a/c/e$1."<init>":(Lryey/easer/plugins/a/c/e;)V
      18: putfield      #35                 // Field b:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: invokestatic  #41                 // Method android/bluetooth/BluetoothAdapter.getDefaultAdapter:()Landroid/bluetooth/BluetoothAdapter;
      25: putfield      #43                 // Field a:Landroid/bluetooth/BluetoothAdapter;
      28: return

  static ryey.easer.commons.local_plugin.a.a a(ryey.easer.plugins.a.c.e);
    Code:
       0: aload_0
       1: getfield      #48                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void a(ryey.easer.plugins.a.c.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #52                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static ryey.easer.commons.local_plugin.a.a b(ryey.easer.plugins.a.c.e);
    Code:
       0: aload_0
       1: getfield      #48                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void b(ryey.easer.plugins.a.c.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #52                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static void c(ryey.easer.plugins.a.c.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #52                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #56                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #35                 // Field b:Landroid/content/BroadcastReceiver;
       8: getstatic     #25                 // Field c:Landroid/content/IntentFilter;
      11: invokevirtual #62                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      14: pop
      15: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #56                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #35                 // Field b:Landroid/content/BroadcastReceiver;
       8: invokevirtual #66                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return

  public java.lang.Boolean c();
    Code:
       0: aload_0
       1: getfield      #43                 // Field a:Landroid/bluetooth/BluetoothAdapter;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #43                 // Field a:Landroid/bluetooth/BluetoothAdapter;
      13: invokevirtual #71                 // Method android/bluetooth/BluetoothAdapter.isEnabled:()Z
      16: invokestatic  #77                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      19: areturn
}
