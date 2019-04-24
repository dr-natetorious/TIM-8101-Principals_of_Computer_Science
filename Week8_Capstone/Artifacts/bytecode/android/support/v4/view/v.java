public class android.support.v4.view.v extends android.view.ViewGroup {
  static final int[] LAYOUT_ATTRS;

  public static final int SCROLL_STATE_DRAGGING;

  public static final int SCROLL_STATE_IDLE;

  public static final int SCROLL_STATE_SETTLING;

  android.support.v4.view.q mAdapter;

  int mCurItem;

  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #163                // int 16842931
       7: iastore
       8: putstatic     #165                // Field LAYOUT_ATTRS:[I
      11: new           #6                  // class android/support/v4/view/v$1
      14: dup
      15: invokespecial #168                // Method android/support/v4/view/v$1."<init>":()V
      18: putstatic     #170                // Field COMPARATOR:Ljava/util/Comparator;
      21: new           #8                  // class android/support/v4/view/v$2
      24: dup
      25: invokespecial #171                // Method android/support/v4/view/v$2."<init>":()V
      28: putstatic     #173                // Field sInterpolator:Landroid/view/animation/Interpolator;
      31: new           #43                 // class android/support/v4/view/v$j
      34: dup
      35: invokespecial #174                // Method android/support/v4/view/v$j."<init>":()V
      38: putstatic     #176                // Field sPositionComparator:Landroid/support/v4/view/v$j;
      41: return

  public android.support.v4.view.v(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #180                // Method android/view/ViewGroup."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: new           #182                // class java/util/ArrayList
       9: dup
      10: invokespecial #183                // Method java/util/ArrayList."<init>":()V
      13: putfield      #185                // Field mItems:Ljava/util/ArrayList;
      16: aload_0
      17: new           #17                 // class android/support/v4/view/v$b
      20: dup
      21: invokespecial #186                // Method android/support/v4/view/v$b."<init>":()V
      24: putfield      #188                // Field mTempItem:Landroid/support/v4/view/v$b;
      27: aload_0
      28: new           #190                // class android/graphics/Rect
      31: dup
      32: invokespecial #191                // Method android/graphics/Rect."<init>":()V
      35: putfield      #193                // Field mTempRect:Landroid/graphics/Rect;
      38: aload_0
      39: iconst_m1
      40: putfield      #195                // Field mRestoredCurItem:I
      43: aload_0
      44: aconst_null
      45: putfield      #197                // Field mRestoredAdapterState:Landroid/os/Parcelable;
      48: aload_0
      49: aconst_null
      50: putfield      #199                // Field mRestoredClassLoader:Ljava/lang/ClassLoader;
      53: aload_0
      54: ldc           #200                // float -3.4028235E38f
      56: putfield      #202                // Field mFirstOffset:F
      59: aload_0
      60: ldc           #203                // float 3.4028235E38f
      62: putfield      #205                // Field mLastOffset:F
      65: aload_0
      66: iconst_1
      67: putfield      #207                // Field mOffscreenPageLimit:I
      70: aload_0
      71: iconst_m1
      72: putfield      #209                // Field mActivePointerId:I
      75: aload_0
      76: iconst_1
      77: putfield      #211                // Field mFirstLayout:Z
      80: aload_0
      81: iconst_0
      82: putfield      #213                // Field mNeedCalculatePageOffsets:Z
      85: aload_0
      86: new           #10                 // class android/support/v4/view/v$3
      89: dup
      90: aload_0
      91: invokespecial #216                // Method android/support/v4/view/v$3."<init>":(Landroid/support/v4/view/v;)V
      94: putfield      #218                // Field mEndScrollRunnable:Ljava/lang/Runnable;
      97: aload_0
      98: iconst_0
      99: putfield      #220                // Field mScrollState:I
     102: aload_0
     103: invokevirtual #223                // Method initViewPager:()V
     106: return

  public android.support.v4.view.v(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #226                // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: new           #182                // class java/util/ArrayList
      10: dup
      11: invokespecial #183                // Method java/util/ArrayList."<init>":()V
      14: putfield      #185                // Field mItems:Ljava/util/ArrayList;
      17: aload_0
      18: new           #17                 // class android/support/v4/view/v$b
      21: dup
      22: invokespecial #186                // Method android/support/v4/view/v$b."<init>":()V
      25: putfield      #188                // Field mTempItem:Landroid/support/v4/view/v$b;
      28: aload_0
      29: new           #190                // class android/graphics/Rect
      32: dup
      33: invokespecial #191                // Method android/graphics/Rect."<init>":()V
      36: putfield      #193                // Field mTempRect:Landroid/graphics/Rect;
      39: aload_0
      40: iconst_m1
      41: putfield      #195                // Field mRestoredCurItem:I
      44: aload_0
      45: aconst_null
      46: putfield      #197                // Field mRestoredAdapterState:Landroid/os/Parcelable;
      49: aload_0
      50: aconst_null
      51: putfield      #199                // Field mRestoredClassLoader:Ljava/lang/ClassLoader;
      54: aload_0
      55: ldc           #200                // float -3.4028235E38f
      57: putfield      #202                // Field mFirstOffset:F
      60: aload_0
      61: ldc           #203                // float 3.4028235E38f
      63: putfield      #205                // Field mLastOffset:F
      66: aload_0
      67: iconst_1
      68: putfield      #207                // Field mOffscreenPageLimit:I
      71: aload_0
      72: iconst_m1
      73: putfield      #209                // Field mActivePointerId:I
      76: aload_0
      77: iconst_1
      78: putfield      #211                // Field mFirstLayout:Z
      81: aload_0
      82: iconst_0
      83: putfield      #213                // Field mNeedCalculatePageOffsets:Z
      86: aload_0
      87: new           #10                 // class android/support/v4/view/v$3
      90: dup
      91: aload_0
      92: invokespecial #216                // Method android/support/v4/view/v$3."<init>":(Landroid/support/v4/view/v;)V
      95: putfield      #218                // Field mEndScrollRunnable:Ljava/lang/Runnable;
      98: aload_0
      99: iconst_0
     100: putfield      #220                // Field mScrollState:I
     103: aload_0
     104: invokevirtual #223                // Method initViewPager:()V
     107: return

  public void addFocusables(java.util.ArrayList<android.view.View>, int, int);
    Code:
       0: aload_1
       1: invokevirtual #250                // Method java/util/ArrayList.size:()I
       4: istore        5
       6: aload_0
       7: invokevirtual #575                // Method getDescendantFocusability:()I
      10: istore        6
      12: iload         6
      14: ldc_w         #576                // int 393216
      17: if_icmpeq     90
      20: iconst_0
      21: istore        4
      23: iload         4
      25: aload_0
      26: invokevirtual #359                // Method getChildCount:()I
      29: if_icmpge     90
      32: aload_0
      33: iload         4
      35: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
      38: astore        7
      40: aload         7
      42: invokevirtual #579                // Method android/view/View.getVisibility:()I
      45: ifne          81
      48: aload_0
      49: aload         7
      51: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
      54: astore        8
      56: aload         8
      58: ifnull        81
      61: aload         8
      63: getfield      #243                // Field android/support/v4/view/v$b.b:I
      66: aload_0
      67: getfield      #322                // Field mCurItem:I
      70: if_icmpne     81
      73: aload         7
      75: aload_1
      76: iload_2
      77: iload_3
      78: invokevirtual #585                // Method android/view/View.addFocusables:(Ljava/util/ArrayList;II)V
      81: iload         4
      83: iconst_1
      84: iadd
      85: istore        4
      87: goto          23
      90: iload         6
      92: ldc_w         #586                // int 262144
      95: if_icmpne     107
      98: iload         5
     100: aload_1
     101: invokevirtual #250                // Method java/util/ArrayList.size:()I
     104: if_icmpne     147
     107: aload_0
     108: invokevirtual #589                // Method isFocusable:()Z
     111: ifne          115
     114: return
     115: iload_3
     116: iconst_1
     117: iand
     118: iconst_1
     119: if_icmpne     137
     122: aload_0
     123: invokevirtual #592                // Method isInTouchMode:()Z
     126: ifeq          137
     129: aload_0
     130: invokevirtual #595                // Method isFocusableInTouchMode:()Z
     133: ifne          137
     136: return
     137: aload_1
     138: ifnull        147
     141: aload_1
     142: aload_0
     143: invokevirtual #564                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     146: pop
     147: return

  android.support.v4.view.v$b addNewItem(int, int);
    Code:
       0: new           #17                 // class android/support/v4/view/v$b
       3: dup
       4: invokespecial #186                // Method android/support/v4/view/v$b."<init>":()V
       7: astore_3
       8: aload_3
       9: iload_1
      10: putfield      #243                // Field android/support/v4/view/v$b.b:I
      13: aload_3
      14: aload_0
      15: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      18: aload_0
      19: iload_1
      20: invokevirtual #603                // Method android/support/v4/view/q.instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;
      23: putfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
      26: aload_3
      27: aload_0
      28: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      31: iload_1
      32: invokevirtual #258                // Method android/support/v4/view/q.getPageWidth:(I)F
      35: putfield      #247                // Field android/support/v4/view/v$b.d:F
      38: iload_2
      39: iflt          67
      42: iload_2
      43: aload_0
      44: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      47: invokevirtual #250                // Method java/util/ArrayList.size:()I
      50: if_icmplt     56
      53: goto          67
      56: aload_0
      57: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      60: iload_2
      61: aload_3
      62: invokevirtual #609                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
      65: aload_3
      66: areturn
      67: aload_0
      68: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      71: aload_3
      72: invokevirtual #564                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      75: pop
      76: aload_3
      77: areturn

  public void addOnAdapterChangeListener(android.support.v4.view.v$e);
    Code:
       0: aload_0
       1: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
       4: ifnonnull     18
       7: aload_0
       8: new           #182                // class java/util/ArrayList
      11: dup
      12: invokespecial #183                // Method java/util/ArrayList."<init>":()V
      15: putfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
      18: aload_0
      19: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
      22: aload_1
      23: invokeinterface #614,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      28: pop
      29: return

  public void addOnPageChangeListener(android.support.v4.view.v$f);
    Code:
       0: aload_0
       1: getfield      #340                // Field mOnPageChangeListeners:Ljava/util/List;
       4: ifnonnull     18
       7: aload_0
       8: new           #182                // class java/util/ArrayList
      11: dup
      12: invokespecial #183                // Method java/util/ArrayList."<init>":()V
      15: putfield      #340                // Field mOnPageChangeListeners:Ljava/util/List;
      18: aload_0
      19: getfield      #340                // Field mOnPageChangeListeners:Ljava/util/List;
      22: aload_1
      23: invokeinterface #614,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      28: pop
      29: return

  public void addTouchables(java.util.ArrayList<android.view.View>);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: invokevirtual #359                // Method getChildCount:()I
       7: if_icmpge     59
      10: aload_0
      11: iload_2
      12: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
      15: astore_3
      16: aload_3
      17: invokevirtual #579                // Method android/view/View.getVisibility:()I
      20: ifne          52
      23: aload_0
      24: aload_3
      25: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
      28: astore        4
      30: aload         4
      32: ifnull        52
      35: aload         4
      37: getfield      #243                // Field android/support/v4/view/v$b.b:I
      40: aload_0
      41: getfield      #322                // Field mCurItem:I
      44: if_icmpne     52
      47: aload_3
      48: aload_1
      49: invokevirtual #620                // Method android/view/View.addTouchables:(Ljava/util/ArrayList;)V
      52: iload_2
      53: iconst_1
      54: iadd
      55: istore_2
      56: goto          2
      59: return

  public void addView(android.view.View, int, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_3
       1: astore        4
       3: aload_0
       4: aload_3
       5: invokevirtual #627                // Method checkLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Z
       8: ifne          18
      11: aload_0
      12: aload_3
      13: invokevirtual #631                // Method generateLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
      16: astore        4
      18: aload         4
      20: checkcast     #20                 // class android/support/v4/view/v$c
      23: astore_3
      24: aload_3
      25: aload_3
      26: getfield      #525                // Field android/support/v4/view/v$c.a:Z
      29: aload_1
      30: invokestatic  #633                // Method isDecorView:(Landroid/view/View;)Z
      33: ior
      34: putfield      #525                // Field android/support/v4/view/v$c.a:Z
      37: aload_0
      38: getfield      #635                // Field mInLayout:Z
      41: ifeq          81
      44: aload_3
      45: ifnull        66
      48: aload_3
      49: getfield      #525                // Field android/support/v4/view/v$c.a:Z
      52: ifeq          66
      55: new           #477                // class java/lang/IllegalStateException
      58: dup
      59: ldc_w         #637                // String Cannot add pager decor view during layout
      62: invokespecial #482                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      65: athrow
      66: aload_3
      67: iconst_1
      68: putfield      #639                // Field android/support/v4/view/v$c.d:Z
      71: aload_0
      72: aload_1
      73: iload_2
      74: aload         4
      76: invokevirtual #643                // Method addViewInLayout:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
      79: pop
      80: return
      81: aload_0
      82: aload_1
      83: iload_2
      84: aload         4
      86: invokespecial #645                // Method android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
      89: return

  public boolean arrowScroll(int);
    Code:
       0: aload_0
       1: invokevirtual #650                // Method findFocus:()Landroid/view/View;
       4: astore        7
       6: iconst_0
       7: istore        4
       9: aconst_null
      10: astore        6
      12: aload         7
      14: aload_0
      15: if_acmpne     25
      18: aload         6
      20: astore        5
      22: goto          198
      25: aload         7
      27: ifnull        194
      30: aload         7
      32: invokevirtual #417                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      35: astore        5
      37: aload         5
      39: instanceof    #4                  // class android/view/ViewGroup
      42: ifeq          68
      45: aload         5
      47: aload_0
      48: if_acmpne     56
      51: iconst_1
      52: istore_2
      53: goto          70
      56: aload         5
      58: invokeinterface #651,  1          // InterfaceMethod android/view/ViewParent.getParent:()Landroid/view/ViewParent;
      63: astore        5
      65: goto          37
      68: iconst_0
      69: istore_2
      70: iload_2
      71: ifne          194
      74: new           #653                // class java/lang/StringBuilder
      77: dup
      78: invokespecial #654                // Method java/lang/StringBuilder."<init>":()V
      81: astore        8
      83: aload         8
      85: aload         7
      87: invokevirtual #441                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      90: invokevirtual #658                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      93: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      96: pop
      97: aload         7
      99: invokevirtual #417                // Method android/view/View.getParent:()Landroid/view/ViewParent;
     102: astore        5
     104: aload         5
     106: instanceof    #4                  // class android/view/ViewGroup
     109: ifeq          147
     112: aload         8
     114: ldc_w         #664                // String  =>
     117: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     120: pop
     121: aload         8
     123: aload         5
     125: invokevirtual #441                // Method java/lang/Object.getClass:()Ljava/lang/Class;
     128: invokevirtual #658                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
     131: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     134: pop
     135: aload         5
     137: invokeinterface #651,  1          // InterfaceMethod android/view/ViewParent.getParent:()Landroid/view/ViewParent;
     142: astore        5
     144: goto          104
     147: new           #653                // class java/lang/StringBuilder
     150: dup
     151: invokespecial #654                // Method java/lang/StringBuilder."<init>":()V
     154: astore        5
     156: aload         5
     158: ldc_w         #666                // String arrowScroll tried to find focus based on non-child current focused view
     161: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     164: pop
     165: aload         5
     167: aload         8
     169: invokevirtual #669                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     172: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     175: pop
     176: ldc           #77                 // String ViewPager
     178: aload         5
     180: invokevirtual #669                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     183: invokestatic  #674                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
     186: pop
     187: aload         6
     189: astore        5
     191: goto          198
     194: aload         7
     196: astore        5
     198: invokestatic  #680                // Method android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
     201: aload_0
     202: aload         5
     204: iload_1
     205: invokevirtual #684                // Method android/view/FocusFinder.findNextFocus:(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
     208: astore        6
     210: aload         6
     212: ifnull        338
     215: aload         6
     217: aload         5
     219: if_acmpeq     338
     222: iload_1
     223: bipush        17
     225: if_icmpne     285
     228: aload_0
     229: aload_0
     230: getfield      #193                // Field mTempRect:Landroid/graphics/Rect;
     233: aload         6
     235: invokespecial #686                // Method getChildRectInPagerCoordinates:(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
     238: getfield      #395                // Field android/graphics/Rect.left:I
     241: istore_2
     242: aload_0
     243: aload_0
     244: getfield      #193                // Field mTempRect:Landroid/graphics/Rect;
     247: aload         5
     249: invokespecial #686                // Method getChildRectInPagerCoordinates:(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
     252: getfield      #395                // Field android/graphics/Rect.left:I
     255: istore_3
     256: aload         5
     258: ifnull        275
     261: iload_2
     262: iload_3
     263: if_icmplt     275
     266: aload_0
     267: invokevirtual #689                // Method pageLeft:()Z
     270: istore        4
     272: goto          282
     275: aload         6
     277: invokevirtual #692                // Method android/view/View.requestFocus:()Z
     280: istore        4
     282: goto          378
     285: iload_1
     286: bipush        66
     288: if_icmpne     378
     291: aload_0
     292: aload_0
     293: getfield      #193                // Field mTempRect:Landroid/graphics/Rect;
     296: aload         6
     298: invokespecial #686                // Method getChildRectInPagerCoordinates:(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
     301: getfield      #395                // Field android/graphics/Rect.left:I
     304: istore_2
     305: aload_0
     306: aload_0
     307: getfield      #193                // Field mTempRect:Landroid/graphics/Rect;
     310: aload         5
     312: invokespecial #686                // Method getChildRectInPagerCoordinates:(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
     315: getfield      #395                // Field android/graphics/Rect.left:I
     318: istore_3
     319: aload         5
     321: ifnull        275
     324: iload_2
     325: iload_3
     326: if_icmpgt     275
     329: aload_0
     330: invokevirtual #695                // Method pageRight:()Z
     333: istore        4
     335: goto          282
     338: iload_1
     339: bipush        17
     341: if_icmpeq     372
     344: iload_1
     345: iconst_1
     346: if_icmpne     352
     349: goto          372
     352: iload_1
     353: bipush        66
     355: if_icmpeq     363
     358: iload_1
     359: iconst_2
     360: if_icmpne     378
     363: aload_0
     364: invokevirtual #695                // Method pageRight:()Z
     367: istore        4
     369: goto          378
     372: aload_0
     373: invokevirtual #689                // Method pageLeft:()Z
     376: istore        4
     378: iload         4
     380: ifeq          391
     383: aload_0
     384: iload_1
     385: invokestatic  #700                // Method android/view/SoundEffectConstants.getContantForFocusDirection:(I)I
     388: invokevirtual #703                // Method playSoundEffect:(I)V
     391: iload         4
     393: ireturn

  public boolean beginFakeDrag();
    Code:
       0: aload_0
       1: getfield      #374                // Field mIsBeingDragged:Z
       4: ifeq          9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: iconst_1
      11: putfield      #706                // Field mFakeDragging:Z
      14: aload_0
      15: iconst_1
      16: invokevirtual #709                // Method setScrollState:(I)V
      19: aload_0
      20: fconst_0
      21: putfield      #469                // Field mLastMotionX:F
      24: aload_0
      25: fconst_0
      26: putfield      #711                // Field mInitialMotionX:F
      29: aload_0
      30: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      33: ifnonnull     46
      36: aload_0
      37: invokestatic  #715                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      40: putfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      43: goto          53
      46: aload_0
      47: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      50: invokevirtual #472                // Method android/view/VelocityTracker.clear:()V
      53: invokestatic  #721                // Method android/os/SystemClock.uptimeMillis:()J
      56: lstore_1
      57: lload_1
      58: lload_1
      59: iconst_0
      60: fconst_0
      61: fconst_0
      62: iconst_0
      63: invokestatic  #724                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
      66: astore_3
      67: aload_0
      68: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      71: aload_3
      72: invokevirtual #727                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
      75: aload_3
      76: invokevirtual #728                // Method android/view/MotionEvent.recycle:()V
      79: aload_0
      80: lload_1
      81: putfield      #730                // Field mFakeDragBeginTime:J
      84: iconst_1
      85: ireturn

  protected boolean canScroll(android.view.View, boolean, int, int, int);
    Code:
       0: aload_1
       1: instanceof    #4                  // class android/view/ViewGroup
       4: ifeq          140
       7: aload_1
       8: checkcast     #4                  // class android/view/ViewGroup
      11: astore        11
      13: aload_1
      14: invokevirtual #733                // Method android/view/View.getScrollX:()I
      17: istore        7
      19: aload_1
      20: invokevirtual #734                // Method android/view/View.getScrollY:()I
      23: istore        8
      25: aload         11
      27: invokevirtual #735                // Method android/view/ViewGroup.getChildCount:()I
      30: iconst_1
      31: isub
      32: istore        6
      34: iload         6
      36: iflt          140
      39: aload         11
      41: iload         6
      43: invokevirtual #736                // Method android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
      46: astore        12
      48: iload         4
      50: iload         7
      52: iadd
      53: istore        9
      55: iload         9
      57: aload         12
      59: invokevirtual #392                // Method android/view/View.getLeft:()I
      62: if_icmplt     131
      65: iload         9
      67: aload         12
      69: invokevirtual #398                // Method android/view/View.getRight:()I
      72: if_icmpge     131
      75: iload         5
      77: iload         8
      79: iadd
      80: istore        10
      82: iload         10
      84: aload         12
      86: invokevirtual #404                // Method android/view/View.getTop:()I
      89: if_icmplt     131
      92: iload         10
      94: aload         12
      96: invokevirtual #410                // Method android/view/View.getBottom:()I
      99: if_icmpge     131
     102: aload_0
     103: aload         12
     105: iconst_1
     106: iload_3
     107: iload         9
     109: aload         12
     111: invokevirtual #392                // Method android/view/View.getLeft:()I
     114: isub
     115: iload         10
     117: aload         12
     119: invokevirtual #404                // Method android/view/View.getTop:()I
     122: isub
     123: invokevirtual #738                // Method canScroll:(Landroid/view/View;ZIII)Z
     126: ifeq          131
     129: iconst_1
     130: ireturn
     131: iload         6
     133: iconst_1
     134: isub
     135: istore        6
     137: goto          34
     140: iload_2
     141: ifeq          155
     144: aload_1
     145: iload_3
     146: ineg
     147: invokevirtual #741                // Method android/view/View.canScrollHorizontally:(I)Z
     150: ifeq          155
     153: iconst_1
     154: ireturn
     155: iconst_0
     156: ireturn

  public boolean canScrollHorizontally(int);
    Code:
       0: aload_0
       1: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
       4: astore        6
       6: iconst_0
       7: istore        5
       9: iconst_0
      10: istore        4
      12: aload         6
      14: ifnonnull     19
      17: iconst_0
      18: ireturn
      19: aload_0
      20: invokespecial #239                // Method getClientWidth:()I
      23: istore_2
      24: aload_0
      25: invokevirtual #277                // Method getScrollX:()I
      28: istore_3
      29: iload_1
      30: ifge          51
      33: iload_3
      34: iload_2
      35: i2f
      36: aload_0
      37: getfield      #202                // Field mFirstOffset:F
      40: fmul
      41: f2i
      42: if_icmple     48
      45: iconst_1
      46: istore        4
      48: iload         4
      50: ireturn
      51: iload         5
      53: istore        4
      55: iload_1
      56: ifle          78
      59: iload         5
      61: istore        4
      63: iload_3
      64: iload_2
      65: i2f
      66: aload_0
      67: getfield      #205                // Field mLastOffset:F
      70: fmul
      71: f2i
      72: if_icmpge     78
      75: iconst_1
      76: istore        4
      78: iload         4
      80: ireturn

  protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #20                 // class android/support/v4/view/v$c
       4: ifeq          17
       7: aload_0
       8: aload_1
       9: invokespecial #742                // Method android/view/ViewGroup.checkLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Z
      12: ifeq          17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn

  public void clearOnPageChangeListeners();
    Code:
       0: aload_0
       1: getfield      #340                // Field mOnPageChangeListeners:Ljava/util/List;
       4: ifnull        16
       7: aload_0
       8: getfield      #340                // Field mOnPageChangeListeners:Ljava/util/List;
      11: invokeinterface #744,  1          // InterfaceMethod java/util/List.clear:()V
      16: return

  public void computeScroll();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #747                // Field mIsScrollStarted:Z
       5: aload_0
       6: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
       9: invokevirtual #271                // Method android/widget/Scroller.isFinished:()Z
      12: ifne          97
      15: aload_0
      16: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      19: invokevirtual #750                // Method android/widget/Scroller.computeScrollOffset:()Z
      22: ifeq          97
      25: aload_0
      26: invokevirtual #277                // Method getScrollX:()I
      29: istore_1
      30: aload_0
      31: invokevirtual #280                // Method getScrollY:()I
      34: istore_2
      35: aload_0
      36: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      39: invokevirtual #283                // Method android/widget/Scroller.getCurrX:()I
      42: istore_3
      43: aload_0
      44: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      47: invokevirtual #286                // Method android/widget/Scroller.getCurrY:()I
      50: istore        4
      52: iload_1
      53: iload_3
      54: if_icmpne     63
      57: iload_2
      58: iload         4
      60: if_icmpeq     92
      63: aload_0
      64: iload_3
      65: iload         4
      67: invokevirtual #290                // Method scrollTo:(II)V
      70: aload_0
      71: iload_3
      72: invokespecial #294                // Method pageScrolled:(I)Z
      75: ifne          92
      78: aload_0
      79: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      82: invokevirtual #274                // Method android/widget/Scroller.abortAnimation:()V
      85: aload_0
      86: iconst_0
      87: iload         4
      89: invokevirtual #290                // Method scrollTo:(II)V
      92: aload_0
      93: invokestatic  #753                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
      96: return
      97: aload_0
      98: iconst_1
      99: invokespecial #518                // Method completeScroll:(Z)V
     102: return

  void dataSetChanged();
    Code:
       0: aload_0
       1: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
       4: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
       7: istore        9
       9: aload_0
      10: iload         9
      12: putfield      #756                // Field mExpectedAdapterCount:I
      15: aload_0
      16: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      19: invokevirtual #250                // Method java/util/ArrayList.size:()I
      22: aload_0
      23: getfield      #207                // Field mOffscreenPageLimit:I
      26: iconst_2
      27: imul
      28: iconst_1
      29: iadd
      30: if_icmpge     50
      33: aload_0
      34: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      37: invokevirtual #250                // Method java/util/ArrayList.size:()I
      40: iload         9
      42: if_icmpge     50
      45: iconst_1
      46: istore_1
      47: goto          52
      50: iconst_0
      51: istore_1
      52: aload_0
      53: getfield      #322                // Field mCurItem:I
      56: istore_2
      57: iload_1
      58: istore        6
      60: iload_2
      61: istore_1
      62: iconst_0
      63: istore_3
      64: iconst_0
      65: istore_2
      66: iload_3
      67: aload_0
      68: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      71: invokevirtual #250                // Method java/util/ArrayList.size:()I
      74: if_icmpge     292
      77: aload_0
      78: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      81: iload_3
      82: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      85: checkcast     #17                 // class android/support/v4/view/v$b
      88: astore        10
      90: aload_0
      91: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      94: aload         10
      96: getfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
      99: invokevirtual #760                // Method android/support/v4/view/q.getItemPosition:(Ljava/lang/Object;)I
     102: istore        8
     104: iload         8
     106: iconst_m1
     107: if_icmpne     122
     110: iload_3
     111: istore        4
     113: iload_2
     114: istore        5
     116: iload_1
     117: istore        7
     119: goto          278
     122: iload         8
     124: bipush        -2
     126: if_icmpne     234
     129: aload_0
     130: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     133: iload_3
     134: invokevirtual #763                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     137: pop
     138: iload_3
     139: iconst_1
     140: isub
     141: istore        5
     143: iload_2
     144: istore        4
     146: iload_2
     147: ifne          161
     150: aload_0
     151: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     154: aload_0
     155: invokevirtual #767                // Method android/support/v4/view/q.startUpdate:(Landroid/view/ViewGroup;)V
     158: iconst_1
     159: istore        4
     161: aload_0
     162: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     165: aload_0
     166: aload         10
     168: getfield      #243                // Field android/support/v4/view/v$b.b:I
     171: aload         10
     173: getfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
     176: invokevirtual #771                // Method android/support/v4/view/q.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
     179: iload         5
     181: istore_3
     182: iload         4
     184: istore_2
     185: aload_0
     186: getfield      #322                // Field mCurItem:I
     189: aload         10
     191: getfield      #243                // Field android/support/v4/view/v$b.b:I
     194: if_icmpne     219
     197: iconst_0
     198: aload_0
     199: getfield      #322                // Field mCurItem:I
     202: iload         9
     204: iconst_1
     205: isub
     206: invokestatic  #328                // Method java/lang/Math.min:(II)I
     209: invokestatic  #331                // Method java/lang/Math.max:(II)I
     212: istore_1
     213: iload         4
     215: istore_2
     216: iload         5
     218: istore_3
     219: iconst_1
     220: istore        6
     222: iload_3
     223: istore        4
     225: iload_2
     226: istore        5
     228: iload_1
     229: istore        7
     231: goto          278
     234: iload_3
     235: istore        4
     237: iload_2
     238: istore        5
     240: iload_1
     241: istore        7
     243: aload         10
     245: getfield      #243                // Field android/support/v4/view/v$b.b:I
     248: iload         8
     250: if_icmpeq     278
     253: aload         10
     255: getfield      #243                // Field android/support/v4/view/v$b.b:I
     258: aload_0
     259: getfield      #322                // Field mCurItem:I
     262: if_icmpne     268
     265: iload         8
     267: istore_1
     268: aload         10
     270: iload         8
     272: putfield      #243                // Field android/support/v4/view/v$b.b:I
     275: goto          219
     278: iload         4
     280: iconst_1
     281: iadd
     282: istore_3
     283: iload         5
     285: istore_2
     286: iload         7
     288: istore_1
     289: goto          66
     292: iload_2
     293: ifeq          304
     296: aload_0
     297: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     300: aload_0
     301: invokevirtual #774                // Method android/support/v4/view/q.finishUpdate:(Landroid/view/ViewGroup;)V
     304: aload_0
     305: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     308: getstatic     #170                // Field COMPARATOR:Ljava/util/Comparator;
     311: invokestatic  #570                // Method java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
     314: iload         6
     316: ifeq          376
     319: aload_0
     320: invokevirtual #359                // Method getChildCount:()I
     323: istore_3
     324: iconst_0
     325: istore_2
     326: iload_2
     327: iload_3
     328: if_icmpge     365
     331: aload_0
     332: iload_2
     333: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
     336: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     339: checkcast     #20                 // class android/support/v4/view/v$c
     342: astore        10
     344: aload         10
     346: getfield      #525                // Field android/support/v4/view/v$c.a:Z
     349: ifne          358
     352: aload         10
     354: fconst_0
     355: putfield      #776                // Field android/support/v4/view/v$c.c:F
     358: iload_2
     359: iconst_1
     360: iadd
     361: istore_2
     362: goto          326
     365: aload_0
     366: iload_1
     367: iconst_0
     368: iconst_1
     369: invokevirtual #780                // Method setCurrentItemInternal:(IZZ)V
     372: aload_0
     373: invokevirtual #783                // Method requestLayout:()V
     376: return

  public boolean dispatchKeyEvent(android.view.KeyEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #787                // Method android/view/ViewGroup.dispatchKeyEvent:(Landroid/view/KeyEvent;)Z
       5: ifne          21
       8: aload_0
       9: aload_1
      10: invokevirtual #790                // Method executeKeyEvent:(Landroid/view/KeyEvent;)Z
      13: ifeq          19
      16: goto          21
      19: iconst_0
      20: ireturn
      21: iconst_1
      22: ireturn

  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_1
       1: invokevirtual #797                // Method android/view/accessibility/AccessibilityEvent.getEventType:()I
       4: sipush        4096
       7: if_icmpne     16
      10: aload_0
      11: aload_1
      12: invokespecial #799                // Method android/view/ViewGroup.dispatchPopulateAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)Z
      15: ireturn
      16: aload_0
      17: invokevirtual #359                // Method getChildCount:()I
      20: istore_3
      21: iconst_0
      22: istore_2
      23: iload_2
      24: iload_3
      25: if_icmpge     86
      28: aload_0
      29: iload_2
      30: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
      33: astore        4
      35: aload         4
      37: invokevirtual #579                // Method android/view/View.getVisibility:()I
      40: ifne          79
      43: aload_0
      44: aload         4
      46: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
      49: astore        5
      51: aload         5
      53: ifnull        79
      56: aload         5
      58: getfield      #243                // Field android/support/v4/view/v$b.b:I
      61: aload_0
      62: getfield      #322                // Field mCurItem:I
      65: if_icmpne     79
      68: aload         4
      70: aload_1
      71: invokevirtual #800                // Method android/view/View.dispatchPopulateAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)Z
      74: ifeq          79
      77: iconst_1
      78: ireturn
      79: iload_2
      80: iconst_1
      81: iadd
      82: istore_2
      83: goto          23
      86: iconst_0
      87: ireturn

  float distanceInfluenceForSnapDuration(float);
    Code:
       0: fload_1
       1: ldc_w         #802                // float 0.5f
       4: fsub
       5: ldc_w         #803                // float 0.47123894f
       8: fmul
       9: f2d
      10: invokestatic  #807                // Method java/lang/Math.sin:(D)D
      13: d2f
      14: freturn

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #811                // Method android/view/ViewGroup.draw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: invokevirtual #814                // Method getOverScrollMode:()I
       9: istore        4
      11: iconst_0
      12: istore_3
      13: iconst_0
      14: istore_2
      15: iload         4
      17: ifeq          64
      20: iload         4
      22: iconst_1
      23: if_icmpne     47
      26: aload_0
      27: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      30: ifnull        47
      33: aload_0
      34: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      37: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
      40: iconst_1
      41: if_icmple     47
      44: goto          64
      47: aload_0
      48: getfield      #488                // Field mLeftEdge:Landroid/widget/EdgeEffect;
      51: invokevirtual #817                // Method android/widget/EdgeEffect.finish:()V
      54: aload_0
      55: getfield      #499                // Field mRightEdge:Landroid/widget/EdgeEffect;
      58: invokevirtual #817                // Method android/widget/EdgeEffect.finish:()V
      61: goto          254
      64: aload_0
      65: getfield      #488                // Field mLeftEdge:Landroid/widget/EdgeEffect;
      68: invokevirtual #542                // Method android/widget/EdgeEffect.isFinished:()Z
      71: ifne          153
      74: aload_1
      75: invokevirtual #822                // Method android/graphics/Canvas.save:()I
      78: istore_3
      79: aload_0
      80: invokevirtual #825                // Method getHeight:()I
      83: aload_0
      84: invokevirtual #828                // Method getPaddingTop:()I
      87: isub
      88: aload_0
      89: invokevirtual #831                // Method getPaddingBottom:()I
      92: isub
      93: istore_2
      94: aload_0
      95: invokevirtual #454                // Method getWidth:()I
      98: istore        4
     100: aload_1
     101: ldc_w         #832                // float 270.0f
     104: invokevirtual #835                // Method android/graphics/Canvas.rotate:(F)V
     107: aload_1
     108: iload_2
     109: ineg
     110: aload_0
     111: invokevirtual #828                // Method getPaddingTop:()I
     114: iadd
     115: i2f
     116: aload_0
     117: getfield      #202                // Field mFirstOffset:F
     120: iload         4
     122: i2f
     123: fmul
     124: invokevirtual #839                // Method android/graphics/Canvas.translate:(FF)V
     127: aload_0
     128: getfield      #488                // Field mLeftEdge:Landroid/widget/EdgeEffect;
     131: iload_2
     132: iload         4
     134: invokevirtual #842                // Method android/widget/EdgeEffect.setSize:(II)V
     137: iconst_0
     138: aload_0
     139: getfield      #488                // Field mLeftEdge:Landroid/widget/EdgeEffect;
     142: aload_1
     143: invokevirtual #845                // Method android/widget/EdgeEffect.draw:(Landroid/graphics/Canvas;)Z
     146: ior
     147: istore_2
     148: aload_1
     149: iload_3
     150: invokevirtual #848                // Method android/graphics/Canvas.restoreToCount:(I)V
     153: iload_2
     154: istore_3
     155: aload_0
     156: getfield      #499                // Field mRightEdge:Landroid/widget/EdgeEffect;
     159: invokevirtual #542                // Method android/widget/EdgeEffect.isFinished:()Z
     162: ifne          254
     165: aload_1
     166: invokevirtual #822                // Method android/graphics/Canvas.save:()I
     169: istore        4
     171: aload_0
     172: invokevirtual #454                // Method getWidth:()I
     175: istore_3
     176: aload_0
     177: invokevirtual #825                // Method getHeight:()I
     180: istore        5
     182: aload_0
     183: invokevirtual #828                // Method getPaddingTop:()I
     186: istore        6
     188: aload_0
     189: invokevirtual #831                // Method getPaddingBottom:()I
     192: istore        7
     194: aload_1
     195: ldc_w         #849                // float 90.0f
     198: invokevirtual #835                // Method android/graphics/Canvas.rotate:(F)V
     201: aload_1
     202: aload_0
     203: invokevirtual #828                // Method getPaddingTop:()I
     206: ineg
     207: i2f
     208: aload_0
     209: getfield      #205                // Field mLastOffset:F
     212: fconst_1
     213: fadd
     214: fneg
     215: iload_3
     216: i2f
     217: fmul
     218: invokevirtual #839                // Method android/graphics/Canvas.translate:(FF)V
     221: aload_0
     222: getfield      #499                // Field mRightEdge:Landroid/widget/EdgeEffect;
     225: iload         5
     227: iload         6
     229: isub
     230: iload         7
     232: isub
     233: iload_3
     234: invokevirtual #842                // Method android/widget/EdgeEffect.setSize:(II)V
     237: iload_2
     238: aload_0
     239: getfield      #499                // Field mRightEdge:Landroid/widget/EdgeEffect;
     242: aload_1
     243: invokevirtual #845                // Method android/widget/EdgeEffect.draw:(Landroid/graphics/Canvas;)Z
     246: ior
     247: istore_3
     248: aload_1
     249: iload         4
     251: invokevirtual #848                // Method android/graphics/Canvas.restoreToCount:(I)V
     254: iload_3
     255: ifeq          262
     258: aload_0
     259: invokestatic  #753                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     262: return

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #852                // Method android/view/ViewGroup.drawableStateChanged:()V
       4: aload_0
       5: getfield      #854                // Field mMarginDrawable:Landroid/graphics/drawable/Drawable;
       8: astore_1
       9: aload_1
      10: ifnull        29
      13: aload_1
      14: invokevirtual #859                // Method android/graphics/drawable/Drawable.isStateful:()Z
      17: ifeq          29
      20: aload_1
      21: aload_0
      22: invokevirtual #863                // Method getDrawableState:()[I
      25: invokevirtual #867                // Method android/graphics/drawable/Drawable.setState:([I)Z
      28: pop
      29: return

  public void endFakeDrag();
    Code:
       0: aload_0
       1: getfield      #706                // Field mFakeDragging:Z
       4: ifne          18
       7: new           #477                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #870                // String No fake drag in progress. Call beginFakeDrag first.
      14: invokespecial #482                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      22: ifnull        120
      25: aload_0
      26: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      29: astore        4
      31: aload         4
      33: sipush        1000
      36: aload_0
      37: getfield      #872                // Field mMaximumVelocity:I
      40: i2f
      41: invokevirtual #876                // Method android/view/VelocityTracker.computeCurrentVelocity:(IF)V
      44: aload         4
      46: aload_0
      47: getfield      #209                // Field mActivePointerId:I
      50: invokevirtual #879                // Method android/view/VelocityTracker.getXVelocity:(I)F
      53: f2i
      54: istore_1
      55: aload_0
      56: iconst_1
      57: putfield      #296                // Field mPopulatePending:Z
      60: aload_0
      61: invokespecial #239                // Method getClientWidth:()I
      64: istore_2
      65: aload_0
      66: invokevirtual #277                // Method getScrollX:()I
      69: istore_3
      70: aload_0
      71: invokespecial #484                // Method infoForCurrentScrollPosition:()Landroid/support/v4/view/v$b;
      74: astore        4
      76: aload_0
      77: aload_0
      78: aload         4
      80: getfield      #243                // Field android/support/v4/view/v$b.b:I
      83: iload_3
      84: i2f
      85: iload_2
      86: i2f
      87: fdiv
      88: aload         4
      90: getfield      #245                // Field android/support/v4/view/v$b.e:F
      93: fsub
      94: aload         4
      96: getfield      #247                // Field android/support/v4/view/v$b.d:F
      99: fdiv
     100: iload_1
     101: aload_0
     102: getfield      #469                // Field mLastMotionX:F
     105: aload_0
     106: getfield      #711                // Field mInitialMotionX:F
     109: fsub
     110: f2i
     111: invokespecial #881                // Method determineTargetPage:(IFII)I
     114: iconst_1
     115: iconst_1
     116: iload_1
     117: invokevirtual #884                // Method setCurrentItemInternal:(IZZI)V
     120: aload_0
     121: invokespecial #538                // Method endDrag:()V
     124: aload_0
     125: iconst_0
     126: putfield      #706                // Field mFakeDragging:Z
     129: return

  public boolean executeKeyEvent(android.view.KeyEvent);
    Code:
       0: aload_1
       1: invokevirtual #889                // Method android/view/KeyEvent.getAction:()I
       4: ifne          111
       7: aload_1
       8: invokevirtual #892                // Method android/view/KeyEvent.getKeyCode:()I
      11: istore_2
      12: iload_2
      13: bipush        61
      15: if_icmpeq     84
      18: iload_2
      19: tableswitch   { // 21 to 22
                    21: 62
                    22: 43
               default: 40
          }
      40: goto          111
      43: aload_1
      44: iconst_2
      45: invokevirtual #895                // Method android/view/KeyEvent.hasModifiers:(I)Z
      48: ifeq          56
      51: aload_0
      52: invokevirtual #695                // Method pageRight:()Z
      55: ireturn
      56: bipush        66
      58: istore_2
      59: goto          78
      62: aload_1
      63: iconst_2
      64: invokevirtual #895                // Method android/view/KeyEvent.hasModifiers:(I)Z
      67: ifeq          75
      70: aload_0
      71: invokevirtual #689                // Method pageLeft:()Z
      74: ireturn
      75: bipush        17
      77: istore_2
      78: aload_0
      79: iload_2
      80: invokevirtual #897                // Method arrowScroll:(I)Z
      83: ireturn
      84: aload_1
      85: invokevirtual #900                // Method android/view/KeyEvent.hasNoModifiers:()Z
      88: ifeq          97
      91: aload_0
      92: iconst_2
      93: invokevirtual #897                // Method arrowScroll:(I)Z
      96: ireturn
      97: aload_1
      98: iconst_1
      99: invokevirtual #895                // Method android/view/KeyEvent.hasModifiers:(I)Z
     102: ifeq          111
     105: aload_0
     106: iconst_1
     107: invokevirtual #897                // Method arrowScroll:(I)Z
     110: ireturn
     111: iconst_0
     112: ireturn

  public void fakeDragBy(float);
    Code:
       0: aload_0
       1: getfield      #706                // Field mFakeDragging:Z
       4: ifne          18
       7: new           #477                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #870                // String No fake drag in progress. Call beginFakeDrag first.
      14: invokespecial #482                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      22: ifnonnull     26
      25: return
      26: aload_0
      27: aload_0
      28: getfield      #469                // Field mLastMotionX:F
      31: fload_1
      32: fadd
      33: putfield      #469                // Field mLastMotionX:F
      36: aload_0
      37: invokevirtual #277                // Method getScrollX:()I
      40: i2f
      41: fload_1
      42: fsub
      43: fstore_3
      44: aload_0
      45: invokespecial #239                // Method getClientWidth:()I
      48: i2f
      49: fstore        4
      51: aload_0
      52: getfield      #202                // Field mFirstOffset:F
      55: fload         4
      57: fmul
      58: fstore_1
      59: aload_0
      60: getfield      #205                // Field mLastOffset:F
      63: fload         4
      65: fmul
      66: fstore_2
      67: aload_0
      68: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      71: iconst_0
      72: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      75: checkcast     #17                 // class android/support/v4/view/v$b
      78: astore        8
      80: aload_0
      81: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      84: aload_0
      85: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      88: invokevirtual #250                // Method java/util/ArrayList.size:()I
      91: iconst_1
      92: isub
      93: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      96: checkcast     #17                 // class android/support/v4/view/v$b
      99: astore        9
     101: aload         8
     103: getfield      #243                // Field android/support/v4/view/v$b.b:I
     106: ifeq          118
     109: aload         8
     111: getfield      #245                // Field android/support/v4/view/v$b.e:F
     114: fload         4
     116: fmul
     117: fstore_1
     118: aload         9
     120: getfield      #243                // Field android/support/v4/view/v$b.b:I
     123: aload_0
     124: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     127: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
     130: iconst_1
     131: isub
     132: if_icmpeq     144
     135: aload         9
     137: getfield      #245                // Field android/support/v4/view/v$b.e:F
     140: fload         4
     142: fmul
     143: fstore_2
     144: fload_3
     145: fload_1
     146: fcmpg
     147: ifge          153
     150: goto          163
     153: fload_3
     154: fstore_1
     155: fload_3
     156: fload_2
     157: fcmpl
     158: ifle          163
     161: fload_2
     162: fstore_1
     163: aload_0
     164: getfield      #469                // Field mLastMotionX:F
     167: fstore_2
     168: fload_1
     169: f2i
     170: istore        5
     172: aload_0
     173: fload_2
     174: fload_1
     175: iload         5
     177: i2f
     178: fsub
     179: fadd
     180: putfield      #469                // Field mLastMotionX:F
     183: aload_0
     184: iload         5
     186: aload_0
     187: invokevirtual #280                // Method getScrollY:()I
     190: invokevirtual #290                // Method scrollTo:(II)V
     193: aload_0
     194: iload         5
     196: invokespecial #294                // Method pageScrolled:(I)Z
     199: pop
     200: invokestatic  #721                // Method android/os/SystemClock.uptimeMillis:()J
     203: lstore        6
     205: aload_0
     206: getfield      #730                // Field mFakeDragBeginTime:J
     209: lload         6
     211: iconst_2
     212: aload_0
     213: getfield      #469                // Field mLastMotionX:F
     216: fconst_0
     217: iconst_0
     218: invokestatic  #724                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
     221: astore        8
     223: aload_0
     224: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
     227: aload         8
     229: invokevirtual #727                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     232: aload         8
     234: invokevirtual #728                // Method android/view/MotionEvent.recycle:()V
     237: return

  protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams();
    Code:
       0: new           #20                 // class android/support/v4/view/v$c
       3: dup
       4: invokespecial #903                // Method android/support/v4/view/v$c."<init>":()V
       7: areturn

  public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: new           #20                 // class android/support/v4/view/v$c
       3: dup
       4: aload_0
       5: invokevirtual #908                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: invokespecial #909                // Method android/support/v4/view/v$c."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
      12: areturn

  protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: invokevirtual #911                // Method generateDefaultLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: areturn

  public android.support.v4.view.q getAdapter();
    Code:
       0: aload_0
       1: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
       4: areturn

  protected int getChildDrawingOrder(int, int);
    Code:
       0: iload_2
       1: istore_3
       2: aload_0
       3: getfield      #557                // Field mDrawingOrder:I
       6: iconst_2
       7: if_icmpne     16
      10: iload_1
      11: iconst_1
      12: isub
      13: iload_2
      14: isub
      15: istore_3
      16: aload_0
      17: getfield      #559                // Field mDrawingOrderedChildren:Ljava/util/ArrayList;
      20: iload_3
      21: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      24: checkcast     #367                // class android/view/View
      27: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      30: checkcast     #20                 // class android/support/v4/view/v$c
      33: getfield      #916                // Field android/support/v4/view/v$c.f:I
      36: ireturn

  public int getCurrentItem();
    Code:
       0: aload_0
       1: getfield      #322                // Field mCurItem:I
       4: ireturn

  public int getOffscreenPageLimit();
    Code:
       0: aload_0
       1: getfield      #207                // Field mOffscreenPageLimit:I
       4: ireturn

  public int getPageMargin();
    Code:
       0: aload_0
       1: getfield      #241                // Field mPageMargin:I
       4: ireturn

  android.support.v4.view.v$b infoForAnyChild(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #417                // Method android/view/View.getParent:()Landroid/view/ViewParent;
       4: astore_2
       5: aload_2
       6: aload_0
       7: if_acmpeq     34
      10: aload_2
      11: ifnull        32
      14: aload_2
      15: instanceof    #367                // class android/view/View
      18: ifne          24
      21: goto          32
      24: aload_2
      25: checkcast     #367                // class android/view/View
      28: astore_1
      29: goto          0
      32: aconst_null
      33: areturn
      34: aload_0
      35: aload_1
      36: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
      39: areturn

  android.support.v4.view.v$b infoForChild(android.view.View);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #185                // Field mItems:Ljava/util/ArrayList;
       7: invokevirtual #250                // Method java/util/ArrayList.size:()I
      10: if_icmpge     49
      13: aload_0
      14: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      17: iload_2
      18: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #17                 // class android/support/v4/view/v$b
      24: astore_3
      25: aload_0
      26: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      29: aload_1
      30: aload_3
      31: getfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
      34: invokevirtual #923                // Method android/support/v4/view/q.isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z
      37: ifeq          42
      40: aload_3
      41: areturn
      42: iload_2
      43: iconst_1
      44: iadd
      45: istore_2
      46: goto          2
      49: aconst_null
      50: areturn

  android.support.v4.view.v$b infoForPosition(int);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #185                // Field mItems:Ljava/util/ArrayList;
       7: invokevirtual #250                // Method java/util/ArrayList.size:()I
      10: if_icmpge     42
      13: aload_0
      14: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      17: iload_2
      18: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #17                 // class android/support/v4/view/v$b
      24: astore_3
      25: aload_3
      26: getfield      #243                // Field android/support/v4/view/v$b.b:I
      29: iload_1
      30: if_icmpne     35
      33: aload_3
      34: areturn
      35: iload_2
      36: iconst_1
      37: iadd
      38: istore_2
      39: goto          2
      42: aconst_null
      43: areturn

  void initViewPager();
    Code:
       0: aload_0
       1: iconst_0
       2: invokevirtual #926                // Method setWillNotDraw:(Z)V
       5: aload_0
       6: ldc_w         #586                // int 262144
       9: invokevirtual #929                // Method setDescendantFocusability:(I)V
      12: aload_0
      13: iconst_1
      14: invokevirtual #932                // Method setFocusable:(Z)V
      17: aload_0
      18: invokevirtual #908                // Method getContext:()Landroid/content/Context;
      21: astore_2
      22: aload_0
      23: new           #267                // class android/widget/Scroller
      26: dup
      27: aload_2
      28: getstatic     #173                // Field sInterpolator:Landroid/view/animation/Interpolator;
      31: invokespecial #935                // Method android/widget/Scroller."<init>":(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
      34: putfield      #265                // Field mScroller:Landroid/widget/Scroller;
      37: aload_2
      38: invokestatic  #940                // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
      41: astore_3
      42: aload_2
      43: invokevirtual #946                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      46: invokevirtual #952                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      49: getfield      #957                // Field android/util/DisplayMetrics.density:F
      52: fstore_1
      53: aload_0
      54: aload_3
      55: invokevirtual #960                // Method android/view/ViewConfiguration.getScaledPagingTouchSlop:()I
      58: putfield      #962                // Field mTouchSlop:I
      61: aload_0
      62: ldc_w         #963                // float 400.0f
      65: fload_1
      66: fmul
      67: f2i
      68: putfield      #320                // Field mMinimumVelocity:I
      71: aload_0
      72: aload_3
      73: invokevirtual #966                // Method android/view/ViewConfiguration.getScaledMaximumFlingVelocity:()I
      76: putfield      #872                // Field mMaximumVelocity:I
      79: aload_0
      80: new           #493                // class android/widget/EdgeEffect
      83: dup
      84: aload_2
      85: invokespecial #967                // Method android/widget/EdgeEffect."<init>":(Landroid/content/Context;)V
      88: putfield      #488                // Field mLeftEdge:Landroid/widget/EdgeEffect;
      91: aload_0
      92: new           #493                // class android/widget/EdgeEffect
      95: dup
      96: aload_2
      97: invokespecial #967                // Method android/widget/EdgeEffect."<init>":(Landroid/content/Context;)V
     100: putfield      #499                // Field mRightEdge:Landroid/widget/EdgeEffect;
     103: aload_0
     104: ldc_w         #968                // float 25.0f
     107: fload_1
     108: fmul
     109: f2i
     110: putfield      #318                // Field mFlingDistance:I
     113: aload_0
     114: fconst_2
     115: fload_1
     116: fmul
     117: f2i
     118: putfield      #970                // Field mCloseEnough:I
     121: aload_0
     122: fload_1
     123: ldc_w         #971                // float 16.0f
     126: fmul
     127: f2i
     128: putfield      #973                // Field mDefaultGutterSize:I
     131: aload_0
     132: new           #23                 // class android/support/v4/view/v$d
     135: dup
     136: aload_0
     137: invokespecial #974                // Method android/support/v4/view/v$d."<init>":(Landroid/support/v4/view/v;)V
     140: invokestatic  #977                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/b;)V
     143: aload_0
     144: invokestatic  #980                // Method android/support/v4/view/s.d:(Landroid/view/View;)I
     147: ifne          155
     150: aload_0
     151: iconst_1
     152: invokestatic  #983                // Method android/support/v4/view/s.a:(Landroid/view/View;I)V
     155: aload_0
     156: new           #12                 // class android/support/v4/view/v$4
     159: dup
     160: aload_0
     161: invokespecial #984                // Method android/support/v4/view/v$4."<init>":(Landroid/support/v4/view/v;)V
     164: invokestatic  #987                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/p;)V
     167: return

  public boolean isFakeDragging();
    Code:
       0: aload_0
       1: getfield      #706                // Field mFakeDragging:Z
       4: ireturn

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #991                // Method android/view/ViewGroup.onAttachedToWindow:()V
       4: aload_0
       5: iconst_1
       6: putfield      #211                // Field mFirstLayout:Z
       9: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #218                // Field mEndScrollRunnable:Ljava/lang/Runnable;
       5: invokevirtual #996                // Method removeCallbacks:(Ljava/lang/Runnable;)Z
       8: pop
       9: aload_0
      10: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      13: ifnull        33
      16: aload_0
      17: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      20: invokevirtual #271                // Method android/widget/Scroller.isFinished:()Z
      23: ifne          33
      26: aload_0
      27: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      30: invokevirtual #274                // Method android/widget/Scroller.abortAnimation:()V
      33: aload_0
      34: invokespecial #998                // Method android/view/ViewGroup.onDetachedFromWindow:()V
      37: return

  protected void onDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #1001               // Method android/view/ViewGroup.onDraw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #241                // Field mPageMargin:I
       9: ifle          339
      12: aload_0
      13: getfield      #854                // Field mMarginDrawable:Landroid/graphics/drawable/Drawable;
      16: ifnull        339
      19: aload_0
      20: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      23: invokevirtual #250                // Method java/util/ArrayList.size:()I
      26: ifle          339
      29: aload_0
      30: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      33: ifnull        339
      36: aload_0
      37: invokevirtual #277                // Method getScrollX:()I
      40: istore        10
      42: aload_0
      43: invokevirtual #454                // Method getWidth:()I
      46: istore        11
      48: aload_0
      49: getfield      #241                // Field mPageMargin:I
      52: i2f
      53: fstore_2
      54: iload         11
      56: i2f
      57: fstore        5
      59: fload_2
      60: fload         5
      62: fdiv
      63: fstore_3
      64: aload_0
      65: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      68: astore        14
      70: iconst_0
      71: istore        9
      73: aload         14
      75: iconst_0
      76: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      79: checkcast     #17                 // class android/support/v4/view/v$b
      82: astore        14
      84: aload         14
      86: getfield      #245                // Field android/support/v4/view/v$b.e:F
      89: fstore_2
      90: aload_0
      91: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      94: invokevirtual #250                // Method java/util/ArrayList.size:()I
      97: istore        12
      99: aload         14
     101: getfield      #243                // Field android/support/v4/view/v$b.b:I
     104: istore        8
     106: aload_0
     107: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     110: iload         12
     112: iconst_1
     113: isub
     114: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     117: checkcast     #17                 // class android/support/v4/view/v$b
     120: getfield      #243                // Field android/support/v4/view/v$b.b:I
     123: istore        13
     125: iload         8
     127: iload         13
     129: if_icmpge     339
     132: iload         8
     134: aload         14
     136: getfield      #243                // Field android/support/v4/view/v$b.b:I
     139: if_icmple     176
     142: iload         9
     144: iload         12
     146: if_icmpge     176
     149: aload_0
     150: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     153: astore        14
     155: iload         9
     157: iconst_1
     158: iadd
     159: istore        9
     161: aload         14
     163: iload         9
     165: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     168: checkcast     #17                 // class android/support/v4/view/v$b
     171: astore        14
     173: goto          132
     176: iload         8
     178: aload         14
     180: getfield      #243                // Field android/support/v4/view/v$b.b:I
     183: if_icmpne     233
     186: aload         14
     188: getfield      #245                // Field android/support/v4/view/v$b.e:F
     191: fstore        4
     193: aload         14
     195: getfield      #247                // Field android/support/v4/view/v$b.d:F
     198: fstore        7
     200: aload         14
     202: getfield      #245                // Field android/support/v4/view/v$b.e:F
     205: fstore_2
     206: aload         14
     208: getfield      #247                // Field android/support/v4/view/v$b.d:F
     211: fstore        6
     213: fload         4
     215: fload         7
     217: fadd
     218: fload         5
     220: fmul
     221: fstore        4
     223: fload_2
     224: fload         6
     226: fadd
     227: fload_3
     228: fadd
     229: fstore_2
     230: goto          260
     233: aload_0
     234: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     237: iload         8
     239: invokevirtual #258                // Method android/support/v4/view/q.getPageWidth:(I)F
     242: fstore        6
     244: fload_2
     245: fload         6
     247: fadd
     248: fload         5
     250: fmul
     251: fstore        4
     253: fload_2
     254: fload         6
     256: fload_3
     257: fadd
     258: fadd
     259: fstore_2
     260: aload_0
     261: getfield      #241                // Field mPageMargin:I
     264: i2f
     265: fload         4
     267: fadd
     268: iload         10
     270: i2f
     271: fcmpl
     272: ifle          317
     275: aload_0
     276: getfield      #854                // Field mMarginDrawable:Landroid/graphics/drawable/Drawable;
     279: fload         4
     281: invokestatic  #1005               // Method java/lang/Math.round:(F)I
     284: aload_0
     285: getfield      #1007               // Field mTopPageBounds:I
     288: aload_0
     289: getfield      #241                // Field mPageMargin:I
     292: i2f
     293: fload         4
     295: fadd
     296: invokestatic  #1005               // Method java/lang/Math.round:(F)I
     299: aload_0
     300: getfield      #1009               // Field mBottomPageBounds:I
     303: invokevirtual #1012               // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     306: aload_0
     307: getfield      #854                // Field mMarginDrawable:Landroid/graphics/drawable/Drawable;
     310: aload_1
     311: invokevirtual #1013               // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     314: goto          317
     317: fload         4
     319: iload         10
     321: iload         11
     323: iadd
     324: i2f
     325: fcmpl
     326: ifle          330
     329: return
     330: iload         8
     332: iconst_1
     333: iadd
     334: istore        8
     336: goto          125
     339: return

  public boolean onInterceptTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #1016               // Method android/view/MotionEvent.getAction:()I
       4: sipush        255
       7: iand
       8: istore        7
      10: iload         7
      12: iconst_3
      13: if_icmpeq     479
      16: iload         7
      18: iconst_1
      19: if_icmpne     25
      22: goto          479
      25: iload         7
      27: ifeq          48
      30: aload_0
      31: getfield      #374                // Field mIsBeingDragged:Z
      34: ifeq          39
      37: iconst_1
      38: ireturn
      39: aload_0
      40: getfield      #376                // Field mIsUnableToDrag:Z
      43: ifeq          48
      46: iconst_0
      47: ireturn
      48: iload         7
      50: ifeq          318
      53: iload         7
      55: iconst_2
      56: if_icmpeq     77
      59: iload         7
      61: bipush        6
      63: if_icmpeq     69
      66: goto          452
      69: aload_0
      70: aload_1
      71: invokespecial #1018               // Method onSecondaryPointerUp:(Landroid/view/MotionEvent;)V
      74: goto          452
      77: aload_0
      78: getfield      #209                // Field mActivePointerId:I
      81: istore        7
      83: iload         7
      85: iconst_m1
      86: if_icmpne     92
      89: goto          452
      92: aload_1
      93: iload         7
      95: invokevirtual #1021               // Method android/view/MotionEvent.findPointerIndex:(I)I
      98: istore        7
     100: aload_1
     101: iload         7
     103: invokevirtual #467                // Method android/view/MotionEvent.getX:(I)F
     106: fstore_3
     107: fload_3
     108: aload_0
     109: getfield      #469                // Field mLastMotionX:F
     112: fsub
     113: fstore_2
     114: fload_2
     115: invokestatic  #491                // Method java/lang/Math.abs:(F)F
     118: fstore        5
     120: aload_1
     121: iload         7
     123: invokevirtual #1024               // Method android/view/MotionEvent.getY:(I)F
     126: fstore        4
     128: fload         4
     130: aload_0
     131: getfield      #1026               // Field mInitialMotionY:F
     134: fsub
     135: invokestatic  #491                // Method java/lang/Math.abs:(F)F
     138: fstore        6
     140: fload_2
     141: fconst_0
     142: fcmpl
     143: ifeq          192
     146: aload_0
     147: aload_0
     148: getfield      #469                // Field mLastMotionX:F
     151: fload_2
     152: invokespecial #1028               // Method isGutterDrag:(FF)Z
     155: ifne          192
     158: aload_0
     159: aload_0
     160: iconst_0
     161: fload_2
     162: f2i
     163: fload_3
     164: f2i
     165: fload         4
     167: f2i
     168: invokevirtual #738                // Method canScroll:(Landroid/view/View;ZIII)Z
     171: ifeq          192
     174: aload_0
     175: fload_3
     176: putfield      #469                // Field mLastMotionX:F
     179: aload_0
     180: fload         4
     182: putfield      #1030               // Field mLastMotionY:F
     185: aload_0
     186: iconst_1
     187: putfield      #376                // Field mIsUnableToDrag:Z
     190: iconst_0
     191: ireturn
     192: fload         5
     194: aload_0
     195: getfield      #962                // Field mTouchSlop:I
     198: i2f
     199: fcmpl
     200: ifle          280
     203: fload         5
     205: ldc_w         #802                // float 0.5f
     208: fmul
     209: fload         6
     211: fcmpl
     212: ifle          280
     215: aload_0
     216: iconst_1
     217: putfield      #374                // Field mIsBeingDragged:Z
     220: aload_0
     221: iconst_1
     222: invokespecial #1032               // Method requestParentDisallowInterceptTouchEvent:(Z)V
     225: aload_0
     226: iconst_1
     227: invokevirtual #709                // Method setScrollState:(I)V
     230: fload_2
     231: fconst_0
     232: fcmpl
     233: ifle          250
     236: aload_0
     237: getfield      #711                // Field mInitialMotionX:F
     240: aload_0
     241: getfield      #962                // Field mTouchSlop:I
     244: i2f
     245: fadd
     246: fstore_2
     247: goto          261
     250: aload_0
     251: getfield      #711                // Field mInitialMotionX:F
     254: aload_0
     255: getfield      #962                // Field mTouchSlop:I
     258: i2f
     259: fsub
     260: fstore_2
     261: aload_0
     262: fload_2
     263: putfield      #469                // Field mLastMotionX:F
     266: aload_0
     267: fload         4
     269: putfield      #1030               // Field mLastMotionY:F
     272: aload_0
     273: iconst_1
     274: invokespecial #263                // Method setScrollingCacheEnabled:(Z)V
     277: goto          296
     280: fload         6
     282: aload_0
     283: getfield      #962                // Field mTouchSlop:I
     286: i2f
     287: fcmpl
     288: ifle          296
     291: aload_0
     292: iconst_1
     293: putfield      #376                // Field mIsUnableToDrag:Z
     296: aload_0
     297: getfield      #374                // Field mIsBeingDragged:Z
     300: ifeq          452
     303: aload_0
     304: fload_3
     305: invokespecial #1034               // Method performDrag:(F)Z
     308: ifeq          452
     311: aload_0
     312: invokestatic  #753                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     315: goto          452
     318: aload_1
     319: invokevirtual #1037               // Method android/view/MotionEvent.getX:()F
     322: fstore_2
     323: aload_0
     324: fload_2
     325: putfield      #711                // Field mInitialMotionX:F
     328: aload_0
     329: fload_2
     330: putfield      #469                // Field mLastMotionX:F
     333: aload_1
     334: invokevirtual #1039               // Method android/view/MotionEvent.getY:()F
     337: fstore_2
     338: aload_0
     339: fload_2
     340: putfield      #1026               // Field mInitialMotionY:F
     343: aload_0
     344: fload_2
     345: putfield      #1030               // Field mLastMotionY:F
     348: aload_0
     349: aload_1
     350: iconst_0
     351: invokevirtual #464                // Method android/view/MotionEvent.getPointerId:(I)I
     354: putfield      #209                // Field mActivePointerId:I
     357: aload_0
     358: iconst_0
     359: putfield      #376                // Field mIsUnableToDrag:Z
     362: aload_0
     363: iconst_1
     364: putfield      #747                // Field mIsScrollStarted:Z
     367: aload_0
     368: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
     371: invokevirtual #750                // Method android/widget/Scroller.computeScrollOffset:()Z
     374: pop
     375: aload_0
     376: getfield      #220                // Field mScrollState:I
     379: iconst_2
     380: if_icmpne     442
     383: aload_0
     384: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
     387: invokevirtual #1042               // Method android/widget/Scroller.getFinalX:()I
     390: aload_0
     391: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
     394: invokevirtual #283                // Method android/widget/Scroller.getCurrX:()I
     397: isub
     398: invokestatic  #316                // Method java/lang/Math.abs:(I)I
     401: aload_0
     402: getfield      #970                // Field mCloseEnough:I
     405: if_icmple     442
     408: aload_0
     409: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
     412: invokevirtual #274                // Method android/widget/Scroller.abortAnimation:()V
     415: aload_0
     416: iconst_0
     417: putfield      #296                // Field mPopulatePending:Z
     420: aload_0
     421: invokevirtual #1045               // Method populate:()V
     424: aload_0
     425: iconst_1
     426: putfield      #374                // Field mIsBeingDragged:Z
     429: aload_0
     430: iconst_1
     431: invokespecial #1032               // Method requestParentDisallowInterceptTouchEvent:(Z)V
     434: aload_0
     435: iconst_1
     436: invokevirtual #709                // Method setScrollState:(I)V
     439: goto          452
     442: aload_0
     443: iconst_0
     444: invokespecial #518                // Method completeScroll:(Z)V
     447: aload_0
     448: iconst_0
     449: putfield      #374                // Field mIsBeingDragged:Z
     452: aload_0
     453: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
     456: ifnonnull     466
     459: aload_0
     460: invokestatic  #715                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
     463: putfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
     466: aload_0
     467: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
     470: aload_1
     471: invokevirtual #727                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     474: aload_0
     475: getfield      #374                // Field mIsBeingDragged:Z
     478: ireturn
     479: aload_0
     480: invokespecial #1047               // Method resetTouch:()Z
     483: pop
     484: iconst_0
     485: ireturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #359                // Method getChildCount:()I
       4: istore        14
       6: iload         4
       8: iload_2
       9: isub
      10: istore        15
      12: iload         5
      14: iload_3
      15: isub
      16: istore        16
      18: aload_0
      19: invokevirtual #428                // Method getPaddingLeft:()I
      22: istore_3
      23: aload_0
      24: invokevirtual #828                // Method getPaddingTop:()I
      27: istore_2
      28: aload_0
      29: invokevirtual #431                // Method getPaddingRight:()I
      32: istore        8
      34: aload_0
      35: invokevirtual #831                // Method getPaddingBottom:()I
      38: istore        5
      40: aload_0
      41: invokevirtual #277                // Method getScrollX:()I
      44: istore        17
      46: iconst_0
      47: istore        9
      49: iconst_0
      50: istore        10
      52: iload         10
      54: iload         14
      56: if_icmpge     402
      59: aload_0
      60: iload         10
      62: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
      65: astore        18
      67: iload_3
      68: istore        7
      70: iload         8
      72: istore        13
      74: iload_2
      75: istore        12
      77: iload         5
      79: istore        11
      81: iload         9
      83: istore        4
      85: aload         18
      87: invokevirtual #579                // Method android/view/View.getVisibility:()I
      90: bipush        8
      92: if_icmpeq     375
      95: aload         18
      97: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     100: checkcast     #20                 // class android/support/v4/view/v$c
     103: astore        19
     105: iload_3
     106: istore        7
     108: iload         8
     110: istore        13
     112: iload_2
     113: istore        12
     115: iload         5
     117: istore        11
     119: iload         9
     121: istore        4
     123: aload         19
     125: getfield      #525                // Field android/support/v4/view/v$c.a:Z
     128: ifeq          375
     131: aload         19
     133: getfield      #1050               // Field android/support/v4/view/v$c.b:I
     136: bipush        7
     138: iand
     139: istore        4
     141: aload         19
     143: getfield      #1050               // Field android/support/v4/view/v$c.b:I
     146: bipush        112
     148: iand
     149: istore        11
     151: iload         4
     153: iconst_1
     154: if_icmpeq     226
     157: iload         4
     159: iconst_3
     160: if_icmpeq     207
     163: iload         4
     165: iconst_5
     166: if_icmpeq     178
     169: iload_3
     170: istore        4
     172: iload_3
     173: istore        7
     175: goto          245
     178: iload         15
     180: iload         8
     182: isub
     183: aload         18
     185: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     188: isub
     189: istore        4
     191: iload         8
     193: aload         18
     195: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     198: iadd
     199: istore        8
     201: iload_3
     202: istore        7
     204: goto          245
     207: aload         18
     209: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     212: istore        7
     214: iload_3
     215: istore        4
     217: iload         7
     219: iload_3
     220: iadd
     221: istore        7
     223: goto          245
     226: iload         15
     228: aload         18
     230: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     233: isub
     234: iconst_2
     235: idiv
     236: iload_3
     237: invokestatic  #331                // Method java/lang/Math.max:(II)I
     240: istore        4
     242: iload_3
     243: istore        7
     245: iload         11
     247: bipush        16
     249: if_icmpeq     313
     252: iload         11
     254: bipush        48
     256: if_icmpeq     296
     259: iload         11
     261: bipush        80
     263: if_icmpeq     271
     266: iload_2
     267: istore_3
     268: goto          328
     271: iload         16
     273: iload         5
     275: isub
     276: aload         18
     278: invokevirtual #1054               // Method android/view/View.getMeasuredHeight:()I
     281: isub
     282: istore_3
     283: iload         5
     285: aload         18
     287: invokevirtual #1054               // Method android/view/View.getMeasuredHeight:()I
     290: iadd
     291: istore        5
     293: goto          328
     296: aload         18
     298: invokevirtual #1054               // Method android/view/View.getMeasuredHeight:()I
     301: istore        11
     303: iload_2
     304: istore_3
     305: iload         11
     307: iload_2
     308: iadd
     309: istore_2
     310: goto          328
     313: iload         16
     315: aload         18
     317: invokevirtual #1054               // Method android/view/View.getMeasuredHeight:()I
     320: isub
     321: iconst_2
     322: idiv
     323: iload_2
     324: invokestatic  #331                // Method java/lang/Math.max:(II)I
     327: istore_3
     328: iload         4
     330: iload         17
     332: iadd
     333: istore        4
     335: aload         18
     337: iload         4
     339: iload_3
     340: aload         18
     342: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     345: iload         4
     347: iadd
     348: iload_3
     349: aload         18
     351: invokevirtual #1054               // Method android/view/View.getMeasuredHeight:()I
     354: iadd
     355: invokevirtual #1057               // Method android/view/View.layout:(IIII)V
     358: iload         9
     360: iconst_1
     361: iadd
     362: istore        4
     364: iload         5
     366: istore        11
     368: iload_2
     369: istore        12
     371: iload         8
     373: istore        13
     375: iload         10
     377: iconst_1
     378: iadd
     379: istore        10
     381: iload         7
     383: istore_3
     384: iload         13
     386: istore        8
     388: iload         12
     390: istore_2
     391: iload         11
     393: istore        5
     395: iload         4
     397: istore        9
     399: goto          52
     402: iconst_0
     403: istore        4
     405: iload         4
     407: iload         14
     409: if_icmpge     563
     412: aload_0
     413: iload         4
     415: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
     418: astore        18
     420: aload         18
     422: invokevirtual #579                // Method android/view/View.getVisibility:()I
     425: bipush        8
     427: if_icmpeq     554
     430: aload         18
     432: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     435: checkcast     #20                 // class android/support/v4/view/v$c
     438: astore        19
     440: aload         19
     442: getfield      #525                // Field android/support/v4/view/v$c.a:Z
     445: ifne          554
     448: aload_0
     449: aload         18
     451: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
     454: astore        20
     456: aload         20
     458: ifnull        554
     461: iload         15
     463: iload_3
     464: isub
     465: iload         8
     467: isub
     468: i2f
     469: fstore        6
     471: aload         20
     473: getfield      #245                // Field android/support/v4/view/v$b.e:F
     476: fload         6
     478: fmul
     479: f2i
     480: iload_3
     481: iadd
     482: istore        7
     484: aload         19
     486: getfield      #639                // Field android/support/v4/view/v$c.d:Z
     489: ifeq          531
     492: aload         19
     494: iconst_0
     495: putfield      #639                // Field android/support/v4/view/v$c.d:Z
     498: aload         18
     500: fload         6
     502: aload         19
     504: getfield      #776                // Field android/support/v4/view/v$c.c:F
     507: fmul
     508: f2i
     509: ldc_w         #1058               // int 1073741824
     512: invokestatic  #1063               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     515: iload         16
     517: iload_2
     518: isub
     519: iload         5
     521: isub
     522: ldc_w         #1058               // int 1073741824
     525: invokestatic  #1063               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     528: invokevirtual #1066               // Method android/view/View.measure:(II)V
     531: aload         18
     533: iload         7
     535: iload_2
     536: aload         18
     538: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     541: iload         7
     543: iadd
     544: aload         18
     546: invokevirtual #1054               // Method android/view/View.getMeasuredHeight:()I
     549: iload_2
     550: iadd
     551: invokevirtual #1057               // Method android/view/View.layout:(IIII)V
     554: iload         4
     556: iconst_1
     557: iadd
     558: istore        4
     560: goto          405
     563: aload_0
     564: iload_2
     565: putfield      #1007               // Field mTopPageBounds:I
     568: aload_0
     569: iload         16
     571: iload         5
     573: isub
     574: putfield      #1009               // Field mBottomPageBounds:I
     577: aload_0
     578: iload         9
     580: putfield      #1068               // Field mDecorChildCount:I
     583: aload_0
     584: getfield      #211                // Field mFirstLayout:Z
     587: ifeq          604
     590: aload_0
     591: aload_0
     592: getfield      #322                // Field mCurItem:I
     595: iconst_0
     596: iconst_0
     597: iconst_0
     598: invokespecial #1070               // Method scrollToItem:(IZIZ)V
     601: goto          604
     604: aload_0
     605: iconst_0
     606: putfield      #211                // Field mFirstLayout:Z
     609: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iconst_0
       2: iload_1
       3: invokestatic  #1074               // Method getDefaultSize:(II)I
       6: iconst_0
       7: iload_2
       8: invokestatic  #1074               // Method getDefaultSize:(II)I
      11: invokevirtual #1077               // Method setMeasuredDimension:(II)V
      14: aload_0
      15: invokevirtual #425                // Method getMeasuredWidth:()I
      18: istore_1
      19: aload_0
      20: iload_1
      21: bipush        10
      23: idiv
      24: aload_0
      25: getfield      #973                // Field mDefaultGutterSize:I
      28: invokestatic  #328                // Method java/lang/Math.min:(II)I
      31: putfield      #451                // Field mGutterSize:I
      34: aload_0
      35: invokevirtual #428                // Method getPaddingLeft:()I
      38: istore_3
      39: aload_0
      40: invokevirtual #431                // Method getPaddingRight:()I
      43: istore        4
      45: aload_0
      46: invokevirtual #1078               // Method getMeasuredHeight:()I
      49: istore_2
      50: aload_0
      51: invokevirtual #828                // Method getPaddingTop:()I
      54: istore        5
      56: aload_0
      57: invokevirtual #831                // Method getPaddingBottom:()I
      60: istore        6
      62: aload_0
      63: invokevirtual #359                // Method getChildCount:()I
      66: istore        11
      68: iload_2
      69: iload         5
      71: isub
      72: iload         6
      74: isub
      75: istore_2
      76: iload_1
      77: iload_3
      78: isub
      79: iload         4
      81: isub
      82: istore_1
      83: iconst_0
      84: istore        5
      86: iconst_1
      87: istore        8
      89: ldc_w         #1058               // int 1073741824
      92: istore        10
      94: iload         5
      96: iload         11
      98: if_icmpge     430
     101: aload_0
     102: iload         5
     104: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
     107: astore        12
     109: iload_1
     110: istore_3
     111: iload_2
     112: istore        4
     114: aload         12
     116: invokevirtual #579                // Method android/view/View.getVisibility:()I
     119: bipush        8
     121: if_icmpeq     416
     124: aload         12
     126: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     129: checkcast     #20                 // class android/support/v4/view/v$c
     132: astore        13
     134: iload_1
     135: istore_3
     136: iload_2
     137: istore        4
     139: aload         13
     141: ifnull        416
     144: iload_1
     145: istore_3
     146: iload_2
     147: istore        4
     149: aload         13
     151: getfield      #525                // Field android/support/v4/view/v$c.a:Z
     154: ifeq          416
     157: aload         13
     159: getfield      #1050               // Field android/support/v4/view/v$c.b:I
     162: bipush        7
     164: iand
     165: istore_3
     166: aload         13
     168: getfield      #1050               // Field android/support/v4/view/v$c.b:I
     171: bipush        112
     173: iand
     174: istore        4
     176: iload         4
     178: bipush        48
     180: if_icmpeq     199
     183: iload         4
     185: bipush        80
     187: if_icmpne     193
     190: goto          199
     193: iconst_0
     194: istore        7
     196: goto          202
     199: iconst_1
     200: istore        7
     202: iload         8
     204: istore        6
     206: iload_3
     207: iconst_3
     208: if_icmpeq     226
     211: iload_3
     212: iconst_5
     213: if_icmpne     223
     216: iload         8
     218: istore        6
     220: goto          226
     223: iconst_0
     224: istore        6
     226: ldc_w         #1079               // int -2147483648
     229: istore        8
     231: iload         7
     233: ifeq          248
     236: ldc_w         #1058               // int 1073741824
     239: istore        4
     241: ldc_w         #1079               // int -2147483648
     244: istore_3
     245: goto          265
     248: iload         8
     250: istore        4
     252: iload         6
     254: ifeq          241
     257: ldc_w         #1058               // int 1073741824
     260: istore_3
     261: iload         8
     263: istore        4
     265: aload         13
     267: getfield      #1082               // Field android/support/v4/view/v$c.width:I
     270: bipush        -2
     272: if_icmpeq     309
     275: aload         13
     277: getfield      #1082               // Field android/support/v4/view/v$c.width:I
     280: iconst_m1
     281: if_icmpeq     294
     284: aload         13
     286: getfield      #1082               // Field android/support/v4/view/v$c.width:I
     289: istore        4
     291: goto          297
     294: iload_1
     295: istore        4
     297: ldc_w         #1058               // int 1073741824
     300: istore        8
     302: iload         4
     304: istore        9
     306: goto          316
     309: iload_1
     310: istore        9
     312: iload         4
     314: istore        8
     316: aload         13
     318: getfield      #1085               // Field android/support/v4/view/v$c.height:I
     321: bipush        -2
     323: if_icmpeq     349
     326: aload         13
     328: getfield      #1085               // Field android/support/v4/view/v$c.height:I
     331: iconst_m1
     332: if_icmpeq     344
     335: aload         13
     337: getfield      #1085               // Field android/support/v4/view/v$c.height:I
     340: istore_3
     341: goto          358
     344: iload_2
     345: istore_3
     346: goto          358
     349: iload_2
     350: istore        4
     352: iload_3
     353: istore        10
     355: iload         4
     357: istore_3
     358: aload         12
     360: iload         9
     362: iload         8
     364: invokestatic  #1063               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     367: iload_3
     368: iload         10
     370: invokestatic  #1063               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     373: invokevirtual #1066               // Method android/view/View.measure:(II)V
     376: iload         7
     378: ifeq          395
     381: iload_2
     382: aload         12
     384: invokevirtual #1054               // Method android/view/View.getMeasuredHeight:()I
     387: isub
     388: istore        4
     390: iload_1
     391: istore_3
     392: goto          416
     395: iload_1
     396: istore_3
     397: iload_2
     398: istore        4
     400: iload         6
     402: ifeq          416
     405: iload_1
     406: aload         12
     408: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     411: isub
     412: istore_3
     413: iload_2
     414: istore        4
     416: iload         5
     418: iconst_1
     419: iadd
     420: istore        5
     422: iload_3
     423: istore_1
     424: iload         4
     426: istore_2
     427: goto          86
     430: aload_0
     431: iload_1
     432: ldc_w         #1058               // int 1073741824
     435: invokestatic  #1063               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     438: putfield      #1087               // Field mChildWidthMeasureSpec:I
     441: aload_0
     442: iload_2
     443: ldc_w         #1058               // int 1073741824
     446: invokestatic  #1063               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     449: putfield      #1089               // Field mChildHeightMeasureSpec:I
     452: aload_0
     453: iconst_1
     454: putfield      #635                // Field mInLayout:Z
     457: aload_0
     458: invokevirtual #1045               // Method populate:()V
     461: iconst_0
     462: istore_2
     463: aload_0
     464: iconst_0
     465: putfield      #635                // Field mInLayout:Z
     468: aload_0
     469: invokevirtual #359                // Method getChildCount:()I
     472: istore_3
     473: iload_2
     474: iload_3
     475: if_icmpge     549
     478: aload_0
     479: iload_2
     480: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
     483: astore        12
     485: aload         12
     487: invokevirtual #579                // Method android/view/View.getVisibility:()I
     490: bipush        8
     492: if_icmpeq     542
     495: aload         12
     497: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     500: checkcast     #20                 // class android/support/v4/view/v$c
     503: astore        13
     505: aload         13
     507: ifnull        518
     510: aload         13
     512: getfield      #525                // Field android/support/v4/view/v$c.a:Z
     515: ifne          542
     518: aload         12
     520: iload_1
     521: i2f
     522: aload         13
     524: getfield      #776                // Field android/support/v4/view/v$c.c:F
     527: fmul
     528: f2i
     529: ldc_w         #1058               // int 1073741824
     532: invokestatic  #1063               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     535: aload_0
     536: getfield      #1089               // Field mChildHeightMeasureSpec:I
     539: invokevirtual #1066               // Method android/view/View.measure:(II)V
     542: iload_2
     543: iconst_1
     544: iadd
     545: istore_2
     546: goto          473
     549: return

  protected void onPageScrolled(int, float, int);
    Code:
       0: aload_0
       1: getfield      #1068               // Field mDecorChildCount:I
       4: istore        4
       6: iconst_0
       7: istore        9
       9: iload         4
      11: ifle          224
      14: aload_0
      15: invokevirtual #277                // Method getScrollX:()I
      18: istore        10
      20: aload_0
      21: invokevirtual #428                // Method getPaddingLeft:()I
      24: istore        4
      26: aload_0
      27: invokevirtual #431                // Method getPaddingRight:()I
      30: istore        5
      32: aload_0
      33: invokevirtual #454                // Method getWidth:()I
      36: istore        11
      38: aload_0
      39: invokevirtual #359                // Method getChildCount:()I
      42: istore        12
      44: iconst_0
      45: istore        7
      47: iload         7
      49: iload         12
      51: if_icmpge     224
      54: aload_0
      55: iload         7
      57: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
      60: astore        13
      62: aload         13
      64: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      67: checkcast     #20                 // class android/support/v4/view/v$c
      70: astore        14
      72: aload         14
      74: getfield      #525                // Field android/support/v4/view/v$c.a:Z
      77: ifne          83
      80: goto          215
      83: aload         14
      85: getfield      #1050               // Field android/support/v4/view/v$c.b:I
      88: bipush        7
      90: iand
      91: istore        6
      93: iload         6
      95: iconst_1
      96: if_icmpeq     173
      99: iload         6
     101: iconst_3
     102: if_icmpeq     152
     105: iload         6
     107: iconst_5
     108: if_icmpeq     126
     111: iload         4
     113: istore        8
     115: iload         4
     117: istore        6
     119: iload         8
     121: istore        4
     123: goto          190
     126: iload         11
     128: iload         5
     130: isub
     131: aload         13
     133: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     136: isub
     137: istore        6
     139: iload         5
     141: aload         13
     143: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     146: iadd
     147: istore        5
     149: goto          190
     152: aload         13
     154: invokevirtual #1090               // Method android/view/View.getWidth:()I
     157: iload         4
     159: iadd
     160: istore        8
     162: iload         4
     164: istore        6
     166: iload         8
     168: istore        4
     170: goto          190
     173: iload         11
     175: aload         13
     177: invokevirtual #1051               // Method android/view/View.getMeasuredWidth:()I
     180: isub
     181: iconst_2
     182: idiv
     183: iload         4
     185: invokestatic  #331                // Method java/lang/Math.max:(II)I
     188: istore        6
     190: iload         6
     192: iload         10
     194: iadd
     195: aload         13
     197: invokevirtual #392                // Method android/view/View.getLeft:()I
     200: isub
     201: istore        6
     203: iload         6
     205: ifeq          215
     208: aload         13
     210: iload         6
     212: invokevirtual #1093               // Method android/view/View.offsetLeftAndRight:(I)V
     215: iload         7
     217: iconst_1
     218: iadd
     219: istore        7
     221: goto          47
     224: aload_0
     225: iload_1
     226: fload_2
     227: iload_3
     228: invokespecial #1095               // Method dispatchOnPageScrolled:(IFI)V
     231: aload_0
     232: getfield      #1097               // Field mPageTransformer:Landroid/support/v4/view/v$g;
     235: ifnull        316
     238: aload_0
     239: invokevirtual #277                // Method getScrollX:()I
     242: istore_3
     243: aload_0
     244: invokevirtual #359                // Method getChildCount:()I
     247: istore        4
     249: iload         9
     251: istore_1
     252: iload_1
     253: iload         4
     255: if_icmpge     316
     258: aload_0
     259: iload_1
     260: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
     263: astore        13
     265: aload         13
     267: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     270: checkcast     #20                 // class android/support/v4/view/v$c
     273: getfield      #525                // Field android/support/v4/view/v$c.a:Z
     276: ifeq          282
     279: goto          309
     282: aload         13
     284: invokevirtual #392                // Method android/view/View.getLeft:()I
     287: iload_3
     288: isub
     289: i2f
     290: aload_0
     291: invokespecial #239                // Method getClientWidth:()I
     294: i2f
     295: fdiv
     296: fstore_2
     297: aload_0
     298: getfield      #1097               // Field mPageTransformer:Landroid/support/v4/view/v$g;
     301: aload         13
     303: fload_2
     304: invokeinterface #1101,  3         // InterfaceMethod android/support/v4/view/v$g.transformPage:(Landroid/view/View;F)V
     309: iload_1
     310: iconst_1
     311: iadd
     312: istore_1
     313: goto          252
     316: aload_0
     317: iconst_1
     318: putfield      #474                // Field mCalledSuper:Z
     321: return

  protected boolean onRequestFocusInDescendants(int, android.graphics.Rect);
    Code:
       0: aload_0
       1: invokevirtual #359                // Method getChildCount:()I
       4: istore_3
       5: iconst_m1
       6: istore        5
       8: iload_1
       9: iconst_2
      10: iand
      11: ifeq          25
      14: iload_3
      15: istore        5
      17: iconst_0
      18: istore_3
      19: iconst_1
      20: istore        4
      22: goto          32
      25: iload_3
      26: iconst_1
      27: isub
      28: istore_3
      29: iconst_m1
      30: istore        4
      32: iload_3
      33: iload         5
      35: if_icmpeq     98
      38: aload_0
      39: iload_3
      40: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
      43: astore        6
      45: aload         6
      47: invokevirtual #579                // Method android/view/View.getVisibility:()I
      50: ifne          90
      53: aload_0
      54: aload         6
      56: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
      59: astore        7
      61: aload         7
      63: ifnull        90
      66: aload         7
      68: getfield      #243                // Field android/support/v4/view/v$b.b:I
      71: aload_0
      72: getfield      #322                // Field mCurItem:I
      75: if_icmpne     90
      78: aload         6
      80: iload_1
      81: aload_2
      82: invokevirtual #1105               // Method android/view/View.requestFocus:(ILandroid/graphics/Rect;)Z
      85: ifeq          90
      88: iconst_1
      89: ireturn
      90: iload_3
      91: iload         4
      93: iadd
      94: istore_3
      95: goto          32
      98: iconst_0
      99: ireturn

  public void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_1
       1: instanceof    #38                 // class android/support/v4/view/v$i
       4: ifne          13
       7: aload_0
       8: aload_1
       9: invokespecial #1109               // Method android/view/ViewGroup.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      12: return
      13: aload_1
      14: checkcast     #38                 // class android/support/v4/view/v$i
      17: astore_1
      18: aload_0
      19: aload_1
      20: invokevirtual #1112               // Method android/support/v4/view/v$i.a:()Landroid/os/Parcelable;
      23: invokespecial #1109               // Method android/view/ViewGroup.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      26: aload_0
      27: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      30: ifnull        59
      33: aload_0
      34: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      37: aload_1
      38: getfield      #1114               // Field android/support/v4/view/v$i.b:Landroid/os/Parcelable;
      41: aload_1
      42: getfield      #1116               // Field android/support/v4/view/v$i.c:Ljava/lang/ClassLoader;
      45: invokevirtual #1120               // Method android/support/v4/view/q.restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
      48: aload_0
      49: aload_1
      50: getfield      #1122               // Field android/support/v4/view/v$i.a:I
      53: iconst_0
      54: iconst_1
      55: invokevirtual #780                // Method setCurrentItemInternal:(IZZ)V
      58: return
      59: aload_0
      60: aload_1
      61: getfield      #1122               // Field android/support/v4/view/v$i.a:I
      64: putfield      #195                // Field mRestoredCurItem:I
      67: aload_0
      68: aload_1
      69: getfield      #1114               // Field android/support/v4/view/v$i.b:Landroid/os/Parcelable;
      72: putfield      #197                // Field mRestoredAdapterState:Landroid/os/Parcelable;
      75: aload_0
      76: aload_1
      77: getfield      #1116               // Field android/support/v4/view/v$i.c:Ljava/lang/ClassLoader;
      80: putfield      #199                // Field mRestoredClassLoader:Ljava/lang/ClassLoader;
      83: return

  public android.os.Parcelable onSaveInstanceState();
    Code:
       0: new           #38                 // class android/support/v4/view/v$i
       3: dup
       4: aload_0
       5: invokespecial #1125               // Method android/view/ViewGroup.onSaveInstanceState:()Landroid/os/Parcelable;
       8: invokespecial #1127               // Method android/support/v4/view/v$i."<init>":(Landroid/os/Parcelable;)V
      11: astore_1
      12: aload_1
      13: aload_0
      14: getfield      #322                // Field mCurItem:I
      17: putfield      #1122               // Field android/support/v4/view/v$i.a:I
      20: aload_0
      21: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      24: ifnull        38
      27: aload_1
      28: aload_0
      29: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      32: invokevirtual #1130               // Method android/support/v4/view/q.saveState:()Landroid/os/Parcelable;
      35: putfield      #1114               // Field android/support/v4/view/v$i.b:Landroid/os/Parcelable;
      38: aload_1
      39: areturn

  protected void onSizeChanged(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #1133               // Method android/view/ViewGroup.onSizeChanged:(IIII)V
       9: iload_1
      10: iload_3
      11: if_icmpeq     28
      14: aload_0
      15: iload_1
      16: iload_3
      17: aload_0
      18: getfield      #241                // Field mPageMargin:I
      21: aload_0
      22: getfield      #241                // Field mPageMargin:I
      25: invokespecial #1135               // Method recomputeScrollPosition:(IIII)V
      28: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #706                // Field mFakeDragging:Z
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: aload_1
      10: invokevirtual #1016               // Method android/view/MotionEvent.getAction:()I
      13: istore        6
      15: iconst_0
      16: istore        9
      18: iload         6
      20: ifne          32
      23: aload_1
      24: invokevirtual #1139               // Method android/view/MotionEvent.getEdgeFlags:()I
      27: ifeq          32
      30: iconst_0
      31: ireturn
      32: aload_0
      33: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      36: ifnull        605
      39: aload_0
      40: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      43: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
      46: ifne          51
      49: iconst_0
      50: ireturn
      51: aload_0
      52: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      55: ifnonnull     65
      58: aload_0
      59: invokestatic  #715                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      62: putfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      65: aload_0
      66: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
      69: aload_1
      70: invokevirtual #727                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
      73: aload_1
      74: invokevirtual #1016               // Method android/view/MotionEvent.getAction:()I
      77: sipush        255
      80: iand
      81: tableswitch   { // 0 to 6
                     0: 535
                     1: 395
                     2: 199
                     3: 178
                     4: 124
                     5: 151
                     6: 127
               default: 124
          }
     124: goto          594
     127: aload_0
     128: aload_1
     129: invokespecial #1018               // Method onSecondaryPointerUp:(Landroid/view/MotionEvent;)V
     132: aload_0
     133: aload_1
     134: aload_1
     135: aload_0
     136: getfield      #209                // Field mActivePointerId:I
     139: invokevirtual #1021               // Method android/view/MotionEvent.findPointerIndex:(I)I
     142: invokevirtual #467                // Method android/view/MotionEvent.getX:(I)F
     145: putfield      #469                // Field mLastMotionX:F
     148: goto          594
     151: aload_1
     152: invokevirtual #461                // Method android/view/MotionEvent.getActionIndex:()I
     155: istore        6
     157: aload_0
     158: aload_1
     159: iload         6
     161: invokevirtual #467                // Method android/view/MotionEvent.getX:(I)F
     164: putfield      #469                // Field mLastMotionX:F
     167: aload_1
     168: iload         6
     170: invokevirtual #464                // Method android/view/MotionEvent.getPointerId:(I)I
     173: istore        6
     175: goto          588
     178: aload_0
     179: getfield      #374                // Field mIsBeingDragged:Z
     182: ifeq          594
     185: aload_0
     186: aload_0
     187: getfield      #322                // Field mCurItem:I
     190: iconst_1
     191: iconst_0
     192: iconst_0
     193: invokespecial #1070               // Method scrollToItem:(IZIZ)V
     196: goto          526
     199: aload_0
     200: getfield      #374                // Field mIsBeingDragged:Z
     203: ifne          365
     206: aload_1
     207: aload_0
     208: getfield      #209                // Field mActivePointerId:I
     211: invokevirtual #1021               // Method android/view/MotionEvent.findPointerIndex:(I)I
     214: istore        6
     216: iload         6
     218: iconst_m1
     219: if_icmpne     225
     222: goto          526
     225: aload_1
     226: iload         6
     228: invokevirtual #467                // Method android/view/MotionEvent.getX:(I)F
     231: fstore_2
     232: fload_2
     233: aload_0
     234: getfield      #469                // Field mLastMotionX:F
     237: fsub
     238: invokestatic  #491                // Method java/lang/Math.abs:(F)F
     241: fstore        4
     243: aload_1
     244: iload         6
     246: invokevirtual #1024               // Method android/view/MotionEvent.getY:(I)F
     249: fstore_3
     250: fload_3
     251: aload_0
     252: getfield      #1030               // Field mLastMotionY:F
     255: fsub
     256: invokestatic  #491                // Method java/lang/Math.abs:(F)F
     259: fstore        5
     261: fload         4
     263: aload_0
     264: getfield      #962                // Field mTouchSlop:I
     267: i2f
     268: fcmpl
     269: ifle          365
     272: fload         4
     274: fload         5
     276: fcmpl
     277: ifle          365
     280: aload_0
     281: iconst_1
     282: putfield      #374                // Field mIsBeingDragged:Z
     285: aload_0
     286: iconst_1
     287: invokespecial #1032               // Method requestParentDisallowInterceptTouchEvent:(Z)V
     290: fload_2
     291: aload_0
     292: getfield      #711                // Field mInitialMotionX:F
     295: fsub
     296: fconst_0
     297: fcmpl
     298: ifle          315
     301: aload_0
     302: getfield      #711                // Field mInitialMotionX:F
     305: aload_0
     306: getfield      #962                // Field mTouchSlop:I
     309: i2f
     310: fadd
     311: fstore_2
     312: goto          326
     315: aload_0
     316: getfield      #711                // Field mInitialMotionX:F
     319: aload_0
     320: getfield      #962                // Field mTouchSlop:I
     323: i2f
     324: fsub
     325: fstore_2
     326: aload_0
     327: fload_2
     328: putfield      #469                // Field mLastMotionX:F
     331: aload_0
     332: fload_3
     333: putfield      #1030               // Field mLastMotionY:F
     336: aload_0
     337: iconst_1
     338: invokevirtual #709                // Method setScrollState:(I)V
     341: aload_0
     342: iconst_1
     343: invokespecial #263                // Method setScrollingCacheEnabled:(Z)V
     346: aload_0
     347: invokevirtual #530                // Method getParent:()Landroid/view/ViewParent;
     350: astore        10
     352: aload         10
     354: ifnull        365
     357: aload         10
     359: iconst_1
     360: invokeinterface #535,  2          // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
     365: aload_0
     366: getfield      #374                // Field mIsBeingDragged:Z
     369: ifeq          594
     372: iconst_0
     373: aload_0
     374: aload_1
     375: aload_1
     376: aload_0
     377: getfield      #209                // Field mActivePointerId:I
     380: invokevirtual #1021               // Method android/view/MotionEvent.findPointerIndex:(I)I
     383: invokevirtual #467                // Method android/view/MotionEvent.getX:(I)F
     386: invokespecial #1034               // Method performDrag:(F)Z
     389: ior
     390: istore        9
     392: goto          594
     395: aload_0
     396: getfield      #374                // Field mIsBeingDragged:Z
     399: ifeq          594
     402: aload_0
     403: getfield      #378                // Field mVelocityTracker:Landroid/view/VelocityTracker;
     406: astore        10
     408: aload         10
     410: sipush        1000
     413: aload_0
     414: getfield      #872                // Field mMaximumVelocity:I
     417: i2f
     418: invokevirtual #876                // Method android/view/VelocityTracker.computeCurrentVelocity:(IF)V
     421: aload         10
     423: aload_0
     424: getfield      #209                // Field mActivePointerId:I
     427: invokevirtual #879                // Method android/view/VelocityTracker.getXVelocity:(I)F
     430: f2i
     431: istore        6
     433: aload_0
     434: iconst_1
     435: putfield      #296                // Field mPopulatePending:Z
     438: aload_0
     439: invokespecial #239                // Method getClientWidth:()I
     442: istore        7
     444: aload_0
     445: invokevirtual #277                // Method getScrollX:()I
     448: istore        8
     450: aload_0
     451: invokespecial #484                // Method infoForCurrentScrollPosition:()Landroid/support/v4/view/v$b;
     454: astore        10
     456: aload_0
     457: getfield      #241                // Field mPageMargin:I
     460: i2f
     461: fstore_3
     462: iload         7
     464: i2f
     465: fstore_2
     466: fload_3
     467: fload_2
     468: fdiv
     469: fstore_3
     470: aload_0
     471: aload_0
     472: aload         10
     474: getfield      #243                // Field android/support/v4/view/v$b.b:I
     477: iload         8
     479: i2f
     480: fload_2
     481: fdiv
     482: aload         10
     484: getfield      #245                // Field android/support/v4/view/v$b.e:F
     487: fsub
     488: aload         10
     490: getfield      #247                // Field android/support/v4/view/v$b.d:F
     493: fload_3
     494: fadd
     495: fdiv
     496: iload         6
     498: aload_1
     499: aload_1
     500: aload_0
     501: getfield      #209                // Field mActivePointerId:I
     504: invokevirtual #1021               // Method android/view/MotionEvent.findPointerIndex:(I)I
     507: invokevirtual #467                // Method android/view/MotionEvent.getX:(I)F
     510: aload_0
     511: getfield      #711                // Field mInitialMotionX:F
     514: fsub
     515: f2i
     516: invokespecial #881                // Method determineTargetPage:(IFII)I
     519: iconst_1
     520: iconst_1
     521: iload         6
     523: invokevirtual #884                // Method setCurrentItemInternal:(IZZI)V
     526: aload_0
     527: invokespecial #1047               // Method resetTouch:()Z
     530: istore        9
     532: goto          594
     535: aload_0
     536: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
     539: invokevirtual #274                // Method android/widget/Scroller.abortAnimation:()V
     542: aload_0
     543: iconst_0
     544: putfield      #296                // Field mPopulatePending:Z
     547: aload_0
     548: invokevirtual #1045               // Method populate:()V
     551: aload_1
     552: invokevirtual #1037               // Method android/view/MotionEvent.getX:()F
     555: fstore_2
     556: aload_0
     557: fload_2
     558: putfield      #711                // Field mInitialMotionX:F
     561: aload_0
     562: fload_2
     563: putfield      #469                // Field mLastMotionX:F
     566: aload_1
     567: invokevirtual #1039               // Method android/view/MotionEvent.getY:()F
     570: fstore_2
     571: aload_0
     572: fload_2
     573: putfield      #1026               // Field mInitialMotionY:F
     576: aload_0
     577: fload_2
     578: putfield      #1030               // Field mLastMotionY:F
     581: aload_1
     582: iconst_0
     583: invokevirtual #464                // Method android/view/MotionEvent.getPointerId:(I)I
     586: istore        6
     588: aload_0
     589: iload         6
     591: putfield      #209                // Field mActivePointerId:I
     594: iload         9
     596: ifeq          603
     599: aload_0
     600: invokestatic  #753                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     603: iconst_1
     604: ireturn
     605: iconst_0
     606: ireturn

  boolean pageLeft();
    Code:
       0: aload_0
       1: getfield      #322                // Field mCurItem:I
       4: ifle          20
       7: aload_0
       8: aload_0
       9: getfield      #322                // Field mCurItem:I
      12: iconst_1
      13: isub
      14: iconst_1
      15: invokevirtual #1143               // Method setCurrentItem:(IZ)V
      18: iconst_1
      19: ireturn
      20: iconst_0
      21: ireturn

  boolean pageRight();
    Code:
       0: aload_0
       1: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
       4: ifnull        36
       7: aload_0
       8: getfield      #322                // Field mCurItem:I
      11: aload_0
      12: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      15: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
      18: iconst_1
      19: isub
      20: if_icmpge     36
      23: aload_0
      24: aload_0
      25: getfield      #322                // Field mCurItem:I
      28: iconst_1
      29: iadd
      30: iconst_1
      31: invokevirtual #1143               // Method setCurrentItem:(IZ)V
      34: iconst_1
      35: ireturn
      36: iconst_0
      37: ireturn

  void populate();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #322                // Field mCurItem:I
       5: invokevirtual #1145               // Method populate:(I)V
       8: return

  void populate(int);
    Code:
       0: aload_0
       1: getfield      #322                // Field mCurItem:I
       4: iload_1
       5: if_icmpeq     26
       8: aload_0
       9: aload_0
      10: getfield      #322                // Field mCurItem:I
      13: invokevirtual #513                // Method infoForPosition:(I)Landroid/support/v4/view/v$b;
      16: astore        14
      18: aload_0
      19: iload_1
      20: putfield      #322                // Field mCurItem:I
      23: goto          29
      26: aconst_null
      27: astore        14
      29: aload_0
      30: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      33: ifnonnull     41
      36: aload_0
      37: invokespecial #1149               // Method sortChildDrawingOrder:()V
      40: return
      41: aload_0
      42: getfield      #296                // Field mPopulatePending:Z
      45: ifeq          53
      48: aload_0
      49: invokespecial #1149               // Method sortChildDrawingOrder:()V
      52: return
      53: aload_0
      54: invokevirtual #1153               // Method getWindowToken:()Landroid/os/IBinder;
      57: ifnonnull     61
      60: return
      61: aload_0
      62: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      65: aload_0
      66: invokevirtual #767                // Method android/support/v4/view/q.startUpdate:(Landroid/view/ViewGroup;)V
      69: aload_0
      70: getfield      #207                // Field mOffscreenPageLimit:I
      73: istore_1
      74: iconst_0
      75: aload_0
      76: getfield      #322                // Field mCurItem:I
      79: iload_1
      80: isub
      81: invokestatic  #331                // Method java/lang/Math.max:(II)I
      84: istore        11
      86: aload_0
      87: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      90: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
      93: istore        9
      95: iload         9
      97: iconst_1
      98: isub
      99: aload_0
     100: getfield      #322                // Field mCurItem:I
     103: iload_1
     104: iadd
     105: invokestatic  #328                // Method java/lang/Math.min:(II)I
     108: istore        10
     110: iload         9
     112: aload_0
     113: getfield      #756                // Field mExpectedAdapterCount:I
     116: if_icmpeq     260
     119: aload_0
     120: invokevirtual #1154               // Method getResources:()Landroid/content/res/Resources;
     123: aload_0
     124: invokevirtual #1157               // Method getId:()I
     127: invokevirtual #1161               // Method android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
     130: astore        13
     132: goto          144
     135: aload_0
     136: invokevirtual #1157               // Method getId:()I
     139: invokestatic  #1166               // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     142: astore        13
     144: new           #653                // class java/lang/StringBuilder
     147: dup
     148: invokespecial #654                // Method java/lang/StringBuilder."<init>":()V
     151: astore        14
     153: aload         14
     155: ldc_w         #1168               // String The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count:
     158: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     161: pop
     162: aload         14
     164: aload_0
     165: getfield      #756                // Field mExpectedAdapterCount:I
     168: invokevirtual #1171               // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     171: pop
     172: aload         14
     174: ldc_w         #1173               // String , found:
     177: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     180: pop
     181: aload         14
     183: iload         9
     185: invokevirtual #1171               // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     188: pop
     189: aload         14
     191: ldc_w         #1175               // String  Pager id:
     194: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     197: pop
     198: aload         14
     200: aload         13
     202: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     205: pop
     206: aload         14
     208: ldc_w         #1177               // String  Pager class:
     211: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     214: pop
     215: aload         14
     217: aload_0
     218: invokevirtual #441                // Method java/lang/Object.getClass:()Ljava/lang/Class;
     221: invokevirtual #1180               // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     224: pop
     225: aload         14
     227: ldc_w         #1182               // String  Problematic adapter:
     230: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     233: pop
     234: aload         14
     236: aload_0
     237: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     240: invokevirtual #441                // Method java/lang/Object.getClass:()Ljava/lang/Class;
     243: invokevirtual #1180               // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     246: pop
     247: new           #477                // class java/lang/IllegalStateException
     250: dup
     251: aload         14
     253: invokevirtual #669                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     256: invokespecial #482                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     259: athrow
     260: iconst_0
     261: istore_1
     262: iload_1
     263: aload_0
     264: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     267: invokevirtual #250                // Method java/util/ArrayList.size:()I
     270: if_icmpge     320
     273: aload_0
     274: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     277: iload_1
     278: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     281: checkcast     #17                 // class android/support/v4/view/v$b
     284: astore        13
     286: aload         13
     288: getfield      #243                // Field android/support/v4/view/v$b.b:I
     291: aload_0
     292: getfield      #322                // Field mCurItem:I
     295: if_icmplt     313
     298: aload         13
     300: getfield      #243                // Field android/support/v4/view/v$b.b:I
     303: aload_0
     304: getfield      #322                // Field mCurItem:I
     307: if_icmpne     320
     310: goto          323
     313: iload_1
     314: iconst_1
     315: iadd
     316: istore_1
     317: goto          262
     320: aconst_null
     321: astore        13
     323: aload         13
     325: astore        15
     327: aload         13
     329: ifnonnull     352
     332: aload         13
     334: astore        15
     336: iload         9
     338: ifle          352
     341: aload_0
     342: aload_0
     343: getfield      #322                // Field mCurItem:I
     346: iload_1
     347: invokevirtual #1184               // Method addNewItem:(II)Landroid/support/v4/view/v$b;
     350: astore        15
     352: aload         15
     354: ifnull        1064
     357: iload_1
     358: iconst_1
     359: isub
     360: istore        5
     362: iload         5
     364: iflt          384
     367: aload_0
     368: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     371: iload         5
     373: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     376: checkcast     #17                 // class android/support/v4/view/v$b
     379: astore        13
     381: goto          387
     384: aconst_null
     385: astore        13
     387: aload_0
     388: invokespecial #239                // Method getClientWidth:()I
     391: istore        12
     393: iload         12
     395: ifgt          404
     398: fconst_0
     399: fstore        4
     401: goto          423
     404: fconst_2
     405: aload         15
     407: getfield      #247                // Field android/support/v4/view/v$b.d:F
     410: fsub
     411: aload_0
     412: invokevirtual #428                // Method getPaddingLeft:()I
     415: i2f
     416: iload         12
     418: i2f
     419: fdiv
     420: fadd
     421: fstore        4
     423: aload_0
     424: getfield      #322                // Field mCurItem:I
     427: iconst_1
     428: isub
     429: istore        8
     431: fconst_0
     432: fstore_3
     433: iload         8
     435: iflt          698
     438: fload_3
     439: fload         4
     441: fcmpl
     442: iflt          556
     445: iload         8
     447: iload         11
     449: if_icmpge     556
     452: aload         13
     454: ifnonnull     460
     457: goto          698
     460: fload_3
     461: fstore_2
     462: iload         5
     464: istore        7
     466: aload         13
     468: astore        16
     470: iload_1
     471: istore        6
     473: iload         8
     475: aload         13
     477: getfield      #243                // Field android/support/v4/view/v$b.b:I
     480: if_icmpne     676
     483: fload_3
     484: fstore_2
     485: iload         5
     487: istore        7
     489: aload         13
     491: astore        16
     493: iload_1
     494: istore        6
     496: aload         13
     498: getfield      #298                // Field android/support/v4/view/v$b.c:Z
     501: ifne          676
     504: aload_0
     505: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     508: iload         5
     510: invokevirtual #763                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     513: pop
     514: aload_0
     515: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     518: aload_0
     519: iload         8
     521: aload         13
     523: getfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
     526: invokevirtual #771                // Method android/support/v4/view/q.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
     529: iload         5
     531: iconst_1
     532: isub
     533: istore        5
     535: iload_1
     536: iconst_1
     537: isub
     538: istore_1
     539: fload_3
     540: fstore_2
     541: iload         5
     543: istore        6
     545: iload_1
     546: istore        7
     548: iload         5
     550: iflt          655
     553: goto          636
     556: aload         13
     558: ifnull        602
     561: iload         8
     563: aload         13
     565: getfield      #243                // Field android/support/v4/view/v$b.b:I
     568: if_icmpne     602
     571: fload_3
     572: aload         13
     574: getfield      #247                // Field android/support/v4/view/v$b.d:F
     577: fadd
     578: fstore_3
     579: iload         5
     581: iconst_1
     582: isub
     583: istore        5
     585: fload_3
     586: fstore_2
     587: iload         5
     589: istore        6
     591: iload_1
     592: istore        7
     594: iload         5
     596: iflt          655
     599: goto          636
     602: fload_3
     603: aload_0
     604: iload         8
     606: iload         5
     608: iconst_1
     609: iadd
     610: invokevirtual #1184               // Method addNewItem:(II)Landroid/support/v4/view/v$b;
     613: getfield      #247                // Field android/support/v4/view/v$b.d:F
     616: fadd
     617: fstore_3
     618: iload_1
     619: iconst_1
     620: iadd
     621: istore_1
     622: fload_3
     623: fstore_2
     624: iload         5
     626: istore        6
     628: iload_1
     629: istore        7
     631: iload         5
     633: iflt          655
     636: aload_0
     637: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     640: iload         5
     642: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     645: checkcast     #17                 // class android/support/v4/view/v$b
     648: astore        13
     650: fload_3
     651: fstore_2
     652: goto          665
     655: aconst_null
     656: astore        13
     658: iload         7
     660: istore_1
     661: iload         6
     663: istore        5
     665: iload_1
     666: istore        6
     668: aload         13
     670: astore        16
     672: iload         5
     674: istore        7
     676: iload         8
     678: iconst_1
     679: isub
     680: istore        8
     682: fload_2
     683: fstore_3
     684: iload         7
     686: istore        5
     688: aload         16
     690: astore        13
     692: iload         6
     694: istore_1
     695: goto          433
     698: aload         15
     700: getfield      #247                // Field android/support/v4/view/v$b.d:F
     703: fstore_3
     704: iload_1
     705: iconst_1
     706: iadd
     707: istore        5
     709: fload_3
     710: fconst_2
     711: fcmpg
     712: ifge          1038
     715: iload         5
     717: aload_0
     718: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     721: invokevirtual #250                // Method java/util/ArrayList.size:()I
     724: if_icmpge     744
     727: aload_0
     728: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     731: iload         5
     733: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     736: checkcast     #17                 // class android/support/v4/view/v$b
     739: astore        13
     741: goto          747
     744: aconst_null
     745: astore        13
     747: iload         12
     749: ifgt          758
     752: fconst_0
     753: fstore        4
     755: goto          771
     758: aload_0
     759: invokevirtual #431                // Method getPaddingRight:()I
     762: i2f
     763: iload         12
     765: i2f
     766: fdiv
     767: fconst_2
     768: fadd
     769: fstore        4
     771: aload_0
     772: getfield      #322                // Field mCurItem:I
     775: istore        6
     777: aload         13
     779: astore        16
     781: iload         6
     783: iconst_1
     784: iadd
     785: istore        7
     787: iload         7
     789: iload         9
     791: if_icmpge     1038
     794: fload_3
     795: fload         4
     797: fcmpl
     798: iflt          926
     801: iload         7
     803: iload         10
     805: if_icmple     926
     808: aload         16
     810: ifnonnull     816
     813: goto          1038
     816: fload_3
     817: fstore_2
     818: iload         5
     820: istore        6
     822: aload         16
     824: astore        13
     826: iload         7
     828: aload         16
     830: getfield      #243                // Field android/support/v4/view/v$b.b:I
     833: if_icmpne     1021
     836: fload_3
     837: fstore_2
     838: iload         5
     840: istore        6
     842: aload         16
     844: astore        13
     846: aload         16
     848: getfield      #298                // Field android/support/v4/view/v$b.c:Z
     851: ifne          1021
     854: aload_0
     855: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     858: iload         5
     860: invokevirtual #763                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     863: pop
     864: aload_0
     865: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     868: aload_0
     869: iload         7
     871: aload         16
     873: getfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
     876: invokevirtual #771                // Method android/support/v4/view/q.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
     879: fload_3
     880: fstore_2
     881: iload         5
     883: istore        6
     885: iload         5
     887: aload_0
     888: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     891: invokevirtual #250                // Method java/util/ArrayList.size:()I
     894: if_icmpge     920
     897: aload_0
     898: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     901: iload         5
     903: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     906: checkcast     #17                 // class android/support/v4/view/v$b
     909: astore        13
     911: fload_3
     912: fstore_2
     913: iload         5
     915: istore        6
     917: goto          1021
     920: aconst_null
     921: astore        13
     923: goto          1021
     926: aload         16
     928: ifnull        976
     931: iload         7
     933: aload         16
     935: getfield      #243                // Field android/support/v4/view/v$b.b:I
     938: if_icmpne     976
     941: fload_3
     942: aload         16
     944: getfield      #247                // Field android/support/v4/view/v$b.d:F
     947: fadd
     948: fstore_3
     949: iload         5
     951: iconst_1
     952: iadd
     953: istore        5
     955: fload_3
     956: fstore_2
     957: iload         5
     959: istore        6
     961: iload         5
     963: aload_0
     964: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     967: invokevirtual #250                // Method java/util/ArrayList.size:()I
     970: if_icmpge     920
     973: goto          897
     976: aload_0
     977: iload         7
     979: iload         5
     981: invokevirtual #1184               // Method addNewItem:(II)Landroid/support/v4/view/v$b;
     984: astore        13
     986: iload         5
     988: iconst_1
     989: iadd
     990: istore        5
     992: fload_3
     993: aload         13
     995: getfield      #247                // Field android/support/v4/view/v$b.d:F
     998: fadd
     999: fstore_3
    1000: fload_3
    1001: fstore_2
    1002: iload         5
    1004: istore        6
    1006: iload         5
    1008: aload_0
    1009: getfield      #185                // Field mItems:Ljava/util/ArrayList;
    1012: invokevirtual #250                // Method java/util/ArrayList.size:()I
    1015: if_icmpge     920
    1018: goto          897
    1021: fload_2
    1022: fstore_3
    1023: iload         6
    1025: istore        5
    1027: aload         13
    1029: astore        16
    1031: iload         7
    1033: istore        6
    1035: goto          781
    1038: aload_0
    1039: aload         15
    1041: iload_1
    1042: aload         14
    1044: invokespecial #1186               // Method calculatePageOffsets:(Landroid/support/v4/view/v$b;ILandroid/support/v4/view/v$b;)V
    1047: aload_0
    1048: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
    1051: aload_0
    1052: aload_0
    1053: getfield      #322                // Field mCurItem:I
    1056: aload         15
    1058: getfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
    1061: invokevirtual #1189               // Method android/support/v4/view/q.setPrimaryItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    1064: aload_0
    1065: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
    1068: aload_0
    1069: invokevirtual #774                // Method android/support/v4/view/q.finishUpdate:(Landroid/view/ViewGroup;)V
    1072: aload_0
    1073: invokevirtual #359                // Method getChildCount:()I
    1076: istore        5
    1078: iconst_0
    1079: istore_1
    1080: iload_1
    1081: iload         5
    1083: if_icmpge     1167
    1086: aload_0
    1087: iload_1
    1088: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
    1091: astore        14
    1093: aload         14
    1095: invokevirtual #523                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
    1098: checkcast     #20                 // class android/support/v4/view/v$c
    1101: astore        13
    1103: aload         13
    1105: iload_1
    1106: putfield      #916                // Field android/support/v4/view/v$c.f:I
    1109: aload         13
    1111: getfield      #525                // Field android/support/v4/view/v$c.a:Z
    1114: ifne          1160
    1117: aload         13
    1119: getfield      #776                // Field android/support/v4/view/v$c.c:F
    1122: fconst_0
    1123: fcmpl
    1124: ifne          1160
    1127: aload_0
    1128: aload         14
    1130: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
    1133: astore        14
    1135: aload         14
    1137: ifnull        1160
    1140: aload         13
    1142: aload         14
    1144: getfield      #247                // Field android/support/v4/view/v$b.d:F
    1147: putfield      #776                // Field android/support/v4/view/v$c.c:F
    1150: aload         13
    1152: aload         14
    1154: getfield      #243                // Field android/support/v4/view/v$b.b:I
    1157: putfield      #1191               // Field android/support/v4/view/v$c.e:I
    1160: iload_1
    1161: iconst_1
    1162: iadd
    1163: istore_1
    1164: goto          1080
    1167: aload_0
    1168: invokespecial #1149               // Method sortChildDrawingOrder:()V
    1171: aload_0
    1172: invokevirtual #1194               // Method hasFocus:()Z
    1175: ifeq          1279
    1178: aload_0
    1179: invokevirtual #650                // Method findFocus:()Landroid/view/View;
    1182: astore        13
    1184: aload         13
    1186: ifnull        1200
    1189: aload_0
    1190: aload         13
    1192: invokevirtual #1196               // Method infoForAnyChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
    1195: astore        13
    1197: goto          1203
    1200: aconst_null
    1201: astore        13
    1203: aload         13
    1205: ifnull        1220
    1208: aload         13
    1210: getfield      #243                // Field android/support/v4/view/v$b.b:I
    1213: aload_0
    1214: getfield      #322                // Field mCurItem:I
    1217: if_icmpeq     1279
    1220: iconst_0
    1221: istore_1
    1222: iload_1
    1223: aload_0
    1224: invokevirtual #359                // Method getChildCount:()I
    1227: if_icmpge     1279
    1230: aload_0
    1231: iload_1
    1232: invokevirtual #365                // Method getChildAt:(I)Landroid/view/View;
    1235: astore        13
    1237: aload_0
    1238: aload         13
    1240: invokevirtual #583                // Method infoForChild:(Landroid/view/View;)Landroid/support/v4/view/v$b;
    1243: astore        14
    1245: aload         14
    1247: ifnull        1272
    1250: aload         14
    1252: getfield      #243                // Field android/support/v4/view/v$b.b:I
    1255: aload_0
    1256: getfield      #322                // Field mCurItem:I
    1259: if_icmpne     1272
    1262: aload         13
    1264: iconst_2
    1265: invokevirtual #1198               // Method android/view/View.requestFocus:(I)Z
    1268: ifeq          1272
    1271: return
    1272: iload_1
    1273: iconst_1
    1274: iadd
    1275: istore_1
    1276: goto          1222
    1279: return
    1280: astore        13
    1282: goto          135
    Exception table:
       from    to  target type
         119   132  1280   Class android/content/res/Resources$NotFoundException

  public void removeOnAdapterChangeListener(android.support.v4.view.v$e);
    Code:
       0: aload_0
       1: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
       4: ifnull        18
       7: aload_0
       8: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
      11: aload_1
      12: invokeinterface #1201,  2         // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      17: pop
      18: return

  public void removeOnPageChangeListener(android.support.v4.view.v$f);
    Code:
       0: aload_0
       1: getfield      #340                // Field mOnPageChangeListeners:Ljava/util/List;
       4: ifnull        18
       7: aload_0
       8: getfield      #340                // Field mOnPageChangeListeners:Ljava/util/List;
      11: aload_1
      12: invokeinterface #1201,  2         // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      17: pop
      18: return

  public void removeView(android.view.View);
    Code:
       0: aload_0
       1: getfield      #635                // Field mInLayout:Z
       4: ifeq          13
       7: aload_0
       8: aload_1
       9: invokevirtual #1206               // Method removeViewInLayout:(Landroid/view/View;)V
      12: return
      13: aload_0
      14: aload_1
      15: invokespecial #1208               // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
      18: return

  public void setAdapter(android.support.v4.view.q);
    Code:
       0: aload_0
       1: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
       4: astore        6
       6: iconst_0
       7: istore_3
       8: aload         6
      10: ifnull        110
      13: aload_0
      14: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      17: aconst_null
      18: invokevirtual #1214               // Method android/support/v4/view/q.setViewPagerObserver:(Landroid/database/DataSetObserver;)V
      21: aload_0
      22: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      25: aload_0
      26: invokevirtual #767                // Method android/support/v4/view/q.startUpdate:(Landroid/view/ViewGroup;)V
      29: iconst_0
      30: istore_2
      31: iload_2
      32: aload_0
      33: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      36: invokevirtual #250                // Method java/util/ArrayList.size:()I
      39: if_icmpge     80
      42: aload_0
      43: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      46: iload_2
      47: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      50: checkcast     #17                 // class android/support/v4/view/v$b
      53: astore        6
      55: aload_0
      56: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      59: aload_0
      60: aload         6
      62: getfield      #243                // Field android/support/v4/view/v$b.b:I
      65: aload         6
      67: getfield      #606                // Field android/support/v4/view/v$b.a:Ljava/lang/Object;
      70: invokevirtual #771                // Method android/support/v4/view/q.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
      73: iload_2
      74: iconst_1
      75: iadd
      76: istore_2
      77: goto          31
      80: aload_0
      81: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      84: aload_0
      85: invokevirtual #774                // Method android/support/v4/view/q.finishUpdate:(Landroid/view/ViewGroup;)V
      88: aload_0
      89: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      92: invokevirtual #560                // Method java/util/ArrayList.clear:()V
      95: aload_0
      96: invokespecial #1216               // Method removeNonDecorViews:()V
      99: aload_0
     100: iconst_0
     101: putfield      #322                // Field mCurItem:I
     104: aload_0
     105: iconst_0
     106: iconst_0
     107: invokevirtual #290                // Method scrollTo:(II)V
     110: aload_0
     111: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     114: astore        6
     116: aload_0
     117: aload_1
     118: putfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     121: aload_0
     122: iconst_0
     123: putfield      #756                // Field mExpectedAdapterCount:I
     126: aload_0
     127: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     130: ifnull        256
     133: aload_0
     134: getfield      #1218               // Field mObserver:Landroid/support/v4/view/v$h;
     137: ifnonnull     152
     140: aload_0
     141: new           #35                 // class android/support/v4/view/v$h
     144: dup
     145: aload_0
     146: invokespecial #1219               // Method android/support/v4/view/v$h."<init>":(Landroid/support/v4/view/v;)V
     149: putfield      #1218               // Field mObserver:Landroid/support/v4/view/v$h;
     152: aload_0
     153: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     156: aload_0
     157: getfield      #1218               // Field mObserver:Landroid/support/v4/view/v$h;
     160: invokevirtual #1214               // Method android/support/v4/view/q.setViewPagerObserver:(Landroid/database/DataSetObserver;)V
     163: aload_0
     164: iconst_0
     165: putfield      #296                // Field mPopulatePending:Z
     168: aload_0
     169: getfield      #211                // Field mFirstLayout:Z
     172: istore        5
     174: aload_0
     175: iconst_1
     176: putfield      #211                // Field mFirstLayout:Z
     179: aload_0
     180: aload_0
     181: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     184: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
     187: putfield      #756                // Field mExpectedAdapterCount:I
     190: aload_0
     191: getfield      #195                // Field mRestoredCurItem:I
     194: iflt          240
     197: aload_0
     198: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     201: aload_0
     202: getfield      #197                // Field mRestoredAdapterState:Landroid/os/Parcelable;
     205: aload_0
     206: getfield      #199                // Field mRestoredClassLoader:Ljava/lang/ClassLoader;
     209: invokevirtual #1120               // Method android/support/v4/view/q.restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
     212: aload_0
     213: aload_0
     214: getfield      #195                // Field mRestoredCurItem:I
     217: iconst_0
     218: iconst_1
     219: invokevirtual #780                // Method setCurrentItemInternal:(IZZ)V
     222: aload_0
     223: iconst_m1
     224: putfield      #195                // Field mRestoredCurItem:I
     227: aload_0
     228: aconst_null
     229: putfield      #197                // Field mRestoredAdapterState:Landroid/os/Parcelable;
     232: aload_0
     233: aconst_null
     234: putfield      #199                // Field mRestoredClassLoader:Ljava/lang/ClassLoader;
     237: goto          256
     240: iload         5
     242: ifne          252
     245: aload_0
     246: invokevirtual #1045               // Method populate:()V
     249: goto          256
     252: aload_0
     253: invokevirtual #783                // Method requestLayout:()V
     256: aload_0
     257: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
     260: ifnull        323
     263: aload_0
     264: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
     267: invokeinterface #1220,  1         // InterfaceMethod java/util/List.isEmpty:()Z
     272: ifne          323
     275: aload_0
     276: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
     279: invokeinterface #343,  1          // InterfaceMethod java/util/List.size:()I
     284: istore        4
     286: iload_3
     287: istore_2
     288: iload_2
     289: iload         4
     291: if_icmpge     323
     294: aload_0
     295: getfield      #613                // Field mAdapterChangeListeners:Ljava/util/List;
     298: iload_2
     299: invokeinterface #344,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     304: checkcast     #26                 // class android/support/v4/view/v$e
     307: aload_0
     308: aload         6
     310: aload_1
     311: invokeinterface #1223,  4         // InterfaceMethod android/support/v4/view/v$e.a:(Landroid/support/v4/view/v;Landroid/support/v4/view/q;Landroid/support/v4/view/q;)V
     316: iload_2
     317: iconst_1
     318: iadd
     319: istore_2
     320: goto          288
     323: return

  public void setCurrentItem(int);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #296                // Field mPopulatePending:Z
       5: aload_0
       6: iload_1
       7: aload_0
       8: getfield      #211                // Field mFirstLayout:Z
      11: iconst_1
      12: ixor
      13: iconst_0
      14: invokevirtual #780                // Method setCurrentItemInternal:(IZZ)V
      17: return

  public void setCurrentItem(int, boolean);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #296                // Field mPopulatePending:Z
       5: aload_0
       6: iload_1
       7: iload_2
       8: iconst_0
       9: invokevirtual #780                // Method setCurrentItemInternal:(IZZ)V
      12: return

  void setCurrentItemInternal(int, boolean, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iconst_0
       5: invokevirtual #884                // Method setCurrentItemInternal:(IZZI)V
       8: return

  void setCurrentItemInternal(int, boolean, boolean, int);
    Code:
       0: aload_0
       1: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
       4: ifnull        206
       7: aload_0
       8: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      11: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
      14: ifgt          20
      17: goto          206
      20: iload_3
      21: ifne          48
      24: aload_0
      25: getfield      #322                // Field mCurItem:I
      28: iload_1
      29: if_icmpne     48
      32: aload_0
      33: getfield      #185                // Field mItems:Ljava/util/ArrayList;
      36: invokevirtual #250                // Method java/util/ArrayList.size:()I
      39: ifeq          48
      42: aload_0
      43: iconst_0
      44: invokespecial #263                // Method setScrollingCacheEnabled:(Z)V
      47: return
      48: iconst_1
      49: istore_3
      50: iload_1
      51: ifge          60
      54: iconst_0
      55: istore        5
      57: goto          85
      60: iload_1
      61: istore        5
      63: iload_1
      64: aload_0
      65: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      68: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
      71: if_icmplt     85
      74: aload_0
      75: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
      78: invokevirtual #236                // Method android/support/v4/view/q.getCount:()I
      81: iconst_1
      82: isub
      83: istore        5
      85: aload_0
      86: getfield      #207                // Field mOffscreenPageLimit:I
      89: istore_1
      90: iload         5
      92: aload_0
      93: getfield      #322                // Field mCurItem:I
      96: iload_1
      97: iadd
      98: if_icmpgt     112
     101: iload         5
     103: aload_0
     104: getfield      #322                // Field mCurItem:I
     107: iload_1
     108: isub
     109: if_icmpge     147
     112: iconst_0
     113: istore_1
     114: iload_1
     115: aload_0
     116: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     119: invokevirtual #250                // Method java/util/ArrayList.size:()I
     122: if_icmpge     147
     125: aload_0
     126: getfield      #185                // Field mItems:Ljava/util/ArrayList;
     129: iload_1
     130: invokevirtual #254                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     133: checkcast     #17                 // class android/support/v4/view/v$b
     136: iconst_1
     137: putfield      #298                // Field android/support/v4/view/v$b.c:Z
     140: iload_1
     141: iconst_1
     142: iadd
     143: istore_1
     144: goto          114
     147: aload_0
     148: getfield      #322                // Field mCurItem:I
     151: iload         5
     153: if_icmpeq     159
     156: goto          161
     159: iconst_0
     160: istore_3
     161: aload_0
     162: getfield      #211                // Field mFirstLayout:Z
     165: ifeq          189
     168: aload_0
     169: iload         5
     171: putfield      #322                // Field mCurItem:I
     174: iload_3
     175: ifeq          184
     178: aload_0
     179: iload         5
     181: invokespecial #552                // Method dispatchOnPageSelected:(I)V
     184: aload_0
     185: invokevirtual #783                // Method requestLayout:()V
     188: return
     189: aload_0
     190: iload         5
     192: invokevirtual #1145               // Method populate:(I)V
     195: aload_0
     196: iload         5
     198: iload_2
     199: iload         4
     201: iload_3
     202: invokespecial #1070               // Method scrollToItem:(IZIZ)V
     205: return
     206: aload_0
     207: iconst_0
     208: invokespecial #263                // Method setScrollingCacheEnabled:(Z)V
     211: return

  android.support.v4.view.v$f setInternalPageChangeListener(android.support.v4.view.v$f);
    Code:
       0: aload_0
       1: getfield      #346                // Field mInternalPageChangeListener:Landroid/support/v4/view/v$f;
       4: astore_2
       5: aload_0
       6: aload_1
       7: putfield      #346                // Field mInternalPageChangeListener:Landroid/support/v4/view/v$f;
      10: aload_2
      11: areturn

  public void setOffscreenPageLimit(int);
    Code:
       0: iload_1
       1: istore_2
       2: iload_1
       3: iconst_1
       4: if_icmpge     55
       7: new           #653                // class java/lang/StringBuilder
      10: dup
      11: invokespecial #654                // Method java/lang/StringBuilder."<init>":()V
      14: astore_3
      15: aload_3
      16: ldc_w         #1228               // String Requested offscreen page limit
      19: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_3
      24: iload_1
      25: invokevirtual #1171               // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      28: pop
      29: aload_3
      30: ldc_w         #1230               // String  too small; defaulting to
      33: invokevirtual #662                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: aload_3
      38: iconst_1
      39: invokevirtual #1171               // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      42: pop
      43: ldc           #77                 // String ViewPager
      45: aload_3
      46: invokevirtual #669                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      49: invokestatic  #1233               // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      52: pop
      53: iconst_1
      54: istore_2
      55: iload_2
      56: aload_0
      57: getfield      #207                // Field mOffscreenPageLimit:I
      60: if_icmpeq     72
      63: aload_0
      64: iload_2
      65: putfield      #207                // Field mOffscreenPageLimit:I
      68: aload_0
      69: invokevirtual #1045               // Method populate:()V
      72: return

  public void setOnPageChangeListener(android.support.v4.view.v$f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #335                // Field mOnPageChangeListener:Landroid/support/v4/view/v$f;
       5: return

  public void setPageMargin(int);
    Code:
       0: aload_0
       1: getfield      #241                // Field mPageMargin:I
       4: istore_2
       5: aload_0
       6: iload_1
       7: putfield      #241                // Field mPageMargin:I
      10: aload_0
      11: invokevirtual #454                // Method getWidth:()I
      14: istore_3
      15: aload_0
      16: iload_3
      17: iload_3
      18: iload_1
      19: iload_2
      20: invokespecial #1135               // Method recomputeScrollPosition:(IIII)V
      23: aload_0
      24: invokevirtual #783                // Method requestLayout:()V
      27: return

  public void setPageMarginDrawable(int);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #908                // Method getContext:()Landroid/content/Context;
       5: iload_1
       6: invokestatic  #1243               // Method android/support/v4/a/a.a:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
       9: invokevirtual #1246               // Method setPageMarginDrawable:(Landroid/graphics/drawable/Drawable;)V
      12: return

  public void setPageMarginDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #854                // Field mMarginDrawable:Landroid/graphics/drawable/Drawable;
       5: aload_1
       6: ifnull        13
       9: aload_0
      10: invokevirtual #1249               // Method refreshDrawableState:()V
      13: aload_1
      14: ifnonnull     22
      17: iconst_1
      18: istore_2
      19: goto          24
      22: iconst_0
      23: istore_2
      24: aload_0
      25: iload_2
      26: invokevirtual #926                // Method setWillNotDraw:(Z)V
      29: aload_0
      30: invokevirtual #1252               // Method invalidate:()V
      33: return

  public void setPageTransformer(boolean, android.support.v4.view.v$g);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: iconst_2
       4: invokevirtual #1257               // Method setPageTransformer:(ZLandroid/support/v4/view/v$g;I)V
       7: return

  public void setPageTransformer(boolean, android.support.v4.view.v$g, int);
    Code:
       0: iconst_1
       1: istore        5
       3: aload_2
       4: ifnull        13
       7: iconst_1
       8: istore        6
      10: goto          16
      13: iconst_0
      14: istore        6
      16: aload_0
      17: getfield      #1097               // Field mPageTransformer:Landroid/support/v4/view/v$g;
      20: ifnull        29
      23: iconst_1
      24: istore        7
      26: goto          32
      29: iconst_0
      30: istore        7
      32: iload         6
      34: iload         7
      36: if_icmpeq     45
      39: iconst_1
      40: istore        4
      42: goto          48
      45: iconst_0
      46: istore        4
      48: aload_0
      49: aload_2
      50: putfield      #1097               // Field mPageTransformer:Landroid/support/v4/view/v$g;
      53: aload_0
      54: iload         6
      56: invokevirtual #1260               // Method setChildrenDrawingOrderEnabled:(Z)V
      59: iload         6
      61: ifeq          85
      64: iload_1
      65: ifeq          71
      68: iconst_2
      69: istore        5
      71: aload_0
      72: iload         5
      74: putfield      #557                // Field mDrawingOrder:I
      77: aload_0
      78: iload_3
      79: putfield      #361                // Field mPageTransformerLayerType:I
      82: goto          90
      85: aload_0
      86: iconst_0
      87: putfield      #557                // Field mDrawingOrder:I
      90: iload         4
      92: ifeq          99
      95: aload_0
      96: invokevirtual #1045               // Method populate:()V
      99: return

  void setScrollState(int);
    Code:
       0: aload_0
       1: getfield      #220                // Field mScrollState:I
       4: iload_1
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iload_1
      11: putfield      #220                // Field mScrollState:I
      14: aload_0
      15: getfield      #1097               // Field mPageTransformer:Landroid/support/v4/view/v$g;
      18: ifnull        37
      21: iload_1
      22: ifeq          30
      25: iconst_1
      26: istore_2
      27: goto          32
      30: iconst_0
      31: istore_2
      32: aload_0
      33: iload_2
      34: invokespecial #1262               // Method enableLayers:(Z)V
      37: aload_0
      38: iload_1
      39: invokespecial #1264               // Method dispatchOnScrollStateChanged:(I)V
      42: return

  void smoothScrollTo(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iconst_0
       4: invokevirtual #550                // Method smoothScrollTo:(III)V
       7: return

  void smoothScrollTo(int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #359                // Method getChildCount:()I
       4: ifne          13
       7: aload_0
       8: iconst_0
       9: invokespecial #263                // Method setScrollingCacheEnabled:(Z)V
      12: return
      13: aload_0
      14: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      17: ifnull        36
      20: aload_0
      21: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      24: invokevirtual #271                // Method android/widget/Scroller.isFinished:()Z
      27: ifne          36
      30: iconst_1
      31: istore        7
      33: goto          39
      36: iconst_0
      37: istore        7
      39: iload         7
      41: ifeq          87
      44: aload_0
      45: getfield      #747                // Field mIsScrollStarted:Z
      48: ifeq          63
      51: aload_0
      52: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      55: invokevirtual #283                // Method android/widget/Scroller.getCurrX:()I
      58: istore        7
      60: goto          72
      63: aload_0
      64: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      67: invokevirtual #1267               // Method android/widget/Scroller.getStartX:()I
      70: istore        7
      72: aload_0
      73: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
      76: invokevirtual #274                // Method android/widget/Scroller.abortAnimation:()V
      79: aload_0
      80: iconst_0
      81: invokespecial #263                // Method setScrollingCacheEnabled:(Z)V
      84: goto          93
      87: aload_0
      88: invokevirtual #277                // Method getScrollX:()I
      91: istore        7
      93: aload_0
      94: invokevirtual #280                // Method getScrollY:()I
      97: istore        8
      99: iload_1
     100: iload         7
     102: isub
     103: istore        9
     105: iload_2
     106: iload         8
     108: isub
     109: istore_2
     110: iload         9
     112: ifne          134
     115: iload_2
     116: ifne          134
     119: aload_0
     120: iconst_0
     121: invokespecial #518                // Method completeScroll:(Z)V
     124: aload_0
     125: invokevirtual #1045               // Method populate:()V
     128: aload_0
     129: iconst_0
     130: invokevirtual #709                // Method setScrollState:(I)V
     133: return
     134: aload_0
     135: iconst_1
     136: invokespecial #263                // Method setScrollingCacheEnabled:(Z)V
     139: aload_0
     140: iconst_2
     141: invokevirtual #709                // Method setScrollState:(I)V
     144: aload_0
     145: invokespecial #239                // Method getClientWidth:()I
     148: istore_1
     149: iload_1
     150: iconst_2
     151: idiv
     152: istore        10
     154: iload         9
     156: invokestatic  #316                // Method java/lang/Math.abs:(I)I
     159: i2f
     160: fstore        5
     162: iload_1
     163: i2f
     164: fstore        4
     166: fconst_1
     167: fload         5
     169: fconst_1
     170: fmul
     171: fload         4
     173: fdiv
     174: invokestatic  #516                // Method java/lang/Math.min:(FF)F
     177: fstore        6
     179: iload         10
     181: i2f
     182: fstore        5
     184: aload_0
     185: fload         6
     187: invokevirtual #1269               // Method distanceInfluenceForSnapDuration:(F)F
     190: fstore        6
     192: iload_3
     193: invokestatic  #316                // Method java/lang/Math.abs:(I)I
     196: istore_1
     197: iload_1
     198: ifle          228
     201: fload         5
     203: fload         6
     205: fload         5
     207: fmul
     208: fadd
     209: iload_1
     210: i2f
     211: fdiv
     212: invokestatic  #491                // Method java/lang/Math.abs:(F)F
     215: ldc_w         #1270               // float 1000.0f
     218: fmul
     219: invokestatic  #1005               // Method java/lang/Math.round:(F)I
     222: iconst_4
     223: imul
     224: istore_1
     225: goto          267
     228: aload_0
     229: getfield      #230                // Field mAdapter:Landroid/support/v4/view/q;
     232: aload_0
     233: getfield      #322                // Field mCurItem:I
     236: invokevirtual #258                // Method android/support/v4/view/q.getPageWidth:(I)F
     239: fstore        5
     241: iload         9
     243: invokestatic  #316                // Method java/lang/Math.abs:(I)I
     246: i2f
     247: fload         4
     249: fload         5
     251: fmul
     252: aload_0
     253: getfield      #241                // Field mPageMargin:I
     256: i2f
     257: fadd
     258: fdiv
     259: fconst_1
     260: fadd
     261: ldc_w         #1271               // float 100.0f
     264: fmul
     265: f2i
     266: istore_1
     267: iload_1
     268: sipush        600
     271: invokestatic  #328                // Method java/lang/Math.min:(II)I
     274: istore_1
     275: aload_0
     276: iconst_0
     277: putfield      #747                // Field mIsScrollStarted:Z
     280: aload_0
     281: getfield      #265                // Field mScroller:Landroid/widget/Scroller;
     284: iload         7
     286: iload         8
     288: iload         9
     290: iload_2
     291: iload_1
     292: invokevirtual #1275               // Method android/widget/Scroller.startScroll:(IIIII)V
     295: aload_0
     296: invokestatic  #753                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     299: return

  protected boolean verifyDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #1279               // Method android/view/ViewGroup.verifyDrawable:(Landroid/graphics/drawable/Drawable;)Z
       5: ifne          21
       8: aload_1
       9: aload_0
      10: getfield      #854                // Field mMarginDrawable:Landroid/graphics/drawable/Drawable;
      13: if_acmpne     19
      16: goto          21
      19: iconst_0
      20: ireturn
      21: iconst_1
      22: ireturn
}
