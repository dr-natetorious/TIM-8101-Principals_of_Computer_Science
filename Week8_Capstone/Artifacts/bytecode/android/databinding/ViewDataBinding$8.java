class android.databinding.ViewDataBinding$8 implements android.view.Choreographer$FrameCallback {
  final android.databinding.ViewDataBinding a;

  android.databinding.ViewDataBinding$8(android.databinding.ViewDataBinding);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/databinding/ViewDataBinding;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void doFrame(long);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/databinding/ViewDataBinding;
       4: invokestatic  #25                 // Method android/databinding/ViewDataBinding.a:(Landroid/databinding/ViewDataBinding;)Ljava/lang/Runnable;
       7: invokeinterface #30,  1           // InterfaceMethod java/lang/Runnable.run:()V
      12: return
}
