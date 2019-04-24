public class android.support.v7.widget.bb$a extends android.support.v4.view.b {
  final android.support.v7.widget.bb a;

  public android.support.v7.widget.bb$a(android.support.v7.widget.bb);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/support/v4/view/b."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/support/v7/widget/bb;
       9: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #19                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
       6: aload_0
       7: getfield      #15                 // Field a:Landroid/support/v7/widget/bb;
      10: invokevirtual #23                 // Method android/support/v7/widget/bb.b:()Z
      13: ifne          44
      16: aload_0
      17: getfield      #15                 // Field a:Landroid/support/v7/widget/bb;
      20: getfield      #26                 // Field android/support/v7/widget/bb.a:Landroid/support/v7/widget/RecyclerView;
      23: invokevirtual #32                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      26: ifnull        44
      29: aload_0
      30: getfield      #15                 // Field a:Landroid/support/v7/widget/bb;
      33: getfield      #26                 // Field android/support/v7/widget/bb.a:Landroid/support/v7/widget/RecyclerView;
      36: invokevirtual #32                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      39: aload_1
      40: aload_2
      41: invokevirtual #35                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
      44: return

  public boolean a(android.view.View, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokespecial #38                 // Method android/support/v4/view/b.a:(Landroid/view/View;ILandroid/os/Bundle;)Z
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: aload_0
      13: getfield      #15                 // Field a:Landroid/support/v7/widget/bb;
      16: invokevirtual #23                 // Method android/support/v7/widget/bb.b:()Z
      19: ifne          52
      22: aload_0
      23: getfield      #15                 // Field a:Landroid/support/v7/widget/bb;
      26: getfield      #26                 // Field android/support/v7/widget/bb.a:Landroid/support/v7/widget/RecyclerView;
      29: invokevirtual #32                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      32: ifnull        52
      35: aload_0
      36: getfield      #15                 // Field a:Landroid/support/v7/widget/bb;
      39: getfield      #26                 // Field android/support/v7/widget/bb.a:Landroid/support/v7/widget/RecyclerView;
      42: invokevirtual #32                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      45: aload_1
      46: iload_2
      47: aload_3
      48: invokevirtual #39                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/view/View;ILandroid/os/Bundle;)Z
      51: ireturn
      52: iconst_0
      53: ireturn
}
