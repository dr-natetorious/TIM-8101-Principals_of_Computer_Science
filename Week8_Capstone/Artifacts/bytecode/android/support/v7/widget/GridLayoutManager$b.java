public class android.support.v7.widget.GridLayoutManager$b extends android.support.v7.widget.RecyclerView$j {
  int a;

  int b;

  public android.support.v7.widget.GridLayoutManager$b(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #13                 // Method android/support/v7/widget/RecyclerView$j."<init>":(II)V
       6: aload_0
       7: iconst_m1
       8: putfield      #15                 // Field a:I
      11: aload_0
      12: iconst_0
      13: putfield      #17                 // Field b:I
      16: return

  public android.support.v7.widget.GridLayoutManager$b(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #21                 // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_m1
       8: putfield      #15                 // Field a:I
      11: aload_0
      12: iconst_0
      13: putfield      #17                 // Field b:I
      16: return

  public android.support.v7.widget.GridLayoutManager$b(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #24                 // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_m1
       7: putfield      #15                 // Field a:I
      10: aload_0
      11: iconst_0
      12: putfield      #17                 // Field b:I
      15: return

  public android.support.v7.widget.GridLayoutManager$b(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #27                 // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: iconst_m1
       7: putfield      #15                 // Field a:I
      10: aload_0
      11: iconst_0
      12: putfield      #17                 // Field b:I
      15: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:I
       4: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:I
       4: ireturn
}
