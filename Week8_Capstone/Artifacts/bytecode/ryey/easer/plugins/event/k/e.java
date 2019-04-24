public class ryey.easer.plugins.event.k.e extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.k.a> {
  android.content.BroadcastReceiver g;

  android.content.IntentFilter h;

  ryey.easer.plugins.event.k.e(android.content.Context, ryey.easer.plugins.event.k.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #16                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/k/a;ZZ)V
       8: return

  ryey.easer.plugins.event.k.e(android.content.Context, ryey.easer.plugins.event.k.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #20                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/event/k/e$1
      13: dup
      14: aload_0
      15: invokespecial #23                 // Method ryey/easer/plugins/event/k/e$1."<init>":(Lryey/easer/plugins/event/k/e;)V
      18: putfield      #25                 // Field g:Landroid/content/BroadcastReceiver;
      21: return

  static ryey.easer.commons.local_plugin.eventplugin.EventData a(ryey.easer.plugins.event.k.e);
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  static void a(ryey.easer.plugins.event.k.e, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #35                 // Method a:(Z)V
       5: return

  static ryey.easer.commons.local_plugin.eventplugin.EventData b(ryey.easer.plugins.event.k.e);
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  static void b(ryey.easer.plugins.event.k.e, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #35                 // Method a:(Z)V
       5: return

  static ryey.easer.commons.local_plugin.eventplugin.EventData c(ryey.easer.plugins.event.k.e);
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  static void c(ryey.easer.plugins.event.k.e, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #35                 // Method a:(Z)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #25                 // Field g:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #42                 // Field h:Landroid/content/IntentFilter;
      12: invokevirtual #48                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #25                 // Field g:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #42                 // Field h:Landroid/content/IntentFilter;
      12: invokevirtual #48                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return
}
