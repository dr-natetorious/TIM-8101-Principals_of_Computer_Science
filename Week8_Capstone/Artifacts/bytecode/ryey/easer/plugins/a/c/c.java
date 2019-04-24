public class ryey.easer.plugins.a.c.c implements ryey.easer.commons.local_plugin.a.c<ryey.easer.plugins.a.c.a> {
  public ryey.easer.plugins.a.c.c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String bluetooth_enabled
       2: areturn

  public ryey.easer.commons.local_plugin.a.d a(android.content.Context, ryey.easer.commons.local_plugin.a.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/a/c/a
       6: aload_3
       7: aload         4
       9: invokevirtual #22                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/a/c/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Lryey/easer/commons/local_plugin/a/d;
      12: areturn

  public ryey.easer.commons.local_plugin.a.d<ryey.easer.plugins.a.c.a> a(android.content.Context, ryey.easer.plugins.a.c.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: new           #24                 // class ryey/easer/plugins/a/c/e
       3: dup
       4: aload_1
       5: aload_2
       6: aload_3
       7: aload         4
       9: invokespecial #27                 // Method ryey/easer/plugins/a/c/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/a/c/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
      12: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iload_2
       2: iconst_1
       3: anewarray     #32                 // class java/lang/String
       6: dup
       7: iconst_0
       8: ldc           #34                 // String android.permission.BLUETOOTH
      10: aastore
      11: invokestatic  #39                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      14: return

  public boolean a(android.content.Context);
    Code:
       0: invokestatic  #46                 // Method android/bluetooth/BluetoothAdapter.getDefaultAdapter:()Landroid/bluetooth/BluetoothAdapter;
       3: ifnull        8
       6: iconst_1
       7: ireturn
       8: iconst_0
       9: ireturn

  public int b();
    Code:
       0: ldc           #49                 // int 2131624007
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #32                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #34                 // String android.permission.BLUETOOTH
       9: aastore
      10: invokestatic  #52                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #58                 // Method e:()Lryey/easer/commons/local_plugin/a/b;
       4: areturn

  public ryey.easer.commons.local_plugin.e d();
    Code:
       0: aload_0
       1: invokevirtual #64                 // Method f:()Lryey/easer/plugins/c;
       4: areturn

  public ryey.easer.commons.local_plugin.a.b<ryey.easer.plugins.a.c.a> e();
    Code:
       0: new           #66                 // class ryey/easer/plugins/a/c/b
       3: dup
       4: invokespecial #67                 // Method ryey/easer/plugins/a/c/b."<init>":()V
       7: areturn

  public ryey.easer.plugins.c<ryey.easer.plugins.a.c.a> f();
    Code:
       0: new           #70                 // class ryey/easer/plugins/a/c/d
       3: dup
       4: invokespecial #71                 // Method ryey/easer/plugins/a/c/d."<init>":()V
       7: areturn
}
