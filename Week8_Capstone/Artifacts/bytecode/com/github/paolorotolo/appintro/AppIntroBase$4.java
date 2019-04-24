class com.github.paolorotolo.appintro.AppIntroBase$4 implements java.lang.Runnable {
  final com.github.paolorotolo.appintro.AppIntroBase this$0;

  com.github.paolorotolo.appintro.AppIntroBase$4(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       4: getfield      #26                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
       7: aload_0
       8: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      11: getfield      #30                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      14: invokevirtual #36                 // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      17: invokevirtual #42                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
      20: ifnull        52
      23: aload_0
      24: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      27: aconst_null
      28: aload_0
      29: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      32: getfield      #26                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      35: aload_0
      36: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      39: getfield      #30                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      42: invokevirtual #36                 // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      45: invokevirtual #42                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
      48: invokestatic  #46                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$600:(Lcom/github/paolorotolo/appintro/AppIntroBase;Landroid/support/v4/app/i;Landroid/support/v4/app/i;)V
      51: return
      52: aload_0
      53: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      56: invokevirtual #49                 // Method com/github/paolorotolo/appintro/AppIntroBase.finish:()V
      59: return
}
