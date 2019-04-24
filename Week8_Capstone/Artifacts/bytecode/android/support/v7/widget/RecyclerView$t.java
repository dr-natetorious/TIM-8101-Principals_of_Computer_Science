public abstract class android.support.v7.widget.RecyclerView$t {
  static void a(android.support.v7.widget.RecyclerView$t, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #77                 // Method a:(II)V
       6: return

  public int a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
       4: aload_1
       5: invokevirtual #79                 // Method android/support/v7/widget/RecyclerView.g:(Landroid/view/View;)I
       8: ireturn

  protected final void a();
    Code:
       0: aload_0
       1: getfield      #27                 // Field e:Z
       4: ifne          8
       7: return
       8: aload_0
       9: iconst_0
      10: putfield      #27                 // Field e:Z
      13: aload_0
      14: invokevirtual #81                 // Method e:()V
      17: aload_0
      18: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      21: getfield      #43                 // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      24: iconst_m1
      25: invokestatic  #86                 // Method android/support/v7/widget/RecyclerView$u.a:(Landroid/support/v7/widget/RecyclerView$u;I)I
      28: pop
      29: aload_0
      30: aconst_null
      31: putfield      #36                 // Field f:Landroid/view/View;
      34: aload_0
      35: iconst_m1
      36: putfield      #29                 // Field a:I
      39: aload_0
      40: iconst_0
      41: putfield      #34                 // Field d:Z
      44: aload_0
      45: getfield      #88                 // Field c:Landroid/support/v7/widget/RecyclerView$i;
      48: aload_0
      49: invokestatic  #93                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/support/v7/widget/RecyclerView$i;Landroid/support/v7/widget/RecyclerView$t;)V
      52: aload_0
      53: aconst_null
      54: putfield      #88                 // Field c:Landroid/support/v7/widget/RecyclerView$i;
      57: aload_0
      58: aconst_null
      59: putfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      62: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #29                 // Field a:I
       5: return

  protected abstract void a(int, int, android.support.v7.widget.RecyclerView$u, android.support.v7.widget.RecyclerView$t$a);

  protected abstract void a(android.view.View, android.support.v7.widget.RecyclerView$u, android.support.v7.widget.RecyclerView$t$a);

  protected void b(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #39                 // Method a:(Landroid/view/View;)I
       5: aload_0
       6: invokevirtual #98                 // Method d:()I
       9: if_icmpne     17
      12: aload_0
      13: aload_1
      14: putfield      #36                 // Field f:Landroid/view/View;
      17: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #34                 // Field d:Z
       4: ireturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #27                 // Field e:Z
       4: ireturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:I
       4: ireturn

  protected abstract void e();
}
