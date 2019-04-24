class android.support.design.widget.BottomSheetBehavior$c implements java.lang.Runnable {
  final android.support.design.widget.BottomSheetBehavior a;

  android.support.design.widget.BottomSheetBehavior$c(android.support.design.widget.BottomSheetBehavior, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #23                 // Field b:Landroid/view/View;
      14: aload_0
      15: iload_3
      16: putfield      #25                 // Field c:I
      19: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       4: getfield      #31                 // Field android/support/design/widget/BottomSheetBehavior.e:Landroid/support/v4/widget/p;
       7: ifnull        33
      10: aload_0
      11: getfield      #18                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      14: getfield      #31                 // Field android/support/design/widget/BottomSheetBehavior.e:Landroid/support/v4/widget/p;
      17: iconst_1
      18: invokevirtual #36                 // Method android/support/v4/widget/p.a:(Z)Z
      21: ifeq          33
      24: aload_0
      25: getfield      #23                 // Field b:Landroid/view/View;
      28: aload_0
      29: invokestatic  #41                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
      32: return
      33: aload_0
      34: getfield      #18                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      37: aload_0
      38: getfield      #25                 // Field c:I
      41: invokevirtual #44                 // Method android/support/design/widget/BottomSheetBehavior.b:(I)V
      44: return
}
