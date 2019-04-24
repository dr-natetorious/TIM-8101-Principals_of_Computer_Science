class android.support.v7.widget.bs implements android.view.View$OnAttachStateChangeListener,android.view.View$OnHoverListener,android.view.View$OnLongClickListener {
  static void a(android.support.v7.widget.bs);
    Code:
       0: aload_0
       1: invokespecial #89                 // Method a:()V
       4: return

  static void a(android.support.v7.widget.bs, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #93                 // Method a:(Z)V
       5: return

  public static void a(android.view.View, java.lang.CharSequence);
    Code:
       0: getstatic     #82                 // Field i:Landroid/support/v7/widget/bs;
       3: ifnull        20
       6: getstatic     #82                 // Field i:Landroid/support/v7/widget/bs;
       9: getfield      #46                 // Field a:Landroid/view/View;
      12: aload_0
      13: if_acmpne     20
      16: aconst_null
      17: invokestatic  #84                 // Method b:(Landroid/support/v7/widget/bs;)V
      20: aload_1
      21: invokestatic  #99                 // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      24: ifeq          65
      27: getstatic     #61                 // Field j:Landroid/support/v7/widget/bs;
      30: ifnull        49
      33: getstatic     #61                 // Field j:Landroid/support/v7/widget/bs;
      36: getfield      #46                 // Field a:Landroid/view/View;
      39: aload_0
      40: if_acmpne     49
      43: getstatic     #61                 // Field j:Landroid/support/v7/widget/bs;
      46: invokespecial #89                 // Method a:()V
      49: aload_0
      50: aconst_null
      51: invokevirtual #54                 // Method android/view/View.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
      54: aload_0
      55: iconst_0
      56: invokevirtual #102                // Method android/view/View.setLongClickable:(Z)V
      59: aload_0
      60: aconst_null
      61: invokevirtual #58                 // Method android/view/View.setOnHoverListener:(Landroid/view/View$OnHoverListener;)V
      64: return
      65: new           #2                  // class android/support/v7/widget/bs
      68: dup
      69: aload_0
      70: aload_1
      71: invokespecial #104                // Method "<init>":(Landroid/view/View;Ljava/lang/CharSequence;)V
      74: pop
      75: return

  public boolean onHover(android.view.View, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #63                 // Field g:Landroid/support/v7/widget/bt;
       4: ifnull        16
       7: aload_0
       8: getfield      #112                // Field h:Z
      11: ifeq          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #46                 // Field a:Landroid/view/View;
      20: invokevirtual #116                // Method android/view/View.getContext:()Landroid/content/Context;
      23: ldc           #157                // String accessibility
      25: invokevirtual #163                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      28: checkcast     #165                // class android/view/accessibility/AccessibilityManager
      31: astore_1
      32: aload_1
      33: invokevirtual #169                // Method android/view/accessibility/AccessibilityManager.isEnabled:()Z
      36: ifeq          48
      39: aload_1
      40: invokevirtual #172                // Method android/view/accessibility/AccessibilityManager.isTouchExplorationEnabled:()Z
      43: ifeq          48
      46: iconst_0
      47: ireturn
      48: aload_2
      49: invokevirtual #177                // Method android/view/MotionEvent.getAction:()I
      52: istore_3
      53: iload_3
      54: bipush        7
      56: if_icmpeq     73
      59: iload_3
      60: bipush        10
      62: if_icmpeq     67
      65: iconst_0
      66: ireturn
      67: aload_0
      68: invokespecial #89                 // Method a:()V
      71: iconst_0
      72: ireturn
      73: aload_0
      74: getfield      #46                 // Field a:Landroid/view/View;
      77: invokevirtual #178                // Method android/view/View.isEnabled:()Z
      80: ifeq          112
      83: aload_0
      84: getfield      #63                 // Field g:Landroid/support/v7/widget/bt;
      87: ifnonnull     112
      90: aload_0
      91: aload_2
      92: invokevirtual #182                // Method android/view/MotionEvent.getX:()F
      95: f2i
      96: putfield      #121                // Field e:I
      99: aload_0
     100: aload_2
     101: invokevirtual #185                // Method android/view/MotionEvent.getY:()F
     104: f2i
     105: putfield      #123                // Field f:I
     108: aload_0
     109: invokestatic  #84                 // Method b:(Landroid/support/v7/widget/bs;)V
     112: iconst_0
     113: ireturn

  public boolean onLongClick(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #189                // Method android/view/View.getWidth:()I
       5: iconst_2
       6: idiv
       7: putfield      #121                // Field e:I
      10: aload_0
      11: aload_1
      12: invokevirtual #192                // Method android/view/View.getHeight:()I
      15: iconst_2
      16: idiv
      17: putfield      #123                // Field f:I
      20: aload_0
      21: iconst_1
      22: invokespecial #93                 // Method a:(Z)V
      25: iconst_1
      26: ireturn

  public void onViewAttachedToWindow(android.view.View);
    Code:
       0: return

  public void onViewDetachedFromWindow(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #89                 // Method a:()V
       4: return
}
