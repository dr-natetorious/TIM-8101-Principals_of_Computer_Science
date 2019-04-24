public class android.support.v4.media.session.ParcelableVolumeInfo implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> CREATOR;

  public int a;

  public int b;

  public int c;

  public int d;

  public int e;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/media/session/ParcelableVolumeInfo$1
       3: dup
       4: invokespecial #22                 // Method android/support/v4/media/session/ParcelableVolumeInfo$1."<init>":()V
       7: putstatic     #24                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.v4.media.session.ParcelableVolumeInfo(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #33                 // Method android/os/Parcel.readInt:()I
       9: putfield      #35                 // Field a:I
      12: aload_0
      13: aload_1
      14: invokevirtual #33                 // Method android/os/Parcel.readInt:()I
      17: putfield      #37                 // Field c:I
      20: aload_0
      21: aload_1
      22: invokevirtual #33                 // Method android/os/Parcel.readInt:()I
      25: putfield      #39                 // Field d:I
      28: aload_0
      29: aload_1
      30: invokevirtual #33                 // Method android/os/Parcel.readInt:()I
      33: putfield      #41                 // Field e:I
      36: aload_0
      37: aload_1
      38: invokevirtual #33                 // Method android/os/Parcel.readInt:()I
      41: putfield      #43                 // Field b:I
      44: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #35                 // Field a:I
       5: invokevirtual #50                 // Method android/os/Parcel.writeInt:(I)V
       8: aload_1
       9: aload_0
      10: getfield      #37                 // Field c:I
      13: invokevirtual #50                 // Method android/os/Parcel.writeInt:(I)V
      16: aload_1
      17: aload_0
      18: getfield      #39                 // Field d:I
      21: invokevirtual #50                 // Method android/os/Parcel.writeInt:(I)V
      24: aload_1
      25: aload_0
      26: getfield      #41                 // Field e:I
      29: invokevirtual #50                 // Method android/os/Parcel.writeInt:(I)V
      32: aload_1
      33: aload_0
      34: getfield      #43                 // Field b:I
      37: invokevirtual #50                 // Method android/os/Parcel.writeInt:(I)V
      40: return
}
