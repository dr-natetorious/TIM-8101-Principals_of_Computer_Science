class android.support.design.internal.c$1 implements android.view.View$OnClickListener {
  final android.support.design.internal.c a;

  android.support.design.internal.c$1(android.support.design.internal.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/design/internal/c;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_1
       1: checkcast     #22                 // class android/support/design/internal/NavigationMenuItemView
       4: astore_1
       5: aload_0
       6: getfield      #14                 // Field a:Landroid/support/design/internal/c;
       9: iconst_1
      10: invokevirtual #26                 // Method android/support/design/internal/c.b:(Z)V
      13: aload_1
      14: invokevirtual #30                 // Method android/support/design/internal/NavigationMenuItemView.getItemData:()Landroid/support/v7/view/menu/j;
      17: astore_1
      18: aload_0
      19: getfield      #14                 // Field a:Landroid/support/design/internal/c;
      22: getfield      #33                 // Field android/support/design/internal/c.b:Landroid/support/v7/view/menu/h;
      25: aload_1
      26: aload_0
      27: getfield      #14                 // Field a:Landroid/support/design/internal/c;
      30: iconst_0
      31: invokevirtual #38                 // Method android/support/v7/view/menu/h.a:(Landroid/view/MenuItem;Landroid/support/v7/view/menu/o;I)Z
      34: istore_2
      35: aload_1
      36: ifnull        61
      39: aload_1
      40: invokevirtual #44                 // Method android/support/v7/view/menu/j.isCheckable:()Z
      43: ifeq          61
      46: iload_2
      47: ifeq          61
      50: aload_0
      51: getfield      #14                 // Field a:Landroid/support/design/internal/c;
      54: getfield      #48                 // Field android/support/design/internal/c.c:Landroid/support/design/internal/c$b;
      57: aload_1
      58: invokevirtual #53                 // Method android/support/design/internal/c$b.a:(Landroid/support/v7/view/menu/j;)V
      61: aload_0
      62: getfield      #14                 // Field a:Landroid/support/design/internal/c;
      65: iconst_0
      66: invokevirtual #26                 // Method android/support/design/internal/c.b:(Z)V
      69: aload_0
      70: getfield      #14                 // Field a:Landroid/support/design/internal/c;
      73: iconst_0
      74: invokevirtual #55                 // Method android/support/design/internal/c.a:(Z)V
      77: return
}
