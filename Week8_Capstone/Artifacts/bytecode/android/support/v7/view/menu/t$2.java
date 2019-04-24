class android.support.v7.view.menu.t$2 implements android.view.View$OnAttachStateChangeListener {
  final android.support.v7.view.menu.t a;

  android.support.v7.view.menu.t$2(android.support.v7.view.menu.t);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onViewAttachedToWindow(android.view.View);
    Code:
       0: return

  public void onViewDetachedFromWindow(android.view.View);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
       4: invokestatic  #24                 // Method android/support/v7/view/menu/t.a:(Landroid/support/v7/view/menu/t;)Landroid/view/ViewTreeObserver;
       7: ifnull        52
      10: aload_0
      11: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      14: invokestatic  #24                 // Method android/support/v7/view/menu/t.a:(Landroid/support/v7/view/menu/t;)Landroid/view/ViewTreeObserver;
      17: invokevirtual #30                 // Method android/view/ViewTreeObserver.isAlive:()Z
      20: ifne          35
      23: aload_0
      24: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      27: aload_1
      28: invokevirtual #36                 // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      31: invokestatic  #39                 // Method android/support/v7/view/menu/t.a:(Landroid/support/v7/view/menu/t;Landroid/view/ViewTreeObserver;)Landroid/view/ViewTreeObserver;
      34: pop
      35: aload_0
      36: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      39: invokestatic  #24                 // Method android/support/v7/view/menu/t.a:(Landroid/support/v7/view/menu/t;)Landroid/view/ViewTreeObserver;
      42: aload_0
      43: getfield      #14                 // Field a:Landroid/support/v7/view/menu/t;
      46: invokestatic  #43                 // Method android/support/v7/view/menu/t.b:(Landroid/support/v7/view/menu/t;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      49: invokevirtual #47                 // Method android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      52: aload_1
      53: aload_0
      54: invokevirtual #51                 // Method android/view/View.removeOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      57: return
}
