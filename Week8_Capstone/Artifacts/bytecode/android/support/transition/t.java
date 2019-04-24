public class android.support.transition.t {
  static android.support.transition.t a(android.view.View);
    Code:
       0: aload_0
       1: getstatic     #15                 // Field android/support/transition/r$a.transition_current_scene:I
       4: invokevirtual #21                 // Method android/view/View.getTag:(I)Ljava/lang/Object;
       7: checkcast     #2                  // class android/support/transition/t
      10: areturn

  static void a(android.view.View, android.support.transition.t);
    Code:
       0: aload_0
       1: getstatic     #15                 // Field android/support/transition/r$a.transition_current_scene:I
       4: aload_1
       5: invokevirtual #27                 // Method android/view/View.setTag:(ILjava/lang/Object;)V
       8: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #30                 // Field a:Landroid/view/ViewGroup;
       4: invokestatic  #32                 // Method a:(Landroid/view/View;)Landroid/support/transition/t;
       7: aload_0
       8: if_acmpne     27
      11: aload_0
      12: getfield      #34                 // Field b:Ljava/lang/Runnable;
      15: ifnull        27
      18: aload_0
      19: getfield      #34                 // Field b:Ljava/lang/Runnable;
      22: invokeinterface #39,  1           // InterfaceMethod java/lang/Runnable.run:()V
      27: return
}
