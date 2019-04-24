public class android.support.v7.widget.RecyclerView$j extends android.view.ViewGroup$MarginLayoutParams {
  android.support.v7.widget.RecyclerView$x c;

  final android.graphics.Rect d;

  boolean e;

  boolean f;

  public android.support.v7.widget.RecyclerView$j(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #18                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(II)V
       6: aload_0
       7: new           #20                 // class android/graphics/Rect
      10: dup
      11: invokespecial #23                 // Method android/graphics/Rect."<init>":()V
      14: putfield      #25                 // Field d:Landroid/graphics/Rect;
      17: aload_0
      18: iconst_1
      19: putfield      #27                 // Field e:Z
      22: aload_0
      23: iconst_0
      24: putfield      #29                 // Field f:Z
      27: return

  public android.support.v7.widget.RecyclerView$j(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #33                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: new           #20                 // class android/graphics/Rect
      10: dup
      11: invokespecial #23                 // Method android/graphics/Rect."<init>":()V
      14: putfield      #25                 // Field d:Landroid/graphics/Rect;
      17: aload_0
      18: iconst_1
      19: putfield      #27                 // Field e:Z
      22: aload_0
      23: iconst_0
      24: putfield      #29                 // Field f:Z
      27: return

  public android.support.v7.widget.RecyclerView$j(android.support.v7.widget.RecyclerView$j);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #37                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: new           #20                 // class android/graphics/Rect
       9: dup
      10: invokespecial #23                 // Method android/graphics/Rect."<init>":()V
      13: putfield      #25                 // Field d:Landroid/graphics/Rect;
      16: aload_0
      17: iconst_1
      18: putfield      #27                 // Field e:Z
      21: aload_0
      22: iconst_0
      23: putfield      #29                 // Field f:Z
      26: return

  public android.support.v7.widget.RecyclerView$j(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #37                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: new           #20                 // class android/graphics/Rect
       9: dup
      10: invokespecial #23                 // Method android/graphics/Rect."<init>":()V
      13: putfield      #25                 // Field d:Landroid/graphics/Rect;
      16: aload_0
      17: iconst_1
      18: putfield      #27                 // Field e:Z
      21: aload_0
      22: iconst_0
      23: putfield      #29                 // Field f:Z
      26: return

  public android.support.v7.widget.RecyclerView$j(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: new           #20                 // class android/graphics/Rect
       9: dup
      10: invokespecial #23                 // Method android/graphics/Rect."<init>":()V
      13: putfield      #25                 // Field d:Landroid/graphics/Rect;
      16: aload_0
      17: iconst_1
      18: putfield      #27                 // Field e:Z
      21: aload_0
      22: iconst_0
      23: putfield      #29                 // Field f:Z
      26: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #43                 // Field c:Landroid/support/v7/widget/RecyclerView$x;
       4: invokevirtual #48                 // Method android/support/v7/widget/RecyclerView$x.n:()Z
       7: ireturn

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #43                 // Field c:Landroid/support/v7/widget/RecyclerView$x;
       4: invokevirtual #51                 // Method android/support/v7/widget/RecyclerView$x.q:()Z
       7: ireturn

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #43                 // Field c:Landroid/support/v7/widget/RecyclerView$x;
       4: invokevirtual #54                 // Method android/support/v7/widget/RecyclerView$x.x:()Z
       7: ireturn

  public int f();
    Code:
       0: aload_0
       1: getfield      #43                 // Field c:Landroid/support/v7/widget/RecyclerView$x;
       4: invokevirtual #57                 // Method android/support/v7/widget/RecyclerView$x.d:()I
       7: ireturn
}
