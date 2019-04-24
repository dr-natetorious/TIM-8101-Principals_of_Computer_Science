public class android.support.v7.d.a.b extends android.graphics.drawable.Drawable {
  static {};
    Code:
       0: ldc2_w        #25                 // double 45.0d
       3: invokestatic  #32                 // Method java/lang/Math.toRadians:(D)D
       6: d2f
       7: putstatic     #34                 // Field b:F
      10: return

  public android.support.v7.d.a.b(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #39                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: aload_0
       5: new           #41                 // class android/graphics/Paint
       8: dup
       9: invokespecial #42                 // Method android/graphics/Paint."<init>":()V
      12: putfield      #44                 // Field a:Landroid/graphics/Paint;
      15: aload_0
      16: new           #46                 // class android/graphics/Path
      19: dup
      20: invokespecial #47                 // Method android/graphics/Path."<init>":()V
      23: putfield      #49                 // Field h:Landroid/graphics/Path;
      26: aload_0
      27: iconst_0
      28: putfield      #51                 // Field j:Z
      31: aload_0
      32: iconst_2
      33: putfield      #53                 // Field m:I
      36: aload_0
      37: getfield      #44                 // Field a:Landroid/graphics/Paint;
      40: getstatic     #59                 // Field android/graphics/Paint$Style.STROKE:Landroid/graphics/Paint$Style;
      43: invokevirtual #63                 // Method android/graphics/Paint.setStyle:(Landroid/graphics/Paint$Style;)V
      46: aload_0
      47: getfield      #44                 // Field a:Landroid/graphics/Paint;
      50: getstatic     #69                 // Field android/graphics/Paint$Join.MITER:Landroid/graphics/Paint$Join;
      53: invokevirtual #73                 // Method android/graphics/Paint.setStrokeJoin:(Landroid/graphics/Paint$Join;)V
      56: aload_0
      57: getfield      #44                 // Field a:Landroid/graphics/Paint;
      60: getstatic     #79                 // Field android/graphics/Paint$Cap.BUTT:Landroid/graphics/Paint$Cap;
      63: invokevirtual #83                 // Method android/graphics/Paint.setStrokeCap:(Landroid/graphics/Paint$Cap;)V
      66: aload_0
      67: getfield      #44                 // Field a:Landroid/graphics/Paint;
      70: iconst_1
      71: invokevirtual #87                 // Method android/graphics/Paint.setAntiAlias:(Z)V
      74: aload_1
      75: invokevirtual #93                 // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
      78: aconst_null
      79: getstatic     #99                 // Field android/support/v7/a/a$j.DrawerArrowToggle:[I
      82: getstatic     #104                // Field android/support/v7/a/a$a.drawerArrowStyle:I
      85: getstatic     #109                // Field android/support/v7/a/a$i.Base_Widget_AppCompat_DrawerArrowToggle:I
      88: invokevirtual #115                // Method android/content/res/Resources$Theme.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      91: astore_1
      92: aload_0
      93: aload_1
      94: getstatic     #118                // Field android/support/v7/a/a$j.DrawerArrowToggle_color:I
      97: iconst_0
      98: invokevirtual #124                // Method android/content/res/TypedArray.getColor:(II)I
     101: invokevirtual #127                // Method a:(I)V
     104: aload_0
     105: aload_1
     106: getstatic     #130                // Field android/support/v7/a/a$j.DrawerArrowToggle_thickness:I
     109: fconst_0
     110: invokevirtual #134                // Method android/content/res/TypedArray.getDimension:(IF)F
     113: invokevirtual #137                // Method a:(F)V
     116: aload_0
     117: aload_1
     118: getstatic     #140                // Field android/support/v7/a/a$j.DrawerArrowToggle_spinBars:I
     121: iconst_1
     122: invokevirtual #144                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     125: invokevirtual #146                // Method a:(Z)V
     128: aload_0
     129: aload_1
     130: getstatic     #149                // Field android/support/v7/a/a$j.DrawerArrowToggle_gapBetweenBars:I
     133: fconst_0
     134: invokevirtual #134                // Method android/content/res/TypedArray.getDimension:(IF)F
     137: invokestatic  #153                // Method java/lang/Math.round:(F)I
     140: i2f
     141: invokevirtual #155                // Method b:(F)V
     144: aload_0
     145: aload_1
     146: getstatic     #158                // Field android/support/v7/a/a$j.DrawerArrowToggle_drawableSize:I
     149: iconst_0
     150: invokevirtual #161                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     153: putfield      #163                // Field i:I
     156: aload_0
     157: aload_1
     158: getstatic     #166                // Field android/support/v7/a/a$j.DrawerArrowToggle_barLength:I
     161: fconst_0
     162: invokevirtual #134                // Method android/content/res/TypedArray.getDimension:(IF)F
     165: invokestatic  #153                // Method java/lang/Math.round:(F)I
     168: i2f
     169: putfield      #168                // Field d:F
     172: aload_0
     173: aload_1
     174: getstatic     #171                // Field android/support/v7/a/a$j.DrawerArrowToggle_arrowHeadLength:I
     177: fconst_0
     178: invokevirtual #134                // Method android/content/res/TypedArray.getDimension:(IF)F
     181: invokestatic  #153                // Method java/lang/Math.round:(F)I
     184: i2f
     185: putfield      #173                // Field c:F
     188: aload_0
     189: aload_1
     190: getstatic     #176                // Field android/support/v7/a/a$j.DrawerArrowToggle_arrowShaftLength:I
     193: fconst_0
     194: invokevirtual #134                // Method android/content/res/TypedArray.getDimension:(IF)F
     197: putfield      #178                // Field e:F
     200: aload_1
     201: invokevirtual #181                // Method android/content/res/TypedArray.recycle:()V
     204: return

  public void a(float);
    Code:
       0: aload_0
       1: getfield      #44                 // Field a:Landroid/graphics/Paint;
       4: invokevirtual #186                // Method android/graphics/Paint.getStrokeWidth:()F
       7: fload_1
       8: fcmpl
       9: ifeq          41
      12: aload_0
      13: getfield      #44                 // Field a:Landroid/graphics/Paint;
      16: fload_1
      17: invokevirtual #189                // Method android/graphics/Paint.setStrokeWidth:(F)V
      20: aload_0
      21: fload_1
      22: fconst_2
      23: fdiv
      24: f2d
      25: getstatic     #34                 // Field b:F
      28: f2d
      29: invokestatic  #192                // Method java/lang/Math.cos:(D)D
      32: dmul
      33: d2f
      34: putfield      #194                // Field l:F
      37: aload_0
      38: invokevirtual #197                // Method invalidateSelf:()V
      41: return

  public void a(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #44                 // Field a:Landroid/graphics/Paint;
       5: invokevirtual #200                // Method android/graphics/Paint.getColor:()I
       8: if_icmpeq     23
      11: aload_0
      12: getfield      #44                 // Field a:Landroid/graphics/Paint;
      15: iload_1
      16: invokevirtual #203                // Method android/graphics/Paint.setColor:(I)V
      19: aload_0
      20: invokevirtual #197                // Method invalidateSelf:()V
      23: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #205                // Field g:Z
       4: iload_1
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #205                // Field g:Z
      13: aload_0
      14: invokevirtual #197                // Method invalidateSelf:()V
      17: return

  public void b(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #207                // Field f:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #207                // Field f:F
      14: aload_0
      15: invokevirtual #197                // Method invalidateSelf:()V
      18: return

  public void b(boolean);
    Code:
       0: aload_0
       1: getfield      #51                 // Field j:Z
       4: iload_1
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #51                 // Field j:Z
      13: aload_0
      14: invokevirtual #197                // Method invalidateSelf:()V
      17: return

  public void c(float);
    Code:
       0: aload_0
       1: getfield      #209                // Field k:F
       4: fload_1
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #209                // Field k:F
      14: aload_0
      15: invokevirtual #197                // Method invalidateSelf:()V
      18: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: invokevirtual #215                // Method getBounds:()Landroid/graphics/Rect;
       4: astore        17
       6: aload_0
       7: getfield      #53                 // Field m:I
      10: istore        16
      12: iconst_0
      13: istore        15
      15: iconst_1
      16: istore        14
      18: iload         16
      20: iconst_3
      21: if_icmpeq     70
      24: iload         15
      26: istore        13
      28: iload         16
      30: tableswitch   { // 0 to 1
                     0: 84
                     1: 64
               default: 52
          }
      52: iload         15
      54: istore        13
      56: aload_0
      57: invokestatic  #220                // Method android/support/v4/b/a/a.h:(Landroid/graphics/drawable/Drawable;)I
      60: iconst_1
      61: if_icmpne     84
      64: iconst_1
      65: istore        13
      67: goto          84
      70: iload         15
      72: istore        13
      74: aload_0
      75: invokestatic  #220                // Method android/support/v4/b/a/a.h:(Landroid/graphics/drawable/Drawable;)I
      78: ifne          84
      81: goto          64
      84: aload_0
      85: getfield      #173                // Field c:F
      88: aload_0
      89: getfield      #173                // Field c:F
      92: fmul
      93: fconst_2
      94: fmul
      95: f2d
      96: invokestatic  #223                // Method java/lang/Math.sqrt:(D)D
      99: d2f
     100: fstore        6
     102: aload_0
     103: getfield      #168                // Field d:F
     106: fload         6
     108: aload_0
     109: getfield      #209                // Field k:F
     112: invokestatic  #225                // Method a:(FFF)F
     115: fstore        10
     117: aload_0
     118: getfield      #168                // Field d:F
     121: aload_0
     122: getfield      #178                // Field e:F
     125: aload_0
     126: getfield      #209                // Field k:F
     129: invokestatic  #225                // Method a:(FFF)F
     132: fstore        8
     134: fconst_0
     135: aload_0
     136: getfield      #194                // Field l:F
     139: aload_0
     140: getfield      #209                // Field k:F
     143: invokestatic  #225                // Method a:(FFF)F
     146: invokestatic  #153                // Method java/lang/Math.round:(F)I
     149: i2f
     150: fstore        9
     152: fconst_0
     153: getstatic     #34                 // Field b:F
     156: aload_0
     157: getfield      #209                // Field k:F
     160: invokestatic  #225                // Method a:(FFF)F
     163: fstore        11
     165: iload         13
     167: ifeq          176
     170: fconst_0
     171: fstore        6
     173: goto          180
     176: ldc           #226                // float -180.0f
     178: fstore        6
     180: iload         13
     182: ifeq          192
     185: ldc           #227                // float 180.0f
     187: fstore        7
     189: goto          195
     192: fconst_0
     193: fstore        7
     195: fload         6
     197: fload         7
     199: aload_0
     200: getfield      #209                // Field k:F
     203: invokestatic  #225                // Method a:(FFF)F
     206: fstore        6
     208: fload         10
     210: f2d
     211: dstore_2
     212: fload         11
     214: f2d
     215: dstore        4
     217: dload_2
     218: dload         4
     220: invokestatic  #192                // Method java/lang/Math.cos:(D)D
     223: dmul
     224: invokestatic  #230                // Method java/lang/Math.round:(D)J
     227: l2f
     228: fstore        7
     230: dload_2
     231: dload         4
     233: invokestatic  #233                // Method java/lang/Math.sin:(D)D
     236: dmul
     237: invokestatic  #230                // Method java/lang/Math.round:(D)J
     240: l2f
     241: fstore        10
     243: aload_0
     244: getfield      #49                 // Field h:Landroid/graphics/Path;
     247: invokevirtual #236                // Method android/graphics/Path.rewind:()V
     250: aload_0
     251: getfield      #207                // Field f:F
     254: aload_0
     255: getfield      #44                 // Field a:Landroid/graphics/Paint;
     258: invokevirtual #186                // Method android/graphics/Paint.getStrokeWidth:()F
     261: fadd
     262: aload_0
     263: getfield      #194                // Field l:F
     266: fneg
     267: aload_0
     268: getfield      #209                // Field k:F
     271: invokestatic  #225                // Method a:(FFF)F
     274: fstore        11
     276: fload         8
     278: fneg
     279: fconst_2
     280: fdiv
     281: fstore        12
     283: aload_0
     284: getfield      #49                 // Field h:Landroid/graphics/Path;
     287: fload         12
     289: fload         9
     291: fadd
     292: fconst_0
     293: invokevirtual #240                // Method android/graphics/Path.moveTo:(FF)V
     296: aload_0
     297: getfield      #49                 // Field h:Landroid/graphics/Path;
     300: fload         8
     302: fload         9
     304: fconst_2
     305: fmul
     306: fsub
     307: fconst_0
     308: invokevirtual #243                // Method android/graphics/Path.rLineTo:(FF)V
     311: aload_0
     312: getfield      #49                 // Field h:Landroid/graphics/Path;
     315: fload         12
     317: fload         11
     319: invokevirtual #240                // Method android/graphics/Path.moveTo:(FF)V
     322: aload_0
     323: getfield      #49                 // Field h:Landroid/graphics/Path;
     326: fload         7
     328: fload         10
     330: invokevirtual #243                // Method android/graphics/Path.rLineTo:(FF)V
     333: aload_0
     334: getfield      #49                 // Field h:Landroid/graphics/Path;
     337: fload         12
     339: fload         11
     341: fneg
     342: invokevirtual #240                // Method android/graphics/Path.moveTo:(FF)V
     345: aload_0
     346: getfield      #49                 // Field h:Landroid/graphics/Path;
     349: fload         7
     351: fload         10
     353: fneg
     354: invokevirtual #243                // Method android/graphics/Path.rLineTo:(FF)V
     357: aload_0
     358: getfield      #49                 // Field h:Landroid/graphics/Path;
     361: invokevirtual #246                // Method android/graphics/Path.close:()V
     364: aload_1
     365: invokevirtual #251                // Method android/graphics/Canvas.save:()I
     368: pop
     369: aload_0
     370: getfield      #44                 // Field a:Landroid/graphics/Paint;
     373: invokevirtual #186                // Method android/graphics/Paint.getStrokeWidth:()F
     376: fstore        7
     378: aload         17
     380: invokevirtual #256                // Method android/graphics/Rect.height:()I
     383: i2f
     384: ldc_w         #257                // float 3.0f
     387: fload         7
     389: fmul
     390: fsub
     391: aload_0
     392: getfield      #207                // Field f:F
     395: fconst_2
     396: fmul
     397: fsub
     398: f2i
     399: iconst_4
     400: idiv
     401: iconst_2
     402: imul
     403: i2f
     404: fstore        8
     406: aload_0
     407: getfield      #207                // Field f:F
     410: fstore        9
     412: aload_1
     413: aload         17
     415: invokevirtual #260                // Method android/graphics/Rect.centerX:()I
     418: i2f
     419: fload         8
     421: fload         7
     423: ldc_w         #261                // float 1.5f
     426: fmul
     427: fload         9
     429: fadd
     430: fadd
     431: invokevirtual #264                // Method android/graphics/Canvas.translate:(FF)V
     434: aload_0
     435: getfield      #205                // Field g:Z
     438: ifeq          467
     441: aload_0
     442: getfield      #51                 // Field j:Z
     445: iload         13
     447: ixor
     448: ifeq          454
     451: iconst_m1
     452: istore        14
     454: aload_1
     455: fload         6
     457: iload         14
     459: i2f
     460: fmul
     461: invokevirtual #267                // Method android/graphics/Canvas.rotate:(F)V
     464: goto          478
     467: iload         13
     469: ifeq          478
     472: aload_1
     473: ldc           #227                // float 180.0f
     475: invokevirtual #267                // Method android/graphics/Canvas.rotate:(F)V
     478: aload_1
     479: aload_0
     480: getfield      #49                 // Field h:Landroid/graphics/Path;
     483: aload_0
     484: getfield      #44                 // Field a:Landroid/graphics/Paint;
     487: invokevirtual #271                // Method android/graphics/Canvas.drawPath:(Landroid/graphics/Path;Landroid/graphics/Paint;)V
     490: aload_1
     491: invokevirtual #274                // Method android/graphics/Canvas.restore:()V
     494: return

  public int getIntrinsicHeight();
    Code:
       0: aload_0
       1: getfield      #163                // Field i:I
       4: ireturn

  public int getIntrinsicWidth();
    Code:
       0: aload_0
       1: getfield      #163                // Field i:I
       4: ireturn

  public int getOpacity();
    Code:
       0: bipush        -3
       2: ireturn

  public void setAlpha(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #44                 // Field a:Landroid/graphics/Paint;
       5: invokevirtual #281                // Method android/graphics/Paint.getAlpha:()I
       8: if_icmpeq     23
      11: aload_0
      12: getfield      #44                 // Field a:Landroid/graphics/Paint;
      15: iload_1
      16: invokevirtual #283                // Method android/graphics/Paint.setAlpha:(I)V
      19: aload_0
      20: invokevirtual #197                // Method invalidateSelf:()V
      23: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: getfield      #44                 // Field a:Landroid/graphics/Paint;
       4: aload_1
       5: invokevirtual #288                // Method android/graphics/Paint.setColorFilter:(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
       8: pop
       9: aload_0
      10: invokevirtual #197                // Method invalidateSelf:()V
      13: return
}
