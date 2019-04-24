public class android.support.v7.widget.av$a extends android.view.ViewGroup$MarginLayoutParams {
  public float g;

  public int h;

  public android.support.v7.widget.av$a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #15                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(II)V
       6: aload_0
       7: iconst_m1
       8: putfield      #17                 // Field h:I
      11: aload_0
      12: fconst_0
      13: putfield      #19                 // Field g:F
      16: return

  public android.support.v7.widget.av$a(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #23                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_m1
       8: putfield      #17                 // Field h:I
      11: aload_1
      12: aload_2
      13: getstatic     #29                 // Field android/support/v7/a/a$j.LinearLayoutCompat_Layout:[I
      16: invokevirtual #35                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      19: astore_1
      20: aload_0
      21: aload_1
      22: getstatic     #38                 // Field android/support/v7/a/a$j.LinearLayoutCompat_Layout_android_layout_weight:I
      25: fconst_0
      26: invokevirtual #44                 // Method android/content/res/TypedArray.getFloat:(IF)F
      29: putfield      #19                 // Field g:F
      32: aload_0
      33: aload_1
      34: getstatic     #47                 // Field android/support/v7/a/a$j.LinearLayoutCompat_Layout_android_layout_gravity:I
      37: iconst_m1
      38: invokevirtual #51                 // Method android/content/res/TypedArray.getInt:(II)I
      41: putfield      #17                 // Field h:I
      44: aload_1
      45: invokevirtual #55                 // Method android/content/res/TypedArray.recycle:()V
      48: return

  public android.support.v7.widget.av$a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #58                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_m1
       7: putfield      #17                 // Field h:I
      10: return
}
