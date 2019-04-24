class android.support.v4.view.w$c {
  android.support.v4.view.w$c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public void a(android.view.ViewParent, android.view.View);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/view/m
       4: ifeq          17
       7: aload_1
       8: checkcast     #16                 // class android/support/v4/view/m
      11: aload_2
      12: invokeinterface #20,  2           // InterfaceMethod android/support/v4/view/m.onStopNestedScroll:(Landroid/view/View;)V
      17: return

  public void a(android.view.ViewParent, android.view.View, int, int, int, int);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/view/m
       4: ifeq          24
       7: aload_1
       8: checkcast     #16                 // class android/support/v4/view/m
      11: aload_2
      12: iload_3
      13: iload         4
      15: iload         5
      17: iload         6
      19: invokeinterface #25,  6           // InterfaceMethod android/support/v4/view/m.onNestedScroll:(Landroid/view/View;IIII)V
      24: return

  public void a(android.view.ViewParent, android.view.View, int, int, int[]);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/view/m
       4: ifeq          22
       7: aload_1
       8: checkcast     #16                 // class android/support/v4/view/m
      11: aload_2
      12: iload_3
      13: iload         4
      15: aload         5
      17: invokeinterface #30,  5           // InterfaceMethod android/support/v4/view/m.onNestedPreScroll:(Landroid/view/View;II[I)V
      22: return

  public boolean a(android.view.ViewParent, android.view.View, float, float);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/view/m
       4: ifeq          21
       7: aload_1
       8: checkcast     #16                 // class android/support/v4/view/m
      11: aload_2
      12: fload_3
      13: fload         4
      15: invokeinterface #35,  4           // InterfaceMethod android/support/v4/view/m.onNestedPreFling:(Landroid/view/View;FF)Z
      20: ireturn
      21: iconst_0
      22: ireturn

  public boolean a(android.view.ViewParent, android.view.View, float, float, boolean);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/view/m
       4: ifeq          23
       7: aload_1
       8: checkcast     #16                 // class android/support/v4/view/m
      11: aload_2
      12: fload_3
      13: fload         4
      15: iload         5
      17: invokeinterface #40,  5           // InterfaceMethod android/support/v4/view/m.onNestedFling:(Landroid/view/View;FFZ)Z
      22: ireturn
      23: iconst_0
      24: ireturn

  public boolean a(android.view.ViewParent, android.view.View, android.view.View, int);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/view/m
       4: ifeq          21
       7: aload_1
       8: checkcast     #16                 // class android/support/v4/view/m
      11: aload_2
      12: aload_3
      13: iload         4
      15: invokeinterface #45,  4           // InterfaceMethod android/support/v4/view/m.onStartNestedScroll:(Landroid/view/View;Landroid/view/View;I)Z
      20: ireturn
      21: iconst_0
      22: ireturn

  public void b(android.view.ViewParent, android.view.View, android.view.View, int);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/view/m
       4: ifeq          20
       7: aload_1
       8: checkcast     #16                 // class android/support/v4/view/m
      11: aload_2
      12: aload_3
      13: iload         4
      15: invokeinterface #51,  4           // InterfaceMethod android/support/v4/view/m.onNestedScrollAccepted:(Landroid/view/View;Landroid/view/View;I)V
      20: return
}
