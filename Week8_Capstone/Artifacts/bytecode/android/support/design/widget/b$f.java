class android.support.design.widget.b$f extends android.widget.FrameLayout {
  android.support.design.widget.b$f(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #16                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  android.support.design.widget.b$f(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #18                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_1
       7: aload_2
       8: getstatic     #24                 // Field android/support/design/a$j.SnackbarLayout:[I
      11: invokevirtual #30                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      14: astore_1
      15: aload_1
      16: getstatic     #34                 // Field android/support/design/a$j.SnackbarLayout_elevation:I
      19: invokevirtual #40                 // Method android/content/res/TypedArray.hasValue:(I)Z
      22: ifeq          38
      25: aload_0
      26: aload_1
      27: getstatic     #34                 // Field android/support/design/a$j.SnackbarLayout_elevation:I
      30: iconst_0
      31: invokevirtual #44                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      34: i2f
      35: invokestatic  #49                 // Method android/support/v4/view/s.a:(Landroid/view/View;F)V
      38: aload_1
      39: invokevirtual #53                 // Method android/content/res/TypedArray.recycle:()V
      42: aload_0
      43: iconst_1
      44: invokevirtual #57                 // Method setClickable:(Z)V
      47: return

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #60                 // Method android/widget/FrameLayout.onAttachedToWindow:()V
       4: aload_0
       5: getfield      #62                 // Field b:Landroid/support/design/widget/b$d;
       8: ifnull        21
      11: aload_0
      12: getfield      #62                 // Field b:Landroid/support/design/widget/b$d;
      15: aload_0
      16: invokeinterface #67,  2           // InterfaceMethod android/support/design/widget/b$d.a:(Landroid/view/View;)V
      21: aload_0
      22: invokestatic  #70                 // Method android/support/v4/view/s.o:(Landroid/view/View;)V
      25: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #73                 // Method android/widget/FrameLayout.onDetachedFromWindow:()V
       4: aload_0
       5: getfield      #62                 // Field b:Landroid/support/design/widget/b$d;
       8: ifnull        21
      11: aload_0
      12: getfield      #62                 // Field b:Landroid/support/design/widget/b$d;
      15: aload_0
      16: invokeinterface #75,  2           // InterfaceMethod android/support/design/widget/b$d.b:(Landroid/view/View;)V
      21: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #79                 // Method android/widget/FrameLayout.onLayout:(ZIIII)V
      11: aload_0
      12: getfield      #81                 // Field a:Landroid/support/design/widget/b$e;
      15: ifnull        34
      18: aload_0
      19: getfield      #81                 // Field a:Landroid/support/design/widget/b$e;
      22: aload_0
      23: iload_2
      24: iload_3
      25: iload         4
      27: iload         5
      29: invokeinterface #86,  6           // InterfaceMethod android/support/design/widget/b$e.a:(Landroid/view/View;IIII)V
      34: return

  void setOnAttachStateChangeListener(android.support.design.widget.b$d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #62                 // Field b:Landroid/support/design/widget/b$d;
       5: return

  void setOnLayoutChangeListener(android.support.design.widget.b$e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #81                 // Field a:Landroid/support/design/widget/b$e;
       5: return
}
