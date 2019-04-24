class android.support.v7.widget.d$a extends android.support.v7.view.menu.n {
  final android.support.v7.widget.d a;

  public android.support.v7.widget.d$a(android.support.v7.widget.d, android.content.Context, android.support.v7.view.menu.u, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v7/widget/d;
       5: aload_0
       6: aload_2
       7: aload_3
       8: aload         4
      10: iconst_0
      11: getstatic     #18                 // Field android/support/v7/a/a$a.actionOverflowMenuStyle:I
      14: invokespecial #21                 // Method android/support/v7/view/menu/n."<init>":(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;ZI)V
      17: aload_3
      18: invokevirtual #27                 // Method android/support/v7/view/menu/u.getItem:()Landroid/view/MenuItem;
      21: checkcast     #29                 // class android/support/v7/view/menu/j
      24: invokevirtual #33                 // Method android/support/v7/view/menu/j.j:()Z
      27: ifne          58
      30: aload_1
      31: getfield      #37                 // Field android/support/v7/widget/d.g:Landroid/support/v7/widget/d$d;
      34: ifnonnull     48
      37: aload_1
      38: invokestatic  #41                 // Method android/support/v7/widget/d.c:(Landroid/support/v7/widget/d;)Landroid/support/v7/view/menu/p;
      41: checkcast     #43                 // class android/view/View
      44: astore_2
      45: goto          53
      48: aload_1
      49: getfield      #37                 // Field android/support/v7/widget/d.g:Landroid/support/v7/widget/d$d;
      52: astore_2
      53: aload_0
      54: aload_2
      55: invokevirtual #46                 // Method a:(Landroid/view/View;)V
      58: aload_0
      59: aload_1
      60: getfield      #50                 // Field android/support/v7/widget/d.k:Landroid/support/v7/widget/d$f;
      63: invokevirtual #53                 // Method a:(Landroid/support/v7/view/menu/o$a;)V
      66: return

  protected void e();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/widget/d;
       4: aconst_null
       5: putfield      #60                 // Field android/support/v7/widget/d.i:Landroid/support/v7/widget/d$a;
       8: aload_0
       9: getfield      #12                 // Field a:Landroid/support/v7/widget/d;
      12: iconst_0
      13: putfield      #63                 // Field android/support/v7/widget/d.l:I
      16: aload_0
      17: invokespecial #65                 // Method android/support/v7/view/menu/n.e:()V
      20: return
}
