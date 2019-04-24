public class android.support.v7.widget.RecyclerView$s extends android.support.v4.view.a {
  public static final android.os.Parcelable$Creator<android.support.v7.widget.RecyclerView$s> CREATOR;

  android.os.Parcelable a;

  static {};
    Code:
       0: new           #9                  // class android/support/v7/widget/RecyclerView$s$1
       3: dup
       4: invokespecial #19                 // Method android/support/v7/widget/RecyclerView$s$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v7.widget.RecyclerView$s(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #25                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       6: aload_2
       7: ifnull        13
      10: goto          19
      13: ldc           #27                 // class android/support/v7/widget/RecyclerView$i
      15: invokevirtual #33                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      18: astore_2
      19: aload_0
      20: aload_1
      21: aload_2
      22: invokevirtual #39                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
      25: putfield      #41                 // Field a:Landroid/os/Parcelable;
      28: return

  android.support.v7.widget.RecyclerView$s(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcelable;)V
       5: return

  void a(android.support.v7.widget.RecyclerView$s);
    Code:
       0: aload_0
       1: aload_1
       2: getfield      #41                 // Field a:Landroid/os/Parcelable;
       5: putfield      #41                 // Field a:Landroid/os/Parcelable;
       8: return

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #49                 // Method android/support/v4/view/a.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_1
       7: aload_0
       8: getfield      #41                 // Field a:Landroid/os/Parcelable;
      11: iconst_0
      12: invokevirtual #53                 // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
      15: return
}
