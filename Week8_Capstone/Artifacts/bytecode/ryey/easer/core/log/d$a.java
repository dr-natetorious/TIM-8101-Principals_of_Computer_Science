public final class ryey.easer.core.log.d$a implements android.os.Parcelable$Creator<ryey.easer.core.log.d> {
  public ryey.easer.core.log.d$a(a.b.b.a);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method "<init>":()V
       4: return

  public ryey.easer.core.log.d a(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #20                 // String parcel
       3: invokestatic  #26                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: new           #9                  // class ryey/easer/core/log/d
       9: dup
      10: aload_1
      11: invokespecial #29                 // Method ryey/easer/core/log/d."<init>":(Landroid/os/Parcel;)V
      14: areturn

  public ryey.easer.core.log.d[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class ryey/easer/core/log/d
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #34                 // Method a:(Landroid/os/Parcel;)Lryey/easer/core/log/d;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #38                 // Method a:(I)[Lryey/easer/core/log/d;
       5: areturn
}
