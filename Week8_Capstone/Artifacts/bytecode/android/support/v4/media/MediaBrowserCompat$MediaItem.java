public class android.support.v4.media.MediaBrowserCompat$MediaItem implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.MediaBrowserCompat$MediaItem> CREATOR;

  static {};
    Code:
       0: new           #11                 // class android/support/v4/media/MediaBrowserCompat$MediaItem$1
       3: dup
       4: invokespecial #23                 // Method android/support/v4/media/MediaBrowserCompat$MediaItem$1."<init>":()V
       7: putstatic     #25                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.MediaBrowserCompat$MediaItem(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #34                 // Method android/os/Parcel.readInt:()I
       9: putfield      #36                 // Field a:I
      12: aload_0
      13: getstatic     #39                 // Field android/support/v4/media/MediaDescriptionCompat.CREATOR:Landroid/os/Parcelable$Creator;
      16: aload_1
      17: invokeinterface #45,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      22: checkcast     #38                 // class android/support/v4/media/MediaDescriptionCompat
      25: putfield      #47                 // Field b:Landroid/support/v4/media/MediaDescriptionCompat;
      28: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public java.lang.String toString();
    Code:
       0: new           #52                 // class java/lang/StringBuilder
       3: dup
       4: ldc           #54                 // String MediaItem{
       6: invokespecial #57                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
       9: astore_1
      10: aload_1
      11: ldc           #59                 // String mFlags=
      13: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: aload_0
      19: getfield      #36                 // Field a:I
      22: invokevirtual #66                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      25: pop
      26: aload_1
      27: ldc           #68                 // String , mDescription=
      29: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: aload_0
      35: getfield      #47                 // Field b:Landroid/support/v4/media/MediaDescriptionCompat;
      38: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      41: pop
      42: aload_1
      43: bipush        125
      45: invokevirtual #74                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      48: pop
      49: aload_1
      50: invokevirtual #76                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      53: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #36                 // Field a:I
       5: invokevirtual #82                 // Method android/os/Parcel.writeInt:(I)V
       8: aload_0
       9: getfield      #47                 // Field b:Landroid/support/v4/media/MediaDescriptionCompat;
      12: aload_1
      13: iload_2
      14: invokevirtual #84                 // Method android/support/v4/media/MediaDescriptionCompat.writeToParcel:(Landroid/os/Parcel;I)V
      17: return
}
