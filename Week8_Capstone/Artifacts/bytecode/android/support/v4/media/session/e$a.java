final class android.support.v4.media.session.e$a {
  public static java.lang.String a(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState$CustomAction
       4: invokevirtual #14                 // Method android/media/session/PlaybackState$CustomAction.getAction:()Ljava/lang/String;
       7: areturn

  public static java.lang.CharSequence b(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState$CustomAction
       4: invokevirtual #21                 // Method android/media/session/PlaybackState$CustomAction.getName:()Ljava/lang/CharSequence;
       7: areturn

  public static int c(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState$CustomAction
       4: invokevirtual #27                 // Method android/media/session/PlaybackState$CustomAction.getIcon:()I
       7: ireturn

  public static android.os.Bundle d(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/session/PlaybackState$CustomAction
       4: invokevirtual #33                 // Method android/media/session/PlaybackState$CustomAction.getExtras:()Landroid/os/Bundle;
       7: areturn
}
