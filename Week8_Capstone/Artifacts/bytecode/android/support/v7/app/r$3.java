class android.support.v7.app.r$3 implements android.support.v4.view.aa {
  final android.support.v7.app.r a;

  android.support.v7.app.r$3(android.support.v7.app.r);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/app/r;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #23                 // Field android/support/v7/app/r.c:Landroid/support/v7/widget/ActionBarContainer;
       7: invokevirtual #29                 // Method android/support/v7/widget/ActionBarContainer.getParent:()Landroid/view/ViewParent;
      10: checkcast     #31                 // class android/view/View
      13: invokevirtual #34                 // Method android/view/View.invalidate:()V
      16: return
}
