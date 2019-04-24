final class ryey.easer.c.a$1 implements android.os.Parcelable$Creator<ryey.easer.c.a> {
  ryey.easer.c.a$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public ryey.easer.c.a a(android.os.Parcel);
    Code:
       0: new           #9                  // class ryey/easer/c/a
       3: dup
       4: aload_1
       5: invokespecial #19                 // Method ryey/easer/c/a."<init>":(Landroid/os/Parcel;)V
       8: areturn

  public ryey.easer.c.a[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class ryey/easer/c/a
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #24                 // Method a:(Landroid/os/Parcel;)Lryey/easer/c/a;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #28                 // Method a:(I)[Lryey/easer/c/a;
       5: areturn
}
