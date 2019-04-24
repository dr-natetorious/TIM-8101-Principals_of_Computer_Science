public class ryey.easer.plugins.event.nfc_tag.WaitForNfcActivity extends android.app.Activity {
  android.nfc.NfcAdapter a;

  android.app.PendingIntent b;

  public ryey.easer.plugins.event.nfc_tag.WaitForNfcActivity();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/app/Activity."<init>":()V
       4: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #128                // Method android/app/Activity.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: ldc           #129                // int 2131427381
       8: invokevirtual #133                // Method setContentView:(I)V
      11: aload_0
      12: aload_0
      13: invokestatic  #139                // Method android/nfc/NfcAdapter.getDefaultAdapter:(Landroid/content/Context;)Landroid/nfc/NfcAdapter;
      16: putfield      #141                // Field a:Landroid/nfc/NfcAdapter;
      19: aload_0
      20: getfield      #141                // Field a:Landroid/nfc/NfcAdapter;
      23: ifnonnull     39
      26: ldc           #143                // String No nfc adapter. This page shouldn't be opened because it won't be detected as \"compatible\"
      28: iconst_0
      29: anewarray     #85                 // class java/lang/Object
      32: invokestatic  #145                // Method com/b/a/i.b:(Ljava/lang/String;[Ljava/lang/Object;)V
      35: aload_0
      36: invokevirtual #92                 // Method finish:()V
      39: aload_0
      40: aload_0
      41: iconst_0
      42: new           #35                 // class android/content/Intent
      45: dup
      46: aload_0
      47: aload_0
      48: invokevirtual #149                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      51: invokespecial #150                // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      54: ldc           #151                // int 536870912
      56: invokevirtual #155                // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
      59: iconst_0
      60: invokestatic  #161                // Method android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
      63: putfield      #163                // Field b:Landroid/app/PendingIntent;
      66: return

  protected void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #166                // Method android/app/Activity.onDestroy:()V
       4: aload_0
       5: invokespecial #168                // Method a:()V
       8: return

  public void onNewIntent(android.content.Intent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #171                // Method a:(Landroid/content/Intent;)V
       5: return

  protected void onPause();
    Code:
       0: aload_0
       1: invokespecial #174                // Method android/app/Activity.onPause:()V
       4: aload_0
       5: getfield      #141                // Field a:Landroid/nfc/NfcAdapter;
       8: ifnull        19
      11: aload_0
      12: getfield      #141                // Field a:Landroid/nfc/NfcAdapter;
      15: aload_0
      16: invokevirtual #178                // Method android/nfc/NfcAdapter.disableForegroundDispatch:(Landroid/app/Activity;)V
      19: return

  protected void onResume();
    Code:
       0: aload_0
       1: invokespecial #181                // Method android/app/Activity.onResume:()V
       4: aload_0
       5: getfield      #141                // Field a:Landroid/nfc/NfcAdapter;
       8: ifnull        48
      11: aload_0
      12: getfield      #141                // Field a:Landroid/nfc/NfcAdapter;
      15: invokevirtual #185                // Method android/nfc/NfcAdapter.isEnabled:()Z
      18: ifne          31
      21: ldc           #187                // String NFC adapter not enabled
      23: invokestatic  #58                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      26: aload_0
      27: invokespecial #189                // Method b:()V
      30: return
      31: aload_0
      32: getfield      #141                // Field a:Landroid/nfc/NfcAdapter;
      35: aload_0
      36: aload_0
      37: getfield      #163                // Field b:Landroid/app/PendingIntent;
      40: aconst_null
      41: aconst_null
      42: checkcast     #191                // class "[[Ljava/lang/String;"
      45: invokevirtual #195                // Method android/nfc/NfcAdapter.enableForegroundDispatch:(Landroid/app/Activity;Landroid/app/PendingIntent;[Landroid/content/IntentFilter;[[Ljava/lang/String;)V
      48: return
}
