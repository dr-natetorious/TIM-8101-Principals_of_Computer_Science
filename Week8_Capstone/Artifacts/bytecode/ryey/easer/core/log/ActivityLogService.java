public final class ryey.easer.core.log.ActivityLogService extends android.app.Service {
  public static final ryey.easer.core.log.ActivityLogService$b a;

  static {};
    Code:
       0: new           #9                  // class ryey/easer/core/log/ActivityLogService$b
       3: dup
       4: aconst_null
       5: invokespecial #25                 // Method ryey/easer/core/log/ActivityLogService$b."<init>":(La/b/b/a;)V
       8: putstatic     #27                 // Field a:Lryey/easer/core/log/ActivityLogService$b;
      11: new           #29                 // class java/util/LinkedList
      14: dup
      15: invokespecial #31                 // Method java/util/LinkedList."<init>":()V
      18: putstatic     #33                 // Field d:Ljava/util/LinkedList;
      21: return

  public ryey.easer.core.log.ActivityLogService();
    Code:
       0: aload_0
       1: invokespecial #35                 // Method android/app/Service."<init>":()V
       4: aload_0
       5: new           #12                 // class ryey/easer/core/log/ActivityLogService$c
       8: dup
       9: aload_0
      10: invokespecial #38                 // Method ryey/easer/core/log/ActivityLogService$c."<init>":(Lryey/easer/core/log/ActivityLogService;)V
      13: checkcast     #40                 // class android/content/BroadcastReceiver
      16: putfield      #42                 // Field b:Landroid/content/BroadcastReceiver;
      19: aload_0
      20: new           #44                 // class android/content/IntentFilter
      23: dup
      24: invokespecial #45                 // Method android/content/IntentFilter."<init>":()V
      27: putfield      #47                 // Field c:Landroid/content/IntentFilter;
      30: aload_0
      31: getfield      #47                 // Field c:Landroid/content/IntentFilter;
      34: ldc           #49                 // String ryey.easer.action.PROFILE_LOADED
      36: invokevirtual #53                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      39: return

  public static final java.util.LinkedList a();
    Code:
       0: getstatic     #33                 // Field d:Ljava/util/LinkedList;
       3: areturn

  public android.os.IBinder onBind(android.content.Intent);
    Code:
       0: aload_1
       1: ldc           #58                 // String intent
       3: invokestatic  #63                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: new           #6                  // class ryey/easer/core/log/ActivityLogService$a
       9: dup
      10: aload_0
      11: invokespecial #64                 // Method ryey/easer/core/log/ActivityLogService$a."<init>":(Lryey/easer/core/log/ActivityLogService;)V
      14: checkcast     #66                 // class android/os/IBinder
      17: areturn

  public void onCreate();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #42                 // Field b:Landroid/content/BroadcastReceiver;
       5: aload_0
       6: getfield      #47                 // Field c:Landroid/content/IntentFilter;
       9: invokevirtual #71                 // Method registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      12: pop
      13: return

  public void onDestroy();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #42                 // Field b:Landroid/content/BroadcastReceiver;
       5: invokevirtual #76                 // Method unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
       8: return
}
