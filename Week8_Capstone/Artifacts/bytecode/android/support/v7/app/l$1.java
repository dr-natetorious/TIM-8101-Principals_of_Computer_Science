class android.support.v7.app.l$1 implements java.lang.Runnable {
  final android.support.v7.app.l a;

  android.support.v7.app.l$1(android.support.v7.app.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/app/l;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/l;
       4: getfield      #23                 // Field android/support/v7/app/l.s:I
       7: iconst_1
       8: iand
       9: ifeq          20
      12: aload_0
      13: getfield      #14                 // Field a:Landroid/support/v7/app/l;
      16: iconst_0
      17: invokevirtual #27                 // Method android/support/v7/app/l.f:(I)V
      20: aload_0
      21: getfield      #14                 // Field a:Landroid/support/v7/app/l;
      24: getfield      #23                 // Field android/support/v7/app/l.s:I
      27: sipush        4096
      30: iand
      31: ifeq          43
      34: aload_0
      35: getfield      #14                 // Field a:Landroid/support/v7/app/l;
      38: bipush        108
      40: invokevirtual #27                 // Method android/support/v7/app/l.f:(I)V
      43: aload_0
      44: getfield      #14                 // Field a:Landroid/support/v7/app/l;
      47: iconst_0
      48: putfield      #31                 // Field android/support/v7/app/l.r:Z
      51: aload_0
      52: getfield      #14                 // Field a:Landroid/support/v7/app/l;
      55: iconst_0
      56: putfield      #23                 // Field android/support/v7/app/l.s:I
      59: return
}
