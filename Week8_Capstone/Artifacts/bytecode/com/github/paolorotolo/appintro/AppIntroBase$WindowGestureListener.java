final class com.github.paolorotolo.appintro.AppIntroBase$WindowGestureListener extends android.view.GestureDetector$SimpleOnGestureListener {
  final com.github.paolorotolo.appintro.AppIntroBase this$0;

  com.github.paolorotolo.appintro.AppIntroBase$WindowGestureListener(com.github.paolorotolo.appintro.AppIntroBase, com.github.paolorotolo.appintro.AppIntroBase$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #20                 // Method "<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
       5: return

  public boolean onSingleTapUp(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #13                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       4: invokestatic  #26                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$1100:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Z
       7: ifeq          29
      10: aload_0
      11: getfield      #13                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      14: invokestatic  #29                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$1200:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Z
      17: ifne          29
      20: aload_0
      21: getfield      #13                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      24: iconst_1
      25: iconst_0
      26: invokevirtual #33                 // Method com/github/paolorotolo/appintro/AppIntroBase.setImmersiveMode:(ZZ)V
      29: iconst_0
      30: ireturn
}
