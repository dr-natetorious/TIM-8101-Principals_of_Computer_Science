class android.support.design.widget.SwipeDismissBehavior$b implements java.lang.Runnable {
  final android.support.design.widget.SwipeDismissBehavior a;

  android.support.design.widget.SwipeDismissBehavior$b(android.support.design.widget.SwipeDismissBehavior, android.view.View, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #23                 // Field b:Landroid/view/View;
      14: aload_0
      15: iload_3
      16: putfield      #25                 // Field c:Z
      19: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
       4: getfield      #30                 // Field android/support/design/widget/SwipeDismissBehavior.b:Landroid/support/v4/widget/p;
       7: ifnull        33
      10: aload_0
      11: getfield      #18                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      14: getfield      #30                 // Field android/support/design/widget/SwipeDismissBehavior.b:Landroid/support/v4/widget/p;
      17: iconst_1
      18: invokevirtual #35                 // Method android/support/v4/widget/p.a:(Z)Z
      21: ifeq          33
      24: aload_0
      25: getfield      #23                 // Field b:Landroid/view/View;
      28: aload_0
      29: invokestatic  #40                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
      32: return
      33: aload_0
      34: getfield      #25                 // Field c:Z
      37: ifeq          66
      40: aload_0
      41: getfield      #18                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      44: getfield      #43                 // Field android/support/design/widget/SwipeDismissBehavior.c:Landroid/support/design/widget/SwipeDismissBehavior$a;
      47: ifnull        66
      50: aload_0
      51: getfield      #18                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      54: getfield      #43                 // Field android/support/design/widget/SwipeDismissBehavior.c:Landroid/support/design/widget/SwipeDismissBehavior$a;
      57: aload_0
      58: getfield      #23                 // Field b:Landroid/view/View;
      61: invokeinterface #48,  2           // InterfaceMethod android/support/design/widget/SwipeDismissBehavior$a.a:(Landroid/view/View;)V
      66: return
}
