class ryey.easer.plugins.operation.g.a {
  static {};
    Code:
       0: return

  ryey.easer.plugins.operation.g.a();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: return

  static ryey.easer.plugins.operation.g.a a(android.content.Context);
    Code:
       0: ldc           #2                  // class ryey/easer/plugins/operation/g/a
       2: monitorenter
       3: getstatic     #17                 // Field a:Lryey/easer/plugins/operation/g/a;
       6: ifnull        18
       9: getstatic     #17                 // Field a:Lryey/easer/plugins/operation/g/a;
      12: astore_0
      13: ldc           #2                  // class ryey/easer/plugins/operation/g/a
      15: monitorexit
      16: aload_0
      17: areturn
      18: new           #2                  // class ryey/easer/plugins/operation/g/a
      21: dup
      22: invokespecial #18                 // Method "<init>":()V
      25: putstatic     #17                 // Field a:Lryey/easer/plugins/operation/g/a;
      28: getstatic     #17                 // Field a:Lryey/easer/plugins/operation/g/a;
      31: aload_0
      32: invokevirtual #24                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      35: ldc           #26                 // String wifi
      37: invokevirtual #30                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      40: checkcast     #32                 // class android/net/wifi/WifiManager
      43: putfield      #34                 // Field b:Landroid/net/wifi/WifiManager;
      46: getstatic     #17                 // Field a:Lryey/easer/plugins/operation/g/a;
      49: astore_0
      50: ldc           #2                  // class ryey/easer/plugins/operation/g/a
      52: monitorexit
      53: aload_0
      54: areturn
      55: astore_0
      56: ldc           #2                  // class ryey/easer/plugins/operation/g/a
      58: monitorexit
      59: aload_0
      60: athrow
    Exception table:
       from    to  target type
           3    13    55   any
          18    50    55   any

  boolean a();
    Code:
       0: aload_0
       1: aconst_null
       2: iconst_1
       3: invokevirtual #38                 // Method a:(Landroid/net/wifi/WifiConfiguration;Z)Z
       6: ireturn

  boolean a(android.net.wifi.WifiConfiguration, boolean);
    Code:
       0: aload_0
       1: getfield      #34                 // Field b:Landroid/net/wifi/WifiManager;
       4: invokevirtual #42                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       7: ldc           #44                 // String setWifiApEnabled
       9: iconst_2
      10: anewarray     #46                 // class java/lang/Class
      13: dup
      14: iconst_0
      15: ldc           #48                 // class android/net/wifi/WifiConfiguration
      17: aastore
      18: dup
      19: iconst_1
      20: getstatic     #54                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
      23: aastore
      24: invokevirtual #58                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      27: aload_0
      28: getfield      #34                 // Field b:Landroid/net/wifi/WifiManager;
      31: iconst_2
      32: anewarray     #4                  // class java/lang/Object
      35: dup
      36: iconst_0
      37: aload_1
      38: aastore
      39: dup
      40: iconst_1
      41: iload_2
      42: invokestatic  #62                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      45: aastore
      46: invokevirtual #68                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      49: checkcast     #50                 // class java/lang/Boolean
      52: invokevirtual #71                 // Method java/lang/Boolean.booleanValue:()Z
      55: ireturn

  boolean b();
    Code:
       0: aload_0
       1: aconst_null
       2: iconst_0
       3: invokevirtual #38                 // Method a:(Landroid/net/wifi/WifiConfiguration;Z)Z
       6: ireturn

  boolean c();
    Code:
       0: aload_0
       1: getfield      #34                 // Field b:Landroid/net/wifi/WifiManager;
       4: invokevirtual #42                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       7: ldc           #74                 // String isWifiApEnabled
       9: iconst_0
      10: anewarray     #46                 // class java/lang/Class
      13: invokevirtual #58                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      16: aload_0
      17: getfield      #34                 // Field b:Landroid/net/wifi/WifiManager;
      20: iconst_0
      21: anewarray     #4                  // class java/lang/Object
      24: invokevirtual #68                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      27: checkcast     #50                 // class java/lang/Boolean
      30: invokevirtual #71                 // Method java/lang/Boolean.booleanValue:()Z
      33: invokestatic  #62                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      36: invokevirtual #71                 // Method java/lang/Boolean.booleanValue:()Z
      39: ireturn
}
