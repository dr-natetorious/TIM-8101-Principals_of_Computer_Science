public class android.support.design.widget.NavigationView$b extends android.support.v4.view.a {
  public static final android.os.Parcelable$Creator<android.support.design.widget.NavigationView$b> CREATOR;

  public android.os.Bundle a;

  static {};
    Code:
       0: new           #9                  // class android/support/design/widget/NavigationView$b$1
       3: dup
       4: invokespecial #19                 // Method android/support/design/widget/NavigationView$b$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.design.widget.NavigationView$b(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #25                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       6: aload_0
       7: aload_1
       8: aload_2
       9: invokevirtual #31                 // Method android/os/Parcel.readBundle:(Ljava/lang/ClassLoader;)Landroid/os/Bundle;
      12: putfield      #33                 // Field a:Landroid/os/Bundle;
      15: return

  public android.support.design.widget.NavigationView$b(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #36                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcelable;)V
       5: return

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #40                 // Method android/support/v4/view/a.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_1
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/os/Bundle;
      11: invokevirtual #44                 // Method android/os/Parcel.writeBundle:(Landroid/os/Bundle;)V
      14: return
}
