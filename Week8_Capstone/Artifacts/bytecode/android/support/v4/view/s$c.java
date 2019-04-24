class android.support.v4.view.s$c extends android.support.v4.view.s$b {
  android.support.v4.view.s$c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/view/s$b."<init>":()V
       4: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_1
       1: iload_2
       2: iload_3
       3: iload         4
       5: iload         5
       7: invokevirtual #20                 // Method android/view/View.setPaddingRelative:(IIII)V
      10: return

  public int k(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #26                 // Method android/view/View.getLayoutDirection:()I
       4: ireturn

  public int l(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #30                 // Method android/view/View.getPaddingStart:()I
       4: ireturn

  public int m(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #34                 // Method android/view/View.getPaddingEnd:()I
       4: ireturn

  public int n(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #38                 // Method android/view/View.getWindowSystemUiVisibility:()I
       4: ireturn

  public boolean o(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #44                 // Method android/view/View.isPaddingRelative:()Z
       4: ireturn

  public android.view.Display p(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #50                 // Method android/view/View.getDisplay:()Landroid/view/Display;
       4: areturn
}
