final class com.c.a.f$f implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final com.c.a.f a;

  final boolean b;

  com.c.a.f$f(com.c.a.f, boolean);
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
      17: ldc           #40                 // String animateScaledPan:
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
      53: aload_1
      54: invokevirtual #70                 // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
      57: astore_1
      58: aload_1
      59: ifnonnull     72
      62: new           #72                 // class a/b
      65: dup
      66: ldc           #74                 // String null cannot be cast to non-null type com.otaliastudios.zoom.ScaledPoint
      68: invokespecial #77                 // Method a/b."<init>":(Ljava/lang/String;)V
      71: athrow
      72: aload_1
      73: checkcast     #79                 // class com/c/a/d
      76: astore_1
      77: aload_0
      78: getfield      #19                 // Field a:Lcom/c/a/f;
      81: aload_1
      82: invokevirtual #81                 // Method com/c/a/d.a:()F
      85: aload_1
      86: invokevirtual #83                 // Method com/c/a/d.b:()F
      89: aload_0
      90: getfield      #21                 // Field b:Z
      93: invokestatic  #86                 // Method com/c/a/f.a:(Lcom/c/a/f;FFZ)V
      96: return
}
