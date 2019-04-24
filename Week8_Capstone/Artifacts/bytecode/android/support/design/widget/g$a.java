class android.support.design.widget.g$a implements java.lang.Runnable {
  final android.support.design.widget.g a;

  android.support.design.widget.g$a(android.support.design.widget.CoordinatorLayout, V);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/design/widget/g;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #24                 // Field b:Landroid/support/design/widget/CoordinatorLayout;
      14: aload_0
      15: aload_3
      16: putfield      #26                 // Field c:Landroid/view/View;
      19: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #26                 // Field c:Landroid/view/View;
       4: ifnull        80
       7: aload_0
       8: getfield      #19                 // Field a:Landroid/support/design/widget/g;
      11: getfield      #33                 // Field android/support/design/widget/g.a:Landroid/widget/OverScroller;
      14: ifnull        80
      17: aload_0
      18: getfield      #19                 // Field a:Landroid/support/design/widget/g;
      21: getfield      #33                 // Field android/support/design/widget/g.a:Landroid/widget/OverScroller;
      24: invokevirtual #39                 // Method android/widget/OverScroller.computeScrollOffset:()Z
      27: ifeq          65
      30: aload_0
      31: getfield      #19                 // Field a:Landroid/support/design/widget/g;
      34: aload_0
      35: getfield      #24                 // Field b:Landroid/support/design/widget/CoordinatorLayout;
      38: aload_0
      39: getfield      #26                 // Field c:Landroid/view/View;
      42: aload_0
      43: getfield      #19                 // Field a:Landroid/support/design/widget/g;
      46: getfield      #33                 // Field android/support/design/widget/g.a:Landroid/widget/OverScroller;
      49: invokevirtual #43                 // Method android/widget/OverScroller.getCurrY:()I
      52: invokevirtual #47                 // Method android/support/design/widget/g.a_:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)I
      55: pop
      56: aload_0
      57: getfield      #26                 // Field c:Landroid/view/View;
      60: aload_0
      61: invokestatic  #52                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
      64: return
      65: aload_0
      66: getfield      #19                 // Field a:Landroid/support/design/widget/g;
      69: aload_0
      70: getfield      #24                 // Field b:Landroid/support/design/widget/CoordinatorLayout;
      73: aload_0
      74: getfield      #26                 // Field c:Landroid/view/View;
      77: invokevirtual #55                 // Method android/support/design/widget/g.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)V
      80: return
}
