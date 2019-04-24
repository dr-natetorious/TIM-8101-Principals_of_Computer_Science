public class ryey.easer.plugins.event.f.e extends ryey.easer.plugins.event.c<ryey.easer.plugins.event.f.a> {
  ryey.easer.plugins.event.f.e(android.content.Context, ryey.easer.plugins.event.f.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #10                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/f/a;ZZ)V
       8: return

  ryey.easer.plugins.event.f.e(android.content.Context, ryey.easer.plugins.event.f.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #14                 // Method ryey/easer/plugins/event/c."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #23                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: checkcast     #25                 // class ryey/easer/plugins/event/f/a
      11: getfield      #28                 // Field ryey/easer/plugins/event/f/a.a:Ljava/lang/String;
      14: aload_0
      15: getfield      #32                 // Field f:Landroid/net/Uri;
      18: invokestatic  #37                 // Method ryey/easer/core/EHService.a:(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V
      21: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #23                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: checkcast     #25                 // class ryey/easer/plugins/event/f/a
      11: getfield      #28                 // Field ryey/easer/plugins/event/f/a.a:Ljava/lang/String;
      14: aload_0
      15: getfield      #32                 // Field f:Landroid/net/Uri;
      18: invokestatic  #39                 // Method ryey/easer/core/EHService.b:(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V
      21: return
}
