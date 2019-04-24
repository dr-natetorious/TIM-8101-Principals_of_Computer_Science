class ryey.easer.plugins.event.nfc_tag.WaitForNfcActivity$1 implements android.content.DialogInterface$OnClickListener {
  final ryey.easer.plugins.event.nfc_tag.WaitForNfcActivity a;

  ryey.easer.plugins.event.nfc_tag.WaitForNfcActivity$1(ryey.easer.plugins.event.nfc_tag.WaitForNfcActivity);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/event/nfc_tag/WaitForNfcActivity;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: new           #24                 // class android/content/Intent
       3: dup
       4: ldc           #26                 // String android.settings.WIRELESS_SETTINGS
       6: invokespecial #29                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_1
      10: aload_0
      11: getfield      #17                 // Field a:Lryey/easer/plugins/event/nfc_tag/WaitForNfcActivity;
      14: aload_1
      15: invokevirtual #33                 // Method ryey/easer/plugins/event/nfc_tag/WaitForNfcActivity.startActivity:(Landroid/content/Intent;)V
      18: return
}
