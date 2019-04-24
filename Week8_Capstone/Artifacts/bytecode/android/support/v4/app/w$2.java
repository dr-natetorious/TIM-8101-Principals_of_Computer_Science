class android.support.v4.app.w$2 implements android.transition.Transition$TransitionListener {
  final android.view.View a;

  final java.util.ArrayList b;

  final android.support.v4.app.w c;

  android.support.v4.app.w$2(android.support.v4.app.w, android.view.View, java.util.ArrayList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field c:Landroid/support/v4/app/w;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/view/View;
      10: aload_0
      11: aload_3
      12: putfield      #24                 // Field b:Ljava/util/ArrayList;
      15: aload_0
      16: invokespecial #27                 // Method java/lang/Object."<init>":()V
      19: return

  public void onTransitionCancel(android.transition.Transition);
    Code:
       0: return

  public void onTransitionEnd(android.transition.Transition);
    Code:
       0: aload_1
       1: aload_0
       2: invokevirtual #37                 // Method android/transition/Transition.removeListener:(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
       5: pop
       6: aload_0
       7: getfield      #22                 // Field a:Landroid/view/View;
      10: bipush        8
      12: invokevirtual #43                 // Method android/view/View.setVisibility:(I)V
      15: aload_0
      16: getfield      #24                 // Field b:Ljava/util/ArrayList;
      19: invokevirtual #49                 // Method java/util/ArrayList.size:()I
      22: istore_3
      23: iconst_0
      24: istore_2
      25: iload_2
      26: iload_3
      27: if_icmpge     52
      30: aload_0
      31: getfield      #24                 // Field b:Ljava/util/ArrayList;
      34: iload_2
      35: invokevirtual #53                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      38: checkcast     #39                 // class android/view/View
      41: iconst_0
      42: invokevirtual #43                 // Method android/view/View.setVisibility:(I)V
      45: iload_2
      46: iconst_1
      47: iadd
      48: istore_2
      49: goto          25
      52: return

  public void onTransitionPause(android.transition.Transition);
    Code:
       0: return

  public void onTransitionResume(android.transition.Transition);
    Code:
       0: return

  public void onTransitionStart(android.transition.Transition);
    Code:
       0: return
}
