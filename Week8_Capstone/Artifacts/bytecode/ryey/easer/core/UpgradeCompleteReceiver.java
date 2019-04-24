public class ryey.easer.core.UpgradeCompleteReceiver extends android.content.BroadcastReceiver {
  public ryey.easer.core.UpgradeCompleteReceiver();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/content/BroadcastReceiver."<init>":()V
       4: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #13                 // String android.intent.action.MY_PACKAGE_REPLACED
       2: aload_2
       3: invokevirtual #19                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       6: invokevirtual #25                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifeq          16
      12: aload_1
      13: invokestatic  #31                 // Method ryey/easer/core/EHService.a:(Landroid/content/Context;)V
      16: return
}
