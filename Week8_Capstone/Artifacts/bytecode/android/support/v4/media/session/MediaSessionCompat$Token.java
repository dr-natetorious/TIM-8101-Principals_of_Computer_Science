public final class android.support.v4.media.session.MediaSessionCompat$Token implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$Token> CREATOR;

  static {};
    Code:
       0: new           #11                 // class android/support/v4/media/session/MediaSessionCompat$Token$1
       3: dup
       4: invokespecial #23                 // Method android/support/v4/media/session/MediaSessionCompat$Token$1."<init>":()V
       7: putstatic     #25                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.session.MediaSessionCompat$Token(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #30                 // Method "<init>":(Ljava/lang/Object;Landroid/support/v4/media/session/b;)V
       6: return

  android.support.v4.media.session.MediaSessionCompat$Token(java.lang.Object, android.support.v4.media.session.b);
    Code:
       0: aload_0
       1: invokespecial #31                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #33                 // Field a:Ljava/lang/Object;
       9: aload_0
      10: aload_2
      11: putfield      #35                 // Field b:Landroid/support/v4/media/session/b;
      14: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class android/support/v4/media/session/MediaSessionCompat$Token
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_1
      17: checkcast     #2                  // class android/support/v4/media/session/MediaSessionCompat$Token
      20: astore_1
      21: aload_0
      22: getfield      #33                 // Field a:Ljava/lang/Object;
      25: ifnonnull     39
      28: aload_1
      29: getfield      #33                 // Field a:Ljava/lang/Object;
      32: ifnonnull     37
      35: iconst_1
      36: ireturn
      37: iconst_0
      38: ireturn
      39: aload_1
      40: getfield      #33                 // Field a:Ljava/lang/Object;
      43: ifnonnull     48
      46: iconst_0
      47: ireturn
      48: aload_0
      49: getfield      #33                 // Field a:Ljava/lang/Object;
      52: aload_1
      53: getfield      #33                 // Field a:Ljava/lang/Object;
      56: invokevirtual #41                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      59: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Ljava/lang/Object;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #33                 // Field a:Ljava/lang/Object;
      13: invokevirtual #44                 // Method java/lang/Object.hashCode:()I
      16: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: getstatic     #52                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: aload_1
       9: aload_0
      10: getfield      #33                 // Field a:Ljava/lang/Object;
      13: checkcast     #6                  // class android/os/Parcelable
      16: iload_2
      17: invokevirtual #58                 // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
      20: return
      21: aload_1
      22: aload_0
      23: getfield      #33                 // Field a:Ljava/lang/Object;
      26: checkcast     #60                 // class android/os/IBinder
      29: invokevirtual #64                 // Method android/os/Parcel.writeStrongBinder:(Landroid/os/IBinder;)V
      32: return
}
