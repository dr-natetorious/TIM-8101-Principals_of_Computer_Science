public class android.support.v7.widget.ActionBarContextView extends android.support.v7.widget.a {
  public android.support.v7.widget.ActionBarContextView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #28                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.ActionBarContextView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #34                 // Field android/support/v7/a/a$a.actionModeStyle:I
       6: invokespecial #37                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.v7.widget.ActionBarContextView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #38                 // Method android/support/v7/widget/a."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_1
       8: aload_2
       9: getstatic     #44                 // Field android/support/v7/a/a$j.ActionMode:[I
      12: iload_3
      13: iconst_0
      14: invokestatic  #50                 // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
      17: astore_1
      18: aload_0
      19: aload_1
      20: getstatic     #53                 // Field android/support/v7/a/a$j.ActionMode_background:I
      23: invokevirtual #56                 // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
      26: invokestatic  #61                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
      29: aload_0
      30: aload_1
      31: getstatic     #64                 // Field android/support/v7/a/a$j.ActionMode_titleTextStyle:I
      34: iconst_0
      35: invokevirtual #67                 // Method android/support/v7/widget/bp.g:(II)I
      38: putfield      #69                 // Field n:I
      41: aload_0
      42: aload_1
      43: getstatic     #72                 // Field android/support/v7/a/a$j.ActionMode_subtitleTextStyle:I
      46: iconst_0
      47: invokevirtual #67                 // Method android/support/v7/widget/bp.g:(II)I
      50: putfield      #74                 // Field o:I
      53: aload_0
      54: aload_1
      55: getstatic     #77                 // Field android/support/v7/a/a$j.ActionMode_height:I
      58: iconst_0
      59: invokevirtual #80                 // Method android/support/v7/widget/bp.f:(II)I
      62: putfield      #83                 // Field e:I
      65: aload_0
      66: aload_1
      67: getstatic     #86                 // Field android/support/v7/a/a$j.ActionMode_closeItemLayout:I
      70: getstatic     #91                 // Field android/support/v7/a/a$g.abc_action_mode_close_item_material:I
      73: invokevirtual #67                 // Method android/support/v7/widget/bp.g:(II)I
      76: putfield      #93                 // Field q:I
      79: aload_1
      80: invokevirtual #96                 // Method android/support/v7/widget/bp.a:()V
      83: return

  public android.support.v4.view.x a(int, long);
    Code:
       0: aload_0
       1: iload_1
       2: lload_2
       3: invokespecial #176                // Method android/support/v7/widget/a.a:(IJ)Landroid/support/v4/view/x;
       6: areturn

  public void a(android.support.v7.view.b);
    Code:
       0: aload_0
       1: getfield      #179                // Field i:Landroid/view/View;
       4: ifnonnull     38
       7: aload_0
       8: aload_0
       9: invokevirtual #102                // Method getContext:()Landroid/content/Context;
      12: invokestatic  #108                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      15: aload_0
      16: getfield      #93                 // Field q:I
      19: aload_0
      20: iconst_0
      21: invokevirtual #182                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      24: putfield      #179                // Field i:Landroid/view/View;
      27: aload_0
      28: aload_0
      29: getfield      #179                // Field i:Landroid/view/View;
      32: invokevirtual #173                // Method addView:(Landroid/view/View;)V
      35: goto          51
      38: aload_0
      39: getfield      #179                // Field i:Landroid/view/View;
      42: invokevirtual #185                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      45: ifnonnull     51
      48: goto          27
      51: aload_0
      52: getfield      #179                // Field i:Landroid/view/View;
      55: getstatic     #188                // Field android/support/v7/a/a$f.action_mode_close_button:I
      58: invokevirtual #189                // Method android/view/View.findViewById:(I)Landroid/view/View;
      61: new           #6                  // class android/support/v7/widget/ActionBarContextView$1
      64: dup
      65: aload_0
      66: aload_1
      67: invokespecial #192                // Method android/support/v7/widget/ActionBarContextView$1."<init>":(Landroid/support/v7/widget/ActionBarContextView;Landroid/support/v7/view/b;)V
      70: invokevirtual #196                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      73: aload_1
      74: invokevirtual #202                // Method android/support/v7/view/b.b:()Landroid/view/Menu;
      77: checkcast     #204                // class android/support/v7/view/menu/h
      80: astore_1
      81: aload_0
      82: getfield      #208                // Field d:Landroid/support/v7/widget/d;
      85: ifnull        96
      88: aload_0
      89: getfield      #208                // Field d:Landroid/support/v7/widget/d;
      92: invokevirtual #213                // Method android/support/v7/widget/d.h:()Z
      95: pop
      96: aload_0
      97: new           #210                // class android/support/v7/widget/d
     100: dup
     101: aload_0
     102: invokevirtual #102                // Method getContext:()Landroid/content/Context;
     105: invokespecial #215                // Method android/support/v7/widget/d."<init>":(Landroid/content/Context;)V
     108: putfield      #208                // Field d:Landroid/support/v7/widget/d;
     111: aload_0
     112: getfield      #208                // Field d:Landroid/support/v7/widget/d;
     115: iconst_1
     116: invokevirtual #219                // Method android/support/v7/widget/d.c:(Z)V
     119: new           #221                // class android/view/ViewGroup$LayoutParams
     122: dup
     123: bipush        -2
     125: iconst_m1
     126: invokespecial #224                // Method android/view/ViewGroup$LayoutParams."<init>":(II)V
     129: astore_2
     130: aload_1
     131: aload_0
     132: getfield      #208                // Field d:Landroid/support/v7/widget/d;
     135: aload_0
     136: getfield      #227                // Field b:Landroid/content/Context;
     139: invokevirtual #230                // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/o;Landroid/content/Context;)V
     142: aload_0
     143: aload_0
     144: getfield      #208                // Field d:Landroid/support/v7/widget/d;
     147: aload_0
     148: invokevirtual #233                // Method android/support/v7/widget/d.a:(Landroid/view/ViewGroup;)Landroid/support/v7/view/menu/p;
     151: checkcast     #235                // class android/support/v7/widget/ActionMenuView
     154: putfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     157: aload_0
     158: getfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     161: aconst_null
     162: invokestatic  #61                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
     165: aload_0
     166: aload_0
     167: getfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     170: aload_2
     171: invokevirtual #241                // Method addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
     174: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #208                // Field d:Landroid/support/v7/widget/d;
       4: ifnull        15
       7: aload_0
       8: getfield      #208                // Field d:Landroid/support/v7/widget/d;
      11: invokevirtual #243                // Method android/support/v7/widget/d.f:()Z
      14: ireturn
      15: iconst_0
      16: ireturn

  public void b();
    Code:
       0: aload_0
       1: getfield      #179                // Field i:Landroid/view/View;
       4: ifnonnull     11
       7: aload_0
       8: invokevirtual #245                // Method c:()V
      11: return

  public void c();
    Code:
       0: aload_0
       1: invokevirtual #248                // Method removeAllViews:()V
       4: aload_0
       5: aconst_null
       6: putfield      #250                // Field j:Landroid/view/View;
       9: aload_0
      10: aconst_null
      11: putfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
      14: return

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #252                // Field p:Z
       4: ireturn

  protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams();
    Code:
       0: new           #256                // class android/view/ViewGroup$MarginLayoutParams
       3: dup
       4: iconst_m1
       5: bipush        -2
       7: invokespecial #257                // Method android/view/ViewGroup$MarginLayoutParams."<init>":(II)V
      10: areturn

  public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: new           #256                // class android/view/ViewGroup$MarginLayoutParams
       3: dup
       4: aload_0
       5: invokevirtual #102                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: invokespecial #260                // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
      12: areturn

  public int getAnimatedVisibility();
    Code:
       0: aload_0
       1: invokespecial #263                // Method android/support/v7/widget/a.getAnimatedVisibility:()I
       4: ireturn

  public int getContentHeight();
    Code:
       0: aload_0
       1: invokespecial #266                // Method android/support/v7/widget/a.getContentHeight:()I
       4: ireturn

  public java.lang.CharSequence getSubtitle();
    Code:
       0: aload_0
       1: getfield      #154                // Field h:Ljava/lang/CharSequence;
       4: areturn

  public java.lang.CharSequence getTitle();
    Code:
       0: aload_0
       1: getfield      #148                // Field g:Ljava/lang/CharSequence;
       4: areturn

  public void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #272                // Method android/support/v7/widget/a.onDetachedFromWindow:()V
       4: aload_0
       5: getfield      #208                // Field d:Landroid/support/v7/widget/d;
       8: ifnull        27
      11: aload_0
      12: getfield      #208                // Field d:Landroid/support/v7/widget/d;
      15: invokevirtual #274                // Method android/support/v7/widget/d.g:()Z
      18: pop
      19: aload_0
      20: getfield      #208                // Field d:Landroid/support/v7/widget/d;
      23: invokevirtual #276                // Method android/support/v7/widget/d.i:()Z
      26: pop
      27: return

  public boolean onHoverEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #280                // Method android/support/v7/widget/a.onHoverEvent:(Landroid/view/MotionEvent;)Z
       5: ireturn

  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_1
       1: invokevirtual #287                // Method android/view/accessibility/AccessibilityEvent.getEventType:()I
       4: bipush        32
       6: if_icmpne     45
       9: aload_1
      10: aload_0
      11: invokevirtual #290                // Method android/view/accessibility/AccessibilityEvent.setSource:(Landroid/view/View;)V
      14: aload_1
      15: aload_0
      16: invokevirtual #296                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      19: invokevirtual #302                // Method java/lang/Class.getName:()Ljava/lang/String;
      22: invokevirtual #305                // Method android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
      25: aload_1
      26: aload_0
      27: invokevirtual #102                // Method getContext:()Landroid/content/Context;
      30: invokevirtual #310                // Method android/content/Context.getPackageName:()Ljava/lang/String;
      33: invokevirtual #313                // Method android/view/accessibility/AccessibilityEvent.setPackageName:(Ljava/lang/CharSequence;)V
      36: aload_1
      37: aload_0
      38: getfield      #148                // Field g:Ljava/lang/CharSequence;
      41: invokevirtual #316                // Method android/view/accessibility/AccessibilityEvent.setContentDescription:(Ljava/lang/CharSequence;)V
      44: return
      45: aload_0
      46: aload_1
      47: invokespecial #318                // Method android/support/v7/widget/a.onInitializeAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V
      50: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: invokestatic  #325                // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
       4: istore_1
       5: iload_1
       6: ifeq          23
       9: iload         4
      11: iload_2
      12: isub
      13: aload_0
      14: invokevirtual #328                // Method getPaddingRight:()I
      17: isub
      18: istore        6
      20: goto          29
      23: aload_0
      24: invokevirtual #331                // Method getPaddingLeft:()I
      27: istore        6
      29: aload_0
      30: invokevirtual #334                // Method getPaddingTop:()I
      33: istore        7
      35: iload         5
      37: iload_3
      38: isub
      39: aload_0
      40: invokevirtual #334                // Method getPaddingTop:()I
      43: isub
      44: aload_0
      45: invokevirtual #337                // Method getPaddingBottom:()I
      48: isub
      49: istore        8
      51: aload_0
      52: getfield      #179                // Field i:Landroid/view/View;
      55: ifnull        156
      58: aload_0
      59: getfield      #179                // Field i:Landroid/view/View;
      62: invokevirtual #340                // Method android/view/View.getVisibility:()I
      65: bipush        8
      67: if_icmpeq     156
      70: aload_0
      71: getfield      #179                // Field i:Landroid/view/View;
      74: invokevirtual #343                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      77: checkcast     #256                // class android/view/ViewGroup$MarginLayoutParams
      80: astore        9
      82: iload_1
      83: ifeq          95
      86: aload         9
      88: getfield      #346                // Field android/view/ViewGroup$MarginLayoutParams.rightMargin:I
      91: istore_3
      92: goto          101
      95: aload         9
      97: getfield      #349                // Field android/view/ViewGroup$MarginLayoutParams.leftMargin:I
     100: istore_3
     101: iload_1
     102: ifeq          115
     105: aload         9
     107: getfield      #349                // Field android/view/ViewGroup$MarginLayoutParams.leftMargin:I
     110: istore        5
     112: goto          122
     115: aload         9
     117: getfield      #346                // Field android/view/ViewGroup$MarginLayoutParams.rightMargin:I
     120: istore        5
     122: iload         6
     124: iload_3
     125: iload_1
     126: invokestatic  #352                // Method a:(IIZ)I
     129: istore_3
     130: iload_3
     131: aload_0
     132: aload_0
     133: getfield      #179                // Field i:Landroid/view/View;
     136: iload_3
     137: iload         7
     139: iload         8
     141: iload_1
     142: invokevirtual #355                // Method a:(Landroid/view/View;IIIZ)I
     145: iadd
     146: iload         5
     148: iload_1
     149: invokestatic  #352                // Method a:(IIZ)I
     152: istore_3
     153: goto          159
     156: iload         6
     158: istore_3
     159: iload_3
     160: istore        5
     162: aload_0
     163: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     166: ifnull        212
     169: iload_3
     170: istore        5
     172: aload_0
     173: getfield      #250                // Field j:Landroid/view/View;
     176: ifnonnull     212
     179: iload_3
     180: istore        5
     182: aload_0
     183: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     186: invokevirtual #356                // Method android/widget/LinearLayout.getVisibility:()I
     189: bipush        8
     191: if_icmpeq     212
     194: iload_3
     195: aload_0
     196: aload_0
     197: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     200: iload_3
     201: iload         7
     203: iload         8
     205: iload_1
     206: invokevirtual #355                // Method a:(Landroid/view/View;IIIZ)I
     209: iadd
     210: istore        5
     212: aload_0
     213: getfield      #250                // Field j:Landroid/view/View;
     216: ifnull        235
     219: aload_0
     220: aload_0
     221: getfield      #250                // Field j:Landroid/view/View;
     224: iload         5
     226: iload         7
     228: iload         8
     230: iload_1
     231: invokevirtual #355                // Method a:(Landroid/view/View;IIIZ)I
     234: pop
     235: iload_1
     236: ifeq          247
     239: aload_0
     240: invokevirtual #331                // Method getPaddingLeft:()I
     243: istore_2
     244: goto          257
     247: iload         4
     249: iload_2
     250: isub
     251: aload_0
     252: invokevirtual #328                // Method getPaddingRight:()I
     255: isub
     256: istore_2
     257: aload_0
     258: getfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     261: ifnull        281
     264: aload_0
     265: aload_0
     266: getfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     269: iload_2
     270: iload         7
     272: iload         8
     274: iload_1
     275: iconst_1
     276: ixor
     277: invokevirtual #355                // Method a:(Landroid/view/View;IIIZ)I
     280: pop
     281: return

  protected void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #363                // Method android/view/View$MeasureSpec.getMode:(I)I
       4: istore_3
       5: ldc_w         #364                // int 1073741824
       8: istore        5
      10: iload_3
      11: ldc_w         #364                // int 1073741824
      14: if_icmpeq     70
      17: new           #366                // class java/lang/StringBuilder
      20: dup
      21: invokespecial #368                // Method java/lang/StringBuilder."<init>":()V
      24: astore        11
      26: aload         11
      28: aload_0
      29: invokevirtual #296                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      32: invokevirtual #371                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      35: invokevirtual #375                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: aload         11
      41: ldc_w         #377                // String  can only be used
      44: invokevirtual #375                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      47: pop
      48: aload         11
      50: ldc_w         #379                // String with android:layout_width=\"match_parent\" (or fill_parent)
      53: invokevirtual #375                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      56: pop
      57: new           #381                // class java/lang/IllegalStateException
      60: dup
      61: aload         11
      63: invokevirtual #384                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      66: invokespecial #387                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      69: athrow
      70: iload_2
      71: invokestatic  #363                // Method android/view/View$MeasureSpec.getMode:(I)I
      74: ifne          130
      77: new           #366                // class java/lang/StringBuilder
      80: dup
      81: invokespecial #368                // Method java/lang/StringBuilder."<init>":()V
      84: astore        11
      86: aload         11
      88: aload_0
      89: invokevirtual #296                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      92: invokevirtual #371                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      95: invokevirtual #375                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      98: pop
      99: aload         11
     101: ldc_w         #377                // String  can only be used
     104: invokevirtual #375                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     107: pop
     108: aload         11
     110: ldc_w         #389                // String with android:layout_height=\"wrap_content\"
     113: invokevirtual #375                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     116: pop
     117: new           #381                // class java/lang/IllegalStateException
     120: dup
     121: aload         11
     123: invokevirtual #384                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     126: invokespecial #387                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     129: athrow
     130: iload_1
     131: invokestatic  #392                // Method android/view/View$MeasureSpec.getSize:(I)I
     134: istore        8
     136: aload_0
     137: getfield      #83                 // Field e:I
     140: ifle          151
     143: aload_0
     144: getfield      #83                 // Field e:I
     147: istore_3
     148: goto          156
     151: iload_2
     152: invokestatic  #392                // Method android/view/View$MeasureSpec.getSize:(I)I
     155: istore_3
     156: aload_0
     157: invokevirtual #334                // Method getPaddingTop:()I
     160: aload_0
     161: invokevirtual #337                // Method getPaddingBottom:()I
     164: iadd
     165: istore        9
     167: iload         8
     169: aload_0
     170: invokevirtual #331                // Method getPaddingLeft:()I
     173: isub
     174: aload_0
     175: invokevirtual #328                // Method getPaddingRight:()I
     178: isub
     179: istore_1
     180: iload_3
     181: iload         9
     183: isub
     184: istore        7
     186: iload         7
     188: ldc_w         #393                // int -2147483648
     191: invokestatic  #396                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     194: istore        4
     196: aload_0
     197: getfield      #179                // Field i:Landroid/view/View;
     200: astore        11
     202: iconst_0
     203: istore        6
     205: iload_1
     206: istore_2
     207: aload         11
     209: ifnull        251
     212: aload_0
     213: aload_0
     214: getfield      #179                // Field i:Landroid/view/View;
     217: iload_1
     218: iload         4
     220: iconst_0
     221: invokevirtual #399                // Method a:(Landroid/view/View;III)I
     224: istore_1
     225: aload_0
     226: getfield      #179                // Field i:Landroid/view/View;
     229: invokevirtual #343                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     232: checkcast     #256                // class android/view/ViewGroup$MarginLayoutParams
     235: astore        11
     237: iload_1
     238: aload         11
     240: getfield      #349                // Field android/view/ViewGroup$MarginLayoutParams.leftMargin:I
     243: aload         11
     245: getfield      #346                // Field android/view/ViewGroup$MarginLayoutParams.rightMargin:I
     248: iadd
     249: isub
     250: istore_2
     251: iload_2
     252: istore_1
     253: aload_0
     254: getfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     257: ifnull        286
     260: iload_2
     261: istore_1
     262: aload_0
     263: getfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     266: invokevirtual #400                // Method android/support/v7/widget/ActionMenuView.getParent:()Landroid/view/ViewParent;
     269: aload_0
     270: if_acmpne     286
     273: aload_0
     274: aload_0
     275: getfield      #238                // Field c:Landroid/support/v7/widget/ActionMenuView;
     278: iload_2
     279: iload         4
     281: iconst_0
     282: invokevirtual #399                // Method a:(Landroid/view/View;III)I
     285: istore_1
     286: iload_1
     287: istore_2
     288: aload_0
     289: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     292: ifnull        404
     295: iload_1
     296: istore_2
     297: aload_0
     298: getfield      #250                // Field j:Landroid/view/View;
     301: ifnonnull     404
     304: aload_0
     305: getfield      #252                // Field p:Z
     308: ifeq          391
     311: iconst_0
     312: iconst_0
     313: invokestatic  #396                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     316: istore_2
     317: aload_0
     318: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     321: iload_2
     322: iload         4
     324: invokevirtual #403                // Method android/widget/LinearLayout.measure:(II)V
     327: aload_0
     328: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     331: invokevirtual #406                // Method android/widget/LinearLayout.getMeasuredWidth:()I
     334: istore        10
     336: iload         10
     338: iload_1
     339: if_icmpgt     348
     342: iconst_1
     343: istore        4
     345: goto          351
     348: iconst_0
     349: istore        4
     351: iload_1
     352: istore_2
     353: iload         4
     355: ifeq          363
     358: iload_1
     359: iload         10
     361: isub
     362: istore_2
     363: aload_0
     364: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     367: astore        11
     369: iload         4
     371: ifeq          379
     374: iconst_0
     375: istore_1
     376: goto          382
     379: bipush        8
     381: istore_1
     382: aload         11
     384: iload_1
     385: invokevirtual #165                // Method android/widget/LinearLayout.setVisibility:(I)V
     388: goto          404
     391: aload_0
     392: aload_0
     393: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
     396: iload_1
     397: iload         4
     399: iconst_0
     400: invokevirtual #399                // Method a:(Landroid/view/View;III)I
     403: istore_2
     404: aload_0
     405: getfield      #250                // Field j:Landroid/view/View;
     408: ifnull        526
     411: aload_0
     412: getfield      #250                // Field j:Landroid/view/View;
     415: invokevirtual #343                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     418: astore        11
     420: aload         11
     422: getfield      #409                // Field android/view/ViewGroup$LayoutParams.width:I
     425: bipush        -2
     427: if_icmpeq     437
     430: ldc_w         #364                // int 1073741824
     433: istore_1
     434: goto          441
     437: ldc_w         #393                // int -2147483648
     440: istore_1
     441: iload_2
     442: istore        4
     444: aload         11
     446: getfield      #409                // Field android/view/ViewGroup$LayoutParams.width:I
     449: iflt          463
     452: aload         11
     454: getfield      #409                // Field android/view/ViewGroup$LayoutParams.width:I
     457: iload_2
     458: invokestatic  #414                // Method java/lang/Math.min:(II)I
     461: istore        4
     463: aload         11
     465: getfield      #417                // Field android/view/ViewGroup$LayoutParams.height:I
     468: bipush        -2
     470: if_icmpeq     479
     473: iload         5
     475: istore_2
     476: goto          483
     479: ldc_w         #393                // int -2147483648
     482: istore_2
     483: iload         7
     485: istore        5
     487: aload         11
     489: getfield      #417                // Field android/view/ViewGroup$LayoutParams.height:I
     492: iflt          507
     495: aload         11
     497: getfield      #417                // Field android/view/ViewGroup$LayoutParams.height:I
     500: iload         7
     502: invokestatic  #414                // Method java/lang/Math.min:(II)I
     505: istore        5
     507: aload_0
     508: getfield      #250                // Field j:Landroid/view/View;
     511: iload         4
     513: iload_1
     514: invokestatic  #396                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     517: iload         5
     519: iload_2
     520: invokestatic  #396                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     523: invokevirtual #418                // Method android/view/View.measure:(II)V
     526: aload_0
     527: getfield      #83                 // Field e:I
     530: ifgt          591
     533: aload_0
     534: invokevirtual #119                // Method getChildCount:()I
     537: istore        5
     539: iconst_0
     540: istore_2
     541: iload         6
     543: istore_1
     544: iload_1
     545: iload         5
     547: if_icmpge     583
     550: aload_0
     551: iload_1
     552: invokevirtual #123                // Method getChildAt:(I)Landroid/view/View;
     555: invokevirtual #421                // Method android/view/View.getMeasuredHeight:()I
     558: iload         9
     560: iadd
     561: istore        4
     563: iload_2
     564: istore_3
     565: iload         4
     567: iload_2
     568: if_icmple     574
     571: iload         4
     573: istore_3
     574: iload_1
     575: iconst_1
     576: iadd
     577: istore_1
     578: iload_3
     579: istore_2
     580: goto          544
     583: aload_0
     584: iload         8
     586: iload_2
     587: invokevirtual #424                // Method setMeasuredDimension:(II)V
     590: return
     591: aload_0
     592: iload         8
     594: iload_3
     595: invokevirtual #424                // Method setMeasuredDimension:(II)V
     598: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #427                // Method android/support/v7/widget/a.onTouchEvent:(Landroid/view/MotionEvent;)Z
       5: ireturn

  public void setContentHeight(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #83                 // Field e:I
       5: return

  public void setCustomView(android.view.View);
    Code:
       0: aload_0
       1: getfield      #250                // Field j:Landroid/view/View;
       4: ifnull        15
       7: aload_0
       8: aload_0
       9: getfield      #250                // Field j:Landroid/view/View;
      12: invokevirtual #432                // Method removeView:(Landroid/view/View;)V
      15: aload_0
      16: aload_1
      17: putfield      #250                // Field j:Landroid/view/View;
      20: aload_1
      21: ifnull        44
      24: aload_0
      25: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
      28: ifnull        44
      31: aload_0
      32: aload_0
      33: getfield      #98                 // Field k:Landroid/widget/LinearLayout;
      36: invokevirtual #432                // Method removeView:(Landroid/view/View;)V
      39: aload_0
      40: aconst_null
      41: putfield      #98                 // Field k:Landroid/widget/LinearLayout;
      44: aload_1
      45: ifnull        53
      48: aload_0
      49: aload_1
      50: invokevirtual #173                // Method addView:(Landroid/view/View;)V
      53: aload_0
      54: invokevirtual #435                // Method requestLayout:()V
      57: return

  public void setSubtitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #154                // Field h:Ljava/lang/CharSequence;
       5: aload_0
       6: invokespecial #438                // Method e:()V
       9: return

  public void setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #148                // Field g:Ljava/lang/CharSequence;
       5: aload_0
       6: invokespecial #438                // Method e:()V
       9: return

  public void setTitleOptional(boolean);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #252                // Field p:Z
       5: if_icmpeq     12
       8: aload_0
       9: invokevirtual #435                // Method requestLayout:()V
      12: aload_0
      13: iload_1
      14: putfield      #252                // Field p:Z
      17: return

  public void setVisibility(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #441                // Method android/support/v7/widget/a.setVisibility:(I)V
       5: return

  public boolean shouldDelayChildPressedState();
    Code:
       0: iconst_0
       1: ireturn
}
