class android.support.v7.widget.d$c implements java.lang.Runnable {
  final android.support.v7.widget.d a;

  public android.support.v7.widget.d$c(android.support.v7.widget.d, android.support.v7.widget.d$e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/widget/d;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #22                 // Field b:Landroid/support/v7/widget/d$e;
      14: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/d;
       4: invokestatic  #28                 // Method android/support/v7/widget/d.d:(Landroid/support/v7/widget/d;)Landroid/support/v7/view/menu/h;
       7: ifnull        20
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/support/v7/widget/d;
      14: invokestatic  #31                 // Method android/support/v7/widget/d.e:(Landroid/support/v7/widget/d;)Landroid/support/v7/view/menu/h;
      17: invokevirtual #36                 // Method android/support/v7/view/menu/h.f:()V
      20: aload_0
      21: getfield      #17                 // Field a:Landroid/support/v7/widget/d;
      24: invokestatic  #39                 // Method android/support/v7/widget/d.f:(Landroid/support/v7/widget/d;)Landroid/support/v7/view/menu/p;
      27: checkcast     #41                 // class android/view/View
      30: astore_1
      31: aload_1
      32: ifnull        63
      35: aload_1
      36: invokevirtual #45                 // Method android/view/View.getWindowToken:()Landroid/os/IBinder;
      39: ifnull        63
      42: aload_0
      43: getfield      #22                 // Field b:Landroid/support/v7/widget/d$e;
      46: invokevirtual #50                 // Method android/support/v7/widget/d$e.c:()Z
      49: ifeq          63
      52: aload_0
      53: getfield      #17                 // Field a:Landroid/support/v7/widget/d;
      56: aload_0
      57: getfield      #22                 // Field b:Landroid/support/v7/widget/d$e;
      60: putfield      #53                 // Field android/support/v7/widget/d.h:Landroid/support/v7/widget/d$e;
      63: aload_0
      64: getfield      #17                 // Field a:Landroid/support/v7/widget/d;
      67: aconst_null
      68: putfield      #57                 // Field android/support/v7/widget/d.j:Landroid/support/v7/widget/d$c;
      71: return
}
