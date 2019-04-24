public class ryey.easer.plugins.event.nfc_tag.NfcListenerActivity extends android.app.Activity {
  public ryey.easer.plugins.event.nfc_tag.NfcListenerActivity();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/app/Activity."<init>":()V
       4: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #13                 // Method android/app/Activity.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: invokevirtual #17                 // Method getIntent:()Landroid/content/Intent;
       9: invokevirtual #23                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      12: astore_1
      13: ldc           #25                 // String android.nfc.action.TAG_DISCOVERED
      15: aload_1
      16: invokevirtual #31                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      19: ifne          40
      22: ldc           #33                 // String android.nfc.action.TECH_DISCOVERED
      24: aload_1
      25: invokevirtual #31                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      28: ifne          40
      31: ldc           #35                 // String android.nfc.action.NDEF_DISCOVERED
      33: aload_1
      34: invokevirtual #31                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      37: ifeq          71
      40: new           #19                 // class android/content/Intent
      43: dup
      44: ldc           #37                 // String ryey.easer.plugins.event.nfc_tag.action.NFC_SCANNED
      46: invokespecial #40                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      49: astore_1
      50: aload_1
      51: aload_0
      52: invokevirtual #17                 // Method getIntent:()Landroid/content/Intent;
      55: invokevirtual #44                 // Method android/content/Intent.putExtras:(Landroid/content/Intent;)Landroid/content/Intent;
      58: pop
      59: aload_0
      60: invokevirtual #48                 // Method getApplicationContext:()Landroid/content/Context;
      63: invokestatic  #54                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      66: aload_1
      67: invokevirtual #57                 // Method android/support/v4/a/c.a:(Landroid/content/Intent;)Z
      70: pop
      71: aload_0
      72: invokevirtual #60                 // Method finish:()V
      75: return
}
