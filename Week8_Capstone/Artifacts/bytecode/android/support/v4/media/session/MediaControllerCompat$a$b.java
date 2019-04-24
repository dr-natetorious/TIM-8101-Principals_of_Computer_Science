class android.support.v4.media.session.MediaControllerCompat$a$b implements android.support.v4.media.session.c$a {
  android.support.v4.media.session.MediaControllerCompat$a$b(android.support.v4.media.session.MediaControllerCompat$a);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #21                 // class java/lang/ref/WeakReference
       8: dup
       9: aload_1
      10: invokespecial #24                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      13: putfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
      16: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_1
      11: aload_1
      12: ifnull        19
      15: aload_1
      16: invokevirtual #33                 // Method android/support/v4/media/session/MediaControllerCompat$a.b:()V
      19: return

  public void a(int, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore        6
      12: aload         6
      14: ifnull        36
      17: aload         6
      19: new           #36                 // class android/support/v4/media/session/MediaControllerCompat$b
      22: dup
      23: iload_1
      24: iload_2
      25: iload_3
      26: iload         4
      28: iload         5
      30: invokespecial #38                 // Method android/support/v4/media/session/MediaControllerCompat$b."<init>":(IIIII)V
      33: invokevirtual #41                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/support/v4/media/session/MediaControllerCompat$b;)V
      36: return

  public void a(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        20
      15: aload_2
      16: aload_1
      17: invokevirtual #44                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/os/Bundle;)V
      20: return

  public void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        20
      15: aload_2
      16: aload_1
      17: invokevirtual #47                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Ljava/lang/CharSequence;)V
      20: return

  public void a(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        31
      15: aload_2
      16: getfield      #50                 // Field android/support/v4/media/session/MediaControllerCompat$a.b:Z
      19: ifeq          23
      22: return
      23: aload_2
      24: aload_1
      25: invokestatic  #55                 // Method android/support/v4/media/session/PlaybackStateCompat.a:(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;
      28: invokevirtual #58                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/support/v4/media/session/PlaybackStateCompat;)V
      31: return

  public void a(java.lang.String, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_3
      11: aload_3
      12: ifnull        37
      15: aload_3
      16: getfield      #50                 // Field android/support/v4/media/session/MediaControllerCompat$a.b:Z
      19: ifeq          31
      22: getstatic     #65                 // Field android/os/Build$VERSION.SDK_INT:I
      25: bipush        23
      27: if_icmpge     31
      30: return
      31: aload_3
      32: aload_1
      33: aload_2
      34: invokevirtual #67                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Ljava/lang/String;Landroid/os/Bundle;)V
      37: return

  public void a(java.util.List<?>);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        23
      15: aload_2
      16: aload_1
      17: invokestatic  #73                 // Method android/support/v4/media/session/MediaSessionCompat$QueueItem.a:(Ljava/util/List;)Ljava/util/List;
      20: invokevirtual #75                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Ljava/util/List;)V
      23: return

  public void b(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #31                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #8                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        23
      15: aload_2
      16: aload_1
      17: invokestatic  #82                 // Method android/support/v4/media/MediaMetadataCompat.a:(Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;
      20: invokevirtual #85                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/support/v4/media/MediaMetadataCompat;)V
      23: return
}
