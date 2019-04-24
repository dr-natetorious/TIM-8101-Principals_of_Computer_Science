public class ryey.easer.plugins.event.notification.NotificationEventListenerService extends android.service.notification.NotificationListenerService {
  java.util.List<ryey.easer.plugins.event.notification.NotificationEventListenerService$a> a;

  android.content.BroadcastReceiver b;

  public ryey.easer.plugins.event.notification.NotificationEventListenerService();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method android/service/notification/NotificationListenerService."<init>":()V
       4: aload_0
       5: new           #19                 // class java/util/ArrayList
       8: dup
       9: invokespecial #20                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #22                 // Field a:Ljava/util/List;
      15: aload_0
      16: new           #6                  // class ryey/easer/plugins/event/notification/NotificationEventListenerService$1
      19: dup
      20: aload_0
      21: invokespecial #25                 // Method ryey/easer/plugins/event/notification/NotificationEventListenerService$1."<init>":(Lryey/easer/plugins/event/notification/NotificationEventListenerService;)V
      24: putfield      #27                 // Field b:Landroid/content/BroadcastReceiver;
      27: return

  static void a(android.content.Context, ryey.easer.plugins.event.notification.a, android.net.Uri);
    Code:
       0: new           #31                 // class android/content/Intent
       3: dup
       4: ldc           #33                 // String ryey.easer.plugins.event.notification.action.LISTEN
       6: invokespecial #36                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_3
      10: aload_3
      11: ldc           #38                 // String ryey.easer.plugins.event.notification.extra.DATA
      13: aload_1
      14: invokevirtual #42                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
      17: pop
      18: aload_3
      19: ldc           #44                 // String ryey.easer.plugins.event.notification.extra.URI
      21: aload_2
      22: invokevirtual #42                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
      25: pop
      26: ldc           #46                 // String informing 'listen'
      28: invokestatic  #51                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      31: aload_0
      32: invokevirtual #57                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      35: invokestatic  #62                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      38: aload_3
      39: invokevirtual #65                 // Method android/support/v4/a/c.a:(Landroid/content/Intent;)Z
      42: pop
      43: return

  static void a(ryey.easer.plugins.event.notification.NotificationEventListenerService, ryey.easer.plugins.event.notification.a, android.net.Uri);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #69                 // Method a:(Lryey/easer/plugins/event/notification/a;Landroid/net/Uri;)V
       6: return

  static void b(android.content.Context, ryey.easer.plugins.event.notification.a, android.net.Uri);
    Code:
       0: new           #31                 // class android/content/Intent
       3: dup
       4: ldc           #123                // String ryey.easer.plugins.event.notification.action.CANCEL
       6: invokespecial #36                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_3
      10: aload_3
      11: ldc           #38                 // String ryey.easer.plugins.event.notification.extra.DATA
      13: aload_1
      14: invokevirtual #42                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
      17: pop
      18: aload_3
      19: ldc           #44                 // String ryey.easer.plugins.event.notification.extra.URI
      21: aload_2
      22: invokevirtual #42                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
      25: pop
      26: ldc           #46                 // String informing 'listen'
      28: invokestatic  #51                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      31: aload_0
      32: invokevirtual #57                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      35: invokestatic  #62                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      38: aload_3
      39: invokevirtual #65                 // Method android/support/v4/a/c.a:(Landroid/content/Intent;)Z
      42: pop
      43: return

  static void b(ryey.easer.plugins.event.notification.NotificationEventListenerService, ryey.easer.plugins.event.notification.a, android.net.Uri);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #125                // Method b:(Lryey/easer/plugins/event/notification/a;Landroid/net/Uri;)V
       6: return

  public void onCreate();
    Code:
       0: ldc           #131                // String NotificationEventListenerService onCreate()
       2: iconst_0
       3: anewarray     #83                 // class java/lang/Object
       6: invokestatic  #134                // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: invokespecial #136                // Method android/service/notification/NotificationListenerService.onCreate:()V
      13: new           #138                // class android/content/IntentFilter
      16: dup
      17: invokespecial #139                // Method android/content/IntentFilter."<init>":()V
      20: astore_1
      21: aload_1
      22: ldc           #33                 // String ryey.easer.plugins.event.notification.action.LISTEN
      24: invokevirtual #142                // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      27: aload_1
      28: ldc           #123                // String ryey.easer.plugins.event.notification.action.CANCEL
      30: invokevirtual #142                // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      33: aload_0
      34: invokevirtual #143                // Method getApplicationContext:()Landroid/content/Context;
      37: invokestatic  #62                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      40: aload_0
      41: getfield      #27                 // Field b:Landroid/content/BroadcastReceiver;
      44: aload_1
      45: invokevirtual #146                // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
      48: return

  public void onDestroy();
    Code:
       0: ldc           #149                // String NotificationEventListenerService onDestroy()
       2: iconst_0
       3: anewarray     #83                 // class java/lang/Object
       6: invokestatic  #134                // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: invokespecial #151                // Method android/service/notification/NotificationListenerService.onDestroy:()V
      13: aload_0
      14: invokevirtual #143                // Method getApplicationContext:()Landroid/content/Context;
      17: invokestatic  #62                 // Method android/support/v4/a/c.a:(Landroid/content/Context;)Landroid/support/v4/a/c;
      20: aload_0
      21: getfield      #27                 // Field b:Landroid/content/BroadcastReceiver;
      24: invokevirtual #154                // Method android/support/v4/a/c.a:(Landroid/content/BroadcastReceiver;)V
      27: aload_0
      28: getfield      #22                 // Field a:Ljava/util/List;
      31: invokeinterface #158,  1          // InterfaceMethod java/util/List.size:()I
      36: ifle          63
      39: ldc           #160                // String Listener to notifications not cleaned up completely: %d left
      41: iconst_1
      42: anewarray     #83                 // class java/lang/Object
      45: dup
      46: iconst_0
      47: aload_0
      48: getfield      #22                 // Field a:Ljava/util/List;
      51: invokeinterface #158,  1          // InterfaceMethod java/util/List.size:()I
      56: invokestatic  #166                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      59: aastore
      60: invokestatic  #169                // Method com/b/a/i.e:(Ljava/lang/String;[Ljava/lang/Object;)V
      63: return

  public void onNotificationPosted(android.service.notification.StatusBarNotification);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Ljava/util/List;
       4: invokeinterface #175,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       9: astore_3
      10: aload_3
      11: invokeinterface #181,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          140
      19: aload_3
      20: invokeinterface #185,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #8                  // class ryey/easer/plugins/event/notification/NotificationEventListenerService$a
      28: astore_2
      29: aload_2
      30: getfield      #188                // Field ryey/easer/plugins/event/notification/NotificationEventListenerService$a.a:Lryey/easer/plugins/event/notification/a;
      33: astore        4
      35: aload_1
      36: aload         4
      38: getfield      #193                // Field ryey/easer/plugins/event/notification/a.a:Ljava/lang/String;
      41: aload         4
      43: getfield      #195                // Field ryey/easer/plugins/event/notification/a.b:Ljava/lang/String;
      46: aload         4
      48: getfield      #197                // Field ryey/easer/plugins/event/notification/a.c:Ljava/lang/String;
      51: invokestatic  #199                // Method a:(Landroid/service/notification/StatusBarNotification;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
      54: ifeq          68
      57: aload_2
      58: getfield      #202                // Field ryey/easer/plugins/event/notification/NotificationEventListenerService$a.b:Landroid/net/Uri;
      61: invokestatic  #207                // Method ryey/easer/plugins/event/c$a.a:(Landroid/net/Uri;)Landroid/content/Intent;
      64: astore_2
      65: goto          76
      68: aload_2
      69: getfield      #202                // Field ryey/easer/plugins/event/notification/NotificationEventListenerService$a.b:Landroid/net/Uri;
      72: invokestatic  #209                // Method ryey/easer/plugins/event/c$a.b:(Landroid/net/Uri;)Landroid/content/Intent;
      75: astore_2
      76: aload_2
      77: ldc           #211                // String ryey.easer.plugins.event.notification.app
      79: aload_1
      80: invokevirtual #89                 // Method android/service/notification/StatusBarNotification.getPackageName:()Ljava/lang/String;
      83: invokevirtual #214                // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      86: pop
      87: aload_1
      88: invokevirtual #101                // Method android/service/notification/StatusBarNotification.getNotification:()Landroid/app/Notification;
      91: getfield      #107                // Field android/app/Notification.extras:Landroid/os/Bundle;
      94: astore        5
      96: aload         5
      98: ldc           #109                // String android.title
     100: invokevirtual #115                // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
     103: astore        4
     105: aload         5
     107: ldc           #117                // String android.text
     109: invokevirtual #115                // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
     112: astore        5
     114: aload_2
     115: ldc           #216                // String ryey.easer.plugins.event.notification.title
     117: aload         4
     119: invokevirtual #214                // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
     122: pop
     123: aload_2
     124: ldc           #218                // String ryey.easer.plugins.event.notification.content
     126: aload         5
     128: invokevirtual #214                // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
     131: pop
     132: aload_0
     133: aload_2
     134: invokevirtual #222                // Method sendBroadcast:(Landroid/content/Intent;)V
     137: goto          10
     140: aload_0
     141: aload_1
     142: invokespecial #224                // Method android/service/notification/NotificationListenerService.onNotificationPosted:(Landroid/service/notification/StatusBarNotification;)V
     145: return

  public void onNotificationRemoved(android.service.notification.StatusBarNotification);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #227                // Method android/service/notification/NotificationListenerService.onNotificationRemoved:(Landroid/service/notification/StatusBarNotification;)V
       5: return
}
