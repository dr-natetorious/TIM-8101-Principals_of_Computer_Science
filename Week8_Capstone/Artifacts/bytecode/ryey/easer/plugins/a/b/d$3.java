class ryey.easer.plugins.a.b.d$3 implements android.view.View$OnClickListener {
  final ryey.easer.plugins.a.b.d a;

  ryey.easer.plugins.a.b.d$3(ryey.easer.plugins.a.b.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
       5: aload_0
       6: invokespecial #24                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
       4: invokevirtual #31                 // Method ryey/easer/plugins/a/b/d.getContext:()Landroid/content/Context;
       7: ldc           #33                 // String android.permission.BLUETOOTH
       9: invokestatic  #38                 // Method ryey/easer/b.a:(Landroid/content/Context;Ljava/lang/String;)Z
      12: ifne          16
      15: return
      16: aload_0
      17: getfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
      20: invokevirtual #31                 // Method ryey/easer/plugins/a/b/d.getContext:()Landroid/content/Context;
      23: aload_0
      24: getfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
      27: invokestatic  #41                 // Method ryey/easer/plugins/a/b/d.a:(Lryey/easer/plugins/a/b/d;)Landroid/content/BroadcastReceiver;
      30: aload_0
      31: getfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
      34: invokestatic  #45                 // Method ryey/easer/plugins/a/b/d.c:(Lryey/easer/plugins/a/b/d;)Landroid/content/IntentFilter;
      37: invokevirtual #51                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      40: pop
      41: new           #53                 // class android/app/AlertDialog$Builder
      44: dup
      45: aload_0
      46: getfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
      49: invokevirtual #31                 // Method ryey/easer/plugins/a/b/d.getContext:()Landroid/content/Context;
      52: invokespecial #56                 // Method android/app/AlertDialog$Builder."<init>":(Landroid/content/Context;)V
      55: astore_1
      56: aload_1
      57: ldc           #57                 // int 2131624040
      59: invokevirtual #61                 // Method android/app/AlertDialog$Builder.setTitle:(I)Landroid/app/AlertDialog$Builder;
      62: pop
      63: new           #63                 // class android/widget/ArrayAdapter
      66: dup
      67: aload_0
      68: getfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
      71: invokevirtual #31                 // Method ryey/easer/plugins/a/b/d.getContext:()Landroid/content/Context;
      74: ldc           #64                 // int 17367058
      76: invokespecial #67                 // Method android/widget/ArrayAdapter."<init>":(Landroid/content/Context;I)V
      79: astore_2
      80: invokestatic  #73                 // Method android/bluetooth/BluetoothAdapter.getDefaultAdapter:()Landroid/bluetooth/BluetoothAdapter;
      83: astore_3
      84: aload_3
      85: ifnull        138
      88: aload_3
      89: invokevirtual #77                 // Method android/bluetooth/BluetoothAdapter.getBondedDevices:()Ljava/util/Set;
      92: invokeinterface #83,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      97: astore_3
      98: aload_3
      99: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     104: ifeq          138
     107: aload_3
     108: invokeinterface #93,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     113: checkcast     #95                 // class android/bluetooth/BluetoothDevice
     116: astore        4
     118: aload_2
     119: new           #97                 // class ryey/easer/plugins/a/b/d$a
     122: dup
     123: aload_0
     124: getfield      #21                 // Field a:Lryey/easer/plugins/a/b/d;
     127: aload         4
     129: invokespecial #100                // Method ryey/easer/plugins/a/b/d$a."<init>":(Lryey/easer/plugins/a/b/d;Landroid/bluetooth/BluetoothDevice;)V
     132: invokevirtual #104                // Method android/widget/ArrayAdapter.add:(Ljava/lang/Object;)V
     135: goto          98
     138: aload_1
     139: ldc           #105                // int 2131623988
     141: new           #13                 // class ryey/easer/plugins/a/b/d$3$1
     144: dup
     145: aload_0
     146: invokespecial #108                // Method ryey/easer/plugins/a/b/d$3$1."<init>":(Lryey/easer/plugins/a/b/d$3;)V
     149: invokevirtual #112                // Method android/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
     152: pop
     153: aload_1
     154: aload_2
     155: new           #15                 // class ryey/easer/plugins/a/b/d$3$2
     158: dup
     159: aload_0
     160: aload_2
     161: invokespecial #115                // Method ryey/easer/plugins/a/b/d$3$2."<init>":(Lryey/easer/plugins/a/b/d$3;Landroid/widget/ArrayAdapter;)V
     164: invokevirtual #119                // Method android/app/AlertDialog$Builder.setAdapter:(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
     167: pop
     168: aload_1
     169: invokevirtual #123                // Method android/app/AlertDialog$Builder.show:()Landroid/app/AlertDialog;
     172: pop
     173: return
}
