class android.support.v7.widget.d$g implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v7.widget.d$g> CREATOR;

  public int a;

  static {};
    Code:
       0: new           #11                 // class android/support/v7/widget/d$g$1
       3: dup
       4: invokespecial #21                 // Method android/support/v7/widget/d$g$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v7.widget.d$g();
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: return

  android.support.v7.widget.d$g(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #32                 // Method android/os/Parcel.readInt:()I
       9: putfield      #34                 // Field a:I
      12: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #34                 // Field a:I
       5: invokevirtual #41                 // Method android/os/Parcel.writeInt:(I)V
       8: return
}
