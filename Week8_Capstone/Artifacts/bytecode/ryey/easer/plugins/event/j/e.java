public class ryey.easer.plugins.event.j.e extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.j.a> {
  static {};
    Code:
       0: getstatic     #21                 // Field android/os/Build$VERSION.SDK_INT:I
       3: istore_0
       4: ldc           #23                 // String android.intent.action.HEADSET_PLUG
       6: putstatic     #25                 // Field g:Ljava/lang/String;
       9: return

  ryey.easer.plugins.event.j.e(android.content.Context, ryey.easer.plugins.event.j.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #31                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/j/a;ZZ)V
       8: return

  ryey.easer.plugins.event.j.e(android.content.Context, ryey.easer.plugins.event.j.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #34                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #36                 // class android/content/IntentFilter
      13: dup
      14: getstatic     #25                 // Field g:Ljava/lang/String;
      17: invokespecial #39                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      20: putfield      #41                 // Field h:Landroid/content/IntentFilter;
      23: aload_0
      24: new           #7                  // class ryey/easer/plugins/event/j/e$1
      27: dup
      28: aload_0
      29: invokespecial #44                 // Method ryey/easer/plugins/event/j/e$1."<init>":(Lryey/easer/plugins/event/j/e;)V
      32: putfield      #46                 // Field i:Landroid/content/BroadcastReceiver;
      35: return

  static ryey.easer.commons.local_plugin.eventplugin.EventData a(ryey.easer.plugins.event.j.e);
    Code:
       0: aload_0
       1: getfield      #52                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  static void a(ryey.easer.plugins.event.j.e, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #56                 // Method a:(Z)V
       5: return

  static boolean a(ryey.easer.plugins.event.j.a, boolean, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokestatic  #59                 // Method b:(Lryey/easer/plugins/event/j/a;ZZ)Z
       6: ireturn

  static java.lang.String c();
    Code:
       0: getstatic     #25                 // Field g:Ljava/lang/String;
       3: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #83                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #46                 // Field i:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #41                 // Field h:Landroid/content/IntentFilter;
      12: invokevirtual #89                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #83                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #46                 // Field i:Landroid/content/BroadcastReceiver;
       8: invokevirtual #93                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
