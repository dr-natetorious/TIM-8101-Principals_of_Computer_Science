public final class android.support.v4.media.RatingCompat implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> CREATOR;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/media/RatingCompat$1
       3: dup
       4: invokespecial #20                 // Method android/support/v4/media/RatingCompat$1."<init>":()V
       7: putstatic     #22                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.RatingCompat(int, float);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #27                 // Field a:I
       9: aload_0
      10: fload_2
      11: putfield      #29                 // Field b:F
      14: return

  public int describeContents();
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:I
       4: ireturn

  public java.lang.String toString();
    Code:
       0: new           #35                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #36                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_2
       8: aload_2
       9: ldc           #38                 // String Rating:style=
      11: invokevirtual #42                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_2
      16: aload_0
      17: getfield      #27                 // Field a:I
      20: invokevirtual #45                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      23: pop
      24: aload_2
      25: ldc           #47                 // String  rating=
      27: invokevirtual #42                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_0
      32: getfield      #29                 // Field b:F
      35: fconst_0
      36: fcmpg
      37: ifge          46
      40: ldc           #49                 // String unrated
      42: astore_1
      43: goto          54
      46: aload_0
      47: getfield      #29                 // Field b:F
      50: invokestatic  #55                 // Method java/lang/String.valueOf:(F)Ljava/lang/String;
      53: astore_1
      54: aload_2
      55: aload_1
      56: invokevirtual #42                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      59: pop
      60: aload_2
      61: invokevirtual #57                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      64: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #27                 // Field a:I
       5: invokevirtual #65                 // Method android/os/Parcel.writeInt:(I)V
       8: aload_1
       9: aload_0
      10: getfield      #29                 // Field b:F
      13: invokevirtual #69                 // Method android/os/Parcel.writeFloat:(F)V
      16: return
}
