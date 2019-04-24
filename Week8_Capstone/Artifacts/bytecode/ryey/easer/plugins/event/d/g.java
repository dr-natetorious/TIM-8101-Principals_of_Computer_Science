public class ryey.easer.plugins.event.d.g extends ryey.easer.plugins.event.c<ryey.easer.plugins.event.d.b> {
  static {};
    Code:
       0: return

  public ryey.easer.plugins.event.d.g(android.content.Context, ryey.easer.plugins.event.d.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #15                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/d/b;ZZ)V
       8: return

  ryey.easer.plugins.event.d.g(android.content.Context, ryey.easer.plugins.event.d.b, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #18                 // Method ryey/easer/plugins/event/c."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_1
      10: ldc           #20                 // String alarm
      12: invokevirtual #26                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      15: checkcast     #28                 // class android/app/AlarmManager
      18: putstatic     #30                 // Field j:Landroid/app/AlarmManager;
      21: return

  public void a();
    Code:
       0: aload_0
       1: invokespecial #33                 // Method ryey/easer/plugins/event/c.a:()V
       4: aload_0
       5: getfield      #37                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: checkcast     #39                 // class ryey/easer/plugins/event/d/b
      11: getfield      #42                 // Field ryey/easer/plugins/event/d/b.a:Lryey/easer/plugins/event/d/a;
      14: getfield      #48                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      17: getstatic     #51                 // Field ryey/easer/plugins/event/d/a.a:[Ljava/lang/String;
      20: iconst_0
      21: aaload
      22: invokeinterface #57,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
      27: ifeq          73
      30: aload_0
      31: getfield      #60                 // Field a:Landroid/content/Context;
      34: invokevirtual #64                 // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
      37: aload_0
      38: getfield      #37                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      41: checkcast     #39                 // class ryey/easer/plugins/event/d/b
      44: getfield      #42                 // Field ryey/easer/plugins/event/d/b.a:Lryey/easer/plugins/event/d/a;
      47: getfield      #67                 // Field ryey/easer/plugins/event/d/a.b:J
      50: invokestatic  #72                 // Method ryey/easer/plugins/event/d/e.b:(Landroid/content/ContentResolver;J)Ljava/lang/Long;
      53: astore_1
      54: aload_1
      55: ifnull        73
      58: getstatic     #30                 // Field j:Landroid/app/AlarmManager;
      61: iconst_0
      62: aload_1
      63: invokevirtual #78                 // Method java/lang/Long.longValue:()J
      66: aload_0
      67: getfield      #82                 // Field h:Landroid/app/PendingIntent;
      70: invokevirtual #86                 // Method android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
      73: aload_0
      74: getfield      #37                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      77: checkcast     #39                 // class ryey/easer/plugins/event/d/b
      80: getfield      #42                 // Field ryey/easer/plugins/event/d/b.a:Lryey/easer/plugins/event/d/a;
      83: getfield      #48                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      86: getstatic     #51                 // Field ryey/easer/plugins/event/d/a.a:[Ljava/lang/String;
      89: iconst_1
      90: aaload
      91: invokeinterface #57,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
      96: ifeq          142
      99: aload_0
     100: getfield      #60                 // Field a:Landroid/content/Context;
     103: invokevirtual #64                 // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
     106: aload_0
     107: getfield      #37                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
     110: checkcast     #39                 // class ryey/easer/plugins/event/d/b
     113: getfield      #42                 // Field ryey/easer/plugins/event/d/b.a:Lryey/easer/plugins/event/d/a;
     116: getfield      #67                 // Field ryey/easer/plugins/event/d/a.b:J
     119: invokestatic  #88                 // Method ryey/easer/plugins/event/d/e.c:(Landroid/content/ContentResolver;J)Ljava/lang/Long;
     122: astore_1
     123: aload_1
     124: ifnull        142
     127: getstatic     #30                 // Field j:Landroid/app/AlarmManager;
     130: iconst_0
     131: aload_1
     132: invokevirtual #78                 // Method java/lang/Long.longValue:()J
     135: aload_0
     136: getfield      #82                 // Field h:Landroid/app/PendingIntent;
     139: invokevirtual #86                 // Method android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
     142: return

  protected void a(android.content.Intent);
    Code:
       0: aload_0
       1: iconst_1
       2: invokevirtual #92                 // Method a:(Z)V
       5: aload_0
       6: iconst_0
       7: invokevirtual #92                 // Method a:(Z)V
      10: return

  public void b();
    Code:
       0: aload_0
       1: invokespecial #94                 // Method ryey/easer/plugins/event/c.b:()V
       4: getstatic     #30                 // Field j:Landroid/app/AlarmManager;
       7: aload_0
       8: getfield      #82                 // Field h:Landroid/app/PendingIntent;
      11: invokevirtual #98                 // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      14: return
}
