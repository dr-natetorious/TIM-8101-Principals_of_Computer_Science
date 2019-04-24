class ryey.easer.plugins.event.nfc_tag.NfcListenerService$a extends android.os.Binder {
  final ryey.easer.plugins.event.nfc_tag.NfcListenerService a;

  ryey.easer.plugins.event.nfc_tag.NfcListenerService$a(ryey.easer.plugins.event.nfc_tag.NfcListenerService);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/nfc_tag/NfcListenerService;
       5: aload_0
       6: invokespecial #15                 // Method android/os/Binder."<init>":()V
       9: return

  void a(ryey.easer.plugins.event.nfc_tag.e);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/plugins/event/nfc_tag/NfcListenerService;
       4: invokestatic  #20                 // Method ryey/easer/plugins/event/nfc_tag/NfcListenerService.a:(Lryey/easer/plugins/event/nfc_tag/NfcListenerService;)Ljava/util/Set;
       7: aload_1
       8: invokeinterface #26,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      13: pop
      14: return

  void b(ryey.easer.plugins.event.nfc_tag.e);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/plugins/event/nfc_tag/NfcListenerService;
       4: invokestatic  #20                 // Method ryey/easer/plugins/event/nfc_tag/NfcListenerService.a:(Lryey/easer/plugins/event/nfc_tag/NfcListenerService;)Ljava/util/Set;
       7: aload_1
       8: invokeinterface #30,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
      13: pop
      14: return
}
