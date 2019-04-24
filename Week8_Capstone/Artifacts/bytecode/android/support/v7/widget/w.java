public class android.support.v7.widget.w extends android.widget.RatingBar {
  public android.support.v7.widget.w(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #14                 // Field android/support/v7/a/a$a.ratingBarStyle:I
       6: invokespecial #17                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.v7.widget.w(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #19                 // Method android/widget/RatingBar."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #21                 // class android/support/v7/widget/u
      11: dup
      12: aload_0
      13: invokespecial #24                 // Method android/support/v7/widget/u."<init>":(Landroid/widget/ProgressBar;)V
      16: putfield      #26                 // Field a:Landroid/support/v7/widget/u;
      19: aload_0
      20: getfield      #26                 // Field a:Landroid/support/v7/widget/u;
      23: aload_2
      24: iload_3
      25: invokevirtual #29                 // Method android/support/v7/widget/u.a:(Landroid/util/AttributeSet;I)V
      28: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: iload_1
       4: iload_2
       5: invokespecial #33                 // Method android/widget/RatingBar.onMeasure:(II)V
       8: aload_0
       9: getfield      #26                 // Field a:Landroid/support/v7/widget/u;
      12: invokevirtual #36                 // Method android/support/v7/widget/u.a:()Landroid/graphics/Bitmap;
      15: astore_3
      16: aload_3
      17: ifnull        42
      20: aload_0
      21: aload_3
      22: invokevirtual #42                 // Method android/graphics/Bitmap.getWidth:()I
      25: aload_0
      26: invokevirtual #45                 // Method getNumStars:()I
      29: imul
      30: iload_1
      31: iconst_0
      32: invokestatic  #51                 // Method android/view/View.resolveSizeAndState:(III)I
      35: aload_0
      36: invokevirtual #54                 // Method getMeasuredHeight:()I
      39: invokevirtual #57                 // Method setMeasuredDimension:(II)V
      42: aload_0
      43: monitorexit
      44: return
      45: astore_3
      46: aload_0
      47: monitorexit
      48: aload_3
      49: athrow
    Exception table:
       from    to  target type
           2    16    45   any
          20    42    45   any
}
