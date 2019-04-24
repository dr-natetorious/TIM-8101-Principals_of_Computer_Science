class android.support.design.widget.AppBarLayout$Behavior$1 implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final android.support.design.widget.CoordinatorLayout a;

  final android.support.design.widget.AppBarLayout b;

  final android.support.design.widget.AppBarLayout$Behavior c;

  android.support.design.widget.AppBarLayout$Behavior$1(android.support.design.widget.AppBarLayout$Behavior, android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #23                 // Field c:Landroid/support/design/widget/AppBarLayout$Behavior;
       5: aload_0
       6: aload_2
       7: putfield      #25                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
      10: aload_0
      11: aload_3
      12: putfield      #27                 // Field b:Landroid/support/design/widget/AppBarLayout;
      15: aload_0
      16: invokespecial #30                 // Method java/lang/Object."<init>":()V
      19: return

  public void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:Landroid/support/design/widget/AppBarLayout$Behavior;
       4: aload_0
       5: getfield      #25                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
       8: aload_0
       9: getfield      #27                 // Field b:Landroid/support/design/widget/AppBarLayout;
      12: aload_1
      13: invokevirtual #39                 // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
      16: checkcast     #41                 // class java/lang/Integer
      19: invokevirtual #45                 // Method java/lang/Integer.intValue:()I
      22: invokevirtual #49                 // Method android/support/design/widget/AppBarLayout$Behavior.a_:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)I
      25: pop
      26: return
}
