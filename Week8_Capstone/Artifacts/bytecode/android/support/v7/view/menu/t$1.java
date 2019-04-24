class android.support.v7.view.menu.t$1 implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
  final android.support.v7.view.menu.t a;

  android.support.v7.view.menu.t$1(android.support.v7.view.menu.t);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onGlobalLayout();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
       4: invokevirtual #23                 // Method android/support/v7/view/menu/t.f:()Z
       7: ifeq          63
      10: aload_0
      11: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      14: getfield      #26                 // Field android/support/v7/view/menu/t.a:Landroid/support/v7/widget/ay;
      17: invokevirtual #31                 // Method android/support/v7/widget/ay.c:()Z
      20: ifne          63
      23: aload_0
      24: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      27: getfield      #35                 // Field android/support/v7/view/menu/t.b:Landroid/view/View;
      30: astore_1
      31: aload_1
      32: ifnull        56
      35: aload_1
      36: invokevirtual #40                 // Method android/view/View.isShown:()Z
      39: ifne          45
      42: goto          56
      45: aload_0
      46: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      49: getfield      #26                 // Field android/support/v7/view/menu/t.a:Landroid/support/v7/widget/ay;
      52: invokevirtual #43                 // Method android/support/v7/widget/ay.d:()V
      55: return
      56: aload_0
      57: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      60: invokevirtual #46                 // Method android/support/v7/view/menu/t.e:()V
      63: return
}
