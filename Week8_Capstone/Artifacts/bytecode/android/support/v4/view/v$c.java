public class android.support.v4.view.v$c extends android.view.ViewGroup$LayoutParams {
  public boolean a;

  public int b;

  float c;

  boolean d;

  int e;

  int f;

  public android.support.v4.view.v$c();
    Code:
       0: aload_0
       1: iconst_m1
       2: iconst_m1
       3: invokespecial #20                 // Method android/view/ViewGroup$LayoutParams."<init>":(II)V
       6: aload_0
       7: fconst_0
       8: putfield      #22                 // Field c:F
      11: return

  public android.support.v4.view.v$c(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #26                 // Method android/view/ViewGroup$LayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: fconst_0
       8: putfield      #22                 // Field c:F
      11: aload_1
      12: aload_2
      13: getstatic     #30                 // Field android/support/v4/view/v.LAYOUT_ATTRS:[I
      16: invokevirtual #36                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      19: astore_1
      20: aload_0
      21: aload_1
      22: iconst_0
      23: bipush        48
      25: invokevirtual #42                 // Method android/content/res/TypedArray.getInteger:(II)I
      28: putfield      #44                 // Field b:I
      31: aload_1
      32: invokevirtual #47                 // Method android/content/res/TypedArray.recycle:()V
      35: return
}
