class com.github.paolorotolo.appintro.AppIntroBase$3 implements android.view.View$OnClickListener {
  final com.github.paolorotolo.appintro.AppIntroBase this$0;

  com.github.paolorotolo.appintro.AppIntroBase$3(com.github.paolorotolo.appintro.AppIntroBase);
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
       4: getfield      #27                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       7: invokevirtual #33                 // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      10: ifle          35
      13: aload_0
      14: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      17: getfield      #27                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      20: aload_0
      21: getfield      #17                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      24: getfield      #27                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      27: invokevirtual #33                 // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      30: iconst_1
      31: isub
      32: invokevirtual #37                 // Method com/github/paolorotolo/appintro/AppIntroViewPager.setCurrentItem:(I)V
      35: return
}
