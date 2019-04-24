public final class ryey.easer.core.e$a implements android.os.Parcelable$Creator<ryey.easer.core.e> {
  public ryey.easer.core.e$a(a.b.b.a);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method "<init>":()V
       4: return

  public ryey.easer.core.e a(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #20                 // String parcel
       3: invokestatic  #26                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: new           #9                  // class ryey/easer/core/e
       9: dup
      10: aload_1
      11: invokespecial #29                 // Method ryey/easer/core/e."<init>":(Landroid/os/Parcel;)V
      14: areturn

  public ryey.easer.core.e[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class ryey/easer/core/e
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #34                 // Method a:(Landroid/os/Parcel;)Lryey/easer/core/e;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #38                 // Method a:(I)[Lryey/easer/core/e;
       5: areturn
}
