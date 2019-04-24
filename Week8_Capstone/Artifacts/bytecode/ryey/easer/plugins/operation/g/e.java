public class ryey.easer.plugins.operation.g.e implements ryey.easer.commons.local_plugin.c.d<ryey.easer.plugins.operation.g.c> {
  public ryey.easer.plugins.operation.g.e();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String hotspot
       2: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #19                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #21                 // String android.permission.ACCESS_WIFI_STATE
       9: aastore
      10: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: istore_3
      14: aload_1
      15: iconst_1
      16: anewarray     #19                 // class java/lang/String
      19: dup
      20: iconst_0
      21: ldc           #28                 // String android.permission.CHANGE_WIFI_STATE
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
      46: ldc           #21                 // String android.permission.ACCESS_WIFI_STATE
      48: aastore
      49: dup
      50: iconst_1
      51: ldc           #28                 // String android.permission.CHANGE_WIFI_STATE
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
      71: ldc           #21                 // String android.permission.ACCESS_WIFI_STATE
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
      91: ldc           #28                 // String android.permission.CHANGE_WIFI_STATE
      93: aastore
      94: goto          74

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #35                 // int 2131624194
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_2
       2: anewarray     #19                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #21                 // String android.permission.ACCESS_WIFI_STATE
       9: aastore
      10: dup
      11: iconst_1
      12: ldc           #28                 // String android.permission.CHANGE_WIFI_STATE
      14: aastore
      15: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      18: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #41                 // Method h:()Lryey/easer/commons/local_plugin/c/c;
       4: areturn

  public ryey.easer.commons.local_plugin.c.a c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #46                 // Method d:(Landroid/content/Context;)Lryey/easer/plugins/operation/c;
       5: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.operation.g.c> d();
    Code:
       0: new           #49                 // class ryey/easer/plugins/operation/g/f
       3: dup
       4: invokespecial #50                 // Method ryey/easer/plugins/operation/g/f."<init>":()V
       7: areturn

  public ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.g.c> d(android.content.Context);
    Code:
       0: new           #54                 // class ryey/easer/plugins/operation/g/b
       3: dup
       4: aload_1
       5: invokespecial #57                 // Method ryey/easer/plugins/operation/g/b."<init>":(Landroid/content/Context;)V
       8: areturn

  public ryey.easer.commons.local_plugin.c.e e();
    Code:
       0: getstatic     #65                 // Field ryey/easer/commons/local_plugin/c/e.a:Lryey/easer/commons/local_plugin/c/e;
       3: areturn

  public int f();
    Code:
       0: iconst_1
       1: ireturn

  public ryey.easer.b.a.a g();
    Code:
       0: getstatic     #73                 // Field ryey/easer/b/a/a.b:Lryey/easer/b/a/a;
       3: areturn

  public ryey.easer.commons.local_plugin.c.c<ryey.easer.plugins.operation.g.c> h();
    Code:
       0: new           #75                 // class ryey/easer/plugins/operation/g/d
       3: dup
       4: invokespecial #76                 // Method ryey/easer/plugins/operation/g/d."<init>":()V
       7: areturn
}
