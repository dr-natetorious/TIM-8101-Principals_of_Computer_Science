class android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends android.os.ResultReceiver {
  protected void onReceiveResult(int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Ljava/lang/ref/WeakReference;
       4: invokevirtual #23                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #6                  // class android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21
      10: astore_3
      11: aload_3
      12: ifnull        38
      15: aload_2
      16: ifnonnull     20
      19: return
      20: aload_3
      21: aload_2
      22: ldc           #25                 // String android.support.v4.media.session.EXTRA_BINDER
      24: invokestatic  #30                 // Method android/support/v4/app/g.a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
      27: invokestatic  #35                 // Method android/support/v4/media/session/b$a.a:(Landroid/os/IBinder;)Landroid/support/v4/media/session/b;
      30: invokestatic  #38                 // Method android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.a:(Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;Landroid/support/v4/media/session/b;)Landroid/support/v4/media/session/b;
      33: pop
      34: aload_3
      35: invokestatic  #41                 // Method android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.a:(Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;)V
      38: return
}
