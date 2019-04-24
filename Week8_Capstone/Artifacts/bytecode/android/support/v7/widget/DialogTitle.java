public class android.support.v7.widget.DialogTitle extends android.widget.TextView {
  public android.support.v7.widget.DialogTitle(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #8                  // Method android/widget/TextView."<init>":(Landroid/content/Context;)V
       5: return

  public android.support.v7.widget.DialogTitle(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #12                 // Method android/widget/TextView."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.DialogTitle(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #15                 // Method android/widget/TextView."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #19                 // Method android/widget/TextView.onMeasure:(II)V
       6: aload_0
       7: invokevirtual #23                 // Method getLayout:()Landroid/text/Layout;
      10: astore        4
      12: aload         4
      14: ifnull        97
      17: aload         4
      19: invokevirtual #29                 // Method android/text/Layout.getLineCount:()I
      22: istore_3
      23: iload_3
      24: ifle          97
      27: aload         4
      29: iload_3
      30: iconst_1
      31: isub
      32: invokevirtual #33                 // Method android/text/Layout.getEllipsisCount:(I)I
      35: ifle          97
      38: aload_0
      39: iconst_0
      40: invokevirtual #37                 // Method setSingleLine:(Z)V
      43: aload_0
      44: iconst_2
      45: invokevirtual #41                 // Method setMaxLines:(I)V
      48: aload_0
      49: invokevirtual #45                 // Method getContext:()Landroid/content/Context;
      52: aconst_null
      53: getstatic     #51                 // Field android/support/v7/a/a$j.TextAppearance:[I
      56: ldc           #52                 // int 16842817
      58: ldc           #53                 // int 16973892
      60: invokevirtual #59                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      63: astore        4
      65: aload         4
      67: getstatic     #63                 // Field android/support/v7/a/a$j.TextAppearance_android_textSize:I
      70: iconst_0
      71: invokevirtual #69                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      74: istore_3
      75: iload_3
      76: ifeq          86
      79: aload_0
      80: iconst_0
      81: iload_3
      82: i2f
      83: invokevirtual #73                 // Method setTextSize:(IF)V
      86: aload         4
      88: invokevirtual #77                 // Method android/content/res/TypedArray.recycle:()V
      91: aload_0
      92: iload_1
      93: iload_2
      94: invokespecial #19                 // Method android/widget/TextView.onMeasure:(II)V
      97: return
}
