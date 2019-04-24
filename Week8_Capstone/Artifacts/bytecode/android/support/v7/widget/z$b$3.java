class android.support.v7.widget.z$b$3 implements android.widget.PopupWindow$OnDismissListener {
  final android.view.ViewTreeObserver$OnGlobalLayoutListener a;

  final android.support.v7.widget.z$b b;

  android.support.v7.widget.z$b$3(android.support.v7.widget.z$b, android.view.ViewTreeObserver$OnGlobalLayoutListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field b:Landroid/support/v7/widget/z$b;
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public void onDismiss();
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:Landroid/support/v7/widget/z$b;
       4: getfield      #30                 // Field android/support/v7/widget/z$b.b:Landroid/support/v7/widget/z;
       7: invokevirtual #34                 // Method android/support/v7/widget/z.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      10: astore_1
      11: aload_1
      12: ifnull        23
      15: aload_1
      16: aload_0
      17: getfield      #23                 // Field a:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      20: invokevirtual #40                 // Method android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      23: return
}
