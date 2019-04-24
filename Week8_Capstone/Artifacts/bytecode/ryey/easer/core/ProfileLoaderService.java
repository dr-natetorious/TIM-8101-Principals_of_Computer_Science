public class ryey.easer.core.ProfileLoaderService extends android.app.Service {
  static final boolean a;

  static {};
    Code:
       0: return

  public ryey.easer.core.ProfileLoaderService();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method android/app/Service."<init>":()V
       4: aload_0
       5: new           #25                 // class android/content/IntentFilter
       8: dup
       9: ldc           #27                 // String ryey.easer.action.LOAD_PROFILE
      11: invokespecial #30                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      14: putfield      #32                 // Field c:Landroid/content/IntentFilter;
      17: aload_0
      18: new           #6                  // class ryey/easer/core/ProfileLoaderService$1
      21: dup
      22: aload_0
      23: invokespecial #35                 // Method ryey/easer/core/ProfileLoaderService$1."<init>":(Lryey/easer/core/ProfileLoaderService;)V
      26: putfield      #37                 // Field d:Landroid/content/BroadcastReceiver;
      29: return

  static void a(ryey.easer.core.ProfileLoaderService, java.lang.String, java.lang.String, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokespecial #258                // Method a:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
       7: return

  public android.os.IBinder onBind(android.content.Intent);
    Code:
       0: new           #8                  // class ryey/easer/core/ProfileLoaderService$a
       3: dup
       4: aload_0
       5: invokespecial #261                // Method ryey/easer/core/ProfileLoaderService$a."<init>":(Lryey/easer/core/ProfileLoaderService;)V
       8: areturn

  public void onCreate();
    Code:
       0: ldc_w         #264                // String ProfileLoaderService onCreate()
       3: iconst_0
       4: anewarray     #44                 // class java/lang/Object
       7: invokestatic  #266                // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      10: aload_0
      11: invokestatic  #271                // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      14: aload_0
      15: getfield      #37                 // Field d:Landroid/content/BroadcastReceiver;
      18: aload_0
      19: getfield      #32                 // Field c:Landroid/content/IntentFilter;
      22: invokevirtual #274                // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
      25: aload_0
      26: new           #206                // class ryey/easer/core/f
      29: dup
      30: aload_0
      31: invokespecial #275                // Method ryey/easer/core/f."<init>":(Landroid/content/Context;)V
      34: putfield      #204                // Field b:Lryey/easer/core/f;
      37: aload_0
      38: getfield      #204                // Field b:Lryey/easer/core/f;
      41: invokevirtual #277                // Method ryey/easer/core/f.a:()V
      44: getstatic     #282                // Field ryey/easer/core/h.a:Lryey/easer/core/h$a;
      47: aload_0
      48: invokevirtual #287                // Method ryey/easer/core/h$a.a:(Landroid/app/Service;)V
      51: return

  public void onDestroy();
    Code:
       0: getstatic     #282                // Field ryey/easer/core/h.a:Lryey/easer/core/h$a;
       3: aload_0
       4: invokevirtual #290                // Method ryey/easer/core/h$a.b:(Landroid/app/Service;)V
       7: aload_0
       8: getfield      #204                // Field b:Lryey/easer/core/f;
      11: invokevirtual #292                // Method ryey/easer/core/f.b:()V
      14: aload_0
      15: invokestatic  #271                // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      18: aload_0
      19: getfield      #37                 // Field d:Landroid/content/BroadcastReceiver;
      22: invokevirtual #295                // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;)V
      25: return
}
