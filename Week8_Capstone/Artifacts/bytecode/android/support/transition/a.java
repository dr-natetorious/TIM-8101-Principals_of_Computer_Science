class android.support.transition.a {
  static {};
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     21
       8: new           #16                 // class android/support/transition/c
      11: dup
      12: invokespecial #19                 // Method android/support/transition/c."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #21                 // Field a:Landroid/support/transition/d;
      20: return
      21: new           #23                 // class android/support/transition/b
      24: dup
      25: invokespecial #24                 // Method android/support/transition/b."<init>":()V
      28: astore_0
      29: goto          16

  static void a(android.animation.Animator);
    Code:
       0: getstatic     #21                 // Field a:Landroid/support/transition/d;
       3: aload_0
       4: invokeinterface #30,  2           // InterfaceMethod android/support/transition/d.a:(Landroid/animation/Animator;)V
       9: return

  static void a(android.animation.Animator, android.animation.AnimatorListenerAdapter);
    Code:
       0: getstatic     #21                 // Field a:Landroid/support/transition/d;
       3: aload_0
       4: aload_1
       5: invokeinterface #33,  3           // InterfaceMethod android/support/transition/d.a:(Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V
      10: return

  static void b(android.animation.Animator);
    Code:
       0: getstatic     #21                 // Field a:Landroid/support/transition/d;
       3: aload_0
       4: invokeinterface #36,  2           // InterfaceMethod android/support/transition/d.b:(Landroid/animation/Animator;)V
       9: return
}
