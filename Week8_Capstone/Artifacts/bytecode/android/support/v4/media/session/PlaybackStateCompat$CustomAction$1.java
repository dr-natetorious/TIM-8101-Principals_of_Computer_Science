final class android.support.v4.media.session.PlaybackStateCompat$CustomAction$1 implements android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat$CustomAction> {
  android.support.v4.media.session.PlaybackStateCompat$CustomAction$1();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v4.media.session.PlaybackStateCompat$CustomAction a(android.os.Parcel);
    Code:
       0: new           #9                  // class android/support/v4/media/session/PlaybackStateCompat$CustomAction
       3: dup
       4: aload_1
       5: invokespecial #22                 // Method android/support/v4/media/session/PlaybackStateCompat$CustomAction."<init>":(Landroid/os/Parcel;)V
       8: areturn

  public android.support.v4.media.session.PlaybackStateCompat$CustomAction[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v4/media/session/PlaybackStateCompat$CustomAction
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #27                 // Method a:(Landroid/os/Parcel;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #31                 // Method a:(I)[Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
       5: areturn
}
