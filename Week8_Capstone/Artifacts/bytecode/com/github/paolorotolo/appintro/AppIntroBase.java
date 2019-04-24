public abstract class com.github.paolorotolo.appintro.AppIntroBase extends android.support.v7.app.e implements com.github.paolorotolo.appintro.AppIntroViewPager$OnNextPageRequestedListener {
  public static final int DEFAULT_COLOR;

  protected android.view.View backButton;

  protected boolean baseProgressButtonEnabled;

  protected android.view.View doneButton;

  protected final java.util.List<android.support.v4.app.i> fragments;

  protected android.widget.FrameLayout indicatorContainer;

  protected boolean isVibrateOn;

  protected boolean isWizardMode;

  protected com.github.paolorotolo.appintro.IndicatorController mController;

  protected com.github.paolorotolo.appintro.PagerAdapter mPagerAdapter;

  protected android.os.Vibrator mVibrator;

  protected android.view.View nextButton;

  protected com.github.paolorotolo.appintro.AppIntroViewPager pager;

  protected boolean pagerIndicatorEnabled;

  protected java.util.ArrayList<com.github.paolorotolo.appintro.PermissionObject> permissionsArray;

  protected boolean progressButtonEnabled;

  protected int savedCurrentItem;

  protected int selectedIndicatorColor;

  protected boolean showBackButtonWithDone;

  protected android.view.View skipButton;

  protected boolean skipButtonEnabled;

  protected int slidesNumber;

  protected int unselectedIndicatorColor;

  protected int vibrateIntensity;

  static {};
    Code:
       0: ldc           #2                  // class com/github/paolorotolo/appintro/AppIntroBase
       2: invokestatic  #90                 // Method com/github/paolorotolo/appintro/util/LogHelper.makeLogTag:(Ljava/lang/Class;)Ljava/lang/String;
       5: putstatic     #92                 // Field TAG:Ljava/lang/String;
       8: return

  public com.github.paolorotolo.appintro.AppIntroBase();
    Code:
       0: aload_0
       1: invokespecial #96                 // Method android/support/v7/app/e."<init>":()V
       4: aload_0
       5: new           #98                 // class java/util/Vector
       8: dup
       9: invokespecial #99                 // Method java/util/Vector."<init>":()V
      12: putfield      #101                // Field fragments:Ljava/util/List;
      15: aload_0
      16: new           #103                // class android/animation/ArgbEvaluator
      19: dup
      20: invokespecial #104                // Method android/animation/ArgbEvaluator."<init>":()V
      23: putfield      #106                // Field argbEvaluator:Landroid/animation/ArgbEvaluator;
      26: aload_0
      27: bipush        20
      29: putfield      #108                // Field vibrateIntensity:I
      32: aload_0
      33: iconst_1
      34: putfield      #110                // Field selectedIndicatorColor:I
      37: aload_0
      38: iconst_1
      39: putfield      #112                // Field unselectedIndicatorColor:I
      42: aload_0
      43: new           #114                // class java/util/ArrayList
      46: dup
      47: invokespecial #115                // Method java/util/ArrayList."<init>":()V
      50: putfield      #117                // Field permissionsArray:Ljava/util/ArrayList;
      53: aload_0
      54: iconst_0
      55: putfield      #119                // Field isVibrateOn:Z
      58: aload_0
      59: iconst_1
      60: putfield      #121                // Field baseProgressButtonEnabled:Z
      63: aload_0
      64: iconst_1
      65: putfield      #123                // Field progressButtonEnabled:Z
      68: aload_0
      69: iconst_1
      70: putfield      #125                // Field skipButtonEnabled:Z
      73: aload_0
      74: iconst_1
      75: putfield      #127                // Field pagerIndicatorEnabled:Z
      78: aload_0
      79: iconst_0
      80: putfield      #129                // Field isWizardMode:Z
      83: aload_0
      84: iconst_0
      85: putfield      #131                // Field showBackButtonWithDone:Z
      88: aload_0
      89: iconst_0
      90: putfield      #133                // Field isGoBackLockEnabled:Z
      93: aload_0
      94: iconst_0
      95: putfield      #135                // Field isImmersiveModeEnabled:Z
      98: aload_0
      99: iconst_0
     100: putfield      #137                // Field isImmersiveModeSticky:Z
     103: aload_0
     104: iconst_0
     105: putfield      #139                // Field areColorTransitionsEnabled:Z
     108: aload_0
     109: iconst_m1
     110: putfield      #141                // Field currentlySelectedItem:I
     113: return

  static boolean access$100(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: invokespecial #147                // Method handleBeforeSlideChanged:()Z
       4: ireturn

  static void access$1000(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: invokespecial #152                // Method updatePagerIndicatorState:()V
       4: return

  static boolean access$1100(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: getfield      #135                // Field isImmersiveModeEnabled:Z
       4: ireturn

  static boolean access$1200(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: getfield      #137                // Field isImmersiveModeSticky:Z
       4: ireturn

  static boolean access$200(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: invokespecial #158                // Method checkAndRequestPermissions:()Z
       4: ireturn

  static void access$300(com.github.paolorotolo.appintro.AppIntroBase, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #164                // Method changeSlide:(Z)V
       5: return

  static void access$400(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: invokespecial #168                // Method handleIllegalSlideChangeAttempt:()V
       4: return

  static void access$600(com.github.paolorotolo.appintro.AppIntroBase, android.support.v4.app.i, android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #174                // Method handleSlideChanged:(Landroid/support/v4/app/i;Landroid/support/v4/app/i;)V
       6: return

  static boolean access$700(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: getfield      #139                // Field areColorTransitionsEnabled:Z
       4: ireturn

  static android.animation.ArgbEvaluator access$800(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: getfield      #106                // Field argbEvaluator:Landroid/animation/ArgbEvaluator;
       4: areturn

  static int access$900(com.github.paolorotolo.appintro.AppIntroBase);
    Code:
       0: aload_0
       1: getfield      #141                // Field currentlySelectedItem:I
       4: ireturn

  static int access$902(com.github.paolorotolo.appintro.AppIntroBase, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #141                // Field currentlySelectedItem:I
       5: iload_1
       6: ireturn

  public void addSlide(android.support.v4.app.i);
    Code:
       0: aload_0
       1: invokevirtual #338                // Method isRtl:()Z
       4: ifeq          21
       7: aload_0
       8: getfield      #101                // Field fragments:Ljava/util/List;
      11: iconst_0
      12: aload_1
      13: invokeinterface #344,  3          // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
      18: goto          32
      21: aload_0
      22: getfield      #101                // Field fragments:Ljava/util/List;
      25: aload_1
      26: invokeinterface #347,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      31: pop
      32: aload_0
      33: getfield      #129                // Field isWizardMode:Z
      36: ifeq          52
      39: aload_0
      40: aload_0
      41: getfield      #101                // Field fragments:Ljava/util/List;
      44: invokeinterface #348,  1          // InterfaceMethod java/util/List.size:()I
      49: invokevirtual #351                // Method setOffScreenPageLimit:(I)V
      52: aload_0
      53: getfield      #183                // Field mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
      56: invokevirtual #354                // Method com/github/paolorotolo/appintro/PagerAdapter.notifyDataSetChanged:()V
      59: return

  public void askForPermissions(java.lang.String[], int);
    Code:
       0: getstatic     #227                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     51
       8: iload_2
       9: ifne          27
      12: aload_0
      13: invokevirtual #359                // Method getBaseContext:()Landroid/content/Context;
      16: ldc_w         #361                // String Invalid Slide Number
      19: iconst_0
      20: invokestatic  #367                // Method android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
      23: invokevirtual #370                // Method android/widget/Toast.show:()V
      26: return
      27: new           #219                // class com/github/paolorotolo/appintro/PermissionObject
      30: dup
      31: aload_1
      32: iload_2
      33: invokespecial #372                // Method com/github/paolorotolo/appintro/PermissionObject."<init>":([Ljava/lang/String;I)V
      36: astore_1
      37: aload_0
      38: getfield      #117                // Field permissionsArray:Ljava/util/ArrayList;
      41: aload_1
      42: invokevirtual #373                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      45: pop
      46: aload_0
      47: iconst_1
      48: invokevirtual #376                // Method setSwipeLock:(Z)V
      51: return

  public boolean dispatchTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #135                // Field isImmersiveModeEnabled:Z
       4: ifeq          16
       7: aload_0
       8: getfield      #380                // Field gestureDetector:Landroid/support/v4/view/d;
      11: aload_1
      12: invokevirtual #385                // Method android/support/v4/view/d.a:(Landroid/view/MotionEvent;)Z
      15: pop
      16: aload_0
      17: aload_1
      18: invokespecial #387                // Method android/support/v7/app/e.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
      21: ireturn

  public boolean getBackButtonVisibilityWithDone();
    Code:
       0: aload_0
       1: getfield      #129                // Field isWizardMode:Z
       4: ireturn

  protected abstract int getLayoutId();

  public com.github.paolorotolo.appintro.AppIntroViewPager getPager();
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: areturn

  public java.util.List<android.support.v4.app.i> getSlides();
    Code:
       0: aload_0
       1: getfield      #183                // Field mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
       4: invokevirtual #396                // Method com/github/paolorotolo/appintro/PagerAdapter.getFragments:()Ljava/util/List;
       7: areturn

  public boolean getWizardMode();
    Code:
       0: aload_0
       1: getfield      #129                // Field isWizardMode:Z
       4: ireturn

  public void init(android.os.Bundle);
    Code:
       0: return

  public boolean isPagerIndicatorEnabled();
    Code:
       0: aload_0
       1: getfield      #127                // Field pagerIndicatorEnabled:Z
       4: ireturn

  public boolean isProgressButtonEnabled();
    Code:
       0: aload_0
       1: getfield      #123                // Field progressButtonEnabled:Z
       4: ireturn

  protected boolean isRtl();
    Code:
       0: aload_0
       1: invokevirtual #407                // Method getResources:()Landroid/content/res/Resources;
       4: invokestatic  #412                // Method com/github/paolorotolo/appintro/util/LayoutUtil.isRtl:(Landroid/content/res/Resources;)Z
       7: ireturn

  public boolean isSkipButtonEnabled();
    Code:
       0: aload_0
       1: getfield      #125                // Field skipButtonEnabled:Z
       4: ireturn

  public void onBackPressed();
    Code:
       0: aload_0
       1: getfield      #133                // Field isGoBackLockEnabled:Z
       4: ifne          38
       7: aload_0
       8: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      11: aload_0
      12: getfield      #101                // Field fragments:Ljava/util/List;
      15: invokeinterface #348,  1          // InterfaceMethod java/util/List.size:()I
      20: invokevirtual #418                // Method com/github/paolorotolo/appintro/AppIntroViewPager.isFirstSlide:(I)Z
      23: ifne          34
      26: aload_0
      27: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      30: invokevirtual #421                // Method com/github/paolorotolo/appintro/AppIntroViewPager.goToPreviousSlide:()V
      33: return
      34: aload_0
      35: invokespecial #423                // Method android/support/v7/app/e.onBackPressed:()V
      38: return

  public boolean onCanRequestNextPage();
    Code:
       0: aload_0
       1: invokespecial #147                // Method handleBeforeSlideChanged:()Z
       4: ireturn

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: invokevirtual #428                // Method requestWindowFeature:(I)Z
       5: pop
       6: aload_0
       7: aload_1
       8: invokespecial #430                // Method android/support/v7/app/e.onCreate:(Landroid/os/Bundle;)V
      11: aload_0
      12: aload_0
      13: invokevirtual #432                // Method getLayoutId:()I
      16: invokevirtual #435                // Method setContentView:(I)V
      19: aload_0
      20: new           #382                // class android/support/v4/view/d
      23: dup
      24: aload_0
      25: new           #22                 // class com/github/paolorotolo/appintro/AppIntroBase$WindowGestureListener
      28: dup
      29: aload_0
      30: aconst_null
      31: invokespecial #438                // Method com/github/paolorotolo/appintro/AppIntroBase$WindowGestureListener."<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;Lcom/github/paolorotolo/appintro/AppIntroBase$1;)V
      34: invokespecial #441                // Method android/support/v4/view/d."<init>":(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
      37: putfield      #380                // Field gestureDetector:Landroid/support/v4/view/d;
      40: aload_0
      41: aload_0
      42: getstatic     #444                // Field com/github/paolorotolo/appintro/R$id.next:I
      45: invokevirtual #302                // Method findViewById:(I)Landroid/view/View;
      48: putfield      #446                // Field nextButton:Landroid/view/View;
      51: aload_0
      52: aload_0
      53: getstatic     #449                // Field com/github/paolorotolo/appintro/R$id.done:I
      56: invokevirtual #302                // Method findViewById:(I)Landroid/view/View;
      59: putfield      #451                // Field doneButton:Landroid/view/View;
      62: aload_0
      63: aload_0
      64: getstatic     #454                // Field com/github/paolorotolo/appintro/R$id.skip:I
      67: invokevirtual #302                // Method findViewById:(I)Landroid/view/View;
      70: putfield      #456                // Field skipButton:Landroid/view/View;
      73: aload_0
      74: aload_0
      75: getstatic     #459                // Field com/github/paolorotolo/appintro/R$id.back:I
      78: invokevirtual #302                // Method findViewById:(I)Landroid/view/View;
      81: putfield      #461                // Field backButton:Landroid/view/View;
      84: aload_0
      85: aload_0
      86: getfield      #446                // Field nextButton:Landroid/view/View;
      89: ldc_w         #462                // String next
      92: invokespecial #464                // Method checkButton:(Landroid/view/View;Ljava/lang/String;)V
      95: aload_0
      96: aload_0
      97: getfield      #451                // Field doneButton:Landroid/view/View;
     100: ldc_w         #465                // String done
     103: invokespecial #464                // Method checkButton:(Landroid/view/View;Ljava/lang/String;)V
     106: aload_0
     107: aload_0
     108: getfield      #456                // Field skipButton:Landroid/view/View;
     111: ldc_w         #466                // String skip
     114: invokespecial #464                // Method checkButton:(Landroid/view/View;Ljava/lang/String;)V
     117: aload_0
     118: aload_0
     119: getfield      #461                // Field backButton:Landroid/view/View;
     122: ldc_w         #467                // String back
     125: invokespecial #464                // Method checkButton:(Landroid/view/View;Ljava/lang/String;)V
     128: aload_0
     129: getstatic     #470                // Field com/github/paolorotolo/appintro/R$id.bottomContainer:I
     132: invokevirtual #302                // Method findViewById:(I)Landroid/view/View;
     135: checkcast     #304                // class android/widget/FrameLayout
     138: astore_1
     139: aload_1
     140: ifnull        163
     143: aload_0
     144: invokevirtual #338                // Method isRtl:()Z
     147: ifeq          163
     150: getstatic     #227                // Field android/os/Build$VERSION.SDK_INT:I
     153: bipush        17
     155: if_icmplt     163
     158: aload_1
     159: iconst_1
     160: invokevirtual #473                // Method android/widget/FrameLayout.setLayoutDirection:(I)V
     163: aload_0
     164: invokevirtual #338                // Method isRtl:()Z
     167: ifeq          180
     170: aload_0
     171: getfield      #446                // Field nextButton:Landroid/view/View;
     174: ldc_w         #474                // float -1.0f
     177: invokevirtual #480                // Method android/view/View.setScaleX:(F)V
     180: aload_0
     181: aload_0
     182: ldc_w         #482                // String vibrator
     185: invokevirtual #486                // Method getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
     188: checkcast     #488                // class android/os/Vibrator
     191: putfield      #490                // Field mVibrator:Landroid/os/Vibrator;
     194: aload_0
     195: new           #193                // class com/github/paolorotolo/appintro/PagerAdapter
     198: dup
     199: aload_0
     200: invokevirtual #494                // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
     203: aload_0
     204: getfield      #101                // Field fragments:Ljava/util/List;
     207: invokespecial #497                // Method com/github/paolorotolo/appintro/PagerAdapter."<init>":(Landroid/support/v4/app/n;Ljava/util/List;)V
     210: putfield      #183                // Field mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
     213: aload_0
     214: aload_0
     215: getstatic     #500                // Field com/github/paolorotolo/appintro/R$id.view_pager:I
     218: invokevirtual #302                // Method findViewById:(I)Landroid/view/View;
     221: checkcast     #187                // class com/github/paolorotolo/appintro/AppIntroViewPager
     224: putfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
     227: aload_0
     228: getfield      #451                // Field doneButton:Landroid/view/View;
     231: ifnull        249
     234: aload_0
     235: getfield      #451                // Field doneButton:Landroid/view/View;
     238: new           #8                  // class com/github/paolorotolo/appintro/AppIntroBase$1
     241: dup
     242: aload_0
     243: invokespecial #502                // Method com/github/paolorotolo/appintro/AppIntroBase$1."<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
     246: invokevirtual #506                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     249: aload_0
     250: getfield      #456                // Field skipButton:Landroid/view/View;
     253: ifnull        271
     256: aload_0
     257: getfield      #456                // Field skipButton:Landroid/view/View;
     260: new           #10                 // class com/github/paolorotolo/appintro/AppIntroBase$2
     263: dup
     264: aload_0
     265: invokespecial #507                // Method com/github/paolorotolo/appintro/AppIntroBase$2."<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
     268: invokevirtual #506                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     271: aload_0
     272: getfield      #446                // Field nextButton:Landroid/view/View;
     275: ifnull        294
     278: aload_0
     279: getfield      #446                // Field nextButton:Landroid/view/View;
     282: new           #16                 // class com/github/paolorotolo/appintro/AppIntroBase$NextButtonOnClickListener
     285: dup
     286: aload_0
     287: aconst_null
     288: invokespecial #508                // Method com/github/paolorotolo/appintro/AppIntroBase$NextButtonOnClickListener."<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;Lcom/github/paolorotolo/appintro/AppIntroBase$1;)V
     291: invokevirtual #506                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     294: aload_0
     295: getfield      #461                // Field backButton:Landroid/view/View;
     298: ifnull        316
     301: aload_0
     302: getfield      #461                // Field backButton:Landroid/view/View;
     305: new           #12                 // class com/github/paolorotolo/appintro/AppIntroBase$3
     308: dup
     309: aload_0
     310: invokespecial #509                // Method com/github/paolorotolo/appintro/AppIntroBase$3."<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
     313: invokevirtual #506                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     316: aload_0
     317: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
     320: aload_0
     321: getfield      #183                // Field mPagerAdapter:Lcom/github/paolorotolo/appintro/PagerAdapter;
     324: invokevirtual #513                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setAdapter:(Landroid/support/v4/view/q;)V
     327: aload_0
     328: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
     331: new           #19                 // class com/github/paolorotolo/appintro/AppIntroBase$PagerOnPageChangeListener
     334: dup
     335: aload_0
     336: invokespecial #514                // Method com/github/paolorotolo/appintro/AppIntroBase$PagerOnPageChangeListener."<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
     339: invokevirtual #518                // Method com/github/paolorotolo/appintro/AppIntroViewPager.addOnPageChangeListener:(Lcom/github/paolorotolo/appintro/AppIntroBase$PagerOnPageChangeListener;)V
     342: aload_0
     343: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
     346: aload_0
     347: invokevirtual #522                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setOnNextPageRequestedListener:(Lcom/github/paolorotolo/appintro/AppIntroViewPager$OnNextPageRequestedListener;)V
     350: aload_0
     351: iconst_1
     352: invokevirtual #525                // Method setScrollDurationFactor:(I)V
     355: return

  public void onDonePressed();
    Code:
       0: return

  public void onDonePressed(android.support.v4.app.i);
    Code:
       0: aload_0
       1: invokevirtual #527                // Method onDonePressed:()V
       4: return

  public void onIllegallyRequestedNextPage();
    Code:
       0: aload_0
       1: invokespecial #168                // Method handleIllegalSlideChangeAttempt:()V
       4: return

  public boolean onKeyDown(int, android.view.KeyEvent);
    Code:
       0: iload_1
       1: bipush        66
       3: if_icmpeq     28
       6: iload_1
       7: bipush        96
       9: if_icmpeq     28
      12: iload_1
      13: bipush        23
      15: if_icmpne     21
      18: goto          28
      21: aload_0
      22: iload_1
      23: aload_2
      24: invokespecial #532                // Method android/support/v7/app/e.onKeyDown:(ILandroid/view/KeyEvent;)Z
      27: ireturn
      28: aload_0
      29: getstatic     #500                // Field com/github/paolorotolo/appintro/R$id.view_pager:I
      32: invokevirtual #302                // Method findViewById:(I)Landroid/view/View;
      35: checkcast     #534                // class android/support/v4/view/v
      38: astore_2
      39: aload_2
      40: invokevirtual #535                // Method android/support/v4/view/v.getCurrentItem:()I
      43: aload_2
      44: invokevirtual #539                // Method android/support/v4/view/v.getAdapter:()Landroid/support/v4/view/q;
      47: invokevirtual #544                // Method android/support/v4/view/q.getCount:()I
      50: iconst_1
      51: isub
      52: if_icmpne     78
      55: aload_0
      56: aload_0
      57: getfield      #101                // Field fragments:Ljava/util/List;
      60: aload_2
      61: invokevirtual #535                // Method android/support/v4/view/v.getCurrentItem:()I
      64: invokeinterface #545,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      69: checkcast     #547                // class android/support/v4/app/i
      72: invokevirtual #201                // Method onDonePressed:(Landroid/support/v4/app/i;)V
      75: goto          88
      78: aload_2
      79: aload_2
      80: invokevirtual #535                // Method android/support/v4/view/v.getCurrentItem:()I
      83: iconst_1
      84: iadd
      85: invokevirtual #550                // Method android/support/v4/view/v.setCurrentItem:(I)V
      88: iconst_0
      89: ireturn

  public void onNextPressed();
    Code:
       0: return

  protected void onPageSelected(int);
    Code:
       0: return

  protected void onPostCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #554                // Method android/support/v7/app/e.onPostCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: getfield      #101                // Field fragments:Ljava/util/List;
       9: invokeinterface #348,  1          // InterfaceMethod java/util/List.size:()I
      14: ifne          22
      17: aload_0
      18: aconst_null
      19: invokevirtual #556                // Method init:(Landroid/os/Bundle;)V
      22: aload_0
      23: invokevirtual #338                // Method isRtl:()Z
      26: ifeq          57
      29: aload_0
      30: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      33: astore_1
      34: aload_0
      35: getfield      #101                // Field fragments:Ljava/util/List;
      38: invokeinterface #348,  1          // InterfaceMethod java/util/List.size:()I
      43: aload_0
      44: getfield      #558                // Field savedCurrentItem:I
      47: isub
      48: istore_2
      49: aload_1
      50: iload_2
      51: invokevirtual #559                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setCurrentItem:(I)V
      54: goto          70
      57: aload_0
      58: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      61: astore_1
      62: aload_0
      63: getfield      #558                // Field savedCurrentItem:I
      66: istore_2
      67: goto          49
      70: aload_0
      71: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      74: new           #14                 // class com/github/paolorotolo/appintro/AppIntroBase$4
      77: dup
      78: aload_0
      79: invokespecial #560                // Method com/github/paolorotolo/appintro/AppIntroBase$4."<init>":(Lcom/github/paolorotolo/appintro/AppIntroBase;)V
      82: invokevirtual #564                // Method com/github/paolorotolo/appintro/AppIntroViewPager.post:(Ljava/lang/Runnable;)Z
      85: pop
      86: aload_0
      87: aload_0
      88: getfield      #101                // Field fragments:Ljava/util/List;
      91: invokeinterface #348,  1          // InterfaceMethod java/util/List.size:()I
      96: putfield      #318                // Field slidesNumber:I
      99: aload_0
     100: aload_0
     101: getfield      #123                // Field progressButtonEnabled:Z
     104: invokevirtual #567                // Method setProgressButtonEnabled:(Z)V
     107: aload_0
     108: invokespecial #569                // Method initController:()V
     111: return

  public void onRequestPermissionsResult(int, java.lang.String[], int[]);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokespecial #573                // Method android/support/v7/app/e.onRequestPermissionsResult:(I[Ljava/lang/String;[I)V
       7: iload_1
       8: iconst_1
       9: if_icmpeq     29
      12: getstatic     #92                 // Field TAG:Ljava/lang/String;
      15: iconst_1
      16: anewarray     #244                // class java/lang/Object
      19: dup
      20: iconst_0
      21: ldc_w         #575                // String Unexpected request code
      24: aastore
      25: invokestatic  #577                // Method com/github/paolorotolo/appintro/util/LogHelper.e:(Ljava/lang/String;[Ljava/lang/Object;)V
      28: return
      29: aload_0
      30: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      33: invokevirtual #191                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      36: iconst_1
      37: iadd
      38: aload_0
      39: getfield      #318                // Field slidesNumber:I
      42: if_icmpne     51
      45: aload_0
      46: iconst_1
      47: invokespecial #164                // Method changeSlide:(Z)V
      50: return
      51: aload_0
      52: iconst_0
      53: invokespecial #164                // Method changeSlide:(Z)V
      56: return

  protected void onRestoreInstanceState(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #580                // Method android/support/v7/app/e.onRestoreInstanceState:(Landroid/os/Bundle;)V
       5: aload_0
       6: aload_1
       7: ldc_w         #581                // String baseProgressButtonEnabled
      10: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
      13: putfield      #121                // Field baseProgressButtonEnabled:Z
      16: aload_0
      17: aload_1
      18: ldc_w         #588                // String progressButtonEnabled
      21: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
      24: putfield      #123                // Field progressButtonEnabled:Z
      27: aload_0
      28: aload_1
      29: ldc_w         #589                // String skipButtonEnabled
      32: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
      35: putfield      #125                // Field skipButtonEnabled:Z
      38: aload_0
      39: aload_1
      40: ldc_w         #590                // String pagerIndicatorEnabled
      43: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
      46: putfield      #127                // Field pagerIndicatorEnabled:Z
      49: aload_0
      50: aload_1
      51: ldc_w         #592                // String currentItem
      54: invokevirtual #596                // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      57: putfield      #558                // Field savedCurrentItem:I
      60: aload_0
      61: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      64: aload_1
      65: ldc_w         #598                // String nextEnabled
      68: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
      71: invokevirtual #601                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPagingEnabled:(Z)V
      74: aload_0
      75: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      78: aload_1
      79: ldc_w         #603                // String nextPagingEnabled
      82: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
      85: invokevirtual #606                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setNextPagingEnabled:(Z)V
      88: aload_0
      89: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      92: aload_1
      93: ldc_w         #608                // String lockPage
      96: invokevirtual #596                // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      99: invokevirtual #611                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setLockPage:(I)V
     102: aload_0
     103: aload_1
     104: ldc           #34                 // String com.github.paolorotolo.appintro_immersive_mode_enabled
     106: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
     109: putfield      #135                // Field isImmersiveModeEnabled:Z
     112: aload_0
     113: aload_1
     114: ldc           #37                 // String com.github.paolorotolo.appintro_immersive_mode_sticky
     116: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
     119: putfield      #137                // Field isImmersiveModeSticky:Z
     122: aload_0
     123: aload_1
     124: ldc           #31                 // String com.github.paolorotolo.appintro_color_transitions_enabled
     126: invokevirtual #587                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
     129: putfield      #139                // Field areColorTransitionsEnabled:Z
     132: return

  protected void onSaveInstanceState(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #614                // Method android/support/v7/app/e.onSaveInstanceState:(Landroid/os/Bundle;)V
       5: aload_1
       6: ldc_w         #581                // String baseProgressButtonEnabled
       9: aload_0
      10: getfield      #121                // Field baseProgressButtonEnabled:Z
      13: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      16: aload_1
      17: ldc_w         #588                // String progressButtonEnabled
      20: aload_0
      21: getfield      #123                // Field progressButtonEnabled:Z
      24: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      27: aload_1
      28: ldc_w         #598                // String nextEnabled
      31: aload_0
      32: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      35: invokevirtual #621                // Method com/github/paolorotolo/appintro/AppIntroViewPager.isPagingEnabled:()Z
      38: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      41: aload_1
      42: ldc_w         #603                // String nextPagingEnabled
      45: aload_0
      46: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      49: invokevirtual #624                // Method com/github/paolorotolo/appintro/AppIntroViewPager.isNextPagingEnabled:()Z
      52: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      55: aload_1
      56: ldc_w         #589                // String skipButtonEnabled
      59: aload_0
      60: getfield      #125                // Field skipButtonEnabled:Z
      63: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      66: aload_1
      67: ldc_w         #590                // String pagerIndicatorEnabled
      70: aload_0
      71: getfield      #127                // Field pagerIndicatorEnabled:Z
      74: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      77: aload_1
      78: ldc_w         #608                // String lockPage
      81: aload_0
      82: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      85: invokevirtual #627                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getLockPage:()I
      88: invokevirtual #631                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      91: aload_1
      92: ldc_w         #592                // String currentItem
      95: aload_0
      96: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      99: invokevirtual #191                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
     102: invokevirtual #631                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
     105: aload_1
     106: ldc           #34                 // String com.github.paolorotolo.appintro_immersive_mode_enabled
     108: aload_0
     109: getfield      #135                // Field isImmersiveModeEnabled:Z
     112: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
     115: aload_1
     116: ldc           #37                 // String com.github.paolorotolo.appintro_immersive_mode_sticky
     118: aload_0
     119: getfield      #137                // Field isImmersiveModeSticky:Z
     122: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
     125: aload_1
     126: ldc           #31                 // String com.github.paolorotolo.appintro_color_transitions_enabled
     128: aload_0
     129: getfield      #139                // Field areColorTransitionsEnabled:Z
     132: invokevirtual #618                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
     135: return

  public void onSkipPressed();
    Code:
       0: return

  public void onSkipPressed(android.support.v4.app.i);
    Code:
       0: aload_0
       1: invokevirtual #634                // Method onSkipPressed:()V
       4: return

  public void onSlideChanged();
    Code:
       0: return

  public void onSlideChanged(android.support.v4.app.i, android.support.v4.app.i);
    Code:
       0: aload_0
       1: invokevirtual #636                // Method onSlideChanged:()V
       4: return

  public void onWindowFocusChanged(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #639                // Method android/support/v7/app/e.onWindowFocusChanged:(Z)V
       5: iload_1
       6: ifeq          25
       9: aload_0
      10: getfield      #135                // Field isImmersiveModeEnabled:Z
      13: ifeq          25
      16: aload_0
      17: iconst_1
      18: aload_0
      19: getfield      #137                // Field isImmersiveModeSticky:Z
      22: invokevirtual #643                // Method setImmersiveMode:(ZZ)V
      25: return

  public void setBackButtonVisibilityWithDone(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #131                // Field showBackButtonWithDone:Z
       5: return

  protected void setButtonState(android.view.View, boolean);
    Code:
       0: aload_1
       1: ifnonnull     5
       4: return
       5: iload_2
       6: ifeq          17
       9: iconst_0
      10: istore_3
      11: aload_1
      12: iload_3
      13: invokevirtual #647                // Method android/view/View.setVisibility:(I)V
      16: return
      17: iconst_4
      18: istore_3
      19: goto          11

  public void setColorTransitionsEnabled(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #139                // Field areColorTransitionsEnabled:Z
       5: return

  public void setCustomIndicator(com.github.paolorotolo.appintro.IndicatorController);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #290                // Field mController:Lcom/github/paolorotolo/appintro/IndicatorController;
       5: return

  public void setCustomTransformer(android.support.v4.view.v$g);
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iconst_1
       5: aload_1
       6: invokevirtual #656                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPageTransformer:(ZLandroid/support/v4/view/v$g;)V
       9: return

  public void setDepthAnimation();
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iconst_1
       5: new           #659                // class com/github/paolorotolo/appintro/ViewPageTransformer
       8: dup
       9: getstatic     #665                // Field com/github/paolorotolo/appintro/ViewPageTransformer$TransformType.DEPTH:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      12: invokespecial #668                // Method com/github/paolorotolo/appintro/ViewPageTransformer."<init>":(Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;)V
      15: invokevirtual #656                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPageTransformer:(ZLandroid/support/v4/view/v$g;)V
      18: return

  public void setFadeAnimation();
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iconst_1
       5: new           #659                // class com/github/paolorotolo/appintro/ViewPageTransformer
       8: dup
       9: getstatic     #672                // Field com/github/paolorotolo/appintro/ViewPageTransformer$TransformType.FADE:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      12: invokespecial #668                // Method com/github/paolorotolo/appintro/ViewPageTransformer."<init>":(Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;)V
      15: invokevirtual #656                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPageTransformer:(ZLandroid/support/v4/view/v$g;)V
      18: return

  public void setFlowAnimation();
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iconst_1
       5: new           #659                // class com/github/paolorotolo/appintro/ViewPageTransformer
       8: dup
       9: getstatic     #676                // Field com/github/paolorotolo/appintro/ViewPageTransformer$TransformType.FLOW:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      12: invokespecial #668                // Method com/github/paolorotolo/appintro/ViewPageTransformer."<init>":(Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;)V
      15: invokevirtual #656                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPageTransformer:(ZLandroid/support/v4/view/v$g;)V
      18: return

  public void setGoBackLock(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #133                // Field isGoBackLockEnabled:Z
       5: return

  public void setImmersiveMode(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_0
       3: invokevirtual #643                // Method setImmersiveMode:(ZZ)V
       6: return

  public void setImmersiveMode(boolean, boolean);
    Code:
       0: getstatic     #227                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     83
       8: iload_1
       9: ifne          38
      12: aload_0
      13: getfield      #135                // Field isImmersiveModeEnabled:Z
      16: ifeq          38
      19: aload_0
      20: invokevirtual #681                // Method getWindow:()Landroid/view/Window;
      23: invokevirtual #687                // Method android/view/Window.getDecorView:()Landroid/view/View;
      26: sipush        1792
      29: invokevirtual #690                // Method android/view/View.setSystemUiVisibility:(I)V
      32: aload_0
      33: iconst_0
      34: putfield      #135                // Field isImmersiveModeEnabled:Z
      37: return
      38: iload_1
      39: ifeq          83
      42: iload_2
      43: ifeq          58
      46: sipush        5894
      49: istore_3
      50: aload_0
      51: iconst_1
      52: putfield      #137                // Field isImmersiveModeSticky:Z
      55: goto          67
      58: sipush        3846
      61: istore_3
      62: aload_0
      63: iconst_0
      64: putfield      #137                // Field isImmersiveModeSticky:Z
      67: aload_0
      68: invokevirtual #681                // Method getWindow:()Landroid/view/Window;
      71: invokevirtual #687                // Method android/view/Window.getDecorView:()Landroid/view/View;
      74: iload_3
      75: invokevirtual #690                // Method android/view/View.setSystemUiVisibility:(I)V
      78: aload_0
      79: iconst_1
      80: putfield      #135                // Field isImmersiveModeEnabled:Z
      83: return

  public void setIndicatorColor(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #110                // Field selectedIndicatorColor:I
       5: aload_0
       6: iload_2
       7: putfield      #112                // Field unselectedIndicatorColor:I
      10: aload_0
      11: getfield      #290                // Field mController:Lcom/github/paolorotolo/appintro/IndicatorController;
      14: ifnull        47
      17: iload_1
      18: iconst_1
      19: if_icmpeq     32
      22: aload_0
      23: getfield      #290                // Field mController:Lcom/github/paolorotolo/appintro/IndicatorController;
      26: iload_1
      27: invokeinterface #325,  2          // InterfaceMethod com/github/paolorotolo/appintro/IndicatorController.setSelectedIndicatorColor:(I)V
      32: iload_2
      33: iconst_1
      34: if_icmpeq     47
      37: aload_0
      38: getfield      #290                // Field mController:Lcom/github/paolorotolo/appintro/IndicatorController;
      41: iload_2
      42: invokeinterface #328,  2          // InterfaceMethod com/github/paolorotolo/appintro/IndicatorController.setUnselectedIndicatorColor:(I)V
      47: return

  public void setNavBarColor(int);
    Code:
       0: getstatic     #227                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     20
       8: aload_0
       9: invokevirtual #681                // Method getWindow:()Landroid/view/Window;
      12: aload_0
      13: iload_1
      14: invokestatic  #699                // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      17: invokevirtual #702                // Method android/view/Window.setNavigationBarColor:(I)V
      20: return

  public void setNavBarColor(java.lang.String);
    Code:
       0: getstatic     #227                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     19
       8: aload_0
       9: invokevirtual #681                // Method getWindow:()Landroid/view/Window;
      12: aload_1
      13: invokestatic  #708                // Method android/graphics/Color.parseColor:(Ljava/lang/String;)I
      16: invokevirtual #702                // Method android/view/Window.setNavigationBarColor:(I)V
      19: return

  public void setNextPageSwipeLock(boolean);
    Code:
       0: iload_1
       1: ifeq          22
       4: aload_0
       5: aload_0
       6: getfield      #123                // Field progressButtonEnabled:Z
       9: putfield      #121                // Field baseProgressButtonEnabled:Z
      12: iconst_0
      13: istore_2
      14: aload_0
      15: iload_2
      16: invokevirtual #567                // Method setProgressButtonEnabled:(Z)V
      19: goto          30
      22: aload_0
      23: getfield      #121                // Field baseProgressButtonEnabled:Z
      26: istore_2
      27: goto          14
      30: aload_0
      31: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      34: iload_1
      35: iconst_1
      36: ixor
      37: invokevirtual #606                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setNextPagingEnabled:(Z)V
      40: return

  public void setOffScreenPageLimit(int);
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iload_1
       5: invokevirtual #712                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setOffscreenPageLimit:(I)V
       8: return

  public void setProgressButtonEnabled(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #123                // Field progressButtonEnabled:Z
       5: iconst_0
       6: istore_2
       7: iload_1
       8: ifeq          160
      11: aload_0
      12: invokevirtual #338                // Method isRtl:()Z
      15: ifne          34
      18: aload_0
      19: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      22: invokevirtual #191                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      25: aload_0
      26: getfield      #318                // Field slidesNumber:I
      29: iconst_1
      30: isub
      31: if_icmpeq     51
      34: aload_0
      35: invokevirtual #338                // Method isRtl:()Z
      38: ifeq          89
      41: aload_0
      42: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      45: invokevirtual #191                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
      48: ifne          89
      51: aload_0
      52: aload_0
      53: getfield      #446                // Field nextButton:Landroid/view/View;
      56: iconst_0
      57: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
      60: aload_0
      61: aload_0
      62: getfield      #451                // Field doneButton:Landroid/view/View;
      65: iconst_1
      66: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
      69: aload_0
      70: getfield      #129                // Field isWizardMode:Z
      73: ifeq          187
      76: aload_0
      77: getfield      #461                // Field backButton:Landroid/view/View;
      80: astore_3
      81: aload_0
      82: getfield      #131                // Field showBackButtonWithDone:Z
      85: istore_1
      86: goto          194
      89: aload_0
      90: aload_0
      91: getfield      #446                // Field nextButton:Landroid/view/View;
      94: iconst_1
      95: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
      98: aload_0
      99: aload_0
     100: getfield      #451                // Field doneButton:Landroid/view/View;
     103: iconst_0
     104: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
     107: aload_0
     108: getfield      #129                // Field isWizardMode:Z
     111: ifeq          147
     114: aload_0
     115: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
     118: invokevirtual #191                // Method com/github/paolorotolo/appintro/AppIntroViewPager.getCurrentItem:()I
     121: ifne          134
     124: aload_0
     125: getfield      #461                // Field backButton:Landroid/view/View;
     128: astore_3
     129: iload_2
     130: istore_1
     131: goto          194
     134: aload_0
     135: getfield      #461                // Field backButton:Landroid/view/View;
     138: astore_3
     139: aload_0
     140: getfield      #129                // Field isWizardMode:Z
     143: istore_1
     144: goto          194
     147: aload_0
     148: getfield      #456                // Field skipButton:Landroid/view/View;
     151: astore_3
     152: aload_0
     153: getfield      #125                // Field skipButtonEnabled:Z
     156: istore_1
     157: goto          194
     160: aload_0
     161: aload_0
     162: getfield      #446                // Field nextButton:Landroid/view/View;
     165: iconst_0
     166: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
     169: aload_0
     170: aload_0
     171: getfield      #451                // Field doneButton:Landroid/view/View;
     174: iconst_0
     175: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
     178: aload_0
     179: aload_0
     180: getfield      #461                // Field backButton:Landroid/view/View;
     183: iconst_0
     184: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
     187: aload_0
     188: getfield      #456                // Field skipButton:Landroid/view/View;
     191: astore_3
     192: iload_2
     193: istore_1
     194: aload_0
     195: aload_3
     196: iload_1
     197: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
     200: return

  public void setProgressIndicator();
    Code:
       0: aload_0
       1: new           #717                // class com/github/paolorotolo/appintro/ProgressIndicatorController
       4: dup
       5: invokespecial #718                // Method com/github/paolorotolo/appintro/ProgressIndicatorController."<init>":()V
       8: putfield      #290                // Field mController:Lcom/github/paolorotolo/appintro/IndicatorController;
      11: return

  protected void setScrollDurationFactor(int);
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iload_1
       5: i2d
       6: invokevirtual #721                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setScrollDurationFactor:(D)V
       9: return

  public void setSlideOverAnimation();
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iconst_1
       5: new           #659                // class com/github/paolorotolo/appintro/ViewPageTransformer
       8: dup
       9: getstatic     #725                // Field com/github/paolorotolo/appintro/ViewPageTransformer$TransformType.SLIDE_OVER:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      12: invokespecial #668                // Method com/github/paolorotolo/appintro/ViewPageTransformer."<init>":(Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;)V
      15: invokevirtual #656                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPageTransformer:(ZLandroid/support/v4/view/v$g;)V
      18: return

  public void setSwipeLock(boolean);
    Code:
       0: iload_1
       1: ifeq          15
       4: aload_0
       5: aload_0
       6: getfield      #123                // Field progressButtonEnabled:Z
       9: putfield      #121                // Field baseProgressButtonEnabled:Z
      12: goto          23
      15: aload_0
      16: aload_0
      17: getfield      #121                // Field baseProgressButtonEnabled:Z
      20: invokevirtual #567                // Method setProgressButtonEnabled:(Z)V
      23: aload_0
      24: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
      27: iload_1
      28: iconst_1
      29: ixor
      30: invokevirtual #601                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPagingEnabled:(Z)V
      33: return

  public void setVibrate(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #119                // Field isVibrateOn:Z
       5: return

  public void setVibrateIntensity(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #108                // Field vibrateIntensity:I
       5: return

  public void setWizardMode(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #129                // Field isWizardMode:Z
       5: aload_0
       6: iconst_0
       7: putfield      #125                // Field skipButtonEnabled:Z
      10: aload_0
      11: aload_0
      12: getfield      #456                // Field skipButton:Landroid/view/View;
      15: iload_1
      16: iconst_1
      17: ixor
      18: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
      21: return

  public void setZoomAnimation();
    Code:
       0: aload_0
       1: getfield      #185                // Field pager:Lcom/github/paolorotolo/appintro/AppIntroViewPager;
       4: iconst_1
       5: new           #659                // class com/github/paolorotolo/appintro/ViewPageTransformer
       8: dup
       9: getstatic     #732                // Field com/github/paolorotolo/appintro/ViewPageTransformer$TransformType.ZOOM:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      12: invokespecial #668                // Method com/github/paolorotolo/appintro/ViewPageTransformer."<init>":(Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;)V
      15: invokevirtual #656                // Method com/github/paolorotolo/appintro/AppIntroViewPager.setPageTransformer:(ZLandroid/support/v4/view/v$g;)V
      18: return

  public void showPagerIndicator(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #127                // Field pagerIndicatorEnabled:Z
       5: return

  public void showSkipButton(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #125                // Field skipButtonEnabled:Z
       5: aload_0
       6: aload_0
       7: getfield      #456                // Field skipButton:Landroid/view/View;
      10: iload_1
      11: invokevirtual #714                // Method setButtonState:(Landroid/view/View;Z)V
      14: return

  public void showStatusBar(boolean);
    Code:
       0: iload_1
       1: ifne          18
       4: aload_0
       5: invokevirtual #681                // Method getWindow:()Landroid/view/Window;
       8: sipush        1024
      11: sipush        1024
      14: invokevirtual #738                // Method android/view/Window.setFlags:(II)V
      17: return
      18: aload_0
      19: invokevirtual #681                // Method getWindow:()Landroid/view/Window;
      22: sipush        1024
      25: invokevirtual #741                // Method android/view/Window.clearFlags:(I)V
      28: return
}
