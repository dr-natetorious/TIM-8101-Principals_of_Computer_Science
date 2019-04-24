public class ryey.easer.plugins.event.g.c implements ryey.easer.commons.local_plugin.eventplugin.b<ryey.easer.plugins.event.g.a> {
  public ryey.easer.plugins.event.g.c();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #17                 // String connectivity
       2: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #20                 // class ryey/easer/plugins/event/g/a
       6: invokevirtual #23                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/g/a;)Lryey/easer/plugins/event/b;
       9: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #20                 // class ryey/easer/plugins/event/g/a
       6: iload_3
       7: iload         4
       9: invokevirtual #27                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/g/a;ZZ)Lryey/easer/plugins/event/b;
      12: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.g.a> a(android.content.Context, ryey.easer.plugins.event.g.a);
    Code:
       0: new           #29                 // class ryey/easer/plugins/event/g/e
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #32                 // Method ryey/easer/plugins/event/g/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/g/a;)V
       9: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.g.a> a(android.content.Context, ryey.easer.plugins.event.g.a, boolean, boolean);
    Code:
       0: new           #29                 // class ryey/easer/plugins/event/g/e
       3: dup
       4: aload_1
       5: aload_2
       6: iload_3
       7: iload         4
       9: invokespecial #37                 // Method ryey/easer/plugins/event/g/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/g/a;ZZ)V
      12: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iload_2
       2: iconst_1
       3: anewarray     #41                 // class java/lang/String
       6: dup
       7: iconst_0
       8: ldc           #43                 // String android.permission.ACCESS_NETWORK_STATE
      10: aastore
      11: invokestatic  #48                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      14: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #52                 // int 2131624060
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #41                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #43                 // String android.permission.ACCESS_NETWORK_STATE
       9: aastore
      10: invokestatic  #55                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #61                 // Method e:()Lryey/easer/commons/local_plugin/eventplugin/a;
       4: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.event.g.a> d();
    Code:
       0: new           #65                 // class ryey/easer/plugins/event/g/d
       3: dup
       4: invokespecial #66                 // Method ryey/easer/plugins/event/g/d."<init>":()V
       7: areturn

  public ryey.easer.commons.local_plugin.eventplugin.a<ryey.easer.plugins.event.g.a> e();
    Code:
       0: new           #69                 // class ryey/easer/plugins/event/g/b
       3: dup
       4: invokespecial #70                 // Method ryey/easer/plugins/event/g/b."<init>":()V
       7: areturn
}
