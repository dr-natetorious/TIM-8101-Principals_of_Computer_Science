public class ryey.easer.plugins.event.o.e extends ryey.easer.plugins.event.c<ryey.easer.plugins.event.o.a> {
  ryey.easer.plugins.event.o.e(android.content.Context, ryey.easer.plugins.event.o.a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_2
       4: invokestatic  #19                 // Method a:(Lryey/easer/plugins/event/o/a;)Z
       7: iconst_0
       8: invokespecial #22                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/o/a;ZZ)V
      11: return

  ryey.easer.plugins.event.o.e(android.content.Context, ryey.easer.plugins.event.o.a, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #26                 // Method ryey/easer/plugins/event/c."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: new           #28                 // class android/os/Handler
      13: dup
      14: invokespecial #31                 // Method android/os/Handler."<init>":()V
      17: putfield      #33                 // Field k:Landroid/os/Handler;
      20: getstatic     #35                 // Field j:Landroid/app/AlarmManager;
      23: ifnonnull     38
      26: aload_1
      27: ldc           #37                 // String alarm
      29: invokevirtual #43                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      32: checkcast     #45                 // class android/app/AlarmManager
      35: putstatic     #35                 // Field j:Landroid/app/AlarmManager;
      38: return

  static ryey.easer.commons.local_plugin.eventplugin.EventData a(ryey.easer.plugins.event.o.e);
    Code:
       0: aload_0
       1: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  static void a(ryey.easer.plugins.event.o.e, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #54                 // Method a:(Z)V
       5: return

  static java.lang.Runnable b(ryey.easer.plugins.event.o.e);
    Code:
       0: aload_0
       1: getfield      #63                 // Field l:Ljava/lang/Runnable;
       4: areturn

  static ryey.easer.commons.local_plugin.eventplugin.EventData c(ryey.easer.plugins.event.o.e);
    Code:
       0: aload_0
       1: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  static android.os.Handler d(ryey.easer.plugins.event.o.e);
    Code:
       0: aload_0
       1: getfield      #33                 // Field k:Landroid/os/Handler;
       4: areturn

  public void a();
    Code:
       0: aload_0
       1: invokespecial #67                 // Method ryey/easer/plugins/event/c.a:()V
       4: aload_0
       5: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: ifnull        173
      11: aload_0
      12: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      15: checkcast     #56                 // class ryey/easer/plugins/event/o/a
      18: getfield      #69                 // Field ryey/easer/plugins/event/o/a.a:Z
      21: ifeq          64
      24: aload_0
      25: new           #7                  // class ryey/easer/plugins/event/o/e$1
      28: dup
      29: aload_0
      30: invokespecial #72                 // Method ryey/easer/plugins/event/o/e$1."<init>":(Lryey/easer/plugins/event/o/e;)V
      33: putfield      #63                 // Field l:Ljava/lang/Runnable;
      36: aload_0
      37: getfield      #33                 // Field k:Landroid/os/Handler;
      40: aload_0
      41: getfield      #63                 // Field l:Ljava/lang/Runnable;
      44: aload_0
      45: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      48: checkcast     #56                 // class ryey/easer/plugins/event/o/a
      51: getfield      #75                 // Field ryey/easer/plugins/event/o/a.b:I
      54: sipush        1000
      57: imul
      58: i2l
      59: invokevirtual #79                 // Method android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
      62: pop
      63: return
      64: invokestatic  #85                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      67: astore_1
      68: aload_0
      69: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      72: checkcast     #56                 // class ryey/easer/plugins/event/o/a
      75: getfield      #88                 // Field ryey/easer/plugins/event/o/a.c:Ljava/lang/Boolean;
      78: invokevirtual #94                 // Method java/lang/Boolean.booleanValue:()Z
      81: ifeq          129
      84: getstatic     #35                 // Field j:Landroid/app/AlarmManager;
      87: iconst_0
      88: aload_1
      89: invokevirtual #98                 // Method java/util/Calendar.getTimeInMillis:()J
      92: aload_0
      93: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      96: checkcast     #56                 // class ryey/easer/plugins/event/o/a
      99: getfield      #75                 // Field ryey/easer/plugins/event/o/a.b:I
     102: ldc           #99                 // int 60000
     104: imul
     105: i2l
     106: ladd
     107: aload_0
     108: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
     111: checkcast     #56                 // class ryey/easer/plugins/event/o/a
     114: getfield      #75                 // Field ryey/easer/plugins/event/o/a.b:I
     117: ldc           #99                 // int 60000
     119: imul
     120: i2l
     121: aload_0
     122: getfield      #103                // Field h:Landroid/app/PendingIntent;
     125: invokevirtual #107                // Method android/app/AlarmManager.setRepeating:(IJJLandroid/app/PendingIntent;)V
     128: return
     129: getstatic     #35                 // Field j:Landroid/app/AlarmManager;
     132: iconst_0
     133: aload_1
     134: invokevirtual #98                 // Method java/util/Calendar.getTimeInMillis:()J
     137: aload_0
     138: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
     141: checkcast     #56                 // class ryey/easer/plugins/event/o/a
     144: getfield      #75                 // Field ryey/easer/plugins/event/o/a.b:I
     147: ldc           #99                 // int 60000
     149: imul
     150: i2l
     151: ladd
     152: aload_0
     153: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
     156: checkcast     #56                 // class ryey/easer/plugins/event/o/a
     159: getfield      #75                 // Field ryey/easer/plugins/event/o/a.b:I
     162: ldc           #99                 // int 60000
     164: imul
     165: i2l
     166: aload_0
     167: getfield      #103                // Field h:Landroid/app/PendingIntent;
     170: invokevirtual #110                // Method android/app/AlarmManager.setInexactRepeating:(IJJLandroid/app/PendingIntent;)V
     173: return

  protected void a(android.content.Intent);
    Code:
       0: aload_0
       1: iconst_1
       2: invokevirtual #54                 // Method a:(Z)V
       5: return

  public void b();
    Code:
       0: aload_0
       1: invokespecial #113                // Method ryey/easer/plugins/event/c.b:()V
       4: aload_0
       5: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: ifnull        56
      11: aload_0
      12: getfield      #50                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      15: checkcast     #56                 // class ryey/easer/plugins/event/o/a
      18: getfield      #69                 // Field ryey/easer/plugins/event/o/a.a:Z
      21: ifeq          36
      24: aload_0
      25: getfield      #33                 // Field k:Landroid/os/Handler;
      28: aload_0
      29: getfield      #63                 // Field l:Ljava/lang/Runnable;
      32: invokevirtual #117                // Method android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
      35: return
      36: getstatic     #35                 // Field j:Landroid/app/AlarmManager;
      39: aload_0
      40: getfield      #103                // Field h:Landroid/app/PendingIntent;
      43: invokevirtual #121                // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      46: getstatic     #35                 // Field j:Landroid/app/AlarmManager;
      49: aload_0
      50: getfield      #124                // Field i:Landroid/app/PendingIntent;
      53: invokevirtual #121                // Method android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
      56: return
}
