public abstract class android.support.v4.e.b$a extends android.os.Binder implements android.support.v4.e.b {
  public android.support.v4.e.b$a();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/os/Binder."<init>":()V
       4: aload_0
       5: aload_0
       6: ldc           #15                 // String android.support.v4.os.IResultReceiver
       8: invokevirtual #19                 // Method attachInterface:(Landroid/os/IInterface;Ljava/lang/String;)V
      11: return

  public static android.support.v4.e.b a(android.os.IBinder);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: aload_0
       7: ldc           #15                 // String android.support.v4.os.IResultReceiver
       9: invokeinterface #27,  2           // InterfaceMethod android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
      14: astore_1
      15: aload_1
      16: ifnull        31
      19: aload_1
      20: instanceof    #6                  // class android/support/v4/e/b
      23: ifeq          31
      26: aload_1
      27: checkcast     #6                  // class android/support/v4/e/b
      30: areturn
      31: new           #9                  // class android/support/v4/e/b$a$a
      34: dup
      35: aload_0
      36: invokespecial #30                 // Method android/support/v4/e/b$a$a."<init>":(Landroid/os/IBinder;)V
      39: areturn

  public android.os.IBinder asBinder();
    Code:
       0: aload_0
       1: areturn

  public boolean onTransact(int, android.os.Parcel, android.os.Parcel, int);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpeq     29
       5: iload_1
       6: ldc           #35                 // int 1598968902
       8: if_icmpeq     21
      11: aload_0
      12: iload_1
      13: aload_2
      14: aload_3
      15: iload         4
      17: invokespecial #37                 // Method android/os/Binder.onTransact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      20: ireturn
      21: aload_3
      22: ldc           #15                 // String android.support.v4.os.IResultReceiver
      24: invokevirtual #43                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      27: iconst_1
      28: ireturn
      29: aload_2
      30: ldc           #15                 // String android.support.v4.os.IResultReceiver
      32: invokevirtual #46                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
      35: aload_2
      36: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      39: istore_1
      40: aload_2
      41: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      44: ifeq          63
      47: getstatic     #56                 // Field android/os/Bundle.CREATOR:Landroid/os/Parcelable$Creator;
      50: aload_2
      51: invokeinterface #62,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      56: checkcast     #52                 // class android/os/Bundle
      59: astore_2
      60: goto          65
      63: aconst_null
      64: astore_2
      65: aload_0
      66: iload_1
      67: aload_2
      68: invokevirtual #65                 // Method a:(ILandroid/os/Bundle;)V
      71: iconst_1
      72: ireturn
}
