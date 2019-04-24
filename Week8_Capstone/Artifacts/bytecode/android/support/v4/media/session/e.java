class android.support.v4.media.session.e {
  public static int a(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #14                 // Method android/media/session/PlaybackState.getState:()I
       7: ireturn

  public static long b(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #21                 // Method android/media/session/PlaybackState.getPosition:()J
       7: lreturn

  public static long c(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #25                 // Method android/media/session/PlaybackState.getBufferedPosition:()J
       7: lreturn

  public static float d(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #31                 // Method android/media/session/PlaybackState.getPlaybackSpeed:()F
       7: freturn

  public static long e(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #35                 // Method android/media/session/PlaybackState.getActions:()J
       7: lreturn

  public static java.lang.CharSequence f(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #41                 // Method android/media/session/PlaybackState.getErrorMessage:()Ljava/lang/CharSequence;
       7: areturn

  public static long g(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #45                 // Method android/media/session/PlaybackState.getLastPositionUpdateTime:()J
       7: lreturn

  public static java.util.List<java.lang.Object> h(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #51                 // Method android/media/session/PlaybackState.getCustomActions:()Ljava/util/List;
       7: areturn

  public static long i(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState
       4: invokevirtual #57                 // Method android/media/session/PlaybackState.getActiveQueueItemId:()J
       7: lreturn
}
