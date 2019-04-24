class android.support.v7.widget.d$e extends android.support.v7.view.menu.n {
  final android.support.v7.widget.d a;

  public android.support.v7.widget.d$e(android.support.v7.widget.d, android.content.Context, android.support.v7.view.menu.h, android.view.View, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v7/widget/d;
       5: aload_0
       6: aload_2
       7: aload_3
       8: aload         4
      10: iload         5
      12: getstatic     #19                 // Field android/support/v7/a/a$a.actionOverflowMenuStyle:I
      15: invokespecial #22                 // Method android/support/v7/view/menu/n."<init>":(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;ZI)V
      18: aload_0
      19: ldc           #23                 // int 8388613
      21: invokevirtual #26                 // Method a:(I)V
      24: aload_0
      25: aload_1
      26: getfield      #30                 // Field android/support/v7/widget/d.k:Landroid/support/v7/widget/d$f;
      29: invokevirtual #33                 // Method a:(Landroid/support/v7/view/menu/o$a;)V
      32: return

  protected void e();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/d;
       4: invokestatic  #38                 // Method android/support/v7/widget/d.a:(Landroid/support/v7/widget/d;)Landroid/support/v7/view/menu/h;
       7: ifnull        20
      10: aload_0
      11: getfield      #13                 // Field a:Landroid/support/v7/widget/d;
      14: invokestatic  #41                 // Method android/support/v7/widget/d.b:(Landroid/support/v7/widget/d;)Landroid/support/v7/view/menu/h;
      17: invokevirtual #46                 // Method android/support/v7/view/menu/h.close:()V
      20: aload_0
      21: getfield      #13                 // Field a:Landroid/support/v7/widget/d;
      24: aconst_null
      25: putfield      #50                 // Field android/support/v7/widget/d.h:Landroid/support/v7/widget/d$e;
      28: aload_0
      29: invokespecial #52                 // Method android/support/v7/view/menu/n.e:()V
      32: return
}
