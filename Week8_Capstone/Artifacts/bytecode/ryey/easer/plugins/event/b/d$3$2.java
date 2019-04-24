class ryey.easer.plugins.event.b.d$3$2 implements android.content.DialogInterface$OnClickListener {
  final android.widget.ArrayAdapter a;

  final ryey.easer.plugins.event.b.d$3 b;

  ryey.easer.plugins.event.b.d$3$2(ryey.easer.plugins.event.b.d$3, android.widget.ArrayAdapter);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/plugins/event/b/d$3;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/widget/ArrayAdapter;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/ArrayAdapter;
       4: iload_2
       5: invokevirtual #32                 // Method android/widget/ArrayAdapter.getItem:(I)Ljava/lang/Object;
       8: checkcast     #34                 // class ryey/easer/plugins/event/b/d$a
      11: getfield      #37                 // Field ryey/easer/plugins/event/b/d$a.a:Landroid/bluetooth/BluetoothDevice;
      14: invokevirtual #43                 // Method android/bluetooth/BluetoothDevice.getAddress:()Ljava/lang/String;
      17: astore_1
      18: new           #45                 // class android/content/Intent
      21: dup
      22: ldc           #47                 // String ryey.easer.plugins.event.bluetooth_device.return_from_dialog
      24: invokespecial #50                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      27: astore_3
      28: aload_3
      29: ldc           #52                 // String ryey.easer.plugins.event.bluetooth_device.extra.hardware_address
      31: aload_1
      32: invokevirtual #56                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      35: pop
      36: aload_0
      37: getfield      #19                 // Field b:Lryey/easer/plugins/event/b/d$3;
      40: getfield      #59                 // Field ryey/easer/plugins/event/b/d$3.a:Lryey/easer/plugins/event/b/d;
      43: invokevirtual #65                 // Method ryey/easer/plugins/event/b/d.getContext:()Landroid/content/Context;
      46: aload_3
      47: invokevirtual #71                 // Method android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
      50: return
}
