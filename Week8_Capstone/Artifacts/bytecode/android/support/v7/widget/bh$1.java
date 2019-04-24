class android.support.v7.widget.bh$1 implements java.lang.Runnable {
  final android.view.View a;

  final android.support.v7.widget.bh b;

  android.support.v7.widget.bh$1(android.support.v7.widget.bh, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/support/v7/widget/bh;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field a:Landroid/view/View;
      10: aload_0
      11: invokespecial #23                 // Method java/lang/Object."<init>":()V
      14: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/view/View;
       4: invokevirtual #31                 // Method android/view/View.getLeft:()I
       7: istore_1
       8: aload_0
       9: getfield      #18                 // Field b:Landroid/support/v7/widget/bh;
      12: invokevirtual #34                 // Method android/support/v7/widget/bh.getWidth:()I
      15: aload_0
      16: getfield      #20                 // Field a:Landroid/view/View;
      19: invokevirtual #35                 // Method android/view/View.getWidth:()I
      22: isub
      23: iconst_2
      24: idiv
      25: istore_2
      26: aload_0
      27: getfield      #18                 // Field b:Landroid/support/v7/widget/bh;
      30: iload_1
      31: iload_2
      32: isub
      33: iconst_0
      34: invokevirtual #39                 // Method android/support/v7/widget/bh.smoothScrollTo:(II)V
      37: aload_0
      38: getfield      #18                 // Field b:Landroid/support/v7/widget/bh;
      41: aconst_null
      42: putfield      #42                 // Field android/support/v7/widget/bh.a:Ljava/lang/Runnable;
      45: return
}
