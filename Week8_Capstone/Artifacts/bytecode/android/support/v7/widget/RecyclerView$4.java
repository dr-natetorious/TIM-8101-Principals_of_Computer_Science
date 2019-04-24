class android.support.v7.widget.RecyclerView$4 implements android.support.v7.widget.bw$b {
  final android.support.v7.widget.RecyclerView a;

  android.support.v7.widget.RecyclerView$4(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: getfield      #23                 // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
       7: aload_1
       8: getfield      #28                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      11: aload_0
      12: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      15: getfield      #32                 // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
      18: invokevirtual #37                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/view/View;Landroid/support/v7/widget/RecyclerView$p;)V
      21: return

  public void a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: getfield      #32                 // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
       7: aload_1
       8: invokevirtual #43                 // Method android/support/v7/widget/RecyclerView$p.c:(Landroid/support/v7/widget/RecyclerView$x;)V
      11: aload_0
      12: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      15: aload_1
      16: aload_2
      17: aload_3
      18: invokevirtual #46                 // Method android/support/v7/widget/RecyclerView.b:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;Landroid/support/v7/widget/RecyclerView$f$c;)V
      21: return

  public void b(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aload_1
       5: aload_2
       6: aload_3
       7: invokevirtual #48                 // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;Landroid/support/v7/widget/RecyclerView$f$c;)V
      10: return

  public void c(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_1
       1: iconst_0
       2: invokevirtual #51                 // Method android/support/v7/widget/RecyclerView$x.a:(Z)V
       5: aload_0
       6: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
       9: getfield      #55                 // Field android/support/v7/widget/RecyclerView.w:Z
      12: ifeq          40
      15: aload_0
      16: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      19: getfield      #59                 // Field android/support/v7/widget/RecyclerView.y:Landroid/support/v7/widget/RecyclerView$f;
      22: aload_1
      23: aload_1
      24: aload_2
      25: aload_3
      26: invokevirtual #64                 // Method android/support/v7/widget/RecyclerView$f.a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;Landroid/support/v7/widget/RecyclerView$f$c;)Z
      29: ifeq          59
      32: aload_0
      33: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      36: invokevirtual #67                 // Method android/support/v7/widget/RecyclerView.p:()V
      39: return
      40: aload_0
      41: getfield      #14                 // Field a:Landroid/support/v7/widget/RecyclerView;
      44: getfield      #59                 // Field android/support/v7/widget/RecyclerView.y:Landroid/support/v7/widget/RecyclerView$f;
      47: aload_1
      48: aload_2
      49: aload_3
      50: invokevirtual #70                 // Method android/support/v7/widget/RecyclerView$f.c:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;Landroid/support/v7/widget/RecyclerView$f$c;)Z
      53: ifeq          59
      56: goto          32
      59: return
}
