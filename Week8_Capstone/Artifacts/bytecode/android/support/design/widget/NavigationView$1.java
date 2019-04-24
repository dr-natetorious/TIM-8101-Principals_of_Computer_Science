class android.support.design.widget.NavigationView$1 implements android.support.v7.view.menu.h$a {
  final android.support.design.widget.NavigationView a;

  android.support.design.widget.NavigationView$1(android.support.design.widget.NavigationView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/design/widget/NavigationView;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: return

  public boolean a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/design/widget/NavigationView;
       4: getfield      #26                 // Field android/support/design/widget/NavigationView.c:Landroid/support/design/widget/NavigationView$a;
       7: ifnull        28
      10: aload_0
      11: getfield      #16                 // Field a:Landroid/support/design/widget/NavigationView;
      14: getfield      #26                 // Field android/support/design/widget/NavigationView.c:Landroid/support/design/widget/NavigationView$a;
      17: aload_2
      18: invokeinterface #31,  2           // InterfaceMethod android/support/design/widget/NavigationView$a.a:(Landroid/view/MenuItem;)Z
      23: ifeq          28
      26: iconst_1
      27: ireturn
      28: iconst_0
      29: ireturn
}
