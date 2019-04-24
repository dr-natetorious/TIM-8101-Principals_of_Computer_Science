final class android.support.v7.widget.StaggeredGridLayoutManager$c$a$1 implements android.os.Parcelable$Creator<android.support.v7.widget.StaggeredGridLayoutManager$c$a> {
  android.support.v7.widget.StaggeredGridLayoutManager$c$a$1();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v7.widget.StaggeredGridLayoutManager$c$a a(android.os.Parcel);
    Code:
       0: new           #9                  // class android/support/v7/widget/StaggeredGridLayoutManager$c$a
       3: dup
       4: aload_1
       5: invokespecial #24                 // Method android/support/v7/widget/StaggeredGridLayoutManager$c$a."<init>":(Landroid/os/Parcel;)V
       8: areturn

  public android.support.v7.widget.StaggeredGridLayoutManager$c$a[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class android/support/v7/widget/StaggeredGridLayoutManager$c$a
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #29                 // Method a:(Landroid/os/Parcel;)Landroid/support/v7/widget/StaggeredGridLayoutManager$c$a;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #33                 // Method a:(I)[Landroid/support/v7/widget/StaggeredGridLayoutManager$c$a;
       5: areturn
}
