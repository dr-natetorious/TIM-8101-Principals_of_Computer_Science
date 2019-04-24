public final class android.support.v7.view.menu.q {
  public static android.view.Menu a(android.content.Context, android.support.v4.c.a.a);
    Code:
       0: new           #8                  // class android/support/v7/view/menu/r
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #12                 // Method android/support/v7/view/menu/r."<init>":(Landroid/content/Context;Landroid/support/v4/c/a/a;)V
       9: areturn

  public static android.view.MenuItem a(android.content.Context, android.support.v4.c.a.b);
    Code:
       0: getstatic     #20                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     18
       8: new           #22                 // class android/support/v7/view/menu/l
      11: dup
      12: aload_0
      13: aload_1
      14: invokespecial #25                 // Method android/support/v7/view/menu/l."<init>":(Landroid/content/Context;Landroid/support/v4/c/a/b;)V
      17: areturn
      18: new           #27                 // class android/support/v7/view/menu/k
      21: dup
      22: aload_0
      23: aload_1
      24: invokespecial #28                 // Method android/support/v7/view/menu/k."<init>":(Landroid/content/Context;Landroid/support/v4/c/a/b;)V
      27: areturn

  public static android.view.SubMenu a(android.content.Context, android.support.v4.c.a.c);
    Code:
       0: new           #31                 // class android/support/v7/view/menu/v
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #34                 // Method android/support/v7/view/menu/v."<init>":(Landroid/content/Context;Landroid/support/v4/c/a/c;)V
       9: areturn
}
