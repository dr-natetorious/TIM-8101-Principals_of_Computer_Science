public class ryey.easer.plugins.operation.c.d implements ryey.easer.commons.local_plugin.c.d<ryey.easer.plugins.operation.c.b> {
  public ryey.easer.plugins.operation.c.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String bluetooth
       2: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #19                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #21                 // String android.permission.BLUETOOTH
       9: aastore
      10: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: istore_3
      14: aload_1
      15: iconst_1
      16: anewarray     #19                 // class java/lang/String
      19: dup
      20: iconst_0
      21: ldc           #28                 // String android.permission.BLUETOOTH_ADMIN
      23: aastore
      24: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      27: istore        4
      29: iload_3
      30: ifne          58
      33: iload         4
      35: ifne          58
      38: aload_1
      39: iload_2
      40: iconst_2
      41: anewarray     #19                 // class java/lang/String
      44: dup
      45: iconst_0
      46: ldc           #21                 // String android.permission.BLUETOOTH
      48: aastore
      49: dup
      50: iconst_1
      51: ldc           #28                 // String android.permission.BLUETOOTH_ADMIN
      53: aastore
      54: invokestatic  #31                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      57: return
      58: iload_3
      59: ifne          82
      62: iconst_1
      63: anewarray     #19                 // class java/lang/String
      66: astore        5
      68: aload         5
      70: iconst_0
      71: ldc           #21                 // String android.permission.BLUETOOTH
      73: aastore
      74: aload_1
      75: iload_2
      76: aload         5
      78: invokestatic  #31                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      81: return
      82: iconst_1
      83: anewarray     #19                 // class java/lang/String
      86: astore        5
      88: aload         5
      90: iconst_0
      91: ldc           #28                 // String android.permission.BLUETOOTH_ADMIN
      93: aastore
      94: goto          74

  public boolean a(android.content.Context);
    Code:
       0: invokestatic  #38                 // Method android/bluetooth/BluetoothAdapter.getDefaultAdapter:()Landroid/bluetooth/BluetoothAdapter;
       3: ifnull        8
       6: iconst_1
       7: ireturn
       8: iconst_0
       9: ireturn

  public int b();
    Code:
       0: ldc           #41                 // int 2131624188
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_2
       2: anewarray     #19                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #21                 // String android.permission.BLUETOOTH
       9: aastore
      10: dup
      11: iconst_1
      12: ldc           #28                 // String android.permission.BLUETOOTH_ADMIN
      14: aastore
      15: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      18: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #47                 // Method h:()Lryey/easer/commons/local_plugin/c/c;
       4: areturn

  public ryey.easer.commons.local_plugin.c.a c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #52                 // Method d:(Landroid/content/Context;)Lryey/easer/plugins/operation/c;
       5: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.operation.c.b> d();
    Code:
       0: new           #55                 // class ryey/easer/plugins/operation/c/e
       3: dup
       4: invokespecial #56                 // Method ryey/easer/plugins/operation/c/e."<init>":()V
       7: areturn

  public ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.c.b> d(android.content.Context);
    Code:
       0: new           #60                 // class ryey/easer/plugins/operation/c/a
       3: dup
       4: aload_1
       5: invokespecial #63                 // Method ryey/easer/plugins/operation/c/a."<init>":(Landroid/content/Context;)V
       8: areturn

  public ryey.easer.commons.local_plugin.c.e e();
    Code:
       0: getstatic     #71                 // Field ryey/easer/commons/local_plugin/c/e.a:Lryey/easer/commons/local_plugin/c/e;
       3: areturn

  public int f();
    Code:
       0: iconst_1
       1: ireturn

  public ryey.easer.b.a.a g();
    Code:
       0: getstatic     #79                 // Field ryey/easer/b/a/a.b:Lryey/easer/b/a/a;
       3: areturn

  public ryey.easer.commons.local_plugin.c.c<ryey.easer.plugins.operation.c.b> h();
    Code:
       0: new           #81                 // class ryey/easer/plugins/operation/c/c
       3: dup
       4: invokespecial #82                 // Method ryey/easer/plugins/operation/c/c."<init>":()V
       7: areturn
}
