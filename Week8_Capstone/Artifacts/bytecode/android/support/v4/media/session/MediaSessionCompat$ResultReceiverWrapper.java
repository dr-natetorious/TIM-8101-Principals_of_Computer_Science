final class android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> CREATOR;

  static {};
    Code:
       0: new           #11                 // class android/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$1
       3: dup
       4: invokespecial #21                 // Method android/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: getstatic     #29                 // Field android/os/ResultReceiver.CREATOR:Landroid/os/Parcelable$Creator;
       8: aload_1
       9: invokeinterface #35,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      14: checkcast     #28                 // class android/os/ResultReceiver
      17: putfield      #37                 // Field a:Landroid/os/ResultReceiver;
      20: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Landroid/os/ResultReceiver;
       4: aload_1
       5: iload_2
       6: invokevirtual #43                 // Method android/os/ResultReceiver.writeToParcel:(Landroid/os/Parcel;I)V
       9: return
}
