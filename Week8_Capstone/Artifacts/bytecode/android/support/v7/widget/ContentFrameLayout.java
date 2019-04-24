public class android.support.v7.widget.ContentFrameLayout extends android.widget.FrameLayout {
  public android.support.v7.widget.ContentFrameLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #22                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.ContentFrameLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #26                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.v7.widget.ContentFrameLayout(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #27                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #29                 // class android/graphics/Rect
      11: dup
      12: invokespecial #32                 // Method android/graphics/Rect."<init>":()V
      15: putfield      #34                 // Field g:Landroid/graphics/Rect;
      18: return

  public void a(int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #34                 // Field g:Landroid/graphics/Rect;
       4: iload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: invokevirtual #38                 // Method android/graphics/Rect.set:(IIII)V
      12: aload_0
      13: invokestatic  #44                 // Method android/support/v4/view/s.w:(Landroid/view/View;)Z
      16: ifeq          23
      19: aload_0
      20: invokevirtual #47                 // Method requestLayout:()V
      23: return

  public void a(android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #52                 // Method fitSystemWindows:(Landroid/graphics/Rect;)Z
       5: pop
       6: return

  public android.util.TypedValue getFixedHeightMajor();
    Code:
       0: aload_0
       1: getfield      #56                 // Field e:Landroid/util/TypedValue;
       4: ifnonnull     18
       7: aload_0
       8: new           #58                 // class android/util/TypedValue
      11: dup
      12: invokespecial #59                 // Method android/util/TypedValue."<init>":()V
      15: putfield      #56                 // Field e:Landroid/util/TypedValue;
      18: aload_0
      19: getfield      #56                 // Field e:Landroid/util/TypedValue;
      22: areturn

  public android.util.TypedValue getFixedHeightMinor();
    Code:
       0: aload_0
       1: getfield      #62                 // Field f:Landroid/util/TypedValue;
       4: ifnonnull     18
       7: aload_0
       8: new           #58                 // class android/util/TypedValue
      11: dup
      12: invokespecial #59                 // Method android/util/TypedValue."<init>":()V
      15: putfield      #62                 // Field f:Landroid/util/TypedValue;
      18: aload_0
      19: getfield      #62                 // Field f:Landroid/util/TypedValue;
      22: areturn

  public android.util.TypedValue getFixedWidthMajor();
    Code:
       0: aload_0
       1: getfield      #65                 // Field c:Landroid/util/TypedValue;
       4: ifnonnull     18
       7: aload_0
       8: new           #58                 // class android/util/TypedValue
      11: dup
      12: invokespecial #59                 // Method android/util/TypedValue."<init>":()V
      15: putfield      #65                 // Field c:Landroid/util/TypedValue;
      18: aload_0
      19: getfield      #65                 // Field c:Landroid/util/TypedValue;
      22: areturn

  public android.util.TypedValue getFixedWidthMinor();
    Code:
       0: aload_0
       1: getfield      #68                 // Field d:Landroid/util/TypedValue;
       4: ifnonnull     18
       7: aload_0
       8: new           #58                 // class android/util/TypedValue
      11: dup
      12: invokespecial #59                 // Method android/util/TypedValue."<init>":()V
      15: putfield      #68                 // Field d:Landroid/util/TypedValue;
      18: aload_0
      19: getfield      #68                 // Field d:Landroid/util/TypedValue;
      22: areturn

  public android.util.TypedValue getMinWidthMajor();
    Code:
       0: aload_0
       1: getfield      #71                 // Field a:Landroid/util/TypedValue;
       4: ifnonnull     18
       7: aload_0
       8: new           #58                 // class android/util/TypedValue
      11: dup
      12: invokespecial #59                 // Method android/util/TypedValue."<init>":()V
      15: putfield      #71                 // Field a:Landroid/util/TypedValue;
      18: aload_0
      19: getfield      #71                 // Field a:Landroid/util/TypedValue;
      22: areturn

  public android.util.TypedValue getMinWidthMinor();
    Code:
       0: aload_0
       1: getfield      #74                 // Field b:Landroid/util/TypedValue;
       4: ifnonnull     18
       7: aload_0
       8: new           #58                 // class android/util/TypedValue
      11: dup
      12: invokespecial #59                 // Method android/util/TypedValue."<init>":()V
      15: putfield      #74                 // Field b:Landroid/util/TypedValue;
      18: aload_0
      19: getfield      #74                 // Field b:Landroid/util/TypedValue;
      22: areturn

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #77                 // Method android/widget/FrameLayout.onAttachedToWindow:()V
       4: aload_0
       5: getfield      #79                 // Field h:Landroid/support/v7/widget/ContentFrameLayout$a;
       8: ifnull        20
      11: aload_0
      12: getfield      #79                 // Field h:Landroid/support/v7/widget/ContentFrameLayout$a;
      15: invokeinterface #81,  1           // InterfaceMethod android/support/v7/widget/ContentFrameLayout$a.a:()V
      20: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #84                 // Method android/widget/FrameLayout.onDetachedFromWindow:()V
       4: aload_0
       5: getfield      #79                 // Field h:Landroid/support/v7/widget/ContentFrameLayout$a;
       8: ifnull        20
      11: aload_0
      12: getfield      #79                 // Field h:Landroid/support/v7/widget/ContentFrameLayout$a;
      15: invokeinterface #86,  1           // InterfaceMethod android/support/v7/widget/ContentFrameLayout$a.b:()V
      20: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: invokevirtual #92                 // Method getContext:()Landroid/content/Context;
       4: invokevirtual #98                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       7: invokevirtual #104                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      10: astore        11
      12: aload         11
      14: getfield      #110                // Field android/util/DisplayMetrics.widthPixels:I
      17: istore        4
      19: aload         11
      21: getfield      #113                // Field android/util/DisplayMetrics.heightPixels:I
      24: istore        5
      26: iconst_1
      27: istore        8
      29: iload         4
      31: iload         5
      33: if_icmpge     42
      36: iconst_1
      37: istore        4
      39: goto          45
      42: iconst_0
      43: istore        4
      45: iload_1
      46: invokestatic  #119                // Method android/view/View$MeasureSpec.getMode:(I)I
      49: istore        9
      51: iload_2
      52: invokestatic  #119                // Method android/view/View$MeasureSpec.getMode:(I)I
      55: istore        7
      57: iload         9
      59: ldc           #120                // int -2147483648
      61: if_icmpne     197
      64: iload         4
      66: ifeq          78
      69: aload_0
      70: getfield      #68                 // Field d:Landroid/util/TypedValue;
      73: astore        10
      75: goto          84
      78: aload_0
      79: getfield      #65                 // Field c:Landroid/util/TypedValue;
      82: astore        10
      84: aload         10
      86: ifnull        197
      89: aload         10
      91: getfield      #123                // Field android/util/TypedValue.type:I
      94: ifeq          197
      97: aload         10
      99: getfield      #123                // Field android/util/TypedValue.type:I
     102: iconst_5
     103: if_icmpne     121
     106: aload         10
     108: aload         11
     110: invokevirtual #127                // Method android/util/TypedValue.getDimension:(Landroid/util/DisplayMetrics;)F
     113: fstore_3
     114: fload_3
     115: f2i
     116: istore        5
     118: goto          155
     121: aload         10
     123: getfield      #123                // Field android/util/TypedValue.type:I
     126: bipush        6
     128: if_icmpne     152
     131: aload         10
     133: aload         11
     135: getfield      #110                // Field android/util/DisplayMetrics.widthPixels:I
     138: i2f
     139: aload         11
     141: getfield      #110                // Field android/util/DisplayMetrics.widthPixels:I
     144: i2f
     145: invokevirtual #131                // Method android/util/TypedValue.getFraction:(FF)F
     148: fstore_3
     149: goto          114
     152: iconst_0
     153: istore        5
     155: iload         5
     157: ifle          197
     160: iload         5
     162: aload_0
     163: getfield      #34                 // Field g:Landroid/graphics/Rect;
     166: getfield      #134                // Field android/graphics/Rect.left:I
     169: aload_0
     170: getfield      #34                 // Field g:Landroid/graphics/Rect;
     173: getfield      #137                // Field android/graphics/Rect.right:I
     176: iadd
     177: isub
     178: iload_1
     179: invokestatic  #140                // Method android/view/View$MeasureSpec.getSize:(I)I
     182: invokestatic  #146                // Method java/lang/Math.min:(II)I
     185: ldc           #147                // int 1073741824
     187: invokestatic  #150                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     190: istore        6
     192: iconst_1
     193: istore_1
     194: goto          202
     197: iload_1
     198: istore        6
     200: iconst_0
     201: istore_1
     202: iload_2
     203: istore        5
     205: iload         7
     207: ldc           #120                // int -2147483648
     209: if_icmpne     349
     212: iload         4
     214: ifeq          226
     217: aload_0
     218: getfield      #56                 // Field e:Landroid/util/TypedValue;
     221: astore        10
     223: goto          232
     226: aload_0
     227: getfield      #62                 // Field f:Landroid/util/TypedValue;
     230: astore        10
     232: iload_2
     233: istore        5
     235: aload         10
     237: ifnull        349
     240: iload_2
     241: istore        5
     243: aload         10
     245: getfield      #123                // Field android/util/TypedValue.type:I
     248: ifeq          349
     251: aload         10
     253: getfield      #123                // Field android/util/TypedValue.type:I
     256: iconst_5
     257: if_icmpne     275
     260: aload         10
     262: aload         11
     264: invokevirtual #127                // Method android/util/TypedValue.getDimension:(Landroid/util/DisplayMetrics;)F
     267: fstore_3
     268: fload_3
     269: f2i
     270: istore        7
     272: goto          309
     275: aload         10
     277: getfield      #123                // Field android/util/TypedValue.type:I
     280: bipush        6
     282: if_icmpne     306
     285: aload         10
     287: aload         11
     289: getfield      #113                // Field android/util/DisplayMetrics.heightPixels:I
     292: i2f
     293: aload         11
     295: getfield      #113                // Field android/util/DisplayMetrics.heightPixels:I
     298: i2f
     299: invokevirtual #131                // Method android/util/TypedValue.getFraction:(FF)F
     302: fstore_3
     303: goto          268
     306: iconst_0
     307: istore        7
     309: iload_2
     310: istore        5
     312: iload         7
     314: ifle          349
     317: iload         7
     319: aload_0
     320: getfield      #34                 // Field g:Landroid/graphics/Rect;
     323: getfield      #153                // Field android/graphics/Rect.top:I
     326: aload_0
     327: getfield      #34                 // Field g:Landroid/graphics/Rect;
     330: getfield      #156                // Field android/graphics/Rect.bottom:I
     333: iadd
     334: isub
     335: iload_2
     336: invokestatic  #140                // Method android/view/View$MeasureSpec.getSize:(I)I
     339: invokestatic  #146                // Method java/lang/Math.min:(II)I
     342: ldc           #147                // int 1073741824
     344: invokestatic  #150                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     347: istore        5
     349: aload_0
     350: iload         6
     352: iload         5
     354: invokespecial #158                // Method android/widget/FrameLayout.onMeasure:(II)V
     357: aload_0
     358: invokevirtual #162                // Method getMeasuredWidth:()I
     361: istore        7
     363: iload         7
     365: ldc           #147                // int 1073741824
     367: invokestatic  #150                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     370: istore        6
     372: iload_1
     373: ifne          515
     376: iload         9
     378: ldc           #120                // int -2147483648
     380: if_icmpne     515
     383: iload         4
     385: ifeq          397
     388: aload_0
     389: getfield      #74                 // Field b:Landroid/util/TypedValue;
     392: astore        10
     394: goto          403
     397: aload_0
     398: getfield      #71                 // Field a:Landroid/util/TypedValue;
     401: astore        10
     403: aload         10
     405: ifnull        515
     408: aload         10
     410: getfield      #123                // Field android/util/TypedValue.type:I
     413: ifeq          515
     416: aload         10
     418: getfield      #123                // Field android/util/TypedValue.type:I
     421: iconst_5
     422: if_icmpne     439
     425: aload         10
     427: aload         11
     429: invokevirtual #127                // Method android/util/TypedValue.getDimension:(Landroid/util/DisplayMetrics;)F
     432: fstore_3
     433: fload_3
     434: f2i
     435: istore_1
     436: goto          472
     439: aload         10
     441: getfield      #123                // Field android/util/TypedValue.type:I
     444: bipush        6
     446: if_icmpne     470
     449: aload         10
     451: aload         11
     453: getfield      #110                // Field android/util/DisplayMetrics.widthPixels:I
     456: i2f
     457: aload         11
     459: getfield      #110                // Field android/util/DisplayMetrics.widthPixels:I
     462: i2f
     463: invokevirtual #131                // Method android/util/TypedValue.getFraction:(FF)F
     466: fstore_3
     467: goto          433
     470: iconst_0
     471: istore_1
     472: iload_1
     473: istore_2
     474: iload_1
     475: ifle          496
     478: iload_1
     479: aload_0
     480: getfield      #34                 // Field g:Landroid/graphics/Rect;
     483: getfield      #134                // Field android/graphics/Rect.left:I
     486: aload_0
     487: getfield      #34                 // Field g:Landroid/graphics/Rect;
     490: getfield      #137                // Field android/graphics/Rect.right:I
     493: iadd
     494: isub
     495: istore_2
     496: iload         7
     498: iload_2
     499: if_icmpge     515
     502: iload_2
     503: ldc           #147                // int 1073741824
     505: invokestatic  #150                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     508: istore_2
     509: iload         8
     511: istore_1
     512: goto          520
     515: iconst_0
     516: istore_1
     517: iload         6
     519: istore_2
     520: iload_1
     521: ifeq          531
     524: aload_0
     525: iload_2
     526: iload         5
     528: invokespecial #158                // Method android/widget/FrameLayout.onMeasure:(II)V
     531: return

  public void setAttachListener(android.support.v7.widget.ContentFrameLayout$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #79                 // Field h:Landroid/support/v7/widget/ContentFrameLayout$a;
       5: return
}
