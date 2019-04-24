class android.support.v7.app.l$5 implements java.lang.Runnable {
  final android.support.v7.app.l a;

  android.support.v7.app.l$5(android.support.v7.app.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/v7/app/l;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/support/v7/app/l;
       4: getfield      #28                 // Field android/support/v7/app/l.o:Landroid/widget/PopupWindow;
       7: aload_0
       8: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      11: getfield      #32                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      14: bipush        55
      16: iconst_0
      17: iconst_0
      18: invokevirtual #38                 // Method android/widget/PopupWindow.showAtLocation:(Landroid/view/View;III)V
      21: aload_0
      22: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      25: invokevirtual #41                 // Method android/support/v7/app/l.u:()V
      28: aload_0
      29: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      32: invokevirtual #45                 // Method android/support/v7/app/l.t:()Z
      35: ifeq          90
      38: aload_0
      39: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      42: getfield      #32                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      45: fconst_0
      46: invokevirtual #51                 // Method android/support/v7/widget/ActionBarContextView.setAlpha:(F)V
      49: aload_0
      50: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      53: aload_0
      54: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      57: getfield      #32                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      60: invokestatic  #57                 // Method android/support/v4/view/s.k:(Landroid/view/View;)Landroid/support/v4/view/x;
      63: fconst_1
      64: invokevirtual #62                 // Method android/support/v4/view/x.a:(F)Landroid/support/v4/view/x;
      67: putfield      #66                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      70: aload_0
      71: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      74: getfield      #66                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      77: new           #13                 // class android/support/v7/app/l$5$1
      80: dup
      81: aload_0
      82: invokespecial #69                 // Method android/support/v7/app/l$5$1."<init>":(Landroid/support/v7/app/l$5;)V
      85: invokevirtual #72                 // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
      88: pop
      89: return
      90: aload_0
      91: getfield      #19                 // Field a:Landroid/support/v7/app/l;
      94: getfield      #32                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      97: fconst_1
      98: invokevirtual #51                 // Method android/support/v7/widget/ActionBarContextView.setAlpha:(F)V
     101: aload_0
     102: getfield      #19                 // Field a:Landroid/support/v7/app/l;
     105: getfield      #32                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
     108: iconst_0
     109: invokevirtual #76                 // Method android/support/v7/widget/ActionBarContextView.setVisibility:(I)V
     112: return
}
