class ryey.easer.plugins.event.nfc_tag.e$1 implements android.content.ServiceConnection {
  final ryey.easer.plugins.event.nfc_tag.e a;

  ryey.easer.plugins.event.nfc_tag.e$1(ryey.easer.plugins.event.nfc_tag.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lryey/easer/plugins/event/nfc_tag/e;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onServiceConnected(android.content.ComponentName, android.os.IBinder);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lryey/easer/plugins/event/nfc_tag/e;
       4: aload_2
       5: checkcast     #22                 // class ryey/easer/plugins/event/nfc_tag/NfcListenerService$a
       8: invokestatic  #25                 // Method ryey/easer/plugins/event/nfc_tag/e.a:(Lryey/easer/plugins/event/nfc_tag/e;Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;)Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;
      11: pop
      12: aload_0
      13: getfield      #14                 // Field a:Lryey/easer/plugins/event/nfc_tag/e;
      16: invokestatic  #28                 // Method ryey/easer/plugins/event/nfc_tag/e.a:(Lryey/easer/plugins/event/nfc_tag/e;)Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;
      19: aload_0
      20: getfield      #14                 // Field a:Lryey/easer/plugins/event/nfc_tag/e;
      23: invokevirtual #30                 // Method ryey/easer/plugins/event/nfc_tag/NfcListenerService$a.a:(Lryey/easer/plugins/event/nfc_tag/e;)V
      26: return

  public void onServiceDisconnected(android.content.ComponentName);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lryey/easer/plugins/event/nfc_tag/e;
       4: invokestatic  #28                 // Method ryey/easer/plugins/event/nfc_tag/e.a:(Lryey/easer/plugins/event/nfc_tag/e;)Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;
       7: aload_0
       8: getfield      #14                 // Field a:Lryey/easer/plugins/event/nfc_tag/e;
      11: invokevirtual #35                 // Method ryey/easer/plugins/event/nfc_tag/NfcListenerService$a.b:(Lryey/easer/plugins/event/nfc_tag/e;)V
      14: aload_0
      15: getfield      #14                 // Field a:Lryey/easer/plugins/event/nfc_tag/e;
      18: aconst_null
      19: invokestatic  #25                 // Method ryey/easer/plugins/event/nfc_tag/e.a:(Lryey/easer/plugins/event/nfc_tag/e;Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;)Lryey/easer/plugins/event/nfc_tag/NfcListenerService$a;
      22: pop
      23: return
}
