class android.support.transition.af {
  static {};
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        18
       5: if_icmplt     21
       8: new           #16                 // class android/support/transition/ah
      11: dup
      12: invokespecial #19                 // Method android/support/transition/ah."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #21                 // Field a:Landroid/support/transition/ai;
      20: return
      21: new           #23                 // class android/support/transition/ag
      24: dup
      25: invokespecial #24                 // Method android/support/transition/ag."<init>":()V
      28: astore_0
      29: goto          16

  static android.support.transition.ae a(android.view.ViewGroup);
    Code:
       0: getstatic     #21                 // Field a:Landroid/support/transition/ai;
       3: aload_0
       4: invokeinterface #30,  2           // InterfaceMethod android/support/transition/ai.a:(Landroid/view/ViewGroup;)Landroid/support/transition/ae;
       9: areturn

  static void a(android.view.ViewGroup, boolean);
    Code:
       0: getstatic     #21                 // Field a:Landroid/support/transition/ai;
       3: aload_0
       4: iload_1
       5: invokeinterface #33,  3           // InterfaceMethod android/support/transition/ai.a:(Landroid/view/ViewGroup;Z)V
      10: return
}
