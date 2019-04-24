public class ryey.easer.plugins.a.j.e extends ryey.easer.plugins.a.a<ryey.easer.plugins.a.j.a> {
  ryey.easer.plugins.a.j.e(android.content.Context, ryey.easer.plugins.a.j.a, android.app.PendingIntent, android.app.PendingIntent);
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
      30: astore_1
      31: invokestatic  #36                 // Method java/lang/System.currentTimeMillis:()J
      34: lstore        5
      36: aload_1
      37: lload         5
      39: invokevirtual #40                 // Method java/util/Calendar.setTimeInMillis:(J)V
      42: aload_1
      43: bipush        11
      45: aload_2
      46: getfield      #46                 // Field ryey/easer/plugins/a/j/a.a:Ljava/util/Calendar;
      49: bipush        11
      51: invokevirtual #50                 // Method java/util/Calendar.get:(I)I
      54: invokevirtual #54                 // Method java/util/Calendar.set:(II)V
      57: aload_1
      58: bipush        12
      60: aload_2
      61: getfield      #46                 // Field ryey/easer/plugins/a/j/a.a:Ljava/util/Calendar;
      64: bipush        12
      66: invokevirtual #50                 // Method java/util/Calendar.get:(I)I
      69: invokevirtual #54                 // Method java/util/Calendar.set:(II)V
      72: invokestatic  #30                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      75: astore_2
      76: aload_2
      77: lload         5
      79: invokevirtual #40                 // Method java/util/Calendar.setTimeInMillis:(J)V
      82: aload_1
      83: aload_2
      84: invokevirtual #58                 // Method java/util/Calendar.before:(Ljava/lang/Object;)Z
      87: ifeq          108
      90: aload_1
      91: bipush        6
      93: iconst_1
      94: invokevirtual #61                 // Method java/util/Calendar.add:(II)V
      97: iconst_1
      98: invokestatic  #67                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     101: astore_1
     102: aload_0
     103: aload_1
     104: invokevirtual #70                 // Method a:(Ljava/lang/Boolean;)V
     107: return
     108: iconst_0
     109: invokestatic  #67                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     112: astore_1
     113: goto          102

  public void a();
    Code:
       0: aload_0
       1: getfield      #80                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: checkcast     #42                 // class ryey/easer/plugins/a/j/a
       7: getfield      #46                 // Field ryey/easer/plugins/a/j/a.a:Ljava/util/Calendar;
      10: invokestatic  #82                 // Method a:(Ljava/util/Calendar;)[Ljava/util/Calendar;
      13: astore_1
      14: aload_1
      15: iconst_0
      16: aaload
      17: aload_1
      18: iconst_2
      19: aaload
      20: invokevirtual #58                 // Method java/util/Calendar.before:(Ljava/lang/Object;)Z
      23: ifeq          35
      26: aload_1
      27: iconst_0
      28: aaload
      29: bipush        6
      31: iconst_1
      32: invokevirtual #61                 // Method java/util/Calendar.add:(II)V
      35: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
      38: iconst_0
      39: aload_1
      40: iconst_0
      41: aaload
      42: invokevirtual #85                 // Method java/util/Calendar.getTimeInMillis:()J
      45: ldc2_w        #86                 // long 86400000l
      48: aload_0
      49: getfield      #91                 // Field b:Landroid/app/PendingIntent;
      52: invokevirtual #95                 // Method android/app/AlarmManager.setInexactRepeating:(IJJLandroid/app/PendingIntent;)V
      55: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
      58: iconst_0
      59: aload_1
      60: iconst_1
      61: aaload
      62: invokevirtual #85                 // Method java/util/Calendar.getTimeInMillis:()J
      65: ldc2_w        #86                 // long 86400000l
      68: aload_0
      69: getfield      #98                 // Field c:Landroid/app/PendingIntent;
      72: invokevirtual #95                 // Method android/app/AlarmManager.setInexactRepeating:(IJJLandroid/app/PendingIntent;)V
      75: return

  public void b();
    Code:
       0: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
       3: aload_0
       4: getfield      #91                 // Field b:Landroid/app/PendingIntent;
       7: invokevirtual #102                // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      10: getstatic     #14                 // Field j:Landroid/app/AlarmManager;
      13: aload_0
      14: getfield      #98                 // Field c:Landroid/app/PendingIntent;
      17: invokevirtual #102                // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      20: return
}
