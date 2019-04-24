public class ryey.easer.plugins.event.nfc_tag.NfcListenerService extends android.app.Service {
  public ryey.easer.plugins.event.nfc_tag.NfcListenerService();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method android/app/Service."<init>":()V
       4: aload_0
       5: new           #21                 // class android/content/IntentFilter
       8: dup
       9: ldc           #23                 // String ryey.easer.plugins.event.nfc_tag.action.NFC_SCANNED
      11: invokespecial #26                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      14: putfield      #28                 // Field a:Landroid/content/IntentFilter;
      17: aload_0
      18: new           #6                  // class ryey/easer/plugins/event/nfc_tag/NfcListenerService$1
      21: dup
      22: aload_0
      23: invokespecial #31                 // Method ryey/easer/plugins/event/nfc_tag/NfcListenerService$1."<init>":(Lryey/easer/plugins/event/nfc_tag/NfcListenerService;)V
      26: putfield      #33                 // Field b:Landroid/content/BroadcastReceiver;
      29: aload_0
      30: new           #35                 // class android/support/v4/g/b
      33: dup
      34: invokespecial #36                 // Method android/support/v4/g/b."<init>":()V
      37: putfield      #38                 // Field c:Ljava/util/Set;
      40: return

  static java.util.Set a(ryey.easer.plugins.event.nfc_tag.NfcListenerService);
    Code:
       0: aload_0
       1: getfield      #38                 // Field c:Ljava/util/Set;
       4: areturn

  public android.os.IBinder onBind(android.content.Intent);
    Code:
       0: new           #8                  // class ryey/easer/plugins/event/nfc_tag/NfcListenerService$a
       3: dup
       4: aload_0
       5: invokespecial #43                 // Method ryey/easer/plugins/event/nfc_tag/NfcListenerService$a."<init>":(Lryey/easer/plugins/event/nfc_tag/NfcListenerService;)V
       8: areturn

  public void onCreate();
    Code:
       0: aload_0
       1: invokespecial #46                 // Method android/app/Service.onCreate:()V
       4: aload_0
       5: invokevirtual #50                 // Method getApplicationContext:()Landroid/content/Context;
       8: invokestatic  #55                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      11: aload_0
      12: getfield      #33                 // Field b:Landroid/content/BroadcastReceiver;
      15: aload_0
      16: getfield      #28                 // Field a:Landroid/content/IntentFilter;
      19: invokevirtual #58                 // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
      22: return

  public void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #61                 // Method android/app/Service.onDestroy:()V
       4: aload_0
       5: invokevirtual #50                 // Method getApplicationContext:()Landroid/content/Context;
       8: invokestatic  #55                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      11: aload_0
      12: getfield      #33                 // Field b:Landroid/content/BroadcastReceiver;
      15: invokevirtual #64                 // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;)V
      18: return
}
