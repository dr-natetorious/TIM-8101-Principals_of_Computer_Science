public class ryey.easer.plugins.operation.c.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.c.b> {
  public ryey.easer.plugins.operation.c.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/c/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/c/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.c.b);
    Code:
       0: aload_1
       1: invokevirtual #21                 // Method ryey/easer/plugins/operation/c/b.c:()Ljava/lang/Boolean;
       4: astore_1
       5: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       8: bipush        18
      10: if_icmplt     61
      13: aload_0
      14: getfield      #30                 // Field a:Landroid/content/Context;
      17: ldc           #32                 // String bluetooth
      19: invokevirtual #38                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      22: checkcast     #40                 // class android/bluetooth/BluetoothManager
      25: invokevirtual #44                 // Method android/bluetooth/BluetoothManager.getAdapter:()Landroid/bluetooth/BluetoothAdapter;
      28: astore_2
      29: aload_2
      30: ifnonnull     44
      33: ldc           #46                 // String no BluetoothAdapter
      35: iconst_0
      36: anewarray     #48                 // class java/lang/Object
      39: invokestatic  #54                 // Method com/b/a/i.e:(Ljava/lang/String;[Ljava/lang/Object;)V
      42: iconst_1
      43: ireturn
      44: aload_1
      45: invokevirtual #60                 // Method java/lang/Boolean.booleanValue:()Z
      48: ifeq          56
      51: aload_2
      52: invokevirtual #65                 // Method android/bluetooth/BluetoothAdapter.enable:()Z
      55: ireturn
      56: aload_2
      57: invokevirtual #68                 // Method android/bluetooth/BluetoothAdapter.disable:()Z
      60: ireturn
      61: ldc           #70                 // String System version lower than min requirement
      63: iconst_0
      64: anewarray     #48                 // class java/lang/Object
      67: invokestatic  #73                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      70: iconst_0
      71: ireturn
}
