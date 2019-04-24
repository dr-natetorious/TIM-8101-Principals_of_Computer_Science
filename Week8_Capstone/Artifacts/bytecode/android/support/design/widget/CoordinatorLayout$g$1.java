final class android.support.design.widget.CoordinatorLayout$g$1 implements android.os.Parcelable$ClassLoaderCreator<android.support.design.widget.CoordinatorLayout$g> {
  android.support.design.widget.CoordinatorLayout$g$1();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.design.widget.CoordinatorLayout$g a(android.os.Parcel);
    Code:
       0: new           #9                  // class android/support/design/widget/CoordinatorLayout$g
       3: dup
       4: aload_1
       5: aconst_null
       6: invokespecial #22                 // Method android/support/design/widget/CoordinatorLayout$g."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       9: areturn

  public android.support.design.widget.CoordinatorLayout$g a(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: new           #9                  // class android/support/design/widget/CoordinatorLayout$g
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #22                 // Method android/support/design/widget/CoordinatorLayout$g."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       9: areturn

  public android.support.design.widget.CoordinatorLayout$g[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/design/widget/CoordinatorLayout$g
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #28                 // Method a:(Landroid/os/Parcel;)Landroid/support/design/widget/CoordinatorLayout$g;
       5: areturn

  public java.lang.Object createFromParcel(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #31                 // Method a:(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/support/design/widget/CoordinatorLayout$g;
       6: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #35                 // Method a:(I)[Landroid/support/design/widget/CoordinatorLayout$g;
       5: areturn
}
