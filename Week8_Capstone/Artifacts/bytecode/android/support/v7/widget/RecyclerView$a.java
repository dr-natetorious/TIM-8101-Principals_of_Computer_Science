public abstract class android.support.v7.widget.RecyclerView$a<VH extends android.support.v7.widget.RecyclerView$x> {
  public android.support.v7.widget.RecyclerView$a();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #17                 // class android/support/v7/widget/RecyclerView$b
       8: dup
       9: invokespecial #18                 // Method android/support/v7/widget/RecyclerView$b."<init>":()V
      12: putfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
      15: aload_0
      16: iconst_0
      17: putfield      #22                 // Field b:Z
      20: return

  public abstract int a();

  public long a(int);
    Code:
       0: ldc2_w        #26                 // long -1l
       3: lreturn

  public final void a(int, int);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
       4: iload_1
       5: iload_2
       6: invokevirtual #31                 // Method android/support/v7/widget/RecyclerView$b.c:(II)V
       9: return

  public final void a(int, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
       4: iload_1
       5: iload_2
       6: aload_3
       7: invokevirtual #34                 // Method android/support/v7/widget/RecyclerView$b.a:(IILjava/lang/Object;)V
      10: return

  public void a(android.support.v7.widget.RecyclerView$c);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
       4: aload_1
       5: invokevirtual #39                 // Method android/support/v7/widget/RecyclerView$b.registerObserver:(Ljava/lang/Object;)V
       8: return

  public void a(VH);
    Code:
       0: return

  public abstract void a(VH, int);

  public void a(VH, int, java.util.List<java.lang.Object>);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokevirtual #46                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;I)V
       6: return

  public void a(android.support.v7.widget.RecyclerView);
    Code:
       0: return

  public int b(int);
    Code:
       0: iconst_0
       1: ireturn

  public abstract VH b(android.view.ViewGroup, int);

  public final void b(int, int);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
       4: iload_1
       5: iload_2
       6: invokevirtual #52                 // Method android/support/v7/widget/RecyclerView$b.a:(II)V
       9: return

  public void b(android.support.v7.widget.RecyclerView$c);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
       4: aload_1
       5: invokevirtual #55                 // Method android/support/v7/widget/RecyclerView$b.unregisterObserver:(Ljava/lang/Object;)V
       8: return

  public final void b(VH, int);
    Code:
       0: aload_1
       1: iload_2
       2: putfield      #60                 // Field android/support/v7/widget/RecyclerView$x.c:I
       5: aload_0
       6: invokevirtual #64                 // Method d:()Z
       9: ifeq          21
      12: aload_1
      13: aload_0
      14: iload_2
      15: invokevirtual #66                 // Method a:(I)J
      18: putfield      #70                 // Field android/support/v7/widget/RecyclerView$x.e:J
      21: aload_1
      22: iconst_1
      23: sipush        519
      26: invokevirtual #71                 // Method android/support/v7/widget/RecyclerView$x.a:(II)V
      29: ldc           #73                 // String RV OnBindView
      31: invokestatic  #78                 // Method android/support/v4/e/d.a:(Ljava/lang/String;)V
      34: aload_0
      35: aload_1
      36: iload_2
      37: aload_1
      38: invokevirtual #82                 // Method android/support/v7/widget/RecyclerView$x.u:()Ljava/util/List;
      41: invokevirtual #84                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;ILjava/util/List;)V
      44: aload_1
      45: invokevirtual #87                 // Method android/support/v7/widget/RecyclerView$x.t:()V
      48: aload_1
      49: getfield      #90                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      52: invokevirtual #96                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      55: astore_1
      56: aload_1
      57: instanceof    #98                 // class android/support/v7/widget/RecyclerView$j
      60: ifeq          71
      63: aload_1
      64: checkcast     #98                 // class android/support/v7/widget/RecyclerView$j
      67: iconst_1
      68: putfield      #100                // Field android/support/v7/widget/RecyclerView$j.e:Z
      71: invokestatic  #102                // Method android/support/v4/e/d.a:()V
      74: return

  public void b(android.support.v7.widget.RecyclerView);
    Code:
       0: return

  public boolean b(VH);
    Code:
       0: iconst_0
       1: ireturn

  public final VH c(android.view.ViewGroup, int);
    Code:
       0: ldc           #107                // String RV CreateView
       2: invokestatic  #78                 // Method android/support/v4/e/d.a:(Ljava/lang/String;)V
       5: aload_0
       6: aload_1
       7: iload_2
       8: invokevirtual #109                // Method b:(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$x;
      11: astore_1
      12: aload_1
      13: getfield      #90                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      16: invokevirtual #113                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      19: ifnull        32
      22: new           #115                // class java/lang/IllegalStateException
      25: dup
      26: ldc           #117                // String ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)
      28: invokespecial #119                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      31: athrow
      32: aload_1
      33: iload_2
      34: putfield      #122                // Field android/support/v7/widget/RecyclerView$x.f:I
      37: invokestatic  #102                // Method android/support/v4/e/d.a:()V
      40: aload_1
      41: areturn
      42: astore_1
      43: invokestatic  #102                // Method android/support/v4/e/d.a:()V
      46: aload_1
      47: athrow
    Exception table:
       from    to  target type
           0    32    42   any
          32    37    42   any

  public final void c(int, int);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
       4: iload_1
       5: iload_2
       6: invokevirtual #125                // Method android/support/v7/widget/RecyclerView$b.b:(II)V
       9: return

  public void c(VH);
    Code:
       0: return

  public void d(VH);
    Code:
       0: return

  public final boolean d();
    Code:
       0: aload_0
       1: getfield      #22                 // Field b:Z
       4: ireturn

  public final void e();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/RecyclerView$b;
       4: invokevirtual #126                // Method android/support/v7/widget/RecyclerView$b.a:()V
       7: return
}
