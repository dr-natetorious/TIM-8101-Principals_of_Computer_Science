public class ryey.easer.plugins.event.p.d implements ryey.easer.commons.local_plugin.eventplugin.b<ryey.easer.plugins.event.p.b> {
  public ryey.easer.plugins.event.p.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String wifi connection
       2: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/p/b
       6: invokevirtual #22                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/p/b;)Lryey/easer/plugins/event/b;
       9: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/p/b
       6: iload_3
       7: iload         4
       9: invokevirtual #26                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/p/b;ZZ)Lryey/easer/plugins/event/b;
      12: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.p.b> a(android.content.Context, ryey.easer.plugins.event.p.b);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/p/a
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #31                 // Method ryey/easer/plugins/event/p/a."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/p/b;)V
       9: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.p.b> a(android.content.Context, ryey.easer.plugins.event.p.b, boolean, boolean);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/p/a
       3: dup
       4: aload_1
       5: aload_2
       6: iload_3
       7: iload         4
       9: invokespecial #36                 // Method ryey/easer/plugins/event/p/a."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/p/b;ZZ)V
      12: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iload_2
       2: iconst_2
       3: anewarray     #40                 // class java/lang/String
       6: dup
       7: iconst_0
       8: ldc           #42                 // String android.permission.ACCESS_WIFI_STATE
      10: aastore
      11: dup
      12: iconst_1
      13: ldc           #44                 // String android.permission.CHANGE_WIFI_STATE
      15: aastore
      16: invokestatic  #49                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      19: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #53                 // int 2131624089
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_2
       2: anewarray     #40                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #42                 // String android.permission.ACCESS_WIFI_STATE
       9: aastore
      10: dup
      11: iconst_1
      12: ldc           #44                 // String android.permission.CHANGE_WIFI_STATE
      14: aastore
      15: invokestatic  #56                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      18: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #62                 // Method e:()Lryey/easer/commons/local_plugin/eventplugin/a;
       4: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.event.p.b> d();
    Code:
       0: new           #66                 // class ryey/easer/plugins/event/p/e
       3: dup
       4: invokespecial #67                 // Method ryey/easer/plugins/event/p/e."<init>":()V
       7: areturn

  public ryey.easer.commons.local_plugin.eventplugin.a<ryey.easer.plugins.event.p.b> e();
    Code:
       0: new           #70                 // class ryey/easer/plugins/event/p/c
       3: dup
       4: invokespecial #71                 // Method ryey/easer/plugins/event/p/c."<init>":()V
       7: areturn
}
