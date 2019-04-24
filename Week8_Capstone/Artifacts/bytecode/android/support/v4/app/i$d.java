public class android.support.v4.app.i$d implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.app.i$d> CREATOR;

  final android.os.Bundle a;

  static {};
    Code:
       0: new           #11                 // class android/support/v4/app/i$d$1
       3: dup
       4: invokespecial #21                 // Method android/support/v4/app/i$d$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.app.i$d(android.os.Bundle);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #28                 // Field a:Landroid/os/Bundle;
       9: return

  android.support.v4.app.i$d(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #35                 // Method android/os/Parcel.readBundle:()Landroid/os/Bundle;
       9: putfield      #28                 // Field a:Landroid/os/Bundle;
      12: aload_2
      13: ifnull        31
      16: aload_0
      17: getfield      #28                 // Field a:Landroid/os/Bundle;
      20: ifnull        31
      23: aload_0
      24: getfield      #28                 // Field a:Landroid/os/Bundle;
      27: aload_2
      28: invokevirtual #41                 // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      31: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #28                 // Field a:Landroid/os/Bundle;
       5: invokevirtual #48                 // Method android/os/Parcel.writeBundle:(Landroid/os/Bundle;)V
       8: return
}
