public class ryey.easer.c.a implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.c.a> CREATOR;

  public final java.lang.String a;

  public final ryey.easer.b.a b;

  public final java.lang.String c;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/c/a$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/c/a$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  protected ryey.easer.c.a(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #32                 // Method android/os/Parcel.readString:()Ljava/lang/String;
       9: putfield      #34                 // Field a:Ljava/lang/String;
      12: aload_0
      13: aload_1
      14: invokestatic  #39                 // Method ryey/easer/b/a.a:(Landroid/os/Parcel;)Lryey/easer/b/a;
      17: putfield      #41                 // Field b:Lryey/easer/b/a;
      20: aload_0
      21: aload_1
      22: invokevirtual #32                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      25: putfield      #43                 // Field c:Ljava/lang/String;
      28: return

  public ryey.easer.c.a(java.lang.String, ryey.easer.b.a, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #34                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #41                 // Field b:Lryey/easer/b/a;
      14: aload_0
      15: aload_3
      16: putfield      #43                 // Field c:Ljava/lang/String;
      19: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #34                 // Field a:Ljava/lang/String;
       5: invokevirtual #52                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #41                 // Field b:Lryey/easer/b/a;
      13: invokestatic  #55                 // Method ryey/easer/b/a.a:(Landroid/os/Parcel;Lryey/easer/b/a;)V
      16: aload_1
      17: aload_0
      18: getfield      #43                 // Field c:Ljava/lang/String;
      21: invokevirtual #52                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      24: return
}
