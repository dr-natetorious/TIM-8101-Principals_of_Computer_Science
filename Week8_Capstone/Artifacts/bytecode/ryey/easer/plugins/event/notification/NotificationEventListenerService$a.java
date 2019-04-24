class ryey.easer.plugins.event.notification.NotificationEventListenerService$a {
  final ryey.easer.plugins.event.notification.a a;

  final android.net.Uri b;

  ryey.easer.plugins.event.notification.NotificationEventListenerService$a(ryey.easer.plugins.event.notification.a, android.net.Uri, ryey.easer.plugins.event.notification.NotificationEventListenerService$1);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #23                 // Method "<init>":(Lryey/easer/plugins/event/notification/a;Landroid/net/Uri;)V
       6: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_1
       7: instanceof    #2                  // class ryey/easer/plugins/event/notification/NotificationEventListenerService$a
      10: ifne          15
      13: iconst_0
      14: ireturn
      15: aload_0
      16: getfield      #19                 // Field b:Landroid/net/Uri;
      19: aload_1
      20: checkcast     #2                  // class ryey/easer/plugins/event/notification/NotificationEventListenerService$a
      23: getfield      #19                 // Field b:Landroid/net/Uri;
      26: invokevirtual #29                 // Method android/net/Uri.equals:(Ljava/lang/Object;)Z
      29: ireturn
}
