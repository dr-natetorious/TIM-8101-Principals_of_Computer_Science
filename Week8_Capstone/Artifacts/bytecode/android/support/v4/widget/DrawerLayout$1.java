class android.support.v4.widget.DrawerLayout$1 implements android.view.View$OnApplyWindowInsetsListener {
  final android.support.v4.widget.DrawerLayout a;

  android.support.v4.widget.DrawerLayout$1(android.support.v4.widget.DrawerLayout);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public android.view.WindowInsets onApplyWindowInsets(android.view.View, android.view.WindowInsets);
    Code:
       0: aload_1
       1: checkcast     #8                  // class android/support/v4/widget/DrawerLayout
       4: astore_1
       5: aload_2
       6: invokevirtual #31                 // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
       9: ifle          17
      12: iconst_1
      13: istore_3
      14: goto          19
      17: iconst_0
      18: istore_3
      19: aload_1
      20: aload_2
      21: iload_3
      22: invokevirtual #34                 // Method android/support/v4/widget/DrawerLayout.a:(Ljava/lang/Object;Z)V
      25: aload_2
      26: invokevirtual #38                 // Method android/view/WindowInsets.consumeSystemWindowInsets:()Landroid/view/WindowInsets;
      29: areturn
}
