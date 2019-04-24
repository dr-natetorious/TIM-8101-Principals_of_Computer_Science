class android.support.v4.media.session.d$a {
  public static java.lang.Object a(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/MediaSession$QueueItem
       4: invokevirtual #14                 // Method android/media/session/MediaSession$QueueItem.getDescription:()Landroid/media/MediaDescription;
       7: areturn

  public static long b(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/MediaSession$QueueItem
       4: invokevirtual #21                 // Method android/media/session/MediaSession$QueueItem.getQueueId:()J
       7: lreturn
}
