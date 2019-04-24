class com.github.paolorotolo.appintro.AppIntroBase$2 implements android.view.View$OnClickListener {
  final com.github.paolorotolo.appintro.AppIntroBase this$0;

  com.github.paolorotolo.appintro.AppIntroBase$2(com.github.paolorotolo.appintro.AppIntroBase);
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
      32: aload_0
      33: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      36: getfield      #45                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      39: aload_0
      40: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      43: getfield      #49                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      46: invokevirtual #55                 // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      49: invokevirtual #61                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
      52: invokevirtual #65                 // Method com/github/paolorotolo/appintro/AppIntroBase.onSkipPressed:(Landroid/support/v4/app/i;)V
      55: return
}
