class android.support.v4.app.o$e extends android.view.animation.AnimationSet implements java.lang.Runnable {
  android.support.v4.app.o$e(android.view.animation.Animation, android.view.ViewGroup, android.view.View);
    Code:
       0: aload_0
       1: iconst_0
       2: invokespecial #21                 // Method android/view/animation/AnimationSet."<init>":(Z)V
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Landroid/view/ViewGroup;
      10: aload_0
      11: aload_3
      12: putfield      #25                 // Field b:Landroid/view/View;
      15: aload_0
      16: aload_1
      17: invokevirtual #29                 // Method addAnimation:(Landroid/view/animation/Animation;)V
      20: return

  public boolean getTransformation(long, android.view.animation.Transformation);
    Code:
       0: aload_0
       1: getfield      #34                 // Field c:Z
       4: ifeq          14
       7: aload_0
       8: getfield      #36                 // Field d:Z
      11: iconst_1
      12: ixor
      13: ireturn
      14: aload_0
      15: lload_1
      16: aload_3
      17: invokespecial #38                 // Method android/view/animation/AnimationSet.getTransformation:(JLandroid/view/animation/Transformation;)Z
      20: ifne          37
      23: aload_0
      24: iconst_1
      25: putfield      #34                 // Field c:Z
      28: aload_0
      29: getfield      #23                 // Field a:Landroid/view/ViewGroup;
      32: aload_0
      33: invokestatic  #43                 // Method android/support/v4/app/af.a:(Landroid/view/View;Ljava/lang/Runnable;)Landroid/support/v4/app/af;
      36: pop
      37: iconst_1
      38: ireturn

  public boolean getTransformation(long, android.view.animation.Transformation, float);
    Code:
       0: aload_0
       1: getfield      #34                 // Field c:Z
       4: ifeq          14
       7: aload_0
       8: getfield      #36                 // Field d:Z
      11: iconst_1
      12: ixor
      13: ireturn
      14: aload_0
      15: lload_1
      16: aload_3
      17: fload         4
      19: invokespecial #46                 // Method android/view/animation/AnimationSet.getTransformation:(JLandroid/view/animation/Transformation;F)Z
      22: ifne          39
      25: aload_0
      26: iconst_1
      27: putfield      #34                 // Field c:Z
      30: aload_0
      31: getfield      #23                 // Field a:Landroid/view/ViewGroup;
      34: aload_0
      35: invokestatic  #43                 // Method android/support/v4/app/af.a:(Landroid/view/View;Ljava/lang/Runnable;)Landroid/support/v4/app/af;
      38: pop
      39: iconst_1
      40: ireturn

  public void run();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/view/ViewGroup;
       4: aload_0
       5: getfield      #25                 // Field b:Landroid/view/View;
       8: invokevirtual #54                 // Method android/view/ViewGroup.endViewTransition:(Landroid/view/View;)V
      11: aload_0
      12: iconst_1
      13: putfield      #36                 // Field d:Z
      16: return
}
