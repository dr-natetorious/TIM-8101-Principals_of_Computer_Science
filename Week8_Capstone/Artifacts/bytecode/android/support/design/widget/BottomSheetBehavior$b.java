public class android.support.design.widget.BottomSheetBehavior$b extends android.support.v4.view.a {
  public static final android.os.Parcelable$Creator<android.support.design.widget.BottomSheetBehavior$b> CREATOR;

  final int a;

  static {};
    Code:
       0: new           #9                  // class android/support/design/widget/BottomSheetBehavior$b$1
       3: dup
       4: invokespecial #19                 // Method android/support/design/widget/BottomSheetBehavior$b$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.design.widget.BottomSheetBehavior$b(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #25                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       6: aload_0
       7: aload_1
       8: invokevirtual #31                 // Method android/os/Parcel.readInt:()I
      11: putfield      #33                 // Field a:I
      14: return

  public android.support.design.widget.BottomSheetBehavior$b(android.os.Parcelable, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #37                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcelable;)V
       5: aload_0
       6: iload_2
       7: putfield      #33                 // Field a:I
      10: return

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #41                 // Method android/support/v4/view/a.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_1
       7: aload_0
       8: getfield      #33                 // Field a:I
      11: invokevirtual #45                 // Method android/os/Parcel.writeInt:(I)V
      14: return
}
