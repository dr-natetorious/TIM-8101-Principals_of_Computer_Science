class android.support.v7.widget.o {
  static android.view.inputmethod.InputConnection a(android.view.inputmethod.InputConnection, android.view.inputmethod.EditorInfo, android.view.View);
    Code:
       0: aload_0
       1: ifnull        55
       4: aload_1
       5: getfield      #12                 // Field android/view/inputmethod/EditorInfo.hintText:Ljava/lang/CharSequence;
       8: ifnonnull     55
      11: aload_2
      12: invokevirtual #18                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      15: astore_2
      16: aload_2
      17: instanceof    #14                 // class android/view/View
      20: ifeq          55
      23: aload_2
      24: instanceof    #20                 // class android/support/v7/widget/by
      27: ifeq          45
      30: aload_1
      31: aload_2
      32: checkcast     #20                 // class android/support/v7/widget/by
      35: invokeinterface #23,  1           // InterfaceMethod android/support/v7/widget/by.a:()Ljava/lang/CharSequence;
      40: putfield      #12                 // Field android/view/inputmethod/EditorInfo.hintText:Ljava/lang/CharSequence;
      43: aload_0
      44: areturn
      45: aload_2
      46: invokeinterface #26,  1           // InterfaceMethod android/view/ViewParent.getParent:()Landroid/view/ViewParent;
      51: astore_2
      52: goto          16
      55: aload_0
      56: areturn
}
