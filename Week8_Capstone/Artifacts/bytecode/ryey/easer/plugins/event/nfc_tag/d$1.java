class ryey.easer.plugins.event.nfc_tag.d$1 implements android.view.View$OnClickListener {
  final ryey.easer.plugins.event.nfc_tag.d a;

  ryey.easer.plugins.event.nfc_tag.d$1(ryey.easer.plugins.event.nfc_tag.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/event/nfc_tag/d;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/plugins/event/nfc_tag/d;
       4: invokestatic  #25                 // Method ryey/easer/plugins/event/nfc_tag/d.a:(Lryey/easer/plugins/event/nfc_tag/d;)V
       7: new           #27                 // class android/content/Intent
      10: dup
      11: aload_0
      12: getfield      #17                 // Field a:Lryey/easer/plugins/event/nfc_tag/d;
      15: invokevirtual #31                 // Method ryey/easer/plugins/event/nfc_tag/d.getActivity:()Landroid/support/v4/app/j;
      18: ldc           #33                 // class ryey/easer/plugins/event/nfc_tag/WaitForNfcActivity
      20: invokespecial #36                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      23: astore_1
      24: aload_0
      25: getfield      #17                 // Field a:Lryey/easer/plugins/event/nfc_tag/d;
      28: aload_1
      29: bipush        120
      31: invokevirtual #40                 // Method ryey/easer/plugins/event/nfc_tag/d.startActivityForResult:(Landroid/content/Intent;I)V
      34: return
}
