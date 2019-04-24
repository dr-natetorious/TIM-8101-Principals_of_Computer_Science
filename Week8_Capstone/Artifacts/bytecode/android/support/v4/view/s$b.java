class android.support.v4.view.s$b extends android.support.v4.view.s$a {
  android.support.v4.view.s$b();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/view/s$a."<init>":()V
       4: return

  public void a(android.view.View, int);
    Code:
       0: iload_2
       1: istore_3
       2: iload_2
       3: iconst_4
       4: if_icmpne     9
       7: iconst_2
       8: istore_3
       9: aload_1
      10: iload_3
      11: invokevirtual #20                 // Method android/view/View.setImportantForAccessibility:(I)V
      14: return

  public void a(android.view.View, android.graphics.drawable.Drawable);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #25                 // Method android/view/View.setBackground:(Landroid/graphics/drawable/Drawable;)V
       5: return

  public void a(android.view.View, java.lang.Runnable);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #30                 // Method android/view/View.postOnAnimation:(Ljava/lang/Runnable;)V
       5: return

  public void a(android.view.View, java.lang.Runnable, long);
    Code:
       0: aload_1
       1: aload_2
       2: lload_3
       3: invokevirtual #35                 // Method android/view/View.postOnAnimationDelayed:(Ljava/lang/Runnable;J)V
       6: return

  public void a(android.view.View, boolean);
    Code:
       0: aload_1
       1: iload_2
       2: invokevirtual #40                 // Method android/view/View.setHasTransientState:(Z)V
       5: return

  public boolean b(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #45                 // Method android/view/View.hasTransientState:()Z
       4: ireturn

  public void c(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #50                 // Method android/view/View.postInvalidateOnAnimation:()V
       4: return

  public int d(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #56                 // Method android/view/View.getImportantForAccessibility:()I
       4: ireturn

  public android.view.ViewParent e(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #62                 // Method android/view/View.getParentForAccessibility:()Landroid/view/ViewParent;
       4: areturn

  public int f(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #66                 // Method android/view/View.getMinimumWidth:()I
       4: ireturn

  public int g(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #70                 // Method android/view/View.getMinimumHeight:()I
       4: ireturn

  public void h(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #74                 // Method android/view/View.requestFitSystemWindows:()V
       4: return

  public boolean i(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #78                 // Method android/view/View.getFitsSystemWindows:()Z
       4: ireturn

  public boolean j(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #82                 // Method android/view/View.hasOverlappingRendering:()Z
       4: ireturn
}
