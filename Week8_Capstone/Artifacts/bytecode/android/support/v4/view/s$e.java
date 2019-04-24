class android.support.v4.view.s$e extends android.support.v4.view.s$d {
  android.support.v4.view.s$e();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/view/s$d."<init>":()V
       4: return

  public void a(android.view.View, int);
    Code:
       0: aload_1
       1: iload_2
       2: invokevirtual #20                 // Method android/view/View.setImportantForAccessibility:(I)V
       5: return

  public boolean r(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #26                 // Method android/view/View.isLaidOut:()Z
       4: ireturn

  public boolean s(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #30                 // Method android/view/View.isAttachedToWindow:()Z
       4: ireturn
}
