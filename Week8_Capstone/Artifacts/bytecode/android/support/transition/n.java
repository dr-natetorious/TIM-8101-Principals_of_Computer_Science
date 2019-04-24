class android.support.transition.n {
  static {};
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: new           #16                 // class android/support/transition/p
      11: dup
      12: invokespecial #19                 // Method android/support/transition/p."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #21                 // Field a:Landroid/support/transition/q;
      20: return
      21: new           #23                 // class android/support/transition/o
      24: dup
      25: invokespecial #24                 // Method android/support/transition/o."<init>":()V
      28: astore_0
      29: goto          16

  static android.animation.PropertyValuesHolder a(android.util.Property<?, android.graphics.PointF>, android.graphics.Path);
    Code:
       0: getstatic     #21                 // Field a:Landroid/support/transition/q;
       3: aload_0
       4: aload_1
       5: invokeinterface #30,  3           // InterfaceMethod android/support/transition/q.a:(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;
      10: areturn
}
