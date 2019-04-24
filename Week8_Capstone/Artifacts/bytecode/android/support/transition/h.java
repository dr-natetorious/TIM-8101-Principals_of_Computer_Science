class android.support.transition.h {
  static {};
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: new           #16                 // class android/support/transition/j
      11: dup
      12: invokespecial #19                 // Method android/support/transition/j."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #21                 // Field a:Landroid/support/transition/k;
      20: return
      21: new           #23                 // class android/support/transition/i
      24: dup
      25: invokespecial #24                 // Method android/support/transition/i."<init>":()V
      28: astore_0
      29: goto          16

  static <T> android.animation.ObjectAnimator a(T, android.util.Property<T, android.graphics.PointF>, android.graphics.Path);
    Code:
       0: getstatic     #21                 // Field a:Landroid/support/transition/k;
       3: aload_0
       4: aload_1
       5: aload_2
       6: invokeinterface #30,  4           // InterfaceMethod android/support/transition/k.a:(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
      11: areturn
}
