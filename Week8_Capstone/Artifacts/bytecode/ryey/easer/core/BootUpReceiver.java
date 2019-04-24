public class ryey.easer.core.BootUpReceiver extends android.content.BroadcastReceiver {
  public ryey.easer.core.BootUpReceiver();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/content/BroadcastReceiver."<init>":()V
       4: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #13                 // String BootUp onReceive <%s>
       2: iconst_1
       3: anewarray     #15                 // class java/lang/Object
       6: dup
       7: iconst_0
       8: aload_2
       9: aastore
      10: invokestatic  #21                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      13: aload_2
      14: invokevirtual #27                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      17: astore_2
      18: ldc           #29                 // String android.intent.action.BOOT_COMPLETED
      20: aload_2
      21: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      24: ifne          36
      27: ldc           #37                 // String android.intent.action.QUICKBOOT_POWERON
      29: aload_2
      30: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      33: ifeq          40
      36: aload_1
      37: invokestatic  #42                 // Method ryey/easer/core/EHService.a:(Landroid/content/Context;)V
      40: return
}
