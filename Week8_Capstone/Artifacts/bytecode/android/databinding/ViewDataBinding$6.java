final class android.databinding.ViewDataBinding$6 implements android.view.View$OnAttachStateChangeListener {
  android.databinding.ViewDataBinding$6();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: return

  public void onViewAttachedToWindow(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #22                 // Method android/databinding/ViewDataBinding.b:(Landroid/view/View;)Landroid/databinding/ViewDataBinding;
       4: invokestatic  #26                 // Method android/databinding/ViewDataBinding.a:(Landroid/databinding/ViewDataBinding;)Ljava/lang/Runnable;
       7: invokeinterface #31,  1           // InterfaceMethod java/lang/Runnable.run:()V
      12: aload_1
      13: aload_0
      14: invokevirtual #37                 // Method android/view/View.removeOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      17: return

  public void onViewDetachedFromWindow(android.view.View);
    Code:
       0: return
}
