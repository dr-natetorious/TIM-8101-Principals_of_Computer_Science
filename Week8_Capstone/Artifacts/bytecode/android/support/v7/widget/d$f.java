class android.support.v7.widget.d$f implements android.support.v7.view.menu.o$a {
  final android.support.v7.widget.d a;

  android.support.v7.widget.d$f(android.support.v7.widget.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/widget/d;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_1
       1: instanceof    #22                 // class android/support/v7/view/menu/u
       4: ifeq          15
       7: aload_1
       8: invokevirtual #28                 // Method android/support/v7/view/menu/h.p:()Landroid/support/v7/view/menu/h;
      11: iconst_0
      12: invokevirtual #32                 // Method android/support/v7/view/menu/h.b:(Z)V
      15: aload_0
      16: getfield      #15                 // Field a:Landroid/support/v7/widget/d;
      19: invokevirtual #36                 // Method android/support/v7/widget/d.d:()Landroid/support/v7/view/menu/o$a;
      22: astore_3
      23: aload_3
      24: ifnull        35
      27: aload_3
      28: aload_1
      29: iload_2
      30: invokeinterface #38,  3           // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;Z)V
      35: return

  public boolean a(android.support.v7.view.menu.h);
    Code:
       0: iconst_0
       1: istore_2
       2: aload_1
       3: ifnonnull     8
       6: iconst_0
       7: ireturn
       8: aload_0
       9: getfield      #15                 // Field a:Landroid/support/v7/widget/d;
      12: aload_1
      13: checkcast     #22                 // class android/support/v7/view/menu/u
      16: invokevirtual #43                 // Method android/support/v7/view/menu/u.getItem:()Landroid/view/MenuItem;
      19: invokeinterface #49,  1           // InterfaceMethod android/view/MenuItem.getItemId:()I
      24: putfield      #53                 // Field android/support/v7/widget/d.l:I
      27: aload_0
      28: getfield      #15                 // Field a:Landroid/support/v7/widget/d;
      31: invokevirtual #36                 // Method android/support/v7/widget/d.d:()Landroid/support/v7/view/menu/o$a;
      34: astore_3
      35: aload_3
      36: ifnull        47
      39: aload_3
      40: aload_1
      41: invokeinterface #55,  2           // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;)Z
      46: istore_2
      47: iload_2
      48: ireturn
}
