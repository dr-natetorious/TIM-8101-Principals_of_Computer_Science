public class ryey.easer.plugins.operation.ringer_mode.InterruptionFilterSwitcherService extends android.service.notification.NotificationListenerService {
  public ryey.easer.plugins.operation.ringer_mode.InterruptionFilterSwitcherService();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/service/notification/NotificationListenerService."<init>":()V
       4: aload_0
       5: new           #18                 // class android/os/ConditionVariable
       8: dup
       9: invokespecial #19                 // Method android/os/ConditionVariable."<init>":()V
      12: putfield      #21                 // Field a:Landroid/os/ConditionVariable;
      15: aload_0
      16: new           #23                 // class android/content/IntentFilter
      19: dup
      20: ldc           #25                 // String ryey.easer.plugins.operation.ringer_mode.action.CHANGE
      22: invokespecial #28                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      25: putfield      #30                 // Field b:Landroid/content/IntentFilter;
      28: aload_0
      29: new           #6                  // class ryey/easer/plugins/operation/ringer_mode/InterruptionFilterSwitcherService$1
      32: dup
      33: aload_0
      34: invokespecial #33                 // Method ryey/easer/plugins/operation/ringer_mode/InterruptionFilterSwitcherService$1."<init>":(Lryey/easer/plugins/operation/ringer_mode/InterruptionFilterSwitcherService;)V
      37: putfield      #35                 // Field c:Landroid/content/BroadcastReceiver;
      40: return

  static android.os.ConditionVariable a(ryey.easer.plugins.operation.ringer_mode.InterruptionFilterSwitcherService);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/os/ConditionVariable;
       4: areturn

  static void a(android.content.Context, int);
    Code:
       0: new           #40                 // class android/content/Intent
       3: dup
       4: ldc           #25                 // String ryey.easer.plugins.operation.ringer_mode.action.CHANGE
       6: invokespecial #41                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_2
      10: aload_2
      11: ldc           #43                 // String ryey.easer.plugins.operation.ringer_mode.extra.MODE
      13: iload_1
      14: invokevirtual #47                 // Method android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
      17: pop
      18: aload_0
      19: invokestatic  #52                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      22: aload_2
      23: invokevirtual #55                 // Method android/support/v4/a/c.a:(Landroid/content/Intent;)Z
      26: pop
      27: return

  public void onCreate();
    Code:
       0: ldc           #58                 // String InterruptionFilterSwitcherService onCreate()
       2: iconst_0
       3: anewarray     #60                 // class java/lang/Object
       6: invokestatic  #65                 // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: invokespecial #67                 // Method android/service/notification/NotificationListenerService.onCreate:()V
      13: aload_0
      14: invokevirtual #71                 // Method getApplicationContext:()Landroid/content/Context;
      17: invokestatic  #52                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      20: aload_0
      21: getfield      #35                 // Field c:Landroid/content/BroadcastReceiver;
      24: aload_0
      25: getfield      #30                 // Field b:Landroid/content/IntentFilter;
      28: invokevirtual #74                 // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
      31: return

  public void onDestroy();
    Code:
       0: ldc           #77                 // String InterruptionFilterSwitcherService onDestroy()
       2: iconst_0
       3: anewarray     #60                 // class java/lang/Object
       6: invokestatic  #65                 // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: invokespecial #79                 // Method android/service/notification/NotificationListenerService.onDestroy:()V
      13: aload_0
      14: invokevirtual #71                 // Method getApplicationContext:()Landroid/content/Context;
      17: invokestatic  #52                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      20: aload_0
      21: getfield      #35                 // Field c:Landroid/content/BroadcastReceiver;
      24: invokevirtual #82                 // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;)V
      27: return

  public void onListenerConnected();
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/os/ConditionVariable;
       4: invokevirtual #86                 // Method android/os/ConditionVariable.open:()V
       7: return
}
