class android.support.v7.widget.RecyclerView$2 implements java.lang.Runnable {
  final android.support.v7.widget.RecyclerView a;

  android.support.v7.widget.RecyclerView$2(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: getfield      #23                 // Field android/support/v7/widget/RecyclerView.y:Landroid/support/v7/widget/RecyclerView$f;
       7: ifnull        20
      10: aload_0
      11: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      14: getfield      #23                 // Field android/support/v7/widget/RecyclerView.y:Landroid/support/v7/widget/RecyclerView$f;
      17: invokevirtual #27                 // Method android/support/v7/widget/RecyclerView$f.a:()V
      20: aload_0
      21: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      24: iconst_0
      25: putfield      #31                 // Field android/support/v7/widget/RecyclerView.F:Z
      28: return
}
