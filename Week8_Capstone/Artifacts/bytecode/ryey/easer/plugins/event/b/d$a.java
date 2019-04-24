class ryey.easer.plugins.event.b.d$a {
  final android.bluetooth.BluetoothDevice a;

  final ryey.easer.plugins.event.b.d b;

  ryey.easer.plugins.event.b.d$a(ryey.easer.plugins.event.b.d, android.bluetooth.BluetoothDevice);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field b:Lryey/easer/plugins/event/b/d;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #19                 // Field a:Landroid/bluetooth/BluetoothDevice;
      14: return

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/bluetooth/BluetoothDevice;
       4: invokevirtual #27                 // Method android/bluetooth/BluetoothDevice.getName:()Ljava/lang/String;
       7: areturn
}
