public class android.support.design.widget.AppBarLayout$a extends android.widget.LinearLayout$LayoutParams {
  int a;

  android.view.animation.Interpolator b;

  public android.support.design.widget.AppBarLayout$a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #14                 // Method android/widget/LinearLayout$LayoutParams."<init>":(II)V
       6: aload_0
       7: iconst_1
       8: putfield      #16                 // Field a:I
      11: return

  public android.support.design.widget.AppBarLayout$a(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #20                 // Method android/widget/LinearLayout$LayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_1
       8: putfield      #16                 // Field a:I
      11: aload_1
      12: aload_2
      13: getstatic     #26                 // Field android/support/design/a$j.AppBarLayout_Layout:[I
      16: invokevirtual #32                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      19: astore_2
      20: aload_0
      21: aload_2
      22: getstatic     #35                 // Field android/support/design/a$j.AppBarLayout_Layout_layout_scrollFlags:I
      25: iconst_0
      26: invokevirtual #41                 // Method android/content/res/TypedArray.getInt:(II)I
      29: putfield      #16                 // Field a:I
      32: aload_2
      33: getstatic     #44                 // Field android/support/design/a$j.AppBarLayout_Layout_layout_scrollInterpolator:I
      36: invokevirtual #48                 // Method android/content/res/TypedArray.hasValue:(I)Z
      39: ifeq          58
      42: aload_0
      43: aload_1
      44: aload_2
      45: getstatic     #44                 // Field android/support/design/a$j.AppBarLayout_Layout_layout_scrollInterpolator:I
      48: iconst_0
      49: invokevirtual #51                 // Method android/content/res/TypedArray.getResourceId:(II)I
      52: invokestatic  #57                 // Method android/view/animation/AnimationUtils.loadInterpolator:(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
      55: putfield      #59                 // Field b:Landroid/view/animation/Interpolator;
      58: aload_2
      59: invokevirtual #63                 // Method android/content/res/TypedArray.recycle:()V
      62: return

  public android.support.design.widget.AppBarLayout$a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #66                 // Method android/widget/LinearLayout$LayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_1
       7: putfield      #16                 // Field a:I
      10: return

  public android.support.design.widget.AppBarLayout$a(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #69                 // Method android/widget/LinearLayout$LayoutParams."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: iconst_1
       7: putfield      #16                 // Field a:I
      10: return

  public android.support.design.widget.AppBarLayout$a(android.widget.LinearLayout$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #72                 // Method android/widget/LinearLayout$LayoutParams."<init>":(Landroid/widget/LinearLayout$LayoutParams;)V
       5: aload_0
       6: iconst_1
       7: putfield      #16                 // Field a:I
      10: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:I
       4: ireturn

  public android.view.animation.Interpolator b();
    Code:
       0: aload_0
       1: getfield      #59                 // Field b:Landroid/view/animation/Interpolator;
       4: areturn

  boolean c();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:I
       4: iconst_1
       5: iand
       6: iconst_1
       7: if_icmpne     22
      10: aload_0
      11: getfield      #16                 // Field a:I
      14: bipush        10
      16: iand
      17: ifeq          22
      20: iconst_1
      21: ireturn
      22: iconst_0
      23: ireturn
}
