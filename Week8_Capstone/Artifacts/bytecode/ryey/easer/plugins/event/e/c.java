public class ryey.easer.plugins.event.e.c implements ryey.easer.commons.local_plugin.eventplugin.b<ryey.easer.plugins.event.e.a> {
  public ryey.easer.plugins.event.e.c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String cell location
       2: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/e/a
       6: invokevirtual #22                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/e/a;)Lryey/easer/plugins/event/b;
       9: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/e/a
       6: iload_3
       7: iload         4
       9: invokevirtual #26                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/e/a;ZZ)Lryey/easer/plugins/event/b;
      12: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.e.a> a(android.content.Context, ryey.easer.plugins.event.e.a);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/e/e
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #31                 // Method ryey/easer/plugins/event/e/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/e/a;)V
       9: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.e.a> a(android.content.Context, ryey.easer.plugins.event.e.a, boolean, boolean);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/e/e
       3: dup
       4: aload_1
       5: aload_2
       6: iload_3
       7: iload         4
       9: invokespecial #36                 // Method ryey/easer/plugins/event/e/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/e/a;ZZ)V
      12: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iload_2
       2: iconst_1
       3: anewarray     #40                 // class java/lang/String
       6: dup
       7: iconst_0
       8: ldc           #42                 // String android.permission.ACCESS_COARSE_LOCATION
      10: aastore
      11: invokestatic  #47                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      14: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #51                 // int 2131624057
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #40                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #42                 // String android.permission.ACCESS_COARSE_LOCATION
       9: aastore
      10: invokestatic  #54                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #60                 // Method e:()Lryey/easer/commons/local_plugin/eventplugin/a;
       4: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.event.e.a> d();
    Code:
       0: new           #64                 // class ryey/easer/plugins/event/e/d
       3: dup
       4: invokespecial #65                 // Method ryey/easer/plugins/event/e/d."<init>":()V
       7: areturn

  public ryey.easer.commons.local_plugin.eventplugin.a<ryey.easer.plugins.event.e.a> e();
    Code:
       0: new           #68                 // class ryey/easer/plugins/event/e/b
       3: dup
       4: invokespecial #69                 // Method ryey/easer/plugins/event/e/b."<init>":()V
       7: areturn
}
