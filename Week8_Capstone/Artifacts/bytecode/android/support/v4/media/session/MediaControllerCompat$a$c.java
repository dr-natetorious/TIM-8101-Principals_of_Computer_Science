class android.support.v4.media.session.MediaControllerCompat$a$c extends android.support.v4.media.session.a$a {
  android.support.v4.media.session.MediaControllerCompat$a$c(android.support.v4.media.session.MediaControllerCompat$a);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method android/support/v4/media/session/a$a."<init>":()V
       4: aload_0
       5: new           #19                 // class java/lang/ref/WeakReference
       8: dup
       9: aload_1
      10: invokespecial #22                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      13: putfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
      16: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_1
      11: aload_1
      12: ifnull        23
      15: aload_1
      16: bipush        8
      18: aconst_null
      19: aconst_null
      20: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      23: return

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        26
      15: aload_2
      16: bipush        9
      18: iload_1
      19: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      22: aconst_null
      23: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      26: return

  public void a(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        23
      15: aload_2
      16: bipush        7
      18: aload_1
      19: aconst_null
      20: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      23: return

  public void a(android.support.v4.media.MediaMetadataCompat);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        22
      15: aload_2
      16: iconst_3
      17: aload_1
      18: aconst_null
      19: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      22: return

  public void a(android.support.v4.media.session.ParcelableVolumeInfo);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        59
      15: aload_1
      16: ifnull        50
      19: new           #44                 // class android/support/v4/media/session/MediaControllerCompat$b
      22: dup
      23: aload_1
      24: getfield      #49                 // Field android/support/v4/media/session/ParcelableVolumeInfo.a:I
      27: aload_1
      28: getfield      #52                 // Field android/support/v4/media/session/ParcelableVolumeInfo.b:I
      31: aload_1
      32: getfield      #54                 // Field android/support/v4/media/session/ParcelableVolumeInfo.c:I
      35: aload_1
      36: getfield      #57                 // Field android/support/v4/media/session/ParcelableVolumeInfo.d:I
      39: aload_1
      40: getfield      #60                 // Field android/support/v4/media/session/ParcelableVolumeInfo.e:I
      43: invokespecial #63                 // Method android/support/v4/media/session/MediaControllerCompat$b."<init>":(IIIII)V
      46: astore_1
      47: goto          52
      50: aconst_null
      51: astore_1
      52: aload_2
      53: iconst_4
      54: aload_1
      55: aconst_null
      56: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      59: return

  public void a(android.support.v4.media.session.PlaybackStateCompat);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        22
      15: aload_2
      16: iconst_2
      17: aload_1
      18: aconst_null
      19: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      22: return

  public void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        23
      15: aload_2
      16: bipush        6
      18: aload_1
      19: aconst_null
      20: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      23: return

  public void a(java.lang.String, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_3
      11: aload_3
      12: ifnull        22
      15: aload_3
      16: iconst_1
      17: aload_1
      18: aload_2
      19: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      22: return

  public void a(java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem>);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        22
      15: aload_2
      16: iconst_5
      17: aload_1
      18: aconst_null
      19: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      22: return

  public void a(boolean);
    Code:
       0: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_1
      11: aload_1
      12: ifnull        23
      15: aload_1
      16: bipush        13
      18: aconst_null
      19: aconst_null
      20: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      23: return

  public void b(int);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        26
      15: aload_2
      16: bipush        12
      18: iload_1
      19: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      22: aconst_null
      23: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      26: return

  public void b(boolean);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #29                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$a
      10: astore_2
      11: aload_2
      12: ifnull        26
      15: aload_2
      16: bipush        11
      18: iload_1
      19: invokestatic  #75                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      22: aconst_null
      23: invokevirtual #32                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(ILjava/lang/Object;Landroid/os/Bundle;)V
      26: return
}
