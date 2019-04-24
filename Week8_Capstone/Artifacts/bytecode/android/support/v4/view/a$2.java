final class android.support.v4.view.a$2 implements android.os.Parcelable$ClassLoaderCreator<android.support.v4.view.a> {
  android.support.v4.view.a$2();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v4.view.a a(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokevirtual #19                 // Method a:(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/support/v4/view/a;
       6: areturn

  public android.support.v4.view.a a(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #25                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
       5: ifnull        18
       8: new           #27                 // class java/lang/IllegalStateException
      11: dup
      12: ldc           #29                 // String superState must be null
      14: invokespecial #32                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: getstatic     #36                 // Field android/support/v4/view/a.d:Landroid/support/v4/view/a;
      21: areturn

  public android.support.v4.view.a[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v4/view/a
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #41                 // Method a:(Landroid/os/Parcel;)Landroid/support/v4/view/a;
       5: areturn

  public java.lang.Object createFromParcel(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #19                 // Method a:(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/support/v4/view/a;
       6: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #46                 // Method a:(I)[Landroid/support/v4/view/a;
       5: areturn
}
