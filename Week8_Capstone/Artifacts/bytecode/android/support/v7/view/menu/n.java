public class android.support.v7.view.menu.n {
  public android.support.v7.view.menu.n(android.content.Context, android.support.v7.view.menu.h, android.view.View, boolean, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: iload         4
       6: iload         5
       8: iconst_0
       9: invokespecial #31                 // Method "<init>":(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;ZII)V
      12: return

  public android.support.v7.view.menu.n(android.content.Context, android.support.v7.view.menu.h, android.view.View, boolean, int, int);
    Code:
       0: aload_0
       1: invokespecial #35                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: ldc           #36                 // int 8388611
       7: putfield      #38                 // Field g:I
      10: aload_0
      11: new           #6                  // class android/support/v7/view/menu/n$1
      14: dup
      15: aload_0
      16: invokespecial #41                 // Method android/support/v7/view/menu/n$1."<init>":(Landroid/support/v7/view/menu/n;)V
      19: putfield      #43                 // Field l:Landroid/widget/PopupWindow$OnDismissListener;
      22: aload_0
      23: aload_1
      24: putfield      #45                 // Field a:Landroid/content/Context;
      27: aload_0
      28: aload_2
      29: putfield      #47                 // Field b:Landroid/support/v7/view/menu/h;
      32: aload_0
      33: aload_3
      34: putfield      #49                 // Field f:Landroid/view/View;
      37: aload_0
      38: iload         4
      40: putfield      #51                 // Field c:Z
      43: aload_0
      44: iload         5
      46: putfield      #53                 // Field d:I
      49: aload_0
      50: iload         6
      52: putfield      #55                 // Field e:I
      55: return

  public void a();
    Code:
       0: aload_0
       1: invokevirtual #196                // Method c:()Z
       4: ifne          17
       7: new           #198                // class java/lang/IllegalStateException
      10: dup
      11: ldc           #200                // String MenuPopupHelper cannot be used without an anchor
      13: invokespecial #203                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #38                 // Field g:I
       5: return

  public void a(android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #184                // Field i:Landroid/support/v7/view/menu/o$a;
       5: aload_0
       6: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
       9: ifnull        20
      12: aload_0
      13: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
      16: aload_1
      17: invokevirtual #187                // Method android/support/v7/view/menu/m.a:(Landroid/support/v7/view/menu/o$a;)V
      20: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #49                 // Field f:Landroid/view/View;
       5: return

  public void a(android.widget.PopupWindow$OnDismissListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #207                // Field k:Landroid/widget/PopupWindow$OnDismissListener;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #189                // Field h:Z
       5: aload_0
       6: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
       9: ifnull        20
      12: aload_0
      13: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
      16: iload_1
      17: invokevirtual #191                // Method android/support/v7/view/menu/m.b:(Z)V
      20: return

  public boolean a(int, int);
    Code:
       0: aload_0
       1: invokevirtual #210                // Method f:()Z
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: getfield      #49                 // Field f:Landroid/view/View;
      13: ifnonnull     18
      16: iconst_0
      17: ireturn
      18: aload_0
      19: iload_1
      20: iload_2
      21: iconst_1
      22: iconst_1
      23: invokespecial #212                // Method a:(IIZZ)V
      26: iconst_1
      27: ireturn

  public android.support.v7.view.menu.m b();
    Code:
       0: aload_0
       1: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
       4: ifnonnull     15
       7: aload_0
       8: aload_0
       9: invokespecial #214                // Method g:()Landroid/support/v7/view/menu/m;
      12: putfield      #205                // Field j:Landroid/support/v7/view/menu/m;
      15: aload_0
      16: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
      19: areturn

  public boolean c();
    Code:
       0: aload_0
       1: invokevirtual #210                // Method f:()Z
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: getfield      #49                 // Field f:Landroid/view/View;
      13: ifnonnull     18
      16: iconst_0
      17: ireturn
      18: aload_0
      19: iconst_0
      20: iconst_0
      21: iconst_0
      22: iconst_0
      23: invokespecial #212                // Method a:(IIZZ)V
      26: iconst_1
      27: ireturn

  public void d();
    Code:
       0: aload_0
       1: invokevirtual #210                // Method f:()Z
       4: ifeq          14
       7: aload_0
       8: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
      11: invokevirtual #216                // Method android/support/v7/view/menu/m.e:()V
      14: return

  protected void e();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #205                // Field j:Landroid/support/v7/view/menu/m;
       5: aload_0
       6: getfield      #207                // Field k:Landroid/widget/PopupWindow$OnDismissListener;
       9: ifnull        21
      12: aload_0
      13: getfield      #207                // Field k:Landroid/widget/PopupWindow$OnDismissListener;
      16: invokeinterface #221,  1          // InterfaceMethod android/widget/PopupWindow$OnDismissListener.onDismiss:()V
      21: return

  public boolean f();
    Code:
       0: aload_0
       1: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
       4: ifnull        19
       7: aload_0
       8: getfield      #205                // Field j:Landroid/support/v7/view/menu/m;
      11: invokevirtual #222                // Method android/support/v7/view/menu/m.f:()Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn
}
