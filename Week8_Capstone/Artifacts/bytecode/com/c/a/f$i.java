final class com.c.a.f$i implements android.animation.ValueAnimator$AnimatorUpdateListener {
  final com.c.a.f a;

  final boolean b;

  final boolean c;

  final java.lang.Float d;

  final java.lang.Float e;

  com.c.a.f$i(com.c.a.f, boolean, boolean, java.lang.Float, java.lang.Float);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field a:Lcom/c/a/f;
       5: aload_0
       6: iload_2
       7: putfield      #24                 // Field b:Z
      10: aload_0
      11: iload_3
      12: putfield      #26                 // Field c:Z
      15: aload_0
      16: aload         4
      18: putfield      #28                 // Field d:Ljava/lang/Float;
      21: aload_0
      22: aload         5
      24: putfield      #30                 // Field e:Ljava/lang/Float;
      27: aload_0
      28: invokespecial #33                 // Method java/lang/Object."<init>":()V
      31: return

  public final void onAnimationUpdate(android.animation.ValueAnimator);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Lcom/c/a/f;
       4: invokestatic  #40                 // Method com/c/a/f.p:(Lcom/c/a/f;)Z
       7: ifeq          15
      10: aload_1
      11: invokevirtual #45                 // Method android/animation/ValueAnimator.cancel:()V
      14: return
      15: aload_1
      16: ldc           #47                 // String zoom
      18: invokevirtual #51                 // Method android/animation/ValueAnimator.getAnimatedValue:(Ljava/lang/String;)Ljava/lang/Object;
      21: astore_3
      22: aload_3
      23: ifnonnull     36
      26: new           #53                 // class a/b
      29: dup
      30: ldc           #55                 // String null cannot be cast to non-null type kotlin.Float
      32: invokespecial #58                 // Method a/b."<init>":(Ljava/lang/String;)V
      35: athrow
      36: aload_3
      37: checkcast     #60                 // class java/lang/Float
      40: invokevirtual #64                 // Method java/lang/Float.floatValue:()F
      43: fstore_2
      44: aload_1
      45: ldc           #66                 // String pan
      47: invokevirtual #51                 // Method android/animation/ValueAnimator.getAnimatedValue:(Ljava/lang/String;)Ljava/lang/Object;
      50: astore_1
      51: aload_1
      52: ifnonnull     65
      55: new           #53                 // class a/b
      58: dup
      59: ldc           #68                 // String null cannot be cast to non-null type com.otaliastudios.zoom.AbsolutePoint
      61: invokespecial #58                 // Method a/b."<init>":(Ljava/lang/String;)V
      64: athrow
      65: aload_1
      66: checkcast     #70                 // class com/c/a/a
      69: astore_1
      70: aload_0
      71: getfield      #22                 // Field a:Lcom/c/a/f;
      74: fload_2
      75: aload_1
      76: invokevirtual #72                 // Method com/c/a/a.a:()F
      79: aload_1
      80: invokevirtual #74                 // Method com/c/a/a.b:()F
      83: aload_0
      84: getfield      #24                 // Field b:Z
      87: aload_0
      88: getfield      #26                 // Field c:Z
      91: aload_0
      92: getfield      #28                 // Field d:Ljava/lang/Float;
      95: aload_0
      96: getfield      #30                 // Field e:Ljava/lang/Float;
      99: iconst_0
     100: sipush        128
     103: aconst_null
     104: invokestatic  #77                 // Method com/c/a/f.a:(Lcom/c/a/f;FFFZZLjava/lang/Float;Ljava/lang/Float;ZILjava/lang/Object;)V
     107: return
}
