public class android.support.v7.widget.SwitchCompat extends android.widget.CompoundButton {
  android.animation.ObjectAnimator a;

  static {};
    Code:
       0: new           #6                  // class android/support/v7/widget/SwitchCompat$1
       3: dup
       4: ldc           #64                 // class java/lang/Float
       6: ldc           #66                 // String thumbPos
       8: invokespecial #70                 // Method android/support/v7/widget/SwitchCompat$1."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
      11: putstatic     #72                 // Field b:Landroid/util/Property;
      14: iconst_1
      15: newarray       int
      17: dup
      18: iconst_0
      19: ldc           #73                 // int 16842912
      21: iastore
      22: putstatic     #75                 // Field N:[I
      25: return

  public android.support.v7.widget.SwitchCompat(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #80                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.SwitchCompat(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #85                 // Field android/support/v7/a/a$a.switchStyle:I
       6: invokespecial #88                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.v7.widget.SwitchCompat(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #89                 // Method android/widget/CompoundButton."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: aconst_null
       9: putfield      #91                 // Field d:Landroid/content/res/ColorStateList;
      12: aload_0
      13: aconst_null
      14: putfield      #93                 // Field e:Landroid/graphics/PorterDuff$Mode;
      17: aload_0
      18: iconst_0
      19: putfield      #95                 // Field f:Z
      22: aload_0
      23: iconst_0
      24: putfield      #97                 // Field g:Z
      27: aload_0
      28: aconst_null
      29: putfield      #99                 // Field i:Landroid/content/res/ColorStateList;
      32: aload_0
      33: aconst_null
      34: putfield      #101                // Field j:Landroid/graphics/PorterDuff$Mode;
      37: aload_0
      38: iconst_0
      39: putfield      #103                // Field k:Z
      42: aload_0
      43: iconst_0
      44: putfield      #105                // Field l:Z
      47: aload_0
      48: invokestatic  #111                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      51: putfield      #113                // Field x:Landroid/view/VelocityTracker;
      54: aload_0
      55: new           #115                // class android/graphics/Rect
      58: dup
      59: invokespecial #117                // Method android/graphics/Rect."<init>":()V
      62: putfield      #119                // Field M:Landroid/graphics/Rect;
      65: aload_0
      66: new           #121                // class android/text/TextPaint
      69: dup
      70: iconst_1
      71: invokespecial #124                // Method android/text/TextPaint."<init>":(I)V
      74: putfield      #126                // Field H:Landroid/text/TextPaint;
      77: aload_0
      78: invokevirtual #130                // Method getResources:()Landroid/content/res/Resources;
      81: astore        4
      83: aload_0
      84: getfield      #126                // Field H:Landroid/text/TextPaint;
      87: aload         4
      89: invokevirtual #136                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      92: getfield      #141                // Field android/util/DisplayMetrics.density:F
      95: putfield      #142                // Field android/text/TextPaint.density:F
      98: aload_1
      99: aload_2
     100: getstatic     #147                // Field android/support/v7/a/a$j.SwitchCompat:[I
     103: iload_3
     104: iconst_0
     105: invokestatic  #152                // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
     108: astore_2
     109: aload_0
     110: aload_2
     111: getstatic     #155                // Field android/support/v7/a/a$j.SwitchCompat_android_thumb:I
     114: invokevirtual #158                // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
     117: putfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     120: aload_0
     121: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     124: ifnull        135
     127: aload_0
     128: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     131: aload_0
     132: invokevirtual #166                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
     135: aload_0
     136: aload_2
     137: getstatic     #169                // Field android/support/v7/a/a$j.SwitchCompat_track:I
     140: invokevirtual #158                // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
     143: putfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
     146: aload_0
     147: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
     150: ifnull        161
     153: aload_0
     154: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
     157: aload_0
     158: invokevirtual #166                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
     161: aload_0
     162: aload_2
     163: getstatic     #174                // Field android/support/v7/a/a$j.SwitchCompat_android_textOn:I
     166: invokevirtual #177                // Method android/support/v7/widget/bp.c:(I)Ljava/lang/CharSequence;
     169: putfield      #179                // Field q:Ljava/lang/CharSequence;
     172: aload_0
     173: aload_2
     174: getstatic     #182                // Field android/support/v7/a/a$j.SwitchCompat_android_textOff:I
     177: invokevirtual #177                // Method android/support/v7/widget/bp.c:(I)Ljava/lang/CharSequence;
     180: putfield      #184                // Field r:Ljava/lang/CharSequence;
     183: aload_0
     184: aload_2
     185: getstatic     #187                // Field android/support/v7/a/a$j.SwitchCompat_showText:I
     188: iconst_1
     189: invokevirtual #190                // Method android/support/v7/widget/bp.a:(IZ)Z
     192: putfield      #192                // Field s:Z
     195: aload_0
     196: aload_2
     197: getstatic     #195                // Field android/support/v7/a/a$j.SwitchCompat_thumbTextPadding:I
     200: iconst_0
     201: invokevirtual #198                // Method android/support/v7/widget/bp.e:(II)I
     204: putfield      #200                // Field m:I
     207: aload_0
     208: aload_2
     209: getstatic     #203                // Field android/support/v7/a/a$j.SwitchCompat_switchMinWidth:I
     212: iconst_0
     213: invokevirtual #198                // Method android/support/v7/widget/bp.e:(II)I
     216: putfield      #205                // Field n:I
     219: aload_0
     220: aload_2
     221: getstatic     #208                // Field android/support/v7/a/a$j.SwitchCompat_switchPadding:I
     224: iconst_0
     225: invokevirtual #198                // Method android/support/v7/widget/bp.e:(II)I
     228: putfield      #210                // Field o:I
     231: aload_0
     232: aload_2
     233: getstatic     #213                // Field android/support/v7/a/a$j.SwitchCompat_splitTrack:I
     236: iconst_0
     237: invokevirtual #190                // Method android/support/v7/widget/bp.a:(IZ)Z
     240: putfield      #215                // Field p:Z
     243: aload_2
     244: getstatic     #218                // Field android/support/v7/a/a$j.SwitchCompat_thumbTint:I
     247: invokevirtual #221                // Method android/support/v7/widget/bp.e:(I)Landroid/content/res/ColorStateList;
     250: astore        4
     252: aload         4
     254: ifnull        268
     257: aload_0
     258: aload         4
     260: putfield      #91                 // Field d:Landroid/content/res/ColorStateList;
     263: aload_0
     264: iconst_1
     265: putfield      #95                 // Field f:Z
     268: aload_2
     269: getstatic     #224                // Field android/support/v7/a/a$j.SwitchCompat_thumbTintMode:I
     272: iconst_m1
     273: invokevirtual #226                // Method android/support/v7/widget/bp.a:(II)I
     276: aconst_null
     277: invokestatic  #231                // Method android/support/v7/widget/ao.a:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
     280: astore        4
     282: aload_0
     283: getfield      #93                 // Field e:Landroid/graphics/PorterDuff$Mode;
     286: aload         4
     288: if_acmpeq     302
     291: aload_0
     292: aload         4
     294: putfield      #93                 // Field e:Landroid/graphics/PorterDuff$Mode;
     297: aload_0
     298: iconst_1
     299: putfield      #97                 // Field g:Z
     302: aload_0
     303: getfield      #95                 // Field f:Z
     306: ifne          316
     309: aload_0
     310: getfield      #97                 // Field g:Z
     313: ifeq          320
     316: aload_0
     317: invokespecial #233                // Method b:()V
     320: aload_2
     321: getstatic     #236                // Field android/support/v7/a/a$j.SwitchCompat_trackTint:I
     324: invokevirtual #221                // Method android/support/v7/widget/bp.e:(I)Landroid/content/res/ColorStateList;
     327: astore        4
     329: aload         4
     331: ifnull        345
     334: aload_0
     335: aload         4
     337: putfield      #99                 // Field i:Landroid/content/res/ColorStateList;
     340: aload_0
     341: iconst_1
     342: putfield      #103                // Field k:Z
     345: aload_2
     346: getstatic     #239                // Field android/support/v7/a/a$j.SwitchCompat_trackTintMode:I
     349: iconst_m1
     350: invokevirtual #226                // Method android/support/v7/widget/bp.a:(II)I
     353: aconst_null
     354: invokestatic  #231                // Method android/support/v7/widget/ao.a:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
     357: astore        4
     359: aload_0
     360: getfield      #101                // Field j:Landroid/graphics/PorterDuff$Mode;
     363: aload         4
     365: if_acmpeq     379
     368: aload_0
     369: aload         4
     371: putfield      #101                // Field j:Landroid/graphics/PorterDuff$Mode;
     374: aload_0
     375: iconst_1
     376: putfield      #105                // Field l:Z
     379: aload_0
     380: getfield      #103                // Field k:Z
     383: ifne          393
     386: aload_0
     387: getfield      #105                // Field l:Z
     390: ifeq          397
     393: aload_0
     394: invokespecial #241                // Method a:()V
     397: aload_2
     398: getstatic     #244                // Field android/support/v7/a/a$j.SwitchCompat_switchTextAppearance:I
     401: iconst_0
     402: invokevirtual #246                // Method android/support/v7/widget/bp.g:(II)I
     405: istore_3
     406: iload_3
     407: ifeq          416
     410: aload_0
     411: aload_1
     412: iload_3
     413: invokevirtual #249                // Method a:(Landroid/content/Context;I)V
     416: aload_2
     417: invokevirtual #250                // Method android/support/v7/widget/bp.a:()V
     420: aload_1
     421: invokestatic  #256                // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
     424: astore_1
     425: aload_0
     426: aload_1
     427: invokevirtual #260                // Method android/view/ViewConfiguration.getScaledTouchSlop:()I
     430: putfield      #262                // Field u:I
     433: aload_0
     434: aload_1
     435: invokevirtual #265                // Method android/view/ViewConfiguration.getScaledMinimumFlingVelocity:()I
     438: putfield      #267                // Field y:I
     441: aload_0
     442: invokevirtual #270                // Method refreshDrawableState:()V
     445: aload_0
     446: aload_0
     447: invokevirtual #274                // Method isChecked:()Z
     450: invokevirtual #278                // Method setChecked:(Z)V
     453: return

  static float a(android.support.v7.widget.SwitchCompat);
    Code:
       0: aload_0
       1: getfield      #282                // Field z:F
       4: freturn

  public void a(android.content.Context, int);
    Code:
       0: aload_1
       1: iload_2
       2: getstatic     #465                // Field android/support/v7/a/a$j.TextAppearance:[I
       5: invokestatic  #468                // Method android/support/v7/widget/bp.a:(Landroid/content/Context;I[I)Landroid/support/v7/widget/bp;
       8: astore        4
      10: aload         4
      12: getstatic     #471                // Field android/support/v7/a/a$j.TextAppearance_android_textColor:I
      15: invokevirtual #221                // Method android/support/v7/widget/bp.e:(I)Landroid/content/res/ColorStateList;
      18: astore_1
      19: aload_1
      20: ifnull        31
      23: aload_0
      24: aload_1
      25: putfield      #473                // Field I:Landroid/content/res/ColorStateList;
      28: goto          39
      31: aload_0
      32: invokevirtual #477                // Method getTextColors:()Landroid/content/res/ColorStateList;
      35: astore_1
      36: goto          23
      39: aload         4
      41: getstatic     #480                // Field android/support/v7/a/a$j.TextAppearance_android_textSize:I
      44: iconst_0
      45: invokevirtual #198                // Method android/support/v7/widget/bp.e:(II)I
      48: istore_2
      49: iload_2
      50: ifeq          80
      53: iload_2
      54: i2f
      55: fstore_3
      56: fload_3
      57: aload_0
      58: getfield      #126                // Field H:Landroid/text/TextPaint;
      61: invokevirtual #483                // Method android/text/TextPaint.getTextSize:()F
      64: fcmpl
      65: ifeq          80
      68: aload_0
      69: getfield      #126                // Field H:Landroid/text/TextPaint;
      72: fload_3
      73: invokevirtual #487                // Method android/text/TextPaint.setTextSize:(F)V
      76: aload_0
      77: invokevirtual #490                // Method requestLayout:()V
      80: aload_0
      81: aload         4
      83: getstatic     #493                // Field android/support/v7/a/a$j.TextAppearance_android_typeface:I
      86: iconst_m1
      87: invokevirtual #226                // Method android/support/v7/widget/bp.a:(II)I
      90: aload         4
      92: getstatic     #496                // Field android/support/v7/a/a$j.TextAppearance_android_textStyle:I
      95: iconst_m1
      96: invokevirtual #226                // Method android/support/v7/widget/bp.a:(II)I
      99: invokespecial #498                // Method a:(II)V
     102: aload         4
     104: getstatic     #501                // Field android/support/v7/a/a$j.TextAppearance_textAllCaps:I
     107: iconst_0
     108: invokevirtual #190                // Method android/support/v7/widget/bp.a:(IZ)Z
     111: ifeq          134
     114: new           #503                // class android/support/v7/f/a
     117: dup
     118: aload_0
     119: invokevirtual #507                // Method getContext:()Landroid/content/Context;
     122: invokespecial #509                // Method android/support/v7/f/a."<init>":(Landroid/content/Context;)V
     125: astore_1
     126: aload_0
     127: aload_1
     128: putfield      #285                // Field L:Landroid/text/method/TransformationMethod;
     131: goto          139
     134: aconst_null
     135: astore_1
     136: goto          126
     139: aload         4
     141: invokevirtual #250                // Method android/support/v7/widget/bp.a:()V
     144: return

  public void a(android.graphics.Typeface, int);
    Code:
       0: fconst_0
       1: fstore_3
       2: iconst_0
       3: istore        5
       5: iload_2
       6: ifle          96
       9: aload_1
      10: ifnonnull     21
      13: iload_2
      14: invokestatic  #513                // Method android/graphics/Typeface.defaultFromStyle:(I)Landroid/graphics/Typeface;
      17: astore_1
      18: goto          27
      21: aload_1
      22: iload_2
      23: invokestatic  #517                // Method android/graphics/Typeface.create:(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
      26: astore_1
      27: aload_0
      28: aload_1
      29: invokevirtual #521                // Method setSwitchTypeface:(Landroid/graphics/Typeface;)V
      32: aload_1
      33: ifnull        45
      36: aload_1
      37: invokevirtual #524                // Method android/graphics/Typeface.getStyle:()I
      40: istore        4
      42: goto          48
      45: iconst_0
      46: istore        4
      48: iload         4
      50: iconst_m1
      51: ixor
      52: iload_2
      53: iand
      54: istore_2
      55: aload_0
      56: getfield      #126                // Field H:Landroid/text/TextPaint;
      59: astore_1
      60: iload_2
      61: iconst_1
      62: iand
      63: ifeq          69
      66: iconst_1
      67: istore        5
      69: aload_1
      70: iload         5
      72: invokevirtual #527                // Method android/text/TextPaint.setFakeBoldText:(Z)V
      75: aload_0
      76: getfield      #126                // Field H:Landroid/text/TextPaint;
      79: astore_1
      80: iload_2
      81: iconst_2
      82: iand
      83: ifeq          90
      86: ldc_w         #528                // float -0.25f
      89: fstore_3
      90: aload_1
      91: fload_3
      92: invokevirtual #531                // Method android/text/TextPaint.setTextSkewX:(F)V
      95: return
      96: aload_0
      97: getfield      #126                // Field H:Landroid/text/TextPaint;
     100: iconst_0
     101: invokevirtual #527                // Method android/text/TextPaint.setFakeBoldText:(Z)V
     104: aload_0
     105: getfield      #126                // Field H:Landroid/text/TextPaint;
     108: fconst_0
     109: invokevirtual #531                // Method android/text/TextPaint.setTextSkewX:(F)V
     112: aload_0
     113: aload_1
     114: invokevirtual #521                // Method setSwitchTypeface:(Landroid/graphics/Typeface;)V
     117: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #119                // Field M:Landroid/graphics/Rect;
       4: astore        12
       6: aload_0
       7: getfield      #406                // Field D:I
      10: istore        5
      12: aload_0
      13: getfield      #404                // Field E:I
      16: istore        8
      18: aload_0
      19: getfield      #535                // Field F:I
      22: istore        6
      24: aload_0
      25: getfield      #416                // Field G:I
      28: istore        9
      30: aload_0
      31: invokespecial #398                // Method getThumbOffset:()I
      34: iload         5
      36: iadd
      37: istore_3
      38: aload_0
      39: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      42: ifnull        57
      45: aload_0
      46: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      49: invokestatic  #458                // Method android/support/v7/widget/ao.a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
      52: astore        11
      54: goto          62
      57: getstatic     #460                // Field android/support/v7/widget/ao.a:Landroid/graphics/Rect;
      60: astore        11
      62: iload_3
      63: istore_2
      64: aload_0
      65: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      68: ifnull        271
      71: aload_0
      72: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      75: aload         12
      77: invokevirtual #402                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      80: pop
      81: iload_3
      82: aload         12
      84: getfield      #411                // Field android/graphics/Rect.left:I
      87: iadd
      88: istore        10
      90: aload         11
      92: ifnull        235
      95: iload         5
      97: istore_2
      98: aload         11
     100: getfield      #411                // Field android/graphics/Rect.left:I
     103: aload         12
     105: getfield      #411                // Field android/graphics/Rect.left:I
     108: if_icmple     126
     111: iload         5
     113: aload         11
     115: getfield      #411                // Field android/graphics/Rect.left:I
     118: aload         12
     120: getfield      #411                // Field android/graphics/Rect.left:I
     123: isub
     124: iadd
     125: istore_2
     126: aload         11
     128: getfield      #538                // Field android/graphics/Rect.top:I
     131: aload         12
     133: getfield      #538                // Field android/graphics/Rect.top:I
     136: if_icmple     157
     139: aload         11
     141: getfield      #538                // Field android/graphics/Rect.top:I
     144: aload         12
     146: getfield      #538                // Field android/graphics/Rect.top:I
     149: isub
     150: iload         8
     152: iadd
     153: istore_3
     154: goto          160
     157: iload         8
     159: istore_3
     160: iload         6
     162: istore        4
     164: aload         11
     166: getfield      #414                // Field android/graphics/Rect.right:I
     169: aload         12
     171: getfield      #414                // Field android/graphics/Rect.right:I
     174: if_icmple     193
     177: iload         6
     179: aload         11
     181: getfield      #414                // Field android/graphics/Rect.right:I
     184: aload         12
     186: getfield      #414                // Field android/graphics/Rect.right:I
     189: isub
     190: isub
     191: istore        4
     193: iload_2
     194: istore        5
     196: iload         4
     198: istore        6
     200: iload_3
     201: istore        7
     203: aload         11
     205: getfield      #541                // Field android/graphics/Rect.bottom:I
     208: aload         12
     210: getfield      #541                // Field android/graphics/Rect.bottom:I
     213: if_icmple     239
     216: iload         9
     218: aload         11
     220: getfield      #541                // Field android/graphics/Rect.bottom:I
     223: aload         12
     225: getfield      #541                // Field android/graphics/Rect.bottom:I
     228: isub
     229: isub
     230: istore        7
     232: goto          255
     235: iload         8
     237: istore        7
     239: iload         9
     241: istore_2
     242: iload         7
     244: istore_3
     245: iload_2
     246: istore        7
     248: iload         6
     250: istore        4
     252: iload         5
     254: istore_2
     255: aload_0
     256: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
     259: iload_2
     260: iload_3
     261: iload         4
     263: iload         7
     265: invokevirtual #545                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     268: iload         10
     270: istore_2
     271: aload_0
     272: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     275: ifnull        344
     278: aload_0
     279: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     282: aload         12
     284: invokevirtual #402                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
     287: pop
     288: iload_2
     289: aload         12
     291: getfield      #411                // Field android/graphics/Rect.left:I
     294: isub
     295: istore_3
     296: iload_2
     297: aload_0
     298: getfield      #408                // Field C:I
     301: iadd
     302: aload         12
     304: getfield      #414                // Field android/graphics/Rect.right:I
     307: iadd
     308: istore_2
     309: aload_0
     310: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     313: iload_3
     314: iload         8
     316: iload_2
     317: iload         9
     319: invokevirtual #545                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     322: aload_0
     323: invokevirtual #548                // Method getBackground:()Landroid/graphics/drawable/Drawable;
     326: astore        11
     328: aload         11
     330: ifnull        344
     333: aload         11
     335: iload_3
     336: iload         8
     338: iload_2
     339: iload         9
     341: invokestatic  #551                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;IIII)V
     344: aload_0
     345: aload_1
     346: invokespecial #553                // Method android/widget/CompoundButton.draw:(Landroid/graphics/Canvas;)V
     349: return

  public void drawableHotspotChanged(float, float);
    Code:
       0: getstatic     #388                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: fload_1
      10: fload_2
      11: invokespecial #557                // Method android/widget/CompoundButton.drawableHotspotChanged:(FF)V
      14: aload_0
      15: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      18: ifnull        30
      21: aload_0
      22: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      25: fload_1
      26: fload_2
      27: invokestatic  #560                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;FF)V
      30: aload_0
      31: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      34: ifnull        46
      37: aload_0
      38: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      41: fload_1
      42: fload_2
      43: invokestatic  #560                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;FF)V
      46: return

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #563                // Method android/widget/CompoundButton.drawableStateChanged:()V
       4: aload_0
       5: invokevirtual #333                // Method getDrawableState:()[I
       8: astore_3
       9: aload_0
      10: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      13: astore        4
      15: iconst_0
      16: istore_2
      17: iload_2
      18: istore_1
      19: aload         4
      21: ifnull        43
      24: iload_2
      25: istore_1
      26: aload         4
      28: invokevirtual #329                // Method android/graphics/drawable/Drawable.isStateful:()Z
      31: ifeq          43
      34: iconst_0
      35: aload         4
      37: aload_3
      38: invokevirtual #337                // Method android/graphics/drawable/Drawable.setState:([I)Z
      41: ior
      42: istore_1
      43: aload_0
      44: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      47: astore        4
      49: iload_1
      50: istore_2
      51: aload         4
      53: ifnull        75
      56: iload_1
      57: istore_2
      58: aload         4
      60: invokevirtual #329                // Method android/graphics/drawable/Drawable.isStateful:()Z
      63: ifeq          75
      66: iload_1
      67: aload         4
      69: aload_3
      70: invokevirtual #337                // Method android/graphics/drawable/Drawable.setState:([I)Z
      73: ior
      74: istore_2
      75: iload_2
      76: ifeq          83
      79: aload_0
      80: invokevirtual #566                // Method invalidate:()V
      83: return

  public int getCompoundPaddingLeft();
    Code:
       0: aload_0
       1: invokestatic  #440                // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
       4: ifne          12
       7: aload_0
       8: invokespecial #569                // Method android/widget/CompoundButton.getCompoundPaddingLeft:()I
      11: ireturn
      12: aload_0
      13: invokespecial #569                // Method android/widget/CompoundButton.getCompoundPaddingLeft:()I
      16: aload_0
      17: getfield      #462                // Field A:I
      20: iadd
      21: istore_2
      22: iload_2
      23: istore_1
      24: aload_0
      25: invokevirtual #573                // Method getText:()Ljava/lang/CharSequence;
      28: invokestatic  #579                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      31: ifne          41
      34: iload_2
      35: aload_0
      36: getfield      #210                // Field o:I
      39: iadd
      40: istore_1
      41: iload_1
      42: ireturn

  public int getCompoundPaddingRight();
    Code:
       0: aload_0
       1: invokestatic  #440                // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
       4: ifeq          12
       7: aload_0
       8: invokespecial #582                // Method android/widget/CompoundButton.getCompoundPaddingRight:()I
      11: ireturn
      12: aload_0
      13: invokespecial #582                // Method android/widget/CompoundButton.getCompoundPaddingRight:()I
      16: aload_0
      17: getfield      #462                // Field A:I
      20: iadd
      21: istore_2
      22: iload_2
      23: istore_1
      24: aload_0
      25: invokevirtual #573                // Method getText:()Ljava/lang/CharSequence;
      28: invokestatic  #579                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      31: ifne          41
      34: iload_2
      35: aload_0
      36: getfield      #210                // Field o:I
      39: iadd
      40: istore_1
      41: iload_1
      42: ireturn

  public boolean getShowText();
    Code:
       0: aload_0
       1: getfield      #192                // Field s:Z
       4: ireturn

  public boolean getSplitTrack();
    Code:
       0: aload_0
       1: getfield      #215                // Field p:Z
       4: ireturn

  public int getSwitchMinWidth();
    Code:
       0: aload_0
       1: getfield      #205                // Field n:I
       4: ireturn

  public int getSwitchPadding();
    Code:
       0: aload_0
       1: getfield      #210                // Field o:I
       4: ireturn

  public java.lang.CharSequence getTextOff();
    Code:
       0: aload_0
       1: getfield      #184                // Field r:Ljava/lang/CharSequence;
       4: areturn

  public java.lang.CharSequence getTextOn();
    Code:
       0: aload_0
       1: getfield      #179                // Field q:Ljava/lang/CharSequence;
       4: areturn

  public android.graphics.drawable.Drawable getThumbDrawable();
    Code:
       0: aload_0
       1: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
       4: areturn

  public int getThumbTextPadding();
    Code:
       0: aload_0
       1: getfield      #200                // Field m:I
       4: ireturn

  public android.content.res.ColorStateList getThumbTintList();
    Code:
       0: aload_0
       1: getfield      #91                 // Field d:Landroid/content/res/ColorStateList;
       4: areturn

  public android.graphics.PorterDuff$Mode getThumbTintMode();
    Code:
       0: aload_0
       1: getfield      #93                 // Field e:Landroid/graphics/PorterDuff$Mode;
       4: areturn

  public android.graphics.drawable.Drawable getTrackDrawable();
    Code:
       0: aload_0
       1: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
       4: areturn

  public android.content.res.ColorStateList getTrackTintList();
    Code:
       0: aload_0
       1: getfield      #99                 // Field i:Landroid/content/res/ColorStateList;
       4: areturn

  public android.graphics.PorterDuff$Mode getTrackTintMode();
    Code:
       0: aload_0
       1: getfield      #101                // Field j:Landroid/graphics/PorterDuff$Mode;
       4: areturn

  public void jumpDrawablesToCurrentState();
    Code:
       0: aload_0
       1: invokespecial #599                // Method android/widget/CompoundButton.jumpDrawablesToCurrentState:()V
       4: aload_0
       5: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
       8: ifnull        18
      11: aload_0
      12: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      15: invokevirtual #602                // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
      18: aload_0
      19: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      22: ifnull        32
      25: aload_0
      26: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      29: invokevirtual #602                // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
      32: aload_0
      33: getfield      #377                // Field a:Landroid/animation/ObjectAnimator;
      36: ifnull        61
      39: aload_0
      40: getfield      #377                // Field a:Landroid/animation/ObjectAnimator;
      43: invokevirtual #605                // Method android/animation/ObjectAnimator.isStarted:()Z
      46: ifeq          61
      49: aload_0
      50: getfield      #377                // Field a:Landroid/animation/ObjectAnimator;
      53: invokevirtual #608                // Method android/animation/ObjectAnimator.end:()V
      56: aload_0
      57: aconst_null
      58: putfield      #377                // Field a:Landroid/animation/ObjectAnimator;
      61: return

  protected int[] onCreateDrawableState(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_1
       3: iadd
       4: invokespecial #612                // Method android/widget/CompoundButton.onCreateDrawableState:(I)[I
       7: astore_2
       8: aload_0
       9: invokevirtual #274                // Method isChecked:()Z
      12: ifeq          23
      15: aload_2
      16: getstatic     #75                 // Field N:[I
      19: invokestatic  #616                // Method mergeDrawableStates:([I[I)[I
      22: pop
      23: aload_2
      24: areturn

  protected void onDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #619                // Method android/widget/CompoundButton.onDraw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #119                // Field M:Landroid/graphics/Rect;
       9: astore        9
      11: aload_0
      12: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      15: astore        11
      17: aload         11
      19: ifnull        33
      22: aload         11
      24: aload         9
      26: invokevirtual #402                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      29: pop
      30: goto          38
      33: aload         9
      35: invokevirtual #622                // Method android/graphics/Rect.setEmpty:()V
      38: aload_0
      39: getfield      #404                // Field E:I
      42: istore        4
      44: aload_0
      45: getfield      #416                // Field G:I
      48: istore        5
      50: aload         9
      52: getfield      #538                // Field android/graphics/Rect.top:I
      55: istore        6
      57: aload         9
      59: getfield      #541                // Field android/graphics/Rect.bottom:I
      62: istore        7
      64: aload_0
      65: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      68: astore        10
      70: aload         11
      72: ifnull        168
      75: aload_0
      76: getfield      #215                // Field p:Z
      79: ifeq          162
      82: aload         10
      84: ifnull        162
      87: aload         10
      89: invokestatic  #458                // Method android/support/v7/widget/ao.a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
      92: astore        12
      94: aload         10
      96: aload         9
      98: invokevirtual #626                // Method android/graphics/drawable/Drawable.copyBounds:(Landroid/graphics/Rect;)V
     101: aload         9
     103: aload         9
     105: getfield      #411                // Field android/graphics/Rect.left:I
     108: aload         12
     110: getfield      #411                // Field android/graphics/Rect.left:I
     113: iadd
     114: putfield      #411                // Field android/graphics/Rect.left:I
     117: aload         9
     119: aload         9
     121: getfield      #414                // Field android/graphics/Rect.right:I
     124: aload         12
     126: getfield      #414                // Field android/graphics/Rect.right:I
     129: isub
     130: putfield      #414                // Field android/graphics/Rect.right:I
     133: aload_1
     134: invokevirtual #631                // Method android/graphics/Canvas.save:()I
     137: istore_2
     138: aload_1
     139: aload         9
     141: getstatic     #637                // Field android/graphics/Region$Op.DIFFERENCE:Landroid/graphics/Region$Op;
     144: invokevirtual #641                // Method android/graphics/Canvas.clipRect:(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z
     147: pop
     148: aload         11
     150: aload_1
     151: invokevirtual #642                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     154: aload_1
     155: iload_2
     156: invokevirtual #645                // Method android/graphics/Canvas.restoreToCount:(I)V
     159: goto          168
     162: aload         11
     164: aload_1
     165: invokevirtual #642                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     168: aload_1
     169: invokevirtual #631                // Method android/graphics/Canvas.save:()I
     172: istore_3
     173: aload         10
     175: ifnull        184
     178: aload         10
     180: aload_1
     181: invokevirtual #642                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     184: aload_0
     185: invokespecial #443                // Method getTargetCheckedState:()Z
     188: ifeq          200
     191: aload_0
     192: getfield      #647                // Field J:Landroid/text/Layout;
     195: astore        9
     197: goto          206
     200: aload_0
     201: getfield      #649                // Field K:Landroid/text/Layout;
     204: astore        9
     206: aload         9
     208: ifnull        340
     211: aload_0
     212: invokevirtual #333                // Method getDrawableState:()[I
     215: astore        11
     217: aload_0
     218: getfield      #473                // Field I:Landroid/content/res/ColorStateList;
     221: ifnull        241
     224: aload_0
     225: getfield      #126                // Field H:Landroid/text/TextPaint;
     228: aload_0
     229: getfield      #473                // Field I:Landroid/content/res/ColorStateList;
     232: aload         11
     234: iconst_0
     235: invokevirtual #655                // Method android/content/res/ColorStateList.getColorForState:([II)I
     238: invokevirtual #658                // Method android/text/TextPaint.setColor:(I)V
     241: aload_0
     242: getfield      #126                // Field H:Landroid/text/TextPaint;
     245: aload         11
     247: putfield      #661                // Field android/text/TextPaint.drawableState:[I
     250: aload         10
     252: ifnull        277
     255: aload         10
     257: invokevirtual #665                // Method android/graphics/drawable/Drawable.getBounds:()Landroid/graphics/Rect;
     260: astore        10
     262: aload         10
     264: getfield      #411                // Field android/graphics/Rect.left:I
     267: aload         10
     269: getfield      #414                // Field android/graphics/Rect.right:I
     272: iadd
     273: istore_2
     274: goto          282
     277: aload_0
     278: invokevirtual #668                // Method getWidth:()I
     281: istore_2
     282: iload_2
     283: iconst_2
     284: idiv
     285: istore_2
     286: aload         9
     288: invokevirtual #669                // Method android/text/Layout.getWidth:()I
     291: iconst_2
     292: idiv
     293: istore        8
     295: iload         4
     297: iload         6
     299: iadd
     300: iload         5
     302: iload         7
     304: isub
     305: iadd
     306: iconst_2
     307: idiv
     308: istore        4
     310: aload         9
     312: invokevirtual #672                // Method android/text/Layout.getHeight:()I
     315: iconst_2
     316: idiv
     317: istore        5
     319: aload_1
     320: iload_2
     321: iload         8
     323: isub
     324: i2f
     325: iload         4
     327: iload         5
     329: isub
     330: i2f
     331: invokevirtual #675                // Method android/graphics/Canvas.translate:(FF)V
     334: aload         9
     336: aload_1
     337: invokevirtual #676                // Method android/text/Layout.draw:(Landroid/graphics/Canvas;)V
     340: aload_1
     341: iload_3
     342: invokevirtual #645                // Method android/graphics/Canvas.restoreToCount:(I)V
     345: return

  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #680                // Method android/widget/CompoundButton.onInitializeAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V
       5: aload_1
       6: ldc_w         #682                // String android.widget.Switch
       9: invokevirtual #688                // Method android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
      12: return

  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #692                // Method android/widget/CompoundButton.onInitializeAccessibilityNodeInfo:(Landroid/view/accessibility/AccessibilityNodeInfo;)V
       5: aload_1
       6: ldc_w         #682                // String android.widget.Switch
       9: invokevirtual #695                // Method android/view/accessibility/AccessibilityNodeInfo.setClassName:(Ljava/lang/CharSequence;)V
      12: aload_0
      13: invokevirtual #274                // Method isChecked:()Z
      16: ifeq          27
      19: aload_0
      20: getfield      #179                // Field q:Ljava/lang/CharSequence;
      23: astore_2
      24: goto          32
      27: aload_0
      28: getfield      #184                // Field r:Ljava/lang/CharSequence;
      31: astore_2
      32: aload_2
      33: invokestatic  #579                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      36: ifne          94
      39: aload_1
      40: invokevirtual #696                // Method android/view/accessibility/AccessibilityNodeInfo.getText:()Ljava/lang/CharSequence;
      43: astore_3
      44: aload_3
      45: invokestatic  #579                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      48: ifeq          57
      51: aload_1
      52: aload_2
      53: invokevirtual #699                // Method android/view/accessibility/AccessibilityNodeInfo.setText:(Ljava/lang/CharSequence;)V
      56: return
      57: new           #701                // class java/lang/StringBuilder
      60: dup
      61: invokespecial #702                // Method java/lang/StringBuilder."<init>":()V
      64: astore        4
      66: aload         4
      68: aload_3
      69: invokevirtual #706                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
      72: pop
      73: aload         4
      75: bipush        32
      77: invokevirtual #709                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      80: pop
      81: aload         4
      83: aload_2
      84: invokevirtual #706                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
      87: pop
      88: aload_1
      89: aload         4
      91: invokevirtual #699                // Method android/view/accessibility/AccessibilityNodeInfo.setText:(Ljava/lang/CharSequence;)V
      94: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #713                // Method android/widget/CompoundButton.onLayout:(ZIIII)V
      11: aload_0
      12: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      15: astore        6
      17: iconst_0
      18: istore_3
      19: aload         6
      21: ifnull        99
      24: aload_0
      25: getfield      #119                // Field M:Landroid/graphics/Rect;
      28: astore        6
      30: aload_0
      31: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      34: ifnull        50
      37: aload_0
      38: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      41: aload         6
      43: invokevirtual #402                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      46: pop
      47: goto          55
      50: aload         6
      52: invokevirtual #622                // Method android/graphics/Rect.setEmpty:()V
      55: aload_0
      56: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      59: invokestatic  #458                // Method android/support/v7/widget/ao.a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
      62: astore        7
      64: iconst_0
      65: aload         7
      67: getfield      #411                // Field android/graphics/Rect.left:I
      70: aload         6
      72: getfield      #411                // Field android/graphics/Rect.left:I
      75: isub
      76: invokestatic  #716                // Method java/lang/Math.max:(II)I
      79: istore_3
      80: iconst_0
      81: aload         7
      83: getfield      #414                // Field android/graphics/Rect.right:I
      86: aload         6
      88: getfield      #414                // Field android/graphics/Rect.right:I
      91: isub
      92: invokestatic  #716                // Method java/lang/Math.max:(II)I
      95: istore_2
      96: goto          101
      99: iconst_0
     100: istore_2
     101: aload_0
     102: invokestatic  #440                // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
     105: ifeq          137
     108: aload_0
     109: invokevirtual #719                // Method getPaddingLeft:()I
     112: iload_3
     113: iadd
     114: istore        4
     116: aload_0
     117: getfield      #462                // Field A:I
     120: iload         4
     122: iadd
     123: iload_3
     124: isub
     125: iload_2
     126: isub
     127: istore_2
     128: iload         4
     130: istore_3
     131: iload_2
     132: istore        4
     134: goto          162
     137: aload_0
     138: invokevirtual #668                // Method getWidth:()I
     141: aload_0
     142: invokevirtual #722                // Method getPaddingRight:()I
     145: isub
     146: iload_2
     147: isub
     148: istore        4
     150: iload         4
     152: aload_0
     153: getfield      #462                // Field A:I
     156: isub
     157: iload_3
     158: iadd
     159: iload_2
     160: iadd
     161: istore_3
     162: aload_0
     163: invokevirtual #725                // Method getGravity:()I
     166: bipush        112
     168: iand
     169: istore_2
     170: iload_2
     171: bipush        16
     173: if_icmpeq     220
     176: iload_2
     177: bipush        80
     179: if_icmpeq     198
     182: aload_0
     183: invokevirtual #728                // Method getPaddingTop:()I
     186: istore_2
     187: aload_0
     188: getfield      #730                // Field B:I
     191: iload_2
     192: iadd
     193: istore        5
     195: goto          247
     198: aload_0
     199: invokevirtual #731                // Method getHeight:()I
     202: aload_0
     203: invokevirtual #734                // Method getPaddingBottom:()I
     206: isub
     207: istore        5
     209: iload         5
     211: aload_0
     212: getfield      #730                // Field B:I
     215: isub
     216: istore_2
     217: goto          247
     220: aload_0
     221: invokevirtual #728                // Method getPaddingTop:()I
     224: aload_0
     225: invokevirtual #731                // Method getHeight:()I
     228: iadd
     229: aload_0
     230: invokevirtual #734                // Method getPaddingBottom:()I
     233: isub
     234: iconst_2
     235: idiv
     236: aload_0
     237: getfield      #730                // Field B:I
     240: iconst_2
     241: idiv
     242: isub
     243: istore_2
     244: goto          187
     247: aload_0
     248: iload_3
     249: putfield      #406                // Field D:I
     252: aload_0
     253: iload_2
     254: putfield      #404                // Field E:I
     257: aload_0
     258: iload         5
     260: putfield      #416                // Field G:I
     263: aload_0
     264: iload         4
     266: putfield      #535                // Field F:I
     269: return

  public void onMeasure(int, int);
    Code:
       0: aload_0
       1: getfield      #192                // Field s:Z
       4: ifeq          45
       7: aload_0
       8: getfield      #647                // Field J:Landroid/text/Layout;
      11: ifnonnull     26
      14: aload_0
      15: aload_0
      16: aload_0
      17: getfield      #179                // Field q:Ljava/lang/CharSequence;
      20: invokespecial #737                // Method a:(Ljava/lang/CharSequence;)Landroid/text/Layout;
      23: putfield      #647                // Field J:Landroid/text/Layout;
      26: aload_0
      27: getfield      #649                // Field K:Landroid/text/Layout;
      30: ifnonnull     45
      33: aload_0
      34: aload_0
      35: aload_0
      36: getfield      #184                // Field r:Ljava/lang/CharSequence;
      39: invokespecial #737                // Method a:(Ljava/lang/CharSequence;)Landroid/text/Layout;
      42: putfield      #649                // Field K:Landroid/text/Layout;
      45: aload_0
      46: getfield      #119                // Field M:Landroid/graphics/Rect;
      49: astore        9
      51: aload_0
      52: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      55: astore        10
      57: iconst_0
      58: istore        6
      60: aload         10
      62: ifnull        107
      65: aload_0
      66: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      69: aload         9
      71: invokevirtual #402                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      74: pop
      75: aload_0
      76: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      79: invokevirtual #740                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
      82: aload         9
      84: getfield      #411                // Field android/graphics/Rect.left:I
      87: isub
      88: aload         9
      90: getfield      #414                // Field android/graphics/Rect.right:I
      93: isub
      94: istore        4
      96: aload_0
      97: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     100: invokevirtual #743                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
     103: istore_3
     104: goto          112
     107: iconst_0
     108: istore        4
     110: iconst_0
     111: istore_3
     112: aload_0
     113: getfield      #192                // Field s:Z
     116: ifeq          148
     119: aload_0
     120: getfield      #647                // Field J:Landroid/text/Layout;
     123: invokevirtual #669                // Method android/text/Layout.getWidth:()I
     126: aload_0
     127: getfield      #649                // Field K:Landroid/text/Layout;
     130: invokevirtual #669                // Method android/text/Layout.getWidth:()I
     133: invokestatic  #716                // Method java/lang/Math.max:(II)I
     136: aload_0
     137: getfield      #200                // Field m:I
     140: iconst_2
     141: imul
     142: iadd
     143: istore        5
     145: goto          151
     148: iconst_0
     149: istore        5
     151: aload_0
     152: iload         5
     154: iload         4
     156: invokestatic  #716                // Method java/lang/Math.max:(II)I
     159: putfield      #408                // Field C:I
     162: aload_0
     163: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
     166: ifnull        191
     169: aload_0
     170: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
     173: aload         9
     175: invokevirtual #402                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
     178: pop
     179: aload_0
     180: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
     183: invokevirtual #743                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
     186: istore        4
     188: goto          200
     191: aload         9
     193: invokevirtual #622                // Method android/graphics/Rect.setEmpty:()V
     196: iload         6
     198: istore        4
     200: aload         9
     202: getfield      #411                // Field android/graphics/Rect.left:I
     205: istore        8
     207: aload         9
     209: getfield      #414                // Field android/graphics/Rect.right:I
     212: istore        7
     214: iload         7
     216: istore        6
     218: iload         8
     220: istore        5
     222: aload_0
     223: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     226: ifnull        262
     229: aload_0
     230: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
     233: invokestatic  #458                // Method android/support/v7/widget/ao.a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
     236: astore        9
     238: iload         8
     240: aload         9
     242: getfield      #411                // Field android/graphics/Rect.left:I
     245: invokestatic  #716                // Method java/lang/Math.max:(II)I
     248: istore        5
     250: iload         7
     252: aload         9
     254: getfield      #414                // Field android/graphics/Rect.right:I
     257: invokestatic  #716                // Method java/lang/Math.max:(II)I
     260: istore        6
     262: aload_0
     263: getfield      #205                // Field n:I
     266: aload_0
     267: getfield      #408                // Field C:I
     270: iconst_2
     271: imul
     272: iload         5
     274: iadd
     275: iload         6
     277: iadd
     278: invokestatic  #716                // Method java/lang/Math.max:(II)I
     281: istore        5
     283: iload         4
     285: iload_3
     286: invokestatic  #716                // Method java/lang/Math.max:(II)I
     289: istore_3
     290: aload_0
     291: iload         5
     293: putfield      #462                // Field A:I
     296: aload_0
     297: iload_3
     298: putfield      #730                // Field B:I
     301: aload_0
     302: iload_1
     303: iload_2
     304: invokespecial #745                // Method android/widget/CompoundButton.onMeasure:(II)V
     307: aload_0
     308: invokevirtual #748                // Method getMeasuredHeight:()I
     311: iload_3
     312: if_icmpge     324
     315: aload_0
     316: aload_0
     317: invokevirtual #751                // Method getMeasuredWidthAndState:()I
     320: iload_3
     321: invokevirtual #754                // Method setMeasuredDimension:(II)V
     324: return

  public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #757                // Method android/widget/CompoundButton.onPopulateAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V
       5: aload_0
       6: invokevirtual #274                // Method isChecked:()Z
       9: ifeq          20
      12: aload_0
      13: getfield      #179                // Field q:Ljava/lang/CharSequence;
      16: astore_2
      17: goto          25
      20: aload_0
      21: getfield      #184                // Field r:Ljava/lang/CharSequence;
      24: astore_2
      25: aload_2
      26: ifnull        40
      29: aload_1
      30: invokevirtual #760                // Method android/view/accessibility/AccessibilityEvent.getText:()Ljava/util/List;
      33: aload_2
      34: invokeinterface #766,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      39: pop
      40: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #113                // Field x:Landroid/view/VelocityTracker;
       4: aload_1
       5: invokevirtual #769                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
       8: aload_1
       9: invokevirtual #772                // Method android/view/MotionEvent.getActionMasked:()I
      12: tableswitch   { // 0 to 3
                     0: 283
                     1: 247
                     2: 47
                     3: 247
               default: 44
          }
      44: goto          324
      47: aload_0
      48: getfield      #418                // Field t:I
      51: tableswitch   { // 0 to 2
                     0: 324
                     1: 174
                     2: 79
               default: 76
          }
      76: goto          324
      79: aload_1
      80: invokevirtual #775                // Method android/view/MotionEvent.getX:()F
      83: fstore        4
      85: aload_0
      86: invokespecial #455                // Method getThumbScrollRange:()I
      89: istore        5
      91: fload         4
      93: aload_0
      94: getfield      #777                // Field v:F
      97: fsub
      98: fstore_2
      99: iload         5
     101: ifeq          113
     104: fload_2
     105: iload         5
     107: i2f
     108: fdiv
     109: fstore_2
     110: goto          128
     113: fload_2
     114: fconst_0
     115: fcmpl
     116: ifle          124
     119: fconst_1
     120: fstore_2
     121: goto          128
     124: ldc_w         #778                // float -1.0f
     127: fstore_2
     128: fload_2
     129: fstore_3
     130: aload_0
     131: invokestatic  #440                // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
     134: ifeq          140
     137: fload_2
     138: fneg
     139: fstore_3
     140: aload_0
     141: getfield      #282                // Field z:F
     144: fload_3
     145: fadd
     146: fconst_0
     147: fconst_1
     148: invokestatic  #780                // Method a:(FFF)F
     151: fstore_2
     152: fload_2
     153: aload_0
     154: getfield      #282                // Field z:F
     157: fcmpl
     158: ifeq          172
     161: aload_0
     162: fload         4
     164: putfield      #777                // Field v:F
     167: aload_0
     168: fload_2
     169: invokevirtual #783                // Method setThumbPosition:(F)V
     172: iconst_1
     173: ireturn
     174: aload_1
     175: invokevirtual #775                // Method android/view/MotionEvent.getX:()F
     178: fstore_2
     179: aload_1
     180: invokevirtual #786                // Method android/view/MotionEvent.getY:()F
     183: fstore_3
     184: fload_2
     185: aload_0
     186: getfield      #777                // Field v:F
     189: fsub
     190: invokestatic  #435                // Method java/lang/Math.abs:(F)F
     193: aload_0
     194: getfield      #262                // Field u:I
     197: i2f
     198: fcmpl
     199: ifgt          220
     202: fload_3
     203: aload_0
     204: getfield      #788                // Field w:F
     207: fsub
     208: invokestatic  #435                // Method java/lang/Math.abs:(F)F
     211: aload_0
     212: getfield      #262                // Field u:I
     215: i2f
     216: fcmpl
     217: ifle          324
     220: aload_0
     221: iconst_2
     222: putfield      #418                // Field t:I
     225: aload_0
     226: invokevirtual #792                // Method getParent:()Landroid/view/ViewParent;
     229: iconst_1
     230: invokeinterface #797,  2          // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
     235: aload_0
     236: fload_2
     237: putfield      #777                // Field v:F
     240: aload_0
     241: fload_3
     242: putfield      #788                // Field w:F
     245: iconst_1
     246: ireturn
     247: aload_0
     248: getfield      #418                // Field t:I
     251: iconst_2
     252: if_icmpne     268
     255: aload_0
     256: aload_1
     257: invokespecial #799                // Method b:(Landroid/view/MotionEvent;)V
     260: aload_0
     261: aload_1
     262: invokespecial #366                // Method android/widget/CompoundButton.onTouchEvent:(Landroid/view/MotionEvent;)Z
     265: pop
     266: iconst_1
     267: ireturn
     268: aload_0
     269: iconst_0
     270: putfield      #418                // Field t:I
     273: aload_0
     274: getfield      #113                // Field x:Landroid/view/VelocityTracker;
     277: invokevirtual #802                // Method android/view/VelocityTracker.clear:()V
     280: goto          324
     283: aload_1
     284: invokevirtual #775                // Method android/view/MotionEvent.getX:()F
     287: fstore_2
     288: aload_1
     289: invokevirtual #786                // Method android/view/MotionEvent.getY:()F
     292: fstore_3
     293: aload_0
     294: invokevirtual #424                // Method isEnabled:()Z
     297: ifeq          324
     300: aload_0
     301: fload_2
     302: fload_3
     303: invokespecial #804                // Method a:(FF)Z
     306: ifeq          324
     309: aload_0
     310: iconst_1
     311: putfield      #418                // Field t:I
     314: aload_0
     315: fload_2
     316: putfield      #777                // Field v:F
     319: aload_0
     320: fload_3
     321: putfield      #788                // Field w:F
     324: aload_0
     325: aload_1
     326: invokespecial #366                // Method android/widget/CompoundButton.onTouchEvent:(Landroid/view/MotionEvent;)Z
     329: ireturn

  public void setChecked(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #805                // Method android/widget/CompoundButton.setChecked:(Z)V
       5: aload_0
       6: invokevirtual #274                // Method isChecked:()Z
       9: istore_1
      10: aload_0
      11: invokevirtual #809                // Method getWindowToken:()Landroid/os/IBinder;
      14: ifnull        30
      17: aload_0
      18: invokestatic  #813                // Method android/support/v4/view/s.w:(Landroid/view/View;)Z
      21: ifeq          30
      24: aload_0
      25: iload_1
      26: invokespecial #815                // Method a:(Z)V
      29: return
      30: aload_0
      31: invokespecial #817                // Method c:()V
      34: iload_1
      35: ifeq          43
      38: fconst_1
      39: fstore_2
      40: goto          45
      43: fconst_0
      44: fstore_2
      45: aload_0
      46: fload_2
      47: invokevirtual #783                // Method setThumbPosition:(F)V
      50: return

  public void setShowText(boolean);
    Code:
       0: aload_0
       1: getfield      #192                // Field s:Z
       4: iload_1
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #192                // Field s:Z
      13: aload_0
      14: invokevirtual #490                // Method requestLayout:()V
      17: return

  public void setSplitTrack(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #215                // Field p:Z
       5: aload_0
       6: invokevirtual #566                // Method invalidate:()V
       9: return

  public void setSwitchMinWidth(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #205                // Field n:I
       5: aload_0
       6: invokevirtual #490                // Method requestLayout:()V
       9: return

  public void setSwitchPadding(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #210                // Field o:I
       5: aload_0
       6: invokevirtual #490                // Method requestLayout:()V
       9: return

  public void setSwitchTypeface(android.graphics.Typeface);
    Code:
       0: aload_0
       1: getfield      #126                // Field H:Landroid/text/TextPaint;
       4: invokevirtual #825                // Method android/text/TextPaint.getTypeface:()Landroid/graphics/Typeface;
       7: ifnull        24
      10: aload_0
      11: getfield      #126                // Field H:Landroid/text/TextPaint;
      14: invokevirtual #825                // Method android/text/TextPaint.getTypeface:()Landroid/graphics/Typeface;
      17: aload_1
      18: invokevirtual #828                // Method android/graphics/Typeface.equals:(Ljava/lang/Object;)Z
      21: ifeq          38
      24: aload_0
      25: getfield      #126                // Field H:Landroid/text/TextPaint;
      28: invokevirtual #825                // Method android/text/TextPaint.getTypeface:()Landroid/graphics/Typeface;
      31: ifnonnull     55
      34: aload_1
      35: ifnull        55
      38: aload_0
      39: getfield      #126                // Field H:Landroid/text/TextPaint;
      42: aload_1
      43: invokevirtual #832                // Method android/text/TextPaint.setTypeface:(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
      46: pop
      47: aload_0
      48: invokevirtual #490                // Method requestLayout:()V
      51: aload_0
      52: invokevirtual #566                // Method invalidate:()V
      55: return

  public void setTextOff(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #184                // Field r:Ljava/lang/CharSequence;
       5: aload_0
       6: invokevirtual #490                // Method requestLayout:()V
       9: return

  public void setTextOn(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #179                // Field q:Ljava/lang/CharSequence;
       5: aload_0
       6: invokevirtual #490                // Method requestLayout:()V
       9: return

  public void setThumbDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      11: aconst_null
      12: invokevirtual #166                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      15: aload_0
      16: aload_1
      17: putfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      20: aload_1
      21: ifnull        29
      24: aload_1
      25: aload_0
      26: invokevirtual #166                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      29: aload_0
      30: invokevirtual #490                // Method requestLayout:()V
      33: return

  void setThumbPosition(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #282                // Field z:F
       5: aload_0
       6: invokevirtual #566                // Method invalidate:()V
       9: return

  public void setThumbResource(int);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #507                // Method getContext:()Landroid/content/Context;
       5: iload_1
       6: invokestatic  #842                // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
       9: invokevirtual #844                // Method setThumbDrawable:(Landroid/graphics/drawable/Drawable;)V
      12: return

  public void setThumbTextPadding(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #200                // Field m:I
       5: aload_0
       6: invokevirtual #490                // Method requestLayout:()V
       9: return

  public void setThumbTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #91                 // Field d:Landroid/content/res/ColorStateList;
       5: aload_0
       6: iconst_1
       7: putfield      #95                 // Field f:Z
      10: aload_0
      11: invokespecial #233                // Method b:()V
      14: return

  public void setThumbTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #93                 // Field e:Landroid/graphics/PorterDuff$Mode;
       5: aload_0
       6: iconst_1
       7: putfield      #97                 // Field g:Z
      10: aload_0
      11: invokespecial #233                // Method b:()V
      14: return

  public void setTrackDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      11: aconst_null
      12: invokevirtual #166                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      15: aload_0
      16: aload_1
      17: putfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      20: aload_1
      21: ifnull        29
      24: aload_1
      25: aload_0
      26: invokevirtual #166                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      29: aload_0
      30: invokevirtual #490                // Method requestLayout:()V
      33: return

  public void setTrackResource(int);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #507                // Method getContext:()Landroid/content/Context;
       5: iload_1
       6: invokestatic  #842                // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
       9: invokevirtual #853                // Method setTrackDrawable:(Landroid/graphics/drawable/Drawable;)V
      12: return

  public void setTrackTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #99                 // Field i:Landroid/content/res/ColorStateList;
       5: aload_0
       6: iconst_1
       7: putfield      #103                // Field k:Z
      10: aload_0
      11: invokespecial #241                // Method a:()V
      14: return

  public void setTrackTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #101                // Field j:Landroid/graphics/PorterDuff$Mode;
       5: aload_0
       6: iconst_1
       7: putfield      #105                // Field l:Z
      10: aload_0
      11: invokespecial #241                // Method a:()V
      14: return

  public void toggle();
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #274                // Method isChecked:()Z
       5: iconst_1
       6: ixor
       7: invokevirtual #278                // Method setChecked:(Z)V
      10: return

  protected boolean verifyDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #860                // Method android/widget/CompoundButton.verifyDrawable:(Landroid/graphics/drawable/Drawable;)Z
       5: ifne          29
       8: aload_1
       9: aload_0
      10: getfield      #160                // Field c:Landroid/graphics/drawable/Drawable;
      13: if_acmpeq     29
      16: aload_1
      17: aload_0
      18: getfield      #171                // Field h:Landroid/graphics/drawable/Drawable;
      21: if_acmpne     27
      24: goto          29
      27: iconst_0
      28: ireturn
      29: iconst_1
      30: ireturn
}
