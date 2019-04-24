public class ryey.easer.plugins.operation.ringer_mode.e implements ryey.easer.commons.local_plugin.c.d<ryey.easer.plugins.operation.ringer_mode.c> {
  public ryey.easer.plugins.operation.ringer_mode.e();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #16                 // String ringer_mode
       2: areturn

  public void a(android.app.Activity, int);
    Code:
       0: aload_1
       1: iconst_1
       2: anewarray     #19                 // class java/lang/String
       5: dup
       6: iconst_0
       7: ldc           #21                 // String android.permission.MODIFY_AUDIO_SETTINGS
       9: aastore
      10: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      13: ifne          30
      16: aload_1
      17: iload_2
      18: iconst_1
      19: anewarray     #19                 // class java/lang/String
      22: dup
      23: iconst_0
      24: ldc           #21                 // String android.permission.MODIFY_AUDIO_SETTINGS
      26: aastore
      27: invokestatic  #29                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      30: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
      33: bipush        21
      35: if_icmplt     99
      38: aload_1
      39: ldc           #37                 // class ryey/easer/plugins/operation/ringer_mode/InterruptionFilterSwitcherService
      41: invokestatic  #41                 // Method ryey/easer/plugins/b/d.b:(Landroid/content/Context;Ljava/lang/Class;)Z
      44: ifne          99
      47: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
      50: bipush        22
      52: if_icmplt     71
      55: aload_1
      56: new           #43                 // class android/content/Intent
      59: dup
      60: ldc           #45                 // String android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS
      62: invokespecial #48                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      65: invokevirtual #54                 // Method android/app/Activity.startActivity:(Landroid/content/Intent;)V
      68: goto          93
      71: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
      74: bipush        21
      76: if_icmplt     93
      79: aload_1
      80: iload_2
      81: iconst_1
      82: anewarray     #19                 // class java/lang/String
      85: dup
      86: iconst_0
      87: ldc           #56                 // String android.permission.BIND_NOTIFICATION_LISTENER_SERVICE
      89: aastore
      90: invokestatic  #29                 // Method ryey/easer/plugins/b/d.a:(Landroid/app/Activity;I[Ljava/lang/String;)V
      93: aload_1
      94: ldc           #37                 // class ryey/easer/plugins/operation/ringer_mode/InterruptionFilterSwitcherService
      96: invokestatic  #59                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;Ljava/lang/Class;)V
      99: return

  public boolean a(android.content.Context);
    Code:
       0: iconst_1
       1: ireturn

  public int b();
    Code:
       0: ldc           #62                 // int 2131624198
       2: ireturn

  public boolean b(android.content.Context);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: istore_2
       4: iconst_0
       5: istore        4
       7: iload_2
       8: bipush        21
      10: if_icmpge     27
      13: aload_1
      14: iconst_1
      15: anewarray     #19                 // class java/lang/String
      18: dup
      19: iconst_0
      20: ldc           #21                 // String android.permission.MODIFY_AUDIO_SETTINGS
      22: aastore
      23: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      26: ireturn
      27: iload         4
      29: istore_3
      30: aload_1
      31: iconst_1
      32: anewarray     #19                 // class java/lang/String
      35: dup
      36: iconst_0
      37: ldc           #21                 // String android.permission.MODIFY_AUDIO_SETTINGS
      39: aastore
      40: invokestatic  #26                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;[Ljava/lang/String;)Z
      43: ifeq          60
      46: iload         4
      48: istore_3
      49: aload_1
      50: ldc           #37                 // class ryey/easer/plugins/operation/ringer_mode/InterruptionFilterSwitcherService
      52: invokestatic  #41                 // Method ryey/easer/plugins/b/d.b:(Landroid/content/Context;Ljava/lang/Class;)Z
      55: ifeq          60
      58: iconst_1
      59: istore_3
      60: iload_3
      61: ireturn

  public ryey.easer.commons.local_plugin.a c();
    Code:
       0: aload_0
       1: invokevirtual #68                 // Method h:()Lryey/easer/commons/local_plugin/c/c;
       4: areturn

  public ryey.easer.commons.local_plugin.c.a c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #73                 // Method d:(Landroid/content/Context;)Lryey/easer/plugins/operation/c;
       5: areturn

  public ryey.easer.commons.local_plugin.e<ryey.easer.plugins.operation.ringer_mode.c> d();
    Code:
       0: new           #76                 // class ryey/easer/plugins/operation/ringer_mode/f
       3: dup
       4: invokespecial #77                 // Method ryey/easer/plugins/operation/ringer_mode/f."<init>":()V
       7: areturn

  public ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.ringer_mode.c> d(android.content.Context);
    Code:
       0: new           #81                 // class ryey/easer/plugins/operation/ringer_mode/b
       3: dup
       4: aload_1
       5: invokespecial #84                 // Method ryey/easer/plugins/operation/ringer_mode/b."<init>":(Landroid/content/Context;)V
       8: areturn

  public ryey.easer.commons.local_plugin.c.e e();
    Code:
       0: getstatic     #92                 // Field ryey/easer/commons/local_plugin/c/e.a:Lryey/easer/commons/local_plugin/c/e;
       3: areturn

  public int f();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.b.a.a g();
    Code:
       0: getstatic     #100                // Field ryey/easer/b/a/a.b:Lryey/easer/b/a/a;
       3: areturn

  public ryey.easer.commons.local_plugin.c.c<ryey.easer.plugins.operation.ringer_mode.c> h();
    Code:
       0: new           #102                // class ryey/easer/plugins/operation/ringer_mode/d
       3: dup
       4: invokespecial #103                // Method ryey/easer/plugins/operation/ringer_mode/d."<init>":()V
       7: areturn
}
