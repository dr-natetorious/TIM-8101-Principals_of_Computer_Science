public class android.support.v7.widget.StaggeredGridLayoutManager$b extends android.support.v7.widget.RecyclerView$j {
  android.support.v7.widget.StaggeredGridLayoutManager$e a;

  boolean b;

  public android.support.v7.widget.StaggeredGridLayoutManager$b(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #14                 // Method android/support/v7/widget/RecyclerView$j."<init>":(II)V
       6: return

  public android.support.v7.widget.StaggeredGridLayoutManager$b(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #18                 // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.StaggeredGridLayoutManager$b(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #21                 // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: return

  public android.support.v7.widget.StaggeredGridLayoutManager$b(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #24                 // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Z
       4: ireturn

  public final int b();
    Code:
       0: aload_0
       1: getfield      #30                 // Field a:Landroid/support/v7/widget/StaggeredGridLayoutManager$e;
       4: ifnonnull     9
       7: iconst_m1
       8: ireturn
       9: aload_0
      10: getfield      #30                 // Field a:Landroid/support/v7/widget/StaggeredGridLayoutManager$e;
      13: getfield      #36                 // Field android/support/v7/widget/StaggeredGridLayoutManager$e.e:I
      16: ireturn
}
