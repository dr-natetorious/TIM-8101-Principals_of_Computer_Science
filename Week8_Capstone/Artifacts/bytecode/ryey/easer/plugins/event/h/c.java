public class ryey.easer.plugins.event.h.c implements ryey.easer.commons.local_plugin.eventplugin.b<ryey.easer.plugins.event.h.a> {
  public ryey.easer.plugins.event.h.c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String date
       2: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/h/a
       6: invokevirtual #22                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/h/a;)Lryey/easer/plugins/event/b;
       9: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/h/a
       6: iload_3
       7: iload         4
       9: invokevirtual #26                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/h/a;ZZ)Lryey/easer/plugins/event/b;
      12: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.h.a> a(android.content.Context, ryey.easer.plugins.event.h.a);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/h/e
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #31                 // Method ryey/easer/plugins/event/h/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/h/a;)V
       9: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.h.a> a(android.content.Context, ryey.easer.plugins.event.h.a, boolean, boolean);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/h/e
       3: dup
       4: aload_1
       5: aload_2
       6: iload_3
       7: iload         4
       9: invokespecial #36                 // Method ryey/easer/plugins/event/h/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/h/a;ZZ)V
      12: areturn

  public void a(android.app.Activity, int);
    Code:
       0: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #42                 // int 2131624061
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #48                 // Method e:()Lryey/easer/commons/local_plugin/eventplugin/a;
       4: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.event.h.a> d();
    Code:
       0: new           #52                 // class ryey/easer/plugins/event/h/d
       3: dup
       4: invokespecial #53                 // Method ryey/easer/plugins/event/h/d."<init>":()V
       7: areturn

  public ryey.easer.commons.local_plugin.eventplugin.a<ryey.easer.plugins.event.h.a> e();
    Code:
       0: new           #56                 // class ryey/easer/plugins/event/h/b
       3: dup
       4: invokespecial #57                 // Method ryey/easer/plugins/event/h/b."<init>":()V
       7: areturn
}
