final class android.support.v4.media.RatingCompat$1 implements android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> {
  android.support.v4.media.RatingCompat$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v4.media.RatingCompat a(android.os.Parcel);
    Code:
       0: new           #9                  // class android/support/v4/media/RatingCompat
       3: dup
       4: aload_1
       5: invokevirtual #22                 // Method android/os/Parcel.readInt:()I
       8: aload_1
       9: invokevirtual #26                 // Method android/os/Parcel.readFloat:()F
      12: invokespecial #29                 // Method android/support/v4/media/RatingCompat."<init>":(IF)V
      15: areturn

  public android.support.v4.media.RatingCompat[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v4/media/RatingCompat
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #34                 // Method a:(Landroid/os/Parcel;)Landroid/support/v4/media/RatingCompat;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #38                 // Method a:(I)[Landroid/support/v4/media/RatingCompat;
       5: areturn
}
