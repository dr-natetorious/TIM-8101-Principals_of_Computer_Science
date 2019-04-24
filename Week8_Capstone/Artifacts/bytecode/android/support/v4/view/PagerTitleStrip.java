public class android.support.v4.view.PagerTitleStrip extends android.view.ViewGroup {
  android.support.v4.view.v a;

  android.widget.TextView b;

  android.widget.TextView c;

  android.widget.TextView d;

  float e;

  int f;

  static {};
    Code:
       0: iconst_4
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #37                 // int 16842804
       7: iastore
       8: dup
       9: iconst_1
      10: ldc           #38                 // int 16842901
      12: iastore
      13: dup
      14: iconst_2
      15: ldc           #39                 // int 16842904
      17: iastore
      18: dup
      19: iconst_3
      20: ldc           #40                 // int 16842927
      22: iastore
      23: putstatic     #42                 // Field n:[I
      26: iconst_1
      27: newarray       int
      29: dup
      30: iconst_0
      31: ldc           #43                 // int 16843660
      33: iastore
      34: putstatic     #45                 // Field o:[I
      37: return

  public android.support.v4.view.PagerTitleStrip(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #51                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v4.view.PagerTitleStrip(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #52                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_m1
       8: putfield      #54                 // Field g:I
      11: aload_0
      12: ldc           #55                 // float -1.0f
      14: putfield      #57                 // Field e:F
      17: aload_0
      18: new           #6                  // class android/support/v4/view/PagerTitleStrip$a
      21: dup
      22: aload_0
      23: invokespecial #60                 // Method android/support/v4/view/PagerTitleStrip$a."<init>":(Landroid/support/v4/view/PagerTitleStrip;)V
      26: putfield      #62                 // Field l:Landroid/support/v4/view/PagerTitleStrip$a;
      29: new           #64                 // class android/widget/TextView
      32: dup
      33: aload_1
      34: invokespecial #66                 // Method android/widget/TextView."<init>":(Landroid/content/Context;)V
      37: astore        6
      39: aload_0
      40: aload         6
      42: putfield      #68                 // Field b:Landroid/widget/TextView;
      45: aload_0
      46: aload         6
      48: invokevirtual #72                 // Method addView:(Landroid/view/View;)V
      51: new           #64                 // class android/widget/TextView
      54: dup
      55: aload_1
      56: invokespecial #66                 // Method android/widget/TextView."<init>":(Landroid/content/Context;)V
      59: astore        6
      61: aload_0
      62: aload         6
      64: putfield      #74                 // Field c:Landroid/widget/TextView;
      67: aload_0
      68: aload         6
      70: invokevirtual #72                 // Method addView:(Landroid/view/View;)V
      73: new           #64                 // class android/widget/TextView
      76: dup
      77: aload_1
      78: invokespecial #66                 // Method android/widget/TextView."<init>":(Landroid/content/Context;)V
      81: astore        6
      83: aload_0
      84: aload         6
      86: putfield      #76                 // Field d:Landroid/widget/TextView;
      89: aload_0
      90: aload         6
      92: invokevirtual #72                 // Method addView:(Landroid/view/View;)V
      95: aload_1
      96: aload_2
      97: getstatic     #42                 // Field n:[I
     100: invokevirtual #82                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
     103: astore_2
     104: iconst_0
     105: istore        5
     107: aload_2
     108: iconst_0
     109: iconst_0
     110: invokevirtual #88                 // Method android/content/res/TypedArray.getResourceId:(II)I
     113: istore_3
     114: iload_3
     115: ifeq          142
     118: aload_0
     119: getfield      #68                 // Field b:Landroid/widget/TextView;
     122: iload_3
     123: invokestatic  #93                 // Method android/support/v4/widget/m.a:(Landroid/widget/TextView;I)V
     126: aload_0
     127: getfield      #74                 // Field c:Landroid/widget/TextView;
     130: iload_3
     131: invokestatic  #93                 // Method android/support/v4/widget/m.a:(Landroid/widget/TextView;I)V
     134: aload_0
     135: getfield      #76                 // Field d:Landroid/widget/TextView;
     138: iload_3
     139: invokestatic  #93                 // Method android/support/v4/widget/m.a:(Landroid/widget/TextView;I)V
     142: aload_2
     143: iconst_1
     144: iconst_0
     145: invokevirtual #96                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     148: istore        4
     150: iload         4
     152: ifeq          163
     155: aload_0
     156: iconst_0
     157: iload         4
     159: i2f
     160: invokevirtual #99                 // Method a:(IF)V
     163: aload_2
     164: iconst_2
     165: invokevirtual #103                // Method android/content/res/TypedArray.hasValue:(I)Z
     168: ifeq          206
     171: aload_2
     172: iconst_2
     173: iconst_0
     174: invokevirtual #106                // Method android/content/res/TypedArray.getColor:(II)I
     177: istore        4
     179: aload_0
     180: getfield      #68                 // Field b:Landroid/widget/TextView;
     183: iload         4
     185: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
     188: aload_0
     189: getfield      #74                 // Field c:Landroid/widget/TextView;
     192: iload         4
     194: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
     197: aload_0
     198: getfield      #76                 // Field d:Landroid/widget/TextView;
     201: iload         4
     203: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
     206: aload_0
     207: aload_2
     208: iconst_3
     209: bipush        80
     211: invokevirtual #113                // Method android/content/res/TypedArray.getInteger:(II)I
     214: putfield      #115                // Field i:I
     217: aload_2
     218: invokevirtual #118                // Method android/content/res/TypedArray.recycle:()V
     221: aload_0
     222: aload_0
     223: getfield      #74                 // Field c:Landroid/widget/TextView;
     226: invokevirtual #122                // Method android/widget/TextView.getTextColors:()Landroid/content/res/ColorStateList;
     229: invokevirtual #128                // Method android/content/res/ColorStateList.getDefaultColor:()I
     232: putfield      #130                // Field f:I
     235: aload_0
     236: ldc           #131                // float 0.6f
     238: invokevirtual #135                // Method setNonPrimaryAlpha:(F)V
     241: aload_0
     242: getfield      #68                 // Field b:Landroid/widget/TextView;
     245: getstatic     #141                // Field android/text/TextUtils$TruncateAt.END:Landroid/text/TextUtils$TruncateAt;
     248: invokevirtual #145                // Method android/widget/TextView.setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V
     251: aload_0
     252: getfield      #74                 // Field c:Landroid/widget/TextView;
     255: getstatic     #141                // Field android/text/TextUtils$TruncateAt.END:Landroid/text/TextUtils$TruncateAt;
     258: invokevirtual #145                // Method android/widget/TextView.setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V
     261: aload_0
     262: getfield      #76                 // Field d:Landroid/widget/TextView;
     265: getstatic     #141                // Field android/text/TextUtils$TruncateAt.END:Landroid/text/TextUtils$TruncateAt;
     268: invokevirtual #145                // Method android/widget/TextView.setEllipsize:(Landroid/text/TextUtils$TruncateAt;)V
     271: iload_3
     272: ifeq          296
     275: aload_1
     276: iload_3
     277: getstatic     #45                 // Field o:[I
     280: invokevirtual #148                // Method android/content/Context.obtainStyledAttributes:(I[I)Landroid/content/res/TypedArray;
     283: astore_2
     284: aload_2
     285: iconst_0
     286: iconst_0
     287: invokevirtual #152                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     290: istore        5
     292: aload_2
     293: invokevirtual #118                // Method android/content/res/TypedArray.recycle:()V
     296: iload         5
     298: ifeq          325
     301: aload_0
     302: getfield      #68                 // Field b:Landroid/widget/TextView;
     305: invokestatic  #156                // Method setSingleLineAllCaps:(Landroid/widget/TextView;)V
     308: aload_0
     309: getfield      #74                 // Field c:Landroid/widget/TextView;
     312: invokestatic  #156                // Method setSingleLineAllCaps:(Landroid/widget/TextView;)V
     315: aload_0
     316: getfield      #76                 // Field d:Landroid/widget/TextView;
     319: invokestatic  #156                // Method setSingleLineAllCaps:(Landroid/widget/TextView;)V
     322: goto          346
     325: aload_0
     326: getfield      #68                 // Field b:Landroid/widget/TextView;
     329: invokevirtual #159                // Method android/widget/TextView.setSingleLine:()V
     332: aload_0
     333: getfield      #74                 // Field c:Landroid/widget/TextView;
     336: invokevirtual #159                // Method android/widget/TextView.setSingleLine:()V
     339: aload_0
     340: getfield      #76                 // Field d:Landroid/widget/TextView;
     343: invokevirtual #159                // Method android/widget/TextView.setSingleLine:()V
     346: aload_0
     347: aload_1
     348: invokevirtual #163                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
     351: invokevirtual #169                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
     354: getfield      #174                // Field android/util/DisplayMetrics.density:F
     357: ldc           #175                // float 16.0f
     359: fmul
     360: f2i
     361: putfield      #177                // Field h:I
     364: return

  public void a(int, float);
    Code:
       0: aload_0
       1: getfield      #68                 // Field b:Landroid/widget/TextView;
       4: iload_1
       5: fload_2
       6: invokevirtual #189                // Method android/widget/TextView.setTextSize:(IF)V
       9: aload_0
      10: getfield      #74                 // Field c:Landroid/widget/TextView;
      13: iload_1
      14: fload_2
      15: invokevirtual #189                // Method android/widget/TextView.setTextSize:(IF)V
      18: aload_0
      19: getfield      #76                 // Field d:Landroid/widget/TextView;
      22: iload_1
      23: fload_2
      24: invokevirtual #189                // Method android/widget/TextView.setTextSize:(IF)V
      27: return

  void a(int, float, boolean);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #54                 // Field g:I
       5: if_icmpeq     23
       8: aload_0
       9: iload_1
      10: aload_0
      11: getfield      #192                // Field a:Landroid/support/v4/view/v;
      14: invokevirtual #198                // Method android/support/v4/view/v.getAdapter:()Landroid/support/v4/view/q;
      17: invokevirtual #201                // Method a:(ILandroid/support/v4/view/q;)V
      20: goto          37
      23: iload_3
      24: ifne          37
      27: fload_2
      28: aload_0
      29: getfield      #57                 // Field e:F
      32: fcmpl
      33: ifne          37
      36: return
      37: aload_0
      38: iconst_1
      39: putfield      #203                // Field k:Z
      42: aload_0
      43: getfield      #68                 // Field b:Landroid/widget/TextView;
      46: invokevirtual #206                // Method android/widget/TextView.getMeasuredWidth:()I
      49: istore        9
      51: aload_0
      52: getfield      #74                 // Field c:Landroid/widget/TextView;
      55: invokevirtual #206                // Method android/widget/TextView.getMeasuredWidth:()I
      58: istore        14
      60: aload_0
      61: getfield      #76                 // Field d:Landroid/widget/TextView;
      64: invokevirtual #206                // Method android/widget/TextView.getMeasuredWidth:()I
      67: istore        8
      69: iload         14
      71: iconst_2
      72: idiv
      73: istore        13
      75: aload_0
      76: invokevirtual #209                // Method getWidth:()I
      79: istore        10
      81: aload_0
      82: invokevirtual #212                // Method getHeight:()I
      85: istore        6
      87: aload_0
      88: invokevirtual #215                // Method getPaddingLeft:()I
      91: istore        12
      93: aload_0
      94: invokevirtual #218                // Method getPaddingRight:()I
      97: istore        11
      99: aload_0
     100: invokevirtual #221                // Method getPaddingTop:()I
     103: istore_1
     104: aload_0
     105: invokevirtual #224                // Method getPaddingBottom:()I
     108: istore        7
     110: iload         11
     112: iload         13
     114: iadd
     115: istore        15
     117: ldc           #225                // float 0.5f
     119: fload_2
     120: fadd
     121: fstore        5
     123: fload         5
     125: fstore        4
     127: fload         5
     129: fconst_1
     130: fcmpl
     131: ifle          140
     134: fload         5
     136: fconst_1
     137: fsub
     138: fstore        4
     140: iload         10
     142: iload         15
     144: isub
     145: iload         10
     147: iload         12
     149: iload         13
     151: iadd
     152: isub
     153: iload         15
     155: isub
     156: i2f
     157: fload         4
     159: fmul
     160: f2i
     161: isub
     162: iload         13
     164: isub
     165: istore        13
     167: iload         14
     169: iload         13
     171: iadd
     172: istore        14
     174: aload_0
     175: getfield      #68                 // Field b:Landroid/widget/TextView;
     178: invokevirtual #228                // Method android/widget/TextView.getBaseline:()I
     181: istore        17
     183: aload_0
     184: getfield      #74                 // Field c:Landroid/widget/TextView;
     187: invokevirtual #228                // Method android/widget/TextView.getBaseline:()I
     190: istore        15
     192: aload_0
     193: getfield      #76                 // Field d:Landroid/widget/TextView;
     196: invokevirtual #228                // Method android/widget/TextView.getBaseline:()I
     199: istore        16
     201: iload         17
     203: iload         15
     205: invokestatic  #233                // Method java/lang/Math.max:(II)I
     208: iload         16
     210: invokestatic  #233                // Method java/lang/Math.max:(II)I
     213: istore        18
     215: iload         18
     217: iload         17
     219: isub
     220: istore        17
     222: iload         18
     224: iload         15
     226: isub
     227: istore        15
     229: iload         18
     231: iload         16
     233: isub
     234: istore        16
     236: aload_0
     237: getfield      #68                 // Field b:Landroid/widget/TextView;
     240: invokevirtual #236                // Method android/widget/TextView.getMeasuredHeight:()I
     243: istore        18
     245: aload_0
     246: getfield      #74                 // Field c:Landroid/widget/TextView;
     249: invokevirtual #236                // Method android/widget/TextView.getMeasuredHeight:()I
     252: istore        19
     254: aload_0
     255: getfield      #76                 // Field d:Landroid/widget/TextView;
     258: invokevirtual #236                // Method android/widget/TextView.getMeasuredHeight:()I
     261: istore        20
     263: iload         18
     265: iload         17
     267: iadd
     268: iload         19
     270: iload         15
     272: iadd
     273: invokestatic  #233                // Method java/lang/Math.max:(II)I
     276: iload         20
     278: iload         16
     280: iadd
     281: invokestatic  #233                // Method java/lang/Math.max:(II)I
     284: istore        18
     286: aload_0
     287: getfield      #115                // Field i:I
     290: bipush        112
     292: iand
     293: istore        19
     295: iload         19
     297: bipush        16
     299: if_icmpeq     341
     302: iload         19
     304: bipush        80
     306: if_icmpeq     329
     309: iload         17
     311: iload_1
     312: iadd
     313: istore        6
     315: iload         15
     317: iload_1
     318: iadd
     319: istore        7
     321: iload_1
     322: iload         16
     324: iadd
     325: istore_1
     326: goto          371
     329: iload         6
     331: iload         7
     333: isub
     334: iload         18
     336: isub
     337: istore_1
     338: goto          354
     341: iload         6
     343: iload_1
     344: isub
     345: iload         7
     347: isub
     348: iload         18
     350: isub
     351: iconst_2
     352: idiv
     353: istore_1
     354: iload         17
     356: iload_1
     357: iadd
     358: istore        6
     360: iload         15
     362: iload_1
     363: iadd
     364: istore        7
     366: iload_1
     367: iload         16
     369: iadd
     370: istore_1
     371: aload_0
     372: getfield      #74                 // Field c:Landroid/widget/TextView;
     375: iload         13
     377: iload         7
     379: iload         14
     381: aload_0
     382: getfield      #74                 // Field c:Landroid/widget/TextView;
     385: invokevirtual #236                // Method android/widget/TextView.getMeasuredHeight:()I
     388: iload         7
     390: iadd
     391: invokevirtual #240                // Method android/widget/TextView.layout:(IIII)V
     394: iload         12
     396: iload         13
     398: aload_0
     399: getfield      #177                // Field h:I
     402: isub
     403: iload         9
     405: isub
     406: invokestatic  #243                // Method java/lang/Math.min:(II)I
     409: istore        7
     411: aload_0
     412: getfield      #68                 // Field b:Landroid/widget/TextView;
     415: iload         7
     417: iload         6
     419: iload         9
     421: iload         7
     423: iadd
     424: aload_0
     425: getfield      #68                 // Field b:Landroid/widget/TextView;
     428: invokevirtual #236                // Method android/widget/TextView.getMeasuredHeight:()I
     431: iload         6
     433: iadd
     434: invokevirtual #240                // Method android/widget/TextView.layout:(IIII)V
     437: iload         10
     439: iload         11
     441: isub
     442: iload         8
     444: isub
     445: iload         14
     447: aload_0
     448: getfield      #177                // Field h:I
     451: iadd
     452: invokestatic  #233                // Method java/lang/Math.max:(II)I
     455: istore        6
     457: aload_0
     458: getfield      #76                 // Field d:Landroid/widget/TextView;
     461: iload         6
     463: iload_1
     464: iload         6
     466: iload         8
     468: iadd
     469: aload_0
     470: getfield      #76                 // Field d:Landroid/widget/TextView;
     473: invokevirtual #236                // Method android/widget/TextView.getMeasuredHeight:()I
     476: iload_1
     477: iadd
     478: invokevirtual #240                // Method android/widget/TextView.layout:(IIII)V
     481: aload_0
     482: fload_2
     483: putfield      #57                 // Field e:F
     486: aload_0
     487: iconst_0
     488: putfield      #203                // Field k:Z
     491: return

  void a(int, android.support.v4.view.q);
    Code:
       0: aload_2
       1: ifnull        12
       4: aload_2
       5: invokevirtual #248                // Method android/support/v4/view/q.getCount:()I
       8: istore_3
       9: goto          14
      12: iconst_0
      13: istore_3
      14: aload_0
      15: iconst_1
      16: putfield      #250                // Field j:Z
      19: aconst_null
      20: astore        6
      22: iload_1
      23: iconst_1
      24: if_icmplt     43
      27: aload_2
      28: ifnull        43
      31: aload_2
      32: iload_1
      33: iconst_1
      34: isub
      35: invokevirtual #254                // Method android/support/v4/view/q.getPageTitle:(I)Ljava/lang/CharSequence;
      38: astore        5
      40: goto          46
      43: aconst_null
      44: astore        5
      46: aload_0
      47: getfield      #68                 // Field b:Landroid/widget/TextView;
      50: aload         5
      52: invokevirtual #258                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      55: aload_0
      56: getfield      #74                 // Field c:Landroid/widget/TextView;
      59: astore        7
      61: aload_2
      62: ifnull        80
      65: iload_1
      66: iload_3
      67: if_icmpge     80
      70: aload_2
      71: iload_1
      72: invokevirtual #254                // Method android/support/v4/view/q.getPageTitle:(I)Ljava/lang/CharSequence;
      75: astore        5
      77: goto          83
      80: aconst_null
      81: astore        5
      83: aload         7
      85: aload         5
      87: invokevirtual #258                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      90: iload_1
      91: iconst_1
      92: iadd
      93: istore        4
      95: aload         6
      97: astore        5
      99: iload         4
     101: iload_3
     102: if_icmpge     121
     105: aload         6
     107: astore        5
     109: aload_2
     110: ifnull        121
     113: aload_2
     114: iload         4
     116: invokevirtual #254                // Method android/support/v4/view/q.getPageTitle:(I)Ljava/lang/CharSequence;
     119: astore        5
     121: aload_0
     122: getfield      #76                 // Field d:Landroid/widget/TextView;
     125: aload         5
     127: invokevirtual #258                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     130: iconst_0
     131: aload_0
     132: invokevirtual #209                // Method getWidth:()I
     135: aload_0
     136: invokevirtual #215                // Method getPaddingLeft:()I
     139: isub
     140: aload_0
     141: invokevirtual #218                // Method getPaddingRight:()I
     144: isub
     145: i2f
     146: ldc_w         #259                // float 0.8f
     149: fmul
     150: f2i
     151: invokestatic  #233                // Method java/lang/Math.max:(II)I
     154: ldc_w         #260                // int -2147483648
     157: invokestatic  #265                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     160: istore_3
     161: iconst_0
     162: aload_0
     163: invokevirtual #212                // Method getHeight:()I
     166: aload_0
     167: invokevirtual #221                // Method getPaddingTop:()I
     170: isub
     171: aload_0
     172: invokevirtual #224                // Method getPaddingBottom:()I
     175: isub
     176: invokestatic  #233                // Method java/lang/Math.max:(II)I
     179: ldc_w         #260                // int -2147483648
     182: invokestatic  #265                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     185: istore        4
     187: aload_0
     188: getfield      #68                 // Field b:Landroid/widget/TextView;
     191: iload_3
     192: iload         4
     194: invokevirtual #269                // Method android/widget/TextView.measure:(II)V
     197: aload_0
     198: getfield      #74                 // Field c:Landroid/widget/TextView;
     201: iload_3
     202: iload         4
     204: invokevirtual #269                // Method android/widget/TextView.measure:(II)V
     207: aload_0
     208: getfield      #76                 // Field d:Landroid/widget/TextView;
     211: iload_3
     212: iload         4
     214: invokevirtual #269                // Method android/widget/TextView.measure:(II)V
     217: aload_0
     218: iload_1
     219: putfield      #54                 // Field g:I
     222: aload_0
     223: getfield      #203                // Field k:Z
     226: ifne          239
     229: aload_0
     230: iload_1
     231: aload_0
     232: getfield      #57                 // Field e:F
     235: iconst_0
     236: invokevirtual #271                // Method a:(IFZ)V
     239: aload_0
     240: iconst_0
     241: putfield      #250                // Field j:Z
     244: return

  void a(android.support.v4.view.q, android.support.v4.view.q);
    Code:
       0: aload_1
       1: ifnull        17
       4: aload_1
       5: aload_0
       6: getfield      #62                 // Field l:Landroid/support/v4/view/PagerTitleStrip$a;
       9: invokevirtual #276                // Method android/support/v4/view/q.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
      12: aload_0
      13: aconst_null
      14: putfield      #278                // Field m:Ljava/lang/ref/WeakReference;
      17: aload_2
      18: ifnull        41
      21: aload_2
      22: aload_0
      23: getfield      #62                 // Field l:Landroid/support/v4/view/PagerTitleStrip$a;
      26: invokevirtual #281                // Method android/support/v4/view/q.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
      29: aload_0
      30: new           #283                // class java/lang/ref/WeakReference
      33: dup
      34: aload_2
      35: invokespecial #286                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      38: putfield      #278                // Field m:Ljava/lang/ref/WeakReference;
      41: aload_0
      42: getfield      #192                // Field a:Landroid/support/v4/view/v;
      45: ifnull        75
      48: aload_0
      49: iconst_m1
      50: putfield      #54                 // Field g:I
      53: aload_0
      54: ldc           #55                 // float -1.0f
      56: putfield      #57                 // Field e:F
      59: aload_0
      60: aload_0
      61: getfield      #192                // Field a:Landroid/support/v4/view/v;
      64: invokevirtual #289                // Method android/support/v4/view/v.getCurrentItem:()I
      67: aload_2
      68: invokevirtual #201                // Method a:(ILandroid/support/v4/view/q;)V
      71: aload_0
      72: invokevirtual #292                // Method requestLayout:()V
      75: return

  int getMinHeight();
    Code:
       0: aload_0
       1: invokevirtual #297                // Method getBackground:()Landroid/graphics/drawable/Drawable;
       4: astore_1
       5: aload_1
       6: ifnull        14
       9: aload_1
      10: invokevirtual #302                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
      13: ireturn
      14: iconst_0
      15: ireturn

  public int getTextSpacing();
    Code:
       0: aload_0
       1: getfield      #177                // Field h:I
       4: ireturn

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #306                // Method android/view/ViewGroup.onAttachedToWindow:()V
       4: aload_0
       5: invokevirtual #310                // Method getParent:()Landroid/view/ViewParent;
       8: astore_1
       9: aload_1
      10: instanceof    #194                // class android/support/v4/view/v
      13: ifne          27
      16: new           #312                // class java/lang/IllegalStateException
      19: dup
      20: ldc_w         #314                // String PagerTitleStrip must be a direct child of a ViewPager.
      23: invokespecial #317                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      26: athrow
      27: aload_1
      28: checkcast     #194                // class android/support/v4/view/v
      31: astore_1
      32: aload_1
      33: invokevirtual #198                // Method android/support/v4/view/v.getAdapter:()Landroid/support/v4/view/q;
      36: astore_2
      37: aload_1
      38: aload_0
      39: getfield      #62                 // Field l:Landroid/support/v4/view/PagerTitleStrip$a;
      42: invokevirtual #321                // Method android/support/v4/view/v.setInternalPageChangeListener:(Landroid/support/v4/view/v$f;)Landroid/support/v4/view/v$f;
      45: pop
      46: aload_1
      47: aload_0
      48: getfield      #62                 // Field l:Landroid/support/v4/view/PagerTitleStrip$a;
      51: invokevirtual #325                // Method android/support/v4/view/v.addOnAdapterChangeListener:(Landroid/support/v4/view/v$e;)V
      54: aload_0
      55: aload_1
      56: putfield      #192                // Field a:Landroid/support/v4/view/v;
      59: aload_0
      60: getfield      #278                // Field m:Ljava/lang/ref/WeakReference;
      63: ifnull        80
      66: aload_0
      67: getfield      #278                // Field m:Ljava/lang/ref/WeakReference;
      70: invokevirtual #329                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      73: checkcast     #245                // class android/support/v4/view/q
      76: astore_1
      77: goto          82
      80: aconst_null
      81: astore_1
      82: aload_0
      83: aload_1
      84: aload_2
      85: invokevirtual #331                // Method a:(Landroid/support/v4/view/q;Landroid/support/v4/view/q;)V
      88: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #334                // Method android/view/ViewGroup.onDetachedFromWindow:()V
       4: aload_0
       5: getfield      #192                // Field a:Landroid/support/v4/view/v;
       8: ifnull        48
      11: aload_0
      12: aload_0
      13: getfield      #192                // Field a:Landroid/support/v4/view/v;
      16: invokevirtual #198                // Method android/support/v4/view/v.getAdapter:()Landroid/support/v4/view/q;
      19: aconst_null
      20: invokevirtual #331                // Method a:(Landroid/support/v4/view/q;Landroid/support/v4/view/q;)V
      23: aload_0
      24: getfield      #192                // Field a:Landroid/support/v4/view/v;
      27: aconst_null
      28: invokevirtual #321                // Method android/support/v4/view/v.setInternalPageChangeListener:(Landroid/support/v4/view/v$f;)Landroid/support/v4/view/v$f;
      31: pop
      32: aload_0
      33: getfield      #192                // Field a:Landroid/support/v4/view/v;
      36: aload_0
      37: getfield      #62                 // Field l:Landroid/support/v4/view/PagerTitleStrip$a;
      40: invokevirtual #337                // Method android/support/v4/view/v.removeOnAdapterChangeListener:(Landroid/support/v4/view/v$e;)V
      43: aload_0
      44: aconst_null
      45: putfield      #192                // Field a:Landroid/support/v4/view/v;
      48: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #192                // Field a:Landroid/support/v4/view/v;
       4: ifnull        40
       7: aload_0
       8: getfield      #57                 // Field e:F
      11: fstore        7
      13: fconst_0
      14: fstore        6
      16: fload         7
      18: fconst_0
      19: fcmpl
      20: iflt          29
      23: aload_0
      24: getfield      #57                 // Field e:F
      27: fstore        6
      29: aload_0
      30: aload_0
      31: getfield      #54                 // Field g:I
      34: fload         6
      36: iconst_1
      37: invokevirtual #271                // Method a:(IFZ)V
      40: return

  protected void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #344                // Method android/view/View$MeasureSpec.getMode:(I)I
       4: ldc_w         #345                // int 1073741824
       7: if_icmpeq     21
      10: new           #312                // class java/lang/IllegalStateException
      13: dup
      14: ldc_w         #347                // String Must measure with an exact width
      17: invokespecial #317                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      20: athrow
      21: aload_0
      22: invokevirtual #221                // Method getPaddingTop:()I
      25: aload_0
      26: invokevirtual #224                // Method getPaddingBottom:()I
      29: iadd
      30: istore        4
      32: iload_2
      33: iload         4
      35: bipush        -2
      37: invokestatic  #351                // Method getChildMeasureSpec:(III)I
      40: istore        5
      42: iload_1
      43: invokestatic  #354                // Method android/view/View$MeasureSpec.getSize:(I)I
      46: istore_3
      47: iload_1
      48: iload_3
      49: i2f
      50: ldc_w         #355                // float 0.2f
      53: fmul
      54: f2i
      55: bipush        -2
      57: invokestatic  #351                // Method getChildMeasureSpec:(III)I
      60: istore_1
      61: aload_0
      62: getfield      #68                 // Field b:Landroid/widget/TextView;
      65: iload_1
      66: iload         5
      68: invokevirtual #269                // Method android/widget/TextView.measure:(II)V
      71: aload_0
      72: getfield      #74                 // Field c:Landroid/widget/TextView;
      75: iload_1
      76: iload         5
      78: invokevirtual #269                // Method android/widget/TextView.measure:(II)V
      81: aload_0
      82: getfield      #76                 // Field d:Landroid/widget/TextView;
      85: iload_1
      86: iload         5
      88: invokevirtual #269                // Method android/widget/TextView.measure:(II)V
      91: iload_2
      92: invokestatic  #344                // Method android/view/View$MeasureSpec.getMode:(I)I
      95: ldc_w         #345                // int 1073741824
      98: if_icmpne     109
     101: iload_2
     102: invokestatic  #354                // Method android/view/View$MeasureSpec.getSize:(I)I
     105: istore_1
     106: goto          129
     109: aload_0
     110: getfield      #74                 // Field c:Landroid/widget/TextView;
     113: invokevirtual #236                // Method android/widget/TextView.getMeasuredHeight:()I
     116: istore_1
     117: aload_0
     118: invokevirtual #357                // Method getMinHeight:()I
     121: iload_1
     122: iload         4
     124: iadd
     125: invokestatic  #233                // Method java/lang/Math.max:(II)I
     128: istore_1
     129: aload_0
     130: iload_3
     131: iload_1
     132: iload_2
     133: aload_0
     134: getfield      #74                 // Field c:Landroid/widget/TextView;
     137: invokevirtual #360                // Method android/widget/TextView.getMeasuredState:()I
     140: bipush        16
     142: ishl
     143: invokestatic  #365                // Method android/view/View.resolveSizeAndState:(III)I
     146: invokevirtual #368                // Method setMeasuredDimension:(II)V
     149: return

  public void requestLayout();
    Code:
       0: aload_0
       1: getfield      #250                // Field j:Z
       4: ifne          11
       7: aload_0
       8: invokespecial #369                // Method android/view/ViewGroup.requestLayout:()V
      11: return

  public void setGravity(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #115                // Field i:I
       5: aload_0
       6: invokevirtual #292                // Method requestLayout:()V
       9: return

  public void setNonPrimaryAlpha(float);
    Code:
       0: aload_0
       1: fload_1
       2: ldc_w         #371                // float 255.0f
       5: fmul
       6: f2i
       7: sipush        255
      10: iand
      11: putfield      #373                // Field p:I
      14: aload_0
      15: getfield      #373                // Field p:I
      18: bipush        24
      20: ishl
      21: aload_0
      22: getfield      #130                // Field f:I
      25: ldc_w         #374                // int 16777215
      28: iand
      29: ior
      30: istore_2
      31: aload_0
      32: getfield      #68                 // Field b:Landroid/widget/TextView;
      35: iload_2
      36: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
      39: aload_0
      40: getfield      #76                 // Field d:Landroid/widget/TextView;
      43: iload_2
      44: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
      47: return

  public void setTextColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #130                // Field f:I
       5: aload_0
       6: getfield      #74                 // Field c:Landroid/widget/TextView;
       9: iload_1
      10: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
      13: aload_0
      14: getfield      #373                // Field p:I
      17: bipush        24
      19: ishl
      20: aload_0
      21: getfield      #130                // Field f:I
      24: ldc_w         #374                // int 16777215
      27: iand
      28: ior
      29: istore_1
      30: aload_0
      31: getfield      #68                 // Field b:Landroid/widget/TextView;
      34: iload_1
      35: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
      38: aload_0
      39: getfield      #76                 // Field d:Landroid/widget/TextView;
      42: iload_1
      43: invokevirtual #110                // Method android/widget/TextView.setTextColor:(I)V
      46: return

  public void setTextSpacing(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #177                // Field h:I
       5: aload_0
       6: invokevirtual #292                // Method requestLayout:()V
       9: return
}
