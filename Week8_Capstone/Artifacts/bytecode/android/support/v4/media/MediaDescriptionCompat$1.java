final class android.support.v4.media.MediaDescriptionCompat$1 implements android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> {
  android.support.v4.media.MediaDescriptionCompat$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v4.media.MediaDescriptionCompat a(android.os.Parcel);
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmpge     17
       8: new           #9                  // class android/support/v4/media/MediaDescriptionCompat
      11: dup
      12: aload_1
      13: invokespecial #25                 // Method android/support/v4/media/MediaDescriptionCompat."<init>":(Landroid/os/Parcel;)V
      16: areturn
      17: aload_1
      18: invokestatic  #30                 // Method android/support/v4/media/a.a:(Landroid/os/Parcel;)Ljava/lang/Object;
      21: invokestatic  #33                 // Method android/support/v4/media/MediaDescriptionCompat.a:(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;
      24: areturn

  public android.support.v4.media.MediaDescriptionCompat[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v4/media/MediaDescriptionCompat
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #37                 // Method a:(Landroid/os/Parcel;)Landroid/support/v4/media/MediaDescriptionCompat;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #41                 // Method a:(I)[Landroid/support/v4/media/MediaDescriptionCompat;
       5: areturn
}
