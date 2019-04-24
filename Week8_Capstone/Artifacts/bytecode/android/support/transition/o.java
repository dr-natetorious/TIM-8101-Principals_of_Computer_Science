class android.support.transition.o implements android.support.transition.q {
  android.support.transition.o();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method java/lang/Object."<init>":()V
       4: return

  public android.animation.PropertyValuesHolder a(android.util.Property<?, android.graphics.PointF>, android.graphics.Path);
    Code:
       0: new           #15                 // class android/support/transition/m
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #18                 // Method android/support/transition/m."<init>":(Landroid/util/Property;Landroid/graphics/Path;)V
       9: iconst_2
      10: newarray       float
      12: dup
      13: iconst_0
      14: fconst_0
      15: fastore
      16: dup
      17: iconst_1
      18: fconst_1
      19: fastore
      20: invokestatic  #24                 // Method android/animation/PropertyValuesHolder.ofFloat:(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;
      23: areturn
}
