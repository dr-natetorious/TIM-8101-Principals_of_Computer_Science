final class android.support.v4.app.a$1 implements java.lang.Runnable {
  final java.lang.String[] a;

  final android.app.Activity b;

  final int c;

  android.support.v4.app.a$1(java.lang.String[], android.app.Activity, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field a:[Ljava/lang/String;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field b:Landroid/app/Activity;
      10: aload_0
      11: iload_3
      12: putfield      #24                 // Field c:I
      15: aload_0
      16: invokespecial #27                 // Method java/lang/Object."<init>":()V
      19: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:[Ljava/lang/String;
       4: arraylength
       5: newarray       int
       7: astore_3
       8: aload_0
       9: getfield      #22                 // Field b:Landroid/app/Activity;
      12: invokevirtual #35                 // Method android/app/Activity.getPackageManager:()Landroid/content/pm/PackageManager;
      15: astore        4
      17: aload_0
      18: getfield      #22                 // Field b:Landroid/app/Activity;
      21: invokevirtual #39                 // Method android/app/Activity.getPackageName:()Ljava/lang/String;
      24: astore        5
      26: aload_0
      27: getfield      #20                 // Field a:[Ljava/lang/String;
      30: arraylength
      31: istore_2
      32: iconst_0
      33: istore_1
      34: iload_1
      35: iload_2
      36: if_icmpge     62
      39: aload_3
      40: iload_1
      41: aload         4
      43: aload_0
      44: getfield      #20                 // Field a:[Ljava/lang/String;
      47: iload_1
      48: aaload
      49: aload         5
      51: invokevirtual #45                 // Method android/content/pm/PackageManager.checkPermission:(Ljava/lang/String;Ljava/lang/String;)I
      54: iastore
      55: iload_1
      56: iconst_1
      57: iadd
      58: istore_1
      59: goto          34
      62: aload_0
      63: getfield      #22                 // Field b:Landroid/app/Activity;
      66: checkcast     #47                 // class android/support/v4/app/a$a
      69: aload_0
      70: getfield      #24                 // Field c:I
      73: aload_0
      74: getfield      #20                 // Field a:[Ljava/lang/String;
      77: aload_3
      78: invokeinterface #51,  4           // InterfaceMethod android/support/v4/app/a$a.onRequestPermissionsResult:(I[Ljava/lang/String;[I)V
      83: return
}
