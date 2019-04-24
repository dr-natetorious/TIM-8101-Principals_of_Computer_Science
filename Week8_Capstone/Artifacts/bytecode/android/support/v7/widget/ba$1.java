final class android.support.v7.widget.ba$1 extends android.support.v7.widget.ba {
  android.support.v7.widget.ba$1(android.support.v7.widget.RecyclerView$i);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #12                 // Method android/support/v7/widget/ba."<init>":(Landroid/support/v7/widget/RecyclerView$i;Landroid/support/v7/widget/ba$1;)V
       6: return

  public int a(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #20                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/v7/widget/RecyclerView$j
       7: astore_2
       8: aload_0
       9: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      12: aload_1
      13: invokevirtual #30                 // Method android/support/v7/widget/RecyclerView$i.h:(Landroid/view/View;)I
      16: aload_2
      17: getfield      #34                 // Field android/support/v7/widget/RecyclerView$j.leftMargin:I
      20: isub
      21: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: iload_1
       5: invokevirtual #38                 // Method android/support/v7/widget/RecyclerView$i.i:(I)V
       8: return

  public int b(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #20                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/v7/widget/RecyclerView$j
       7: astore_2
       8: aload_0
       9: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      12: aload_1
      13: invokevirtual #42                 // Method android/support/v7/widget/RecyclerView$i.j:(Landroid/view/View;)I
      16: aload_2
      17: getfield      #45                 // Field android/support/v7/widget/RecyclerView$j.rightMargin:I
      20: iadd
      21: ireturn

  public int c();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #50                 // Method android/support/v7/widget/RecyclerView$i.A:()I
       7: ireturn

  public int c(android.view.View);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: aload_1
       5: iconst_1
       6: aload_0
       7: getfield      #53                 // Field b:Landroid/graphics/Rect;
      10: invokevirtual #56                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/view/View;ZLandroid/graphics/Rect;)V
      13: aload_0
      14: getfield      #53                 // Field b:Landroid/graphics/Rect;
      17: getfield      #61                 // Field android/graphics/Rect.right:I
      20: ireturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #65                 // Method android/support/v7/widget/RecyclerView$i.y:()I
       7: aload_0
       8: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      11: invokevirtual #68                 // Method android/support/v7/widget/RecyclerView$i.C:()I
      14: isub
      15: ireturn

  public int d(android.view.View);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: aload_1
       5: iconst_1
       6: aload_0
       7: getfield      #53                 // Field b:Landroid/graphics/Rect;
      10: invokevirtual #56                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/view/View;ZLandroid/graphics/Rect;)V
      13: aload_0
      14: getfield      #53                 // Field b:Landroid/graphics/Rect;
      17: getfield      #71                 // Field android/graphics/Rect.left:I
      20: ireturn

  public int e();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #65                 // Method android/support/v7/widget/RecyclerView$i.y:()I
       7: ireturn

  public int e(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #20                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/v7/widget/RecyclerView$j
       7: astore_2
       8: aload_0
       9: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      12: aload_1
      13: invokevirtual #75                 // Method android/support/v7/widget/RecyclerView$i.f:(Landroid/view/View;)I
      16: aload_2
      17: getfield      #34                 // Field android/support/v7/widget/RecyclerView$j.leftMargin:I
      20: iadd
      21: aload_2
      22: getfield      #45                 // Field android/support/v7/widget/RecyclerView$j.rightMargin:I
      25: iadd
      26: ireturn

  public int f();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #65                 // Method android/support/v7/widget/RecyclerView$i.y:()I
       7: aload_0
       8: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      11: invokevirtual #50                 // Method android/support/v7/widget/RecyclerView$i.A:()I
      14: isub
      15: aload_0
      16: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      19: invokevirtual #68                 // Method android/support/v7/widget/RecyclerView$i.C:()I
      22: isub
      23: ireturn

  public int f(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #20                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/v7/widget/RecyclerView$j
       7: astore_2
       8: aload_0
       9: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
      12: aload_1
      13: invokevirtual #78                 // Method android/support/v7/widget/RecyclerView$i.g:(Landroid/view/View;)I
      16: aload_2
      17: getfield      #81                 // Field android/support/v7/widget/RecyclerView$j.topMargin:I
      20: iadd
      21: aload_2
      22: getfield      #84                 // Field android/support/v7/widget/RecyclerView$j.bottomMargin:I
      25: iadd
      26: ireturn

  public int g();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #68                 // Method android/support/v7/widget/RecyclerView$i.C:()I
       7: ireturn

  public int h();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #87                 // Method android/support/v7/widget/RecyclerView$i.w:()I
       7: ireturn

  public int i();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/widget/RecyclerView$i;
       4: invokevirtual #90                 // Method android/support/v7/widget/RecyclerView$i.x:()I
       7: ireturn
}
