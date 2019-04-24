public class ryey.easer.plugins.event.n.e extends ryey.easer.plugins.event.c<ryey.easer.plugins.event.n.a> {
  public ryey.easer.plugins.event.n.e(android.content.Context, ryey.easer.plugins.event.n.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #14                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/n/a;ZZ)V
       8: return

  ryey.easer.plugins.event.n.e(android.content.Context, ryey.easer.plugins.event.n.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #18                 // Method ryey/easer/plugins/event/c."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: invokestatic  #24                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      13: putfield      #26                 // Field k:Ljava/util/Calendar;
      16: invokestatic  #32                 // Method java/lang/System.currentTimeMillis:()J
      19: lstore        5
      21: aload_0
      22: getfield      #26                 // Field k:Ljava/util/Calendar;
      25: lload         5
      27: invokevirtual #36                 // Method java/util/Calendar.setTimeInMillis:(J)V
      30: aload_0
      31: getfield      #26                 // Field k:Ljava/util/Calendar;
      34: bipush        11
      36: aload_2
      37: getfield      #41                 // Field ryey/easer/plugins/event/n/a.a:Ljava/util/Calendar;
      40: bipush        11
      42: invokevirtual #45                 // Method java/util/Calendar.get:(I)I
      45: invokevirtual #49                 // Method java/util/Calendar.set:(II)V
      48: aload_0
      49: getfield      #26                 // Field k:Ljava/util/Calendar;
      52: bipush        12
      54: aload_2
      55: getfield      #41                 // Field ryey/easer/plugins/event/n/a.a:Ljava/util/Calendar;
      58: bipush        12
      60: invokevirtual #45                 // Method java/util/Calendar.get:(I)I
      63: invokevirtual #49                 // Method java/util/Calendar.set:(II)V
      66: invokestatic  #24                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      69: astore_2
      70: aload_2
      71: lload         5
      73: invokevirtual #36                 // Method java/util/Calendar.setTimeInMillis:(J)V
      76: aload_0
      77: getfield      #26                 // Field k:Ljava/util/Calendar;
      80: aload_2
      81: invokevirtual #53                 // Method java/util/Calendar.before:(Ljava/lang/Object;)Z
      84: ifeq          97
      87: aload_0
      88: getfield      #26                 // Field k:Ljava/util/Calendar;
      91: bipush        6
      93: iconst_1
      94: invokevirtual #56                 // Method java/util/Calendar.add:(II)V
      97: getstatic     #58                 // Field j:Landroid/app/AlarmManager;
     100: ifnonnull     115
     103: aload_1
     104: ldc           #60                 // String alarm
     106: invokevirtual #66                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
     109: checkcast     #68                 // class android/app/AlarmManager
     112: putstatic     #58                 // Field j:Landroid/app/AlarmManager;
     115: return

  public void a();
    Code:
       0: aload_0
       1: invokespecial #71                 // Method ryey/easer/plugins/event/c.a:()V
       4: aload_0
       5: getfield      #26                 // Field k:Ljava/util/Calendar;
       8: ifnull        32
      11: getstatic     #58                 // Field j:Landroid/app/AlarmManager;
      14: iconst_0
      15: aload_0
      16: getfield      #26                 // Field k:Ljava/util/Calendar;
      19: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
      22: ldc2_w        #75                 // long 86400000l
      25: aload_0
      26: getfield      #80                 // Field h:Landroid/app/PendingIntent;
      29: invokevirtual #84                 // Method android/app/AlarmManager.setInexactRepeating:(IJJLandroid/app/PendingIntent;)V
      32: return

  protected void a(android.content.Intent);
    Code:
       0: aload_0
       1: iconst_1
       2: invokevirtual #88                 // Method a:(Z)V
       5: return

  public void b();
    Code:
       0: aload_0
       1: invokespecial #91                 // Method ryey/easer/plugins/event/c.b:()V
       4: aload_0
       5: getfield      #26                 // Field k:Ljava/util/Calendar;
       8: ifnull        31
      11: getstatic     #58                 // Field j:Landroid/app/AlarmManager;
      14: aload_0
      15: getfield      #80                 // Field h:Landroid/app/PendingIntent;
      18: invokevirtual #95                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      21: getstatic     #58                 // Field j:Landroid/app/AlarmManager;
      24: aload_0
      25: getfield      #98                 // Field i:Landroid/app/PendingIntent;
      28: invokevirtual #95                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      31: return

  protected void b(android.content.Intent);
    Code:
       0: return
}
