final class android.support.v4.app.q$1 implements android.os.Parcelable$Creator<android.support.v4.app.q> {
  android.support.v4.app.q$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v4.app.q a(android.os.Parcel);
    Code:
       0: new           #9                  // class android/support/v4/app/q
       3: dup
       4: aload_1
       5: invokespecial #19                 // Method android/support/v4/app/q."<init>":(Landroid/os/Parcel;)V
       8: areturn

  public android.support.v4.app.q[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v4/app/q
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #24                 // Method a:(Landroid/os/Parcel;)Landroid/support/v4/app/q;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #28                 // Method a:(I)[Landroid/support/v4/app/q;
       5: areturn
}
