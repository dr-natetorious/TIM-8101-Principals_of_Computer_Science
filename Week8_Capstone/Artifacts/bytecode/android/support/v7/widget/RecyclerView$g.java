class android.support.v7.widget.RecyclerView$g implements android.support.v7.widget.RecyclerView$f$b {
  final android.support.v7.widget.RecyclerView a;

  android.support.v7.widget.RecyclerView$g(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: iconst_1
       2: invokevirtual #25                 // Method android/support/v7/widget/RecyclerView$x.a:(Z)V
       5: aload_1
       6: getfield      #29                 // Field android/support/v7/widget/RecyclerView$x.h:Landroid/support/v7/widget/RecyclerView$x;
       9: ifnull        24
      12: aload_1
      13: getfield      #32                 // Field android/support/v7/widget/RecyclerView$x.i:Landroid/support/v7/widget/RecyclerView$x;
      16: ifnonnull     24
      19: aload_1
      20: aconst_null
      21: putfield      #29                 // Field android/support/v7/widget/RecyclerView$x.h:Landroid/support/v7/widget/RecyclerView$x;
      24: aload_1
      25: aconst_null
      26: putfield      #32                 // Field android/support/v7/widget/RecyclerView$x.i:Landroid/support/v7/widget/RecyclerView$x;
      29: aload_1
      30: invokestatic  #36                 // Method android/support/v7/widget/RecyclerView$x.c:(Landroid/support/v7/widget/RecyclerView$x;)Z
      33: ifne          69
      36: aload_0
      37: getfield      #15                 // Field a:Landroid/support/v7/widget/RecyclerView;
      40: aload_1
      41: getfield      #39                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      44: invokevirtual #42                 // Method android/support/v7/widget/RecyclerView.a:(Landroid/view/View;)Z
      47: ifne          69
      50: aload_1
      51: invokevirtual #46                 // Method android/support/v7/widget/RecyclerView$x.r:()Z
      54: ifeq          69
      57: aload_0
      58: getfield      #15                 // Field a:Landroid/support/v7/widget/RecyclerView;
      61: aload_1
      62: getfield      #39                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      65: iconst_0
      66: invokevirtual #50                 // Method android/support/v7/widget/RecyclerView.removeDetachedView:(Landroid/view/View;Z)V
      69: return
}
