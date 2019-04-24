public class com.github.paolorotolo.appintro.AppIntroBase$PagerOnPageChangeListener implements android.support.v4.view.v$f {
  final com.github.paolorotolo.appintro.AppIntroBase this$0;

  public com.github.paolorotolo.appintro.AppIntroBase$PagerOnPageChangeListener(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void onPageScrollStateChanged(int);
    Code:
       0: return

  public void onPageScrolled(int, float, int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       4: invokestatic  #27                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$700:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Z
       7: ifeq          189
      10: iload_1
      11: aload_0
      12: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      15: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      18: invokevirtual #37                 // Method com/github/paolorotolo/appintro/PagerAdapter.getCount:()I
      21: iconst_1
      22: isub
      23: if_icmpge     189
      26: aload_0
      27: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      30: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      33: iload_1
      34: invokevirtual #41                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
      37: instanceof    #43                 // class com/github/paolorotolo/appintro/ISlideBackgroundColorHolder
      40: ifeq          179
      43: aload_0
      44: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      47: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      50: astore        4
      52: iload_1
      53: iconst_1
      54: iadd
      55: istore_3
      56: aload         4
      58: iload_3
      59: invokevirtual #41                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
      62: instanceof    #43                 // class com/github/paolorotolo/appintro/ISlideBackgroundColorHolder
      65: ifeq          179
      68: aload_0
      69: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      72: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      75: iload_1
      76: invokevirtual #41                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
      79: astore        4
      81: aload_0
      82: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      85: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      88: iload_3
      89: invokevirtual #41                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
      92: astore        5
      94: aload         4
      96: checkcast     #43                 // class com/github/paolorotolo/appintro/ISlideBackgroundColorHolder
      99: astore        6
     101: aload         5
     103: checkcast     #43                 // class com/github/paolorotolo/appintro/ISlideBackgroundColorHolder
     106: astore        7
     108: aload         4
     110: invokevirtual #49                 // Method android/support/v4/app/i.isAdded:()Z
     113: ifeq          189
     116: aload         5
     118: invokevirtual #49                 // Method android/support/v4/app/i.isAdded:()Z
     121: ifeq          189
     124: aload_0
     125: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     128: invokestatic  #53                 // Method com/github/paolorotolo/appintro/AppIntroBase.access$800:(Lcom/github/paolorotolo/appintro/AppIntroBase;)Landroid/animation/ArgbEvaluator;
     131: fload_2
     132: aload         6
     134: invokeinterface #56,  1           // InterfaceMethod com/github/paolorotolo/appintro/ISlideBackgroundColorHolder.getDefaultBackgroundColor:()I
     139: invokestatic  #62                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     142: aload         7
     144: invokeinterface #56,  1           // InterfaceMethod com/github/paolorotolo/appintro/ISlideBackgroundColorHolder.getDefaultBackgroundColor:()I
     149: invokestatic  #62                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     152: invokevirtual #68                 // Method android/animation/ArgbEvaluator.evaluate:(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     155: checkcast     #58                 // class java/lang/Integer
     158: invokevirtual #71                 // Method java/lang/Integer.intValue:()I
     161: istore_1
     162: aload         6
     164: iload_1
     165: invokeinterface #74,  2           // InterfaceMethod com/github/paolorotolo/appintro/ISlideBackgroundColorHolder.setBackgroundColor:(I)V
     170: aload         7
     172: iload_1
     173: invokeinterface #74,  2           // InterfaceMethod com/github/paolorotolo/appintro/ISlideBackgroundColorHolder.setBackgroundColor:(I)V
     178: return
     179: new           #76                 // class java/lang/IllegalStateException
     182: dup
     183: ldc           #78                 // String Color transitions are only available if all slides implement ISlideBackgroundColorHolder.
     185: invokespecial #81                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     188: athrow
     189: return

  public void onPageSelected(int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
       4: getfield      #86                 // Field com/github/paolorotolo/appintro/AppIntroBase.slidesNumber:I
       7: iconst_1
       8: if_icmple     24
      11: aload_0
      12: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      15: getfield      #90                 // Field com/github/paolorotolo/appintro/AppIntroBase.mController:Lcom/github/paolorotolo/appintro/IndicatorController;
      18: iload_1
      19: invokeinterface #95,  2           // InterfaceMethod com/github/paolorotolo/appintro/IndicatorController.selectPosition:(I)V
      24: aload_0
      25: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      28: getfield      #99                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      31: invokevirtual #104                // Method com/github/paolorotolo/appintro/AppIntroViewPager.isNextPagingEnabled:()Z
      34: ifne          88
      37: aload_0
      38: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      41: getfield      #99                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      44: invokevirtual #107                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      47: aload_0
      48: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      51: getfield      #99                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      54: invokevirtual #110                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getLockPage:()I
      57: if_icmpeq     88
      60: aload_0
      61: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      64: aload_0
      65: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      68: getfield      #114                // Field com/github/paolorotolo/appintro/AppIntroBase.baseProgressButtonEnabled:Z
      71: invokevirtual #118                // Method com/github/paolorotolo/appintro/AppIntroBase.setProgressButtonEnabled:(Z)V
      74: aload_0
      75: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      78: getfield      #99                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      81: iconst_1
      82: invokevirtual #121                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setNextPagingEnabled:(Z)V
      85: goto          102
      88: aload_0
      89: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      92: aload_0
      93: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
      96: getfield      #124                // Field com/github/paolorotolo/appintro/AppIntroBase.progressButtonEnabled:Z
      99: invokevirtual #118                // Method com/github/paolorotolo/appintro/AppIntroBase.setProgressButtonEnabled:(Z)V
     102: aload_0
     103: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     106: iload_1
     107: invokevirtual #126                // Method com/github/paolorotolo/appintro/AppIntroBase.onPageSelected:(I)V
     110: aload_0
     111: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     114: getfield      #86                 // Field com/github/paolorotolo/appintro/AppIntroBase.slidesNumber:I
     117: ifle          209
     120: aload_0
     121: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     124: invokestatic  #130                // Method com/github/paolorotolo/appintro/AppIntroBase.access$900:(Lcom/github/paolorotolo/appintro/AppIntroBase;)I
     127: iconst_m1
     128: if_icmpne     161
     131: aload_0
     132: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     135: astore_2
     136: aconst_null
     137: astore_3
     138: aload_0
     139: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     142: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
     145: iload_1
     146: invokevirtual #41                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
     149: astore        4
     151: aload_2
     152: aload_3
     153: aload         4
     155: invokestatic  #134                // Method com/github/paolorotolo/appintro/AppIntroBase.access$600:(Lcom/github/paolorotolo/appintro/AppIntroBase;Landroid/support/v4/app/i;Landroid/support/v4/app/i;)V
     158: goto          209
     161: aload_0
     162: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     165: astore_2
     166: aload_0
     167: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     170: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
     173: aload_0
     174: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     177: invokestatic  #130                // Method com/github/paolorotolo/appintro/AppIntroBase.access$900:(Lcom/github/paolorotolo/appintro/AppIntroBase;)I
     180: invokevirtual #41                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
     183: astore_3
     184: aload_0
     185: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     188: getfield      #31                 // Field com/github/paolorotolo/appintro/AppIntroBase.mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
     191: aload_0
     192: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     195: getfield      #99                 // Field com/github/paolorotolo/appintro/AppIntroBase.pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
     198: invokevirtual #107                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
     201: invokevirtual #41                 // Method com/github/paolorotolo/appintro/PagerAdapter.getItem:(I)Landroid/support/v4/app/i;
     204: astore        4
     206: goto          151
     209: aload_0
     210: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     213: iload_1
     214: invokestatic  #138                // Method com/github/paolorotolo/appintro/AppIntroBase.access$902:(Lcom/github/paolorotolo/appintro/AppIntroBase;I)I
     217: pop
     218: aload_0
     219: getfield      #15                 // Field this$0:Lcom/github/paolorotolo/appintro/AppIntroBase;
     222: invokestatic  #141                // Method com/github/paolorotolo/appintro/AppIntroBase.access$1000:(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
     225: return
}
