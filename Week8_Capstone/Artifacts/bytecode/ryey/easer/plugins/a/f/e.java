public class ryey.easer.plugins.a.f.e extends ryey.easer.plugins.a.a<ryey.easer.plugins.a.f.a> {
  ryey.easer.plugins.a.f.e(android.content.Context, ryey.easer.plugins.a.f.a, android.app.PendingIntent, android.app.PendingIntent);
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
      30: bipush        6
      32: invokevirtual #34                 // Method java/util/Calendar.get:(I)I
      35: aload_2
      36: getfield      #40                 // Field ryey/easer/plugins/a/f/a.a:Ljava/util/Calendar;
      39: bipush        6
      41: invokevirtual #34                 // Method java/util/Calendar.get:(I)I
      44: if_icmplt     60
      47: iconst_1
      48: istore        5
      50: aload_0
      51: iload         5
      53: invokestatic  #46                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      56: invokevirtual #49                 // Method a:(Ljava/lang/Boolean;)V
      59: return
      60: iconst_0
      61: istore        5
      63: goto          50

  public void a();
    Code:
       0: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
       3: iconst_0
       4: aload_0
       5: getfield      #55                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       8: checkcast     #36                 // class ryey/easer/plugins/a/f/a
      11: getfield      #40                 // Field ryey/easer/plugins/a/f/a.a:Ljava/util/Calendar;
      14: invokevirtual #59                 // Method java/util/Calendar.getTimeInMillis:()J
      17: ldc2_w        #60                 // long 86400000l
      20: aload_0
      21: getfield      #65                 // Field b:Landroid/app/PendingIntent;
      24: invokevirtual #69                 // Method android/app/AlarmManager.setInexactRepeating:(IJJLandroid/app/PendingIntent;)V
      27: return

  public void b();
    Code:
       0: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
       3: aload_0
       4: getfield      #65                 // Field b:Landroid/app/PendingIntent;
       7: invokevirtual #73                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      10: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
      13: aload_0
      14: getfield      #76                 // Field c:Landroid/app/PendingIntent;
      17: invokevirtual #73                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      20: return
}
