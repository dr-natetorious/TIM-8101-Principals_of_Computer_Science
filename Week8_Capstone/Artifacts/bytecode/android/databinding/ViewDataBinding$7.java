class android.databinding.ViewDataBinding$7 implements java.lang.Runnable {
  final android.databinding.ViewDataBinding a;

  android.databinding.ViewDataBinding$7(android.databinding.ViewDataBinding);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/databinding/ViewDataBinding;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #14                 // Field a:Landroid/databinding/ViewDataBinding;
       6: iconst_0
       7: invokestatic  #23                 // Method android/databinding/ViewDataBinding.b:(Landroid/databinding/ViewDataBinding;Z)Z
      10: pop
      11: aload_0
      12: monitorexit
      13: invokestatic  #26                 // Method android/databinding/ViewDataBinding.e:()V
      16: getstatic     #32                 // Field android/os/Build$VERSION.SDK_INT:I
      19: bipush        19
      21: if_icmplt     64
      24: aload_0
      25: getfield      #14                 // Field a:Landroid/databinding/ViewDataBinding;
      28: invokestatic  #35                 // Method android/databinding/ViewDataBinding.b:(Landroid/databinding/ViewDataBinding;)Landroid/view/View;
      31: invokevirtual #41                 // Method android/view/View.isAttachedToWindow:()Z
      34: ifne          64
      37: aload_0
      38: getfield      #14                 // Field a:Landroid/databinding/ViewDataBinding;
      41: invokestatic  #35                 // Method android/databinding/ViewDataBinding.b:(Landroid/databinding/ViewDataBinding;)Landroid/view/View;
      44: invokestatic  #45                 // Method android/databinding/ViewDataBinding.f:()Landroid/view/View$OnAttachStateChangeListener;
      47: invokevirtual #49                 // Method android/view/View.removeOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      50: aload_0
      51: getfield      #14                 // Field a:Landroid/databinding/ViewDataBinding;
      54: invokestatic  #35                 // Method android/databinding/ViewDataBinding.b:(Landroid/databinding/ViewDataBinding;)Landroid/view/View;
      57: invokestatic  #45                 // Method android/databinding/ViewDataBinding.f:()Landroid/view/View$OnAttachStateChangeListener;
      60: invokevirtual #52                 // Method android/view/View.addOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      63: return
      64: aload_0
      65: getfield      #14                 // Field a:Landroid/databinding/ViewDataBinding;
      68: invokevirtual #54                 // Method android/databinding/ViewDataBinding.a:()V
      71: return
      72: astore_1
      73: aload_0
      74: monitorexit
      75: aload_1
      76: athrow
    Exception table:
       from    to  target type
           2    13    72   any
          73    75    72   any
}
