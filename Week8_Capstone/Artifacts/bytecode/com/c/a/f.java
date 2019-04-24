public class com.c.a.f implements android.view.ViewTreeObserver$OnGlobalLayoutListener,com.c.a.e {
  public static final com.c.a.f$a b;

  static {};
    Code:
       0: new           #10                 // class com/c/a/f$a
       3: dup
       4: aconst_null
       5: invokespecial #101                // Method com/c/a/f$a."<init>":(La/b/b/a;)V
       8: putstatic     #103                // Field b:Lcom/c/a/f$a;
      11: new           #105                // class android/view/animation/AccelerateDecelerateInterpolator
      14: dup
      15: invokespecial #107                // Method android/view/animation/AccelerateDecelerateInterpolator."<init>":()V
      18: putstatic     #109                // Field P:Landroid/view/animation/AccelerateDecelerateInterpolator;
      21: getstatic     #114                // Field com/c/a/h.a:Lcom/c/a/h$a;
      24: astore_0
      25: getstatic     #116                // Field Q:Ljava/lang/String;
      28: astore_1
      29: aload_1
      30: ldc           #118                // String TAG
      32: invokestatic  #123                // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      35: aload_0
      36: aload_1
      37: invokevirtual #128                // Method com/c/a/h$a.a:(Ljava/lang/String;)Lcom/c/a/h;
      40: putstatic     #130                // Field R:Lcom/c/a/h;
      43: return

  public com.c.a.f(android.content.Context);
    Code:
       0: aload_1
       1: ldc           #134                // String context
       3: invokestatic  #136                // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: invokespecial #137                // Method java/lang/Object."<init>":()V
      10: aload_0
      11: ldc           #138                // float 0.8f
      13: putfield      #140                // Field c:F
      16: aload_0
      17: ldc           #141                // float 2.5f
      19: putfield      #143                // Field e:F
      22: aload_0
      23: iconst_1
      24: putfield      #145                // Field g:Z
      27: aload_0
      28: iconst_1
      29: putfield      #147                // Field h:Z
      32: aload_0
      33: iconst_1
      34: putfield      #149                // Field i:Z
      37: aload_0
      38: iconst_1
      39: putfield      #151                // Field j:Z
      42: aload_0
      43: iconst_1
      44: putfield      #153                // Field k:Z
      47: aload_0
      48: iconst_1
      49: putfield      #155                // Field l:Z
      52: aload_0
      53: iconst_1
      54: putfield      #157                // Field m:Z
      57: aload_0
      58: bipush        51
      60: putfield      #159                // Field q:I
      63: aload_0
      64: new           #161                // class java/util/ArrayList
      67: dup
      68: invokespecial #162                // Method java/util/ArrayList."<init>":()V
      71: checkcast     #164                // class java/util/List
      74: putfield      #166                // Field r:Ljava/util/List;
      77: aload_0
      78: new           #168                // class android/graphics/Matrix
      81: dup
      82: invokespecial #169                // Method android/graphics/Matrix."<init>":()V
      85: putfield      #171                // Field s:Landroid/graphics/Matrix;
      88: aload_0
      89: new           #173                // class android/graphics/RectF
      92: dup
      93: invokespecial #174                // Method android/graphics/RectF."<init>":()V
      96: putfield      #176                // Field z:Landroid/graphics/RectF;
      99: aload_0
     100: new           #173                // class android/graphics/RectF
     103: dup
     104: invokespecial #174                // Method android/graphics/RectF."<init>":()V
     107: putfield      #178                // Field A:Landroid/graphics/RectF;
     110: aload_0
     111: ldc2_w        #179                // long 280l
     114: putfield      #182                // Field C:J
     117: aload_0
     118: new           #184                // class android/view/ScaleGestureDetector
     121: dup
     122: aload_1
     123: new           #19                 // class com/c/a/f$d
     126: dup
     127: aload_0
     128: invokespecial #187                // Method com/c/a/f$d."<init>":(Lcom/c/a/f;)V
     131: checkcast     #189                // class android/view/ScaleGestureDetector$OnScaleGestureListener
     134: invokespecial #192                // Method android/view/ScaleGestureDetector."<init>":(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V
     137: putfield      #194                // Field D:Landroid/view/ScaleGestureDetector;
     140: aload_0
     141: new           #196                // class android/view/GestureDetector
     144: dup
     145: aload_1
     146: new           #13                 // class com/c/a/f$b
     149: dup
     150: aload_0
     151: invokespecial #197                // Method com/c/a/f$b."<init>":(Lcom/c/a/f;)V
     154: checkcast     #199                // class android/view/GestureDetector$OnGestureListener
     157: invokespecial #202                // Method android/view/GestureDetector."<init>":(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
     160: putfield      #204                // Field E:Landroid/view/GestureDetector;
     163: aload_0
     164: new           #206                // class android/widget/OverScroller
     167: dup
     168: aload_1
     169: invokespecial #208                // Method android/widget/OverScroller."<init>":(Landroid/content/Context;)V
     172: putfield      #210                // Field F:Landroid/widget/OverScroller;
     175: aload_0
     176: new           #22                 // class com/c/a/f$e
     179: dup
     180: invokespecial #211                // Method com/c/a/f$e."<init>":()V
     183: putfield      #213                // Field G:Lcom/c/a/f$e;
     186: aload_0
     187: new           #22                 // class com/c/a/f$e
     190: dup
     191: invokespecial #211                // Method com/c/a/f$e."<init>":()V
     194: putfield      #215                // Field H:Lcom/c/a/f$e;
     197: aload_0
     198: fconst_1
     199: putfield      #217                // Field I:F
     202: aload_0
     203: new           #168                // class android/graphics/Matrix
     206: dup
     207: invokespecial #169                // Method android/graphics/Matrix."<init>":()V
     210: putfield      #219                // Field J:Landroid/graphics/Matrix;
     213: aload_0
     214: new           #221                // class com/c/a/a
     217: dup
     218: fconst_0
     219: fconst_0
     220: iconst_3
     221: aconst_null
     222: invokespecial #224                // Method com/c/a/a."<init>":(FFILa/b/b/a;)V
     225: putfield      #226                // Field K:Lcom/c/a/a;
     228: aload_0
     229: new           #228                // class com/c/a/d
     232: dup
     233: fconst_0
     234: fconst_0
     235: iconst_3
     236: aconst_null
     237: invokespecial #229                // Method com/c/a/d."<init>":(FFILa/b/b/a;)V
     240: putfield      #231                // Field L:Lcom/c/a/d;
     243: getstatic     #236                // Field android/os/Build$VERSION.SDK_INT:I
     246: bipush        19
     248: if_icmplt     259
     251: aload_0
     252: getfield      #194                // Field D:Landroid/view/ScaleGestureDetector;
     255: iconst_0
     256: invokevirtual #240                // Method android/view/ScaleGestureDetector.setQuickScaleEnabled:(Z)V
     259: aload_0
     260: getfield      #204                // Field E:Landroid/view/GestureDetector;
     263: aconst_null
     264: invokevirtual #244                // Method android/view/GestureDetector.setOnDoubleTapListener:(Landroid/view/GestureDetector$OnDoubleTapListener;)V
     267: aload_0
     268: new           #228                // class com/c/a/d
     271: dup
     272: fconst_0
     273: fconst_0
     274: iconst_3
     275: aconst_null
     276: invokespecial #229                // Method com/c/a/d."<init>":(FFILa/b/b/a;)V
     279: putfield      #246                // Field M:Lcom/c/a/d;
     282: aload_0
     283: new           #35                 // class com/c/a/f$k
     286: dup
     287: aload_0
     288: invokespecial #247                // Method com/c/a/f$k."<init>":(Lcom/c/a/f;)V
     291: putfield      #249                // Field N:Lcom/c/a/f$k;
     294: return

  public static final float a(com.c.a.f, float, boolean);
    Code:
       0: aload_0
       1: fload_1
       2: iload_2
       3: invokespecial #278                // Method b:(FZ)F
       6: freturn

  public static final android.graphics.PointF a(com.c.a.f, com.c.a.a);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #315                // Method b:(Lcom/c/a/a;)Landroid/graphics/PointF;
       5: areturn

  public static final com.c.a.a a(com.c.a.f, float, float);
    Code:
       0: aload_0
       1: fload_1
       2: fload_2
       3: invokespecial #334                // Method a:(FF)Lcom/c/a/a;
       6: areturn

  public static final com.c.a.a a(com.c.a.f, com.c.a.d);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #327                // Method a:(Lcom/c/a/d;)Lcom/c/a/a;
       5: areturn

  public static final void a(com.c.a.f, float, float, float, boolean, boolean, java.lang.Float, java.lang.Float);
    Code:
       0: aload_0
       1: fload_1
       2: fload_2
       3: fload_3
       4: iload         4
       6: iload         5
       8: aload         6
      10: aload         7
      12: invokespecial #469                // Method a:(FFFZZLjava/lang/Float;Ljava/lang/Float;)V
      15: return

  static void a(com.c.a.f, float, float, float, boolean, boolean, java.lang.Float, java.lang.Float, boolean, int, java.lang.Object);
    Code:
       0: aload         10
       2: ifnull        16
       5: new           #472                // class java/lang/UnsupportedOperationException
       8: dup
       9: ldc_w         #474                // String Super calls with default arguments not supported in this target, function: applyZoomAndAbsolutePan
      12: invokespecial #476                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      15: athrow
      16: iload         9
      18: bipush        16
      20: iand
      21: ifeq          30
      24: iconst_0
      25: istore        5
      27: goto          30
      30: iload         9
      32: bipush        32
      34: iand
      35: ifeq          47
      38: aconst_null
      39: checkcast     #355                // class java/lang/Float
      42: astore        6
      44: goto          47
      47: iload         9
      49: bipush        64
      51: iand
      52: ifeq          64
      55: aconst_null
      56: checkcast     #355                // class java/lang/Float
      59: astore        7
      61: goto          64
      64: iload         9
      66: sipush        128
      69: iand
      70: ifeq          79
      73: iconst_1
      74: istore        8
      76: goto          79
      79: aload_0
      80: fload_1
      81: fload_2
      82: fload_3
      83: iload         4
      85: iload         5
      87: aload         6
      89: aload         7
      91: iload         8
      93: invokespecial #478                // Method a:(FFFZZLjava/lang/Float;Ljava/lang/Float;Z)V
      96: return

  public static final void a(com.c.a.f, float, float, boolean);
    Code:
       0: aload_0
       1: fload_1
       2: fload_2
       3: iload_3
       4: invokespecial #481                // Method d:(FFZ)V
       7: return

  public static void a(com.c.a.f, float, float, boolean, int, java.lang.Object);
    Code:
       0: aload         5
       2: ifnull        16
       5: new           #472                // class java/lang/UnsupportedOperationException
       8: dup
       9: ldc_w         #484                // String Super calls with default arguments not supported in this target, function: setContentSize
      12: invokespecial #476                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      15: athrow
      16: iload         4
      18: iconst_4
      19: iand
      20: ifeq          25
      23: iconst_0
      24: istore_3
      25: aload_0
      26: fload_1
      27: fload_2
      28: iload_3
      29: invokevirtual #486                // Method a:(FFZ)V
      32: return

  public static final void a(com.c.a.f, float, boolean, boolean, float, float, boolean);
    Code:
       0: aload_0
       1: fload_1
       2: iload_2
       3: iload_3
       4: fload         4
       6: fload         5
       8: iload         6
      10: invokespecial #489                // Method a:(FZZFFZ)V
      13: return

  static void a(com.c.a.f, float, boolean, boolean, float, float, boolean, int, java.lang.Object);
    Code:
       0: aload         8
       2: ifnull        16
       5: new           #472                // class java/lang/UnsupportedOperationException
       8: dup
       9: ldc_w         #492                // String Super calls with default arguments not supported in this target, function: applyZoom
      12: invokespecial #476                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      15: athrow
      16: iload         7
      18: iconst_4
      19: iand
      20: ifeq          28
      23: iconst_0
      24: istore_3
      25: goto          28
      28: iload         7
      30: bipush        8
      32: iand
      33: ifeq          44
      36: aload_0
      37: getfield      #285                // Field w:F
      40: fconst_2
      41: fdiv
      42: fstore        4
      44: iload         7
      46: bipush        16
      48: iand
      49: ifeq          60
      52: aload_0
      53: getfield      #287                // Field x:F
      56: fconst_2
      57: fdiv
      58: fstore        5
      60: iload         7
      62: bipush        32
      64: iand
      65: ifeq          74
      68: iconst_1
      69: istore        6
      71: goto          74
      74: aload_0
      75: fload_1
      76: iload_2
      77: iload_3
      78: fload         4
      80: fload         5
      82: iload         6
      84: invokespecial #489                // Method a:(FZZFFZ)V
      87: return

  public static final boolean a(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #155                // Field l:Z
       4: ireturn

  public static final boolean a(com.c.a.f, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #265                // Method d:(I)Z
       5: ireturn

  public static final boolean a(com.c.a.f, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #517                // Method b:(II)Z
       6: ireturn

  public static void b(com.c.a.f, float, float, boolean, int, java.lang.Object);
    Code:
       0: aload         5
       2: ifnull        16
       5: new           #472                // class java/lang/UnsupportedOperationException
       8: dup
       9: ldc_w         #532                // String Super calls with default arguments not supported in this target, function: setContainerSize
      12: invokespecial #476                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      15: athrow
      16: iload         4
      18: iconst_4
      19: iand
      20: ifeq          25
      23: iconst_0
      24: istore_3
      25: aload_0
      26: fload_1
      27: fload_2
      28: iload_3
      29: invokevirtual #534                // Method b:(FFZ)V
      32: return

  public static final void b(com.c.a.f, float, boolean);
    Code:
       0: aload_0
       1: fload_1
       2: iload_2
       3: invokespecial #538                // Method c:(FZ)V
       6: return

  public static final boolean b(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #153                // Field k:Z
       4: ireturn

  public static final boolean c(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #147                // Field h:Z
       4: ireturn

  public static final boolean d(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #145                // Field g:Z
       4: ireturn

  public static final float e(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #523                // Method z:()F
       4: freturn

  public static final float f(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #521                // Method A:()F
       4: freturn

  public static final com.c.a.d g(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #258                // Method y:()Lcom/c/a/d;
       4: areturn

  public static final float h(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #699                // Method n:()F
       4: freturn

  public static final float i(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #701                // Method o:()F
       4: freturn

  public static final float j(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #285                // Field w:F
       4: freturn

  public static final float k(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #287                // Field x:F
       4: freturn

  public static final com.c.a.h k();
    Code:
       0: getstatic     #130                // Field R:Lcom/c/a/h;
       3: areturn

  public static final boolean l(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #157                // Field m:Z
       4: ireturn

  public static final boolean m(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #149                // Field i:Z
       4: ireturn

  public static final boolean n(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #151                // Field j:Z
       4: ireturn

  public static final int o(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #294                // Method p:()I
       4: ireturn

  public static final boolean p(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #343                // Field B:Z
       4: ireturn

  public static final com.c.a.d q(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #321                // Method r:()Lcom/c/a/d;
       4: areturn

  public static final android.widget.OverScroller r(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #210                // Field F:Landroid/widget/OverScroller;
       4: areturn

  public static final float s(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #281                // Method s:()F
       4: freturn

  public static final float t(com.c.a.f);
    Code:
       0: aload_0
       1: invokespecial #283                // Method t:()F
       4: freturn

  public static final android.view.View u(com.c.a.f);
    Code:
       0: aload_0
       1: getfield      #374                // Field v:Landroid/view/View;
       4: astore_0
       5: aload_0
       6: ifnonnull     15
       9: ldc_w         #376                // String mContainer
      12: invokestatic  #379                // Method a/b/b/c.b:(Ljava/lang/String;)V
      15: aload_0
      16: areturn

  public float a();
    Code:
       0: aload_0
       1: getfield      #217                // Field I:F
       4: freturn

  public void a(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #217                // Field I:F
       5: return

  public final void a(float, float, boolean);
    Code:
       0: iconst_0
       1: i2f
       2: fstore        4
       4: fload_1
       5: fload         4
       7: fcmpg
       8: ifle          57
      11: fload_2
      12: fload         4
      14: fcmpg
      15: ifgt          19
      18: return
      19: aload_0
      20: invokespecial #699                // Method n:()F
      23: fload_1
      24: fcmpg
      25: ifne          41
      28: aload_0
      29: invokespecial #701                // Method o:()F
      32: fload_2
      33: fcmpg
      34: ifne          41
      37: iload_3
      38: ifeq          57
      41: aload_0
      42: getfield      #178                // Field A:Landroid/graphics/RectF;
      45: fconst_0
      46: fconst_0
      47: fload_1
      48: fload_2
      49: invokevirtual #824                // Method android/graphics/RectF.set:(FFFF)V
      52: aload_0
      53: iload_3
      54: invokespecial #826                // Method i:(Z)V
      57: return

  public void a(float, int);
    Code:
       0: fload_1
       1: iconst_0
       2: i2f
       3: fcmpg
       4: ifge          21
       7: new           #601                // class java/lang/IllegalArgumentException
      10: dup
      11: ldc_w         #829                // String Max zoom should be >= 0.
      14: invokespecial #606                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: checkcast     #608                // class java/lang/Throwable
      20: athrow
      21: aload_0
      22: fload_1
      23: putfield      #143                // Field e:F
      26: aload_0
      27: iload_2
      28: putfield      #821                // Field f:I
      31: aload_0
      32: invokevirtual #344                // Method a:()F
      35: aload_0
      36: invokespecial #523                // Method z:()F
      39: fcmpl
      40: ifle          52
      43: aload_0
      44: aload_0
      45: invokespecial #523                // Method z:()F
      48: iconst_1
      49: invokevirtual #831                // Method a:(FZ)V
      52: return

  public void a(float, boolean);
    Code:
       0: aload_0
       1: getfield      #676                // Field y:Z
       4: ifne          8
       7: return
       8: iload_2
       9: ifeq          19
      12: aload_0
      13: fload_1
      14: iconst_0
      15: invokespecial #538                // Method c:(FZ)V
      18: return
      19: aload_0
      20: fload_1
      21: iconst_0
      22: iconst_0
      23: fconst_0
      24: fconst_0
      25: iconst_0
      26: bipush        60
      28: aconst_null
      29: invokestatic  #738                // Method a:(Lcom/c/a/f;FZZFFZILjava/lang/Object;)V
      32: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #159                // Field q:I
       5: return

  public void a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #723                // Field o:I
       5: aload_0
       6: iload_2
       7: putfield      #817                // Field p:I
      10: return

  public void a(long);
    Code:
       0: aload_0
       1: lload_1
       2: putfield      #182                // Field C:J
       5: return

  public final void a(android.view.View);
    Code:
       0: aload_1
       1: ldc_w         #836                // String container
       4: invokestatic  #136                // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_0
       8: aload_1
       9: putfield      #374                // Field v:Landroid/view/View;
      12: aload_0
      13: getfield      #374                // Field v:Landroid/view/View;
      16: astore_1
      17: aload_1
      18: ifnonnull     27
      21: ldc_w         #376                // String mContainer
      24: invokestatic  #379                // Method a/b/b/c.b:(Ljava/lang/String;)V
      27: aload_1
      28: invokevirtual #840                // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      31: aload_0
      32: checkcast     #6                  // class android/view/ViewTreeObserver$OnGlobalLayoutListener
      35: invokevirtual #846                // Method android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      38: return

  public final void a(com.c.a.f$c);
    Code:
       0: aload_1
       1: ldc_w         #849                // String listener
       4: invokestatic  #136                // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_0
       8: getfield      #166                // Field r:Ljava/util/List;
      11: aload_1
      12: invokeinterface #853,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
      17: ifne          31
      20: aload_0
      21: getfield      #166                // Field r:Ljava/util/List;
      24: aload_1
      25: invokeinterface #856,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      30: pop
      31: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #145                // Field g:Z
       5: return

  public final boolean a(android.view.MotionEvent);
    Code:
       0: aload_1
       1: ldc_w         #858                // String ev
       4: invokestatic  #136                // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_0
       8: aload_1
       9: invokespecial #860                // Method c:(Landroid/view/MotionEvent;)I
      12: iconst_1
      13: if_icmple     18
      16: iconst_1
      17: ireturn
      18: iconst_0
      19: ireturn

  public final android.graphics.Matrix b();
    Code:
       0: aload_0
       1: getfield      #219                // Field J:Landroid/graphics/Matrix;
       4: aload_0
       5: getfield      #171                // Field s:Landroid/graphics/Matrix;
       8: invokevirtual #863                // Method android/graphics/Matrix.set:(Landroid/graphics/Matrix;)V
      11: aload_0
      12: getfield      #219                // Field J:Landroid/graphics/Matrix;
      15: areturn

  public final void b(float, float, boolean);
    Code:
       0: iconst_0
       1: i2f
       2: fstore        4
       4: fload_1
       5: fload         4
       7: fcmpg
       8: ifle          56
      11: fload_2
      12: fload         4
      14: fcmpg
      15: ifgt          19
      18: return
      19: fload_1
      20: aload_0
      21: getfield      #285                // Field w:F
      24: fcmpg
      25: ifne          41
      28: fload_2
      29: aload_0
      30: getfield      #287                // Field x:F
      33: fcmpg
      34: ifne          41
      37: iload_3
      38: ifeq          56
      41: aload_0
      42: fload_1
      43: putfield      #285                // Field w:F
      46: aload_0
      47: fload_2
      48: putfield      #287                // Field x:F
      51: aload_0
      52: iload_3
      53: invokespecial #826                // Method i:(Z)V
      56: return

  public void b(float, int);
    Code:
       0: fload_1
       1: iconst_0
       2: i2f
       3: fcmpg
       4: ifge          21
       7: new           #601                // class java/lang/IllegalArgumentException
      10: dup
      11: ldc_w         #865                // String Min zoom should be >= 0
      14: invokespecial #606                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: checkcast     #608                // class java/lang/Throwable
      20: athrow
      21: aload_0
      22: fload_1
      23: putfield      #140                // Field c:F
      26: aload_0
      27: iload_2
      28: putfield      #252                // Field d:I
      31: aload_0
      32: invokevirtual #344                // Method a:()F
      35: aload_0
      36: invokespecial #521                // Method A:()F
      39: fcmpg
      40: ifgt          52
      43: aload_0
      44: aload_0
      45: invokespecial #521                // Method A:()F
      48: iconst_1
      49: invokevirtual #831                // Method a:(FZ)V
      52: return

  public void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #870                // Method com/c/a/e$b.a:(Lcom/c/a/e;I)V
       5: return

  public void b(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #147                // Field h:Z
       5: return

  public final boolean b(android.view.MotionEvent);
    Code:
       0: aload_1
       1: ldc_w         #858                // String ev
       4: invokestatic  #136                // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_0
       8: aload_1
       9: invokespecial #860                // Method c:(Landroid/view/MotionEvent;)I
      12: ifle          17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn

  public float c();
    Code:
       0: aload_0
       1: invokevirtual #344                // Method a:()F
       4: aload_0
       5: getfield      #610                // Field t:F
       8: fmul
       9: freturn

  public void c(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #149                // Field i:Z
       5: return

  public com.c.a.a d();
    Code:
       0: aload_0
       1: getfield      #226                // Field K:Lcom/c/a/a;
       4: aload_0
       5: invokevirtual #872                // Method e:()F
       8: invokestatic  #359                // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      11: checkcast     #769                // class java/lang/Number
      14: aload_0
      15: invokevirtual #874                // Method f:()F
      18: invokestatic  #359                // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      21: checkcast     #769                // class java/lang/Number
      24: invokevirtual #875                // Method com/c/a/a.a:(Ljava/lang/Number;Ljava/lang/Number;)V
      27: aload_0
      28: getfield      #226                // Field K:Lcom/c/a/a;
      31: areturn

  public void d(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #151                // Field j:Z
       5: return

  public float e();
    Code:
       0: aload_0
       1: invokespecial #281                // Method s:()F
       4: aload_0
       5: invokevirtual #519                // Method c:()F
       8: fdiv
       9: freturn

  public void e(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #153                // Field k:Z
       5: return

  public float f();
    Code:
       0: aload_0
       1: invokespecial #283                // Method t:()F
       4: aload_0
       5: invokevirtual #519                // Method c:()F
       8: fdiv
       9: freturn

  public void f(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #155                // Field l:Z
       5: return

  public final int g();
    Code:
       0: aload_0
       1: invokespecial #281                // Method s:()F
       4: fneg
       5: f2i
       6: ireturn

  public void g(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #157                // Field m:Z
       5: return

  public final int h();
    Code:
       0: aload_0
       1: invokespecial #289                // Method l:()F
       4: f2i
       5: ireturn

  public void h(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #548                // Field n:Z
       5: return

  public final int i();
    Code:
       0: aload_0
       1: invokespecial #283                // Method t:()F
       4: fneg
       5: f2i
       6: ireturn

  public final int j();
    Code:
       0: aload_0
       1: invokespecial #291                // Method m:()F
       4: f2i
       5: ireturn

  public void onGlobalLayout();
    Code:
       0: aload_0
       1: getfield      #374                // Field v:Landroid/view/View;
       4: astore_2
       5: aload_2
       6: ifnonnull     15
       9: ldc_w         #376                // String mContainer
      12: invokestatic  #379                // Method a/b/b/c.b:(Ljava/lang/String;)V
      15: aload_2
      16: invokevirtual #879                // Method android/view/View.getWidth:()I
      19: i2f
      20: fstore_1
      21: aload_0
      22: getfield      #374                // Field v:Landroid/view/View;
      25: astore_2
      26: aload_2
      27: ifnonnull     36
      30: ldc_w         #376                // String mContainer
      33: invokestatic  #379                // Method a/b/b/c.b:(Ljava/lang/String;)V
      36: aload_0
      37: fload_1
      38: aload_2
      39: invokevirtual #882                // Method android/view/View.getHeight:()I
      42: i2f
      43: iconst_0
      44: iconst_4
      45: aconst_null
      46: invokestatic  #884                // Method b:(Lcom/c/a/f;FFZILjava/lang/Object;)V
      49: return
}
