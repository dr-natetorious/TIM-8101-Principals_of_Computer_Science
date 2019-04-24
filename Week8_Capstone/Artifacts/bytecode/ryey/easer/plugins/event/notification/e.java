public class ryey.easer.plugins.event.notification.e extends ryey.easer.plugins.event.c<ryey.easer.plugins.event.notification.a> {
  public ryey.easer.plugins.event.notification.e(android.content.Context, ryey.easer.plugins.event.notification.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #10                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/notification/a;ZZ)V
       8: return

  ryey.easer.plugins.event.notification.e(android.content.Context, ryey.easer.plugins.event.notification.a, boolean, boolean);
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
       8: checkcast     #25                 // class ryey/easer/plugins/event/notification/a
      11: aload_0
      12: getfield      #29                 // Field g:Landroid/net/Uri;
      15: invokestatic  #34                 // Method ryey/easer/plugins/event/notification/NotificationEventListenerService.a:(Landroid/content/Context;Lryey/easer/plugins/event/notification/a;Landroid/net/Uri;)V
      18: return

  protected void a(android.content.Intent);
    Code:
       0: ldc           #37                 // String onPositiveNotified
       2: iconst_0
       3: anewarray     #39                 // class java/lang/Object
       6: invokestatic  #45                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: iconst_1
      11: aload_1
      12: invokevirtual #51                 // Method android/content/Intent.getExtras:()Landroid/os/Bundle;
      15: invokevirtual #54                 // Method a:(ZLandroid/os/Bundle;)V
      18: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #23                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: checkcast     #25                 // class ryey/easer/plugins/event/notification/a
      11: aload_0
      12: getfield      #29                 // Field g:Landroid/net/Uri;
      15: invokestatic  #56                 // Method ryey/easer/plugins/event/notification/NotificationEventListenerService.b:(Landroid/content/Context;Lryey/easer/plugins/event/notification/a;Landroid/net/Uri;)V
      18: return

  protected void b(android.content.Intent);
    Code:
       0: ldc           #58                 // String onNegativeNotified
       2: iconst_0
       3: anewarray     #39                 // class java/lang/Object
       6: invokestatic  #45                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: iconst_0
      11: aload_1
      12: invokevirtual #51                 // Method android/content/Intent.getExtras:()Landroid/os/Bundle;
      15: invokevirtual #54                 // Method a:(ZLandroid/os/Bundle;)V
      18: return
}
