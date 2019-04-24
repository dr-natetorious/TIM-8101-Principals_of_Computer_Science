public class android.support.v7.widget.ActivityChooserView$InnerLayout extends android.widget.LinearLayout {
  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #12                 // int 16842964
       7: iastore
       8: putstatic     #14                 // Field a:[I
      11: return

  public android.support.v7.widget.ActivityChooserView$InnerLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #19                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_1
       7: aload_2
       8: getstatic     #14                 // Field a:[I
      11: invokestatic  #24                 // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroid/support/v7/widget/bp;
      14: astore_1
      15: aload_0
      16: aload_1
      17: iconst_0
      18: invokevirtual #27                 // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
      21: invokevirtual #31                 // Method setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
      24: aload_1
      25: invokevirtual #33                 // Method android/support/v7/widget/bp.a:()V
      28: return
}
