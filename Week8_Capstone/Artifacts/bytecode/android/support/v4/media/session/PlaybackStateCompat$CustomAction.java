public final class android.support.v4.media.session.PlaybackStateCompat$CustomAction implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat$CustomAction> CREATOR;

  static {};
    Code:
       0: new           #11                 // class android/support/v4/media/session/PlaybackStateCompat$CustomAction$1
       3: dup
       4: invokespecial #29                 // Method android/support/v4/media/session/PlaybackStateCompat$CustomAction$1."<init>":()V
       7: putstatic     #31                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.session.PlaybackStateCompat$CustomAction(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #34                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #40                 // Method android/os/Parcel.readString:()Ljava/lang/String;
       9: putfield      #42                 // Field a:Ljava/lang/String;
      12: aload_0
      13: getstatic     #47                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      16: aload_1
      17: invokeinterface #53,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      22: checkcast     #55                 // class java/lang/CharSequence
      25: putfield      #57                 // Field b:Ljava/lang/CharSequence;
      28: aload_0
      29: aload_1
      30: invokevirtual #61                 // Method android/os/Parcel.readInt:()I
      33: putfield      #63                 // Field c:I
      36: aload_0
      37: aload_1
      38: invokevirtual #67                 // Method android/os/Parcel.readBundle:()Landroid/os/Bundle;
      41: putfield      #69                 // Field d:Landroid/os/Bundle;
      44: return

  android.support.v4.media.session.PlaybackStateCompat$CustomAction(java.lang.String, java.lang.CharSequence, int, android.os.Bundle);
    Code:
       0: aload_0
       1: invokespecial #34                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #42                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #57                 // Field b:Ljava/lang/CharSequence;
      14: aload_0
      15: iload_3
      16: putfield      #63                 // Field c:I
      19: aload_0
      20: aload         4
      22: putfield      #69                 // Field d:Landroid/os/Bundle;
      25: return

  public static android.support.v4.media.session.PlaybackStateCompat$CustomAction a(java.lang.Object);
    Code:
       0: aload_0
       1: ifnull        46
       4: getstatic     #76                 // Field android/os/Build$VERSION.SDK_INT:I
       7: bipush        21
       9: if_icmpge     15
      12: goto          46
      15: new           #2                  // class android/support/v4/media/session/PlaybackStateCompat$CustomAction
      18: dup
      19: aload_0
      20: invokestatic  #81                 // Method android/support/v4/media/session/e$a.a:(Ljava/lang/Object;)Ljava/lang/String;
      23: aload_0
      24: invokestatic  #84                 // Method android/support/v4/media/session/e$a.b:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      27: aload_0
      28: invokestatic  #87                 // Method android/support/v4/media/session/e$a.c:(Ljava/lang/Object;)I
      31: aload_0
      32: invokestatic  #90                 // Method android/support/v4/media/session/e$a.d:(Ljava/lang/Object;)Landroid/os/Bundle;
      35: invokespecial #92                 // Method "<init>":(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V
      38: astore_1
      39: aload_1
      40: aload_0
      41: putfield      #94                 // Field e:Ljava/lang/Object;
      44: aload_1
      45: areturn
      46: aconst_null
      47: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public java.lang.String toString();
    Code:
       0: new           #98                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #99                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #101                // String Action:mName='
      11: invokevirtual #105                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #57                 // Field b:Ljava/lang/CharSequence;
      20: invokevirtual #108                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #110                // String , mIcon=
      27: invokevirtual #105                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #63                 // Field c:I
      36: invokevirtual #113                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #115                // String , mExtras=
      43: invokevirtual #105                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: getfield      #69                 // Field d:Landroid/os/Bundle;
      52: invokevirtual #108                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: invokevirtual #117                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      60: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #42                 // Field a:Ljava/lang/String;
       5: invokevirtual #123                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_0
       9: getfield      #57                 // Field b:Ljava/lang/CharSequence;
      12: aload_1
      13: iload_2
      14: invokestatic  #126                // Method android/text/TextUtils.writeToParcel:(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
      17: aload_1
      18: aload_0
      19: getfield      #63                 // Field c:I
      22: invokevirtual #130                // Method android/os/Parcel.writeInt:(I)V
      25: aload_1
      26: aload_0
      27: getfield      #69                 // Field d:Landroid/os/Bundle;
      30: invokevirtual #134                // Method android/os/Parcel.writeBundle:(Landroid/os/Bundle;)V
      33: return
}
