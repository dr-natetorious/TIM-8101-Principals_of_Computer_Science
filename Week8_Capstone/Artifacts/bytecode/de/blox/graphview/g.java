class de.blox.graphview.g extends android.widget.AdapterView<de.blox.graphview.f> {
  public de.blox.graphview.g(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #32                 // Method android/widget/AdapterView."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #34                 // class android/graphics/Paint
      11: dup
      12: invokespecial #37                 // Method android/graphics/Paint."<init>":()V
      15: putfield      #39                 // Field a:Landroid/graphics/Paint;
      18: aload_0
      19: new           #41                 // class android/graphics/Rect
      22: dup
      23: invokespecial #42                 // Method android/graphics/Rect."<init>":()V
      26: putfield      #44                 // Field h:Landroid/graphics/Rect;
      29: aload_0
      30: aload_1
      31: aload_2
      32: invokespecial #47                 // Method a:(Landroid/content/Context;Landroid/util/AttributeSet;)V
      35: return

  static void a(de.blox.graphview.g, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #126                // Method b:(II)V
       6: return

  static void b(de.blox.graphview.g, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #189                // Method c:(II)V
       6: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #168                // Field b:I
       4: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #168                // Field b:I
       5: aload_0
       6: invokespecial #71                 // Method d:()V
       9: aload_0
      10: invokevirtual #280                // Method invalidate:()V
      13: return

  public void a(de.blox.graphview.f);
    Code:
       0: aload_0
       1: getfield      #130                // Field e:Lde/blox/graphview/f;
       4: ifnull        27
       7: aload_0
       8: getfield      #283                // Field i:Landroid/database/DataSetObserver;
      11: ifnull        27
      14: aload_0
      15: getfield      #130                // Field e:Lde/blox/graphview/f;
      18: aload_0
      19: getfield      #283                // Field i:Landroid/database/DataSetObserver;
      22: invokeinterface #287,  2          // InterfaceMethod de/blox/graphview/f.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
      27: aload_0
      28: aload_1
      29: putfield      #130                // Field e:Lde/blox/graphview/f;
      32: aload_0
      33: new           #12                 // class de/blox/graphview/g$b
      36: dup
      37: aload_0
      38: aconst_null
      39: invokespecial #288                // Method de/blox/graphview/g$b."<init>":(Lde/blox/graphview/g;Lde/blox/graphview/g$1;)V
      42: putfield      #283                // Field i:Landroid/database/DataSetObserver;
      45: aload_0
      46: getfield      #130                // Field e:Lde/blox/graphview/f;
      49: aload_0
      50: getfield      #283                // Field i:Landroid/database/DataSetObserver;
      53: invokeinterface #291,  2          // InterfaceMethod de/blox/graphview/f.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
      58: aload_0
      59: invokevirtual #294                // Method requestLayout:()V
      62: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #110                // Field d:Z
       5: aload_0
       6: invokevirtual #280                // Method invalidate:()V
       9: aload_0
      10: invokevirtual #294                // Method requestLayout:()V
      13: return

  public int b();
    Code:
       0: aload_0
       1: getfield      #177                // Field c:I
       4: ireturn

  public void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #177                // Field c:I
       5: aload_0
       6: invokespecial #71                 // Method d:()V
       9: aload_0
      10: invokevirtual #280                // Method invalidate:()V
      13: return

  public de.blox.graphview.f c();
    Code:
       0: aload_0
       1: getfield      #130                // Field e:Lde/blox/graphview/f;
       4: areturn

  protected void dispatchDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: invokevirtual #300                // Method c:()Lde/blox/graphview/f;
       4: astore_2
       5: aload_2
       6: ifnull        40
       9: aload_2
      10: invokeinterface #303,  1          // InterfaceMethod de/blox/graphview/f.c:()Lde/blox/graphview/e;
      15: ifnull        40
      18: aload_2
      19: invokeinterface #306,  1          // InterfaceMethod de/blox/graphview/f.b:()Lde/blox/graphview/a;
      24: aload_1
      25: aload_2
      26: invokeinterface #303,  1          // InterfaceMethod de/blox/graphview/f.c:()Lde/blox/graphview/e;
      31: aload_0
      32: getfield      #39                 // Field a:Landroid/graphics/Paint;
      35: invokeinterface #311,  4          // InterfaceMethod de/blox/graphview/a.a:(Landroid/graphics/Canvas;Lde/blox/graphview/e;Landroid/graphics/Paint;)V
      40: aload_0
      41: aload_1
      42: invokespecial #313                // Method android/widget/AdapterView.dispatchDraw:(Landroid/graphics/Canvas;)V
      45: return

  public android.widget.Adapter getAdapter();
    Code:
       0: aload_0
       1: invokevirtual #300                // Method c:()Lde/blox/graphview/f;
       4: areturn

  public android.view.View getSelectedView();
    Code:
       0: aconst_null
       1: areturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #321                // Method android/widget/AdapterView.onLayout:(ZIIII)V
      11: aload_0
      12: getfield      #130                // Field e:Lde/blox/graphview/f;
      15: ifnonnull     19
      18: return
      19: aload_0
      20: invokevirtual #324                // Method removeAllViewsInLayout:()V
      23: aload_0
      24: invokespecial #326                // Method e:()V
      27: aload_0
      28: invokevirtual #280                // Method invalidate:()V
      31: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #329                // Method android/widget/AdapterView.onMeasure:(II)V
       6: aload_0
       7: getfield      #130                // Field e:Lde/blox/graphview/f;
      10: ifnonnull     14
      13: return
      14: iconst_0
      15: istore        5
      17: iconst_0
      18: istore_1
      19: iconst_0
      20: istore        4
      22: iconst_0
      23: istore_3
      24: ldc           #240                // int 2147483647
      26: istore_2
      27: iload_1
      28: aload_0
      29: getfield      #130                // Field e:Lde/blox/graphview/f;
      32: invokeinterface #243,  1          // InterfaceMethod de/blox/graphview/f.getCount:()I
      37: if_icmpge     180
      40: aload_0
      41: getfield      #130                // Field e:Lde/blox/graphview/f;
      44: iload_1
      45: aconst_null
      46: aload_0
      47: invokeinterface #247,  4          // InterfaceMethod de/blox/graphview/f.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
      52: astore        10
      54: aload         10
      56: invokevirtual #90                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      59: astore        9
      61: aload         9
      63: astore        8
      65: aload         9
      67: ifnonnull     83
      70: new           #92                 // class android/view/ViewGroup$LayoutParams
      73: dup
      74: bipush        -2
      76: bipush        -2
      78: invokespecial #95                 // Method android/view/ViewGroup$LayoutParams."<init>":(II)V
      81: astore        8
      83: aload_0
      84: aload         10
      86: iconst_m1
      87: aload         8
      89: iconst_1
      90: invokevirtual #99                 // Method addViewInLayout:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z
      93: pop
      94: aload         10
      96: aload         8
      98: getfield      #102                // Field android/view/ViewGroup$LayoutParams.width:I
     101: invokestatic  #105                // Method c:(I)I
     104: aload         8
     106: getfield      #108                // Field android/view/ViewGroup$LayoutParams.height:I
     109: invokestatic  #105                // Method c:(I)I
     112: invokevirtual #123                // Method android/view/View.measure:(II)V
     115: aload_0
     116: getfield      #130                // Field e:Lde/blox/graphview/f;
     119: iload_1
     120: invokeinterface #332,  2          // InterfaceMethod de/blox/graphview/f.a:(I)Lde/blox/graphview/h;
     125: astore        8
     127: aload         10
     129: invokevirtual #252                // Method android/view/View.getMeasuredWidth:()I
     132: istore        7
     134: aload         10
     136: invokevirtual #255                // Method android/view/View.getMeasuredHeight:()I
     139: istore        6
     141: aload         8
     143: iload         7
     145: iload         6
     147: invokevirtual #336                // Method de/blox/graphview/h.a:(II)V
     150: iload         4
     152: iload         7
     154: invokestatic  #274                // Method java/lang/Math.max:(II)I
     157: istore        4
     159: iload_3
     160: iload         6
     162: invokestatic  #274                // Method java/lang/Math.max:(II)I
     165: istore_3
     166: iload_2
     167: iload         6
     169: invokestatic  #277                // Method java/lang/Math.min:(II)I
     172: istore_2
     173: iload_1
     174: iconst_1
     175: iadd
     176: istore_1
     177: goto          27
     180: aload_0
     181: iload         4
     183: putfield      #112                // Field f:I
     186: aload_0
     187: iload_3
     188: putfield      #120                // Field g:I
     191: aload_0
     192: getfield      #110                // Field d:Z
     195: ifeq          325
     198: aload_0
     199: invokevirtual #324                // Method removeAllViewsInLayout:()V
     202: iload         5
     204: istore_1
     205: iload_1
     206: aload_0
     207: getfield      #130                // Field e:Lde/blox/graphview/f;
     210: invokeinterface #243,  1          // InterfaceMethod de/blox/graphview/f.getCount:()I
     215: if_icmpge     325
     218: aload_0
     219: getfield      #130                // Field e:Lde/blox/graphview/f;
     222: iload_1
     223: aconst_null
     224: aload_0
     225: invokeinterface #247,  4          // InterfaceMethod de/blox/graphview/f.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
     230: astore        10
     232: aload         10
     234: invokevirtual #90                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     237: astore        9
     239: aload         9
     241: astore        8
     243: aload         9
     245: ifnonnull     261
     248: new           #92                 // class android/view/ViewGroup$LayoutParams
     251: dup
     252: bipush        -2
     254: bipush        -2
     256: invokespecial #95                 // Method android/view/ViewGroup$LayoutParams."<init>":(II)V
     259: astore        8
     261: aload_0
     262: aload         10
     264: iconst_m1
     265: aload         8
     267: iconst_1
     268: invokevirtual #99                 // Method addViewInLayout:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z
     271: pop
     272: aload         10
     274: aload_0
     275: getfield      #112                // Field f:I
     278: ldc           #113                // int 1073741824
     280: invokestatic  #118                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     283: aload_0
     284: getfield      #120                // Field g:I
     287: ldc           #113                // int 1073741824
     289: invokestatic  #118                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     292: invokevirtual #123                // Method android/view/View.measure:(II)V
     295: aload_0
     296: getfield      #130                // Field e:Lde/blox/graphview/f;
     299: iload_1
     300: invokeinterface #332,  2          // InterfaceMethod de/blox/graphview/f.a:(I)Lde/blox/graphview/h;
     305: aload         10
     307: invokevirtual #252                // Method android/view/View.getMeasuredWidth:()I
     310: aload         10
     312: invokevirtual #255                // Method android/view/View.getMeasuredHeight:()I
     315: invokevirtual #336                // Method de/blox/graphview/h.a:(II)V
     318: iload_1
     319: iconst_1
     320: iadd
     321: istore_1
     322: goto          205
     325: aload_0
     326: getfield      #130                // Field e:Lde/blox/graphview/f;
     329: invokeinterface #338,  1          // InterfaceMethod de/blox/graphview/f.a:()V
     334: aload_0
     335: getfield      #130                // Field e:Lde/blox/graphview/f;
     338: invokeinterface #306,  1          // InterfaceMethod de/blox/graphview/f.b:()Lde/blox/graphview/a;
     343: invokeinterface #341,  1          // InterfaceMethod de/blox/graphview/a.a:()Lde/blox/graphview/k;
     348: astore        8
     350: aload_0
     351: aload         8
     353: invokevirtual #345                // Method de/blox/graphview/k.a:()I
     356: aload         8
     358: invokevirtual #347                // Method de/blox/graphview/k.b:()I
     361: invokevirtual #350                // Method setMeasuredDimension:(II)V
     364: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #85                 // Field j:Landroid/view/GestureDetector;
       4: aload_1
       5: invokevirtual #354                // Method android/view/GestureDetector.onTouchEvent:(Landroid/view/MotionEvent;)Z
       8: ifne          24
      11: aload_0
      12: aload_1
      13: invokespecial #355                // Method android/widget/AdapterView.onTouchEvent:(Landroid/view/MotionEvent;)Z
      16: ifeq          22
      19: goto          24
      22: iconst_0
      23: ireturn
      24: iconst_1
      25: ireturn

  public void setAdapter(android.widget.Adapter);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #132                // class de/blox/graphview/f
       5: invokevirtual #359                // Method a:(Lde/blox/graphview/f;)V
       8: return

  public void setSelection(int);
    Code:
       0: return
}
