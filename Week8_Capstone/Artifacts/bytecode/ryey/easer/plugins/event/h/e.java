public class ryey.easer.plugins.event.h.e extends ryey.easer.plugins.event.c<ryey.easer.plugins.event.h.a> {
  public ryey.easer.plugins.event.h.e(android.content.Context, ryey.easer.plugins.event.h.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #14                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/h/a;ZZ)V
       8: return

  ryey.easer.plugins.event.h.e(android.content.Context, ryey.easer.plugins.event.h.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #18                 // Method ryey/easer/plugins/event/c."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: aconst_null
      11: putfield      #20                 // Field k:Ljava/util/Calendar;
      14: aload_0
      15: aload_2
      16: getfield      #25                 // Field ryey/easer/plugins/event/h/a.a:Ljava/util/Calendar;
      19: invokespecial #28                 // Method a:(Ljava/util/Calendar;)V
      22: getstatic     #30                 // Field j:Landroid/app/AlarmManager;
      25: ifnonnull     40
      28: aload_1
      29: ldc           #32                 // String alarm
      31: invokevirtual #38                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      34: checkcast     #40                 // class android/app/AlarmManager
      37: putstatic     #30                 // Field j:Landroid/app/AlarmManager;
      40: return

  public void a();
    Code:
       0: aload_0
       1: invokespecial #61                 // Method ryey/easer/plugins/event/c.a:()V
       4: aload_0
       5: getfield      #20                 // Field k:Ljava/util/Calendar;
       8: ifnull        32
      11: getstatic     #30                 // Field j:Landroid/app/AlarmManager;
      14: iconst_0
      15: aload_0
      16: getfield      #20                 // Field k:Ljava/util/Calendar;
      19: invokevirtual #65                 // Method java/util/Calendar.getTimeInMillis:()J
      22: ldc2_w        #66                 // long 86400000l
      25: aload_0
      26: getfield      #71                 // Field h:Landroid/app/PendingIntent;
      29: invokevirtual #75                 // Method android/app/AlarmManager.setInexactRepeating:(IJJLandroid/app/PendingIntent;)V
      32: return

  protected void a(android.content.Intent);
    Code:
       0: aload_0
       1: iconst_1
       2: invokevirtual #79                 // Method a:(Z)V
       5: return

  public void b();
    Code:
       0: aload_0
       1: invokespecial #82                 // Method ryey/easer/plugins/event/c.b:()V
       4: aload_0
       5: getfield      #20                 // Field k:Ljava/util/Calendar;
       8: ifnull        31
      11: getstatic     #30                 // Field j:Landroid/app/AlarmManager;
      14: aload_0
      15: getfield      #71                 // Field h:Landroid/app/PendingIntent;
      18: invokevirtual #86                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      21: getstatic     #30                 // Field j:Landroid/app/AlarmManager;
      24: aload_0
      25: getfield      #89                 // Field i:Landroid/app/PendingIntent;
      28: invokevirtual #86                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      31: return
}
