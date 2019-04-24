class android.support.v7.widget.aw$c implements android.widget.AbsListView$OnScrollListener {
  final android.support.v7.widget.aw a;

  android.support.v7.widget.aw$c(android.support.v7.widget.aw);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/widget/aw;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void onScroll(android.widget.AbsListView, int, int, int);
    Code:
       0: return

  public void onScrollStateChanged(android.widget.AbsListView, int);
    Code:
       0: iload_2
       1: iconst_1
       2: if_icmpne     55
       5: aload_0
       6: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
       9: invokevirtual #27                 // Method android/support/v7/widget/aw.n:()Z
      12: ifne          55
      15: aload_0
      16: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      19: getfield      #31                 // Field android/support/v7/widget/aw.g:Landroid/widget/PopupWindow;
      22: invokevirtual #37                 // Method android/widget/PopupWindow.getContentView:()Landroid/view/View;
      25: ifnull        55
      28: aload_0
      29: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      32: getfield      #41                 // Field android/support/v7/widget/aw.f:Landroid/os/Handler;
      35: aload_0
      36: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      39: getfield      #45                 // Field android/support/v7/widget/aw.e:Landroid/support/v7/widget/aw$e;
      42: invokevirtual #51                 // Method android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
      45: aload_0
      46: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      49: getfield      #45                 // Field android/support/v7/widget/aw.e:Landroid/support/v7/widget/aw$e;
      52: invokevirtual #56                 // Method android/support/v7/widget/aw$e.run:()V
      55: return
}
