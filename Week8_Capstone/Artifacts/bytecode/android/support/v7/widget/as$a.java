class android.support.v7.widget.as$a implements java.lang.Runnable {
  final android.support.v7.widget.as a;

  android.support.v7.widget.as$a(android.support.v7.widget.as);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/widget/as;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/as;
       4: getfield      #23                 // Field android/support/v7/widget/as.c:Landroid/view/View;
       7: invokevirtual #29                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      10: astore_1
      11: aload_1
      12: ifnull        22
      15: aload_1
      16: iconst_1
      17: invokeinterface #35,  2           // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
      22: return
}
