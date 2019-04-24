public class ryey.easer.plugins.a.b.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.b.a> {
  ryey.easer.plugins.a.b.e(android.content.Context, ryey.easer.plugins.a.b.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #18                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: iconst_0
      10: istore        5
      12: aload_0
      13: iconst_0
      14: putfield      #20                 // Field a:I
      17: aload_0
      18: new           #7                  // class ryey/easer/plugins/a/b/e$1
      21: dup
      22: aload_0
      23: invokespecial #23                 // Method ryey/easer/plugins/a/b/e$1."<init>":(Lryey/easer/plugins/a/b/e;)V
      26: putfield      #25                 // Field b:Landroid/content/BroadcastReceiver;
      29: aload_0
      30: new           #27                 // class android/content/IntentFilter
      33: dup
      34: invokespecial #30                 // Method android/content/IntentFilter."<init>":()V
      37: putfield      #32                 // Field c:Landroid/content/IntentFilter;
      40: aload_0
      41: getfield      #32                 // Field c:Landroid/content/IntentFilter;
      44: ldc           #34                 // String android.bluetooth.device.action.ACL_CONNECTED
      46: invokevirtual #38                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      49: aload_0
      50: getfield      #32                 // Field c:Landroid/content/IntentFilter;
      53: ldc           #40                 // String android.bluetooth.device.action.ACL_DISCONNECTED
      55: invokevirtual #38                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      58: getstatic     #45                 // Field android/os/Build$VERSION.SDK_INT:I
      61: bipush        18
      63: if_icmplt     164
      66: aload_1
      67: ldc           #47                 // String bluetooth
      69: invokevirtual #53                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      72: checkcast     #55                 // class android/bluetooth/BluetoothManager
      75: astore_1
      76: iconst_2
      77: newarray       int
      79: astore_2
      80: aload_2
      81: dup
      82: iconst_0
      83: bipush        7
      85: iastore
      86: dup
      87: iconst_1
      88: bipush        8
      90: iastore
      91: pop
      92: aload_2
      93: arraylength
      94: istore        6
      96: iload         5
      98: iload         6
     100: if_icmpge     164
     103: aload_1
     104: aload_2
     105: iload         5
     107: iaload
     108: invokevirtual #59                 // Method android/bluetooth/BluetoothManager.getConnectedDevices:(I)Ljava/util/List;
     111: invokeinterface #65,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     116: astore_3
     117: aload_3
     118: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     123: ifeq          155
     126: aload_0
     127: aload_3
     128: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     133: checkcast     #77                 // class android/bluetooth/BluetoothDevice
     136: invokespecial #80                 // Method a:(Landroid/bluetooth/BluetoothDevice;)Z
     139: ifeq          117
     142: aload_0
     143: aload_0
     144: getfield      #20                 // Field a:I
     147: iconst_1
     148: iadd
     149: putfield      #20                 // Field a:I
     152: goto          117
     155: iload         5
     157: iconst_1
     158: iadd
     159: istore        5
     161: goto          96
     164: aload_0
     165: invokespecial #83                 // Method d:()V
     168: return

  static int a(ryey.easer.plugins.a.b.e);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:I
       4: istore_1
       5: aload_0
       6: iload_1
       7: iconst_1
       8: iadd
       9: putfield      #20                 // Field a:I
      12: iload_1
      13: ireturn

  static boolean a(ryey.easer.plugins.a.b.e, android.bluetooth.BluetoothDevice);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #80                 // Method a:(Landroid/bluetooth/BluetoothDevice;)Z
       5: ireturn

  static void b(ryey.easer.plugins.a.b.e);
    Code:
       0: aload_0
       1: invokespecial #83                 // Method d:()V
       4: return

  static int c(ryey.easer.plugins.a.b.e);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:I
       4: istore_1
       5: aload_0
       6: iload_1
       7: iconst_1
       8: isub
       9: putfield      #20                 // Field a:I
      12: iload_1
      13: ireturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #115                // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #25                 // Field b:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #32                 // Field c:Landroid/content/IntentFilter;
      12: invokevirtual #119                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #115                // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #25                 // Field b:Landroid/content/BroadcastReceiver;
       8: invokevirtual #123                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
