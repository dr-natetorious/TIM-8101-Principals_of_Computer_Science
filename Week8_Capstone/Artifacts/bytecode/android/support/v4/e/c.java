public class android.support.v4.e.c implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.e.c> CREATOR;

  final boolean a;

  final android.os.Handler b;

  android.support.v4.e.b c;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/e/c$1
       3: dup
       4: invokespecial #26                 // Method android/support/v4/e/c$1."<init>":()V
       7: putstatic     #28                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.e.c(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #31                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #33                 // Field a:Z
       9: aload_0
      10: aconst_null
      11: putfield      #35                 // Field b:Landroid/os/Handler;
      14: aload_0
      15: aload_1
      16: invokevirtual #41                 // Method android/os/Parcel.readStrongBinder:()Landroid/os/IBinder;
      19: invokestatic  #46                 // Method android/support/v4/e/b$a.a:(Landroid/os/IBinder;)Landroid/support/v4/e/b;
      22: putfield      #48                 // Field c:Landroid/support/v4/e/b;
      25: return

  protected void a(int, android.os.Bundle);
    Code:
       0: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #48                 // Field c:Landroid/support/v4/e/b;
       6: ifnonnull     21
       9: aload_0
      10: new           #10                 // class android/support/v4/e/c$a
      13: dup
      14: aload_0
      15: invokespecial #56                 // Method android/support/v4/e/c$a."<init>":(Landroid/support/v4/e/c;)V
      18: putfield      #48                 // Field c:Landroid/support/v4/e/b;
      21: aload_1
      22: aload_0
      23: getfield      #48                 // Field c:Landroid/support/v4/e/b;
      26: invokeinterface #61,  1           // InterfaceMethod android/support/v4/e/b.asBinder:()Landroid/os/IBinder;
      31: invokevirtual #65                 // Method android/os/Parcel.writeStrongBinder:(Landroid/os/IBinder;)V
      34: aload_0
      35: monitorexit
      36: return
      37: astore_1
      38: aload_0
      39: monitorexit
      40: aload_1
      41: athrow
    Exception table:
       from    to  target type
           2    21    37   any
          21    36    37   any
          38    40    37   any
}
