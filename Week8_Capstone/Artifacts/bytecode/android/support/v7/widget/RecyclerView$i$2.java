class android.support.v7.widget.RecyclerView$i$2 implements android.support.v7.widget.bv$b {
  final android.support.v7.widget.RecyclerView$i a;

  android.support.v7.widget.RecyclerView$i$2(android.support.v7.widget.RecyclerView$i);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #25                 // Method android/support/v7/widget/RecyclerView$i.B:()I
       7: ireturn

  public int a(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #32                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #34                 // class android/support/v7/widget/RecyclerView$j
       7: astore_2
       8: aload_0
       9: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      12: aload_1
      13: invokevirtual #36                 // Method android/support/v7/widget/RecyclerView$i.i:(Landroid/view/View;)I
      16: aload_2
      17: getfield      #40                 // Field android/support/v7/widget/RecyclerView$j.topMargin:I
      20: isub
      21: ireturn

  public android.view.View a(int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: iload_1
       5: invokevirtual #44                 // Method android/support/v7/widget/RecyclerView$i.h:(I)Landroid/view/View;
       8: areturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #48                 // Method android/support/v7/widget/RecyclerView$i.z:()I
       7: aload_0
       8: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      11: invokevirtual #51                 // Method android/support/v7/widget/RecyclerView$i.D:()I
      14: isub
      15: ireturn

  public int b(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #32                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #34                 // class android/support/v7/widget/RecyclerView$j
       7: astore_2
       8: aload_0
       9: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      12: aload_1
      13: invokevirtual #54                 // Method android/support/v7/widget/RecyclerView$i.k:(Landroid/view/View;)I
      16: aload_2
      17: getfield      #57                 // Field android/support/v7/widget/RecyclerView$j.bottomMargin:I
      20: iadd
      21: ireturn
}
