public class ryey.easer.plugins.event.e.e extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.e.a> {
  static {};
    Code:
       0: return

  public ryey.easer.plugins.event.e.e(android.content.Context, ryey.easer.plugins.event.e.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #22                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/e/a;ZZ)V
       8: return

  ryey.easer.plugins.event.e.e(android.content.Context, ryey.easer.plugins.event.e.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #25                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/event/e/e$a
      13: dup
      14: aload_0
      15: invokespecial #28                 // Method ryey/easer/plugins/event/e/e$a."<init>":(Lryey/easer/plugins/event/e/e;)V
      18: putfield      #30                 // Field h:Lryey/easer/plugins/event/e/e$a;
      21: aload_0
      22: aconst_null
      23: putfield      #32                 // Field i:Lryey/easer/plugins/b/b;
      26: getstatic     #34                 // Field g:Landroid/telephony/TelephonyManager;
      29: ifnonnull     44
      32: aload_1
      33: ldc           #36                 // String phone
      35: invokevirtual #42                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      38: checkcast     #44                 // class android/telephony/TelephonyManager
      41: putstatic     #34                 // Field g:Landroid/telephony/TelephonyManager;
      44: return

  static android.os.Bundle a(android.telephony.CellLocation);
    Code:
       0: aload_0
       1: invokestatic  #48                 // Method b:(Landroid/telephony/CellLocation;)Landroid/os/Bundle;
       4: areturn

  static ryey.easer.plugins.b.b a(ryey.easer.plugins.event.e.e);
    Code:
       0: aload_0
       1: getfield      #32                 // Field i:Lryey/easer/plugins/b/b;
       4: areturn

  static ryey.easer.plugins.b.b a(ryey.easer.plugins.event.e.e, ryey.easer.plugins.b.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #32                 // Field i:Lryey/easer/plugins/b/b;
       5: aload_1
       6: areturn

  static void a(ryey.easer.plugins.event.e.e, boolean, android.os.Bundle);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokevirtual #54                 // Method a:(ZLandroid/os/Bundle;)V
       6: return

  static ryey.easer.commons.local_plugin.eventplugin.EventData b(ryey.easer.plugins.event.e.e);
    Code:
       0: aload_0
       1: getfield      #74                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  public void a();
    Code:
       0: getstatic     #34                 // Field g:Landroid/telephony/TelephonyManager;
       3: ifnull        18
       6: getstatic     #34                 // Field g:Landroid/telephony/TelephonyManager;
       9: aload_0
      10: getfield      #30                 // Field h:Lryey/easer/plugins/event/e/e$a;
      13: bipush        16
      15: invokevirtual #78                 // Method android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
      18: return

  public void b();
    Code:
       0: getstatic     #34                 // Field g:Landroid/telephony/TelephonyManager;
       3: ifnull        17
       6: getstatic     #34                 // Field g:Landroid/telephony/TelephonyManager;
       9: aload_0
      10: getfield      #30                 // Field h:Lryey/easer/plugins/event/e/e$a;
      13: iconst_0
      14: invokevirtual #78                 // Method android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
      17: return
}
