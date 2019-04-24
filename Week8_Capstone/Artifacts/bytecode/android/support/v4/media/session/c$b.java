class android.support.v4.media.session.c$b<T extends android.support.v4.media.session.c$a> extends android.media.session.MediaController$Callback {
  protected final T a;

  public android.support.v4.media.session.c$b(T);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/media/session/MediaController$Callback."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       9: return

  public void onAudioInfoChanged(android.media.session.MediaController$PlaybackInfo);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: aload_1
       5: invokevirtual #29                 // Method android/media/session/MediaController$PlaybackInfo.getPlaybackType:()I
       8: aload_1
       9: invokestatic  #34                 // Method android/support/v4/media/session/c$c.b:(Ljava/lang/Object;)I
      12: aload_1
      13: invokevirtual #37                 // Method android/media/session/MediaController$PlaybackInfo.getVolumeControl:()I
      16: aload_1
      17: invokevirtual #40                 // Method android/media/session/MediaController$PlaybackInfo.getMaxVolume:()I
      20: aload_1
      21: invokevirtual #43                 // Method android/media/session/MediaController$PlaybackInfo.getCurrentVolume:()I
      24: invokeinterface #48,  6           // InterfaceMethod android/support/v4/media/session/c$a.a:(IIIII)V
      29: return

  public void onExtrasChanged(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: aload_1
       5: invokeinterface #52,  2           // InterfaceMethod android/support/v4/media/session/c$a.a:(Landroid/os/Bundle;)V
      10: return

  public void onMetadataChanged(android.media.MediaMetadata);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: aload_1
       5: invokeinterface #57,  2           // InterfaceMethod android/support/v4/media/session/c$a.b:(Ljava/lang/Object;)V
      10: return

  public void onPlaybackStateChanged(android.media.session.PlaybackState);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: aload_1
       5: invokeinterface #61,  2           // InterfaceMethod android/support/v4/media/session/c$a.a:(Ljava/lang/Object;)V
      10: return

  public void onQueueChanged(java.util.List<android.media.session.MediaSession$QueueItem>);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: aload_1
       5: invokeinterface #65,  2           // InterfaceMethod android/support/v4/media/session/c$a.a:(Ljava/util/List;)V
      10: return

  public void onQueueTitleChanged(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: aload_1
       5: invokeinterface #70,  2           // InterfaceMethod android/support/v4/media/session/c$a.a:(Ljava/lang/CharSequence;)V
      10: return

  public void onSessionDestroyed();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: invokeinterface #73,  1           // InterfaceMethod android/support/v4/media/session/c$a.a:()V
       9: return

  public void onSessionEvent(java.lang.String, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/media/session/c$a;
       4: aload_1
       5: aload_2
       6: invokeinterface #77,  3           // InterfaceMethod android/support/v4/media/session/c$a.a:(Ljava/lang/String;Landroid/os/Bundle;)V
      11: return
}
