public class ryey.easer.plugins.event.nfc_tag.e extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.nfc_tag.a> {
  public ryey.easer.plugins.event.nfc_tag.e(android.content.Context, ryey.easer.plugins.event.nfc_tag.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #18                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/nfc_tag/a;ZZ)V
       8: return

  ryey.easer.plugins.event.nfc_tag.e(android.content.Context, ryey.easer.plugins.event.nfc_tag.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #22                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #24                 // class android/content/Intent
      13: dup
      14: aload_0
      15: getfield      #28                 // Field a:Landroid/content/Context;
      18: ldc           #30                 // class ryey/easer/plugins/event/nfc_tag/NfcListenerService
      20: invokespecial #33                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      23: putfield      #35                 // Field h:Landroid/content/Intent;
      26: aload_0
      27: new           #7                  // class ryey/easer/plugins/event/nfc_tag/e$1
      30: dup
      31: aload_0
      32: invokespecial #38                 // Method ryey/easer/plugins/event/nfc_tag/e$1."<init>":(Lryey/easer/plugins/event/nfc_tag/e;)V
      35: putfield      #40                 // Field i:Landroid/content/ServiceConnection;
      38: return

  static ryey.easer.plugins.event.nfc_tag.NfcListenerService$a a(ryey.easer.plugins.event.nfc_tag.e);
    Code:
       0: aload_0
       1: getfield      #43                 // Field g:Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;
       4: areturn

  static ryey.easer.plugins.event.nfc_tag.NfcListenerService$a a(ryey.easer.plugins.event.nfc_tag.e, ryey.easer.plugins.event.nfc_tag.NfcListenerService$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #43                 // Field g:Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;
       5: aload_1
       6: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #35                 // Field h:Landroid/content/Intent;
       8: aload_0
       9: getfield      #40                 // Field i:Landroid/content/ServiceConnection;
      12: iconst_1
      13: invokevirtual #51                 // Method android/content/Context.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      16: pop
      17: return

  void a(android.nfc.Tag);
    Code:
       0: aload_1
       1: invokevirtual #58                 // Method android/nfc/Tag.getId:()[B
       4: aload_0
       5: getfield      #62                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: checkcast     #64                 // class ryey/easer/plugins/event/nfc_tag/a
      11: getfield      #67                 // Field ryey/easer/plugins/event/nfc_tag/a.a:[B
      14: invokestatic  #73                 // Method java/util/Arrays.equals:([B[B)Z
      17: ifeq          28
      20: iconst_1
      21: istore_2
      22: aload_0
      23: iload_2
      24: invokevirtual #76                 // Method a:(Z)V
      27: return
      28: iconst_0
      29: istore_2
      30: goto          22

  public void b();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #40                 // Field i:Landroid/content/ServiceConnection;
       8: invokevirtual #80                 // Method android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
      11: return
}
