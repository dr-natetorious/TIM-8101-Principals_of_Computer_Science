final class android.support.design.widget.b$b extends android.support.design.widget.SwipeDismissBehavior<android.support.design.widget.b$f> {
  final android.support.design.widget.b a;

  android.support.design.widget.b$b(android.support.design.widget.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/design/widget/b;
       5: aload_0
       6: invokespecial #17                 // Method android/support/design/widget/SwipeDismissBehavior."<init>":()V
       9: return

  public boolean a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.b$f, android.view.MotionEvent);
    Code:
       0: aload_3
       1: invokevirtual #25                 // Method android/view/MotionEvent.getActionMasked:()I
       4: istore        4
       6: iload         4
       8: iconst_3
       9: if_icmpeq     73
      12: iload         4
      14: tableswitch   { // 0 to 1
                     0: 39
                     1: 73
               default: 36
          }
      36: goto          86
      39: aload_1
      40: aload_2
      41: aload_3
      42: invokevirtual #29                 // Method android/view/MotionEvent.getX:()F
      45: f2i
      46: aload_3
      47: invokevirtual #32                 // Method android/view/MotionEvent.getY:()F
      50: f2i
      51: invokevirtual #37                 // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;II)Z
      54: ifeq          86
      57: invokestatic  #42                 // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
      60: aload_0
      61: getfield      #14                 // Field a:Landroid/support/design/widget/b;
      64: getfield      #46                 // Field android/support/design/widget/b.c:Landroid/support/design/widget/k$a;
      67: invokevirtual #49                 // Method android/support/design/widget/k.c:(Landroid/support/design/widget/k$a;)V
      70: goto          86
      73: invokestatic  #42                 // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
      76: aload_0
      77: getfield      #14                 // Field a:Landroid/support/design/widget/b;
      80: getfield      #46                 // Field android/support/design/widget/b.c:Landroid/support/design/widget/k$a;
      83: invokevirtual #52                 // Method android/support/design/widget/k.d:(Landroid/support/design/widget/k$a;)V
      86: aload_0
      87: aload_1
      88: aload_2
      89: aload_3
      90: invokespecial #55                 // Method android/support/design/widget/SwipeDismissBehavior.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
      93: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #57                 // class android/support/design/widget/b$f
       6: aload_3
       7: invokevirtual #59                 // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/b$f;Landroid/view/MotionEvent;)Z
      10: ireturn

  public boolean a(android.view.View);
    Code:
       0: aload_1
       1: instanceof    #57                 // class android/support/design/widget/b$f
       4: ireturn
}
