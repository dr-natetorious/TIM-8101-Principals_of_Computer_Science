class android.support.transition.FragmentTransitionSupport$2 implements android.support.transition.u$c {
  final android.view.View a;

  final java.util.ArrayList b;

  final android.support.transition.FragmentTransitionSupport c;

  android.support.transition.FragmentTransitionSupport$2(android.support.transition.FragmentTransitionSupport, android.view.View, java.util.ArrayList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field c:Landroid/support/transition/FragmentTransitionSupport;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/view/View;
      10: aload_0
      11: aload_3
      12: putfield      #24                 // Field b:Ljava/util/ArrayList;
      15: aload_0
      16: invokespecial #27                 // Method java/lang/Object."<init>":()V
      19: return

  public void a(android.support.transition.u);
    Code:
       0: aload_1
       1: aload_0
       2: invokevirtual #34                 // Method android/support/transition/u.b:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
       5: pop
       6: aload_0
       7: getfield      #22                 // Field a:Landroid/view/View;
      10: bipush        8
      12: invokevirtual #40                 // Method android/view/View.setVisibility:(I)V
      15: aload_0
      16: getfield      #24                 // Field b:Ljava/util/ArrayList;
      19: invokevirtual #46                 // Method java/util/ArrayList.size:()I
      22: istore_3
      23: iconst_0
      24: istore_2
      25: iload_2
      26: iload_3
      27: if_icmpge     52
      30: aload_0
      31: getfield      #24                 // Field b:Ljava/util/ArrayList;
      34: iload_2
      35: invokevirtual #50                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      38: checkcast     #36                 // class android/view/View
      41: iconst_0
      42: invokevirtual #40                 // Method android/view/View.setVisibility:(I)V
      45: iload_2
      46: iconst_1
      47: iadd
      48: istore_2
      49: goto          25
      52: return

  public void b(android.support.transition.u);
    Code:
       0: return

  public void c(android.support.transition.u);
    Code:
       0: return

  public void d(android.support.transition.u);
    Code:
       0: return
}
