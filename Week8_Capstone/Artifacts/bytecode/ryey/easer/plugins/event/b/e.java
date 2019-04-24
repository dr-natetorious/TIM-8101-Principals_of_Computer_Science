public class ryey.easer.plugins.event.b.e extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.b.a> {
  public ryey.easer.plugins.event.b.e(android.content.Context, ryey.easer.plugins.event.b.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #18                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/b/a;ZZ)V
       8: return

  ryey.easer.plugins.event.b.e(android.content.Context, ryey.easer.plugins.event.b.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #22                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: iconst_0
      11: putfield      #24                 // Field g:I
      14: aload_0
      15: new           #7                  // class ryey/easer/plugins/event/b/e$1
      18: dup
      19: aload_0
      20: invokespecial #27                 // Method ryey/easer/plugins/event/b/e$1."<init>":(Lryey/easer/plugins/event/b/e;)V
      23: putfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
      26: aload_0
      27: new           #31                 // class android/content/IntentFilter
      30: dup
      31: invokespecial #34                 // Method android/content/IntentFilter."<init>":()V
      34: putfield      #36                 // Field i:Landroid/content/IntentFilter;
      37: aload_0
      38: getfield      #36                 // Field i:Landroid/content/IntentFilter;
      41: ldc           #38                 // String android.bluetooth.device.action.ACL_CONNECTED
      43: invokevirtual #42                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      46: aload_0
      47: getfield      #36                 // Field i:Landroid/content/IntentFilter;
      50: ldc           #44                 // String android.bluetooth.device.action.ACL_DISCONNECTED
      52: invokevirtual #42                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      55: return

  static int a(ryey.easer.plugins.event.b.e);
    Code:
       0: aload_0
       1: getfield      #24                 // Field g:I
       4: istore_1
       5: aload_0
       6: iload_1
       7: iconst_1
       8: iadd
       9: putfield      #24                 // Field g:I
      12: iload_1
      13: ireturn

  static android.os.Bundle a(android.bluetooth.BluetoothDevice);
    Code:
       0: aload_0
       1: invokestatic  #50                 // Method b:(Landroid/bluetooth/BluetoothDevice;)Landroid/os/Bundle;
       4: areturn

  static void a(ryey.easer.plugins.event.b.e, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #57                 // Method a:(Landroid/os/Bundle;)V
       5: return

  static boolean a(ryey.easer.plugins.event.b.e, android.bluetooth.BluetoothDevice);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #62                 // Method c:(Landroid/bluetooth/BluetoothDevice;)Z
       5: ireturn

  static int b(ryey.easer.plugins.event.b.e);
    Code:
       0: aload_0
       1: getfield      #24                 // Field g:I
       4: istore_1
       5: aload_0
       6: iload_1
       7: iconst_1
       8: isub
       9: putfield      #24                 // Field g:I
      12: iload_1
      13: ireturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #93                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #36                 // Field i:Landroid/content/IntentFilter;
      12: invokevirtual #99                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #93                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
       8: invokevirtual #103                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
