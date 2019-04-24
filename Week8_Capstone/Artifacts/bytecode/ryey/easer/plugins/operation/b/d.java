public class ryey.easer.plugins.operation.b.d implements ryey.easer.commons.local_plugin.c.d<ryey.easer.plugins.operation.b.b> {
  public ryey.easer.plugins.operation.b.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String alarm
       2: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iload_2
       2: iconst_1
       3: anewarray     #19                 // class java/lang/String
       6: dup
       7: iconst_0
       8: ldc           #21                 // String com.android.alarm.permission.SET_ALARM
      10: aastore
      11: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      14: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #30                 // int 2131624183
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #19                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #21                 // String com.android.alarm.permission.SET_ALARM
       9: aastore
      10: invokestatic  #33                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #39                 // Method h:()Lryey/easer/commons/local_plugin/c/c;
       4: areturn

  public ryey.easer.commons.local_plugin.c.a c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #44                 // Method d:(Landroid/content/Context;)Lryey/easer/plugins/operation/c;
       5: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.operation.b.b> d();
    Code:
       0: new           #47                 // class ryey/easer/plugins/operation/b/e
       3: dup
       4: invokespecial #48                 // Method ryey/easer/plugins/operation/b/e."<init>":()V
       7: areturn

  public ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.b.b> d(android.content.Context);
    Code:
       0: new           #52                 // class ryey/easer/plugins/operation/b/a
       3: dup
       4: aload_1
       5: invokespecial #55                 // Method ryey/easer/plugins/operation/b/a."<init>":(Landroid/content/Context;)V
       8: areturn

  public ryey.easer.commons.local_plugin.c.e e();
    Code:
       0: getstatic     #63                 // Field ryey/easer/commons/local_plugin/c/e.a:Lryey/easer/commons/local_plugin/c/e;
       3: areturn

  public int f();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.b.a.a g();
    Code:
       0: getstatic     #71                 // Field ryey/easer/b/a/a.a:Lryey/easer/b/a/a;
       3: areturn

  public ryey.easer.commons.local_plugin.c.c<ryey.easer.plugins.operation.b.b> h();
    Code:
       0: new           #73                 // class ryey/easer/plugins/operation/b/c
       3: dup
       4: invokespecial #74                 // Method ryey/easer/plugins/operation/b/c."<init>":()V
       7: areturn
}
