public final class com.github.paolorotolo.appintro.AppIntroViewPager extends android.support.v4.view.v {
  static {};
    Code:
       0: ldc           #2                  // class com/github/paolorotolo/appintro/AppIntroViewPager
       2: invokestatic  #34                 // Method com/github/paolorotolo/appintro/util/LogHelper.makeLogTag:(Ljava/lang/Class;)Ljava/lang/String;
       5: putstatic     #36                 // Field TAG:Ljava/lang/String;
       8: return

  public com.github.paolorotolo.appintro.AppIntroViewPager(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #41                 // Method android/support/v4/view/v."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: aconst_null
       8: putfield      #43                 // Field mScroller:Lcom/github/paolorotolo/appintro/ScrollerCustomDuration;
      11: aload_0
      12: iconst_1
      13: putfield      #45                 // Field pagingEnabled:Z
      16: aload_0
      17: iconst_1
      18: putfield      #47                 // Field nextPagingEnabled:Z
      21: aload_0
      22: iconst_0
      23: putfield      #49                 // Field lockPage:I
      26: aload_0
      27: invokespecial #52                 // Method initViewPagerScroller:()V
      30: return

  public void addOnPageChangeListener(com.github.paolorotolo.appintro.AppIntroBase$PagerOnPageChangeListener);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #154                // Method android/support/v4/view/v.addOnPageChangeListener:(Landroid/support/v4/view/v$f;)V
       5: aload_0
       6: aload_1
       7: putfield      #156                // Field pageChangeListener:Landroid/support/v4/view/v$f;
      10: return

  public int getLockPage();
    Code:
       0: aload_0
       1: getfield      #49                 // Field lockPage:I
       4: ireturn

  public void goToNextSlide();
    Code:
       0: aload_0
       1: invokevirtual #109                // Method getResources:()Landroid/content/res/Resources;
       4: invokestatic  #115                // Method com/github/paolorotolo/appintro/util/LayoutUtil.isRtl:(Landroid/content/res/Resources;)Z
       7: ifeq          23
      10: aload_0
      11: invokevirtual #161                // Method getCurrentItem:()I
      14: iconst_1
      15: isub
      16: istore_1
      17: aload_0
      18: iload_1
      19: invokevirtual #165                // Method setCurrentItem:(I)V
      22: return
      23: aload_0
      24: invokevirtual #161                // Method getCurrentItem:()I
      27: iconst_1
      28: iadd
      29: istore_1
      30: goto          17

  public void goToPreviousSlide();
    Code:
       0: aload_0
       1: invokevirtual #109                // Method getResources:()Landroid/content/res/Resources;
       4: invokestatic  #115                // Method com/github/paolorotolo/appintro/util/LayoutUtil.isRtl:(Landroid/content/res/Resources;)Z
       7: ifeq          21
      10: aload_0
      11: aload_0
      12: invokevirtual #161                // Method getCurrentItem:()I
      15: iconst_1
      16: iadd
      17: invokevirtual #165                // Method setCurrentItem:(I)V
      20: return
      21: aload_0
      22: aload_0
      23: invokevirtual #161                // Method getCurrentItem:()I
      26: iconst_1
      27: isub
      28: invokevirtual #165                // Method setCurrentItem:(I)V
      31: return
      32: getstatic     #36                 // Field TAG:Ljava/lang/String;
      35: iconst_1
      36: anewarray     #168                // class java/lang/Object
      39: dup
      40: iconst_0
      41: ldc           #170                // String goToPreviousSlide: An error occurred while switching to the previous slide. Was isFirstSlide checked before the call?
      43: aastore
      44: invokestatic  #174                // Method com/github/paolorotolo/appintro/util/LogHelper.e:(Ljava/lang/String;[Ljava/lang/Object;)V
      47: return
      48: astore_1
      49: goto          32
    Exception table:
       from    to  target type
           0    20    48   Class java/lang/Exception
          21    31    48   Class java/lang/Exception

  public boolean isFirstSlide(int);
    Code:
       0: aload_0
       1: invokevirtual #109                // Method getResources:()Landroid/content/res/Resources;
       4: invokestatic  #115                // Method com/github/paolorotolo/appintro/util/LayoutUtil.isRtl:(Landroid/content/res/Resources;)Z
       7: istore        4
       9: iconst_0
      10: istore_3
      11: iconst_0
      12: istore_2
      13: iload         4
      15: ifeq          33
      18: aload_0
      19: invokevirtual #161                // Method getCurrentItem:()I
      22: iload_1
      23: isub
      24: iconst_1
      25: iadd
      26: ifne          31
      29: iconst_1
      30: istore_2
      31: iload_2
      32: ireturn
      33: iload_3
      34: istore_2
      35: aload_0
      36: invokevirtual #161                // Method getCurrentItem:()I
      39: ifne          44
      42: iconst_1
      43: istore_2
      44: iload_2
      45: ireturn

  public boolean isNextPagingEnabled();
    Code:
       0: aload_0
       1: getfield      #47                 // Field nextPagingEnabled:Z
       4: ireturn

  public boolean isPagingEnabled();
    Code:
       0: aload_0
       1: getfield      #45                 // Field pagingEnabled:Z
       4: ireturn

  public boolean onInterceptTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #45                 // Field pagingEnabled:Z
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_1
      10: invokevirtual #68                 // Method android/view/MotionEvent.getAction:()I
      13: ifne          30
      16: aload_0
      17: aload_1
      18: invokevirtual #72                 // Method android/view/MotionEvent.getX:()F
      21: putfield      #74                 // Field currentTouchDownX:F
      24: aload_0
      25: aload_1
      26: invokespecial #181                // Method android/support/v4/view/v.onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
      29: ireturn
      30: aload_0
      31: aload_1
      32: invokespecial #183                // Method checkPagingState:(Landroid/view/MotionEvent;)Z
      35: ifne          55
      38: aload_0
      39: aload_1
      40: invokespecial #185                // Method checkCanRequestNextPage:(Landroid/view/MotionEvent;)Z
      43: ifeq          49
      46: goto          55
      49: aload_0
      50: aload_1
      51: invokespecial #181                // Method android/support/v4/view/v.onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
      54: ireturn
      55: aload_0
      56: aload_1
      57: invokespecial #187                // Method checkIllegallyRequestedNextPage:(Landroid/view/MotionEvent;)V
      60: iconst_0
      61: ireturn

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #45                 // Field pagingEnabled:Z
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_1
      10: invokevirtual #68                 // Method android/view/MotionEvent.getAction:()I
      13: ifne          30
      16: aload_0
      17: aload_1
      18: invokevirtual #72                 // Method android/view/MotionEvent.getX:()F
      21: putfield      #74                 // Field currentTouchDownX:F
      24: aload_0
      25: aload_1
      26: invokespecial #190                // Method android/support/v4/view/v.onTouchEvent:(Landroid/view/MotionEvent;)Z
      29: ireturn
      30: aload_0
      31: aload_1
      32: invokespecial #183                // Method checkPagingState:(Landroid/view/MotionEvent;)Z
      35: ifne          55
      38: aload_0
      39: aload_1
      40: invokespecial #185                // Method checkCanRequestNextPage:(Landroid/view/MotionEvent;)Z
      43: ifeq          49
      46: goto          55
      49: aload_0
      50: aload_1
      51: invokespecial #190                // Method android/support/v4/view/v.onTouchEvent:(Landroid/view/MotionEvent;)Z
      54: ireturn
      55: aload_0
      56: aload_1
      57: invokespecial #187                // Method checkIllegallyRequestedNextPage:(Landroid/view/MotionEvent;)V
      60: iconst_0
      61: ireturn

  public void setCurrentItem(int);
    Code:
       0: aload_0
       1: invokespecial #191                // Method android/support/v4/view/v.getCurrentItem:()I
       4: ifne          16
       7: iload_1
       8: ifne          16
      11: iconst_1
      12: istore_2
      13: goto          18
      16: iconst_0
      17: istore_2
      18: aload_0
      19: iload_1
      20: invokespecial #192                // Method android/support/v4/view/v.setCurrentItem:(I)V
      23: iload_2
      24: ifeq          44
      27: aload_0
      28: getfield      #156                // Field pageChangeListener:Landroid/support/v4/view/v$f;
      31: ifnull        44
      34: aload_0
      35: getfield      #156                // Field pageChangeListener:Landroid/support/v4/view/v$f;
      38: iconst_0
      39: invokeinterface #197,  2          // InterfaceMethod android/support/v4/view/v$f.onPageSelected:(I)V
      44: return

  public void setLockPage(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #49                 // Field lockPage:I
       5: return

  public void setNextPagingEnabled(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #47                 // Field nextPagingEnabled:Z
       5: iload_1
       6: ifne          17
       9: aload_0
      10: aload_0
      11: invokevirtual #161                // Method getCurrentItem:()I
      14: putfield      #49                 // Field lockPage:I
      17: return

  public void setOnNextPageRequestedListener(com.github.paolorotolo.appintro.AppIntroViewPager$OnNextPageRequestedListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #56                 // Field nextPageRequestedListener:Lcom/github/paolorotolo/appintro/AppIntroViewPager$OnNextPageRequestedListener;
       5: return

  public void setPagingEnabled(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #45                 // Field pagingEnabled:Z
       5: return

  public void setScrollDurationFactor(double);
    Code:
       0: aload_0
       1: getfield      #43                 // Field mScroller:Lcom/github/paolorotolo/appintro/ScrollerCustomDuration;
       4: dload_1
       5: invokevirtual #206                // Method com/github/paolorotolo/appintro/ScrollerCustomDuration.setScrollDurationFactor:(D)V
       8: return
}
