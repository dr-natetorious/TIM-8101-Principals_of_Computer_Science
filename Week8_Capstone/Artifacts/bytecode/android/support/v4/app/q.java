final class android.support.v4.app.q implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.app.q> CREATOR;

  android.support.v4.app.s[] a;

  int[] b;

  android.support.v4.app.d[] c;

  int d;

  int e;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/app/q$1
       3: dup
       4: invokespecial #25                 // Method android/support/v4/app/q$1."<init>":()V
       7: putstatic     #27                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.v4.app.q();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #31                 // Field d:I
       9: return

  public android.support.v4.app.q(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #31                 // Field d:I
       9: aload_0
      10: aload_1
      11: getstatic     #35                 // Field android/support/v4/app/s.CREATOR:Landroid/os/Parcelable$Creator;
      14: invokevirtual #41                 // Method android/os/Parcel.createTypedArray:(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
      17: checkcast     #42                 // class "[Landroid/support/v4/app/s;"
      20: putfield      #44                 // Field a:[Landroid/support/v4/app/s;
      23: aload_0
      24: aload_1
      25: invokevirtual #48                 // Method android/os/Parcel.createIntArray:()[I
      28: putfield      #50                 // Field b:[I
      31: aload_0
      32: aload_1
      33: getstatic     #53                 // Field android/support/v4/app/d.CREATOR:Landroid/os/Parcelable$Creator;
      36: invokevirtual #41                 // Method android/os/Parcel.createTypedArray:(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
      39: checkcast     #54                 // class "[Landroid/support/v4/app/d;"
      42: putfield      #56                 // Field c:[Landroid/support/v4/app/d;
      45: aload_0
      46: aload_1
      47: invokevirtual #60                 // Method android/os/Parcel.readInt:()I
      50: putfield      #31                 // Field d:I
      53: aload_0
      54: aload_1
      55: invokevirtual #60                 // Method android/os/Parcel.readInt:()I
      58: putfield      #62                 // Field e:I
      61: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #44                 // Field a:[Landroid/support/v4/app/s;
       5: iload_2
       6: invokevirtual #69                 // Method android/os/Parcel.writeTypedArray:([Landroid/os/Parcelable;I)V
       9: aload_1
      10: aload_0
      11: getfield      #50                 // Field b:[I
      14: invokevirtual #73                 // Method android/os/Parcel.writeIntArray:([I)V
      17: aload_1
      18: aload_0
      19: getfield      #56                 // Field c:[Landroid/support/v4/app/d;
      22: iload_2
      23: invokevirtual #69                 // Method android/os/Parcel.writeTypedArray:([Landroid/os/Parcelable;I)V
      26: aload_1
      27: aload_0
      28: getfield      #31                 // Field d:I
      31: invokevirtual #77                 // Method android/os/Parcel.writeInt:(I)V
      34: aload_1
      35: aload_0
      36: getfield      #62                 // Field e:I
      39: invokevirtual #77                 // Method android/os/Parcel.writeInt:(I)V
      42: return
}
