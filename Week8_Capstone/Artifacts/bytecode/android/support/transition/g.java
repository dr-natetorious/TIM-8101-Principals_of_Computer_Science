public class android.support.transition.g extends android.support.transition.at {
  public android.support.transition.g();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/support/transition/at."<init>":()V
       4: return

  public android.support.transition.g(int);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/support/transition/at."<init>":()V
       4: aload_0
       5: iload_1
       6: invokevirtual #17                 // Method a:(I)V
       9: return

  public android.animation.Animator a(android.view.ViewGroup, android.view.View, android.support.transition.aa, android.support.transition.aa);
    Code:
       0: fconst_0
       1: fstore        5
       3: aload_3
       4: fconst_0
       5: invokestatic  #68                 // Method a:(Landroid/support/transition/aa;F)F
       8: fstore        6
      10: fload         6
      12: fconst_1
      13: fcmpl
      14: ifne          20
      17: goto          24
      20: fload         6
      22: fstore        5
      24: aload_0
      25: aload_2
      26: fload         5
      28: fconst_1
      29: invokespecial #70                 // Method a:(Landroid/view/View;FF)Landroid/animation/Animator;
      32: areturn

  public void a(android.support.transition.aa);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #73                 // Method android/support/transition/at.a:(Landroid/support/transition/aa;)V
       5: aload_1
       6: getfield      #23                 // Field android/support/transition/aa.a:Ljava/util/Map;
       9: ldc           #25                 // String android:fade:transitionAlpha
      11: aload_1
      12: getfield      #77                 // Field android/support/transition/aa.b:Landroid/view/View;
      15: invokestatic  #81                 // Method android/support/transition/am.c:(Landroid/view/View;)F
      18: invokestatic  #85                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      21: invokeinterface #89,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      26: pop
      27: return

  public android.animation.Animator b(android.view.ViewGroup, android.view.View, android.support.transition.aa, android.support.transition.aa);
    Code:
       0: aload_2
       1: invokestatic  #92                 // Method android/support/transition/am.d:(Landroid/view/View;)V
       4: aload_0
       5: aload_2
       6: aload_3
       7: fconst_1
       8: invokestatic  #68                 // Method a:(Landroid/support/transition/aa;F)F
      11: fconst_0
      12: invokespecial #70                 // Method a:(Landroid/view/View;FF)Landroid/animation/Animator;
      15: areturn
}
