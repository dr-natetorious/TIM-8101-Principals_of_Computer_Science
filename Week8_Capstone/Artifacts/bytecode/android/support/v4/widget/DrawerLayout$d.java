public class android.support.v4.widget.DrawerLayout$d extends android.view.ViewGroup$MarginLayoutParams {
  public int a;

  float b;

  boolean c;

  int d;

  public android.support.v4.widget.DrawerLayout$d(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #17                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(II)V
       6: aload_0
       7: iconst_0
       8: putfield      #19                 // Field a:I
      11: return

  public android.support.v4.widget.DrawerLayout$d(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #23                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: putfield      #19                 // Field a:I
      11: aload_1
      12: aload_2
      13: getstatic     #26                 // Field android/support/v4/widget/DrawerLayout.a:[I
      16: invokevirtual #32                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      19: astore_1
      20: aload_0
      21: aload_1
      22: iconst_0
      23: iconst_0
      24: invokevirtual #38                 // Method android/content/res/TypedArray.getInt:(II)I
      27: putfield      #19                 // Field a:I
      30: aload_1
      31: invokevirtual #42                 // Method android/content/res/TypedArray.recycle:()V
      34: return

  public android.support.v4.widget.DrawerLayout$d(android.support.v4.widget.DrawerLayout$d);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #46                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #19                 // Field a:I
      10: aload_0
      11: aload_1
      12: getfield      #19                 // Field a:I
      15: putfield      #19                 // Field a:I
      18: return

  public android.support.v4.widget.DrawerLayout$d(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #49                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #19                 // Field a:I
      10: return

  public android.support.v4.widget.DrawerLayout$d(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #46                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #19                 // Field a:I
      10: return
}
