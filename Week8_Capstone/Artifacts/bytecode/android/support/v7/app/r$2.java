class android.support.v7.app.r$2 extends android.support.v4.view.z {
  final android.support.v7.app.r a;

  android.support.v7.app.r$2(android.support.v7.app.r);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v7/app/r;
       5: aload_0
       6: invokespecial #15                 // Method android/support/v4/view/z."<init>":()V
       9: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/app/r;
       4: aconst_null
       5: putfield      #22                 // Field android/support/v7/app/r.n:Landroid/support/v7/view/h;
       8: aload_0
       9: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      12: getfield      #26                 // Field android/support/v7/app/r.c:Landroid/support/v7/widget/ActionBarContainer;
      15: invokevirtual #31                 // Method android/support/v7/widget/ActionBarContainer.requestLayout:()V
      18: return
}
