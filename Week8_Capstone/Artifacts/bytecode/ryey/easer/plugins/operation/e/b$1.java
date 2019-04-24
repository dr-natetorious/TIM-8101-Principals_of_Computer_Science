final class ryey.easer.plugins.operation.e.b$1 implements android.os.Parcelable$Creator<ryey.easer.plugins.operation.e.b> {
  ryey.easer.plugins.operation.e.b$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public ryey.easer.plugins.operation.e.b a(android.os.Parcel);
    Code:
       0: new           #9                  // class ryey/easer/plugins/operation/e/b
       3: dup
       4: aload_1
       5: aconst_null
       6: invokespecial #19                 // Method ryey/easer/plugins/operation/e/b."<init>":(Landroid/os/Parcel;Lryey/easer/plugins/operation/e/b$1;)V
       9: areturn

  public ryey.easer.plugins.operation.e.b[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class ryey/easer/plugins/operation/e/b
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #24                 // Method a:(Landroid/os/Parcel;)Lryey/easer/plugins/operation/e/b;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #28                 // Method a:(I)[Lryey/easer/plugins/operation/e/b;
       5: areturn
}
