class android.support.v7.widget.aw$d implements android.view.View$OnTouchListener {
  final android.support.v7.widget.aw a;

  android.support.v7.widget.aw$d(android.support.v7.widget.aw);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/widget/aw;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean onTouch(android.view.View, android.view.MotionEvent);
    Code:
       0: aload_2
       1: invokevirtual #27                 // Method android/view/MotionEvent.getAction:()I
       4: istore_3
       5: aload_2
       6: invokevirtual #31                 // Method android/view/MotionEvent.getX:()F
       9: f2i
      10: istore        4
      12: aload_2
      13: invokevirtual #34                 // Method android/view/MotionEvent.getY:()F
      16: f2i
      17: istore        5
      19: iload_3
      20: ifne          110
      23: aload_0
      24: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      27: getfield      #38                 // Field android/support/v7/widget/aw.g:Landroid/widget/PopupWindow;
      30: ifnull        110
      33: aload_0
      34: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      37: getfield      #38                 // Field android/support/v7/widget/aw.g:Landroid/widget/PopupWindow;
      40: invokevirtual #44                 // Method android/widget/PopupWindow.isShowing:()Z
      43: ifeq          110
      46: iload         4
      48: iflt          110
      51: iload         4
      53: aload_0
      54: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      57: getfield      #38                 // Field android/support/v7/widget/aw.g:Landroid/widget/PopupWindow;
      60: invokevirtual #47                 // Method android/widget/PopupWindow.getWidth:()I
      63: if_icmpge     110
      66: iload         5
      68: iflt          110
      71: iload         5
      73: aload_0
      74: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      77: getfield      #38                 // Field android/support/v7/widget/aw.g:Landroid/widget/PopupWindow;
      80: invokevirtual #50                 // Method android/widget/PopupWindow.getHeight:()I
      83: if_icmpge     110
      86: aload_0
      87: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      90: getfield      #54                 // Field android/support/v7/widget/aw.f:Landroid/os/Handler;
      93: aload_0
      94: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
      97: getfield      #58                 // Field android/support/v7/widget/aw.e:Landroid/support/v7/widget/aw$e;
     100: ldc2_w        #59                 // long 250l
     103: invokevirtual #66                 // Method android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
     106: pop
     107: goto          132
     110: iload_3
     111: iconst_1
     112: if_icmpne     132
     115: aload_0
     116: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
     119: getfield      #54                 // Field android/support/v7/widget/aw.f:Landroid/os/Handler;
     122: aload_0
     123: getfield      #15                 // Field a:Landroid/support/v7/widget/aw;
     126: getfield      #58                 // Field android/support/v7/widget/aw.e:Landroid/support/v7/widget/aw$e;
     129: invokevirtual #70                 // Method android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
     132: iconst_0
     133: ireturn
}
