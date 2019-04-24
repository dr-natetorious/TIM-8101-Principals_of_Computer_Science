final class com.c.a.f$h implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final com.c.a.f a;

  final boolean b;

  com.c.a.f$h(com.c.a.f, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Lcom/c/a/f;
       5: aload_0
       6: iload_2
       7: putfield      #21                 // Field b:Z
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public final void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: invokestatic  #31                 // Method com/c/a/f.k:()Lcom/c/a/h;
       3: astore_2
       4: aload_1
       5: ldc           #33                 // String it
       7: invokestatic  #38                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      10: aload_2
      11: iconst_3
      12: anewarray     #4                  // class java/lang/Object
      15: dup
      16: iconst_0
      17: ldc           #40                 // String animateZoom:
      19: aastore
      20: dup
      21: iconst_1
      22: ldc           #42                 // String animationStep:
      24: aastore
      25: dup
      26: iconst_2
      27: aload_1
      28: invokevirtual #48                 // Method android/animation/ValueAnimator.getAnimatedFraction:()F
      31: invokestatic  #54                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      34: aastore
      35: invokevirtual #59                 // Method com/c/a/h.a:([Ljava/lang/Object;)V
      38: aload_0
      39: getfield      #19                 // Field a:Lcom/c/a/f;
      42: invokestatic  #63                 // Method com/c/a/f.p:(Lcom/c/a/f;)Z
      45: ifeq          53
      48: aload_1
      49: invokevirtual #66                 // Method android/animation/ValueAnimator.cancel:()V
      52: return
      53: aload_0
      54: getfield      #19                 // Field a:Lcom/c/a/f;
      57: astore_2
      58: aload_1
      59: invokevirtual #70                 // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
      62: astore_1
      63: aload_1
      64: ifnonnull     77
      67: new           #72                 // class a/b
      70: dup
      71: ldc           #74                 // String null cannot be cast to non-null type kotlin.Float
      73: invokespecial #77                 // Method a/b."<init>":(Ljava/lang/String;)V
      76: athrow
      77: aload_2
      78: aload_1
      79: checkcast     #50                 // class java/lang/Float
      82: invokevirtual #80                 // Method java/lang/Float.floatValue:()F
      85: aload_0
      86: getfield      #21                 // Field b:Z
      89: iconst_0
      90: fconst_0
      91: fconst_0
      92: iconst_0
      93: bipush        60
      95: aconst_null
      96: invokestatic  #83                 // Method com/c/a/f.a:(Lcom/c/a/f;FZZFFZILjava/lang/Object;)V
      99: return
}
