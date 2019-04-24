class android.support.transition.b implements android.support.transition.d {
  android.support.transition.b();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public void a(android.animation.Animator);
    Code:
       0: aload_1
       1: invokevirtual #21                 // Method android/animation/Animator.getListeners:()Ljava/util/ArrayList;
       4: astore        4
       6: aload         4
       8: ifnull        61
      11: iconst_0
      12: istore_2
      13: aload         4
      15: invokevirtual #27                 // Method java/util/ArrayList.size:()I
      18: istore_3
      19: iload_2
      20: iload_3
      21: if_icmpge     61
      24: aload         4
      26: iload_2
      27: invokevirtual #31                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      30: checkcast     #33                 // class android/animation/Animator$AnimatorListener
      33: astore        5
      35: aload         5
      37: instanceof    #8                  // class android/support/transition/b$a
      40: ifeq          54
      43: aload         5
      45: checkcast     #8                  // class android/support/transition/b$a
      48: aload_1
      49: invokeinterface #36,  2           // InterfaceMethod android/support/transition/b$a.onAnimationPause:(Landroid/animation/Animator;)V
      54: iload_2
      55: iconst_1
      56: iadd
      57: istore_2
      58: goto          19
      61: return

  public void a(android.animation.Animator, android.animation.AnimatorListenerAdapter);
    Code:
       0: return

  public void b(android.animation.Animator);
    Code:
       0: aload_1
       1: invokevirtual #21                 // Method android/animation/Animator.getListeners:()Ljava/util/ArrayList;
       4: astore        4
       6: aload         4
       8: ifnull        61
      11: iconst_0
      12: istore_2
      13: aload         4
      15: invokevirtual #27                 // Method java/util/ArrayList.size:()I
      18: istore_3
      19: iload_2
      20: iload_3
      21: if_icmpge     61
      24: aload         4
      26: iload_2
      27: invokevirtual #31                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      30: checkcast     #33                 // class android/animation/Animator$AnimatorListener
      33: astore        5
      35: aload         5
      37: instanceof    #8                  // class android/support/transition/b$a
      40: ifeq          54
      43: aload         5
      45: checkcast     #8                  // class android/support/transition/b$a
      48: aload_1
      49: invokeinterface #41,  2           // InterfaceMethod android/support/transition/b$a.onAnimationResume:(Landroid/animation/Animator;)V
      54: iload_2
      55: iconst_1
      56: iadd
      57: istore_2
      58: goto          19
      61: return
}
