class android.support.transition.c implements android.support.transition.d {
  android.support.transition.c();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method java/lang/Object."<init>":()V
       4: return

  public void a(android.animation.Animator);
    Code:
       0: aload_1
       1: invokevirtual #18                 // Method android/animation/Animator.pause:()V
       4: return

  public void a(android.animation.Animator, android.animation.AnimatorListenerAdapter);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #23                 // Method android/animation/Animator.addPauseListener:(Landroid/animation/Animator$AnimatorPauseListener;)V
       5: return

  public void b(android.animation.Animator);
    Code:
       0: aload_1
       1: invokevirtual #27                 // Method android/animation/Animator.resume:()V
       4: return
}
