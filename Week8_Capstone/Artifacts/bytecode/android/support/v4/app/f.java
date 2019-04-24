abstract class android.support.v4.app.f extends android.support.v4.app.e {
  boolean mStartedActivityFromFragment;

  android.support.v4.app.f();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method android/support/v4/app/e."<init>":()V
       4: return

  public void startActivityForResult(android.content.Intent, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #15                 // Field mStartedActivityFromFragment:Z
       4: ifne          16
       7: iload_2
       8: iconst_m1
       9: if_icmpeq     16
      12: iload_2
      13: invokestatic  #19                 // Method checkForValidRequestCode:(I)V
      16: aload_0
      17: aload_1
      18: iload_2
      19: aload_3
      20: invokespecial #21                 // Method android/support/v4/app/e.startActivityForResult:(Landroid/content/Intent;ILandroid/os/Bundle;)V
      23: return

  public void startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #26                 // Field mStartedIntentSenderFromFragment:Z
       4: ifne          16
       7: iload_2
       8: iconst_m1
       9: if_icmpeq     16
      12: iload_2
      13: invokestatic  #19                 // Method checkForValidRequestCode:(I)V
      16: aload_0
      17: aload_1
      18: iload_2
      19: aload_3
      20: iload         4
      22: iload         5
      24: iload         6
      26: aload         7
      28: invokespecial #28                 // Method android/support/v4/app/e.startIntentSenderForResult:(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      31: return
}
