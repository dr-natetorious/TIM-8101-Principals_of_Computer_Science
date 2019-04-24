public class android.support.design.internal.b extends android.support.v7.view.menu.h {
  public android.support.design.internal.b(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #8                  // Method android/support/v7/view/menu/h."<init>":(Landroid/content/Context;)V
       5: return

  public android.view.SubMenu addSubMenu(int, int, int, java.lang.CharSequence);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: aload         4
       6: invokevirtual #15                 // Method a:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
       9: checkcast     #17                 // class android/support/v7/view/menu/j
      12: astore        4
      14: new           #19                 // class android/support/design/internal/d
      17: dup
      18: aload_0
      19: invokevirtual #23                 // Method e:()Landroid/content/Context;
      22: aload_0
      23: aload         4
      25: invokespecial #26                 // Method android/support/design/internal/d."<init>":(Landroid/content/Context;Landroid/support/design/internal/b;Landroid/support/v7/view/menu/j;)V
      28: astore        5
      30: aload         4
      32: aload         5
      34: invokevirtual #29                 // Method android/support/v7/view/menu/j.a:(Landroid/support/v7/view/menu/u;)V
      37: aload         5
      39: areturn
}
