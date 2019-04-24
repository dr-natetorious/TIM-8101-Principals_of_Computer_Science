public class ryey.easer.EaserApplication extends android.app.Application {
  public ryey.easer.EaserApplication();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/app/Application."<init>":()V
       4: return

  public void onCreate();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/app/Application.onCreate:()V
       4: new           #14                 // class com/b/a/a
       7: dup
       8: invokespecial #15                 // Method com/b/a/a."<init>":()V
      11: invokestatic  #21                 // Method com/b/a/i.a:(Lcom/b/a/f;)V
      14: aload_0
      15: invokestatic  #27                 // Method ryey/easer/a.b:(Landroid/content/Context;)Z
      18: ifeq          75
      21: aload_0
      22: invokevirtual #31                 // Method getApplicationContext:()Landroid/content/Context;
      25: ldc           #33                 // String android.permission.WRITE_EXTERNAL_STORAGE
      27: invokestatic  #38                 // Method android/support/v4/a/a.a:(Landroid/content/Context;Ljava/lang/String;)I
      30: ifne          46
      33: new           #40                 // class com/b/a/c
      36: dup
      37: invokespecial #41                 // Method com/b/a/c."<init>":()V
      40: invokestatic  #21                 // Method com/b/a/i.a:(Lcom/b/a/f;)V
      43: goto          75
      46: aload_0
      47: invokevirtual #31                 // Method getApplicationContext:()Landroid/content/Context;
      50: invokestatic  #47                 // Method android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
      53: invokeinterface #53,  1           // InterfaceMethod android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
      58: aload_0
      59: ldc           #54                 // int 2131624111
      61: invokevirtual #58                 // Method getString:(I)Ljava/lang/String;
      64: iconst_0
      65: invokeinterface #64,  3           // InterfaceMethod android/content/SharedPreferences$Editor.putBoolean:(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
      70: invokeinterface #67,  1           // InterfaceMethod android/content/SharedPreferences$Editor.apply:()V
      75: aload_0
      76: new           #69                 // class android/content/Intent
      79: dup
      80: aload_0
      81: ldc           #71                 // class ryey/easer/core/log/ActivityLogService
      83: invokespecial #74                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      86: invokevirtual #78                 // Method startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
      89: pop
      90: bipush        7
      92: aconst_null
      93: ldc           #80                 // String ======Easer started======
      95: aconst_null
      96: invokestatic  #83                 // Method com/b/a/i.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      99: return
}
