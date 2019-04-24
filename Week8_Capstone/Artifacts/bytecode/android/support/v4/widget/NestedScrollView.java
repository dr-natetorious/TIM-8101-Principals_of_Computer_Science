public class android.support.v4.widget.NestedScrollView extends android.widget.FrameLayout implements android.support.v4.view.k,android.support.v4.view.m {
  static {};
    Code:
       0: new           #10                 // class android/support/v4/widget/NestedScrollView$a
       3: dup
       4: invokespecial #64                 // Method android/support/v4/widget/NestedScrollView$a."<init>":()V
       7: putstatic     #66                 // Field w:Landroid/support/v4/widget/NestedScrollView$a;
      10: iconst_1
      11: newarray       int
      13: dup
      14: iconst_0
      15: ldc           #67                 // int 16843130
      17: iastore
      18: putstatic     #69                 // Field x:[I
      21: return

  public android.support.v4.widget.NestedScrollView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #74                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v4.widget.NestedScrollView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #77                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.v4.widget.NestedScrollView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #78                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #80                 // class android/graphics/Rect
      11: dup
      12: invokespecial #81                 // Method android/graphics/Rect."<init>":()V
      15: putfield      #83                 // Field b:Landroid/graphics/Rect;
      18: aload_0
      19: iconst_1
      20: putfield      #85                 // Field g:Z
      23: aload_0
      24: iconst_0
      25: putfield      #87                 // Field h:Z
      28: aload_0
      29: aconst_null
      30: putfield      #89                 // Field i:Landroid/view/View;
      33: aload_0
      34: iconst_0
      35: putfield      #91                 // Field j:Z
      38: aload_0
      39: iconst_1
      40: putfield      #93                 // Field m:Z
      43: aload_0
      44: iconst_m1
      45: putfield      #95                 // Field q:I
      48: aload_0
      49: iconst_2
      50: newarray       int
      52: putfield      #97                 // Field r:[I
      55: aload_0
      56: iconst_2
      57: newarray       int
      59: putfield      #99                 // Field s:[I
      62: aload_0
      63: invokespecial #101                // Method a:()V
      66: aload_1
      67: aload_2
      68: getstatic     #69                 // Field x:[I
      71: iload_3
      72: iconst_0
      73: invokevirtual #107                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      76: astore_1
      77: aload_0
      78: aload_1
      79: iconst_0
      80: iconst_0
      81: invokevirtual #113                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      84: invokevirtual #117                // Method setFillViewport:(Z)V
      87: aload_1
      88: invokevirtual #120                // Method android/content/res/TypedArray.recycle:()V
      91: aload_0
      92: new           #122                // class android/support/v4/view/o
      95: dup
      96: aload_0
      97: invokespecial #125                // Method android/support/v4/view/o."<init>":(Landroid/view/ViewGroup;)V
     100: putfield      #127                // Field y:Landroid/support/v4/view/o;
     103: aload_0
     104: new           #129                // class android/support/v4/view/l
     107: dup
     108: aload_0
     109: invokespecial #132                // Method android/support/v4/view/l."<init>":(Landroid/view/View;)V
     112: putfield      #134                // Field z:Landroid/support/v4/view/l;
     115: aload_0
     116: iconst_1
     117: invokevirtual #137                // Method setNestedScrollingEnabled:(Z)V
     120: aload_0
     121: getstatic     #66                 // Field w:Landroid/support/v4/widget/NestedScrollView$a;
     124: invokestatic  #142                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/b;)V
     127: return

  protected int a(android.graphics.Rect);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: istore_2
       5: iconst_0
       6: istore        5
       8: iload_2
       9: ifne          14
      12: iconst_0
      13: ireturn
      14: aload_0
      15: invokevirtual #233                // Method getHeight:()I
      18: istore        6
      20: aload_0
      21: invokevirtual #236                // Method getScrollY:()I
      24: istore_2
      25: iload_2
      26: iload         6
      28: iadd
      29: istore        4
      31: aload_0
      32: invokevirtual #385                // Method getVerticalFadingEdgeLength:()I
      35: istore        7
      37: iload_2
      38: istore_3
      39: aload_1
      40: getfield      #276                // Field android/graphics/Rect.top:I
      43: ifle          51
      46: iload_2
      47: iload         7
      49: iadd
      50: istore_3
      51: iload         4
      53: istore_2
      54: aload_1
      55: getfield      #273                // Field android/graphics/Rect.bottom:I
      58: aload_0
      59: iconst_0
      60: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      63: invokevirtual #292                // Method android/view/View.getHeight:()I
      66: if_icmpge     75
      69: iload         4
      71: iload         7
      73: isub
      74: istore_2
      75: aload_1
      76: getfield      #273                // Field android/graphics/Rect.bottom:I
      79: iload_2
      80: if_icmple     137
      83: aload_1
      84: getfield      #276                // Field android/graphics/Rect.top:I
      87: iload_3
      88: if_icmple     137
      91: aload_1
      92: invokevirtual #388                // Method android/graphics/Rect.height:()I
      95: iload         6
      97: if_icmple     110
     100: aload_1
     101: getfield      #276                // Field android/graphics/Rect.top:I
     104: iload_3
     105: isub
     106: istore_3
     107: goto          120
     110: aload_1
     111: getfield      #273                // Field android/graphics/Rect.bottom:I
     114: iload_2
     115: isub
     116: istore_3
     117: goto          107
     120: iload_3
     121: iconst_0
     122: iadd
     123: aload_0
     124: iconst_0
     125: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
     128: invokevirtual #165                // Method android/view/View.getBottom:()I
     131: iload_2
     132: isub
     133: invokestatic  #394                // Method java/lang/Math.min:(II)I
     136: ireturn
     137: iload         5
     139: istore        4
     141: aload_1
     142: getfield      #276                // Field android/graphics/Rect.top:I
     145: iload_3
     146: if_icmpge     202
     149: iload         5
     151: istore        4
     153: aload_1
     154: getfield      #273                // Field android/graphics/Rect.bottom:I
     157: iload_2
     158: if_icmpge     202
     161: aload_1
     162: invokevirtual #388                // Method android/graphics/Rect.height:()I
     165: iload         6
     167: if_icmple     182
     170: iconst_0
     171: iload_2
     172: aload_1
     173: getfield      #273                // Field android/graphics/Rect.bottom:I
     176: isub
     177: isub
     178: istore_2
     179: goto          191
     182: iconst_0
     183: iload_3
     184: aload_1
     185: getfield      #276                // Field android/graphics/Rect.top:I
     188: isub
     189: isub
     190: istore_2
     191: iload_2
     192: aload_0
     193: invokevirtual #236                // Method getScrollY:()I
     196: ineg
     197: invokestatic  #397                // Method java/lang/Math.max:(II)I
     200: istore        4
     202: iload         4
     204: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: invokevirtual #399                // Method android/support/v4/view/l.c:(I)V
       8: return

  public boolean a(int, int);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: iload_2
       6: invokevirtual #401                // Method android/support/v4/view/l.a:(II)Z
       9: ireturn

  boolean a(int, int, int, int, int, int, int, int, boolean);
    Code:
       0: aload_0
       1: invokevirtual #329                // Method getOverScrollMode:()I
       4: istore        12
       6: aload_0
       7: invokevirtual #405                // Method computeHorizontalScrollRange:()I
      10: istore        10
      12: aload_0
      13: invokevirtual #408                // Method computeHorizontalScrollExtent:()I
      16: istore        11
      18: iconst_0
      19: istore        14
      21: iload         10
      23: iload         11
      25: if_icmple     34
      28: iconst_1
      29: istore        10
      31: goto          37
      34: iconst_0
      35: istore        10
      37: aload_0
      38: invokevirtual #411                // Method computeVerticalScrollRange:()I
      41: aload_0
      42: invokevirtual #414                // Method computeVerticalScrollExtent:()I
      45: if_icmple     54
      48: iconst_1
      49: istore        11
      51: goto          57
      54: iconst_0
      55: istore        11
      57: iload         12
      59: ifeq          82
      62: iload         12
      64: iconst_1
      65: if_icmpne     76
      68: iload         10
      70: ifeq          76
      73: goto          82
      76: iconst_0
      77: istore        10
      79: goto          85
      82: iconst_1
      83: istore        10
      85: iload         12
      87: ifeq          110
      90: iload         12
      92: iconst_1
      93: if_icmpne     104
      96: iload         11
      98: ifeq          104
     101: goto          110
     104: iconst_0
     105: istore        11
     107: goto          113
     110: iconst_1
     111: istore        11
     113: iload_3
     114: iload_1
     115: iadd
     116: istore_3
     117: iload         10
     119: ifne          127
     122: iconst_0
     123: istore_1
     124: goto          130
     127: iload         7
     129: istore_1
     130: iload         4
     132: iload_2
     133: iadd
     134: istore        4
     136: iload         11
     138: ifne          146
     141: iconst_0
     142: istore_2
     143: goto          149
     146: iload         8
     148: istore_2
     149: iload_1
     150: ineg
     151: istore        7
     153: iload_1
     154: iload         5
     156: iadd
     157: istore_1
     158: iload_2
     159: ineg
     160: istore        5
     162: iload_2
     163: iload         6
     165: iadd
     166: istore        6
     168: iload_3
     169: iload_1
     170: if_icmple     181
     173: iconst_1
     174: istore        9
     176: iload_1
     177: istore_2
     178: goto          198
     181: iload_3
     182: iload         7
     184: if_icmpge     193
     187: iload         7
     189: istore_1
     190: goto          173
     193: iload_3
     194: istore_2
     195: iconst_0
     196: istore        9
     198: iload         4
     200: iload         6
     202: if_icmple     214
     205: iload         6
     207: istore_1
     208: iconst_1
     209: istore        13
     211: goto          233
     214: iload         4
     216: iload         5
     218: if_icmpge     227
     221: iload         5
     223: istore_1
     224: goto          208
     227: iload         4
     229: istore_1
     230: iconst_0
     231: istore        13
     233: iload         13
     235: ifeq          263
     238: aload_0
     239: iconst_1
     240: invokevirtual #416                // Method b:(I)Z
     243: ifne          263
     246: aload_0
     247: getfield      #175                // Field c:Landroid/widget/OverScroller;
     250: iload_2
     251: iload_1
     252: iconst_0
     253: iconst_0
     254: iconst_0
     255: aload_0
     256: invokevirtual #372                // Method getScrollRange:()I
     259: invokevirtual #420                // Method android/widget/OverScroller.springBack:(IIIIII)Z
     262: pop
     263: aload_0
     264: iload_2
     265: iload_1
     266: iload         9
     268: iload         13
     270: invokevirtual #424                // Method onOverScrolled:(IIZZ)V
     273: iload         9
     275: ifne          287
     278: iload         14
     280: istore        9
     282: iload         13
     284: ifeq          290
     287: iconst_1
     288: istore        9
     290: iload         9
     292: ireturn

  public boolean a(int, int, int, int, int[], int);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: aload         5
      11: iload         6
      13: invokevirtual #427                // Method android/support/v4/view/l.a:(IIII[II)Z
      16: ireturn

  public boolean a(int, int, int[], int[], int);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: iload_2
       6: aload_3
       7: aload         4
       9: iload         5
      11: invokevirtual #430                // Method android/support/v4/view/l.a:(II[I[II)Z
      14: ireturn

  public boolean a(android.view.KeyEvent);
    Code:
       0: aload_0
       1: getfield      #83                 // Field b:Landroid/graphics/Rect;
       4: invokevirtual #434                // Method android/graphics/Rect.setEmpty:()V
       7: aload_0
       8: invokespecial #436                // Method b:()Z
      11: istore        4
      13: iconst_0
      14: istore        5
      16: sipush        130
      19: istore_2
      20: iload         4
      22: ifne          114
      25: iload         5
      27: istore        4
      29: aload_0
      30: invokevirtual #439                // Method isFocused:()Z
      33: ifeq          111
      36: iload         5
      38: istore        4
      40: aload_1
      41: invokevirtual #444                // Method android/view/KeyEvent.getKeyCode:()I
      44: iconst_4
      45: if_icmpeq     111
      48: aload_0
      49: invokevirtual #244                // Method findFocus:()Landroid/view/View;
      52: astore        6
      54: aload         6
      56: astore_1
      57: aload         6
      59: aload_0
      60: if_acmpne     65
      63: aconst_null
      64: astore_1
      65: invokestatic  #450                // Method android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
      68: aload_0
      69: aload_1
      70: sipush        130
      73: invokevirtual #454                // Method android/view/FocusFinder.findNextFocus:(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
      76: astore_1
      77: iload         5
      79: istore        4
      81: aload_1
      82: ifnull        111
      85: iload         5
      87: istore        4
      89: aload_1
      90: aload_0
      91: if_acmpeq     111
      94: iload         5
      96: istore        4
      98: aload_1
      99: sipush        130
     102: invokevirtual #248                // Method android/view/View.requestFocus:(I)Z
     105: ifeq          111
     108: iconst_1
     109: istore        4
     111: iload         4
     113: ireturn
     114: aload_1
     115: invokevirtual #457                // Method android/view/KeyEvent.getAction:()I
     118: ifne          218
     121: aload_1
     122: invokevirtual #444                // Method android/view/KeyEvent.getKeyCode:()I
     125: istore_3
     126: iload_3
     127: bipush        62
     129: if_icmpeq     202
     132: iload_3
     133: tableswitch   { // 19 to 20
                    19: 181
                    20: 158
               default: 156
          }
     156: iconst_0
     157: ireturn
     158: aload_1
     159: invokevirtual #460                // Method android/view/KeyEvent.isAltPressed:()Z
     162: ifne          173
     165: aload_0
     166: sipush        130
     169: invokevirtual #462                // Method e:(I)Z
     172: ireturn
     173: aload_0
     174: sipush        130
     177: invokevirtual #464                // Method d:(I)Z
     180: ireturn
     181: aload_1
     182: invokevirtual #460                // Method android/view/KeyEvent.isAltPressed:()Z
     185: ifne          195
     188: aload_0
     189: bipush        33
     191: invokevirtual #462                // Method e:(I)Z
     194: ireturn
     195: aload_0
     196: bipush        33
     198: invokevirtual #464                // Method d:(I)Z
     201: ireturn
     202: aload_1
     203: invokevirtual #467                // Method android/view/KeyEvent.isShiftPressed:()Z
     206: ifeq          212
     209: bipush        33
     211: istore_2
     212: aload_0
     213: iload_2
     214: invokevirtual #469                // Method c:(I)Z
     217: pop
     218: iconst_0
     219: ireturn

  public void addView(android.view.View);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifle          18
       7: new           #350                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #472                // String ScrollView can host only one direct child
      14: invokespecial #355                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: invokespecial #474                // Method android/widget/FrameLayout.addView:(Landroid/view/View;)V
      23: return

  public void addView(android.view.View, int);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifle          18
       7: new           #350                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #472                // String ScrollView can host only one direct child
      14: invokespecial #355                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: iload_2
      21: invokespecial #477                // Method android/widget/FrameLayout.addView:(Landroid/view/View;I)V
      24: return

  public void addView(android.view.View, int, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifle          18
       7: new           #350                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #472                // String ScrollView can host only one direct child
      14: invokespecial #355                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: iload_2
      21: aload_3
      22: invokespecial #480                // Method android/widget/FrameLayout.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
      25: return

  public void addView(android.view.View, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifle          18
       7: new           #350                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #472                // String ScrollView can host only one direct child
      14: invokespecial #355                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: aload_2
      21: invokespecial #483                // Method android/widget/FrameLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
      24: return

  public final void b(int, int);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifne          8
       7: return
       8: invokestatic  #489                // Method android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
      11: aload_0
      12: getfield      #491                // Field a:J
      15: lsub
      16: ldc2_w        #492                // long 250l
      19: lcmp
      20: ifle          99
      23: aload_0
      24: invokevirtual #233                // Method getHeight:()I
      27: istore_1
      28: aload_0
      29: invokevirtual #298                // Method getPaddingBottom:()I
      32: istore_3
      33: aload_0
      34: invokevirtual #295                // Method getPaddingTop:()I
      37: istore        4
      39: iconst_0
      40: aload_0
      41: iconst_0
      42: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      45: invokevirtual #292                // Method android/view/View.getHeight:()I
      48: iload_1
      49: iload_3
      50: isub
      51: iload         4
      53: isub
      54: isub
      55: invokestatic  #397                // Method java/lang/Math.max:(II)I
      58: istore_3
      59: aload_0
      60: invokevirtual #236                // Method getScrollY:()I
      63: istore_1
      64: iconst_0
      65: iload_2
      66: iload_1
      67: iadd
      68: iload_3
      69: invokestatic  #394                // Method java/lang/Math.min:(II)I
      72: invokestatic  #397                // Method java/lang/Math.max:(II)I
      75: istore_2
      76: aload_0
      77: getfield      #175                // Field c:Landroid/widget/OverScroller;
      80: aload_0
      81: invokevirtual #496                // Method getScrollX:()I
      84: iload_1
      85: iconst_0
      86: iload_2
      87: iload_1
      88: isub
      89: invokevirtual #500                // Method android/widget/OverScroller.startScroll:(IIII)V
      92: aload_0
      93: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
      96: goto          122
      99: aload_0
     100: getfield      #175                // Field c:Landroid/widget/OverScroller;
     103: invokevirtual #505                // Method android/widget/OverScroller.isFinished:()Z
     106: ifne          116
     109: aload_0
     110: getfield      #175                // Field c:Landroid/widget/OverScroller;
     113: invokevirtual #508                // Method android/widget/OverScroller.abortAnimation:()V
     116: aload_0
     117: iload_1
     118: iload_2
     119: invokevirtual #256                // Method scrollBy:(II)V
     122: aload_0
     123: invokestatic  #489                // Method android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
     126: putfield      #491                // Field a:J
     129: return

  public boolean b(int);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: invokevirtual #510                // Method android/support/v4/view/l.a:(I)Z
       8: ireturn

  public final void c(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: aload_0
       3: invokevirtual #496                // Method getScrollX:()I
       6: isub
       7: iload_2
       8: aload_0
       9: invokevirtual #236                // Method getScrollY:()I
      12: isub
      13: invokevirtual #258                // Method b:(II)V
      16: return

  public boolean c(int);
    Code:
       0: iconst_0
       1: istore_3
       2: iload_1
       3: sipush        130
       6: if_icmpne     14
       9: iconst_1
      10: istore_2
      11: goto          16
      14: iconst_0
      15: istore_2
      16: aload_0
      17: invokevirtual #233                // Method getHeight:()I
      20: istore        4
      22: iload_2
      23: ifeq          94
      26: aload_0
      27: getfield      #83                 // Field b:Landroid/graphics/Rect;
      30: aload_0
      31: invokevirtual #236                // Method getScrollY:()I
      34: iload         4
      36: iadd
      37: putfield      #276                // Field android/graphics/Rect.top:I
      40: aload_0
      41: invokevirtual #306                // Method getChildCount:()I
      44: istore_2
      45: iload_2
      46: ifle          132
      49: aload_0
      50: iload_2
      51: iconst_1
      52: isub
      53: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      56: astore        6
      58: aload_0
      59: getfield      #83                 // Field b:Landroid/graphics/Rect;
      62: getfield      #276                // Field android/graphics/Rect.top:I
      65: iload         4
      67: iadd
      68: aload         6
      70: invokevirtual #165                // Method android/view/View.getBottom:()I
      73: if_icmple     132
      76: aload_0
      77: getfield      #83                 // Field b:Landroid/graphics/Rect;
      80: astore        5
      82: aload         6
      84: invokevirtual #165                // Method android/view/View.getBottom:()I
      87: iload         4
      89: isub
      90: istore_2
      91: goto          126
      94: aload_0
      95: getfield      #83                 // Field b:Landroid/graphics/Rect;
      98: aload_0
      99: invokevirtual #236                // Method getScrollY:()I
     102: iload         4
     104: isub
     105: putfield      #276                // Field android/graphics/Rect.top:I
     108: aload_0
     109: getfield      #83                 // Field b:Landroid/graphics/Rect;
     112: getfield      #276                // Field android/graphics/Rect.top:I
     115: ifge          132
     118: aload_0
     119: getfield      #83                 // Field b:Landroid/graphics/Rect;
     122: astore        5
     124: iload_3
     125: istore_2
     126: aload         5
     128: iload_2
     129: putfield      #276                // Field android/graphics/Rect.top:I
     132: aload_0
     133: getfield      #83                 // Field b:Landroid/graphics/Rect;
     136: aload_0
     137: getfield      #83                 // Field b:Landroid/graphics/Rect;
     140: getfield      #276                // Field android/graphics/Rect.top:I
     143: iload         4
     145: iadd
     146: putfield      #273                // Field android/graphics/Rect.bottom:I
     149: aload_0
     150: iload_1
     151: aload_0
     152: getfield      #83                 // Field b:Landroid/graphics/Rect;
     155: getfield      #276                // Field android/graphics/Rect.top:I
     158: aload_0
     159: getfield      #83                 // Field b:Landroid/graphics/Rect;
     162: getfield      #273                // Field android/graphics/Rect.bottom:I
     165: invokespecial #512                // Method a:(III)Z
     168: ireturn

  public int computeHorizontalScrollExtent();
    Code:
       0: aload_0
       1: invokespecial #513                // Method android/widget/FrameLayout.computeHorizontalScrollExtent:()I
       4: ireturn

  public int computeHorizontalScrollOffset();
    Code:
       0: aload_0
       1: invokespecial #516                // Method android/widget/FrameLayout.computeHorizontalScrollOffset:()I
       4: ireturn

  public int computeHorizontalScrollRange();
    Code:
       0: aload_0
       1: invokespecial #517                // Method android/widget/FrameLayout.computeHorizontalScrollRange:()I
       4: ireturn

  public void computeScroll();
    Code:
       0: aload_0
       1: getfield      #175                // Field c:Landroid/widget/OverScroller;
       4: invokevirtual #521                // Method android/widget/OverScroller.computeScrollOffset:()Z
       7: ifeq          215
      10: aload_0
      11: getfield      #175                // Field c:Landroid/widget/OverScroller;
      14: invokevirtual #524                // Method android/widget/OverScroller.getCurrX:()I
      17: pop
      18: aload_0
      19: getfield      #175                // Field c:Landroid/widget/OverScroller;
      22: invokevirtual #527                // Method android/widget/OverScroller.getCurrY:()I
      25: istore_3
      26: iload_3
      27: aload_0
      28: getfield      #529                // Field u:I
      31: isub
      32: istore_2
      33: iload_2
      34: istore_1
      35: aload_0
      36: iconst_0
      37: iload_2
      38: aload_0
      39: getfield      #99                 // Field s:[I
      42: aconst_null
      43: iconst_1
      44: invokevirtual #530                // Method a:(II[I[II)Z
      47: ifeq          59
      50: iload_2
      51: aload_0
      52: getfield      #99                 // Field s:[I
      55: iconst_1
      56: iaload
      57: isub
      58: istore_1
      59: iload_1
      60: ifeq          205
      63: aload_0
      64: invokevirtual #372                // Method getScrollRange:()I
      67: istore_2
      68: aload_0
      69: invokevirtual #236                // Method getScrollY:()I
      72: istore        4
      74: aload_0
      75: iconst_0
      76: iload_1
      77: aload_0
      78: invokevirtual #496                // Method getScrollX:()I
      81: iload         4
      83: iconst_0
      84: iload_2
      85: iconst_0
      86: iconst_0
      87: iconst_0
      88: invokevirtual #532                // Method a:(IIIIIIIIZ)Z
      91: pop
      92: aload_0
      93: invokevirtual #236                // Method getScrollY:()I
      96: iload         4
      98: isub
      99: istore        5
     101: aload_0
     102: iconst_0
     103: iload         5
     105: iconst_0
     106: iload_1
     107: iload         5
     109: isub
     110: aconst_null
     111: iconst_1
     112: invokevirtual #533                // Method a:(IIII[II)Z
     115: ifne          205
     118: aload_0
     119: invokevirtual #329                // Method getOverScrollMode:()I
     122: istore_1
     123: iload_1
     124: ifeq          144
     127: iload_1
     128: iconst_1
     129: if_icmpne     139
     132: iload_2
     133: ifle          139
     136: goto          144
     139: iconst_0
     140: istore_1
     141: goto          146
     144: iconst_1
     145: istore_1
     146: iload_1
     147: ifeq          205
     150: aload_0
     151: invokespecial #535                // Method g:()V
     154: iload_3
     155: ifgt          185
     158: iload         4
     160: ifle          185
     163: aload_0
     164: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     167: astore        6
     169: aload         6
     171: aload_0
     172: getfield      #175                // Field c:Landroid/widget/OverScroller;
     175: invokevirtual #538                // Method android/widget/OverScroller.getCurrVelocity:()F
     178: f2i
     179: invokevirtual #541                // Method android/widget/EdgeEffect.onAbsorb:(I)V
     182: goto          205
     185: iload_3
     186: iload_2
     187: if_icmplt     205
     190: iload         4
     192: iload_2
     193: if_icmpge     205
     196: aload_0
     197: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     200: astore        6
     202: goto          169
     205: aload_0
     206: iload_3
     207: putfield      #529                // Field u:I
     210: aload_0
     211: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     214: return
     215: aload_0
     216: iconst_1
     217: invokevirtual #416                // Method b:(I)Z
     220: ifeq          228
     223: aload_0
     224: iconst_1
     225: invokevirtual #317                // Method a:(I)V
     228: aload_0
     229: iconst_0
     230: putfield      #529                // Field u:I
     233: return

  public int computeVerticalScrollExtent();
    Code:
       0: aload_0
       1: invokespecial #542                // Method android/widget/FrameLayout.computeVerticalScrollExtent:()I
       4: ireturn

  public int computeVerticalScrollOffset();
    Code:
       0: iconst_0
       1: aload_0
       2: invokespecial #545                // Method android/widget/FrameLayout.computeVerticalScrollOffset:()I
       5: invokestatic  #397                // Method java/lang/Math.max:(II)I
       8: ireturn

  public int computeVerticalScrollRange();
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: istore_2
       5: aload_0
       6: invokevirtual #233                // Method getHeight:()I
       9: aload_0
      10: invokevirtual #298                // Method getPaddingBottom:()I
      13: isub
      14: aload_0
      15: invokevirtual #295                // Method getPaddingTop:()I
      18: isub
      19: istore_1
      20: iload_2
      21: ifne          26
      24: iload_1
      25: ireturn
      26: aload_0
      27: iconst_0
      28: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      31: invokevirtual #165                // Method android/view/View.getBottom:()I
      34: istore_2
      35: aload_0
      36: invokevirtual #236                // Method getScrollY:()I
      39: istore_3
      40: iconst_0
      41: iload_2
      42: iload_1
      43: isub
      44: invokestatic  #397                // Method java/lang/Math.max:(II)I
      47: istore        4
      49: iload_3
      50: ifge          57
      53: iload_2
      54: iload_3
      55: isub
      56: ireturn
      57: iload_2
      58: istore_1
      59: iload_3
      60: iload         4
      62: if_icmple     72
      65: iload_2
      66: iload_3
      67: iload         4
      69: isub
      70: iadd
      71: istore_1
      72: iload_1
      73: ireturn

  public boolean d(int);
    Code:
       0: iload_1
       1: sipush        130
       4: if_icmpne     12
       7: iconst_1
       8: istore_2
       9: goto          14
      12: iconst_0
      13: istore_2
      14: aload_0
      15: invokevirtual #233                // Method getHeight:()I
      18: istore_3
      19: aload_0
      20: getfield      #83                 // Field b:Landroid/graphics/Rect;
      23: iconst_0
      24: putfield      #276                // Field android/graphics/Rect.top:I
      27: aload_0
      28: getfield      #83                 // Field b:Landroid/graphics/Rect;
      31: iload_3
      32: putfield      #273                // Field android/graphics/Rect.bottom:I
      35: iload_2
      36: ifeq          90
      39: aload_0
      40: invokevirtual #306                // Method getChildCount:()I
      43: istore_2
      44: iload_2
      45: ifle          90
      48: aload_0
      49: iload_2
      50: iconst_1
      51: isub
      52: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      55: astore        4
      57: aload_0
      58: getfield      #83                 // Field b:Landroid/graphics/Rect;
      61: aload         4
      63: invokevirtual #165                // Method android/view/View.getBottom:()I
      66: aload_0
      67: invokevirtual #298                // Method getPaddingBottom:()I
      70: iadd
      71: putfield      #273                // Field android/graphics/Rect.bottom:I
      74: aload_0
      75: getfield      #83                 // Field b:Landroid/graphics/Rect;
      78: aload_0
      79: getfield      #83                 // Field b:Landroid/graphics/Rect;
      82: getfield      #273                // Field android/graphics/Rect.bottom:I
      85: iload_3
      86: isub
      87: putfield      #276                // Field android/graphics/Rect.top:I
      90: aload_0
      91: iload_1
      92: aload_0
      93: getfield      #83                 // Field b:Landroid/graphics/Rect;
      96: getfield      #276                // Field android/graphics/Rect.top:I
      99: aload_0
     100: getfield      #83                 // Field b:Landroid/graphics/Rect;
     103: getfield      #273                // Field android/graphics/Rect.bottom:I
     106: invokespecial #512                // Method a:(III)Z
     109: ireturn

  public boolean dispatchKeyEvent(android.view.KeyEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #548                // Method android/widget/FrameLayout.dispatchKeyEvent:(Landroid/view/KeyEvent;)Z
       5: ifne          21
       8: aload_0
       9: aload_1
      10: invokevirtual #550                // Method a:(Landroid/view/KeyEvent;)Z
      13: ifeq          19
      16: goto          21
      19: iconst_0
      20: ireturn
      21: iconst_1
      22: ireturn

  public boolean dispatchNestedFling(float, float, boolean);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: fload_1
       5: fload_2
       6: iload_3
       7: invokevirtual #552                // Method android/support/v4/view/l.a:(FFZ)Z
      10: ireturn

  public boolean dispatchNestedPreFling(float, float);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: fload_1
       5: fload_2
       6: invokevirtual #554                // Method android/support/v4/view/l.a:(FF)Z
       9: ireturn

  public boolean dispatchNestedPreScroll(int, int, int[], int[]);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: iload_2
       6: aload_3
       7: aload         4
       9: invokevirtual #558                // Method android/support/v4/view/l.a:(II[I[I)Z
      12: ireturn

  public boolean dispatchNestedScroll(int, int, int, int, int[]);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: aload         5
      11: invokevirtual #562                // Method android/support/v4/view/l.a:(IIII[I)Z
      14: ireturn

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #566                // Method android/widget/FrameLayout.draw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
       9: ifnull        385
      12: aload_0
      13: invokevirtual #236                // Method getScrollY:()I
      16: istore        9
      18: aload_0
      19: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
      22: invokevirtual #567                // Method android/widget/EdgeEffect.isFinished:()Z
      25: istore        11
      27: iconst_0
      28: istore        6
      30: iload         11
      32: ifne          196
      35: aload_1
      36: invokevirtual #572                // Method android/graphics/Canvas.save:()I
      39: istore        10
      41: aload_0
      42: invokevirtual #575                // Method getWidth:()I
      45: istore_2
      46: aload_0
      47: invokevirtual #233                // Method getHeight:()I
      50: istore        8
      52: iconst_0
      53: iload         9
      55: invokestatic  #394                // Method java/lang/Math.min:(II)I
      58: istore        7
      60: getstatic     #580                // Field android/os/Build$VERSION.SDK_INT:I
      63: bipush        21
      65: if_icmplt     83
      68: aload_0
      69: invokevirtual #583                // Method getClipToPadding:()Z
      72: ifeq          78
      75: goto          83
      78: iconst_0
      79: istore_3
      80: goto          102
      83: iload_2
      84: aload_0
      85: invokevirtual #586                // Method getPaddingLeft:()I
      88: aload_0
      89: invokevirtual #589                // Method getPaddingRight:()I
      92: iadd
      93: isub
      94: istore_2
      95: aload_0
      96: invokevirtual #586                // Method getPaddingLeft:()I
      99: iconst_0
     100: iadd
     101: istore_3
     102: iload         8
     104: istore        5
     106: iload         7
     108: istore        4
     110: getstatic     #580                // Field android/os/Build$VERSION.SDK_INT:I
     113: bipush        21
     115: if_icmplt     156
     118: iload         8
     120: istore        5
     122: iload         7
     124: istore        4
     126: aload_0
     127: invokevirtual #583                // Method getClipToPadding:()Z
     130: ifeq          156
     133: iload         8
     135: aload_0
     136: invokevirtual #295                // Method getPaddingTop:()I
     139: aload_0
     140: invokevirtual #298                // Method getPaddingBottom:()I
     143: iadd
     144: isub
     145: istore        5
     147: iload         7
     149: aload_0
     150: invokevirtual #295                // Method getPaddingTop:()I
     153: iadd
     154: istore        4
     156: aload_1
     157: iload_3
     158: i2f
     159: iload         4
     161: i2f
     162: invokevirtual #593                // Method android/graphics/Canvas.translate:(FF)V
     165: aload_0
     166: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     169: iload_2
     170: iload         5
     172: invokevirtual #596                // Method android/widget/EdgeEffect.setSize:(II)V
     175: aload_0
     176: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     179: aload_1
     180: invokevirtual #599                // Method android/widget/EdgeEffect.draw:(Landroid/graphics/Canvas;)Z
     183: ifeq          190
     186: aload_0
     187: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     190: aload_1
     191: iload         10
     193: invokevirtual #602                // Method android/graphics/Canvas.restoreToCount:(I)V
     196: aload_0
     197: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     200: invokevirtual #567                // Method android/widget/EdgeEffect.isFinished:()Z
     203: ifne          385
     206: aload_1
     207: invokevirtual #572                // Method android/graphics/Canvas.save:()I
     210: istore        10
     212: aload_0
     213: invokevirtual #575                // Method getWidth:()I
     216: istore        4
     218: aload_0
     219: invokevirtual #233                // Method getHeight:()I
     222: istore        7
     224: aload_0
     225: invokevirtual #372                // Method getScrollRange:()I
     228: iload         9
     230: invokestatic  #397                // Method java/lang/Math.max:(II)I
     233: iload         7
     235: iadd
     236: istore        8
     238: getstatic     #580                // Field android/os/Build$VERSION.SDK_INT:I
     241: bipush        21
     243: if_icmplt     259
     246: iload         6
     248: istore_3
     249: iload         4
     251: istore_2
     252: aload_0
     253: invokevirtual #583                // Method getClipToPadding:()Z
     256: ifeq          279
     259: iload         4
     261: aload_0
     262: invokevirtual #586                // Method getPaddingLeft:()I
     265: aload_0
     266: invokevirtual #589                // Method getPaddingRight:()I
     269: iadd
     270: isub
     271: istore_2
     272: iconst_0
     273: aload_0
     274: invokevirtual #586                // Method getPaddingLeft:()I
     277: iadd
     278: istore_3
     279: iload         8
     281: istore        5
     283: iload         7
     285: istore        4
     287: getstatic     #580                // Field android/os/Build$VERSION.SDK_INT:I
     290: bipush        21
     292: if_icmplt     333
     295: iload         8
     297: istore        5
     299: iload         7
     301: istore        4
     303: aload_0
     304: invokevirtual #583                // Method getClipToPadding:()Z
     307: ifeq          333
     310: iload         7
     312: aload_0
     313: invokevirtual #295                // Method getPaddingTop:()I
     316: aload_0
     317: invokevirtual #298                // Method getPaddingBottom:()I
     320: iadd
     321: isub
     322: istore        4
     324: iload         8
     326: aload_0
     327: invokevirtual #298                // Method getPaddingBottom:()I
     330: isub
     331: istore        5
     333: aload_1
     334: iload_3
     335: iload_2
     336: isub
     337: i2f
     338: iload         5
     340: i2f
     341: invokevirtual #593                // Method android/graphics/Canvas.translate:(FF)V
     344: aload_1
     345: ldc_w         #603                // float 180.0f
     348: iload_2
     349: i2f
     350: fconst_0
     351: invokevirtual #607                // Method android/graphics/Canvas.rotate:(FFF)V
     354: aload_0
     355: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     358: iload_2
     359: iload         4
     361: invokevirtual #596                // Method android/widget/EdgeEffect.setSize:(II)V
     364: aload_0
     365: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     368: aload_1
     369: invokevirtual #599                // Method android/widget/EdgeEffect.draw:(Landroid/graphics/Canvas;)Z
     372: ifeq          379
     375: aload_0
     376: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     379: aload_1
     380: iload         10
     382: invokevirtual #602                // Method android/graphics/Canvas.restoreToCount:(I)V
     385: return

  public boolean e(int);
    Code:
       0: aload_0
       1: invokevirtual #244                // Method findFocus:()Landroid/view/View;
       4: astore        6
       6: aload         6
       8: astore        5
      10: aload         6
      12: aload_0
      13: if_acmpne     19
      16: aconst_null
      17: astore        5
      19: invokestatic  #450                // Method android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
      22: aload_0
      23: aload         5
      25: iload_1
      26: invokevirtual #454                // Method android/view/FocusFinder.findNextFocus:(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
      29: astore        6
      31: aload_0
      32: invokevirtual #610                // Method getMaxScrollAmount:()I
      35: istore_3
      36: aload         6
      38: ifnull        96
      41: aload_0
      42: aload         6
      44: iload_3
      45: aload_0
      46: invokevirtual #233                // Method getHeight:()I
      49: invokespecial #262                // Method a:(Landroid/view/View;II)Z
      52: ifeq          96
      55: aload         6
      57: aload_0
      58: getfield      #83                 // Field b:Landroid/graphics/Rect;
      61: invokevirtual #266                // Method android/view/View.getDrawingRect:(Landroid/graphics/Rect;)V
      64: aload_0
      65: aload         6
      67: aload_0
      68: getfield      #83                 // Field b:Landroid/graphics/Rect;
      71: invokevirtual #270                // Method offsetDescendantRectToMyCoords:(Landroid/view/View;Landroid/graphics/Rect;)V
      74: aload_0
      75: aload_0
      76: aload_0
      77: getfield      #83                 // Field b:Landroid/graphics/Rect;
      80: invokevirtual #252                // Method a:(Landroid/graphics/Rect;)I
      83: invokespecial #240                // Method g:(I)V
      86: aload         6
      88: iload_1
      89: invokevirtual #248                // Method android/view/View.requestFocus:(I)Z
      92: pop
      93: goto          196
      96: iload_1
      97: bipush        33
      99: if_icmpne     118
     102: aload_0
     103: invokevirtual #236                // Method getScrollY:()I
     106: iload_3
     107: if_icmpge     118
     110: aload_0
     111: invokevirtual #236                // Method getScrollY:()I
     114: istore_2
     115: goto          172
     118: iload_3
     119: istore_2
     120: iload_1
     121: sipush        130
     124: if_icmpne     172
     127: iload_3
     128: istore_2
     129: aload_0
     130: invokevirtual #306                // Method getChildCount:()I
     133: ifle          172
     136: aload_0
     137: iconst_0
     138: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
     141: invokevirtual #165                // Method android/view/View.getBottom:()I
     144: aload_0
     145: invokevirtual #236                // Method getScrollY:()I
     148: aload_0
     149: invokevirtual #233                // Method getHeight:()I
     152: iadd
     153: aload_0
     154: invokevirtual #298                // Method getPaddingBottom:()I
     157: isub
     158: isub
     159: istore        4
     161: iload_3
     162: istore_2
     163: iload         4
     165: iload_3
     166: if_icmpge     172
     169: iload         4
     171: istore_2
     172: iload_2
     173: ifne          178
     176: iconst_0
     177: ireturn
     178: iload_1
     179: sipush        130
     182: if_icmpne     188
     185: goto          191
     188: iload_2
     189: ineg
     190: istore_2
     191: aload_0
     192: iload_2
     193: invokespecial #240                // Method g:(I)V
     196: aload         5
     198: ifnull        240
     201: aload         5
     203: invokevirtual #611                // Method android/view/View.isFocused:()Z
     206: ifeq          240
     209: aload_0
     210: aload         5
     212: invokespecial #613                // Method a:(Landroid/view/View;)Z
     215: ifeq          240
     218: aload_0
     219: invokevirtual #616                // Method getDescendantFocusability:()I
     222: istore_1
     223: aload_0
     224: ldc_w         #617                // int 131072
     227: invokevirtual #183                // Method setDescendantFocusability:(I)V
     230: aload_0
     231: invokevirtual #619                // Method requestFocus:()Z
     234: pop
     235: aload_0
     236: iload_1
     237: invokevirtual #183                // Method setDescendantFocusability:(I)V
     240: iconst_1
     241: ireturn

  public void f(int);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifle          53
       7: aload_0
       8: iconst_2
       9: iconst_1
      10: invokevirtual #620                // Method a:(II)Z
      13: pop
      14: aload_0
      15: getfield      #175                // Field c:Landroid/widget/OverScroller;
      18: aload_0
      19: invokevirtual #496                // Method getScrollX:()I
      22: aload_0
      23: invokevirtual #236                // Method getScrollY:()I
      26: iconst_0
      27: iload_1
      28: iconst_0
      29: iconst_0
      30: ldc_w         #621                // int -2147483648
      33: ldc_w         #622                // int 2147483647
      36: iconst_0
      37: iconst_0
      38: invokevirtual #626                // Method android/widget/OverScroller.fling:(IIIIIIIIII)V
      41: aload_0
      42: aload_0
      43: invokevirtual #236                // Method getScrollY:()I
      46: putfield      #529                // Field u:I
      49: aload_0
      50: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
      53: return

  protected float getBottomFadingEdgeStrength();
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifne          9
       7: fconst_0
       8: freturn
       9: aload_0
      10: invokevirtual #385                // Method getVerticalFadingEdgeLength:()I
      13: istore_1
      14: aload_0
      15: invokevirtual #233                // Method getHeight:()I
      18: istore_2
      19: aload_0
      20: invokevirtual #298                // Method getPaddingBottom:()I
      23: istore_3
      24: aload_0
      25: iconst_0
      26: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      29: invokevirtual #165                // Method android/view/View.getBottom:()I
      32: aload_0
      33: invokevirtual #236                // Method getScrollY:()I
      36: isub
      37: iload_2
      38: iload_3
      39: isub
      40: isub
      41: istore_2
      42: iload_2
      43: iload_1
      44: if_icmpge     53
      47: iload_2
      48: i2f
      49: iload_1
      50: i2f
      51: fdiv
      52: freturn
      53: fconst_1
      54: freturn

  public int getMaxScrollAmount();
    Code:
       0: aload_0
       1: invokevirtual #233                // Method getHeight:()I
       4: i2f
       5: ldc_w         #628                // float 0.5f
       8: fmul
       9: f2i
      10: ireturn

  public int getNestedScrollAxes();
    Code:
       0: aload_0
       1: getfield      #127                // Field y:Landroid/support/v4/view/o;
       4: invokevirtual #631                // Method android/support/v4/view/o.a:()I
       7: ireturn

  int getScrollRange();
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: istore_2
       5: iconst_0
       6: istore_1
       7: iload_2
       8: ifle          39
      11: iconst_0
      12: aload_0
      13: iconst_0
      14: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      17: invokevirtual #292                // Method android/view/View.getHeight:()I
      20: aload_0
      21: invokevirtual #233                // Method getHeight:()I
      24: aload_0
      25: invokevirtual #298                // Method getPaddingBottom:()I
      28: isub
      29: aload_0
      30: invokevirtual #295                // Method getPaddingTop:()I
      33: isub
      34: isub
      35: invokestatic  #397                // Method java/lang/Math.max:(II)I
      38: istore_1
      39: iload_1
      40: ireturn

  protected float getTopFadingEdgeStrength();
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifne          9
       7: fconst_0
       8: freturn
       9: aload_0
      10: invokevirtual #385                // Method getVerticalFadingEdgeLength:()I
      13: istore_1
      14: aload_0
      15: invokevirtual #236                // Method getScrollY:()I
      18: istore_2
      19: iload_2
      20: iload_1
      21: if_icmpge     30
      24: iload_2
      25: i2f
      26: iload_1
      27: i2f
      28: fdiv
      29: freturn
      30: fconst_1
      31: freturn

  public boolean hasNestedScrollingParent();
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: invokevirtual #634                // Method android/support/v4/view/l.b:()Z
       7: ireturn

  public boolean isNestedScrollingEnabled();
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: invokevirtual #637                // Method android/support/v4/view/l.a:()Z
       7: ireturn

  protected void measureChild(android.view.View, int, int);
    Code:
       0: aload_1
       1: invokevirtual #643                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: astore        4
       6: aload_1
       7: iload_2
       8: aload_0
       9: invokevirtual #586                // Method getPaddingLeft:()I
      12: aload_0
      13: invokevirtual #589                // Method getPaddingRight:()I
      16: iadd
      17: aload         4
      19: getfield      #648                // Field android/view/ViewGroup$LayoutParams.width:I
      22: invokestatic  #651                // Method getChildMeasureSpec:(III)I
      25: iconst_0
      26: iconst_0
      27: invokestatic  #656                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      30: invokevirtual #659                // Method android/view/View.measure:(II)V
      33: return

  protected void measureChildWithMargins(android.view.View, int, int, int, int);
    Code:
       0: aload_1
       1: invokevirtual #643                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #663                // class android/view/ViewGroup$MarginLayoutParams
       7: astore        6
       9: aload_1
      10: iload_2
      11: aload_0
      12: invokevirtual #586                // Method getPaddingLeft:()I
      15: aload_0
      16: invokevirtual #589                // Method getPaddingRight:()I
      19: iadd
      20: aload         6
      22: getfield      #666                // Field android/view/ViewGroup$MarginLayoutParams.leftMargin:I
      25: iadd
      26: aload         6
      28: getfield      #669                // Field android/view/ViewGroup$MarginLayoutParams.rightMargin:I
      31: iadd
      32: iload_3
      33: iadd
      34: aload         6
      36: getfield      #670                // Field android/view/ViewGroup$MarginLayoutParams.width:I
      39: invokestatic  #651                // Method getChildMeasureSpec:(III)I
      42: aload         6
      44: getfield      #673                // Field android/view/ViewGroup$MarginLayoutParams.topMargin:I
      47: aload         6
      49: getfield      #676                // Field android/view/ViewGroup$MarginLayoutParams.bottomMargin:I
      52: iadd
      53: iconst_0
      54: invokestatic  #656                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      57: invokevirtual #659                // Method android/view/View.measure:(II)V
      60: return

  public void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #679                // Method android/widget/FrameLayout.onAttachedToWindow:()V
       4: aload_0
       5: iconst_0
       6: putfield      #87                 // Field h:Z
       9: return

  public boolean onGenericMotionEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #684                // Method android/view/MotionEvent.getSource:()I
       4: iconst_2
       5: iand
       6: ifeq          106
       9: aload_1
      10: invokevirtual #685                // Method android/view/MotionEvent.getAction:()I
      13: bipush        8
      15: if_icmpeq     20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #91                 // Field j:Z
      24: ifne          106
      27: aload_1
      28: bipush        9
      30: invokevirtual #688                // Method android/view/MotionEvent.getAxisValue:(I)F
      33: fstore_2
      34: fload_2
      35: fconst_0
      36: fcmpl
      37: ifeq          106
      40: fload_2
      41: aload_0
      42: invokespecial #690                // Method getVerticalScrollFactorCompat:()F
      45: fmul
      46: f2i
      47: istore_3
      48: aload_0
      49: invokevirtual #372                // Method getScrollRange:()I
      52: istore        4
      54: aload_0
      55: invokevirtual #236                // Method getScrollY:()I
      58: istore        6
      60: iload         6
      62: iload_3
      63: isub
      64: istore        5
      66: iload         5
      68: ifge          76
      71: iconst_0
      72: istore_3
      73: goto          89
      76: iload         5
      78: istore_3
      79: iload         5
      81: iload         4
      83: if_icmple     89
      86: iload         4
      88: istore_3
      89: iload_3
      90: iload         6
      92: if_icmpeq     106
      95: aload_0
      96: aload_0
      97: invokevirtual #496                // Method getScrollX:()I
     100: iload_3
     101: invokespecial #693                // Method android/widget/FrameLayout.scrollTo:(II)V
     104: iconst_1
     105: ireturn
     106: iconst_0
     107: ireturn

  public boolean onInterceptTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #685                // Method android/view/MotionEvent.getAction:()I
       4: istore_2
       5: iload_2
       6: iconst_2
       7: if_icmpne     19
      10: aload_0
      11: getfield      #91                 // Field j:Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iload_2
      20: sipush        255
      23: iand
      24: istore_2
      25: iload_2
      26: bipush        6
      28: if_icmpeq     352
      31: iload_2
      32: tableswitch   { // 0 to 3
                     0: 264
                     1: 213
                     2: 67
                     3: 213
               default: 64
          }
      64: goto          357
      67: aload_0
      68: getfield      #95                 // Field q:I
      71: istore_2
      72: iload_2
      73: iconst_m1
      74: if_icmpne     80
      77: goto          357
      80: aload_1
      81: iload_2
      82: invokevirtual #697                // Method android/view/MotionEvent.findPointerIndex:(I)I
      85: istore_3
      86: iload_3
      87: iconst_m1
      88: if_icmpne     135
      91: new           #699                // class java/lang/StringBuilder
      94: dup
      95: invokespecial #700                // Method java/lang/StringBuilder."<init>":()V
      98: astore_1
      99: aload_1
     100: ldc_w         #702                // String Invalid pointerId=
     103: invokevirtual #706                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     106: pop
     107: aload_1
     108: iload_2
     109: invokevirtual #709                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     112: pop
     113: aload_1
     114: ldc_w         #711                // String  in onInterceptTouchEvent
     117: invokevirtual #706                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     120: pop
     121: ldc_w         #713                // String NestedScrollView
     124: aload_1
     125: invokevirtual #717                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     128: invokestatic  #722                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
     131: pop
     132: goto          357
     135: aload_1
     136: iload_3
     137: invokevirtual #220                // Method android/view/MotionEvent.getY:(I)F
     140: f2i
     141: istore_2
     142: iload_2
     143: aload_0
     144: getfield      #222                // Field f:I
     147: isub
     148: invokestatic  #725                // Method java/lang/Math.abs:(I)I
     151: aload_0
     152: getfield      #196                // Field n:I
     155: if_icmple     357
     158: iconst_2
     159: aload_0
     160: invokevirtual #727                // Method getNestedScrollAxes:()I
     163: iand
     164: ifne          357
     167: aload_0
     168: iconst_1
     169: putfield      #91                 // Field j:Z
     172: aload_0
     173: iload_2
     174: putfield      #222                // Field f:I
     177: aload_0
     178: invokespecial #729                // Method d:()V
     181: aload_0
     182: getfield      #224                // Field k:Landroid/view/VelocityTracker;
     185: aload_1
     186: invokevirtual #732                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     189: aload_0
     190: iconst_0
     191: putfield      #734                // Field t:I
     194: aload_0
     195: invokevirtual #735                // Method getParent:()Landroid/view/ViewParent;
     198: astore_1
     199: aload_1
     200: ifnull        357
     203: aload_1
     204: iconst_1
     205: invokeinterface #740,  2          // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
     210: goto          357
     213: aload_0
     214: iconst_0
     215: putfield      #91                 // Field j:Z
     218: aload_0
     219: iconst_m1
     220: putfield      #95                 // Field q:I
     223: aload_0
     224: invokespecial #315                // Method e:()V
     227: aload_0
     228: getfield      #175                // Field c:Landroid/widget/OverScroller;
     231: aload_0
     232: invokevirtual #496                // Method getScrollX:()I
     235: aload_0
     236: invokevirtual #236                // Method getScrollY:()I
     239: iconst_0
     240: iconst_0
     241: iconst_0
     242: aload_0
     243: invokevirtual #372                // Method getScrollRange:()I
     246: invokevirtual #420                // Method android/widget/OverScroller.springBack:(IIIIII)Z
     249: ifeq          256
     252: aload_0
     253: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     256: aload_0
     257: iconst_0
     258: invokevirtual #317                // Method a:(I)V
     261: goto          357
     264: aload_1
     265: invokevirtual #742                // Method android/view/MotionEvent.getY:()F
     268: f2i
     269: istore_2
     270: aload_0
     271: aload_1
     272: invokevirtual #745                // Method android/view/MotionEvent.getX:()F
     275: f2i
     276: iload_2
     277: invokespecial #747                // Method d:(II)Z
     280: ifne          295
     283: aload_0
     284: iconst_0
     285: putfield      #91                 // Field j:Z
     288: aload_0
     289: invokespecial #315                // Method e:()V
     292: goto          357
     295: aload_0
     296: iload_2
     297: putfield      #222                // Field f:I
     300: aload_0
     301: aload_1
     302: iconst_0
     303: invokevirtual #216                // Method android/view/MotionEvent.getPointerId:(I)I
     306: putfield      #95                 // Field q:I
     309: aload_0
     310: invokespecial #749                // Method c:()V
     313: aload_0
     314: getfield      #224                // Field k:Landroid/view/VelocityTracker;
     317: aload_1
     318: invokevirtual #732                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     321: aload_0
     322: getfield      #175                // Field c:Landroid/widget/OverScroller;
     325: invokevirtual #521                // Method android/widget/OverScroller.computeScrollOffset:()Z
     328: pop
     329: aload_0
     330: aload_0
     331: getfield      #175                // Field c:Landroid/widget/OverScroller;
     334: invokevirtual #505                // Method android/widget/OverScroller.isFinished:()Z
     337: iconst_1
     338: ixor
     339: putfield      #91                 // Field j:Z
     342: aload_0
     343: iconst_2
     344: iconst_0
     345: invokevirtual #620                // Method a:(II)Z
     348: pop
     349: goto          357
     352: aload_0
     353: aload_1
     354: invokespecial #751                // Method a:(Landroid/view/MotionEvent;)V
     357: aload_0
     358: getfield      #91                 // Field j:Z
     361: ireturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #755                // Method android/widget/FrameLayout.onLayout:(ZIIII)V
      11: aload_0
      12: iconst_0
      13: putfield      #85                 // Field g:Z
      16: aload_0
      17: getfield      #89                 // Field i:Landroid/view/View;
      20: ifnull        42
      23: aload_0
      24: getfield      #89                 // Field i:Landroid/view/View;
      27: aload_0
      28: invokestatic  #285                // Method a:(Landroid/view/View;Landroid/view/View;)Z
      31: ifeq          42
      34: aload_0
      35: aload_0
      36: getfield      #89                 // Field i:Landroid/view/View;
      39: invokespecial #757                // Method b:(Landroid/view/View;)V
      42: aload_0
      43: aconst_null
      44: putfield      #89                 // Field i:Landroid/view/View;
      47: aload_0
      48: getfield      #87                 // Field h:Z
      51: ifne          159
      54: aload_0
      55: getfield      #759                // Field v:Landroid/support/v4/widget/NestedScrollView$c;
      58: ifnull        81
      61: aload_0
      62: aload_0
      63: invokevirtual #496                // Method getScrollX:()I
      66: aload_0
      67: getfield      #759                // Field v:Landroid/support/v4/widget/NestedScrollView$c;
      70: getfield      #761                // Field android/support/v4/widget/NestedScrollView$c.a:I
      73: invokevirtual #762                // Method scrollTo:(II)V
      76: aload_0
      77: aconst_null
      78: putfield      #759                // Field v:Landroid/support/v4/widget/NestedScrollView$c;
      81: aload_0
      82: invokevirtual #306                // Method getChildCount:()I
      85: ifle          100
      88: aload_0
      89: iconst_0
      90: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      93: invokevirtual #765                // Method android/view/View.getMeasuredHeight:()I
      96: istore_2
      97: goto          102
     100: iconst_0
     101: istore_2
     102: iconst_0
     103: iload_2
     104: iload         5
     106: iload_3
     107: isub
     108: aload_0
     109: invokevirtual #298                // Method getPaddingBottom:()I
     112: isub
     113: aload_0
     114: invokevirtual #295                // Method getPaddingTop:()I
     117: isub
     118: isub
     119: invokestatic  #397                // Method java/lang/Math.max:(II)I
     122: istore_2
     123: aload_0
     124: invokevirtual #236                // Method getScrollY:()I
     127: iload_2
     128: if_icmple     143
     131: aload_0
     132: aload_0
     133: invokevirtual #496                // Method getScrollX:()I
     136: iload_2
     137: invokevirtual #762                // Method scrollTo:(II)V
     140: goto          159
     143: aload_0
     144: invokevirtual #236                // Method getScrollY:()I
     147: ifge          159
     150: aload_0
     151: aload_0
     152: invokevirtual #496                // Method getScrollX:()I
     155: iconst_0
     156: invokevirtual #762                // Method scrollTo:(II)V
     159: aload_0
     160: aload_0
     161: invokevirtual #496                // Method getScrollX:()I
     164: aload_0
     165: invokevirtual #236                // Method getScrollY:()I
     168: invokevirtual #762                // Method scrollTo:(II)V
     171: aload_0
     172: iconst_1
     173: putfield      #87                 // Field h:Z
     176: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #768                // Method android/widget/FrameLayout.onMeasure:(II)V
       6: aload_0
       7: getfield      #770                // Field l:Z
      10: ifne          14
      13: return
      14: iload_2
      15: invokestatic  #773                // Method android/view/View$MeasureSpec.getMode:(I)I
      18: ifne          22
      21: return
      22: aload_0
      23: invokevirtual #306                // Method getChildCount:()I
      26: ifle          96
      29: aload_0
      30: iconst_0
      31: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      34: astore_3
      35: aload_0
      36: invokevirtual #774                // Method getMeasuredHeight:()I
      39: istore_2
      40: aload_3
      41: invokevirtual #765                // Method android/view/View.getMeasuredHeight:()I
      44: iload_2
      45: if_icmpge     96
      48: aload_3
      49: invokevirtual #643                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      52: checkcast     #776                // class android/widget/FrameLayout$LayoutParams
      55: astore        4
      57: aload_3
      58: iload_1
      59: aload_0
      60: invokevirtual #586                // Method getPaddingLeft:()I
      63: aload_0
      64: invokevirtual #589                // Method getPaddingRight:()I
      67: iadd
      68: aload         4
      70: getfield      #777                // Field android/widget/FrameLayout$LayoutParams.width:I
      73: invokestatic  #651                // Method getChildMeasureSpec:(III)I
      76: iload_2
      77: aload_0
      78: invokevirtual #295                // Method getPaddingTop:()I
      81: isub
      82: aload_0
      83: invokevirtual #298                // Method getPaddingBottom:()I
      86: isub
      87: ldc_w         #778                // int 1073741824
      90: invokestatic  #656                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      93: invokevirtual #659                // Method android/view/View.measure:(II)V
      96: return

  public boolean onNestedFling(android.view.View, float, float, boolean);
    Code:
       0: iload         4
       2: ifne          13
       5: aload_0
       6: fload_3
       7: f2i
       8: invokespecial #782                // Method h:(I)V
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public boolean onNestedPreFling(android.view.View, float, float);
    Code:
       0: aload_0
       1: fload_2
       2: fload_3
       3: invokevirtual #376                // Method dispatchNestedPreFling:(FF)Z
       6: ireturn

  public void onNestedPreScroll(android.view.View, int, int, int[]);
    Code:
       0: aload_0
       1: iload_2
       2: iload_3
       3: aload         4
       5: aconst_null
       6: invokevirtual #788                // Method dispatchNestedPreScroll:(II[I[I)Z
       9: pop
      10: return

  public void onNestedScroll(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #236                // Method getScrollY:()I
       4: istore_2
       5: aload_0
       6: iconst_0
       7: iload         5
       9: invokevirtual #256                // Method scrollBy:(II)V
      12: aload_0
      13: invokevirtual #236                // Method getScrollY:()I
      16: iload_2
      17: isub
      18: istore_2
      19: aload_0
      20: iconst_0
      21: iload_2
      22: iconst_0
      23: iload         5
      25: iload_2
      26: isub
      27: aconst_null
      28: invokevirtual #791                // Method dispatchNestedScroll:(IIII[I)Z
      31: pop
      32: return

  public void onNestedScrollAccepted(android.view.View, android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #127                // Field y:Landroid/support/v4/view/o;
       4: aload_1
       5: aload_2
       6: iload_3
       7: invokevirtual #795                // Method android/support/v4/view/o.a:(Landroid/view/View;Landroid/view/View;I)V
      10: aload_0
      11: iconst_2
      12: invokevirtual #798                // Method startNestedScroll:(I)Z
      15: pop
      16: return

  protected void onOverScrolled(int, int, boolean, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #693                // Method android/widget/FrameLayout.scrollTo:(II)V
       6: return

  protected boolean onRequestFocusInDescendants(int, android.graphics.Rect);
    Code:
       0: iload_1
       1: iconst_2
       2: if_icmpne     12
       5: sipush        130
       8: istore_3
       9: goto          22
      12: iload_1
      13: istore_3
      14: iload_1
      15: iconst_1
      16: if_icmpne     22
      19: bipush        33
      21: istore_3
      22: aload_2
      23: ifnonnull     40
      26: invokestatic  #450                // Method android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
      29: aload_0
      30: aconst_null
      31: iload_3
      32: invokevirtual #454                // Method android/view/FocusFinder.findNextFocus:(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
      35: astore        4
      37: goto          51
      40: invokestatic  #450                // Method android/view/FocusFinder.getInstance:()Landroid/view/FocusFinder;
      43: aload_0
      44: aload_2
      45: iload_3
      46: invokevirtual #804                // Method android/view/FocusFinder.findNextFocusFromRect:(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;
      49: astore        4
      51: aload         4
      53: ifnonnull     58
      56: iconst_0
      57: ireturn
      58: aload_0
      59: aload         4
      61: invokespecial #613                // Method a:(Landroid/view/View;)Z
      64: ifeq          69
      67: iconst_0
      68: ireturn
      69: aload         4
      71: iload_3
      72: aload_2
      73: invokevirtual #806                // Method android/view/View.requestFocus:(ILandroid/graphics/Rect;)Z
      76: ireturn

  protected void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_1
       1: instanceof    #16                 // class android/support/v4/widget/NestedScrollView$c
       4: ifne          13
       7: aload_0
       8: aload_1
       9: invokespecial #810                // Method android/widget/FrameLayout.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      12: return
      13: aload_1
      14: checkcast     #16                 // class android/support/v4/widget/NestedScrollView$c
      17: astore_1
      18: aload_0
      19: aload_1
      20: invokevirtual #814                // Method android/support/v4/widget/NestedScrollView$c.getSuperState:()Landroid/os/Parcelable;
      23: invokespecial #810                // Method android/widget/FrameLayout.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      26: aload_0
      27: aload_1
      28: putfield      #759                // Field v:Landroid/support/v4/widget/NestedScrollView$c;
      31: aload_0
      32: invokevirtual #817                // Method requestLayout:()V
      35: return

  protected android.os.Parcelable onSaveInstanceState();
    Code:
       0: new           #16                 // class android/support/v4/widget/NestedScrollView$c
       3: dup
       4: aload_0
       5: invokespecial #820                // Method android/widget/FrameLayout.onSaveInstanceState:()Landroid/os/Parcelable;
       8: invokespecial #822                // Method android/support/v4/widget/NestedScrollView$c."<init>":(Landroid/os/Parcelable;)V
      11: astore_1
      12: aload_1
      13: aload_0
      14: invokevirtual #236                // Method getScrollY:()I
      17: putfield      #761                // Field android/support/v4/widget/NestedScrollView$c.a:I
      20: aload_1
      21: areturn

  protected void onScrollChanged(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #825                // Method android/widget/FrameLayout.onScrollChanged:(IIII)V
       9: aload_0
      10: getfield      #827                // Field B:Landroid/support/v4/widget/NestedScrollView$b;
      13: ifnull        31
      16: aload_0
      17: getfield      #827                // Field B:Landroid/support/v4/widget/NestedScrollView$b;
      20: aload_0
      21: iload_1
      22: iload_2
      23: iload_3
      24: iload         4
      26: invokeinterface #830,  6          // InterfaceMethod android/support/v4/widget/NestedScrollView$b.a:(Landroid/support/v4/widget/NestedScrollView;IIII)V
      31: return

  protected void onSizeChanged(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #833                // Method android/widget/FrameLayout.onSizeChanged:(IIII)V
       9: aload_0
      10: invokevirtual #244                // Method findFocus:()Landroid/view/View;
      13: astore        5
      15: aload         5
      17: ifnull        70
      20: aload_0
      21: aload         5
      23: if_acmpne     27
      26: return
      27: aload_0
      28: aload         5
      30: iconst_0
      31: iload         4
      33: invokespecial #262                // Method a:(Landroid/view/View;II)Z
      36: ifeq          70
      39: aload         5
      41: aload_0
      42: getfield      #83                 // Field b:Landroid/graphics/Rect;
      45: invokevirtual #266                // Method android/view/View.getDrawingRect:(Landroid/graphics/Rect;)V
      48: aload_0
      49: aload         5
      51: aload_0
      52: getfield      #83                 // Field b:Landroid/graphics/Rect;
      55: invokevirtual #270                // Method offsetDescendantRectToMyCoords:(Landroid/view/View;Landroid/graphics/Rect;)V
      58: aload_0
      59: aload_0
      60: aload_0
      61: getfield      #83                 // Field b:Landroid/graphics/Rect;
      64: invokevirtual #252                // Method a:(Landroid/graphics/Rect;)I
      67: invokespecial #240                // Method g:(I)V
      70: return

  public boolean onStartNestedScroll(android.view.View, android.view.View, int);
    Code:
       0: iload_3
       1: iconst_2
       2: iand
       3: ifeq          8
       6: iconst_1
       7: ireturn
       8: iconst_0
       9: ireturn

  public void onStopNestedScroll(android.view.View);
    Code:
       0: aload_0
       1: getfield      #127                // Field y:Landroid/support/v4/view/o;
       4: aload_1
       5: invokevirtual #838                // Method android/support/v4/view/o.a:(Landroid/view/View;)V
       8: aload_0
       9: invokevirtual #841                // Method stopNestedScroll:()V
      12: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: invokespecial #729                // Method d:()V
       4: aload_1
       5: invokestatic  #845                // Method android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
       8: astore        9
      10: aload_1
      11: invokevirtual #848                // Method android/view/MotionEvent.getActionMasked:()I
      14: istore_2
      15: iload_2
      16: ifne          24
      19: aload_0
      20: iconst_0
      21: putfield      #734                // Field t:I
      24: aload         9
      26: fconst_0
      27: aload_0
      28: getfield      #734                // Field t:I
      31: i2f
      32: invokevirtual #851                // Method android/view/MotionEvent.offsetLocation:(FF)V
      35: iload_2
      36: tableswitch   { // 0 to 6
                     0: 793
                     1: 718
                     2: 190
                     3: 135
                     4: 80
                     5: 108
                     6: 83
               default: 80
          }
      80: goto          885
      83: aload_0
      84: aload_1
      85: invokespecial #751                // Method a:(Landroid/view/MotionEvent;)V
      88: aload_0
      89: aload_1
      90: aload_1
      91: aload_0
      92: getfield      #95                 // Field q:I
      95: invokevirtual #697                // Method android/view/MotionEvent.findPointerIndex:(I)I
      98: invokevirtual #220                // Method android/view/MotionEvent.getY:(I)F
     101: f2i
     102: putfield      #222                // Field f:I
     105: goto          885
     108: aload_1
     109: invokevirtual #212                // Method android/view/MotionEvent.getActionIndex:()I
     112: istore_2
     113: aload_0
     114: aload_1
     115: iload_2
     116: invokevirtual #220                // Method android/view/MotionEvent.getY:(I)F
     119: f2i
     120: putfield      #222                // Field f:I
     123: aload_0
     124: aload_1
     125: iload_2
     126: invokevirtual #216                // Method android/view/MotionEvent.getPointerId:(I)I
     129: putfield      #95                 // Field q:I
     132: goto          885
     135: aload_0
     136: getfield      #91                 // Field j:Z
     139: ifeq          178
     142: aload_0
     143: invokevirtual #306                // Method getChildCount:()I
     146: ifle          178
     149: aload_0
     150: getfield      #175                // Field c:Landroid/widget/OverScroller;
     153: aload_0
     154: invokevirtual #496                // Method getScrollX:()I
     157: aload_0
     158: invokevirtual #236                // Method getScrollY:()I
     161: iconst_0
     162: iconst_0
     163: iconst_0
     164: aload_0
     165: invokevirtual #372                // Method getScrollRange:()I
     168: invokevirtual #420                // Method android/widget/OverScroller.springBack:(IIIIII)Z
     171: ifeq          178
     174: aload_0
     175: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     178: aload_0
     179: iconst_m1
     180: putfield      #95                 // Field q:I
     183: aload_0
     184: invokespecial #853                // Method f:()V
     187: goto          885
     190: aload_1
     191: aload_0
     192: getfield      #95                 // Field q:I
     195: invokevirtual #697                // Method android/view/MotionEvent.findPointerIndex:(I)I
     198: istore        4
     200: iload         4
     202: iconst_m1
     203: if_icmpne     253
     206: new           #699                // class java/lang/StringBuilder
     209: dup
     210: invokespecial #700                // Method java/lang/StringBuilder."<init>":()V
     213: astore_1
     214: aload_1
     215: ldc_w         #702                // String Invalid pointerId=
     218: invokevirtual #706                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     221: pop
     222: aload_1
     223: aload_0
     224: getfield      #95                 // Field q:I
     227: invokevirtual #709                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     230: pop
     231: aload_1
     232: ldc_w         #855                // String  in onTouchEvent
     235: invokevirtual #706                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     238: pop
     239: ldc_w         #713                // String NestedScrollView
     242: aload_1
     243: invokevirtual #717                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     246: invokestatic  #722                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
     249: pop
     250: goto          885
     253: aload_1
     254: iload         4
     256: invokevirtual #220                // Method android/view/MotionEvent.getY:(I)F
     259: f2i
     260: istore        5
     262: aload_0
     263: getfield      #222                // Field f:I
     266: iload         5
     268: isub
     269: istore_2
     270: iload_2
     271: istore_3
     272: aload_0
     273: iconst_0
     274: iload_2
     275: aload_0
     276: getfield      #99                 // Field s:[I
     279: aload_0
     280: getfield      #97                 // Field r:[I
     283: iconst_0
     284: invokevirtual #530                // Method a:(II[I[II)Z
     287: ifeq          327
     290: iload_2
     291: aload_0
     292: getfield      #99                 // Field s:[I
     295: iconst_1
     296: iaload
     297: isub
     298: istore_3
     299: aload         9
     301: fconst_0
     302: aload_0
     303: getfield      #97                 // Field r:[I
     306: iconst_1
     307: iaload
     308: i2f
     309: invokevirtual #851                // Method android/view/MotionEvent.offsetLocation:(FF)V
     312: aload_0
     313: aload_0
     314: getfield      #734                // Field t:I
     317: aload_0
     318: getfield      #97                 // Field r:[I
     321: iconst_1
     322: iaload
     323: iadd
     324: putfield      #734                // Field t:I
     327: iload_3
     328: istore_2
     329: aload_0
     330: getfield      #91                 // Field j:Z
     333: ifne          394
     336: iload_3
     337: istore_2
     338: iload_3
     339: invokestatic  #725                // Method java/lang/Math.abs:(I)I
     342: aload_0
     343: getfield      #196                // Field n:I
     346: if_icmple     394
     349: aload_0
     350: invokevirtual #735                // Method getParent:()Landroid/view/ViewParent;
     353: astore        10
     355: aload         10
     357: ifnull        368
     360: aload         10
     362: iconst_1
     363: invokeinterface #740,  2          // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
     368: aload_0
     369: iconst_1
     370: putfield      #91                 // Field j:Z
     373: iload_3
     374: ifle          387
     377: iload_3
     378: aload_0
     379: getfield      #196                // Field n:I
     382: isub
     383: istore_2
     384: goto          394
     387: iload_3
     388: aload_0
     389: getfield      #196                // Field n:I
     392: iadd
     393: istore_2
     394: aload_0
     395: getfield      #91                 // Field j:Z
     398: ifeq          885
     401: aload_0
     402: iload         5
     404: aload_0
     405: getfield      #97                 // Field r:[I
     408: iconst_1
     409: iaload
     410: isub
     411: putfield      #222                // Field f:I
     414: aload_0
     415: invokevirtual #236                // Method getScrollY:()I
     418: istore        6
     420: aload_0
     421: invokevirtual #372                // Method getScrollRange:()I
     424: istore        5
     426: aload_0
     427: invokevirtual #329                // Method getOverScrollMode:()I
     430: istore_3
     431: iload_3
     432: ifeq          453
     435: iload_3
     436: iconst_1
     437: if_icmpne     448
     440: iload         5
     442: ifle          448
     445: goto          453
     448: iconst_0
     449: istore_3
     450: goto          455
     453: iconst_1
     454: istore_3
     455: aload_0
     456: iconst_0
     457: iload_2
     458: iconst_0
     459: aload_0
     460: invokevirtual #236                // Method getScrollY:()I
     463: iconst_0
     464: iload         5
     466: iconst_0
     467: iconst_0
     468: iconst_1
     469: invokevirtual #532                // Method a:(IIIIIIIIZ)Z
     472: ifeq          490
     475: aload_0
     476: iconst_0
     477: invokevirtual #416                // Method b:(I)Z
     480: ifne          490
     483: aload_0
     484: getfield      #224                // Field k:Landroid/view/VelocityTracker;
     487: invokevirtual #229                // Method android/view/VelocityTracker.clear:()V
     490: aload_0
     491: invokevirtual #236                // Method getScrollY:()I
     494: iload         6
     496: isub
     497: istore        7
     499: aload_0
     500: iconst_0
     501: iload         7
     503: iconst_0
     504: iload_2
     505: iload         7
     507: isub
     508: aload_0
     509: getfield      #97                 // Field r:[I
     512: iconst_0
     513: invokevirtual #533                // Method a:(IIII[II)Z
     516: ifeq          565
     519: aload_0
     520: aload_0
     521: getfield      #222                // Field f:I
     524: aload_0
     525: getfield      #97                 // Field r:[I
     528: iconst_1
     529: iaload
     530: isub
     531: putfield      #222                // Field f:I
     534: aload         9
     536: fconst_0
     537: aload_0
     538: getfield      #97                 // Field r:[I
     541: iconst_1
     542: iaload
     543: i2f
     544: invokevirtual #851                // Method android/view/MotionEvent.offsetLocation:(FF)V
     547: aload_0
     548: aload_0
     549: getfield      #734                // Field t:I
     552: aload_0
     553: getfield      #97                 // Field r:[I
     556: iconst_1
     557: iaload
     558: iadd
     559: putfield      #734                // Field t:I
     562: goto          885
     565: iload_3
     566: ifeq          885
     569: aload_0
     570: invokespecial #535                // Method g:()V
     573: iload         6
     575: iload_2
     576: iadd
     577: istore_3
     578: iload_3
     579: ifge          631
     582: aload_0
     583: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     586: iload_2
     587: i2f
     588: aload_0
     589: invokevirtual #233                // Method getHeight:()I
     592: i2f
     593: fdiv
     594: aload_1
     595: iload         4
     597: invokevirtual #857                // Method android/view/MotionEvent.getX:(I)F
     600: aload_0
     601: invokevirtual #575                // Method getWidth:()I
     604: i2f
     605: fdiv
     606: invokestatic  #862                // Method android/support/v4/widget/g.a:(Landroid/widget/EdgeEffect;FF)V
     609: aload_0
     610: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     613: invokevirtual #567                // Method android/widget/EdgeEffect.isFinished:()Z
     616: ifne          684
     619: aload_0
     620: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     623: astore_1
     624: aload_1
     625: invokevirtual #324                // Method android/widget/EdgeEffect.onRelease:()V
     628: goto          684
     631: iload_3
     632: iload         5
     634: if_icmple     684
     637: aload_0
     638: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     641: iload_2
     642: i2f
     643: aload_0
     644: invokevirtual #233                // Method getHeight:()I
     647: i2f
     648: fdiv
     649: fconst_1
     650: aload_1
     651: iload         4
     653: invokevirtual #857                // Method android/view/MotionEvent.getX:(I)F
     656: aload_0
     657: invokevirtual #575                // Method getWidth:()I
     660: i2f
     661: fdiv
     662: fsub
     663: invokestatic  #862                // Method android/support/v4/widget/g.a:(Landroid/widget/EdgeEffect;FF)V
     666: aload_0
     667: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     670: invokevirtual #567                // Method android/widget/EdgeEffect.isFinished:()Z
     673: ifne          684
     676: aload_0
     677: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     680: astore_1
     681: goto          624
     684: aload_0
     685: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     688: ifnull        885
     691: aload_0
     692: getfield      #319                // Field d:Landroid/widget/EdgeEffect;
     695: invokevirtual #567                // Method android/widget/EdgeEffect.isFinished:()Z
     698: ifeq          711
     701: aload_0
     702: getfield      #326                // Field e:Landroid/widget/EdgeEffect;
     705: invokevirtual #567                // Method android/widget/EdgeEffect.isFinished:()Z
     708: ifne          885
     711: aload_0
     712: invokestatic  #502                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     715: goto          885
     718: aload_0
     719: getfield      #224                // Field k:Landroid/view/VelocityTracker;
     722: astore_1
     723: aload_1
     724: sipush        1000
     727: aload_0
     728: getfield      #206                // Field p:I
     731: i2f
     732: invokevirtual #866                // Method android/view/VelocityTracker.computeCurrentVelocity:(IF)V
     735: aload_1
     736: aload_0
     737: getfield      #95                 // Field q:I
     740: invokevirtual #869                // Method android/view/VelocityTracker.getYVelocity:(I)F
     743: f2i
     744: istore_2
     745: iload_2
     746: invokestatic  #725                // Method java/lang/Math.abs:(I)I
     749: aload_0
     750: getfield      #201                // Field o:I
     753: if_icmple     765
     756: aload_0
     757: iload_2
     758: ineg
     759: invokespecial #782                // Method h:(I)V
     762: goto          178
     765: aload_0
     766: getfield      #175                // Field c:Landroid/widget/OverScroller;
     769: aload_0
     770: invokevirtual #496                // Method getScrollX:()I
     773: aload_0
     774: invokevirtual #236                // Method getScrollY:()I
     777: iconst_0
     778: iconst_0
     779: iconst_0
     780: aload_0
     781: invokevirtual #372                // Method getScrollRange:()I
     784: invokevirtual #420                // Method android/widget/OverScroller.springBack:(IIIIII)Z
     787: ifeq          178
     790: goto          174
     793: aload_0
     794: invokevirtual #306                // Method getChildCount:()I
     797: ifne          802
     800: iconst_0
     801: ireturn
     802: aload_0
     803: getfield      #175                // Field c:Landroid/widget/OverScroller;
     806: invokevirtual #505                // Method android/widget/OverScroller.isFinished:()Z
     809: iconst_1
     810: ixor
     811: istore        8
     813: aload_0
     814: iload         8
     816: putfield      #91                 // Field j:Z
     819: iload         8
     821: ifeq          843
     824: aload_0
     825: invokevirtual #735                // Method getParent:()Landroid/view/ViewParent;
     828: astore        10
     830: aload         10
     832: ifnull        843
     835: aload         10
     837: iconst_1
     838: invokeinterface #740,  2          // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
     843: aload_0
     844: getfield      #175                // Field c:Landroid/widget/OverScroller;
     847: invokevirtual #505                // Method android/widget/OverScroller.isFinished:()Z
     850: ifne          860
     853: aload_0
     854: getfield      #175                // Field c:Landroid/widget/OverScroller;
     857: invokevirtual #508                // Method android/widget/OverScroller.abortAnimation:()V
     860: aload_0
     861: aload_1
     862: invokevirtual #742                // Method android/view/MotionEvent.getY:()F
     865: f2i
     866: putfield      #222                // Field f:I
     869: aload_0
     870: aload_1
     871: iconst_0
     872: invokevirtual #216                // Method android/view/MotionEvent.getPointerId:(I)I
     875: putfield      #95                 // Field q:I
     878: aload_0
     879: iconst_2
     880: iconst_0
     881: invokevirtual #620                // Method a:(II)Z
     884: pop
     885: aload_0
     886: getfield      #224                // Field k:Landroid/view/VelocityTracker;
     889: ifnull        901
     892: aload_0
     893: getfield      #224                // Field k:Landroid/view/VelocityTracker;
     896: aload         9
     898: invokevirtual #732                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     901: aload         9
     903: invokevirtual #870                // Method android/view/MotionEvent.recycle:()V
     906: iconst_1
     907: ireturn

  public void requestChildFocus(android.view.View, android.view.View);
    Code:
       0: aload_0
       1: getfield      #85                 // Field g:Z
       4: ifne          15
       7: aload_0
       8: aload_2
       9: invokespecial #757                // Method b:(Landroid/view/View;)V
      12: goto          20
      15: aload_0
      16: aload_2
      17: putfield      #89                 // Field i:Landroid/view/View;
      20: aload_0
      21: aload_1
      22: aload_2
      23: invokespecial #874                // Method android/widget/FrameLayout.requestChildFocus:(Landroid/view/View;Landroid/view/View;)V
      26: return

  public boolean requestChildRectangleOnScreen(android.view.View, android.graphics.Rect, boolean);
    Code:
       0: aload_2
       1: aload_1
       2: invokevirtual #309                // Method android/view/View.getLeft:()I
       5: aload_1
       6: invokevirtual #877                // Method android/view/View.getScrollX:()I
       9: isub
      10: aload_1
      11: invokevirtual #162                // Method android/view/View.getTop:()I
      14: aload_1
      15: invokevirtual #878                // Method android/view/View.getScrollY:()I
      18: isub
      19: invokevirtual #881                // Method android/graphics/Rect.offset:(II)V
      22: aload_0
      23: aload_2
      24: iload_3
      25: invokespecial #883                // Method a:(Landroid/graphics/Rect;Z)Z
      28: ireturn

  public void requestDisallowInterceptTouchEvent(boolean);
    Code:
       0: iload_1
       1: ifeq          8
       4: aload_0
       5: invokespecial #315                // Method e:()V
       8: aload_0
       9: iload_1
      10: invokespecial #884                // Method android/widget/FrameLayout.requestDisallowInterceptTouchEvent:(Z)V
      13: return

  public void requestLayout();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #85                 // Field g:Z
       5: aload_0
       6: invokespecial #885                // Method android/widget/FrameLayout.requestLayout:()V
       9: return

  public void scrollTo(int, int);
    Code:
       0: aload_0
       1: invokevirtual #306                // Method getChildCount:()I
       4: ifle          81
       7: aload_0
       8: iconst_0
       9: invokevirtual #291                // Method getChildAt:(I)Landroid/view/View;
      12: astore_3
      13: iload_1
      14: aload_0
      15: invokevirtual #575                // Method getWidth:()I
      18: aload_0
      19: invokevirtual #589                // Method getPaddingRight:()I
      22: isub
      23: aload_0
      24: invokevirtual #586                // Method getPaddingLeft:()I
      27: isub
      28: aload_3
      29: invokevirtual #886                // Method android/view/View.getWidth:()I
      32: invokestatic  #888                // Method b:(III)I
      35: istore_1
      36: iload_2
      37: aload_0
      38: invokevirtual #233                // Method getHeight:()I
      41: aload_0
      42: invokevirtual #298                // Method getPaddingBottom:()I
      45: isub
      46: aload_0
      47: invokevirtual #295                // Method getPaddingTop:()I
      50: isub
      51: aload_3
      52: invokevirtual #292                // Method android/view/View.getHeight:()I
      55: invokestatic  #888                // Method b:(III)I
      58: istore_2
      59: iload_1
      60: aload_0
      61: invokevirtual #496                // Method getScrollX:()I
      64: if_icmpne     75
      67: iload_2
      68: aload_0
      69: invokevirtual #236                // Method getScrollY:()I
      72: if_icmpeq     81
      75: aload_0
      76: iload_1
      77: iload_2
      78: invokespecial #693                // Method android/widget/FrameLayout.scrollTo:(II)V
      81: return

  public void setFillViewport(boolean);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #770                // Field l:Z
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #770                // Field l:Z
      13: aload_0
      14: invokevirtual #817                // Method requestLayout:()V
      17: return

  public void setNestedScrollingEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: invokevirtual #890                // Method android/support/v4/view/l.a:(Z)V
       8: return

  public void setOnScrollChangeListener(android.support.v4.widget.NestedScrollView$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #827                // Field B:Landroid/support/v4/widget/NestedScrollView$b;
       5: return

  public void setSmoothScrollingEnabled(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #93                 // Field m:Z
       5: return

  public boolean shouldDelayChildPressedState();
    Code:
       0: iconst_1
       1: ireturn

  public boolean startNestedScroll(int);
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: iload_1
       5: invokevirtual #895                // Method android/support/v4/view/l.b:(I)Z
       8: ireturn

  public void stopNestedScroll();
    Code:
       0: aload_0
       1: getfield      #134                // Field z:Landroid/support/v4/view/l;
       4: invokevirtual #896                // Method android/support/v4/view/l.c:()V
       7: return
}
