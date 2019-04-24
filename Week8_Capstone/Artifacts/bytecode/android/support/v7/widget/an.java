public class android.support.v7.widget.an extends android.support.v7.widget.RecyclerView$h {
  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #15                 // int 16843284
       7: iastore
       8: putstatic     #17                 // Field a:[I
      11: return

  public android.support.v7.widget.an(android.content.Context, int);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method android/support/v7/widget/RecyclerView$h."<init>":()V
       4: aload_0
       5: new           #24                 // class android/graphics/Rect
       8: dup
       9: invokespecial #25                 // Method android/graphics/Rect."<init>":()V
      12: putfield      #27                 // Field d:Landroid/graphics/Rect;
      15: aload_1
      16: getstatic     #17                 // Field a:[I
      19: invokevirtual #33                 // Method android/content/Context.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
      22: astore_1
      23: aload_0
      24: aload_1
      25: iconst_0
      26: invokevirtual #39                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      29: putfield      #41                 // Field b:Landroid/graphics/drawable/Drawable;
      32: aload_0
      33: getfield      #41                 // Field b:Landroid/graphics/drawable/Drawable;
      36: ifnonnull     47
      39: ldc           #43                 // String DividerItem
      41: ldc           #45                 // String @android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()
      43: invokestatic  #51                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      46: pop
      47: aload_1
      48: invokevirtual #54                 // Method android/content/res/TypedArray.recycle:()V
      51: aload_0
      52: iload_2
      53: invokevirtual #57                 // Method a:(I)V
      56: return

  public void a(int);
    Code:
       0: iload_1
       1: ifeq          19
       4: iload_1
       5: iconst_1
       6: if_icmpeq     19
       9: new           #151                // class java/lang/IllegalArgumentException
      12: dup
      13: ldc           #153                // String Invalid orientation. It should be either HORIZONTAL or VERTICAL
      15: invokespecial #156                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      18: athrow
      19: aload_0
      20: iload_1
      21: putfield      #158                // Field c:I
      24: return

  public void a(android.graphics.Canvas, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_2
       1: invokevirtual #137                // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
       4: ifnull        36
       7: aload_0
       8: getfield      #41                 // Field b:Landroid/graphics/drawable/Drawable;
      11: ifnonnull     15
      14: return
      15: aload_0
      16: getfield      #158                // Field c:I
      19: iconst_1
      20: if_icmpne     30
      23: aload_0
      24: aload_1
      25: aload_2
      26: invokespecial #161                // Method c:(Landroid/graphics/Canvas;Landroid/support/v7/widget/RecyclerView;)V
      29: return
      30: aload_0
      31: aload_1
      32: aload_2
      33: invokespecial #163                // Method d:(Landroid/graphics/Canvas;Landroid/support/v7/widget/RecyclerView;)V
      36: return

  public void a(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnonnull     16
       7: aload_1
       8: iconst_0
       9: iconst_0
      10: iconst_0
      11: iconst_0
      12: invokevirtual #167                // Method android/graphics/Rect.set:(IIII)V
      15: return
      16: aload_0
      17: getfield      #158                // Field c:I
      20: iconst_1
      21: if_icmpne     39
      24: aload_1
      25: iconst_0
      26: iconst_0
      27: iconst_0
      28: aload_0
      29: getfield      #41                 // Field b:Landroid/graphics/drawable/Drawable;
      32: invokevirtual #122                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
      35: invokevirtual #167                // Method android/graphics/Rect.set:(IIII)V
      38: return
      39: aload_1
      40: iconst_0
      41: iconst_0
      42: aload_0
      43: getfield      #41                 // Field b:Landroid/graphics/drawable/Drawable;
      46: invokevirtual #149                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
      49: iconst_0
      50: invokevirtual #167                // Method android/graphics/Rect.set:(IIII)V
      53: return
}
