class android.support.v7.widget.bh$c extends android.widget.LinearLayout {
  final android.support.v7.widget.bh a;

  public android.support.v7.widget.bh$c(android.support.v7.widget.bh, android.content.Context, android.support.v7.app.a$c, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field a:Landroid/support/v7/widget/bh;
       5: aload_0
       6: aload_2
       7: aconst_null
       8: getstatic     #28                 // Field android/support/v7/a/a$a.actionBarTabStyle:I
      11: invokespecial #31                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      14: aload_0
      15: iconst_1
      16: newarray       int
      18: dup
      19: iconst_0
      20: ldc           #32                 // int 16842964
      22: iastore
      23: putfield      #34                 // Field b:[I
      26: aload_0
      27: aload_3
      28: putfield      #36                 // Field c:Landroid/support/v7/app/a$c;
      31: aload_2
      32: aconst_null
      33: aload_0
      34: getfield      #34                 // Field b:[I
      37: getstatic     #28                 // Field android/support/v7/a/a$a.actionBarTabStyle:I
      40: iconst_0
      41: invokestatic  #41                 // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
      44: astore_1
      45: aload_1
      46: iconst_0
      47: invokevirtual #45                 // Method android/support/v7/widget/bp.g:(I)Z
      50: ifeq          62
      53: aload_0
      54: aload_1
      55: iconst_0
      56: invokevirtual #48                 // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
      59: invokevirtual #52                 // Method setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
      62: aload_1
      63: invokevirtual #55                 // Method android/support/v7/widget/bp.a:()V
      66: iload         4
      68: ifeq          77
      71: aload_0
      72: ldc           #56                 // int 8388627
      74: invokevirtual #60                 // Method setGravity:(I)V
      77: aload_0
      78: invokevirtual #61                 // Method a:()V
      81: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:Landroid/support/v7/app/a$c;
       4: astore_3
       5: aload_3
       6: invokevirtual #67                 // Method android/support/v7/app/a$c.c:()Landroid/view/View;
       9: astore        4
      11: aconst_null
      12: astore_2
      13: aload         4
      15: ifnull        95
      18: aload         4
      20: invokevirtual #73                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      23: astore_2
      24: aload_2
      25: aload_0
      26: if_acmpeq     48
      29: aload_2
      30: ifnull        42
      33: aload_2
      34: checkcast     #75                 // class android/view/ViewGroup
      37: aload         4
      39: invokevirtual #79                 // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
      42: aload_0
      43: aload         4
      45: invokevirtual #82                 // Method addView:(Landroid/view/View;)V
      48: aload_0
      49: aload         4
      51: putfield      #84                 // Field f:Landroid/view/View;
      54: aload_0
      55: getfield      #86                 // Field d:Landroid/widget/TextView;
      58: ifnull        70
      61: aload_0
      62: getfield      #86                 // Field d:Landroid/widget/TextView;
      65: bipush        8
      67: invokevirtual #91                 // Method android/widget/TextView.setVisibility:(I)V
      70: aload_0
      71: getfield      #93                 // Field e:Landroid/widget/ImageView;
      74: ifnull        398
      77: aload_0
      78: getfield      #93                 // Field e:Landroid/widget/ImageView;
      81: bipush        8
      83: invokevirtual #96                 // Method android/widget/ImageView.setVisibility:(I)V
      86: aload_0
      87: getfield      #93                 // Field e:Landroid/widget/ImageView;
      90: aconst_null
      91: invokevirtual #99                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      94: return
      95: aload_0
      96: getfield      #84                 // Field f:Landroid/view/View;
      99: ifnull        115
     102: aload_0
     103: aload_0
     104: getfield      #84                 // Field f:Landroid/view/View;
     107: invokevirtual #100                // Method removeView:(Landroid/view/View;)V
     110: aload_0
     111: aconst_null
     112: putfield      #84                 // Field f:Landroid/view/View;
     115: aload_3
     116: invokevirtual #103                // Method android/support/v7/app/a$c.a:()Landroid/graphics/drawable/Drawable;
     119: astore        5
     121: aload_3
     122: invokevirtual #106                // Method android/support/v7/app/a$c.b:()Ljava/lang/CharSequence;
     125: astore        4
     127: aload         5
     129: ifnull        212
     132: aload_0
     133: getfield      #93                 // Field e:Landroid/widget/ImageView;
     136: ifnonnull     192
     139: new           #108                // class android/support/v7/widget/r
     142: dup
     143: aload_0
     144: invokevirtual #112                // Method getContext:()Landroid/content/Context;
     147: invokespecial #115                // Method android/support/v7/widget/r."<init>":(Landroid/content/Context;)V
     150: astore        6
     152: new           #117                // class android/widget/LinearLayout$LayoutParams
     155: dup
     156: bipush        -2
     158: bipush        -2
     160: invokespecial #120                // Method android/widget/LinearLayout$LayoutParams."<init>":(II)V
     163: astore        7
     165: aload         7
     167: bipush        16
     169: putfield      #123                // Field android/widget/LinearLayout$LayoutParams.gravity:I
     172: aload         6
     174: aload         7
     176: invokevirtual #127                // Method android/widget/ImageView.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
     179: aload_0
     180: aload         6
     182: iconst_0
     183: invokevirtual #130                // Method addView:(Landroid/view/View;I)V
     186: aload_0
     187: aload         6
     189: putfield      #93                 // Field e:Landroid/widget/ImageView;
     192: aload_0
     193: getfield      #93                 // Field e:Landroid/widget/ImageView;
     196: aload         5
     198: invokevirtual #99                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
     201: aload_0
     202: getfield      #93                 // Field e:Landroid/widget/ImageView;
     205: iconst_0
     206: invokevirtual #96                 // Method android/widget/ImageView.setVisibility:(I)V
     209: goto          236
     212: aload_0
     213: getfield      #93                 // Field e:Landroid/widget/ImageView;
     216: ifnull        236
     219: aload_0
     220: getfield      #93                 // Field e:Landroid/widget/ImageView;
     223: bipush        8
     225: invokevirtual #96                 // Method android/widget/ImageView.setVisibility:(I)V
     228: aload_0
     229: getfield      #93                 // Field e:Landroid/widget/ImageView;
     232: aconst_null
     233: invokevirtual #99                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
     236: aload         4
     238: invokestatic  #136                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
     241: iconst_1
     242: ixor
     243: istore_1
     244: iload_1
     245: ifeq          339
     248: aload_0
     249: getfield      #86                 // Field d:Landroid/widget/TextView;
     252: ifnonnull     319
     255: new           #138                // class android/support/v7/widget/ac
     258: dup
     259: aload_0
     260: invokevirtual #112                // Method getContext:()Landroid/content/Context;
     263: aconst_null
     264: getstatic     #141                // Field android/support/v7/a/a$a.actionBarTabTextStyle:I
     267: invokespecial #142                // Method android/support/v7/widget/ac."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
     270: astore        5
     272: aload         5
     274: getstatic     #148                // Field android/text/TextUtils$TruncateAt.END:Landroid/text/TextUtils$TruncateAt;
     277: invokevirtual #152                // Method android/widget/TextView.setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V
     280: new           #117                // class android/widget/LinearLayout$LayoutParams
     283: dup
     284: bipush        -2
     286: bipush        -2
     288: invokespecial #120                // Method android/widget/LinearLayout$LayoutParams."<init>":(II)V
     291: astore        6
     293: aload         6
     295: bipush        16
     297: putfield      #123                // Field android/widget/LinearLayout$LayoutParams.gravity:I
     300: aload         5
     302: aload         6
     304: invokevirtual #153                // Method android/widget/TextView.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
     307: aload_0
     308: aload         5
     310: invokevirtual #82                 // Method addView:(Landroid/view/View;)V
     313: aload_0
     314: aload         5
     316: putfield      #86                 // Field d:Landroid/widget/TextView;
     319: aload_0
     320: getfield      #86                 // Field d:Landroid/widget/TextView;
     323: aload         4
     325: invokevirtual #157                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     328: aload_0
     329: getfield      #86                 // Field d:Landroid/widget/TextView;
     332: iconst_0
     333: invokevirtual #91                 // Method android/widget/TextView.setVisibility:(I)V
     336: goto          363
     339: aload_0
     340: getfield      #86                 // Field d:Landroid/widget/TextView;
     343: ifnull        363
     346: aload_0
     347: getfield      #86                 // Field d:Landroid/widget/TextView;
     350: bipush        8
     352: invokevirtual #91                 // Method android/widget/TextView.setVisibility:(I)V
     355: aload_0
     356: getfield      #86                 // Field d:Landroid/widget/TextView;
     359: aconst_null
     360: invokevirtual #157                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     363: aload_0
     364: getfield      #93                 // Field e:Landroid/widget/ImageView;
     367: ifnull        381
     370: aload_0
     371: getfield      #93                 // Field e:Landroid/widget/ImageView;
     374: aload_3
     375: invokevirtual #159                // Method android/support/v7/app/a$c.e:()Ljava/lang/CharSequence;
     378: invokevirtual #162                // Method android/widget/ImageView.setContentDescription:(Ljava/lang/CharSequence;)V
     381: iload_1
     382: ifeq          388
     385: goto          393
     388: aload_3
     389: invokevirtual #159                // Method android/support/v7/app/a$c.e:()Ljava/lang/CharSequence;
     392: astore_2
     393: aload_0
     394: aload_2
     395: invokestatic  #167                // Method android/support/v7/widget/br.a:(Landroid/view/View;Ljava/lang/CharSequence;)V
     398: return

  public void a(android.support.v7.app.a$c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #36                 // Field c:Landroid/support/v7/app/a$c;
       5: aload_0
       6: invokevirtual #61                 // Method a:()V
       9: return

  public android.support.v7.app.a$c b();
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:Landroid/support/v7/app/a$c;
       4: areturn

  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #173                // Method android/widget/LinearLayout.onInitializeAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V
       5: aload_1
       6: ldc           #64                 // class android/support/v7/app/a$c
       8: invokevirtual #179                // Method java/lang/Class.getName:()Ljava/lang/String;
      11: invokevirtual #184                // Method android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
      14: return

  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #188                // Method android/widget/LinearLayout.onInitializeAccessibilityNodeInfo:(Landroid/view/accessibility/AccessibilityNodeInfo;)V
       5: aload_1
       6: ldc           #64                 // class android/support/v7/app/a$c
       8: invokevirtual #179                // Method java/lang/Class.getName:()Ljava/lang/String;
      11: invokevirtual #191                // Method android/view/accessibility/AccessibilityNodeInfo.setClassName:(Ljava/lang/CharSequence;)V
      14: return

  public void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #194                // Method android/widget/LinearLayout.onMeasure:(II)V
       6: aload_0
       7: getfield      #22                 // Field a:Landroid/support/v7/widget/bh;
      10: getfield      #196                // Field android/support/v7/widget/bh.c:I
      13: ifle          47
      16: aload_0
      17: invokevirtual #200                // Method getMeasuredWidth:()I
      20: aload_0
      21: getfield      #22                 // Field a:Landroid/support/v7/widget/bh;
      24: getfield      #196                // Field android/support/v7/widget/bh.c:I
      27: if_icmple     47
      30: aload_0
      31: aload_0
      32: getfield      #22                 // Field a:Landroid/support/v7/widget/bh;
      35: getfield      #196                // Field android/support/v7/widget/bh.c:I
      38: ldc           #201                // int 1073741824
      40: invokestatic  #207                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      43: iload_2
      44: invokespecial #194                // Method android/widget/LinearLayout.onMeasure:(II)V
      47: return

  public void setSelected(boolean);
    Code:
       0: aload_0
       1: invokevirtual #213                // Method isSelected:()Z
       4: iload_1
       5: if_icmpeq     13
       8: iconst_1
       9: istore_2
      10: goto          15
      13: iconst_0
      14: istore_2
      15: aload_0
      16: iload_1
      17: invokespecial #215                // Method android/widget/LinearLayout.setSelected:(Z)V
      20: iload_2
      21: ifeq          33
      24: iload_1
      25: ifeq          33
      28: aload_0
      29: iconst_4
      30: invokevirtual #218                // Method sendAccessibilityEvent:(I)V
      33: return
}
