class android.support.v7.widget.aq$2 extends android.support.v7.widget.RecyclerView$n {
  final android.support.v7.widget.aq a;

  android.support.v7.widget.aq$2(android.support.v7.widget.aq);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v7/widget/aq;
       5: aload_0
       6: invokespecial #15                 // Method android/support/v7/widget/RecyclerView$n."<init>":()V
       9: return

  public void a(android.support.v7.widget.RecyclerView, int, int);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/widget/aq;
       4: aload_1
       5: invokevirtual #23                 // Method android/support/v7/widget/RecyclerView.computeHorizontalScrollOffset:()I
       8: aload_1
       9: invokevirtual #26                 // Method android/support/v7/widget/RecyclerView.computeVerticalScrollOffset:()I
      12: invokevirtual #29                 // Method android/support/v7/widget/aq.a:(II)V
      15: return
}
