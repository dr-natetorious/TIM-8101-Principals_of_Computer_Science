final class android.support.v4.media.session.MediaSessionCompat$Token$1 implements android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$Token> {
  android.support.v4.media.session.MediaSessionCompat$Token$1();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v4.media.session.MediaSessionCompat$Token a(android.os.Parcel);
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     17
       8: aload_1
       9: aconst_null
      10: invokevirtual #31                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
      13: astore_1
      14: goto          22
      17: aload_1
      18: invokevirtual #35                 // Method android/os/Parcel.readStrongBinder:()Landroid/os/IBinder;
      21: astore_1
      22: new           #9                  // class android/support/v4/media/session/MediaSessionCompat$Token
      25: dup
      26: aload_1
      27: invokespecial #38                 // Method android/support/v4/media/session/MediaSessionCompat$Token."<init>":(Ljava/lang/Object;)V
      30: areturn

  public android.support.v4.media.session.MediaSessionCompat$Token[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v4/media/session/MediaSessionCompat$Token
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #43                 // Method a:(Landroid/os/Parcel;)Landroid/support/v4/media/session/MediaSessionCompat$Token;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #47                 // Method a:(I)[Landroid/support/v4/media/session/MediaSessionCompat$Token;
       5: areturn
}
