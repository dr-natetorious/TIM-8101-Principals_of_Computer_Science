public class ryey.easer.plugins.event.l.a extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.l.b> {
  public ryey.easer.plugins.event.l.a(android.content.Context, ryey.easer.plugins.event.l.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #18                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/l/b;ZZ)V
       8: return

  ryey.easer.plugins.event.l.a(android.content.Context, ryey.easer.plugins.event.l.b, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #22                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: aconst_null
      11: putfield      #24                 // Field g:Lryey/easer/plugins/event/l/e;
      14: aload_0
      15: new           #7                  // class ryey/easer/plugins/event/l/a$1
      18: dup
      19: aload_0
      20: invokespecial #27                 // Method ryey/easer/plugins/event/l/a$1."<init>":(Lryey/easer/plugins/event/l/a;)V
      23: putfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
      26: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
      29: bipush        19
      31: if_icmpge     52
      34: new           #37                 // class android/content/IntentFilter
      37: dup
      38: ldc           #39                 // String android.provider.Telephony.SMS_RECEIVED
      40: invokespecial #42                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      43: astore_1
      44: aload_0
      45: aload_1
      46: putfield      #44                 // Field i:Landroid/content/IntentFilter;
      49: goto          65
      52: new           #37                 // class android/content/IntentFilter
      55: dup
      56: ldc           #39                 // String android.provider.Telephony.SMS_RECEIVED
      58: invokespecial #42                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      61: astore_1
      62: goto          44
      65: aload_0
      66: aload_2
      67: getfield      #49                 // Field ryey/easer/plugins/event/l/b.a:Lryey/easer/plugins/event/l/e;
      70: putfield      #24                 // Field g:Lryey/easer/plugins/event/l/e;
      73: return

  static ryey.easer.plugins.event.l.e a(ryey.easer.plugins.event.l.a);
    Code:
       0: aload_0
       1: getfield      #24                 // Field g:Lryey/easer/plugins/event/l/e;
       4: areturn

  static void a(ryey.easer.plugins.event.l.a, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #54                 // Method a:(Z)V
       5: return

  static void a(ryey.easer.plugins.event.l.a, boolean, android.os.Bundle);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokevirtual #58                 // Method a:(ZLandroid/os/Bundle;)V
       6: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #62                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #44                 // Field i:Landroid/content/IntentFilter;
      12: invokevirtual #68                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #62                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
       8: invokevirtual #73                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
