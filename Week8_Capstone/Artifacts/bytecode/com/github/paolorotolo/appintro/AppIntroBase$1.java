class com.github.paolorotolo.appintro.AppIntroBase$1 implements android.view.View$OnClickListener {
  final com.github.paolorotolo.appintro.AppIntroBase this$0;

  com.github.paolorotolo.appintro.AppIntroBase$1(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       4: getfield      #27                 // Field com/github/paolorotolo/appintro/AppIntroBase.isVibrateOn:Z
       7: ifeq          28
      10: aload_0
      11: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      14: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mVibrator:Landroid/os/Vibrator;
      17: aload_0
      18: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      21: getfield      #35                 // Field com/github/paolorotolo/appintro/AppIntroBase.vibrateIntensity:I
      24: i2l
      25: invokevirtual #41                 // Method android/os/Vibrator.vibrate:(J)V
      28: aload_0
      29: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      32: invokestatic  #45                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$100:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Z
      35: ifeq          57
      38: aload_0
      39: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      42: invokestatic  #48                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$200:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Z
      45: ifne          64
      48: aload_0
      49: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      52: iconst_1
      53: invokestatic  #52                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$300:(Lcom/github/paolorotolo/appintro/AppIntroBase;Z)V
      56: return
      57: aload_0
      58: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      61: invokestatic  #55                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$400:(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
      64: return
}
