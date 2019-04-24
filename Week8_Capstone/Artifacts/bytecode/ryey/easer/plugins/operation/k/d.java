public class ryey.easer.plugins.operation.k.d implements ryey.easer.commons.local_plugin.c.d<ryey.easer.plugins.operation.k.b> {
  public ryey.easer.plugins.operation.k.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String auto_rotation
       2: areturn

  public void a(android.app.Activity, int);
    Code:
       0: getstatic     #23                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     21
       8: aload_1
       9: new           #25                 // class android/content/Intent
      12: dup
      13: ldc           #27                 // String android.settings.action.MANAGE_WRITE_SETTINGS
      15: invokespecial #30                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      18: invokevirtual #36                 // Method android/app/Activity.startActivity:(Landroid/content/Intent;)V
      21: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #40                 // int 2131624199
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: getstatic     #23                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     13
       8: aload_1
       9: invokestatic  #45                 // Method android/provider/Settings$System.canWrite:(Landroid/content/Context;)Z
      12: ireturn
      13: iconst_1
      14: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #51                 // Method h:()Lryey/easer/commons/local_plugin/c/c;
       4: areturn

  public ryey.easer.commons.local_plugin.c.a c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #56                 // Method d:(Landroid/content/Context;)Lryey/easer/plugins/operation/c;
       5: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.operation.k.b> d();
    Code:
       0: new           #59                 // class ryey/easer/plugins/operation/k/e
       3: dup
       4: invokespecial #60                 // Method ryey/easer/plugins/operation/k/e."<init>":()V
       7: areturn

  public ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.k.b> d(android.content.Context);
    Code:
       0: new           #64                 // class ryey/easer/plugins/operation/k/a
       3: dup
       4: aload_1
       5: invokespecial #67                 // Method ryey/easer/plugins/operation/k/a."<init>":(Landroid/content/Context;)V
       8: areturn

  public ryey.easer.commons.local_plugin.c.e e();
    Code:
       0: getstatic     #75                 // Field ryey/easer/commons/local_plugin/c/e.a:Lryey/easer/commons/local_plugin/c/e;
       3: areturn

  public int f();
    Code:
       0: iconst_1
       1: ireturn

  public ryey.easer.b.a.a g();
    Code:
       0: getstatic     #83                 // Field ryey/easer/b/a/a.b:Lryey/easer/b/a/a;
       3: areturn

  public ryey.easer.commons.local_plugin.c.c<ryey.easer.plugins.operation.k.b> h();
    Code:
       0: new           #85                 // class ryey/easer/plugins/operation/k/c
       3: dup
       4: invokespecial #86                 // Method ryey/easer/plugins/operation/k/c."<init>":()V
       7: areturn
}
