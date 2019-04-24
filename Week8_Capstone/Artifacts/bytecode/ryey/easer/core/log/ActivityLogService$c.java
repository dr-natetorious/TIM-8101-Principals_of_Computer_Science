public final class ryey.easer.core.log.ActivityLogService$c extends android.content.BroadcastReceiver {
  final ryey.easer.core.log.ActivityLogService a;

  ryey.easer.core.log.ActivityLogService$c();
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lryey/easer/core/log/ActivityLogService;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aload_1
       1: ldc           #21                 // String context
       3: invokestatic  #27                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #29                 // String intent
       9: invokestatic  #27                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: ldc           #31                 // String ryey.easer.action.PROFILE_LOADED
      14: aload_2
      15: invokevirtual #37                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      18: invokestatic  #40                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      21: ifeq          85
      24: aload_2
      25: invokevirtual #44                 // Method android/content/Intent.getExtras:()Landroid/os/Bundle;
      28: ifnonnull     41
      31: ldc           #46                 // String ACTION_NEW_LOG_ENTRY Intent has null extras???
      33: iconst_0
      34: anewarray     #48                 // class java/lang/Object
      37: invokestatic  #54                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      40: return
      41: getstatic     #57                 // Field ryey/easer/core/log/ActivityLogService.a:Lryey/easer/core/log/ActivityLogService$b;
      44: astore_1
      45: aload_2
      46: invokevirtual #44                 // Method android/content/Intent.getExtras:()Landroid/os/Bundle;
      49: astore_2
      50: aload_2
      51: ifnonnull     57
      54: invokestatic  #59                 // Method a/b/b/c.a:()V
      57: aload_1
      58: aload_2
      59: invokevirtual #64                 // Method ryey/easer/core/log/ActivityLogService$b.a:(Landroid/os/Bundle;)V
      62: new           #33                 // class android/content/Intent
      65: dup
      66: invokespecial #65                 // Method android/content/Intent."<init>":()V
      69: astore_1
      70: aload_1
      71: ldc           #67                 // String ryey.easer.action.PROFILE_UPDATED
      73: invokevirtual #71                 // Method android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
      76: pop
      77: aload_0
      78: getfield      #14                 // Field a:Lryey/easer/core/log/ActivityLogService;
      81: aload_1
      82: invokevirtual #75                 // Method ryey/easer/core/log/ActivityLogService.sendBroadcast:(Landroid/content/Intent;)V
      85: return
}
