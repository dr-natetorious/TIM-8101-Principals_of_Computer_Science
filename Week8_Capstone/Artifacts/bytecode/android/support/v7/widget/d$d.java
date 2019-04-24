class android.support.v7.widget.d$d extends android.support.v7.widget.r implements android.support.v7.widget.ActionMenuView$a {
  final android.support.v7.widget.d a;

  public android.support.v7.widget.d$d(android.support.v7.widget.d, android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/v7/widget/d;
       5: aload_0
       6: aload_2
       7: aconst_null
       8: getstatic     #25                 // Field android/support/v7/a/a$a.actionOverflowButtonStyle:I
      11: invokespecial #28                 // Method android/support/v7/widget/r."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      14: aload_0
      15: iconst_2
      16: newarray       float
      18: putfield      #30                 // Field b:[F
      21: aload_0
      22: iconst_1
      23: invokevirtual #34                 // Method setClickable:(Z)V
      26: aload_0
      27: iconst_1
      28: invokevirtual #37                 // Method setFocusable:(Z)V
      31: aload_0
      32: iconst_0
      33: invokevirtual #41                 // Method setVisibility:(I)V
      36: aload_0
      37: iconst_1
      38: invokevirtual #44                 // Method setEnabled:(Z)V
      41: aload_0
      42: aload_0
      43: invokevirtual #48                 // Method getContentDescription:()Ljava/lang/CharSequence;
      46: invokestatic  #53                 // Method android/support/v7/widget/br.a:(Landroid/view/View;Ljava/lang/CharSequence;)V
      49: aload_0
      50: new           #11                 // class android/support/v7/widget/d$d$1
      53: dup
      54: aload_0
      55: aload_0
      56: aload_1
      57: invokespecial #56                 // Method android/support/v7/widget/d$d$1."<init>":(Landroid/support/v7/widget/d$d;Landroid/view/View;Landroid/support/v7/widget/d;)V
      60: invokevirtual #60                 // Method setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
      63: return

  public boolean c();
    Code:
       0: iconst_0
       1: ireturn

  public boolean d();
    Code:
       0: iconst_0
       1: ireturn

  public boolean performClick();
    Code:
       0: aload_0
       1: invokespecial #66                 // Method android/support/v7/widget/r.performClick:()Z
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: iconst_0
      11: invokevirtual #69                 // Method playSoundEffect:(I)V
      14: aload_0
      15: getfield      #19                 // Field a:Landroid/support/v7/widget/d;
      18: invokevirtual #72                 // Method android/support/v7/widget/d.f:()Z
      21: pop
      22: iconst_1
      23: ireturn

  protected boolean setFrame(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #76                 // Method android/support/v7/widget/r.setFrame:(IIII)Z
       9: istore        8
      11: aload_0
      12: invokevirtual #80                 // Method getDrawable:()Landroid/graphics/drawable/Drawable;
      15: astore        9
      17: aload_0
      18: invokevirtual #83                 // Method getBackground:()Landroid/graphics/drawable/Drawable;
      21: astore        10
      23: aload         9
      25: ifnull        116
      28: aload         10
      30: ifnull        116
      33: aload_0
      34: invokevirtual #87                 // Method getWidth:()I
      37: istore        5
      39: aload_0
      40: invokevirtual #90                 // Method getHeight:()I
      43: istore_2
      44: iload         5
      46: iload_2
      47: invokestatic  #96                 // Method java/lang/Math.max:(II)I
      50: iconst_2
      51: idiv
      52: istore_1
      53: aload_0
      54: invokevirtual #99                 // Method getPaddingLeft:()I
      57: istore        6
      59: aload_0
      60: invokevirtual #102                // Method getPaddingRight:()I
      63: istore        7
      65: aload_0
      66: invokevirtual #105                // Method getPaddingTop:()I
      69: istore_3
      70: aload_0
      71: invokevirtual #108                // Method getPaddingBottom:()I
      74: istore        4
      76: iload         5
      78: iload         6
      80: iload         7
      82: isub
      83: iadd
      84: iconst_2
      85: idiv
      86: istore        5
      88: iload_2
      89: iload_3
      90: iload         4
      92: isub
      93: iadd
      94: iconst_2
      95: idiv
      96: istore_2
      97: aload         10
      99: iload         5
     101: iload_1
     102: isub
     103: iload_2
     104: iload_1
     105: isub
     106: iload         5
     108: iload_1
     109: iadd
     110: iload_2
     111: iload_1
     112: iadd
     113: invokestatic  #113                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;IIII)V
     116: iload         8
     118: ireturn
}
