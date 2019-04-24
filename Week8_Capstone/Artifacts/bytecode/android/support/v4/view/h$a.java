class android.support.v4.view.h$a extends android.support.v4.view.h$b {
  android.support.v4.view.h$a();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/view/h$b."<init>":()V
       4: return

  public void a(android.view.MenuItem, char, int);
    Code:
       0: aload_1
       1: iload_2
       2: iload_3
       3: invokeinterface #19,  3           // InterfaceMethod android/view/MenuItem.setAlphabeticShortcut:(CI)Landroid/view/MenuItem;
       8: pop
       9: return

  public void a(android.view.MenuItem, android.content.res.ColorStateList);
    Code:
       0: aload_1
       1: aload_2
       2: invokeinterface #24,  2           // InterfaceMethod android/view/MenuItem.setIconTintList:(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
       7: pop
       8: return

  public void a(android.view.MenuItem, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_1
       1: aload_2
       2: invokeinterface #29,  2           // InterfaceMethod android/view/MenuItem.setIconTintMode:(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
       7: pop
       8: return

  public void a(android.view.MenuItem, java.lang.CharSequence);
    Code:
       0: aload_1
       1: aload_2
       2: invokeinterface #34,  2           // InterfaceMethod android/view/MenuItem.setContentDescription:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
       7: pop
       8: return

  public void b(android.view.MenuItem, char, int);
    Code:
       0: aload_1
       1: iload_2
       2: iload_3
       3: invokeinterface #38,  3           // InterfaceMethod android/view/MenuItem.setNumericShortcut:(CI)Landroid/view/MenuItem;
       8: pop
       9: return

  public void b(android.view.MenuItem, java.lang.CharSequence);
    Code:
       0: aload_1
       1: aload_2
       2: invokeinterface #41,  2           // InterfaceMethod android/view/MenuItem.setTooltipText:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
       7: pop
       8: return
}
