public final class android.support.v4.view.h {
  static final android.support.v4.view.h$c a;

  static {};
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     21
       8: new           #6                  // class android/support/v4/view/h$a
      11: dup
      12: invokespecial #25                 // Method android/support/v4/view/h$a."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #27                 // Field a:Landroid/support/v4/view/h$c;
      20: return
      21: new           #9                  // class android/support/v4/view/h$b
      24: dup
      25: invokespecial #28                 // Method android/support/v4/view/h$b."<init>":()V
      28: astore_0
      29: goto          16

  public static android.view.MenuItem a(android.view.MenuItem, android.support.v4.view.c);
    Code:
       0: aload_0
       1: instanceof    #32                 // class android/support/v4/c/a/b
       4: ifeq          18
       7: aload_0
       8: checkcast     #32                 // class android/support/v4/c/a/b
      11: aload_1
      12: invokeinterface #35,  2           // InterfaceMethod android/support/v4/c/a/b.a:(Landroid/support/v4/view/c;)Landroid/support/v4/c/a/b;
      17: areturn
      18: ldc           #37                 // String MenuItemCompat
      20: ldc           #39                 // String setActionProvider: item does not implement SupportMenuItem; ignoring
      22: invokestatic  #45                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      25: pop
      26: aload_0
      27: areturn

  public static void a(android.view.MenuItem, char, int);
    Code:
       0: aload_0
       1: instanceof    #32                 // class android/support/v4/c/a/b
       4: ifeq          20
       7: aload_0
       8: checkcast     #32                 // class android/support/v4/c/a/b
      11: iload_1
      12: iload_2
      13: invokeinterface #50,  3           // InterfaceMethod android/support/v4/c/a/b.setNumericShortcut:(CI)Landroid/view/MenuItem;
      18: pop
      19: return
      20: getstatic     #27                 // Field a:Landroid/support/v4/view/h$c;
      23: aload_0
      24: iload_1
      25: iload_2
      26: invokeinterface #52,  4           // InterfaceMethod android/support/v4/view/h$c.b:(Landroid/view/MenuItem;CI)V
      31: return

  public static void a(android.view.MenuItem, android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: instanceof    #32                 // class android/support/v4/c/a/b
       4: ifeq          19
       7: aload_0
       8: checkcast     #32                 // class android/support/v4/c/a/b
      11: aload_1
      12: invokeinterface #57,  2           // InterfaceMethod android/support/v4/c/a/b.setIconTintList:(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
      17: pop
      18: return
      19: getstatic     #27                 // Field a:Landroid/support/v4/view/h$c;
      22: aload_0
      23: aload_1
      24: invokeinterface #59,  3           // InterfaceMethod android/support/v4/view/h$c.a:(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V
      29: return

  public static void a(android.view.MenuItem, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: instanceof    #32                 // class android/support/v4/c/a/b
       4: ifeq          19
       7: aload_0
       8: checkcast     #32                 // class android/support/v4/c/a/b
      11: aload_1
      12: invokeinterface #64,  2           // InterfaceMethod android/support/v4/c/a/b.setIconTintMode:(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
      17: pop
      18: return
      19: getstatic     #27                 // Field a:Landroid/support/v4/view/h$c;
      22: aload_0
      23: aload_1
      24: invokeinterface #66,  3           // InterfaceMethod android/support/v4/view/h$c.a:(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V
      29: return

  public static void a(android.view.MenuItem, java.lang.CharSequence);
    Code:
       0: aload_0
       1: instanceof    #32                 // class android/support/v4/c/a/b
       4: ifeq          19
       7: aload_0
       8: checkcast     #32                 // class android/support/v4/c/a/b
      11: aload_1
      12: invokeinterface #70,  2           // InterfaceMethod android/support/v4/c/a/b.a:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
      17: pop
      18: return
      19: getstatic     #27                 // Field a:Landroid/support/v4/view/h$c;
      22: aload_0
      23: aload_1
      24: invokeinterface #72,  3           // InterfaceMethod android/support/v4/view/h$c.a:(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
      29: return

  public static void b(android.view.MenuItem, char, int);
    Code:
       0: aload_0
       1: instanceof    #32                 // class android/support/v4/c/a/b
       4: ifeq          20
       7: aload_0
       8: checkcast     #32                 // class android/support/v4/c/a/b
      11: iload_1
      12: iload_2
      13: invokeinterface #75,  3           // InterfaceMethod android/support/v4/c/a/b.setAlphabeticShortcut:(CI)Landroid/view/MenuItem;
      18: pop
      19: return
      20: getstatic     #27                 // Field a:Landroid/support/v4/view/h$c;
      23: aload_0
      24: iload_1
      25: iload_2
      26: invokeinterface #77,  4           // InterfaceMethod android/support/v4/view/h$c.a:(Landroid/view/MenuItem;CI)V
      31: return

  public static void b(android.view.MenuItem, java.lang.CharSequence);
    Code:
       0: aload_0
       1: instanceof    #32                 // class android/support/v4/c/a/b
       4: ifeq          19
       7: aload_0
       8: checkcast     #32                 // class android/support/v4/c/a/b
      11: aload_1
      12: invokeinterface #79,  2           // InterfaceMethod android/support/v4/c/a/b.b:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
      17: pop
      18: return
      19: getstatic     #27                 // Field a:Landroid/support/v4/view/h$c;
      22: aload_0
      23: aload_1
      24: invokeinterface #81,  3           // InterfaceMethod android/support/v4/view/h$c.b:(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
      29: return
}
