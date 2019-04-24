class android.support.v4.app.af implements android.view.View$OnAttachStateChangeListener,android.view.ViewTreeObserver$OnPreDrawListener {
  public static android.support.v4.app.af a(android.view.View, java.lang.Runnable);
    Code:
       0: new           #2                  // class android/support/v4/app/af
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #35                 // Method "<init>":(Landroid/view/View;Ljava/lang/Runnable;)V
       9: astore_1
      10: aload_0
      11: invokevirtual #27                 // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      14: aload_1
      15: invokevirtual #41                 // Method android/view/ViewTreeObserver.addOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      18: aload_0
      19: aload_1
      20: invokevirtual #45                 // Method android/view/View.addOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      23: aload_1
      24: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/view/ViewTreeObserver;
       4: invokevirtual #49                 // Method android/view/ViewTreeObserver.isAlive:()Z
       7: ifeq          23
      10: aload_0
      11: getfield      #29                 // Field b:Landroid/view/ViewTreeObserver;
      14: astore_1
      15: aload_1
      16: aload_0
      17: invokevirtual #52                 // Method android/view/ViewTreeObserver.removeOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      20: goto          34
      23: aload_0
      24: getfield      #21                 // Field a:Landroid/view/View;
      27: invokevirtual #27                 // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      30: astore_1
      31: goto          15
      34: aload_0
      35: getfield      #21                 // Field a:Landroid/view/View;
      38: aload_0
      39: invokevirtual #55                 // Method android/view/View.removeOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      42: return

  public boolean onPreDraw();
    Code:
       0: aload_0
       1: invokevirtual #58                 // Method a:()V
       4: aload_0
       5: getfield      #31                 // Field c:Ljava/lang/Runnable;
       8: invokeinterface #63,  1           // InterfaceMethod java/lang/Runnable.run:()V
      13: iconst_1
      14: ireturn

  public void onViewAttachedToWindow(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #27                 // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
       5: putfield      #29                 // Field b:Landroid/view/ViewTreeObserver;
       8: return

  public void onViewDetachedFromWindow(android.view.View);
    Code:
       0: aload_0
       1: invokevirtual #58                 // Method a:()V
       4: return
}
