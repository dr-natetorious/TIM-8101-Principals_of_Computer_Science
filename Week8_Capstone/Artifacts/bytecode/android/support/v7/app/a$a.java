public class android.support.v7.app.a$a extends android.view.ViewGroup$MarginLayoutParams {
  public int a;

  public android.support.v7.app.a$a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #12                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(II)V
       6: aload_0
       7: iconst_0
       8: putfield      #14                 // Field a:I
      11: aload_0
      12: ldc           #15                 // int 8388627
      14: putfield      #14                 // Field a:I
      17: return

  public android.support.v7.app.a$a(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #19                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: putfield      #14                 // Field a:I
      11: aload_1
      12: aload_2
      13: getstatic     #25                 // Field android/support/v7/a/a$j.ActionBarLayout:[I
      16: invokevirtual #31                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      19: astore_1
      20: aload_0
      21: aload_1
      22: getstatic     #34                 // Field android/support/v7/a/a$j.ActionBarLayout_android_layout_gravity:I
      25: iconst_0
      26: invokevirtual #40                 // Method android/content/res/TypedArray.getInt:(II)I
      29: putfield      #14                 // Field a:I
      32: aload_1
      33: invokevirtual #44                 // Method android/content/res/TypedArray.recycle:()V
      36: return

  public android.support.v7.app.a$a(android.support.v7.app.a$a);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #48                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #14                 // Field a:I
      10: aload_0
      11: aload_1
      12: getfield      #14                 // Field a:I
      15: putfield      #14                 // Field a:I
      18: return

  public android.support.v7.app.a$a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #51                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #14                 // Field a:I
      10: return
}
