final class com.github.paolorotolo.appintro.AppIntroBase$NextButtonOnClickListener implements android.view.View$OnClickListener {
  final com.github.paolorotolo.appintro.AppIntroBase this$0;

  com.github.paolorotolo.appintro.AppIntroBase$NextButtonOnClickListener(com.github.paolorotolo.appintro.AppIntroBase, com.github.paolorotolo.appintro.AppIntroBase$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #22                 // Method "<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
       5: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       4: getfield      #28                 // Field com/github/paolorotolo/appintro/AppIntroBase.isVibrateOn:Z
       7: ifeq          28
      10: aload_0
      11: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      14: getfield      #32                 // Field com/github/paolorotolo/appintro/AppIntroBase.mVibrator:Landroid/os/Vibrator;
      17: aload_0
      18: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      21: getfield      #36                 // Field com/github/paolorotolo/appintro/AppIntroBase.vibrateIntensity:I
      24: i2l
      25: invokevirtual #42                 // Method android/os/Vibrator.vibrate:(J)V
      28: aload_0
      29: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      32: invokestatic  #46                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$100:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Z
      35: ifeq          57
      38: aload_0
      39: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      42: invokestatic  #49                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$200:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Z
      45: ifne          64
      48: aload_0
      49: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      52: iconst_0
      53: invokestatic  #53                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$300:(Lcom/github/paolorotolo/appintro/AppIntroBase;Z)V
      56: return
      57: aload_0
      58: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      61: invokestatic  #56                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$400:(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
      64: return
}
