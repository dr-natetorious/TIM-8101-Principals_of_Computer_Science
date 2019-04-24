final class android.support.transition.f$3 extends android.util.Property<android.support.transition.f$a, android.graphics.PointF> {
  android.support.transition.f$3(java.lang.Class, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #11                 // Method android/util/Property."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
       6: return

  public android.graphics.PointF a(android.support.transition.f$a);
    Code:
       0: aconst_null
       1: areturn

  public void a(android.support.transition.f$a, android.graphics.PointF);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #20                 // Method android/support/transition/f$a.a:(Landroid/graphics/PointF;)V
       5: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #17                 // class android/support/transition/f$a
       5: invokevirtual #24                 // Method a:(Landroid/support/transition/f$a;)Landroid/graphics/PointF;
       8: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #17                 // class android/support/transition/f$a
       5: aload_2
       6: checkcast     #28                 // class android/graphics/PointF
       9: invokevirtual #30                 // Method a:(Landroid/support/transition/f$a;Landroid/graphics/PointF;)V
      12: return
}
