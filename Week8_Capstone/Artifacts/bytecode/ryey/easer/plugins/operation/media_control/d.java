public class ryey.easer.plugins.operation.media_control.d implements ryey.easer.commons.local_plugin.c.d<ryey.easer.plugins.operation.media_control.b> {
  public ryey.easer.plugins.operation.media_control.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String media_control
       2: areturn

  public void a(android.app.Activity, int);
    Code:
       0: getstatic     #23                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     61
       8: aload_1
       9: ldc           #25                 // class ryey/easer/plugins/operation/media_control/MediaControlHelperNotificationListenerService
      11: invokestatic  #31                 // Method ryey/easer/plugins/b/d.b:(Landroid/content/Context;Ljava/lang/Class;)Z
      14: ifne          61
      17: getstatic     #23                 // Field android/os/Build$VERSION.SDK_INT:I
      20: bipush        22
      22: if_icmplt     41
      25: aload_1
      26: new           #33                 // class android/content/Intent
      29: dup
      30: ldc           #35                 // String android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS
      32: invokespecial #38                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      35: invokevirtual #44                 // Method android/app/Activity.startActivity:(Landroid/content/Intent;)V
      38: goto          55
      41: aload_1
      42: iload_2
      43: iconst_1
      44: anewarray     #46                 // class java/lang/String
      47: dup
      48: iconst_0
      49: ldc           #48                 // String android.permission.BIND_NOTIFICATION_LISTENER_SERVICE
      51: aastore
      52: invokestatic  #51                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      55: aload_1
      56: ldc           #25                 // class ryey/easer/plugins/operation/media_control/MediaControlHelperNotificationListenerService
      58: invokestatic  #54                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;Ljava/lang/Class;)V
      61: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #57                 // int 2131624195
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: getstatic     #23                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     15
       8: aload_1
       9: ldc           #25                 // class ryey/easer/plugins/operation/media_control/MediaControlHelperNotificationListenerService
      11: invokestatic  #31                 // Method ryey/easer/plugins/b/d.b:(Landroid/content/Context;Ljava/lang/Class;)Z
      14: ireturn
      15: iconst_1
      16: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #63                 // Method h:()Lryey/easer/commons/local_plugin/c/c;
       4: areturn

  public ryey.easer.commons.local_plugin.c.a c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #68                 // Method d:(Landroid/content/Context;)Lryey/easer/plugins/operation/c;
       5: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.operation.media_control.b> d();
    Code:
       0: new           #71                 // class ryey/easer/plugins/operation/media_control/e
       3: dup
       4: invokespecial #72                 // Method ryey/easer/plugins/operation/media_control/e."<init>":()V
       7: areturn

  public ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.media_control.b> d(android.content.Context);
    Code:
       0: new           #76                 // class ryey/easer/plugins/operation/media_control/a
       3: dup
       4: aload_1
       5: invokespecial #79                 // Method ryey/easer/plugins/operation/media_control/a."<init>":(Landroid/content/Context;)V
       8: areturn

  public ryey.easer.commons.local_plugin.c.e e();
    Code:
       0: getstatic     #87                 // Field ryey/easer/commons/local_plugin/c/e.a:Lryey/easer/commons/local_plugin/c/e;
       3: areturn

  public int f();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.b.a.a g();
    Code:
       0: getstatic     #95                 // Field ryey/easer/b/a/a.a:Lryey/easer/b/a/a;
       3: areturn

  public ryey.easer.commons.local_plugin.c.c<ryey.easer.plugins.operation.media_control.b> h();
    Code:
       0: new           #97                 // class ryey/easer/plugins/operation/media_control/c
       3: dup
       4: invokespecial #98                 // Method ryey/easer/plugins/operation/media_control/c."<init>":()V
       7: areturn
}
