public final class android.support.design.widget.Snackbar$SnackbarLayout extends android.support.design.widget.b$f {
  public android.support.design.widget.Snackbar$SnackbarLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method android/support/design/widget/b$f."<init>":(Landroid/content/Context;)V
       5: return

  public android.support.design.widget.Snackbar$SnackbarLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #15                 // Method android/support/design/widget/b$f."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #19                 // Method android/support/design/widget/b$f.onMeasure:(II)V
       6: aload_0
       7: invokevirtual #23                 // Method getChildCount:()I
      10: istore_2
      11: aload_0
      12: invokevirtual #26                 // Method getMeasuredWidth:()I
      15: istore_3
      16: aload_0
      17: invokevirtual #29                 // Method getPaddingLeft:()I
      20: istore        4
      22: aload_0
      23: invokevirtual #32                 // Method getPaddingRight:()I
      26: istore        5
      28: iconst_0
      29: istore_1
      30: iload_1
      31: iload_2
      32: if_icmpge     88
      35: aload_0
      36: iload_1
      37: invokevirtual #36                 // Method getChildAt:(I)Landroid/view/View;
      40: astore        6
      42: aload         6
      44: invokevirtual #42                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      47: getfield      #48                 // Field android/view/ViewGroup$LayoutParams.width:I
      50: iconst_m1
      51: if_icmpne     81
      54: aload         6
      56: iload_3
      57: iload         4
      59: isub
      60: iload         5
      62: isub
      63: ldc           #49                 // int 1073741824
      65: invokestatic  #55                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      68: aload         6
      70: invokevirtual #58                 // Method android/view/View.getMeasuredHeight:()I
      73: ldc           #49                 // int 1073741824
      75: invokestatic  #55                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      78: invokevirtual #61                 // Method android/view/View.measure:(II)V
      81: iload_1
      82: iconst_1
      83: iadd
      84: istore_1
      85: goto          30
      88: return
}
