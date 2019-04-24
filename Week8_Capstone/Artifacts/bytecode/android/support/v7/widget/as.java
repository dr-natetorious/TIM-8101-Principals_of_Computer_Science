public abstract class android.support.v7.widget.as implements android.view.View$OnAttachStateChangeListener,android.view.View$OnTouchListener {
  final android.view.View c;

  public android.support.v7.widget.as(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #32                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_2
       6: newarray       int
       8: putfield      #34                 // Field i:[I
      11: aload_0
      12: aload_1
      13: putfield      #36                 // Field c:Landroid/view/View;
      16: aload_1
      17: iconst_1
      18: invokevirtual #42                 // Method android/view/View.setLongClickable:(Z)V
      21: aload_1
      22: aload_0
      23: invokevirtual #46                 // Method android/view/View.addOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      26: aload_0
      27: aload_1
      28: invokevirtual #50                 // Method android/view/View.getContext:()Landroid/content/Context;
      31: invokestatic  #56                 // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
      34: invokevirtual #60                 // Method android/view/ViewConfiguration.getScaledTouchSlop:()I
      37: i2f
      38: putfield      #62                 // Field a:F
      41: aload_0
      42: invokestatic  #65                 // Method android/view/ViewConfiguration.getTapTimeout:()I
      45: putfield      #67                 // Field b:I
      48: aload_0
      49: aload_0
      50: getfield      #67                 // Field b:I
      53: invokestatic  #70                 // Method android/view/ViewConfiguration.getLongPressTimeout:()I
      56: iadd
      57: iconst_2
      58: idiv
      59: putfield      #72                 // Field d:I
      62: return

  public abstract android.support.v7.view.menu.s a();

  protected boolean b();
    Code:
       0: aload_0
       1: invokevirtual #149                // Method a:()Landroid/support/v7/view/menu/s;
       4: astore_1
       5: aload_1
       6: ifnull        24
       9: aload_1
      10: invokeinterface #153,  1          // InterfaceMethod android/support/v7/view/menu/s.f:()Z
      15: ifne          24
      18: aload_1
      19: invokeinterface #181,  1          // InterfaceMethod android/support/v7/view/menu/s.d:()V
      24: iconst_1
      25: ireturn

  protected boolean c();
    Code:
       0: aload_0
       1: invokevirtual #149                // Method a:()Landroid/support/v7/view/menu/s;
       4: astore_1
       5: aload_1
       6: ifnull        24
       9: aload_1
      10: invokeinterface #153,  1          // InterfaceMethod android/support/v7/view/menu/s.f:()Z
      15: ifeq          24
      18: aload_1
      19: invokeinterface #182,  1          // InterfaceMethod android/support/v7/view/menu/s.e:()V
      24: iconst_1
      25: ireturn

  void d();
    Code:
       0: aload_0
       1: invokespecial #101                // Method e:()V
       4: aload_0
       5: getfield      #36                 // Field c:Landroid/view/View;
       8: astore_3
       9: aload_3
      10: invokevirtual #78                 // Method android/view/View.isEnabled:()Z
      13: ifeq          74
      16: aload_3
      17: invokevirtual #185                // Method android/view/View.isLongClickable:()Z
      20: ifeq          24
      23: return
      24: aload_0
      25: invokevirtual #187                // Method b:()Z
      28: ifne          32
      31: return
      32: aload_3
      33: invokevirtual #105                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      36: iconst_1
      37: invokeinterface #110,  2          // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
      42: invokestatic  #193                // Method android/os/SystemClock.uptimeMillis:()J
      45: lstore_1
      46: lload_1
      47: lload_1
      48: iconst_3
      49: fconst_0
      50: fconst_0
      51: iconst_0
      52: invokestatic  #197                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
      55: astore        4
      57: aload_3
      58: aload         4
      60: invokevirtual #200                // Method android/view/View.onTouchEvent:(Landroid/view/MotionEvent;)Z
      63: pop
      64: aload         4
      66: invokevirtual #175                // Method android/view/MotionEvent.recycle:()V
      69: aload_0
      70: iconst_1
      71: putfield      #202                // Field g:Z
      74: return

  public boolean onTouch(android.view.View, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #202                // Field g:Z
       4: istore        6
       6: iconst_1
       7: istore        5
       9: iload         6
      11: ifeq          42
      14: aload_0
      15: aload_2
      16: invokespecial #205                // Method b:(Landroid/view/MotionEvent;)Z
      19: ifne          37
      22: aload_0
      23: invokevirtual #207                // Method c:()Z
      26: ifne          32
      29: goto          37
      32: iconst_0
      33: istore_3
      34: goto          107
      37: iconst_1
      38: istore_3
      39: goto          107
      42: aload_0
      43: aload_2
      44: invokespecial #209                // Method a:(Landroid/view/MotionEvent;)Z
      47: ifeq          63
      50: aload_0
      51: invokevirtual #187                // Method b:()Z
      54: ifeq          63
      57: iconst_1
      58: istore        4
      60: goto          66
      63: iconst_0
      64: istore        4
      66: iload         4
      68: istore_3
      69: iload         4
      71: ifeq          107
      74: invokestatic  #193                // Method android/os/SystemClock.uptimeMillis:()J
      77: lstore        7
      79: lload         7
      81: lload         7
      83: iconst_3
      84: fconst_0
      85: fconst_0
      86: iconst_0
      87: invokestatic  #197                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
      90: astore_1
      91: aload_0
      92: getfield      #36                 // Field c:Landroid/view/View;
      95: aload_1
      96: invokevirtual #200                // Method android/view/View.onTouchEvent:(Landroid/view/MotionEvent;)Z
      99: pop
     100: aload_1
     101: invokevirtual #175                // Method android/view/MotionEvent.recycle:()V
     104: iload         4
     106: istore_3
     107: aload_0
     108: iload_3
     109: putfield      #202                // Field g:Z
     112: iload         5
     114: istore        4
     116: iload_3
     117: ifne          130
     120: iload         6
     122: ifeq          127
     125: iconst_1
     126: ireturn
     127: iconst_0
     128: istore        4
     130: iload         4
     132: ireturn

  public void onViewAttachedToWindow(android.view.View);
    Code:
       0: return

  public void onViewDetachedFromWindow(android.view.View);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #202                // Field g:Z
       5: aload_0
       6: iconst_m1
       7: putfield      #85                 // Field h:I
      10: aload_0
      11: getfield      #115                // Field e:Ljava/lang/Runnable;
      14: ifnull        29
      17: aload_0
      18: getfield      #36                 // Field c:Landroid/view/View;
      21: aload_0
      22: getfield      #115                // Field e:Ljava/lang/Runnable;
      25: invokevirtual #179                // Method android/view/View.removeCallbacks:(Ljava/lang/Runnable;)Z
      28: pop
      29: return
}
