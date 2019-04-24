public class ryey.easer.plugins.event.notification.c implements ryey.easer.commons.local_plugin.eventplugin.b<ryey.easer.plugins.event.notification.a> {
  public ryey.easer.plugins.event.notification.c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String notification
       2: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/notification/a
       6: invokevirtual #22                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/notification/a;)Lryey/easer/plugins/event/b;
       9: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/notification/a
       6: iload_3
       7: iload         4
       9: invokevirtual #26                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/notification/a;ZZ)Lryey/easer/plugins/event/b;
      12: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.notification.a> a(android.content.Context, ryey.easer.plugins.event.notification.a);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/notification/e
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #31                 // Method ryey/easer/plugins/event/notification/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/notification/a;)V
       9: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.notification.a> a(android.content.Context, ryey.easer.plugins.event.notification.a, boolean, boolean);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/notification/e
       3: dup
       4: aload_1
       5: aload_2
       6: iload_3
       7: iload         4
       9: invokespecial #36                 // Method ryey/easer/plugins/event/notification/e."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/notification/a;ZZ)V
      12: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: ldc           #40                 // class ryey/easer/plugins/event/notification/NotificationEventListenerService
       3: invokestatic  #46                 // Method ryey/easer/plugins/b/d.b:(Landroid/content/Context;Ljava/lang/Class;)Z
       6: ifne          47
       9: getstatic     #52                 // Field android/os/Build$VERSION.SDK_INT:I
      12: bipush        22
      14: if_icmplt     33
      17: aload_1
      18: new           #54                 // class android/content/Intent
      21: dup
      22: ldc           #56                 // String android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS
      24: invokespecial #59                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      27: invokevirtual #65                 // Method android/app/Activity.startActivity:(Landroid/content/Intent;)V
      30: goto          47
      33: aload_1
      34: iload_2
      35: iconst_1
      36: anewarray     #67                 // class java/lang/String
      39: dup
      40: iconst_0
      41: ldc           #69                 // String android.permission.BIND_NOTIFICATION_LISTENER_SERVICE
      43: aastore
      44: invokestatic  #72                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      47: aload_1
      48: ldc           #40                 // class ryey/easer/plugins/event/notification/NotificationEventListenerService
      50: invokestatic  #75                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;Ljava/lang/Class;)V
      53: return

  public boolean a(android.content.Context);
    Code:
       0: getstatic     #52                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public int b();
    Code:
       0: ldc           #78                 // int 2131624076
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: ldc           #40                 // class ryey/easer/plugins/event/notification/NotificationEventListenerService
       3: invokestatic  #46                 // Method ryey/easer/plugins/b/d.b:(Landroid/content/Context;Ljava/lang/Class;)Z
       6: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #84                 // Method e:()Lryey/easer/commons/local_plugin/eventplugin/a;
       4: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.event.notification.a> d();
    Code:
       0: new           #88                 // class ryey/easer/plugins/event/notification/d
       3: dup
       4: invokespecial #89                 // Method ryey/easer/plugins/event/notification/d."<init>":()V
       7: areturn

  public ryey.easer.commons.local_plugin.eventplugin.a<ryey.easer.plugins.event.notification.a> e();
    Code:
       0: new           #92                 // class ryey/easer/plugins/event/notification/b
       3: dup
       4: invokespecial #93                 // Method ryey/easer/plugins/event/notification/b."<init>":()V
       7: areturn
}
