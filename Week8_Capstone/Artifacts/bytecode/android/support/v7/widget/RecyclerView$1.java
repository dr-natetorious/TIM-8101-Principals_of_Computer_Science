class android.support.v7.widget.RecyclerView$1 implements java.lang.Runnable {
  final android.support.v7.widget.RecyclerView a;

  android.support.v7.widget.RecyclerView$1(android.support.v7.widget.RecyclerView);
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
       4: getfield      #23                 // Field android/support/v7/widget/RecyclerView.s:Z
       7: ifeq          65
      10: aload_0
      11: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      14: invokevirtual #27                 // Method android/support/v7/widget/RecyclerView.isLayoutRequested:()Z
      17: ifeq          21
      20: return
      21: aload_0
      22: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      25: getfield      #30                 // Field android/support/v7/widget/RecyclerView.p:Z
      28: ifne          39
      31: aload_0
      32: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      35: invokevirtual #33                 // Method android/support/v7/widget/RecyclerView.requestLayout:()V
      38: return
      39: aload_0
      40: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      43: getfield      #36                 // Field android/support/v7/widget/RecyclerView.u:Z
      46: ifeq          58
      49: aload_0
      50: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      53: iconst_1
      54: putfield      #39                 // Field android/support/v7/widget/RecyclerView.t:Z
      57: return
      58: aload_0
      59: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      62: invokevirtual #42                 // Method android/support/v7/widget/RecyclerView.d:()V
      65: return
}
