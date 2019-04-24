final class android.support.v4.media.session.ParcelableVolumeInfo$1 implements android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> {
  android.support.v4.media.session.ParcelableVolumeInfo$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v4.media.session.ParcelableVolumeInfo a(android.os.Parcel);
    Code:
       0: new           #9                  // class android/support/v4/media/session/ParcelableVolumeInfo
       3: dup
       4: aload_1
       5: invokespecial #19                 // Method android/support/v4/media/session/ParcelableVolumeInfo."<init>":(Landroid/os/Parcel;)V
       8: areturn

  public android.support.v4.media.session.ParcelableVolumeInfo[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v4/media/session/ParcelableVolumeInfo
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #24                 // Method a:(Landroid/os/Parcel;)Landroid/support/v4/media/session/ParcelableVolumeInfo;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #28                 // Method a:(I)[Landroid/support/v4/media/session/ParcelableVolumeInfo;
       5: areturn
}
