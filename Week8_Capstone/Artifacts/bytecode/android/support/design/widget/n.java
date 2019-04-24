class android.support.design.widget.n<V extends android.view.View> extends android.support.design.widget.CoordinatorLayout$b<V> {
  public android.support.design.widget.n();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/support/design/widget/CoordinatorLayout$b."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #16                 // Field b:I
       9: aload_0
      10: iconst_0
      11: putfield      #18                 // Field c:I
      14: return

  public android.support.design.widget.n(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #22                 // Method android/support/design/widget/CoordinatorLayout$b."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: putfield      #16                 // Field b:I
      11: aload_0
      12: iconst_0
      13: putfield      #18                 // Field c:I
      16: return

  public boolean a(int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/design/widget/o;
       4: ifnull        16
       7: aload_0
       8: getfield      #25                 // Field a:Landroid/support/design/widget/o;
      11: iload_1
      12: invokevirtual #29                 // Method android/support/design/widget/o.a:(I)Z
      15: ireturn
      16: aload_0
      17: iload_1
      18: putfield      #16                 // Field b:I
      21: iconst_0
      22: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, V, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokevirtual #33                 // Method b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)V
       7: aload_0
       8: getfield      #25                 // Field a:Landroid/support/design/widget/o;
      11: ifnonnull     26
      14: aload_0
      15: new           #27                 // class android/support/design/widget/o
      18: dup
      19: aload_2
      20: invokespecial #36                 // Method android/support/design/widget/o."<init>":(Landroid/view/View;)V
      23: putfield      #25                 // Field a:Landroid/support/design/widget/o;
      26: aload_0
      27: getfield      #25                 // Field a:Landroid/support/design/widget/o;
      30: invokevirtual #38                 // Method android/support/design/widget/o.a:()V
      33: aload_0
      34: getfield      #16                 // Field b:I
      37: ifeq          57
      40: aload_0
      41: getfield      #25                 // Field a:Landroid/support/design/widget/o;
      44: aload_0
      45: getfield      #16                 // Field b:I
      48: invokevirtual #29                 // Method android/support/design/widget/o.a:(I)Z
      51: pop
      52: aload_0
      53: iconst_0
      54: putfield      #16                 // Field b:I
      57: aload_0
      58: getfield      #18                 // Field c:I
      61: ifeq          81
      64: aload_0
      65: getfield      #25                 // Field a:Landroid/support/design/widget/o;
      68: aload_0
      69: getfield      #18                 // Field c:I
      72: invokevirtual #40                 // Method android/support/design/widget/o.b:(I)Z
      75: pop
      76: aload_0
      77: iconst_0
      78: putfield      #18                 // Field c:I
      81: iconst_1
      82: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/design/widget/o;
       4: ifnull        15
       7: aload_0
       8: getfield      #25                 // Field a:Landroid/support/design/widget/o;
      11: invokevirtual #45                 // Method android/support/design/widget/o.b:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  protected void b(android.support.design.widget.CoordinatorLayout, V, int);
    Code:
       0: aload_1
       1: aload_2
       2: iload_3
       3: invokevirtual #50                 // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;I)V
       6: return
}
