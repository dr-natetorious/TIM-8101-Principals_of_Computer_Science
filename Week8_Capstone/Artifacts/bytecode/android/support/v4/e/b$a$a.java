class android.support.v4.e.b$a$a implements android.support.v4.e.b {
  android.support.v4.e.b$a$a(android.os.IBinder);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/os/IBinder;
       9: return

  public void a(int, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: aload_3
       5: ldc           #27                 // String android.support.v4.os.IResultReceiver
       7: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_3
      11: iload_1
      12: invokevirtual #35                 // Method android/os/Parcel.writeInt:(I)V
      15: aload_2
      16: ifnull        33
      19: aload_3
      20: iconst_1
      21: invokevirtual #35                 // Method android/os/Parcel.writeInt:(I)V
      24: aload_2
      25: aload_3
      26: iconst_0
      27: invokevirtual #41                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      30: goto          38
      33: aload_3
      34: iconst_0
      35: invokevirtual #35                 // Method android/os/Parcel.writeInt:(I)V
      38: aload_0
      39: getfield      #17                 // Field a:Landroid/os/IBinder;
      42: iconst_1
      43: aload_3
      44: aconst_null
      45: iconst_1
      46: invokeinterface #47,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      51: pop
      52: aload_3
      53: invokevirtual #50                 // Method android/os/Parcel.recycle:()V
      56: return
      57: astore_2
      58: aload_3
      59: invokevirtual #50                 // Method android/os/Parcel.recycle:()V
      62: aload_2
      63: athrow
    Exception table:
       from    to  target type
           4    15    57   any
          19    30    57   any
          33    38    57   any
          38    52    57   any

  public android.os.IBinder asBinder();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/os/IBinder;
       4: areturn
}
