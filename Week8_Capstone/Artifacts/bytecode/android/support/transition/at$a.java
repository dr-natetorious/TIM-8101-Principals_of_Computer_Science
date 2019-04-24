class android.support.transition.at$a extends android.animation.AnimatorListenerAdapter implements android.support.transition.b$a,android.support.transition.u$c {
  boolean a;

  android.support.transition.at$a(android.view.View, int, boolean);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #27                 // Field a:Z
       9: aload_0
      10: aload_1
      11: putfield      #29                 // Field b:Landroid/view/View;
      14: aload_0
      15: iload_2
      16: putfield      #31                 // Field c:I
      19: aload_0
      20: aload_1
      21: invokevirtual #37                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      24: checkcast     #39                 // class android/view/ViewGroup
      27: putfield      #41                 // Field d:Landroid/view/ViewGroup;
      30: aload_0
      31: iload_3
      32: putfield      #43                 // Field e:Z
      35: aload_0
      36: iconst_1
      37: invokespecial #46                 // Method a:(Z)V
      40: return

  public void a(android.support.transition.u);
    Code:
       0: aload_0
       1: invokespecial #65                 // Method a:()V
       4: aload_1
       5: aload_0
       6: invokevirtual #70                 // Method android/support/transition/u.b:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
       9: pop
      10: return

  public void b(android.support.transition.u);
    Code:
       0: aload_0
       1: iconst_0
       2: invokespecial #46                 // Method a:(Z)V
       5: return

  public void c(android.support.transition.u);
    Code:
       0: aload_0
       1: iconst_1
       2: invokespecial #46                 // Method a:(Z)V
       5: return

  public void d(android.support.transition.u);
    Code:
       0: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #27                 // Field a:Z
       5: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: invokespecial #65                 // Method a:()V
       4: return

  public void onAnimationPause(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Z
       4: ifne          18
       7: aload_0
       8: getfield      #29                 // Field b:Landroid/view/View;
      11: aload_0
      12: getfield      #31                 // Field c:I
      15: invokestatic  #52                 // Method android/support/transition/am.a:(Landroid/view/View;I)V
      18: return

  public void onAnimationRepeat(android.animation.Animator);
    Code:
       0: return

  public void onAnimationResume(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Z
       4: ifne          15
       7: aload_0
       8: getfield      #29                 // Field b:Landroid/view/View;
      11: iconst_0
      12: invokestatic  #52                 // Method android/support/transition/am.a:(Landroid/view/View;I)V
      15: return

  public void onAnimationStart(android.animation.Animator);
    Code:
       0: return
}
