class ryey.easer.plugins.event.i.e extends ryey.easer.plugins.event.c<ryey.easer.plugins.event.i.a> {
  public ryey.easer.plugins.event.i.e(android.content.Context, ryey.easer.plugins.event.i.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #15                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/i/a;ZZ)V
       8: return

  ryey.easer.plugins.event.i.e(android.content.Context, ryey.easer.plugins.event.i.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #19                 // Method ryey/easer/plugins/event/c."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: aload_2
      11: getfield      #24                 // Field ryey/easer/plugins/event/i/a.a:Ljava/util/Set;
      14: invokespecial #27                 // Method a:(Ljava/util/Set;)V
      17: getstatic     #29                 // Field j:Landroid/app/AlarmManager;
      20: ifnonnull     35
      23: aload_1
      24: ldc           #31                 // String alarm
      26: invokevirtual #37                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      29: checkcast     #39                 // class android/app/AlarmManager
      32: putstatic     #29                 // Field j:Landroid/app/AlarmManager;
      35: return

  public void a();
    Code:
       0: aload_0
       1: invokespecial #101                // Method ryey/easer/plugins/event/c.a:()V
       4: aload_0
       5: aload_0
       6: getfield      #105                // Field h:Landroid/app/PendingIntent;
       9: invokespecial #107                // Method a:(Landroid/app/PendingIntent;)V
      12: return

  public void b();
    Code:
       0: aload_0
       1: invokespecial #110                // Method ryey/easer/plugins/event/c.b:()V
       4: getstatic     #29                 // Field j:Landroid/app/AlarmManager;
       7: aload_0
       8: getfield      #105                // Field h:Landroid/app/PendingIntent;
      11: invokevirtual #113                // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      14: getstatic     #29                 // Field j:Landroid/app/AlarmManager;
      17: aload_0
      18: getfield      #116                // Field i:Landroid/app/PendingIntent;
      21: invokevirtual #113                // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      24: return
}
