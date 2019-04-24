public class ryey.easer.plugins.operation.j.d implements ryey.easer.commons.local_plugin.c.d<ryey.easer.plugins.operation.j.b> {
  public ryey.easer.plugins.operation.j.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String play_media
       2: areturn

  public void a(android.app.Activity, int);
    Code:
       0: getstatic     #23                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     22
       8: aload_1
       9: iload_2
      10: iconst_1
      11: anewarray     #25                 // class java/lang/String
      14: dup
      15: iconst_0
      16: ldc           #27                 // String android.permission.READ_EXTERNAL_STORAGE
      18: aastore
      19: invokestatic  #32                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      22: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #36                 // int 2131624163
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: getstatic     #23                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     22
       8: aload_1
       9: iconst_1
      10: anewarray     #25                 // class java/lang/String
      13: dup
      14: iconst_0
      15: ldc           #27                 // String android.permission.READ_EXTERNAL_STORAGE
      17: aastore
      18: invokestatic  #39                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      21: ireturn
      22: iconst_1
      23: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #45                 // Method h:()Lryey/easer/commons/local_plugin/c/c;
       4: areturn

  public ryey.easer.commons.local_plugin.c.a c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #50                 // Method d:(Landroid/content/Context;)Lryey/easer/plugins/operation/c;
       5: areturn

  public ryey.easer.commons.local_plugin.e d();
    Code:
       0: aload_0
       1: invokevirtual #55                 // Method i:()Lryey/easer/plugins/c;
       4: areturn

  public ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.j.b> d(android.content.Context);
    Code:
       0: new           #57                 // class ryey/easer/plugins/operation/j/a
       3: dup
       4: aload_1
       5: invokespecial #60                 // Method ryey/easer/plugins/operation/j/a."<init>":(Landroid/content/Context;)V
       8: areturn

  public ryey.easer.commons.local_plugin.c.e e();
    Code:
       0: getstatic     #69                 // Field ryey/easer/commons/local_plugin/c/e.a:Lryey/easer/commons/local_plugin/c/e;
       3: areturn

  public int f();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.b.a.a g();
    Code:
       0: getstatic     #77                 // Field ryey/easer/b/a/a.a:Lryey/easer/b/a/a;
       3: areturn

  public ryey.easer.commons.local_plugin.c.c<ryey.easer.plugins.operation.j.b> h();
    Code:
       0: new           #79                 // class ryey/easer/plugins/operation/j/c
       3: dup
       4: invokespecial #80                 // Method ryey/easer/plugins/operation/j/c."<init>":()V
       7: areturn

  public ryey.easer.plugins.c<ryey.easer.plugins.operation.j.b> i();
    Code:
       0: new           #83                 // class ryey/easer/plugins/operation/j/e
       3: dup
       4: invokespecial #84                 // Method ryey/easer/plugins/operation/j/e."<init>":()V
       7: areturn
}
