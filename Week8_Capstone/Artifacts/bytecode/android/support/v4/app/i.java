public class android.support.v4.app.i implements android.arch.lifecycle.e,android.content.ComponentCallbacks,android.view.View$OnCreateContextMenuListener {
  static final int ACTIVITY_CREATED;

  static final int CREATED;

  static final int INITIALIZING;

  static final int RESUMED;

  static final int STARTED;

  static final int STOPPED;

  static final java.lang.Object USE_DEFAULT_TRANSITION;

  boolean mAdded;

  android.support.v4.app.i$a mAnimationInfo;

  android.os.Bundle mArguments;

  int mBackStackNesting;

  boolean mCalled;

  android.support.v4.app.o mChildFragmentManager;

  android.support.v4.app.p mChildNonConfig;

  android.view.ViewGroup mContainer;

  int mContainerId;

  boolean mDeferStart;

  boolean mDetached;

  int mFragmentId;

  android.support.v4.app.o mFragmentManager;

  boolean mFromLayout;

  boolean mHasMenu;

  boolean mHidden;

  boolean mHiddenChanged;

  android.support.v4.app.m mHost;

  boolean mInLayout;

  int mIndex;

  android.view.View mInnerView;

  boolean mIsCreated;

  boolean mIsNewlyAdded;

  android.view.LayoutInflater mLayoutInflater;

  android.arch.lifecycle.f mLifecycleRegistry;

  android.support.v4.app.LoaderManagerImpl mLoaderManager;

  boolean mMenuVisible;

  android.support.v4.app.i mParentFragment;

  boolean mPerformedCreateView;

  float mPostponedAlpha;

  boolean mRemoving;

  boolean mRestored;

  boolean mRetainInstance;

  boolean mRetaining;

  android.os.Bundle mSavedFragmentState;

  java.lang.Boolean mSavedUserVisibleHint;

  android.util.SparseArray<android.os.Parcelable> mSavedViewState;

  int mState;

  java.lang.String mTag;

  android.support.v4.app.i mTarget;

  int mTargetIndex;

  int mTargetRequestCode;

  boolean mUserVisibleHint;

  android.view.View mView;

  android.arch.lifecycle.p mViewModelStore;

  java.lang.String mWho;

  static {};
    Code:
       0: new           #114                // class android/support/v4/g/m
       3: dup
       4: invokespecial #117                // Method android/support/v4/g/m."<init>":()V
       7: putstatic     #119                // Field sClassMap:Landroid/support/v4/g/m;
      10: new           #4                  // class java/lang/Object
      13: dup
      14: invokespecial #120                // Method java/lang/Object."<init>":()V
      17: putstatic     #122                // Field USE_DEFAULT_TRANSITION:Ljava/lang/Object;
      20: return

  public android.support.v4.app.i();
    Code:
       0: aload_0
       1: invokespecial #120                // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #125                // Field mState:I
       9: aload_0
      10: iconst_m1
      11: putfield      #127                // Field mIndex:I
      14: aload_0
      15: iconst_m1
      16: putfield      #129                // Field mTargetIndex:I
      19: aload_0
      20: iconst_1
      21: putfield      #131                // Field mMenuVisible:Z
      24: aload_0
      25: iconst_1
      26: putfield      #133                // Field mUserVisibleHint:Z
      29: aload_0
      30: new           #135                // class android/arch/lifecycle/f
      33: dup
      34: aload_0
      35: invokespecial #138                // Method android/arch/lifecycle/f."<init>":(Landroid/arch/lifecycle/e;)V
      38: putfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
      41: return

  static void access$800(android.support.v4.app.i);
    Code:
       0: aload_0
       1: invokespecial #145                // Method callStartTransitionListener:()V
       4: return

  public static android.support.v4.app.i instantiate(android.content.Context, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokestatic  #164                // Method instantiate:(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/i;
       6: areturn

  public static android.support.v4.app.i instantiate(android.content.Context, java.lang.String, android.os.Bundle);
    Code:
       0: getstatic     #119                // Field sClassMap:Landroid/support/v4/g/m;
       3: aload_1
       4: invokevirtual #178                // Method android/support/v4/g/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
       7: checkcast     #180                // class java/lang/Class
      10: astore        4
      12: aload         4
      14: astore_3
      15: aload         4
      17: ifnonnull     38
      20: aload_0
      21: invokevirtual #186                // Method android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
      24: aload_1
      25: invokevirtual #192                // Method java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
      28: astore_3
      29: getstatic     #119                // Field sClassMap:Landroid/support/v4/g/m;
      32: aload_1
      33: aload_3
      34: invokevirtual #196                // Method android/support/v4/g/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      37: pop
      38: aload_3
      39: iconst_0
      40: anewarray     #180                // class java/lang/Class
      43: invokevirtual #200                // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      46: iconst_0
      47: anewarray     #4                  // class java/lang/Object
      50: invokevirtual #206                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
      53: checkcast     #2                  // class android/support/v4/app/i
      56: astore_0
      57: aload_2
      58: ifnull        77
      61: aload_2
      62: aload_0
      63: invokevirtual #210                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      66: invokevirtual #211                // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      69: invokevirtual #217                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      72: aload_0
      73: aload_2
      74: invokevirtual #221                // Method setArguments:(Landroid/os/Bundle;)V
      77: aload_0
      78: areturn
      79: astore_0
      80: new           #223                // class java/lang/StringBuilder
      83: dup
      84: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      87: astore_2
      88: aload_2
      89: ldc           #226                // String Unable to instantiate fragment
      91: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: aload_2
      96: aload_1
      97: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     100: pop
     101: aload_2
     102: ldc           #232                // String : calling Fragment constructor caused an exception
     104: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     107: pop
     108: new           #19                 // class android/support/v4/app/i$b
     111: dup
     112: aload_2
     113: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     116: aload_0
     117: invokespecial #239                // Method android/support/v4/app/i$b."<init>":(Ljava/lang/String;Ljava/lang/Exception;)V
     120: athrow
     121: astore_0
     122: new           #223                // class java/lang/StringBuilder
     125: dup
     126: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
     129: astore_2
     130: aload_2
     131: ldc           #226                // String Unable to instantiate fragment
     133: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     136: pop
     137: aload_2
     138: aload_1
     139: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     142: pop
     143: aload_2
     144: ldc           #241                // String : could not find Fragment constructor
     146: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     149: pop
     150: new           #19                 // class android/support/v4/app/i$b
     153: dup
     154: aload_2
     155: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     158: aload_0
     159: invokespecial #239                // Method android/support/v4/app/i$b."<init>":(Ljava/lang/String;Ljava/lang/Exception;)V
     162: athrow
     163: astore_0
     164: new           #223                // class java/lang/StringBuilder
     167: dup
     168: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
     171: astore_2
     172: aload_2
     173: ldc           #226                // String Unable to instantiate fragment
     175: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     178: pop
     179: aload_2
     180: aload_1
     181: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     184: pop
     185: aload_2
     186: ldc           #243                // String : make sure class name exists, is public, and has an
     188: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     191: pop
     192: aload_2
     193: ldc           #245                // String  empty constructor that is public
     195: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     198: pop
     199: new           #19                 // class android/support/v4/app/i$b
     202: dup
     203: aload_2
     204: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     207: aload_0
     208: invokespecial #239                // Method android/support/v4/app/i$b."<init>":(Ljava/lang/String;Ljava/lang/Exception;)V
     211: athrow
     212: astore_0
     213: new           #223                // class java/lang/StringBuilder
     216: dup
     217: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
     220: astore_2
     221: aload_2
     222: ldc           #226                // String Unable to instantiate fragment
     224: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     227: pop
     228: aload_2
     229: aload_1
     230: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     233: pop
     234: aload_2
     235: ldc           #243                // String : make sure class name exists, is public, and has an
     237: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     240: pop
     241: aload_2
     242: ldc           #245                // String  empty constructor that is public
     244: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     247: pop
     248: new           #19                 // class android/support/v4/app/i$b
     251: dup
     252: aload_2
     253: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     256: aload_0
     257: invokespecial #239                // Method android/support/v4/app/i$b."<init>":(Ljava/lang/String;Ljava/lang/Exception;)V
     260: athrow
     261: astore_0
     262: new           #223                // class java/lang/StringBuilder
     265: dup
     266: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
     269: astore_2
     270: aload_2
     271: ldc           #226                // String Unable to instantiate fragment
     273: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     276: pop
     277: aload_2
     278: aload_1
     279: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     282: pop
     283: aload_2
     284: ldc           #243                // String : make sure class name exists, is public, and has an
     286: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     289: pop
     290: aload_2
     291: ldc           #245                // String  empty constructor that is public
     293: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     296: pop
     297: new           #19                 // class android/support/v4/app/i$b
     300: dup
     301: aload_2
     302: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     305: aload_0
     306: invokespecial #239                // Method android/support/v4/app/i$b."<init>":(Ljava/lang/String;Ljava/lang/Exception;)V
     309: athrow
    Exception table:
       from    to  target type
           0    12   261   Class java/lang/ClassNotFoundException
           0    12   212   Class java/lang/InstantiationException
           0    12   163   Class java/lang/IllegalAccessException
           0    12   121   Class java/lang/NoSuchMethodException
           0    12    79   Class java/lang/reflect/InvocationTargetException
          20    38   261   Class java/lang/ClassNotFoundException
          20    38   212   Class java/lang/InstantiationException
          20    38   163   Class java/lang/IllegalAccessException
          20    38   121   Class java/lang/NoSuchMethodException
          20    38    79   Class java/lang/reflect/InvocationTargetException
          38    57   261   Class java/lang/ClassNotFoundException
          38    57   212   Class java/lang/InstantiationException
          38    57   163   Class java/lang/IllegalAccessException
          38    57   121   Class java/lang/NoSuchMethodException
          38    57    79   Class java/lang/reflect/InvocationTargetException
          61    77   261   Class java/lang/ClassNotFoundException
          61    77   212   Class java/lang/InstantiationException
          61    77   163   Class java/lang/IllegalAccessException
          61    77   121   Class java/lang/NoSuchMethodException
          61    77    79   Class java/lang/reflect/InvocationTargetException

  static boolean isSupportFragmentClass(android.content.Context, java.lang.String);
    Code:
       0: getstatic     #119                // Field sClassMap:Landroid/support/v4/g/m;
       3: aload_1
       4: invokevirtual #178                // Method android/support/v4/g/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
       7: checkcast     #180                // class java/lang/Class
      10: astore        4
      12: aload         4
      14: astore_3
      15: aload         4
      17: ifnonnull     38
      20: aload_0
      21: invokevirtual #186                // Method android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
      24: aload_1
      25: invokevirtual #192                // Method java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
      28: astore_3
      29: getstatic     #119                // Field sClassMap:Landroid/support/v4/g/m;
      32: aload_1
      33: aload_3
      34: invokevirtual #196                // Method android/support/v4/g/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      37: pop
      38: ldc           #2                  // class android/support/v4/app/i
      40: aload_3
      41: invokevirtual #251                // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
      44: istore_2
      45: iload_2
      46: ireturn
      47: iconst_0
      48: ireturn
      49: astore_0
      50: goto          47
    Exception table:
       from    to  target type
           0    12    49   Class java/lang/ClassNotFoundException
          20    38    49   Class java/lang/ClassNotFoundException
          38    45    49   Class java/lang/ClassNotFoundException

  public void dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_3
       1: aload_1
       2: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
       5: aload_3
       6: ldc_w         #261                // String mFragmentId=#
       9: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      12: aload_3
      13: aload_0
      14: getfield      #263                // Field mFragmentId:I
      17: invokestatic  #269                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      20: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      23: aload_3
      24: ldc_w         #271                // String  mContainerId=#
      27: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      30: aload_3
      31: aload_0
      32: getfield      #273                // Field mContainerId:I
      35: invokestatic  #269                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      38: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      41: aload_3
      42: ldc_w         #275                // String  mTag=
      45: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      48: aload_3
      49: aload_0
      50: getfield      #277                // Field mTag:Ljava/lang/String;
      53: invokevirtual #280                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
      56: aload_3
      57: aload_1
      58: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      61: aload_3
      62: ldc_w         #282                // String mState=
      65: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      68: aload_3
      69: aload_0
      70: getfield      #125                // Field mState:I
      73: invokevirtual #285                // Method java/io/PrintWriter.print:(I)V
      76: aload_3
      77: ldc_w         #287                // String  mIndex=
      80: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      83: aload_3
      84: aload_0
      85: getfield      #127                // Field mIndex:I
      88: invokevirtual #285                // Method java/io/PrintWriter.print:(I)V
      91: aload_3
      92: ldc_w         #289                // String  mWho=
      95: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      98: aload_3
      99: aload_0
     100: getfield      #291                // Field mWho:Ljava/lang/String;
     103: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     106: aload_3
     107: ldc_w         #293                // String  mBackStackNesting=
     110: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     113: aload_3
     114: aload_0
     115: getfield      #295                // Field mBackStackNesting:I
     118: invokevirtual #297                // Method java/io/PrintWriter.println:(I)V
     121: aload_3
     122: aload_1
     123: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     126: aload_3
     127: ldc_w         #299                // String mAdded=
     130: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     133: aload_3
     134: aload_0
     135: getfield      #301                // Field mAdded:Z
     138: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     141: aload_3
     142: ldc_w         #306                // String  mRemoving=
     145: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     148: aload_3
     149: aload_0
     150: getfield      #308                // Field mRemoving:Z
     153: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     156: aload_3
     157: ldc_w         #310                // String  mFromLayout=
     160: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     163: aload_3
     164: aload_0
     165: getfield      #312                // Field mFromLayout:Z
     168: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     171: aload_3
     172: ldc_w         #314                // String  mInLayout=
     175: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     178: aload_3
     179: aload_0
     180: getfield      #316                // Field mInLayout:Z
     183: invokevirtual #318                // Method java/io/PrintWriter.println:(Z)V
     186: aload_3
     187: aload_1
     188: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     191: aload_3
     192: ldc_w         #320                // String mHidden=
     195: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     198: aload_3
     199: aload_0
     200: getfield      #322                // Field mHidden:Z
     203: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     206: aload_3
     207: ldc_w         #324                // String  mDetached=
     210: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     213: aload_3
     214: aload_0
     215: getfield      #326                // Field mDetached:Z
     218: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     221: aload_3
     222: ldc_w         #328                // String  mMenuVisible=
     225: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     228: aload_3
     229: aload_0
     230: getfield      #131                // Field mMenuVisible:Z
     233: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     236: aload_3
     237: ldc_w         #330                // String  mHasMenu=
     240: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     243: aload_3
     244: aload_0
     245: getfield      #332                // Field mHasMenu:Z
     248: invokevirtual #318                // Method java/io/PrintWriter.println:(Z)V
     251: aload_3
     252: aload_1
     253: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     256: aload_3
     257: ldc_w         #334                // String mRetainInstance=
     260: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     263: aload_3
     264: aload_0
     265: getfield      #336                // Field mRetainInstance:Z
     268: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     271: aload_3
     272: ldc_w         #338                // String  mRetaining=
     275: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     278: aload_3
     279: aload_0
     280: getfield      #340                // Field mRetaining:Z
     283: invokevirtual #304                // Method java/io/PrintWriter.print:(Z)V
     286: aload_3
     287: ldc_w         #342                // String  mUserVisibleHint=
     290: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     293: aload_3
     294: aload_0
     295: getfield      #133                // Field mUserVisibleHint:Z
     298: invokevirtual #318                // Method java/io/PrintWriter.println:(Z)V
     301: aload_0
     302: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
     305: ifnull        328
     308: aload_3
     309: aload_1
     310: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     313: aload_3
     314: ldc_w         #346                // String mFragmentManager=
     317: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     320: aload_3
     321: aload_0
     322: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
     325: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     328: aload_0
     329: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
     332: ifnull        355
     335: aload_3
     336: aload_1
     337: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     340: aload_3
     341: ldc_w         #353                // String mHost=
     344: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     347: aload_3
     348: aload_0
     349: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
     352: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     355: aload_0
     356: getfield      #355                // Field mParentFragment:Landroid/support/v4/app/i;
     359: ifnull        382
     362: aload_3
     363: aload_1
     364: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     367: aload_3
     368: ldc_w         #357                // String mParentFragment=
     371: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     374: aload_3
     375: aload_0
     376: getfield      #355                // Field mParentFragment:Landroid/support/v4/app/i;
     379: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     382: aload_0
     383: getfield      #359                // Field mArguments:Landroid/os/Bundle;
     386: ifnull        409
     389: aload_3
     390: aload_1
     391: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     394: aload_3
     395: ldc_w         #361                // String mArguments=
     398: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     401: aload_3
     402: aload_0
     403: getfield      #359                // Field mArguments:Landroid/os/Bundle;
     406: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     409: aload_0
     410: getfield      #363                // Field mSavedFragmentState:Landroid/os/Bundle;
     413: ifnull        436
     416: aload_3
     417: aload_1
     418: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     421: aload_3
     422: ldc_w         #365                // String mSavedFragmentState=
     425: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     428: aload_3
     429: aload_0
     430: getfield      #363                // Field mSavedFragmentState:Landroid/os/Bundle;
     433: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     436: aload_0
     437: getfield      #367                // Field mSavedViewState:Landroid/util/SparseArray;
     440: ifnull        463
     443: aload_3
     444: aload_1
     445: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     448: aload_3
     449: ldc_w         #369                // String mSavedViewState=
     452: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     455: aload_3
     456: aload_0
     457: getfield      #367                // Field mSavedViewState:Landroid/util/SparseArray;
     460: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     463: aload_0
     464: getfield      #371                // Field mTarget:Landroid/support/v4/app/i;
     467: ifnull        505
     470: aload_3
     471: aload_1
     472: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     475: aload_3
     476: ldc_w         #373                // String mTarget=
     479: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     482: aload_3
     483: aload_0
     484: getfield      #371                // Field mTarget:Landroid/support/v4/app/i;
     487: invokevirtual #375                // Method java/io/PrintWriter.print:(Ljava/lang/Object;)V
     490: aload_3
     491: ldc_w         #377                // String  mTargetRequestCode=
     494: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     497: aload_3
     498: aload_0
     499: getfield      #379                // Field mTargetRequestCode:I
     502: invokevirtual #297                // Method java/io/PrintWriter.println:(I)V
     505: aload_0
     506: invokevirtual #383                // Method getNextAnim:()I
     509: ifeq          532
     512: aload_3
     513: aload_1
     514: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     517: aload_3
     518: ldc_w         #385                // String mNextAnim=
     521: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     524: aload_3
     525: aload_0
     526: invokevirtual #383                // Method getNextAnim:()I
     529: invokevirtual #297                // Method java/io/PrintWriter.println:(I)V
     532: aload_0
     533: getfield      #387                // Field mContainer:Landroid/view/ViewGroup;
     536: ifnull        559
     539: aload_3
     540: aload_1
     541: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     544: aload_3
     545: ldc_w         #389                // String mContainer=
     548: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     551: aload_3
     552: aload_0
     553: getfield      #387                // Field mContainer:Landroid/view/ViewGroup;
     556: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     559: aload_0
     560: getfield      #391                // Field mView:Landroid/view/View;
     563: ifnull        586
     566: aload_3
     567: aload_1
     568: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     571: aload_3
     572: ldc_w         #393                // String mView=
     575: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     578: aload_3
     579: aload_0
     580: getfield      #391                // Field mView:Landroid/view/View;
     583: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     586: aload_0
     587: getfield      #395                // Field mInnerView:Landroid/view/View;
     590: ifnull        613
     593: aload_3
     594: aload_1
     595: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     598: aload_3
     599: ldc_w         #397                // String mInnerView=
     602: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     605: aload_3
     606: aload_0
     607: getfield      #391                // Field mView:Landroid/view/View;
     610: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     613: aload_0
     614: invokevirtual #401                // Method getAnimatingAway:()Landroid/view/View;
     617: ifnull        660
     620: aload_3
     621: aload_1
     622: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     625: aload_3
     626: ldc_w         #403                // String mAnimatingAway=
     629: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     632: aload_3
     633: aload_0
     634: invokevirtual #401                // Method getAnimatingAway:()Landroid/view/View;
     637: invokevirtual #349                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     640: aload_3
     641: aload_1
     642: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     645: aload_3
     646: ldc_w         #405                // String mStateAfterAnimating=
     649: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     652: aload_3
     653: aload_0
     654: invokevirtual #408                // Method getStateAfterAnimating:()I
     657: invokevirtual #297                // Method java/io/PrintWriter.println:(I)V
     660: aload_0
     661: getfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
     664: ifnull        724
     667: aload_3
     668: aload_1
     669: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     672: aload_3
     673: ldc_w         #412                // String Loader Manager:
     676: invokevirtual #280                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     679: aload_0
     680: getfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
     683: astore        5
     685: new           #223                // class java/lang/StringBuilder
     688: dup
     689: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
     692: astore        6
     694: aload         6
     696: aload_1
     697: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     700: pop
     701: aload         6
     703: ldc_w         #414                // String
     706: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     709: pop
     710: aload         5
     712: aload         6
     714: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     717: aload_2
     718: aload_3
     719: aload         4
     721: invokevirtual #418                // Method android/support/v4/app/LoaderManagerImpl.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
     724: aload_0
     725: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
     728: ifnull        827
     731: aload_3
     732: aload_1
     733: invokevirtual #259                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     736: new           #223                // class java/lang/StringBuilder
     739: dup
     740: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
     743: astore        5
     745: aload         5
     747: ldc_w         #422                // String Child
     750: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     753: pop
     754: aload         5
     756: aload_0
     757: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
     760: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     763: pop
     764: aload         5
     766: ldc_w         #427                // String :
     769: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     772: pop
     773: aload_3
     774: aload         5
     776: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     779: invokevirtual #280                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     782: aload_0
     783: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
     786: astore        5
     788: new           #223                // class java/lang/StringBuilder
     791: dup
     792: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
     795: astore        6
     797: aload         6
     799: aload_1
     800: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     803: pop
     804: aload         6
     806: ldc_w         #414                // String
     809: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     812: pop
     813: aload         5
     815: aload         6
     817: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     820: aload_2
     821: aload_3
     822: aload         4
     824: invokevirtual #430                // Method android/support/v4/app/o.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
     827: return

  public final boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #434                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
       5: ireturn

  android.support.v4.app.i findFragmentByWho(java.lang.String);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #291                // Field mWho:Ljava/lang/String;
       5: invokevirtual #439                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       8: ifeq          13
      11: aload_0
      12: areturn
      13: aload_0
      14: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      17: ifnull        29
      20: aload_0
      21: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      24: aload_1
      25: invokevirtual #441                // Method android/support/v4/app/o.b:(Ljava/lang/String;)Landroid/support/v4/app/i;
      28: areturn
      29: aconst_null
      30: areturn

  public final android.support.v4.app.j getActivity();
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      13: invokevirtual #449                // Method android/support/v4/app/m.h:()Landroid/app/Activity;
      16: checkcast     #451                // class android/support/v4/app/j
      19: areturn

  public boolean getAllowEnterTransitionOverlap();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnull        31
       7: aload_0
       8: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      11: invokestatic  #457                // Method android/support/v4/app/i$a.g:(Landroid/support/v4/app/i$a;)Ljava/lang/Boolean;
      14: ifnonnull     20
      17: goto          31
      20: aload_0
      21: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      24: invokestatic  #457                // Method android/support/v4/app/i$a.g:(Landroid/support/v4/app/i$a;)Ljava/lang/Boolean;
      27: invokevirtual #462                // Method java/lang/Boolean.booleanValue:()Z
      30: ireturn
      31: iconst_1
      32: ireturn

  public boolean getAllowReturnTransitionOverlap();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnull        31
       7: aload_0
       8: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      11: invokestatic  #465                // Method android/support/v4/app/i$a.h:(Landroid/support/v4/app/i$a;)Ljava/lang/Boolean;
      14: ifnonnull     20
      17: goto          31
      20: aload_0
      21: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      24: invokestatic  #465                // Method android/support/v4/app/i$a.h:(Landroid/support/v4/app/i$a;)Ljava/lang/Boolean;
      27: invokevirtual #462                // Method java/lang/Boolean.booleanValue:()Z
      30: ireturn
      31: iconst_1
      32: ireturn

  android.view.View getAnimatingAway();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #467                // Field android/support/v4/app/i$a.a:Landroid/view/View;
      16: areturn

  android.animation.Animator getAnimator();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #472                // Field android/support/v4/app/i$a.b:Landroid/animation/Animator;
      16: areturn

  public final android.os.Bundle getArguments();
    Code:
       0: aload_0
       1: getfield      #359                // Field mArguments:Landroid/os/Bundle;
       4: areturn

  public final android.support.v4.app.n getChildFragmentManager();
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnonnull     80
       7: aload_0
       8: invokevirtual #479                // Method instantiateChildFragmentManager:()V
      11: aload_0
      12: getfield      #125                // Field mState:I
      15: iconst_5
      16: if_icmplt     29
      19: aload_0
      20: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      23: invokevirtual #482                // Method android/support/v4/app/o.q:()V
      26: goto          80
      29: aload_0
      30: getfield      #125                // Field mState:I
      33: iconst_4
      34: if_icmplt     47
      37: aload_0
      38: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      41: invokevirtual #485                // Method android/support/v4/app/o.p:()V
      44: goto          80
      47: aload_0
      48: getfield      #125                // Field mState:I
      51: iconst_2
      52: if_icmplt     65
      55: aload_0
      56: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      59: invokevirtual #488                // Method android/support/v4/app/o.o:()V
      62: goto          80
      65: aload_0
      66: getfield      #125                // Field mState:I
      69: iconst_1
      70: if_icmplt     80
      73: aload_0
      74: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      77: invokevirtual #491                // Method android/support/v4/app/o.n:()V
      80: aload_0
      81: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      84: areturn

  public android.content.Context getContext();
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      13: invokevirtual #495                // Method android/support/v4/app/m.i:()Landroid/content/Context;
      16: areturn

  public java.lang.Object getEnterTransition();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: invokestatic  #500                // Method android/support/v4/app/i$a.a:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      16: areturn

  android.support.v4.app.ah getEnterTransitionCallback();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #505                // Field android/support/v4/app/i$a.g:Landroid/support/v4/app/ah;
      16: areturn

  public java.lang.Object getExitTransition();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: invokestatic  #508                // Method android/support/v4/app/i$a.c:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      16: areturn

  android.support.v4.app.ah getExitTransitionCallback();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #511                // Field android/support/v4/app/i$a.h:Landroid/support/v4/app/ah;
      16: areturn

  public final android.support.v4.app.n getFragmentManager();
    Code:
       0: aload_0
       1: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
       4: areturn

  public final java.lang.Object getHost();
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      13: invokevirtual #515                // Method android/support/v4/app/m.g:()Ljava/lang/Object;
      16: areturn

  public final int getId();
    Code:
       0: aload_0
       1: getfield      #263                // Field mFragmentId:I
       4: ireturn

  public final android.view.LayoutInflater getLayoutInflater();
    Code:
       0: aload_0
       1: getfield      #520                // Field mLayoutInflater:Landroid/view/LayoutInflater;
       4: ifnonnull     13
       7: aload_0
       8: aconst_null
       9: invokevirtual #524                // Method performGetLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
      12: areturn
      13: aload_0
      14: getfield      #520                // Field mLayoutInflater:Landroid/view/LayoutInflater;
      17: areturn

  public android.view.LayoutInflater getLayoutInflater(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     18
       7: new           #527                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #529                // String onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.
      14: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      22: invokevirtual #533                // Method android/support/v4/app/m.b:()Landroid/view/LayoutInflater;
      25: astore_1
      26: aload_0
      27: invokevirtual #535                // Method getChildFragmentManager:()Landroid/support/v4/app/n;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      36: invokevirtual #539                // Method android/support/v4/app/o.y:()Landroid/view/LayoutInflater$Factory2;
      39: invokestatic  #544                // Method android/support/v4/view/f.b:(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V
      42: aload_1
      43: areturn

  public android.arch.lifecycle.c getLifecycle();
    Code:
       0: aload_0
       1: getfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
       4: areturn

  public android.support.v4.app.z getLoaderManager();
    Code:
       0: aload_0
       1: getfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
       4: ifnull        12
       7: aload_0
       8: getfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
      11: areturn
      12: aload_0
      13: new           #416                // class android/support/v4/app/LoaderManagerImpl
      16: dup
      17: aload_0
      18: aload_0
      19: invokevirtual #553                // Method getViewModelStore:()Landroid/arch/lifecycle/p;
      22: invokespecial #556                // Method android/support/v4/app/LoaderManagerImpl."<init>":(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/p;)V
      25: putfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
      28: aload_0
      29: getfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
      32: areturn

  int getNextAnim();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #558                // Field android/support/v4/app/i$a.d:I
      16: ireturn

  int getNextTransition();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #562                // Field android/support/v4/app/i$a.e:I
      16: ireturn

  int getNextTransitionStyle();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #566                // Field android/support/v4/app/i$a.f:I
      16: ireturn

  public final android.support.v4.app.i getParentFragment();
    Code:
       0: aload_0
       1: getfield      #355                // Field mParentFragment:Landroid/support/v4/app/i;
       4: areturn

  public java.lang.Object getReenterTransition();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: invokestatic  #571                // Method android/support/v4/app/i$a.d:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      16: getstatic     #122                // Field USE_DEFAULT_TRANSITION:Ljava/lang/Object;
      19: if_acmpne     27
      22: aload_0
      23: invokevirtual #573                // Method getExitTransition:()Ljava/lang/Object;
      26: areturn
      27: aload_0
      28: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      31: invokestatic  #571                // Method android/support/v4/app/i$a.d:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      34: areturn

  public final android.content.res.Resources getResources();
    Code:
       0: aload_0
       1: invokevirtual #578                // Method requireContext:()Landroid/content/Context;
       4: invokevirtual #580                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       7: areturn

  public final boolean getRetainInstance();
    Code:
       0: aload_0
       1: getfield      #336                // Field mRetainInstance:Z
       4: ireturn

  public java.lang.Object getReturnTransition();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: invokestatic  #584                // Method android/support/v4/app/i$a.b:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      16: getstatic     #122                // Field USE_DEFAULT_TRANSITION:Ljava/lang/Object;
      19: if_acmpne     27
      22: aload_0
      23: invokevirtual #586                // Method getEnterTransition:()Ljava/lang/Object;
      26: areturn
      27: aload_0
      28: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      31: invokestatic  #584                // Method android/support/v4/app/i$a.b:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      34: areturn

  public java.lang.Object getSharedElementEnterTransition();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: invokestatic  #589                // Method android/support/v4/app/i$a.e:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      16: areturn

  public java.lang.Object getSharedElementReturnTransition();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: invokestatic  #592                // Method android/support/v4/app/i$a.f:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      16: getstatic     #122                // Field USE_DEFAULT_TRANSITION:Ljava/lang/Object;
      19: if_acmpne     27
      22: aload_0
      23: invokevirtual #594                // Method getSharedElementEnterTransition:()Ljava/lang/Object;
      26: areturn
      27: aload_0
      28: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      31: invokestatic  #592                // Method android/support/v4/app/i$a.f:(Landroid/support/v4/app/i$a;)Ljava/lang/Object;
      34: areturn

  int getStateAfterAnimating();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #596                // Field android/support/v4/app/i$a.c:I
      16: ireturn

  public final java.lang.String getString(int);
    Code:
       0: aload_0
       1: invokevirtual #598                // Method getResources:()Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #602                // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
       8: areturn

  public final java.lang.String getString(int, java.lang.Object...);
    Code:
       0: aload_0
       1: invokevirtual #598                // Method getResources:()Landroid/content/res/Resources;
       4: iload_1
       5: aload_2
       6: invokevirtual #605                // Method android/content/res/Resources.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
       9: areturn

  public final java.lang.String getTag();
    Code:
       0: aload_0
       1: getfield      #277                // Field mTag:Ljava/lang/String;
       4: areturn

  public final android.support.v4.app.i getTargetFragment();
    Code:
       0: aload_0
       1: getfield      #371                // Field mTarget:Landroid/support/v4/app/i;
       4: areturn

  public final int getTargetRequestCode();
    Code:
       0: aload_0
       1: getfield      #379                // Field mTargetRequestCode:I
       4: ireturn

  public final java.lang.CharSequence getText(int);
    Code:
       0: aload_0
       1: invokevirtual #598                // Method getResources:()Landroid/content/res/Resources;
       4: iload_1
       5: invokevirtual #612                // Method android/content/res/Resources.getText:(I)Ljava/lang/CharSequence;
       8: areturn

  public boolean getUserVisibleHint();
    Code:
       0: aload_0
       1: getfield      #133                // Field mUserVisibleHint:Z
       4: ireturn

  public android.view.View getView();
    Code:
       0: aload_0
       1: getfield      #391                // Field mView:Landroid/view/View;
       4: areturn

  public android.arch.lifecycle.p getViewModelStore();
    Code:
       0: aload_0
       1: invokevirtual #616                // Method getContext:()Landroid/content/Context;
       4: ifnonnull     18
       7: new           #527                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #618                // String Can't access ViewModels from detached fragment
      14: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: getfield      #620                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      22: ifnonnull     36
      25: aload_0
      26: new           #622                // class android/arch/lifecycle/p
      29: dup
      30: invokespecial #623                // Method android/arch/lifecycle/p."<init>":()V
      33: putfield      #620                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      36: aload_0
      37: getfield      #620                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      40: areturn

  public final boolean hasOptionsMenu();
    Code:
       0: aload_0
       1: getfield      #332                // Field mHasMenu:Z
       4: ireturn

  public final int hashCode();
    Code:
       0: aload_0
       1: invokespecial #627                // Method java/lang/Object.hashCode:()I
       4: ireturn

  void initState();
    Code:
       0: aload_0
       1: iconst_m1
       2: putfield      #127                // Field mIndex:I
       5: aload_0
       6: aconst_null
       7: putfield      #291                // Field mWho:Ljava/lang/String;
      10: aload_0
      11: iconst_0
      12: putfield      #301                // Field mAdded:Z
      15: aload_0
      16: iconst_0
      17: putfield      #308                // Field mRemoving:Z
      20: aload_0
      21: iconst_0
      22: putfield      #312                // Field mFromLayout:Z
      25: aload_0
      26: iconst_0
      27: putfield      #316                // Field mInLayout:Z
      30: aload_0
      31: iconst_0
      32: putfield      #630                // Field mRestored:Z
      35: aload_0
      36: iconst_0
      37: putfield      #295                // Field mBackStackNesting:I
      40: aload_0
      41: aconst_null
      42: putfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
      45: aload_0
      46: aconst_null
      47: putfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      50: aload_0
      51: aconst_null
      52: putfield      #351                // Field mHost:Landroid/support/v4/app/m;
      55: aload_0
      56: iconst_0
      57: putfield      #263                // Field mFragmentId:I
      60: aload_0
      61: iconst_0
      62: putfield      #273                // Field mContainerId:I
      65: aload_0
      66: aconst_null
      67: putfield      #277                // Field mTag:Ljava/lang/String;
      70: aload_0
      71: iconst_0
      72: putfield      #322                // Field mHidden:Z
      75: aload_0
      76: iconst_0
      77: putfield      #326                // Field mDetached:Z
      80: aload_0
      81: iconst_0
      82: putfield      #340                // Field mRetaining:Z
      85: return

  void instantiateChildFragmentManager();
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     18
       7: new           #527                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #632                // String Fragment has not been attached yet.
      14: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: new           #429                // class android/support/v4/app/o
      22: dup
      23: invokespecial #633                // Method android/support/v4/app/o."<init>":()V
      26: putfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      29: aload_0
      30: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      33: aload_0
      34: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      37: new           #14                 // class android/support/v4/app/i$2
      40: dup
      41: aload_0
      42: invokespecial #635                // Method android/support/v4/app/i$2."<init>":(Landroid/support/v4/app/i;)V
      45: aload_0
      46: invokevirtual #638                // Method android/support/v4/app/o.a:(Landroid/support/v4/app/m;Landroid/support/v4/app/k;Landroid/support/v4/app/i;)V
      49: return

  public final boolean isAdded();
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnull        16
       7: aload_0
       8: getfield      #301                // Field mAdded:Z
      11: ifeq          16
      14: iconst_1
      15: ireturn
      16: iconst_0
      17: ireturn

  public final boolean isDetached();
    Code:
       0: aload_0
       1: getfield      #326                // Field mDetached:Z
       4: ireturn

  public final boolean isHidden();
    Code:
       0: aload_0
       1: getfield      #322                // Field mHidden:Z
       4: ireturn

  boolean isHideReplaced();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #645                // Field android/support/v4/app/i$a.k:Z
      16: ireturn

  final boolean isInBackStack();
    Code:
       0: aload_0
       1: getfield      #295                // Field mBackStackNesting:I
       4: ifle          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public final boolean isInLayout();
    Code:
       0: aload_0
       1: getfield      #316                // Field mInLayout:Z
       4: ireturn

  public final boolean isMenuVisible();
    Code:
       0: aload_0
       1: getfield      #131                // Field mMenuVisible:Z
       4: ireturn

  boolean isPostponed();
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      13: getfield      #150                // Field android/support/v4/app/i$a.i:Z
      16: ireturn

  public final boolean isRemoving();
    Code:
       0: aload_0
       1: getfield      #308                // Field mRemoving:Z
       4: ireturn

  public final boolean isResumed();
    Code:
       0: aload_0
       1: getfield      #125                // Field mState:I
       4: iconst_5
       5: if_icmplt     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public final boolean isStateSaved();
    Code:
       0: aload_0
       1: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
      13: invokevirtual #654                // Method android/support/v4/app/o.e:()Z
      16: ireturn

  public final boolean isVisible();
    Code:
       0: aload_0
       1: invokevirtual #657                // Method isAdded:()Z
       4: ifeq          43
       7: aload_0
       8: invokevirtual #659                // Method isHidden:()Z
      11: ifne          43
      14: aload_0
      15: getfield      #391                // Field mView:Landroid/view/View;
      18: ifnull        43
      21: aload_0
      22: getfield      #391                // Field mView:Landroid/view/View;
      25: invokevirtual #665                // Method android/view/View.getWindowToken:()Landroid/os/IBinder;
      28: ifnull        43
      31: aload_0
      32: getfield      #391                // Field mView:Landroid/view/View;
      35: invokevirtual #668                // Method android/view/View.getVisibility:()I
      38: ifne          43
      41: iconst_1
      42: ireturn
      43: iconst_0
      44: ireturn

  void noteStateNotSaved();
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        14
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #672                // Method android/support/v4/app/o.m:()V
      14: return

  public void onActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onActivityResult(int, int, android.content.Intent);
    Code:
       0: return

  public void onAttach(android.app.Activity);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: aload_0
       6: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       9: ifnonnull     17
      12: aconst_null
      13: astore_1
      14: goto          25
      17: aload_0
      18: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      21: invokevirtual #449                // Method android/support/v4/app/m.h:()Landroid/app/Activity;
      24: astore_1
      25: aload_1
      26: ifnull        39
      29: aload_0
      30: iconst_0
      31: putfield      #675                // Field mCalled:Z
      34: aload_0
      35: aload_1
      36: invokevirtual #682                // Method onAttach:(Landroid/app/Activity;)V
      39: return

  public void onAttachFragment(android.support.v4.app.i);
    Code:
       0: return

  public void onConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public boolean onContextItemSelected(android.view.MenuItem);
    Code:
       0: iconst_0
       1: ireturn

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: aload_0
       6: aload_1
       7: invokevirtual #691                // Method restoreChildFragmentState:(Landroid/os/Bundle;)V
      10: aload_0
      11: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      14: ifnull        35
      17: aload_0
      18: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      21: iconst_1
      22: invokevirtual #694                // Method android/support/v4/app/o.a:(I)Z
      25: ifne          35
      28: aload_0
      29: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      32: invokevirtual #491                // Method android/support/v4/app/o.n:()V
      35: return

  public android.view.animation.Animation onCreateAnimation(int, boolean, int);
    Code:
       0: aconst_null
       1: areturn

  public android.animation.Animator onCreateAnimator(int, boolean, int);
    Code:
       0: aconst_null
       1: areturn

  public void onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo);
    Code:
       0: aload_0
       1: invokevirtual #702                // Method getActivity:()Landroid/support/v4/app/j;
       4: aload_1
       5: aload_2
       6: aload_3
       7: invokevirtual #704                // Method android/support/v4/app/j.onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
      10: return

  public void onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater);
    Code:
       0: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aconst_null
       1: areturn

  public void onDestroy();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: aload_0
       6: getfield      #620                // Field mViewModelStore:Landroid/arch/lifecycle/p;
       9: ifnull        32
      12: aload_0
      13: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      16: getfield      #711                // Field android/support/v4/app/m.d:Landroid/support/v4/app/o;
      19: getfield      #714                // Field android/support/v4/app/o.s:Z
      22: ifne          32
      25: aload_0
      26: getfield      #620                // Field mViewModelStore:Landroid/arch/lifecycle/p;
      29: invokevirtual #715                // Method android/arch/lifecycle/p.a:()V
      32: return

  public void onDestroyOptionsMenu();
    Code:
       0: return

  public void onDestroyView();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onDetach();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #721                // Method getLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
       5: areturn

  public void onHiddenChanged(boolean);
    Code:
       0: return

  public void onInflate(android.app.Activity, android.util.AttributeSet, android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onInflate(android.content.Context, android.util.AttributeSet, android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: aload_0
       6: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       9: ifnonnull     17
      12: aconst_null
      13: astore_1
      14: goto          25
      17: aload_0
      18: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      21: invokevirtual #449                // Method android/support/v4/app/m.h:()Landroid/app/Activity;
      24: astore_1
      25: aload_1
      26: ifnull        41
      29: aload_0
      30: iconst_0
      31: putfield      #675                // Field mCalled:Z
      34: aload_0
      35: aload_1
      36: aload_2
      37: aload_3
      38: invokevirtual #727                // Method onInflate:(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
      41: return

  public void onLowMemory();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onMultiWindowModeChanged(boolean);
    Code:
       0: return

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: iconst_0
       1: ireturn

  public void onOptionsMenuClosed(android.view.Menu);
    Code:
       0: return

  public void onPause();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onPictureInPictureModeChanged(boolean);
    Code:
       0: return

  public void onPrepareOptionsMenu(android.view.Menu);
    Code:
       0: return

  public void onRequestPermissionsResult(int, java.lang.String[], int[]);
    Code:
       0: return

  public void onResume();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onSaveInstanceState(android.os.Bundle);
    Code:
       0: return

  public void onStart();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onStop();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: return

  public void onViewStateRestored(android.os.Bundle);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #675                // Field mCalled:Z
       5: return

  android.support.v4.app.n peekChildFragmentManager();
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: areturn

  void performActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        14
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #672                // Method android/support/v4/app/o.m:()V
      14: aload_0
      15: iconst_2
      16: putfield      #125                // Field mState:I
      19: aload_0
      20: iconst_0
      21: putfield      #675                // Field mCalled:Z
      24: aload_0
      25: aload_1
      26: invokevirtual #748                // Method onActivityCreated:(Landroid/os/Bundle;)V
      29: aload_0
      30: getfield      #675                // Field mCalled:Z
      33: ifne          78
      36: new           #223                // class java/lang/StringBuilder
      39: dup
      40: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      43: astore_1
      44: aload_1
      45: ldc_w         #750                // String Fragment
      48: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload_1
      53: aload_0
      54: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      57: pop
      58: aload_1
      59: ldc_w         #752                // String  did not call through to super.onActivityCreated()
      62: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      65: pop
      66: new           #754                // class android/support/v4/app/ai
      69: dup
      70: aload_1
      71: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      74: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      77: athrow
      78: aload_0
      79: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      82: ifnull        92
      85: aload_0
      86: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      89: invokevirtual #488                // Method android/support/v4/app/o.o:()V
      92: return

  void performConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #758                // Method onConfigurationChanged:(Landroid/content/res/Configuration;)V
       5: aload_0
       6: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       9: ifnull        20
      12: aload_0
      13: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      16: aload_1
      17: invokevirtual #760                // Method android/support/v4/app/o.a:(Landroid/content/res/Configuration;)V
      20: return

  boolean performContextItemSelected(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #322                // Field mHidden:Z
       4: ifne          37
       7: aload_0
       8: aload_1
       9: invokevirtual #763                // Method onContextItemSelected:(Landroid/view/MenuItem;)Z
      12: ifeq          17
      15: iconst_1
      16: ireturn
      17: aload_0
      18: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      21: ifnull        37
      24: aload_0
      25: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      28: aload_1
      29: invokevirtual #765                // Method android/support/v4/app/o.b:(Landroid/view/MenuItem;)Z
      32: ifeq          37
      35: iconst_1
      36: ireturn
      37: iconst_0
      38: ireturn

  void performCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        14
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #672                // Method android/support/v4/app/o.m:()V
      14: aload_0
      15: iconst_1
      16: putfield      #125                // Field mState:I
      19: aload_0
      20: iconst_0
      21: putfield      #675                // Field mCalled:Z
      24: aload_0
      25: aload_1
      26: invokevirtual #768                // Method onCreate:(Landroid/os/Bundle;)V
      29: aload_0
      30: iconst_1
      31: putfield      #770                // Field mIsCreated:Z
      34: aload_0
      35: getfield      #675                // Field mCalled:Z
      38: ifne          83
      41: new           #223                // class java/lang/StringBuilder
      44: dup
      45: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      48: astore_1
      49: aload_1
      50: ldc_w         #750                // String Fragment
      53: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      56: pop
      57: aload_1
      58: aload_0
      59: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: ldc_w         #772                // String  did not call through to super.onCreate()
      67: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      70: pop
      71: new           #754                // class android/support/v4/app/ai
      74: dup
      75: aload_1
      76: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      79: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      82: athrow
      83: aload_0
      84: getfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
      87: getstatic     #778                // Field android/arch/lifecycle/c$a.ON_CREATE:Landroid/arch/lifecycle/c$a;
      90: invokevirtual #781                // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$a;)V
      93: return

  boolean performCreateOptionsMenu(android.view.Menu, android.view.MenuInflater);
    Code:
       0: aload_0
       1: getfield      #322                // Field mHidden:Z
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iconst_0
       9: istore        5
      11: iload         4
      13: ifne          70
      16: iload         5
      18: istore        4
      20: aload_0
      21: getfield      #332                // Field mHasMenu:Z
      24: ifeq          47
      27: iload         5
      29: istore        4
      31: aload_0
      32: getfield      #131                // Field mMenuVisible:Z
      35: ifeq          47
      38: iconst_1
      39: istore        4
      41: aload_0
      42: aload_1
      43: aload_2
      44: invokevirtual #785                // Method onCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)V
      47: iload         4
      49: istore_3
      50: aload_0
      51: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      54: ifnull        70
      57: iload         4
      59: aload_0
      60: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      63: aload_1
      64: aload_2
      65: invokevirtual #787                // Method android/support/v4/app/o.a:(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
      68: ior
      69: istore_3
      70: iload_3
      71: ireturn

  android.view.View performCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        14
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #672                // Method android/support/v4/app/o.m:()V
      14: aload_0
      15: iconst_1
      16: putfield      #790                // Field mPerformedCreateView:Z
      19: aload_0
      20: aload_1
      21: aload_2
      22: aload_3
      23: invokevirtual #792                // Method onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
      26: areturn

  void performDestroy();
    Code:
       0: aload_0
       1: getfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
       4: getstatic     #796                // Field android/arch/lifecycle/c$a.ON_DESTROY:Landroid/arch/lifecycle/c$a;
       7: invokevirtual #781                // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$a;)V
      10: aload_0
      11: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      14: ifnull        24
      17: aload_0
      18: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      21: invokevirtual #799                // Method android/support/v4/app/o.v:()V
      24: aload_0
      25: iconst_0
      26: putfield      #125                // Field mState:I
      29: aload_0
      30: iconst_0
      31: putfield      #675                // Field mCalled:Z
      34: aload_0
      35: iconst_0
      36: putfield      #770                // Field mIsCreated:Z
      39: aload_0
      40: invokevirtual #801                // Method onDestroy:()V
      43: aload_0
      44: getfield      #675                // Field mCalled:Z
      47: ifne          92
      50: new           #223                // class java/lang/StringBuilder
      53: dup
      54: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      57: astore_1
      58: aload_1
      59: ldc_w         #750                // String Fragment
      62: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      65: pop
      66: aload_1
      67: aload_0
      68: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      71: pop
      72: aload_1
      73: ldc_w         #803                // String  did not call through to super.onDestroy()
      76: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: new           #754                // class android/support/v4/app/ai
      83: dup
      84: aload_1
      85: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      88: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      91: athrow
      92: aload_0
      93: aconst_null
      94: putfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      97: return

  void performDestroyView();
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        14
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #807                // Method android/support/v4/app/o.u:()V
      14: aload_0
      15: iconst_1
      16: putfield      #125                // Field mState:I
      19: aload_0
      20: iconst_0
      21: putfield      #675                // Field mCalled:Z
      24: aload_0
      25: invokevirtual #809                // Method onDestroyView:()V
      28: aload_0
      29: getfield      #675                // Field mCalled:Z
      32: ifne          77
      35: new           #223                // class java/lang/StringBuilder
      38: dup
      39: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      42: astore_1
      43: aload_1
      44: ldc_w         #750                // String Fragment
      47: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: pop
      51: aload_1
      52: aload_0
      53: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      56: pop
      57: aload_1
      58: ldc_w         #811                // String  did not call through to super.onDestroyView()
      61: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      64: pop
      65: new           #754                // class android/support/v4/app/ai
      68: dup
      69: aload_1
      70: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      73: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      76: athrow
      77: aload_0
      78: getfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
      81: ifnull        91
      84: aload_0
      85: getfield      #410                // Field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
      88: invokevirtual #812                // Method android/support/v4/app/LoaderManagerImpl.a:()V
      91: aload_0
      92: iconst_0
      93: putfield      #790                // Field mPerformedCreateView:Z
      96: return

  void performDetach();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #675                // Field mCalled:Z
       5: aload_0
       6: invokevirtual #815                // Method onDetach:()V
       9: aload_0
      10: aconst_null
      11: putfield      #520                // Field mLayoutInflater:Landroid/view/LayoutInflater;
      14: aload_0
      15: getfield      #675                // Field mCalled:Z
      18: ifne          63
      21: new           #223                // class java/lang/StringBuilder
      24: dup
      25: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      28: astore_1
      29: aload_1
      30: ldc_w         #750                // String Fragment
      33: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: aload_1
      38: aload_0
      39: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      42: pop
      43: aload_1
      44: ldc_w         #817                // String  did not call through to super.onDetach()
      47: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: pop
      51: new           #754                // class android/support/v4/app/ai
      54: dup
      55: aload_1
      56: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      59: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      62: athrow
      63: aload_0
      64: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      67: ifnull        139
      70: aload_0
      71: getfield      #340                // Field mRetaining:Z
      74: ifne          127
      77: new           #223                // class java/lang/StringBuilder
      80: dup
      81: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      84: astore_1
      85: aload_1
      86: ldc_w         #819                // String Child FragmentManager of
      89: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      92: pop
      93: aload_1
      94: aload_0
      95: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      98: pop
      99: aload_1
     100: ldc_w         #821                // String  was not
     103: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     106: pop
     107: aload_1
     108: ldc_w         #823                // String  destroyed and this fragment is not retaining instance
     111: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     114: pop
     115: new           #527                // class java/lang/IllegalStateException
     118: dup
     119: aload_1
     120: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     123: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     126: athrow
     127: aload_0
     128: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
     131: invokevirtual #799                // Method android/support/v4/app/o.v:()V
     134: aload_0
     135: aconst_null
     136: putfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
     139: return

  android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_0
       2: aload_1
       3: invokevirtual #825                // Method onGetLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
       6: putfield      #520                // Field mLayoutInflater:Landroid/view/LayoutInflater;
       9: aload_0
      10: getfield      #520                // Field mLayoutInflater:Landroid/view/LayoutInflater;
      13: areturn

  void performLowMemory();
    Code:
       0: aload_0
       1: invokevirtual #828                // Method onLowMemory:()V
       4: aload_0
       5: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       8: ifnull        18
      11: aload_0
      12: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      15: invokevirtual #831                // Method android/support/v4/app/o.w:()V
      18: return

  void performMultiWindowModeChanged(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #834                // Method onMultiWindowModeChanged:(Z)V
       5: aload_0
       6: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       9: ifnull        20
      12: aload_0
      13: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      16: iload_1
      17: invokevirtual #836                // Method android/support/v4/app/o.a:(Z)V
      20: return

  boolean performOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #322                // Field mHidden:Z
       4: ifne          51
       7: aload_0
       8: getfield      #332                // Field mHasMenu:Z
      11: ifeq          31
      14: aload_0
      15: getfield      #131                // Field mMenuVisible:Z
      18: ifeq          31
      21: aload_0
      22: aload_1
      23: invokevirtual #839                // Method onOptionsItemSelected:(Landroid/view/MenuItem;)Z
      26: ifeq          31
      29: iconst_1
      30: ireturn
      31: aload_0
      32: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      35: ifnull        51
      38: aload_0
      39: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      42: aload_1
      43: invokevirtual #841                // Method android/support/v4/app/o.a:(Landroid/view/MenuItem;)Z
      46: ifeq          51
      49: iconst_1
      50: ireturn
      51: iconst_0
      52: ireturn

  void performOptionsMenuClosed(android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #322                // Field mHidden:Z
       4: ifne          41
       7: aload_0
       8: getfield      #332                // Field mHasMenu:Z
      11: ifeq          26
      14: aload_0
      15: getfield      #131                // Field mMenuVisible:Z
      18: ifeq          26
      21: aload_0
      22: aload_1
      23: invokevirtual #844                // Method onOptionsMenuClosed:(Landroid/view/Menu;)V
      26: aload_0
      27: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      30: ifnull        41
      33: aload_0
      34: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      37: aload_1
      38: invokevirtual #846                // Method android/support/v4/app/o.b:(Landroid/view/Menu;)V
      41: return

  void performPause();
    Code:
       0: aload_0
       1: getfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
       4: getstatic     #850                // Field android/arch/lifecycle/c$a.ON_PAUSE:Landroid/arch/lifecycle/c$a;
       7: invokevirtual #781                // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$a;)V
      10: aload_0
      11: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      14: ifnull        24
      17: aload_0
      18: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      21: invokevirtual #853                // Method android/support/v4/app/o.r:()V
      24: aload_0
      25: iconst_4
      26: putfield      #125                // Field mState:I
      29: aload_0
      30: iconst_0
      31: putfield      #675                // Field mCalled:Z
      34: aload_0
      35: invokevirtual #855                // Method onPause:()V
      38: aload_0
      39: getfield      #675                // Field mCalled:Z
      42: ifne          87
      45: new           #223                // class java/lang/StringBuilder
      48: dup
      49: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      52: astore_1
      53: aload_1
      54: ldc_w         #750                // String Fragment
      57: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: pop
      61: aload_1
      62: aload_0
      63: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      66: pop
      67: aload_1
      68: ldc_w         #857                // String  did not call through to super.onPause()
      71: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: new           #754                // class android/support/v4/app/ai
      78: dup
      79: aload_1
      80: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      83: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      86: athrow
      87: return

  void performPictureInPictureModeChanged(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #860                // Method onPictureInPictureModeChanged:(Z)V
       5: aload_0
       6: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       9: ifnull        20
      12: aload_0
      13: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      16: iload_1
      17: invokevirtual #862                // Method android/support/v4/app/o.b:(Z)V
      20: return

  boolean performPrepareOptionsMenu(android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #322                // Field mHidden:Z
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iconst_0
       8: istore        4
      10: iload_3
      11: ifne          61
      14: iload         4
      16: istore_3
      17: aload_0
      18: getfield      #332                // Field mHasMenu:Z
      21: ifeq          41
      24: iload         4
      26: istore_3
      27: aload_0
      28: getfield      #131                // Field mMenuVisible:Z
      31: ifeq          41
      34: iconst_1
      35: istore_3
      36: aload_0
      37: aload_1
      38: invokevirtual #866                // Method onPrepareOptionsMenu:(Landroid/view/Menu;)V
      41: iload_3
      42: istore_2
      43: aload_0
      44: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      47: ifnull        61
      50: iload_3
      51: aload_0
      52: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      55: aload_1
      56: invokevirtual #868                // Method android/support/v4/app/o.a:(Landroid/view/Menu;)Z
      59: ior
      60: istore_2
      61: iload_2
      62: ireturn

  void performReallyStop();
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        14
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #872                // Method android/support/v4/app/o.t:()V
      14: aload_0
      15: iconst_2
      16: putfield      #125                // Field mState:I
      19: return

  void performResume();
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        22
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #672                // Method android/support/v4/app/o.m:()V
      14: aload_0
      15: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      18: invokevirtual #875                // Method android/support/v4/app/o.g:()Z
      21: pop
      22: aload_0
      23: iconst_5
      24: putfield      #125                // Field mState:I
      27: aload_0
      28: iconst_0
      29: putfield      #675                // Field mCalled:Z
      32: aload_0
      33: invokevirtual #877                // Method onResume:()V
      36: aload_0
      37: getfield      #675                // Field mCalled:Z
      40: ifne          85
      43: new           #223                // class java/lang/StringBuilder
      46: dup
      47: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      50: astore_1
      51: aload_1
      52: ldc_w         #750                // String Fragment
      55: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      58: pop
      59: aload_1
      60: aload_0
      61: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      64: pop
      65: aload_1
      66: ldc_w         #879                // String  did not call through to super.onResume()
      69: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      72: pop
      73: new           #754                // class android/support/v4/app/ai
      76: dup
      77: aload_1
      78: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      81: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      84: athrow
      85: aload_0
      86: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      89: ifnull        107
      92: aload_0
      93: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      96: invokevirtual #482                // Method android/support/v4/app/o.q:()V
      99: aload_0
     100: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
     103: invokevirtual #875                // Method android/support/v4/app/o.g:()Z
     106: pop
     107: aload_0
     108: getfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
     111: getstatic     #882                // Field android/arch/lifecycle/c$a.ON_RESUME:Landroid/arch/lifecycle/c$a;
     114: invokevirtual #781                // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$a;)V
     117: return

  void performSaveInstanceState(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #885                // Method onSaveInstanceState:(Landroid/os/Bundle;)V
       5: aload_0
       6: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       9: ifnull        32
      12: aload_0
      13: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      16: invokevirtual #889                // Method android/support/v4/app/o.l:()Landroid/os/Parcelable;
      19: astore_2
      20: aload_2
      21: ifnull        32
      24: aload_1
      25: ldc_w         #891                // String android:support:fragments
      28: aload_2
      29: invokevirtual #895                // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      32: return

  void performStart();
    Code:
       0: aload_0
       1: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        22
       7: aload_0
       8: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      11: invokevirtual #672                // Method android/support/v4/app/o.m:()V
      14: aload_0
      15: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      18: invokevirtual #875                // Method android/support/v4/app/o.g:()Z
      21: pop
      22: aload_0
      23: iconst_4
      24: putfield      #125                // Field mState:I
      27: aload_0
      28: iconst_0
      29: putfield      #675                // Field mCalled:Z
      32: aload_0
      33: invokevirtual #898                // Method onStart:()V
      36: aload_0
      37: getfield      #675                // Field mCalled:Z
      40: ifne          85
      43: new           #223                // class java/lang/StringBuilder
      46: dup
      47: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      50: astore_1
      51: aload_1
      52: ldc_w         #750                // String Fragment
      55: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      58: pop
      59: aload_1
      60: aload_0
      61: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      64: pop
      65: aload_1
      66: ldc_w         #900                // String  did not call through to super.onStart()
      69: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      72: pop
      73: new           #754                // class android/support/v4/app/ai
      76: dup
      77: aload_1
      78: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      81: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      84: athrow
      85: aload_0
      86: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      89: ifnull        99
      92: aload_0
      93: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      96: invokevirtual #485                // Method android/support/v4/app/o.p:()V
      99: aload_0
     100: getfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
     103: getstatic     #903                // Field android/arch/lifecycle/c$a.ON_START:Landroid/arch/lifecycle/c$a;
     106: invokevirtual #781                // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$a;)V
     109: return

  void performStop();
    Code:
       0: aload_0
       1: getfield      #140                // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
       4: getstatic     #907                // Field android/arch/lifecycle/c$a.ON_STOP:Landroid/arch/lifecycle/c$a;
       7: invokevirtual #781                // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$a;)V
      10: aload_0
      11: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      14: ifnull        24
      17: aload_0
      18: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      21: invokevirtual #909                // Method android/support/v4/app/o.s:()V
      24: aload_0
      25: iconst_3
      26: putfield      #125                // Field mState:I
      29: aload_0
      30: iconst_0
      31: putfield      #675                // Field mCalled:Z
      34: aload_0
      35: invokevirtual #911                // Method onStop:()V
      38: aload_0
      39: getfield      #675                // Field mCalled:Z
      42: ifne          87
      45: new           #223                // class java/lang/StringBuilder
      48: dup
      49: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      52: astore_1
      53: aload_1
      54: ldc_w         #750                // String Fragment
      57: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: pop
      61: aload_1
      62: aload_0
      63: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      66: pop
      67: aload_1
      68: ldc_w         #913                // String  did not call through to super.onStop()
      71: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: new           #754                // class android/support/v4/app/ai
      78: dup
      79: aload_1
      80: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      83: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      86: athrow
      87: return

  public void postponeEnterTransition();
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: iconst_1
       5: putfield      #150                // Field android/support/v4/app/i$a.i:Z
       8: return

  public void registerForContextMenu(android.view.View);
    Code:
       0: aload_1
       1: aload_0
       2: invokevirtual #922                // Method android/view/View.setOnCreateContextMenuListener:(Landroid/view/View$OnCreateContextMenuListener;)V
       5: return

  public final void requestPermissions(java.lang.String[], int);
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     49
       7: new           #223                // class java/lang/StringBuilder
      10: dup
      11: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      14: astore_1
      15: aload_1
      16: ldc_w         #750                // String Fragment
      19: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_1
      24: aload_0
      25: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: ldc_w         #926                // String  not attached to Activity
      33: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: new           #527                // class java/lang/IllegalStateException
      40: dup
      41: aload_1
      42: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      45: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      48: athrow
      49: aload_0
      50: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      53: aload_0
      54: aload_1
      55: iload_2
      56: invokevirtual #929                // Method android/support/v4/app/m.a:(Landroid/support/v4/app/i;[Ljava/lang/String;I)V
      59: return

  public final android.support.v4.app.j requireActivity();
    Code:
       0: aload_0
       1: invokevirtual #702                // Method getActivity:()Landroid/support/v4/app/j;
       4: astore_1
       5: aload_1
       6: ifnonnull     51
       9: new           #223                // class java/lang/StringBuilder
      12: dup
      13: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc_w         #750                // String Fragment
      21: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_1
      26: aload_0
      27: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: ldc_w         #932                // String  not attached to an activity.
      35: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: new           #527                // class java/lang/IllegalStateException
      42: dup
      43: aload_1
      44: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      47: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      50: athrow
      51: aload_1
      52: areturn

  public final android.content.Context requireContext();
    Code:
       0: aload_0
       1: invokevirtual #616                // Method getContext:()Landroid/content/Context;
       4: astore_1
       5: aload_1
       6: ifnonnull     51
       9: new           #223                // class java/lang/StringBuilder
      12: dup
      13: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc_w         #750                // String Fragment
      21: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_1
      26: aload_0
      27: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: ldc_w         #934                // String  not attached to a context.
      35: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: new           #527                // class java/lang/IllegalStateException
      42: dup
      43: aload_1
      44: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      47: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      50: athrow
      51: aload_1
      52: areturn

  public final android.support.v4.app.n requireFragmentManager();
    Code:
       0: aload_0
       1: invokevirtual #937                // Method getFragmentManager:()Landroid/support/v4/app/n;
       4: astore_1
       5: aload_1
       6: ifnonnull     51
       9: new           #223                // class java/lang/StringBuilder
      12: dup
      13: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc_w         #750                // String Fragment
      21: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_1
      26: aload_0
      27: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: ldc_w         #939                // String  not associated with a fragment manager.
      35: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: new           #527                // class java/lang/IllegalStateException
      42: dup
      43: aload_1
      44: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      47: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      50: athrow
      51: aload_1
      52: areturn

  public final java.lang.Object requireHost();
    Code:
       0: aload_0
       1: invokevirtual #942                // Method getHost:()Ljava/lang/Object;
       4: astore_1
       5: aload_1
       6: ifnonnull     51
       9: new           #223                // class java/lang/StringBuilder
      12: dup
      13: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc_w         #750                // String Fragment
      21: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_1
      26: aload_0
      27: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: ldc_w         #944                // String  not attached to a host.
      35: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: new           #527                // class java/lang/IllegalStateException
      42: dup
      43: aload_1
      44: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      47: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      50: athrow
      51: aload_1
      52: areturn

  void restoreChildFragmentState(android.os.Bundle);
    Code:
       0: aload_1
       1: ifnull        51
       4: aload_1
       5: ldc_w         #891                // String android:support:fragments
       8: invokevirtual #948                // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
      11: astore_1
      12: aload_1
      13: ifnull        51
      16: aload_0
      17: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      20: ifnonnull     27
      23: aload_0
      24: invokevirtual #479                // Method instantiateChildFragmentManager:()V
      27: aload_0
      28: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      31: aload_1
      32: aload_0
      33: getfield      #950                // Field mChildNonConfig:Landroid/support/v4/app/p;
      36: invokevirtual #953                // Method android/support/v4/app/o.a:(Landroid/os/Parcelable;Landroid/support/v4/app/p;)V
      39: aload_0
      40: aconst_null
      41: putfield      #950                // Field mChildNonConfig:Landroid/support/v4/app/p;
      44: aload_0
      45: getfield      #420                // Field mChildFragmentManager:Landroid/support/v4/app/o;
      48: invokevirtual #491                // Method android/support/v4/app/o.n:()V
      51: return

  final void restoreViewState(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #367                // Field mSavedViewState:Landroid/util/SparseArray;
       4: ifnull        23
       7: aload_0
       8: getfield      #395                // Field mInnerView:Landroid/view/View;
      11: aload_0
      12: getfield      #367                // Field mSavedViewState:Landroid/util/SparseArray;
      15: invokevirtual #958                // Method android/view/View.restoreHierarchyState:(Landroid/util/SparseArray;)V
      18: aload_0
      19: aconst_null
      20: putfield      #367                // Field mSavedViewState:Landroid/util/SparseArray;
      23: aload_0
      24: iconst_0
      25: putfield      #675                // Field mCalled:Z
      28: aload_0
      29: aload_1
      30: invokevirtual #960                // Method onViewStateRestored:(Landroid/os/Bundle;)V
      33: aload_0
      34: getfield      #675                // Field mCalled:Z
      37: ifne          82
      40: new           #223                // class java/lang/StringBuilder
      43: dup
      44: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      47: astore_1
      48: aload_1
      49: ldc_w         #750                // String Fragment
      52: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: aload_0
      58: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      61: pop
      62: aload_1
      63: ldc_w         #962                // String  did not call through to super.onViewStateRestored()
      66: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      69: pop
      70: new           #754                // class android/support/v4/app/ai
      73: dup
      74: aload_1
      75: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      78: invokespecial #755                // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
      81: athrow
      82: return

  public void setAllowEnterTransitionOverlap(boolean);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: iload_1
       5: invokestatic  #967                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       8: invokestatic  #970                // Method android/support/v4/app/i$a.a:(Landroid/support/v4/app/i$a;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      11: pop
      12: return

  public void setAllowReturnTransitionOverlap(boolean);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: iload_1
       5: invokestatic  #967                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       8: invokestatic  #973                // Method android/support/v4/app/i$a.b:(Landroid/support/v4/app/i$a;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      11: pop
      12: return

  void setAnimatingAway(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: putfield      #467                // Field android/support/v4/app/i$a.a:Landroid/view/View;
       8: return

  void setAnimator(android.animation.Animator);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: putfield      #472                // Field android/support/v4/app/i$a.b:Landroid/animation/Animator;
       8: return

  public void setArguments(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #127                // Field mIndex:I
       4: iflt          25
       7: aload_0
       8: invokevirtual #978                // Method isStateSaved:()Z
      11: ifeq          25
      14: new           #527                // class java/lang/IllegalStateException
      17: dup
      18: ldc_w         #980                // String Fragment already active and state has been saved
      21: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      24: athrow
      25: aload_0
      26: aload_1
      27: putfield      #359                // Field mArguments:Landroid/os/Bundle;
      30: return

  public void setEnterSharedElementCallback(android.support.v4.app.ah);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: putfield      #505                // Field android/support/v4/app/i$a.g:Landroid/support/v4/app/ah;
       8: return

  public void setEnterTransition(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: invokestatic  #986                // Method android/support/v4/app/i$a.a:(Landroid/support/v4/app/i$a;Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: return

  public void setExitSharedElementCallback(android.support.v4.app.ah);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: putfield      #511                // Field android/support/v4/app/i$a.h:Landroid/support/v4/app/ah;
       8: return

  public void setExitTransition(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: invokestatic  #990                // Method android/support/v4/app/i$a.c:(Landroid/support/v4/app/i$a;Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: return

  public void setHasOptionsMenu(boolean);
    Code:
       0: aload_0
       1: getfield      #332                // Field mHasMenu:Z
       4: iload_1
       5: if_icmpeq     34
       8: aload_0
       9: iload_1
      10: putfield      #332                // Field mHasMenu:Z
      13: aload_0
      14: invokevirtual #657                // Method isAdded:()Z
      17: ifeq          34
      20: aload_0
      21: invokevirtual #659                // Method isHidden:()Z
      24: ifne          34
      27: aload_0
      28: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      31: invokevirtual #993                // Method android/support/v4/app/m.d:()V
      34: return

  void setHideReplaced(boolean);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: iload_1
       5: putfield      #645                // Field android/support/v4/app/i$a.k:Z
       8: return

  final void setIndex(int, android.support.v4.app.i);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #127                // Field mIndex:I
       5: aload_2
       6: ifnull        59
       9: new           #223                // class java/lang/StringBuilder
      12: dup
      13: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      16: astore        4
      18: aload         4
      20: aload_2
      21: getfield      #291                // Field mWho:Ljava/lang/String;
      24: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      27: pop
      28: ldc_w         #427                // String :
      31: astore_3
      32: aload         4
      34: astore_2
      35: aload_2
      36: aload_3
      37: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: pop
      41: aload_2
      42: aload_0
      43: getfield      #127                // Field mIndex:I
      46: invokevirtual #999                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      49: pop
      50: aload_0
      51: aload_2
      52: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      55: putfield      #291                // Field mWho:Ljava/lang/String;
      58: return
      59: new           #223                // class java/lang/StringBuilder
      62: dup
      63: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      66: astore_2
      67: ldc_w         #1001               // String android:fragment:
      70: astore_3
      71: goto          35

  public void setInitialSavedState(android.support.v4.app.i$d);
    Code:
       0: aload_0
       1: getfield      #127                // Field mIndex:I
       4: iflt          18
       7: new           #527                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #1005               // String Fragment already active
      14: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_1
      19: ifnull        37
      22: aload_1
      23: getfield      #1007               // Field android/support/v4/app/i$d.a:Landroid/os/Bundle;
      26: ifnull        37
      29: aload_1
      30: getfield      #1007               // Field android/support/v4/app/i$d.a:Landroid/os/Bundle;
      33: astore_1
      34: goto          39
      37: aconst_null
      38: astore_1
      39: aload_0
      40: aload_1
      41: putfield      #363                // Field mSavedFragmentState:Landroid/os/Bundle;
      44: return

  public void setMenuVisibility(boolean);
    Code:
       0: aload_0
       1: getfield      #131                // Field mMenuVisible:Z
       4: iload_1
       5: if_icmpeq     41
       8: aload_0
       9: iload_1
      10: putfield      #131                // Field mMenuVisible:Z
      13: aload_0
      14: getfield      #332                // Field mHasMenu:Z
      17: ifeq          41
      20: aload_0
      21: invokevirtual #657                // Method isAdded:()Z
      24: ifeq          41
      27: aload_0
      28: invokevirtual #659                // Method isHidden:()Z
      31: ifne          41
      34: aload_0
      35: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      38: invokevirtual #993                // Method android/support/v4/app/m.d:()V
      41: return

  void setNextAnim(int);
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     12
       7: iload_1
       8: ifne          12
      11: return
      12: aload_0
      13: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
      16: iload_1
      17: putfield      #558                // Field android/support/v4/app/i$a.d:I
      20: return

  void setNextTransition(int, int);
    Code:
       0: aload_0
       1: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
       4: ifnonnull     16
       7: iload_1
       8: ifne          16
      11: iload_2
      12: ifne          16
      15: return
      16: aload_0
      17: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
      20: pop
      21: aload_0
      22: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      25: iload_1
      26: putfield      #562                // Field android/support/v4/app/i$a.e:I
      29: aload_0
      30: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      33: iload_2
      34: putfield      #566                // Field android/support/v4/app/i$a.f:I
      37: return

  void setOnStartEnterTransitionListener(android.support.v4.app.i$c);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: pop
       5: aload_1
       6: aload_0
       7: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      10: getfield      #154                // Field android/support/v4/app/i$a.j:Landroid/support/v4/app/i$c;
      13: if_acmpne     17
      16: return
      17: aload_1
      18: ifnull        65
      21: aload_0
      22: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      25: getfield      #154                // Field android/support/v4/app/i$a.j:Landroid/support/v4/app/i$c;
      28: ifnull        65
      31: new           #223                // class java/lang/StringBuilder
      34: dup
      35: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      38: astore_1
      39: aload_1
      40: ldc_w         #1015               // String Trying to set a replacement startPostponedEnterTransition on
      43: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      52: pop
      53: new           #527                // class java/lang/IllegalStateException
      56: dup
      57: aload_1
      58: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      61: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      64: athrow
      65: aload_0
      66: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      69: getfield      #150                // Field android/support/v4/app/i$a.i:Z
      72: ifeq          83
      75: aload_0
      76: getfield      #147                // Field mAnimationInfo:Landroid/support/v4/app/i$a;
      79: aload_1
      80: putfield      #154                // Field android/support/v4/app/i$a.j:Landroid/support/v4/app/i$c;
      83: aload_1
      84: ifnull        93
      87: aload_1
      88: invokeinterface #1017,  1         // InterfaceMethod android/support/v4/app/i$c.b:()V
      93: return

  public void setReenterTransition(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: invokestatic  #1020               // Method android/support/v4/app/i$a.d:(Landroid/support/v4/app/i$a;Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: return

  public void setRetainInstance(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #336                // Field mRetainInstance:Z
       5: return

  public void setReturnTransition(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: invokestatic  #1024               // Method android/support/v4/app/i$a.b:(Landroid/support/v4/app/i$a;Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: return

  public void setSharedElementEnterTransition(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: invokestatic  #1027               // Method android/support/v4/app/i$a.e:(Landroid/support/v4/app/i$a;Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: return

  public void setSharedElementReturnTransition(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: aload_1
       5: invokestatic  #1030               // Method android/support/v4/app/i$a.f:(Landroid/support/v4/app/i$a;Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: return

  void setStateAfterAnimating(int);
    Code:
       0: aload_0
       1: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
       4: iload_1
       5: putfield      #596                // Field android/support/v4/app/i$a.c:I
       8: return

  public void setTargetFragment(android.support.v4.app.i, int);
    Code:
       0: aload_0
       1: invokevirtual #937                // Method getFragmentManager:()Landroid/support/v4/app/n;
       4: astore        4
       6: aload_1
       7: ifnull        18
      10: aload_1
      11: invokevirtual #937                // Method getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: goto          20
      18: aconst_null
      19: astore_3
      20: aload         4
      22: ifnull        77
      25: aload_3
      26: ifnull        77
      29: aload         4
      31: aload_3
      32: if_acmpeq     77
      35: new           #223                // class java/lang/StringBuilder
      38: dup
      39: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      42: astore_3
      43: aload_3
      44: ldc_w         #750                // String Fragment
      47: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: pop
      51: aload_3
      52: aload_1
      53: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      56: pop
      57: aload_3
      58: ldc_w         #1035               // String  must share the same FragmentManager to be set as a target fragment
      61: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      64: pop
      65: new           #1037               // class java/lang/IllegalArgumentException
      68: dup
      69: aload_3
      70: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      73: invokespecial #1038               // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      76: athrow
      77: aload_1
      78: astore_3
      79: aload_3
      80: ifnull        152
      83: aload_3
      84: aload_0
      85: if_acmpne     144
      88: new           #223                // class java/lang/StringBuilder
      91: dup
      92: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      95: astore_3
      96: aload_3
      97: ldc_w         #1040               // String Setting
     100: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     103: pop
     104: aload_3
     105: aload_1
     106: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     109: pop
     110: aload_3
     111: ldc_w         #1042               // String  as the target of
     114: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     117: pop
     118: aload_3
     119: aload_0
     120: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     123: pop
     124: aload_3
     125: ldc_w         #1044               // String  would create a target cycle
     128: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     131: pop
     132: new           #1037               // class java/lang/IllegalArgumentException
     135: dup
     136: aload_3
     137: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     140: invokespecial #1038               // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     143: athrow
     144: aload_3
     145: invokevirtual #1046               // Method getTargetFragment:()Landroid/support/v4/app/i;
     148: astore_3
     149: goto          79
     152: aload_0
     153: aload_1
     154: putfield      #371                // Field mTarget:Landroid/support/v4/app/i;
     157: aload_0
     158: iload_2
     159: putfield      #379                // Field mTargetRequestCode:I
     162: return

  public void setUserVisibleHint(boolean);
    Code:
       0: aload_0
       1: getfield      #133                // Field mUserVisibleHint:Z
       4: ifne          41
       7: iload_1
       8: ifeq          41
      11: aload_0
      12: getfield      #125                // Field mState:I
      15: iconst_4
      16: if_icmpge     41
      19: aload_0
      20: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
      23: ifnull        41
      26: aload_0
      27: invokevirtual #657                // Method isAdded:()Z
      30: ifeq          41
      33: aload_0
      34: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
      37: aload_0
      38: invokevirtual #1049               // Method android/support/v4/app/o.b:(Landroid/support/v4/app/i;)V
      41: aload_0
      42: iload_1
      43: putfield      #133                // Field mUserVisibleHint:Z
      46: aload_0
      47: getfield      #125                // Field mState:I
      50: iconst_4
      51: if_icmpge     63
      54: iload_1
      55: ifne          63
      58: iconst_1
      59: istore_1
      60: goto          65
      63: iconst_0
      64: istore_1
      65: aload_0
      66: iload_1
      67: putfield      #1051               // Field mDeferStart:Z
      70: aload_0
      71: getfield      #363                // Field mSavedFragmentState:Landroid/os/Bundle;
      74: ifnull        88
      77: aload_0
      78: aload_0
      79: getfield      #133                // Field mUserVisibleHint:Z
      82: invokestatic  #967                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      85: putfield      #1053               // Field mSavedUserVisibleHint:Ljava/lang/Boolean;
      88: return

  public boolean shouldShowRequestPermissionRationale(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnull        16
       7: aload_0
       8: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      11: aload_1
      12: invokevirtual #1057               // Method android/support/v4/app/m.a:(Ljava/lang/String;)Z
      15: ireturn
      16: iconst_0
      17: ireturn

  public void startActivity(android.content.Intent);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokevirtual #1062               // Method startActivity:(Landroid/content/Intent;Landroid/os/Bundle;)V
       6: return

  public void startActivity(android.content.Intent, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     49
       7: new           #223                // class java/lang/StringBuilder
      10: dup
      11: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      14: astore_1
      15: aload_1
      16: ldc_w         #750                // String Fragment
      19: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_1
      24: aload_0
      25: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: ldc_w         #926                // String  not attached to Activity
      33: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: new           #527                // class java/lang/IllegalStateException
      40: dup
      41: aload_1
      42: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      45: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      48: athrow
      49: aload_0
      50: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      53: aload_0
      54: aload_1
      55: iconst_m1
      56: aload_2
      57: invokevirtual #1065               // Method android/support/v4/app/m.a:(Landroid/support/v4/app/i;Landroid/content/Intent;ILandroid/os/Bundle;)V
      60: return

  public void startActivityForResult(android.content.Intent, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aconst_null
       4: invokevirtual #1070               // Method startActivityForResult:(Landroid/content/Intent;ILandroid/os/Bundle;)V
       7: return

  public void startActivityForResult(android.content.Intent, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     49
       7: new           #223                // class java/lang/StringBuilder
      10: dup
      11: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      14: astore_1
      15: aload_1
      16: ldc_w         #750                // String Fragment
      19: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_1
      24: aload_0
      25: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: ldc_w         #926                // String  not attached to Activity
      33: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: new           #527                // class java/lang/IllegalStateException
      40: dup
      41: aload_1
      42: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      45: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      48: athrow
      49: aload_0
      50: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      53: aload_0
      54: aload_1
      55: iload_2
      56: aload_3
      57: invokevirtual #1065               // Method android/support/v4/app/m.a:(Landroid/support/v4/app/i;Landroid/content/Intent;ILandroid/os/Bundle;)V
      60: return

  public void startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
       4: ifnonnull     49
       7: new           #223                // class java/lang/StringBuilder
      10: dup
      11: invokespecial #224                // Method java/lang/StringBuilder."<init>":()V
      14: astore_1
      15: aload_1
      16: ldc_w         #750                // String Fragment
      19: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_1
      24: aload_0
      25: invokevirtual #425                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: ldc_w         #926                // String  not attached to Activity
      33: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: new           #527                // class java/lang/IllegalStateException
      40: dup
      41: aload_1
      42: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      45: invokespecial #531                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      48: athrow
      49: aload_0
      50: getfield      #351                // Field mHost:Landroid/support/v4/app/m;
      53: aload_0
      54: aload_1
      55: iload_2
      56: aload_3
      57: iload         4
      59: iload         5
      61: iload         6
      63: aload         7
      65: invokevirtual #1075               // Method android/support/v4/app/m.a:(Landroid/support/v4/app/i;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      68: return

  public void startPostponedEnterTransition();
    Code:
       0: aload_0
       1: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
       4: ifnull        67
       7: aload_0
       8: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
      11: getfield      #1078               // Field android/support/v4/app/o.m:Landroid/support/v4/app/m;
      14: ifnonnull     20
      17: goto          67
      20: invokestatic  #1084               // Method android/os/Looper.myLooper:()Landroid/os/Looper;
      23: aload_0
      24: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
      27: getfield      #1078               // Field android/support/v4/app/o.m:Landroid/support/v4/app/m;
      30: invokevirtual #1087               // Method android/support/v4/app/m.j:()Landroid/os/Handler;
      33: invokevirtual #1092               // Method android/os/Handler.getLooper:()Landroid/os/Looper;
      36: if_acmpeq     62
      39: aload_0
      40: getfield      #344                // Field mFragmentManager:Landroid/support/v4/app/o;
      43: getfield      #1078               // Field android/support/v4/app/o.m:Landroid/support/v4/app/m;
      46: invokevirtual #1087               // Method android/support/v4/app/m.j:()Landroid/os/Handler;
      49: new           #12                 // class android/support/v4/app/i$1
      52: dup
      53: aload_0
      54: invokespecial #1093               // Method android/support/v4/app/i$1."<init>":(Landroid/support/v4/app/i;)V
      57: invokevirtual #1097               // Method android/os/Handler.postAtFrontOfQueue:(Ljava/lang/Runnable;)Z
      60: pop
      61: return
      62: aload_0
      63: invokespecial #145                // Method callStartTransitionListener:()V
      66: return
      67: aload_0
      68: invokespecial #916                // Method ensureAnimationInfo:()Landroid/support/v4/app/i$a;
      71: iconst_0
      72: putfield      #150                // Field android/support/v4/app/i$a.i:Z
      75: return

  public java.lang.String toString();
    Code:
       0: new           #223                // class java/lang/StringBuilder
       3: dup
       4: sipush        128
       7: invokespecial #1099               // Method java/lang/StringBuilder."<init>":(I)V
      10: astore_1
      11: aload_0
      12: aload_1
      13: invokestatic  #1104               // Method android/support/v4/g/d.a:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
      16: aload_0
      17: getfield      #127                // Field mIndex:I
      20: iflt          40
      23: aload_1
      24: ldc_w         #1106               // String  #
      27: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #127                // Field mIndex:I
      36: invokevirtual #999                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      39: pop
      40: aload_0
      41: getfield      #263                // Field mFragmentId:I
      44: ifeq          67
      47: aload_1
      48: ldc_w         #1108               // String  id=0x
      51: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      54: pop
      55: aload_1
      56: aload_0
      57: getfield      #263                // Field mFragmentId:I
      60: invokestatic  #269                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      63: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      66: pop
      67: aload_0
      68: getfield      #277                // Field mTag:Ljava/lang/String;
      71: ifnull        91
      74: aload_1
      75: ldc_w         #1110               // String
      78: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      81: pop
      82: aload_1
      83: aload_0
      84: getfield      #277                // Field mTag:Ljava/lang/String;
      87: invokevirtual #230                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      90: pop
      91: aload_1
      92: bipush        125
      94: invokevirtual #1113               // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      97: pop
      98: aload_1
      99: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     102: areturn

  public void unregisterForContextMenu(android.view.View);
    Code:
       0: aload_1
       1: aconst_null
       2: invokevirtual #922                // Method android/view/View.setOnCreateContextMenuListener:(Landroid/view/View$OnCreateContextMenuListener;)V
       5: return
}
