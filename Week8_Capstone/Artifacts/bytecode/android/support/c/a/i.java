public class android.support.c.a.i extends android.support.c.a.h {
  static final android.graphics.PorterDuff$Mode a;

  static {};
    Code:
       0: getstatic     #45                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
       3: putstatic     #47                 // Field a:Landroid/graphics/PorterDuff$Mode;
       6: return

  android.support.c.a.i();
    Code:
       0: aload_0
       1: invokespecial #51                 // Method android/support/c/a/h."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #53                 // Field g:Z
       9: aload_0
      10: bipush        9
      12: newarray       float
      14: putfield      #55                 // Field i:[F
      17: aload_0
      18: new           #57                 // class android/graphics/Matrix
      21: dup
      22: invokespecial #58                 // Method android/graphics/Matrix."<init>":()V
      25: putfield      #60                 // Field j:Landroid/graphics/Matrix;
      28: aload_0
      29: new           #62                 // class android/graphics/Rect
      32: dup
      33: invokespecial #63                 // Method android/graphics/Rect."<init>":()V
      36: putfield      #65                 // Field k:Landroid/graphics/Rect;
      39: aload_0
      40: new           #21                 // class android/support/c/a/i$f
      43: dup
      44: invokespecial #66                 // Method android/support/c/a/i$f."<init>":()V
      47: putfield      #68                 // Field c:Landroid/support/c/a/i$f;
      50: return

  android.support.c.a.i(android.support.c.a.i$f);
    Code:
       0: aload_0
       1: invokespecial #51                 // Method android/support/c/a/h."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #53                 // Field g:Z
       9: aload_0
      10: bipush        9
      12: newarray       float
      14: putfield      #55                 // Field i:[F
      17: aload_0
      18: new           #57                 // class android/graphics/Matrix
      21: dup
      22: invokespecial #58                 // Method android/graphics/Matrix."<init>":()V
      25: putfield      #60                 // Field j:Landroid/graphics/Matrix;
      28: aload_0
      29: new           #62                 // class android/graphics/Rect
      32: dup
      33: invokespecial #63                 // Method android/graphics/Rect."<init>":()V
      36: putfield      #65                 // Field k:Landroid/graphics/Rect;
      39: aload_0
      40: aload_1
      41: putfield      #68                 // Field c:Landroid/support/c/a/i$f;
      44: aload_0
      45: aload_0
      46: aload_0
      47: getfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      50: aload_1
      51: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      54: aload_1
      55: getfield      #76                 // Field android/support/c/a/i$f.d:Landroid/graphics/PorterDuff$Mode;
      58: invokevirtual #79                 // Method a:(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
      61: putfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      64: return

  static int a(int, float);
    Code:
       0: iload_0
       1: ldc           #81                 // int 16777215
       3: iand
       4: iload_0
       5: invokestatic  #87                 // Method android/graphics/Color.alpha:(I)I
       8: i2f
       9: fload_1
      10: fmul
      11: f2i
      12: bipush        24
      14: ishl
      15: ior
      16: ireturn

  public static android.support.c.a.i a(android.content.res.Resources, int, android.content.res.Resources$Theme);
    Code:
       0: getstatic     #114                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        24
       5: if_icmplt     46
       8: new           #2                  // class android/support/c/a/i
      11: dup
      12: invokespecial #115                // Method "<init>":()V
      15: astore_3
      16: aload_3
      17: aload_0
      18: iload_1
      19: aload_2
      20: invokestatic  #120                // Method android/support/v4/a/a/b.a:(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
      23: putfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      26: aload_3
      27: new           #24                 // class android/support/c/a/i$g
      30: dup
      31: aload_3
      32: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      35: invokevirtual #129                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      38: invokespecial #132                // Method android/support/c/a/i$g."<init>":(Landroid/graphics/drawable/Drawable$ConstantState;)V
      41: putfield      #134                // Field h:Landroid/graphics/drawable/Drawable$ConstantState;
      44: aload_3
      45: areturn
      46: aload_0
      47: iload_1
      48: invokevirtual #140                // Method android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
      51: astore_3
      52: aload_3
      53: invokestatic  #146                // Method android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
      56: astore        4
      58: aload_3
      59: invokeinterface #152,  1          // InterfaceMethod org/xmlpull/v1/XmlPullParser.next:()I
      64: istore_1
      65: iload_1
      66: iconst_2
      67: if_icmpeq     78
      70: iload_1
      71: iconst_1
      72: if_icmpeq     78
      75: goto          58
      78: iload_1
      79: iconst_2
      80: if_icmpeq     93
      83: new           #106                // class org/xmlpull/v1/XmlPullParserException
      86: dup
      87: ldc           #154                // String No start tag found
      89: invokespecial #157                // Method org/xmlpull/v1/XmlPullParserException."<init>":(Ljava/lang/String;)V
      92: athrow
      93: aload_0
      94: aload_3
      95: aload         4
      97: aload_2
      98: invokestatic  #160                // Method a:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/support/c/a/i;
     101: astore_0
     102: aload_0
     103: areturn
     104: astore_0
     105: ldc           #162                // String VectorDrawableCompat
     107: ldc           #164                // String parser error
     109: aload_0
     110: invokestatic  #169                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     113: pop
     114: aconst_null
     115: areturn
    Exception table:
       from    to  target type
          46    58   104   Class org/xmlpull/v1/XmlPullParserException
          46    58   104   Class java/io/IOException
          58    65   104   Class org/xmlpull/v1/XmlPullParserException
          58    65   104   Class java/io/IOException
          83    93   104   Class org/xmlpull/v1/XmlPullParserException
          83    93   104   Class java/io/IOException
          93   102   104   Class org/xmlpull/v1/XmlPullParserException
          93   102   104   Class java/io/IOException

  public static android.support.c.a.i a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme);
    Code:
       0: new           #2                  // class android/support/c/a/i
       3: dup
       4: invokespecial #115                // Method "<init>":()V
       7: astore        4
       9: aload         4
      11: aload_0
      12: aload_1
      13: aload_2
      14: aload_3
      15: invokevirtual #173                // Method inflate:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
      18: aload         4
      20: areturn

  android.graphics.PorterDuffColorFilter a(android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_2
       1: ifnull        29
       4: aload_3
       5: ifnonnull     11
       8: goto          29
      11: new           #348                // class android/graphics/PorterDuffColorFilter
      14: dup
      15: aload_2
      16: aload_0
      17: invokevirtual #352                // Method getState:()[I
      20: iconst_0
      21: invokevirtual #358                // Method android/content/res/ColorStateList.getColorForState:([II)I
      24: aload_3
      25: invokespecial #361                // Method android/graphics/PorterDuffColorFilter."<init>":(ILandroid/graphics/PorterDuff$Mode;)V
      28: areturn
      29: aconst_null
      30: areturn

  java.lang.Object a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
       4: getfield      #177                // Field android/support/c/a/i$f.b:Landroid/support/c/a/i$e;
       7: getfield      #260                // Field android/support/c/a/i$e.h:Landroid/support/v4/g/a;
      10: aload_1
      11: invokevirtual #366                // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
      14: areturn

  void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #53                 // Field g:Z
       5: return

  public void applyTheme(android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #371                // Method android/support/c/a/h.applyTheme:(Landroid/content/res/Resources$Theme;)V
       5: return

  public boolean canApplyTheme();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #375                // Method android/support/v4/b/a/a.d:(Landroid/graphics/drawable/Drawable;)Z
      14: pop
      15: iconst_0
      16: ireturn

  public void clearColorFilter();
    Code:
       0: aload_0
       1: invokespecial #378                // Method android/support/c/a/h.clearColorFilter:()V
       4: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #382                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      15: return
      16: aload_0
      17: aload_0
      18: getfield      #65                 // Field k:Landroid/graphics/Rect;
      21: invokevirtual #386                // Method copyBounds:(Landroid/graphics/Rect;)V
      24: aload_0
      25: getfield      #65                 // Field k:Landroid/graphics/Rect;
      28: invokevirtual #389                // Method android/graphics/Rect.width:()I
      31: ifle          346
      34: aload_0
      35: getfield      #65                 // Field k:Landroid/graphics/Rect;
      38: invokevirtual #392                // Method android/graphics/Rect.height:()I
      41: ifgt          45
      44: return
      45: aload_0
      46: getfield      #394                // Field e:Landroid/graphics/ColorFilter;
      49: ifnonnull     61
      52: aload_0
      53: getfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      56: astore        9
      58: goto          67
      61: aload_0
      62: getfield      #394                // Field e:Landroid/graphics/ColorFilter;
      65: astore        9
      67: aload_1
      68: aload_0
      69: getfield      #60                 // Field j:Landroid/graphics/Matrix;
      72: invokevirtual #400                // Method android/graphics/Canvas.getMatrix:(Landroid/graphics/Matrix;)V
      75: aload_0
      76: getfield      #60                 // Field j:Landroid/graphics/Matrix;
      79: aload_0
      80: getfield      #55                 // Field i:[F
      83: invokevirtual #404                // Method android/graphics/Matrix.getValues:([F)V
      86: aload_0
      87: getfield      #55                 // Field i:[F
      90: iconst_0
      91: faload
      92: invokestatic  #410                // Method java/lang/Math.abs:(F)F
      95: fstore_2
      96: aload_0
      97: getfield      #55                 // Field i:[F
     100: iconst_4
     101: faload
     102: invokestatic  #410                // Method java/lang/Math.abs:(F)F
     105: fstore_3
     106: aload_0
     107: getfield      #55                 // Field i:[F
     110: iconst_1
     111: faload
     112: invokestatic  #410                // Method java/lang/Math.abs:(F)F
     115: fstore        5
     117: aload_0
     118: getfield      #55                 // Field i:[F
     121: iconst_3
     122: faload
     123: invokestatic  #410                // Method java/lang/Math.abs:(F)F
     126: fstore        4
     128: fload         5
     130: fconst_0
     131: fcmpl
     132: ifne          142
     135: fload         4
     137: fconst_0
     138: fcmpl
     139: ifeq          146
     142: fconst_1
     143: fstore_2
     144: fconst_1
     145: fstore_3
     146: aload_0
     147: getfield      #65                 // Field k:Landroid/graphics/Rect;
     150: invokevirtual #389                // Method android/graphics/Rect.width:()I
     153: i2f
     154: fload_2
     155: fmul
     156: f2i
     157: istore        6
     159: aload_0
     160: getfield      #65                 // Field k:Landroid/graphics/Rect;
     163: invokevirtual #392                // Method android/graphics/Rect.height:()I
     166: i2f
     167: fload_3
     168: fmul
     169: f2i
     170: istore        7
     172: sipush        2048
     175: iload         6
     177: invokestatic  #414                // Method java/lang/Math.min:(II)I
     180: istore        6
     182: sipush        2048
     185: iload         7
     187: invokestatic  #414                // Method java/lang/Math.min:(II)I
     190: istore        7
     192: iload         6
     194: ifle          346
     197: iload         7
     199: ifgt          203
     202: return
     203: aload_1
     204: invokevirtual #417                // Method android/graphics/Canvas.save:()I
     207: istore        8
     209: aload_1
     210: aload_0
     211: getfield      #65                 // Field k:Landroid/graphics/Rect;
     214: getfield      #420                // Field android/graphics/Rect.left:I
     217: i2f
     218: aload_0
     219: getfield      #65                 // Field k:Landroid/graphics/Rect;
     222: getfield      #423                // Field android/graphics/Rect.top:I
     225: i2f
     226: invokevirtual #427                // Method android/graphics/Canvas.translate:(FF)V
     229: aload_0
     230: invokespecial #429                // Method a:()Z
     233: ifeq          257
     236: aload_1
     237: aload_0
     238: getfield      #65                 // Field k:Landroid/graphics/Rect;
     241: invokevirtual #389                // Method android/graphics/Rect.width:()I
     244: i2f
     245: fconst_0
     246: invokevirtual #427                // Method android/graphics/Canvas.translate:(FF)V
     249: aload_1
     250: ldc_w         #430                // float -1.0f
     253: fconst_1
     254: invokevirtual #433                // Method android/graphics/Canvas.scale:(FF)V
     257: aload_0
     258: getfield      #65                 // Field k:Landroid/graphics/Rect;
     261: iconst_0
     262: iconst_0
     263: invokevirtual #437                // Method android/graphics/Rect.offsetTo:(II)V
     266: aload_0
     267: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
     270: iload         6
     272: iload         7
     274: invokevirtual #439                // Method android/support/c/a/i$f.b:(II)V
     277: aload_0
     278: getfield      #53                 // Field g:Z
     281: ifne          298
     284: aload_0
     285: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
     288: iload         6
     290: iload         7
     292: invokevirtual #441                // Method android/support/c/a/i$f.a:(II)V
     295: goto          326
     298: aload_0
     299: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
     302: invokevirtual #443                // Method android/support/c/a/i$f.b:()Z
     305: ifne          326
     308: aload_0
     309: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
     312: iload         6
     314: iload         7
     316: invokevirtual #441                // Method android/support/c/a/i$f.a:(II)V
     319: aload_0
     320: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
     323: invokevirtual #445                // Method android/support/c/a/i$f.c:()V
     326: aload_0
     327: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
     330: aload_1
     331: aload         9
     333: aload_0
     334: getfield      #65                 // Field k:Landroid/graphics/Rect;
     337: invokevirtual #448                // Method android/support/c/a/i$f.a:(Landroid/graphics/Canvas;Landroid/graphics/ColorFilter;Landroid/graphics/Rect;)V
     340: aload_1
     341: iload         8
     343: invokevirtual #452                // Method android/graphics/Canvas.restoreToCount:(I)V
     346: return

  public int getAlpha();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #454                // Method android/support/v4/b/a/a.c:(Landroid/graphics/drawable/Drawable;)I
      14: ireturn
      15: aload_0
      16: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      19: getfield      #177                // Field android/support/c/a/i$f.b:Landroid/support/c/a/i$e;
      22: invokevirtual #457                // Method android/support/c/a/i$e.getRootAlpha:()I
      25: ireturn

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #460                // Method android/graphics/drawable/Drawable.getChangingConfigurations:()I
      14: ireturn
      15: aload_0
      16: invokespecial #461                // Method android/support/c/a/h.getChangingConfigurations:()I
      19: aload_0
      20: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      23: invokevirtual #462                // Method android/support/c/a/i$f.getChangingConfigurations:()I
      26: ior
      27: ireturn

  public android.graphics.ColorFilter getColorFilter();
    Code:
       0: aload_0
       1: invokespecial #466                // Method android/support/c/a/h.getColorFilter:()Landroid/graphics/ColorFilter;
       4: areturn

  public android.graphics.drawable.Drawable$ConstantState getConstantState();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        30
       7: getstatic     #114                // Field android/os/Build$VERSION.SDK_INT:I
      10: bipush        24
      12: if_icmplt     30
      15: new           #24                 // class android/support/c/a/i$g
      18: dup
      19: aload_0
      20: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      23: invokevirtual #129                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      26: invokespecial #132                // Method android/support/c/a/i$g."<init>":(Landroid/graphics/drawable/Drawable$ConstantState;)V
      29: areturn
      30: aload_0
      31: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      34: aload_0
      35: invokevirtual #467                // Method getChangingConfigurations:()I
      38: putfield      #323                // Field android/support/c/a/i$f.a:I
      41: aload_0
      42: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      45: areturn

  public android.graphics.drawable.Drawable getCurrent();
    Code:
       0: aload_0
       1: invokespecial #471                // Method android/support/c/a/h.getCurrent:()Landroid/graphics/drawable/Drawable;
       4: areturn

  public int getIntrinsicHeight();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #474                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
      14: ireturn
      15: aload_0
      16: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      19: getfield      #177                // Field android/support/c/a/i$f.b:Landroid/support/c/a/i$e;
      22: getfield      #237                // Field android/support/c/a/i$e.c:F
      25: f2i
      26: ireturn

  public int getIntrinsicWidth();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #477                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
      14: ireturn
      15: aload_0
      16: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      19: getfield      #177                // Field android/support/c/a/i$f.b:Landroid/support/c/a/i$e;
      22: getfield      #231                // Field android/support/c/a/i$e.b:F
      25: f2i
      26: ireturn

  public int getMinimumHeight();
    Code:
       0: aload_0
       1: invokespecial #480                // Method android/support/c/a/h.getMinimumHeight:()I
       4: ireturn

  public int getMinimumWidth();
    Code:
       0: aload_0
       1: invokespecial #483                // Method android/support/c/a/h.getMinimumWidth:()I
       4: ireturn

  public int getOpacity();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #486                // Method android/graphics/drawable/Drawable.getOpacity:()I
      14: ireturn
      15: bipush        -3
      17: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #490                // Method android/support/c/a/h.getPadding:(Landroid/graphics/Rect;)Z
       5: ireturn

  public int[] getState();
    Code:
       0: aload_0
       1: invokespecial #491                // Method android/support/c/a/h.getState:()[I
       4: areturn

  public android.graphics.Region getTransparentRegion();
    Code:
       0: aload_0
       1: invokespecial #495                // Method android/support/c/a/h.getTransparentRegion:()Landroid/graphics/Region;
       4: areturn

  public void inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        18
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: aload_2
      13: aload_3
      14: invokevirtual #498                // Method android/graphics/drawable/Drawable.inflate:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
      17: return
      18: aload_0
      19: aload_1
      20: aload_2
      21: aload_3
      22: aconst_null
      23: invokevirtual #173                // Method inflate:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
      26: return

  public void inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        20
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: aload_2
      13: aload_3
      14: aload         4
      16: invokestatic  #501                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
      19: return
      20: aload_0
      21: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      24: astore        5
      26: aload         5
      28: new           #18                 // class android/support/c/a/i$e
      31: dup
      32: invokespecial #502                // Method android/support/c/a/i$e."<init>":()V
      35: putfield      #177                // Field android/support/c/a/i$f.b:Landroid/support/c/a/i$e;
      38: aload_1
      39: aload         4
      41: aload_3
      42: getstatic     #507                // Field android/support/c/a/a.a:[I
      45: invokestatic  #510                // Method android/support/v4/a/a/c.a:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      48: astore        6
      50: aload_0
      51: aload         6
      53: aload_2
      54: invokespecial #512                // Method a:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
      57: aload         6
      59: invokevirtual #515                // Method android/content/res/TypedArray.recycle:()V
      62: aload         5
      64: aload_0
      65: invokevirtual #467                // Method getChangingConfigurations:()I
      68: putfield      #323                // Field android/support/c/a/i$f.a:I
      71: aload         5
      73: iconst_1
      74: putfield      #517                // Field android/support/c/a/i$f.k:Z
      77: aload_0
      78: aload_1
      79: aload_2
      80: aload_3
      81: aload         4
      83: invokespecial #519                // Method b:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
      86: aload_0
      87: aload_0
      88: aload_0
      89: getfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      92: aload         5
      94: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      97: aload         5
      99: getfield      #76                 // Field android/support/c/a/i$f.d:Landroid/graphics/PorterDuff$Mode;
     102: invokevirtual #79                 // Method a:(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
     105: putfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
     108: return

  public void invalidateSelf();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #522                // Method android/graphics/drawable/Drawable.invalidateSelf:()V
      14: return
      15: aload_0
      16: invokespecial #523                // Method android/support/c/a/h.invalidateSelf:()V
      19: return

  public boolean isAutoMirrored();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #525                // Method android/support/v4/b/a/a.b:(Landroid/graphics/drawable/Drawable;)Z
      14: ireturn
      15: aload_0
      16: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      19: getfield      #196                // Field android/support/c/a/i$f.e:Z
      22: ireturn

  public boolean isStateful();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #528                // Method android/graphics/drawable/Drawable.isStateful:()Z
      14: ireturn
      15: aload_0
      16: invokespecial #529                // Method android/support/c/a/h.isStateful:()Z
      19: ifne          57
      22: aload_0
      23: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      26: ifnull        55
      29: aload_0
      30: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      33: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      36: ifnull        55
      39: aload_0
      40: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      43: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      46: invokevirtual #530                // Method android/content/res/ColorStateList.isStateful:()Z
      49: ifeq          55
      52: goto          57
      55: iconst_0
      56: ireturn
      57: iconst_1
      58: ireturn

  public void jumpToCurrentState();
    Code:
       0: aload_0
       1: invokespecial #533                // Method android/support/c/a/h.jumpToCurrentState:()V
       4: return

  public android.graphics.drawable.Drawable mutate();
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        17
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #536                // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      14: pop
      15: aload_0
      16: areturn
      17: aload_0
      18: getfield      #538                // Field f:Z
      21: ifne          52
      24: aload_0
      25: invokespecial #539                // Method android/support/c/a/h.mutate:()Landroid/graphics/drawable/Drawable;
      28: aload_0
      29: if_acmpne     52
      32: aload_0
      33: new           #21                 // class android/support/c/a/i$f
      36: dup
      37: aload_0
      38: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      41: invokespecial #541                // Method android/support/c/a/i$f."<init>":(Landroid/support/c/a/i$f;)V
      44: putfield      #68                 // Field c:Landroid/support/c/a/i$f;
      47: aload_0
      48: iconst_1
      49: putfield      #538                // Field f:Z
      52: aload_0
      53: areturn

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #545                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
      15: return

  protected boolean onStateChange(int[]);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #550                // Method android/graphics/drawable/Drawable.setState:([I)Z
      15: ireturn
      16: aload_0
      17: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      20: astore_1
      21: aload_1
      22: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      25: ifnull        61
      28: aload_1
      29: getfield      #76                 // Field android/support/c/a/i$f.d:Landroid/graphics/PorterDuff$Mode;
      32: ifnull        61
      35: aload_0
      36: aload_0
      37: aload_0
      38: getfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      41: aload_1
      42: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      45: aload_1
      46: getfield      #76                 // Field android/support/c/a/i$f.d:Landroid/graphics/PorterDuff$Mode;
      49: invokevirtual #79                 // Method a:(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
      52: putfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      55: aload_0
      56: invokevirtual #551                // Method invalidateSelf:()V
      59: iconst_1
      60: ireturn
      61: iconst_0
      62: ireturn

  public void scheduleSelf(java.lang.Runnable, long);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        17
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: lload_2
      13: invokevirtual #555                // Method android/graphics/drawable/Drawable.scheduleSelf:(Ljava/lang/Runnable;J)V
      16: return
      17: aload_0
      18: aload_1
      19: lload_2
      20: invokespecial #556                // Method android/support/c/a/h.scheduleSelf:(Ljava/lang/Runnable;J)V
      23: return

  public void setAlpha(int);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokevirtual #558                // Method android/graphics/drawable/Drawable.setAlpha:(I)V
      15: return
      16: aload_0
      17: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      20: getfield      #177                // Field android/support/c/a/i$f.b:Landroid/support/c/a/i$e;
      23: invokevirtual #457                // Method android/support/c/a/i$e.getRootAlpha:()I
      26: iload_1
      27: if_icmpeq     45
      30: aload_0
      31: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      34: getfield      #177                // Field android/support/c/a/i$f.b:Landroid/support/c/a/i$e;
      37: iload_1
      38: invokevirtual #561                // Method android/support/c/a/i$e.setRootAlpha:(I)V
      41: aload_0
      42: invokevirtual #551                // Method invalidateSelf:()V
      45: return

  public void setAutoMirrored(boolean);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokestatic  #565                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Z)V
      15: return
      16: aload_0
      17: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      20: iload_1
      21: putfield      #196                // Field android/support/c/a/i$f.e:Z
      24: return

  public void setChangingConfigurations(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #568                // Method android/support/c/a/h.setChangingConfigurations:(I)V
       5: return

  public void setColorFilter(int, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokespecial #571                // Method android/support/c/a/h.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
       6: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #574                // Method android/graphics/drawable/Drawable.setColorFilter:(Landroid/graphics/ColorFilter;)V
      15: return
      16: aload_0
      17: aload_1
      18: putfield      #394                // Field e:Landroid/graphics/ColorFilter;
      21: aload_0
      22: invokevirtual #551                // Method invalidateSelf:()V
      25: return

  public void setFilterBitmap(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #577                // Method android/support/c/a/h.setFilterBitmap:(Z)V
       5: return

  public void setHotspot(float, float);
    Code:
       0: aload_0
       1: fload_1
       2: fload_2
       3: invokespecial #580                // Method android/support/c/a/h.setHotspot:(FF)V
       6: return

  public void setHotspotBounds(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #584                // Method android/support/c/a/h.setHotspotBounds:(IIII)V
       9: return

  public boolean setState(int[]);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #585                // Method android/support/c/a/h.setState:([I)Z
       5: ireturn

  public void setTint(int);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokestatic  #589                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;I)V
      15: return
      16: aload_0
      17: iload_1
      18: invokestatic  #592                // Method android/content/res/ColorStateList.valueOf:(I)Landroid/content/res/ColorStateList;
      21: invokevirtual #596                // Method setTintList:(Landroid/content/res/ColorStateList;)V
      24: return

  public void setTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #599                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
      15: return
      16: aload_0
      17: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      20: astore_2
      21: aload_2
      22: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      25: aload_1
      26: if_acmpeq     55
      29: aload_2
      30: aload_1
      31: putfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      34: aload_0
      35: aload_0
      36: aload_0
      37: getfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      40: aload_1
      41: aload_2
      42: getfield      #76                 // Field android/support/c/a/i$f.d:Landroid/graphics/PorterDuff$Mode;
      45: invokevirtual #79                 // Method a:(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
      48: putfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      51: aload_0
      52: invokevirtual #551                // Method invalidateSelf:()V
      55: return

  public void setTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #604                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
      15: return
      16: aload_0
      17: getfield      #68                 // Field c:Landroid/support/c/a/i$f;
      20: astore_2
      21: aload_2
      22: getfield      #76                 // Field android/support/c/a/i$f.d:Landroid/graphics/PorterDuff$Mode;
      25: aload_1
      26: if_acmpeq     55
      29: aload_2
      30: aload_1
      31: putfield      #76                 // Field android/support/c/a/i$f.d:Landroid/graphics/PorterDuff$Mode;
      34: aload_0
      35: aload_0
      36: aload_0
      37: getfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      40: aload_2
      41: getfield      #74                 // Field android/support/c/a/i$f.c:Landroid/content/res/ColorStateList;
      44: aload_1
      45: invokevirtual #79                 // Method a:(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
      48: putfield      #71                 // Field d:Landroid/graphics/PorterDuffColorFilter;
      51: aload_0
      52: invokevirtual #551                // Method invalidateSelf:()V
      55: return

  public boolean setVisible(boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        17
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: iload_2
      13: invokevirtual #608                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
      16: ireturn
      17: aload_0
      18: iload_1
      19: iload_2
      20: invokespecial #609                // Method android/support/c/a/h.setVisible:(ZZ)Z
      23: ireturn

  public void unscheduleSelf(java.lang.Runnable);
    Code:
       0: aload_0
       1: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #123                // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #613                // Method android/graphics/drawable/Drawable.unscheduleSelf:(Ljava/lang/Runnable;)V
      15: return
      16: aload_0
      17: aload_1
      18: invokespecial #614                // Method android/support/c/a/h.unscheduleSelf:(Ljava/lang/Runnable;)V
      21: return
}
