public class ryey.easer.plugins.event.l.d implements ryey.easer.commons.local_plugin.eventplugin.b<ryey.easer.plugins.event.l.b> {
  public ryey.easer.plugins.event.l.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String sms
       2: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/l/b
       6: invokevirtual #22                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/l/b;)Lryey/easer/plugins/event/b;
       9: areturn

  public ryey.easer.commons.local_plugin.eventplugin.c a(android.content.Context, ryey.easer.commons.local_plugin.eventplugin.EventData, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #19                 // class ryey/easer/plugins/event/l/b
       6: iload_3
       7: iload         4
       9: invokevirtual #26                 // Method a:(Landroid/content/Context;Lryey/easer/plugins/event/l/b;ZZ)Lryey/easer/plugins/event/b;
      12: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.l.b> a(android.content.Context, ryey.easer.plugins.event.l.b);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/l/a
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #31                 // Method ryey/easer/plugins/event/l/a."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/l/b;)V
       9: areturn

  public ryey.easer.plugins.event.b<ryey.easer.plugins.event.l.b> a(android.content.Context, ryey.easer.plugins.event.l.b, boolean, boolean);
    Code:
       0: new           #28                 // class ryey/easer/plugins/event/l/a
       3: dup
       4: aload_1
       5: aload_2
       6: iload_3
       7: iload         4
       9: invokespecial #36                 // Method ryey/easer/plugins/event/l/a."<init>":(Landroid/content/Context;Lryey/easer/plugins/event/l/b;ZZ)V
      12: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #40                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #42                 // String android.permission.READ_SMS
       9: aastore
      10: invokestatic  #47                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: istore_3
      14: aload_1
      15: iconst_1
      16: anewarray     #40                 // class java/lang/String
      19: dup
      20: iconst_0
      21: ldc           #49                 // String android.permission.RECEIVE_SMS
      23: aastore
      24: invokestatic  #47                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      27: istore        4
      29: iload_3
      30: ifne          58
      33: iload         4
      35: ifne          58
      38: aload_1
      39: iload_2
      40: iconst_2
      41: anewarray     #40                 // class java/lang/String
      44: dup
      45: iconst_0
      46: ldc           #42                 // String android.permission.READ_SMS
      48: aastore
      49: dup
      50: iconst_1
      51: ldc           #49                 // String android.permission.RECEIVE_SMS
      53: aastore
      54: invokestatic  #52                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      57: return
      58: iload_3
      59: ifne          82
      62: iconst_1
      63: anewarray     #40                 // class java/lang/String
      66: astore        5
      68: aload         5
      70: iconst_0
      71: ldc           #42                 // String android.permission.READ_SMS
      73: aastore
      74: aload_1
      75: iload_2
      76: aload         5
      78: invokestatic  #52                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      81: return
      82: iconst_1
      83: anewarray     #40                 // class java/lang/String
      86: astore        5
      88: aload         5
      90: iconst_0
      91: ldc           #49                 // String android.permission.RECEIVE_SMS
      93: aastore
      94: goto          74

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #56                 // int 2131624082
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: aload_1
       1: iconst_2
       2: anewarray     #40                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #42                 // String android.permission.READ_SMS
       9: aastore
      10: dup
      11: iconst_1
      12: ldc           #49                 // String android.permission.RECEIVE_SMS
      14: aastore
      15: invokestatic  #47                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      18: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #62                 // Method e:()Lryey/easer/commons/local_plugin/eventplugin/a;
       4: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.event.l.b> d();
    Code:
       0: new           #66                 // class ryey/easer/plugins/event/l/f
       3: dup
       4: invokespecial #67                 // Method ryey/easer/plugins/event/l/f."<init>":()V
       7: areturn

  public ryey.easer.commons.local_plugin.eventplugin.a<ryey.easer.plugins.event.l.b> e();
    Code:
       0: new           #70                 // class ryey/easer/plugins/event/l/c
       3: dup
       4: invokespecial #71                 // Method ryey/easer/plugins/event/l/c."<init>":()V
       7: areturn
}
