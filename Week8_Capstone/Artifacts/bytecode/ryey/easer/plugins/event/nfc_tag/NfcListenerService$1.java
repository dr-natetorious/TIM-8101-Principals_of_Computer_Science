class ryey.easer.plugins.event.nfc_tag.NfcListenerService$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.event.nfc_tag.NfcListenerService a;

  ryey.easer.plugins.event.nfc_tag.NfcListenerService$1(ryey.easer.plugins.event.nfc_tag.NfcListenerService);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/nfc_tag/NfcListenerService;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #20                 // String ryey.easer.plugins.event.nfc_tag.action.NFC_SCANNED
       2: aload_2
       3: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       6: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifeq          60
      12: aload_2
      13: ldc           #34                 // String android.nfc.extra.TAG
      15: invokevirtual #38                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      18: checkcast     #40                 // class android/nfc/Tag
      21: astore_1
      22: aload_0
      23: getfield      #12                 // Field a:Lryey/easer/plugins/event/nfc_tag/NfcListenerService;
      26: invokestatic  #43                 // Method ryey/easer/plugins/event/nfc_tag/NfcListenerService.a:(Lryey/easer/plugins/event/nfc_tag/NfcListenerService;)Ljava/util/Set;
      29: invokeinterface #49,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      34: astore_2
      35: aload_2
      36: invokeinterface #55,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      41: ifeq          60
      44: aload_2
      45: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      50: checkcast     #61                 // class ryey/easer/plugins/event/nfc_tag/e
      53: aload_1
      54: invokevirtual #64                 // Method ryey/easer/plugins/event/nfc_tag/e.a:(Landroid/nfc/Tag;)V
      57: goto          35
      60: return
}
