public class ryey.easer.plugins.operation.media_control.MediaControlHelperNotificationListenerService extends android.service.notification.NotificationListenerService {
  public ryey.easer.plugins.operation.media_control.MediaControlHelperNotificationListenerService();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/service/notification/NotificationListenerService."<init>":()V
       4: return

  public void onNotificationPosted(android.service.notification.StatusBarNotification);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #13                 // Method android/service/notification/NotificationListenerService.onNotificationPosted:(Landroid/service/notification/StatusBarNotification;)V
       5: return

  public void onNotificationRemoved(android.service.notification.StatusBarNotification);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #16                 // Method android/service/notification/NotificationListenerService.onNotificationRemoved:(Landroid/service/notification/StatusBarNotification;)V
       5: return
}
