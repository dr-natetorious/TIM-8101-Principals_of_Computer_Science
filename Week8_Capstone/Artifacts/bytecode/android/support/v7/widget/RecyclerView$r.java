class android.support.v7.widget.RecyclerView$r extends android.support.v7.widget.RecyclerView$c {
  final android.support.v7.widget.RecyclerView a;

  android.support.v7.widget.RecyclerView$r(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #16                 // Method android/support/v7/widget/RecyclerView$c."<init>":()V
       9: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aconst_null
       5: invokevirtual #20                 // Method android/support/v7/widget/RecyclerView.a:(Ljava/lang/String;)V
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #24                 // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      15: iconst_1
      16: putfield      #30                 // Field android/support/v7/widget/RecyclerView$u.e:Z
      19: aload_0
      20: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      23: iconst_1
      24: invokevirtual #34                 // Method android/support/v7/widget/RecyclerView.c:(Z)V
      27: aload_0
      28: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      31: getfield      #37                 // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
      34: invokevirtual #43                 // Method android/support/v7/widget/f.d:()Z
      37: ifne          47
      40: aload_0
      41: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      44: invokevirtual #46                 // Method android/support/v7/widget/RecyclerView.requestLayout:()V
      47: return

  public void a(int, int, int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aconst_null
       5: invokevirtual #20                 // Method android/support/v7/widget/RecyclerView.a:(Ljava/lang/String;)V
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #37                 // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
      15: iload_1
      16: iload_2
      17: iload_3
      18: invokevirtual #50                 // Method android/support/v7/widget/f.a:(III)Z
      21: ifeq          28
      24: aload_0
      25: invokevirtual #53                 // Method b:()V
      28: return

  public void a(int, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aconst_null
       5: invokevirtual #20                 // Method android/support/v7/widget/RecyclerView.a:(Ljava/lang/String;)V
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #37                 // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
      15: iload_1
      16: iload_2
      17: aload_3
      18: invokevirtual #57                 // Method android/support/v7/widget/f.a:(IILjava/lang/Object;)Z
      21: ifeq          28
      24: aload_0
      25: invokevirtual #53                 // Method b:()V
      28: return

  void b();
    Code:
       0: getstatic     #59                 // Field android/support/v7/widget/RecyclerView.c:Z
       3: ifeq          41
       6: aload_0
       7: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      10: getfield      #62                 // Field android/support/v7/widget/RecyclerView.q:Z
      13: ifeq          41
      16: aload_0
      17: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      20: getfield      #65                 // Field android/support/v7/widget/RecyclerView.p:Z
      23: ifeq          41
      26: aload_0
      27: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      30: aload_0
      31: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      34: getfield      #69                 // Field android/support/v7/widget/RecyclerView.i:Ljava/lang/Runnable;
      37: invokestatic  #74                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
      40: return
      41: aload_0
      42: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      45: iconst_1
      46: putfield      #77                 // Field android/support/v7/widget/RecyclerView.v:Z
      49: aload_0
      50: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      53: invokevirtual #46                 // Method android/support/v7/widget/RecyclerView.requestLayout:()V
      56: return

  public void b(int, int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aconst_null
       5: invokevirtual #20                 // Method android/support/v7/widget/RecyclerView.a:(Ljava/lang/String;)V
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #37                 // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
      15: iload_1
      16: iload_2
      17: invokevirtual #81                 // Method android/support/v7/widget/f.b:(II)Z
      20: ifeq          27
      23: aload_0
      24: invokevirtual #53                 // Method b:()V
      27: return

  public void c(int, int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aconst_null
       5: invokevirtual #20                 // Method android/support/v7/widget/RecyclerView.a:(Ljava/lang/String;)V
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #37                 // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
      15: iload_1
      16: iload_2
      17: invokevirtual #83                 // Method android/support/v7/widget/f.c:(II)Z
      20: ifeq          27
      23: aload_0
      24: invokevirtual #53                 // Method b:()V
      27: return
}
