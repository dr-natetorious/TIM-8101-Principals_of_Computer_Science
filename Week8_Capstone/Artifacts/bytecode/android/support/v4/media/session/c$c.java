public class android.support.v4.media.session.c$c {
  public static android.media.AudioAttributes a(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #22                 // class android/media/session/MediaController$PlaybackInfo
       4: invokevirtual #26                 // Method android/media/session/MediaController$PlaybackInfo.getAudioAttributes:()Landroid/media/AudioAttributes;
       7: areturn

  public static int b(java.lang.Object);
    Code:
       0: aload_0
       1: invokestatic  #30                 // Method a:(Ljava/lang/Object;)Landroid/media/AudioAttributes;
       4: invokestatic  #32                 // Method a:(Landroid/media/AudioAttributes;)I
       7: ireturn
}
