public class ryey.easer.plugins.a.g.e extends ryey.easer.plugins.a.a<ryey.easer.plugins.a.g.a> {
  ryey.easer.plugins.a.g.e(android.content.Context, ryey.easer.plugins.a.g.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #12                 // Method ryey/easer/plugins/a/a."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
      12: ifnonnull     27
      15: aload_1
      16: ldc           #16                 // String alarm
      18: invokevirtual #22                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      21: checkcast     #24                 // class android/app/AlarmManager
      24: putstatic     #14                 // Field j:Landroid/app/AlarmManager;
      27: invokestatic  #30                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      30: bipush        7
      32: invokevirtual #34                 // Method java/util/Calendar.get:(I)I
      35: istore        5
      37: aload_2
      38: getfield      #40                 // Field ryey/easer/plugins/a/g/a.a:Ljava/util/Set;
      41: iload         5
      43: iconst_1
      44: isub
      45: invokestatic  #46                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      48: invokeinterface #52,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
      53: ifeq          67
      56: iconst_1
      57: invokestatic  #57                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      60: astore_1
      61: aload_0
      62: aload_1
      63: invokevirtual #60                 // Method a:(Ljava/lang/Boolean;)V
      66: return
      67: iconst_0
      68: invokestatic  #57                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      71: astore_1
      72: goto          61

  public void a();
    Code:
       0: aload_0
       1: invokespecial #93                 // Method f:()V
       4: return

  public void b();
    Code:
       0: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
       3: aload_0
       4: getfield      #78                 // Field b:Landroid/app/PendingIntent;
       7: invokevirtual #97                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      10: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
      13: aload_0
      14: getfield      #81                 // Field c:Landroid/app/PendingIntent;
      17: invokevirtual #97                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      20: return
}
