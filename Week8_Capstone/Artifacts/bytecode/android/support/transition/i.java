class android.support.transition.i implements android.support.transition.k {
  android.support.transition.i();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method java/lang/Object."<init>":()V
       4: return

  public <T> android.animation.ObjectAnimator a(T, android.util.Property<T, android.graphics.PointF>, android.graphics.Path);
    Code:
       0: aload_1
       1: new           #15                 // class android/support/transition/m
       4: dup
       5: aload_2
       6: aload_3
       7: invokespecial #18                 // Method android/support/transition/m."<init>":(Landroid/util/Property;Landroid/graphics/Path;)V
      10: iconst_2
      11: newarray       float
      13: dup
      14: iconst_0
      15: fconst_0
      16: fastore
      17: dup
      18: iconst_1
      19: fconst_1
      20: fastore
      21: invokestatic  #24                 // Method android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
      24: areturn
}
