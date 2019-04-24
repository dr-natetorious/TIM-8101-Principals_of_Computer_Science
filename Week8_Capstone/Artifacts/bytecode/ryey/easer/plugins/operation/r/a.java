public class ryey.easer.plugins.operation.r.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.r.b> {
  public ryey.easer.plugins.operation.r.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/r/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/r/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.r.b);
    Code:
       0: aload_1
       1: invokevirtual #21                 // Method ryey/easer/plugins/operation/r/b.c:()Ljava/lang/Boolean;
       4: astore_1
       5: aload_0
       6: getfield      #24                 // Field a:Landroid/content/Context;
       9: invokevirtual #30                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      12: ldc           #32                 // String wifi
      14: invokevirtual #36                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      17: checkcast     #38                 // class android/net/wifi/WifiManager
      20: aload_1
      21: invokevirtual #44                 // Method java/lang/Boolean.booleanValue:()Z
      24: invokevirtual #48                 // Method android/net/wifi/WifiManager.setWifiEnabled:(Z)Z
      27: ireturn
}
