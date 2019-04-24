class android.support.v7.app.l$b$1 extends android.support.v4.view.z {
  final android.support.v7.app.l$b a;

  android.support.v7.app.l$b$1(android.support.v7.app.l$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/app/l$b;
       5: aload_0
       6: invokespecial #20                 // Method android/support/v4/view/z."<init>":()V
       9: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
       4: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
       7: getfield      #29                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      10: bipush        8
      12: invokevirtual #35                 // Method android/support/v7/widget/ActionBarContextView.setVisibility:(I)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
      19: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
      22: getfield      #39                 // Field android/support/v7/app/l.o:Landroid/widget/PopupWindow;
      25: ifnull        44
      28: aload_0
      29: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
      32: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
      35: getfield      #39                 // Field android/support/v7/app/l.o:Landroid/widget/PopupWindow;
      38: invokevirtual #44                 // Method android/widget/PopupWindow.dismiss:()V
      41: goto          82
      44: aload_0
      45: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
      48: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
      51: getfield      #29                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      54: invokevirtual #48                 // Method android/support/v7/widget/ActionBarContextView.getParent:()Landroid/view/ViewParent;
      57: instanceof    #50                 // class android/view/View
      60: ifeq          82
      63: aload_0
      64: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
      67: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
      70: getfield      #29                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      73: invokevirtual #48                 // Method android/support/v7/widget/ActionBarContextView.getParent:()Landroid/view/ViewParent;
      76: checkcast     #50                 // class android/view/View
      79: invokestatic  #54                 // Method android/support/v4/view/s.o:(Landroid/view/View;)V
      82: aload_0
      83: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
      86: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
      89: getfield      #29                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      92: invokevirtual #57                 // Method android/support/v7/widget/ActionBarContextView.removeAllViews:()V
      95: aload_0
      96: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
      99: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
     102: getfield      #61                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
     105: aconst_null
     106: invokevirtual #66                 // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
     109: pop
     110: aload_0
     111: getfield      #17                 // Field a:Landroid/support/v7/app/l$b;
     114: getfield      #25                 // Field android/support/v7/app/l$b.a:Landroid/support/v7/app/l;
     117: aconst_null
     118: putfield      #61                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
     121: return
}
