class android.support.v4.app.o$2$1 implements java.lang.Runnable {
  final android.support.v4.app.o$2 a;

  android.support.v4.app.o$2$1(android.support.v4.app.o$2);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v4/app/o$2;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v4/app/o$2;
       4: getfield      #26                 // Field android/support/v4/app/o$2.b:Landroid/support/v4/app/i;
       7: invokevirtual #32                 // Method android/support/v4/app/i.getAnimatingAway:()Landroid/view/View;
      10: ifnull        54
      13: aload_0
      14: getfield      #17                 // Field a:Landroid/support/v4/app/o$2;
      17: getfield      #26                 // Field android/support/v4/app/o$2.b:Landroid/support/v4/app/i;
      20: aconst_null
      21: invokevirtual #36                 // Method android/support/v4/app/i.setAnimatingAway:(Landroid/view/View;)V
      24: aload_0
      25: getfield      #17                 // Field a:Landroid/support/v4/app/o$2;
      28: getfield      #40                 // Field android/support/v4/app/o$2.c:Landroid/support/v4/app/o;
      31: aload_0
      32: getfield      #17                 // Field a:Landroid/support/v4/app/o$2;
      35: getfield      #26                 // Field android/support/v4/app/o$2.b:Landroid/support/v4/app/i;
      38: aload_0
      39: getfield      #17                 // Field a:Landroid/support/v4/app/o$2;
      42: getfield      #26                 // Field android/support/v4/app/o$2.b:Landroid/support/v4/app/i;
      45: invokevirtual #44                 // Method android/support/v4/app/i.getStateAfterAnimating:()I
      48: iconst_0
      49: iconst_0
      50: iconst_0
      51: invokevirtual #49                 // Method android/support/v4/app/o.a:(Landroid/support/v4/app/i;IIIZ)V
      54: return
}
