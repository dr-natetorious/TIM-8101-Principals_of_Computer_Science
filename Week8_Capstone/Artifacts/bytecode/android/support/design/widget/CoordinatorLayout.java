public class android.support.design.widget.CoordinatorLayout extends android.view.ViewGroup implements android.support.v4.view.n {
  static final java.lang.String a;

  static final java.lang.Class<?>[] b;

  static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<android.support.design.widget.CoordinatorLayout$b>>> c;

  static final java.util.Comparator<android.view.View> d;

  android.view.ViewGroup$OnHierarchyChangeListener e;

  static {};
    Code:
       0: ldc           #2                  // class android/support/design/widget/CoordinatorLayout
       2: invokevirtual #81                 // Method java/lang/Class.getPackage:()Ljava/lang/Package;
       5: astore_0
       6: aload_0
       7: ifnull        18
      10: aload_0
      11: invokevirtual #87                 // Method java/lang/Package.getName:()Ljava/lang/String;
      14: astore_0
      15: goto          20
      18: aconst_null
      19: astore_0
      20: aload_0
      21: putstatic     #89                 // Field a:Ljava/lang/String;
      24: getstatic     #95                 // Field android/os/Build$VERSION.SDK_INT:I
      27: bipush        21
      29: if_icmplt     45
      32: new           #33                 // class android/support/design/widget/CoordinatorLayout$h
      35: dup
      36: invokespecial #98                 // Method android/support/design/widget/CoordinatorLayout$h."<init>":()V
      39: putstatic     #100                // Field d:Ljava/util/Comparator;
      42: goto          49
      45: aconst_null
      46: putstatic     #100                // Field d:Ljava/util/Comparator;
      49: iconst_2
      50: anewarray     #77                 // class java/lang/Class
      53: dup
      54: iconst_0
      55: ldc           #102                // class android/content/Context
      57: aastore
      58: dup
      59: iconst_1
      60: ldc           #104                // class android/util/AttributeSet
      62: aastore
      63: putstatic     #106                // Field b:[Ljava/lang/Class;
      66: new           #108                // class java/lang/ThreadLocal
      69: dup
      70: invokespecial #109                // Method java/lang/ThreadLocal."<init>":()V
      73: putstatic     #111                // Field c:Ljava/lang/ThreadLocal;
      76: new           #113                // class android/support/v4/g/k$c
      79: dup
      80: bipush        12
      82: invokespecial #116                // Method android/support/v4/g/k$c."<init>":(I)V
      85: putstatic     #118                // Field f:Landroid/support/v4/g/k$a;
      88: return

  public android.support.design.widget.CoordinatorLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #123                // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.widget.CoordinatorLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #128                // Field android/support/b/a$a.coordinatorLayoutStyle:I
       6: invokespecial #131                // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.design.widget.CoordinatorLayout(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #132                // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #134                // class java/util/ArrayList
      11: dup
      12: invokespecial #135                // Method java/util/ArrayList."<init>":()V
      15: putfield      #137                // Field g:Ljava/util/List;
      18: aload_0
      19: new           #139                // class android/support/v4/widget/f
      22: dup
      23: invokespecial #140                // Method android/support/v4/widget/f."<init>":()V
      26: putfield      #142                // Field h:Landroid/support/v4/widget/f;
      29: aload_0
      30: new           #134                // class java/util/ArrayList
      33: dup
      34: invokespecial #135                // Method java/util/ArrayList."<init>":()V
      37: putfield      #144                // Field i:Ljava/util/List;
      40: aload_0
      41: new           #134                // class java/util/ArrayList
      44: dup
      45: invokespecial #135                // Method java/util/ArrayList."<init>":()V
      48: putfield      #146                // Field j:Ljava/util/List;
      51: aload_0
      52: iconst_2
      53: newarray       int
      55: putfield      #148                // Field k:[I
      58: aload_0
      59: new           #150                // class android/support/v4/view/o
      62: dup
      63: aload_0
      64: invokespecial #153                // Method android/support/v4/view/o."<init>":(Landroid/view/ViewGroup;)V
      67: putfield      #155                // Field x:Landroid/support/v4/view/o;
      70: iconst_0
      71: istore        5
      73: iload_3
      74: ifne          93
      77: aload_1
      78: aload_2
      79: getstatic     #160                // Field android/support/b/a$c.CoordinatorLayout:[I
      82: iconst_0
      83: getstatic     #165                // Field android/support/b/a$b.Widget_Support_CoordinatorLayout:I
      86: invokevirtual #169                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      89: astore_2
      90: goto          104
      93: aload_1
      94: aload_2
      95: getstatic     #160                // Field android/support/b/a$c.CoordinatorLayout:[I
      98: iload_3
      99: iconst_0
     100: invokevirtual #169                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
     103: astore_2
     104: aload_2
     105: getstatic     #172                // Field android/support/b/a$c.CoordinatorLayout_keylines:I
     108: iconst_0
     109: invokevirtual #178                // Method android/content/res/TypedArray.getResourceId:(II)I
     112: istore_3
     113: iload_3
     114: ifeq          180
     117: aload_1
     118: invokevirtual #182                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
     121: astore_1
     122: aload_0
     123: aload_1
     124: iload_3
     125: invokevirtual #188                // Method android/content/res/Resources.getIntArray:(I)[I
     128: putfield      #190                // Field o:[I
     131: aload_1
     132: invokevirtual #194                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
     135: getfield      #200                // Field android/util/DisplayMetrics.density:F
     138: fstore        4
     140: aload_0
     141: getfield      #190                // Field o:[I
     144: arraylength
     145: istore        6
     147: iload         5
     149: istore_3
     150: iload_3
     151: iload         6
     153: if_icmpge     180
     156: aload_0
     157: getfield      #190                // Field o:[I
     160: iload_3
     161: aload_0
     162: getfield      #190                // Field o:[I
     165: iload_3
     166: iaload
     167: i2f
     168: fload         4
     170: fmul
     171: f2i
     172: iastore
     173: iload_3
     174: iconst_1
     175: iadd
     176: istore_3
     177: goto          150
     180: aload_0
     181: aload_2
     182: getstatic     #203                // Field android/support/b/a$c.CoordinatorLayout_statusBarBackground:I
     185: invokevirtual #207                // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
     188: putfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
     191: aload_2
     192: invokevirtual #212                // Method android/content/res/TypedArray.recycle:()V
     195: aload_0
     196: invokespecial #214                // Method g:()V
     199: aload_0
     200: new           #19                 // class android/support/design/widget/CoordinatorLayout$d
     203: dup
     204: aload_0
     205: invokespecial #217                // Method android/support/design/widget/CoordinatorLayout$d."<init>":(Landroid/support/design/widget/CoordinatorLayout;)V
     208: invokespecial #221                // Method android/view/ViewGroup.setOnHierarchyChangeListener:(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V
     211: return

  static android.support.design.widget.CoordinatorLayout$b a(android.content.Context, android.util.AttributeSet, java.lang.String);
    Code:
       0: aload_2
       1: invokestatic  #230                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
       4: ifeq          9
       7: aconst_null
       8: areturn
       9: aload_2
      10: ldc           #232                // String .
      12: invokevirtual #238                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      15: ifeq          49
      18: new           #240                // class java/lang/StringBuilder
      21: dup
      22: invokespecial #241                // Method java/lang/StringBuilder."<init>":()V
      25: astore_3
      26: aload_3
      27: aload_0
      28: invokevirtual #244                // Method android/content/Context.getPackageName:()Ljava/lang/String;
      31: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: aload_3
      36: aload_2
      37: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: pop
      41: aload_3
      42: invokevirtual #251                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      45: astore_3
      46: goto          108
      49: aload_2
      50: bipush        46
      52: invokevirtual #255                // Method java/lang/String.indexOf:(I)I
      55: iflt          63
      58: aload_2
      59: astore_3
      60: goto          108
      63: aload_2
      64: astore_3
      65: getstatic     #89                 // Field a:Ljava/lang/String;
      68: invokestatic  #230                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      71: ifne          108
      74: new           #240                // class java/lang/StringBuilder
      77: dup
      78: invokespecial #241                // Method java/lang/StringBuilder."<init>":()V
      81: astore_3
      82: aload_3
      83: getstatic     #89                 // Field a:Ljava/lang/String;
      86: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      89: pop
      90: aload_3
      91: bipush        46
      93: invokevirtual #258                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      96: pop
      97: aload_3
      98: aload_2
      99: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     102: pop
     103: aload_3
     104: invokevirtual #251                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     107: astore_3
     108: getstatic     #111                // Field c:Ljava/lang/ThreadLocal;
     111: invokevirtual #262                // Method java/lang/ThreadLocal.get:()Ljava/lang/Object;
     114: checkcast     #264                // class java/util/Map
     117: astore        4
     119: aload         4
     121: astore_2
     122: aload         4
     124: ifnonnull     142
     127: new           #266                // class java/util/HashMap
     130: dup
     131: invokespecial #267                // Method java/util/HashMap."<init>":()V
     134: astore_2
     135: getstatic     #111                // Field c:Ljava/lang/ThreadLocal;
     138: aload_2
     139: invokevirtual #271                // Method java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
     142: aload_2
     143: aload_3
     144: invokeinterface #274,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     149: checkcast     #276                // class java/lang/reflect/Constructor
     152: astore        5
     154: aload         5
     156: astore        4
     158: aload         5
     160: ifnonnull     195
     163: aload_0
     164: invokevirtual #280                // Method android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
     167: aload_3
     168: invokevirtual #286                // Method java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
     171: getstatic     #106                // Field b:[Ljava/lang/Class;
     174: invokevirtual #290                // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
     177: astore        4
     179: aload         4
     181: iconst_1
     182: invokevirtual #294                // Method java/lang/reflect/Constructor.setAccessible:(Z)V
     185: aload_2
     186: aload_3
     187: aload         4
     189: invokeinterface #298,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     194: pop
     195: aload         4
     197: iconst_2
     198: anewarray     #300                // class java/lang/Object
     201: dup
     202: iconst_0
     203: aload_0
     204: aastore
     205: dup
     206: iconst_1
     207: aload_1
     208: aastore
     209: invokevirtual #304                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
     212: checkcast     #13                 // class android/support/design/widget/CoordinatorLayout$b
     215: astore_0
     216: aload_0
     217: areturn
     218: astore_0
     219: new           #240                // class java/lang/StringBuilder
     222: dup
     223: invokespecial #241                // Method java/lang/StringBuilder."<init>":()V
     226: astore_1
     227: aload_1
     228: ldc_w         #306                // String Could not inflate Behavior subclass
     231: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     234: pop
     235: aload_1
     236: aload_3
     237: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     240: pop
     241: new           #308                // class java/lang/RuntimeException
     244: dup
     245: aload_1
     246: invokevirtual #251                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     249: aload_0
     250: invokespecial #311                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
     253: athrow
    Exception table:
       from    to  target type
         108   119   218   Class java/lang/Exception
         127   142   218   Class java/lang/Exception
         142   154   218   Class java/lang/Exception
         163   195   218   Class java/lang/Exception
         195   216   218   Class java/lang/Exception

  public android.support.design.widget.CoordinatorLayout$e a(android.util.AttributeSet);
    Code:
       0: new           #22                 // class android/support/design/widget/CoordinatorLayout$e
       3: dup
       4: aload_0
       5: invokevirtual #653                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: invokespecial #654                // Method android/support/design/widget/CoordinatorLayout$e."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
      12: areturn

  android.support.design.widget.CoordinatorLayout$e a(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       7: astore        4
       9: aload         4
      11: getfield      #656                // Field android/support/design/widget/CoordinatorLayout$e.b:Z
      14: ifne          197
      17: aload_1
      18: instanceof    #10                 // class android/support/design/widget/CoordinatorLayout$a
      21: ifeq          63
      24: aload_1
      25: checkcast     #10                 // class android/support/design/widget/CoordinatorLayout$a
      28: invokeinterface #658,  1          // InterfaceMethod android/support/design/widget/CoordinatorLayout$a.a:()Landroid/support/design/widget/CoordinatorLayout$b;
      33: astore_1
      34: aload_1
      35: ifnonnull     48
      38: ldc_w         #557                // String CoordinatorLayout
      41: ldc_w         #660                // String Attached behavior class is null
      44: invokestatic  #562                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
      47: pop
      48: aload         4
      50: aload_1
      51: invokevirtual #663                // Method android/support/design/widget/CoordinatorLayout$e.a:(Landroid/support/design/widget/CoordinatorLayout$b;)V
      54: aload         4
      56: iconst_1
      57: putfield      #656                // Field android/support/design/widget/CoordinatorLayout$e.b:Z
      60: aload         4
      62: areturn
      63: aload_1
      64: invokevirtual #667                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      67: astore_2
      68: aconst_null
      69: astore_1
      70: aload_2
      71: ifnull        100
      74: aload_2
      75: ldc           #16                 // class android/support/design/widget/CoordinatorLayout$c
      77: invokevirtual #671                // Method java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      80: checkcast     #16                 // class android/support/design/widget/CoordinatorLayout$c
      83: astore_3
      84: aload_3
      85: astore_1
      86: aload_3
      87: ifnonnull     100
      90: aload_2
      91: invokevirtual #674                // Method java/lang/Class.getSuperclass:()Ljava/lang/Class;
      94: astore_2
      95: aload_3
      96: astore_1
      97: goto          70
     100: aload_1
     101: ifnull        54
     104: aload         4
     106: aload_1
     107: invokeinterface #676,  1          // InterfaceMethod android/support/design/widget/CoordinatorLayout$c.a:()Ljava/lang/Class;
     112: iconst_0
     113: anewarray     #77                 // class java/lang/Class
     116: invokevirtual #679                // Method java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
     119: iconst_0
     120: anewarray     #300                // class java/lang/Object
     123: invokevirtual #304                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
     126: checkcast     #13                 // class android/support/design/widget/CoordinatorLayout$b
     129: invokevirtual #663                // Method android/support/design/widget/CoordinatorLayout$e.a:(Landroid/support/design/widget/CoordinatorLayout$b;)V
     132: goto          54
     135: astore_2
     136: new           #240                // class java/lang/StringBuilder
     139: dup
     140: invokespecial #241                // Method java/lang/StringBuilder."<init>":()V
     143: astore_3
     144: aload_3
     145: ldc_w         #681                // String Default behavior class
     148: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     151: pop
     152: aload_3
     153: aload_1
     154: invokeinterface #676,  1          // InterfaceMethod android/support/design/widget/CoordinatorLayout$c.a:()Ljava/lang/Class;
     159: invokevirtual #682                // Method java/lang/Class.getName:()Ljava/lang/String;
     162: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     165: pop
     166: aload_3
     167: ldc_w         #684                // String  could not be instantiated. Did you forget
     170: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     173: pop
     174: aload_3
     175: ldc_w         #686                // String  a default constructor?
     178: invokevirtual #248                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     181: pop
     182: ldc_w         #557                // String CoordinatorLayout
     185: aload_3
     186: invokevirtual #251                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     189: aload_2
     190: invokestatic  #689                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     193: pop
     194: goto          54
     197: aload         4
     199: areturn
    Exception table:
       from    to  target type
         104   132   135   Class java/lang/Exception

  protected android.support.design.widget.CoordinatorLayout$e a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #22                 // class android/support/design/widget/CoordinatorLayout$e
       4: ifeq          19
       7: new           #22                 // class android/support/design/widget/CoordinatorLayout$e
      10: dup
      11: aload_1
      12: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      15: invokespecial #693                // Method android/support/design/widget/CoordinatorLayout$e."<init>":(Landroid/support/design/widget/CoordinatorLayout$e;)V
      18: areturn
      19: aload_1
      20: instanceof    #695                // class android/view/ViewGroup$MarginLayoutParams
      23: ifeq          38
      26: new           #22                 // class android/support/design/widget/CoordinatorLayout$e
      29: dup
      30: aload_1
      31: checkcast     #695                // class android/view/ViewGroup$MarginLayoutParams
      34: invokespecial #698                // Method android/support/design/widget/CoordinatorLayout$e."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
      37: areturn
      38: new           #22                 // class android/support/design/widget/CoordinatorLayout$e
      41: dup
      42: aload_1
      43: invokespecial #701                // Method android/support/design/widget/CoordinatorLayout$e."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
      46: areturn

  final android.support.v4.view.ab a(android.support.v4.view.ab);
    Code:
       0: aload_1
       1: astore        4
       3: aload_0
       4: getfield      #591                // Field t:Landroid/support/v4/view/ab;
       7: aload_1
       8: invokestatic  #706                // Method android/support/v4/g/i.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      11: ifne          80
      14: aload_0
      15: aload_1
      16: putfield      #591                // Field t:Landroid/support/v4/view/ab;
      19: iconst_0
      20: istore_3
      21: aload_1
      22: ifnull        37
      25: aload_1
      26: invokevirtual #595                // Method android/support/v4/view/ab.b:()I
      29: ifle          37
      32: iconst_1
      33: istore_2
      34: goto          39
      37: iconst_0
      38: istore_2
      39: aload_0
      40: iload_2
      41: putfield      #708                // Field u:Z
      44: iload_3
      45: istore_2
      46: aload_0
      47: getfield      #708                // Field u:Z
      50: ifne          64
      53: iload_3
      54: istore_2
      55: aload_0
      56: invokevirtual #712                // Method getBackground:()Landroid/graphics/drawable/Drawable;
      59: ifnonnull     64
      62: iconst_1
      63: istore_2
      64: aload_0
      65: iload_2
      66: invokevirtual #715                // Method setWillNotDraw:(Z)V
      69: aload_0
      70: aload_1
      71: invokespecial #717                // Method b:(Landroid/support/v4/view/ab;)Landroid/support/v4/view/ab;
      74: astore        4
      76: aload_0
      77: invokevirtual #720                // Method requestLayout:()V
      80: aload         4
      82: areturn

  void a();
    Code:
       0: aload_0
       1: invokevirtual #487                // Method getChildCount:()I
       4: istore_2
       5: iconst_0
       6: istore        4
       8: iconst_0
       9: istore_1
      10: iload         4
      12: istore_3
      13: iload_1
      14: iload_2
      15: if_icmpge     42
      18: aload_0
      19: aload_0
      20: iload_1
      21: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      24: invokespecial #722                // Method e:(Landroid/view/View;)Z
      27: ifeq          35
      30: iconst_1
      31: istore_3
      32: goto          42
      35: iload_1
      36: iconst_1
      37: iadd
      38: istore_1
      39: goto          10
      42: iload_3
      43: aload_0
      44: getfield      #724                // Field s:Z
      47: if_icmpeq     63
      50: iload_3
      51: ifeq          59
      54: aload_0
      55: invokevirtual #726                // Method b:()V
      58: return
      59: aload_0
      60: invokevirtual #728                // Method c:()V
      63: return

  final void a(int);
    Code:
       0: aload_0
       1: invokestatic  #731                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       4: istore        4
       6: aload_0
       7: getfield      #137                // Field g:Ljava/util/List;
      10: invokeinterface #538,  1          // InterfaceMethod java/util/List.size:()I
      15: istore        5
      17: invokestatic  #416                // Method e:()Landroid/graphics/Rect;
      20: astore        8
      22: invokestatic  #416                // Method e:()Landroid/graphics/Rect;
      25: astore        9
      27: invokestatic  #416                // Method e:()Landroid/graphics/Rect;
      30: astore        10
      32: iconst_0
      33: istore_2
      34: iload_2
      35: iload         5
      37: if_icmpge     493
      40: aload_0
      41: getfield      #137                // Field g:Ljava/util/List;
      44: iload_2
      45: invokeinterface #541,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      50: checkcast     #404                // class android/view/View
      53: astore        11
      55: aload         11
      57: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      60: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      63: astore        12
      65: iload_1
      66: ifne          82
      69: aload         11
      71: invokevirtual #734                // Method android/view/View.getVisibility:()I
      74: bipush        8
      76: if_icmpne     82
      79: goto          486
      82: iconst_0
      83: istore_3
      84: iload_3
      85: iload_2
      86: if_icmpge     129
      89: aload_0
      90: getfield      #137                // Field g:Ljava/util/List;
      93: iload_3
      94: invokeinterface #541,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      99: checkcast     #404                // class android/view/View
     102: astore        13
     104: aload         12
     106: getfield      #736                // Field android/support/design/widget/CoordinatorLayout$e.l:Landroid/view/View;
     109: aload         13
     111: if_acmpne     122
     114: aload_0
     115: aload         11
     117: iload         4
     119: invokevirtual #737                // Method b:(Landroid/view/View;I)V
     122: iload_3
     123: iconst_1
     124: iadd
     125: istore_3
     126: goto          84
     129: aload_0
     130: aload         11
     132: iconst_1
     133: aload         9
     135: invokevirtual #740                // Method a:(Landroid/view/View;ZLandroid/graphics/Rect;)V
     138: aload         12
     140: getfield      #742                // Field android/support/design/widget/CoordinatorLayout$e.g:I
     143: ifeq          294
     146: aload         9
     148: invokevirtual #454                // Method android/graphics/Rect.isEmpty:()Z
     151: ifne          294
     154: aload         12
     156: getfield      #742                // Field android/support/design/widget/CoordinatorLayout$e.g:I
     159: iload         4
     161: invokestatic  #380                // Method android/support/v4/view/e.a:(II)I
     164: istore_3
     165: iload_3
     166: bipush        112
     168: iand
     169: istore        6
     171: iload         6
     173: bipush        48
     175: if_icmpeq     214
     178: iload         6
     180: bipush        80
     182: if_icmpeq     188
     185: goto          232
     188: aload         8
     190: aload         8
     192: getfield      #393                // Field android/graphics/Rect.bottom:I
     195: aload_0
     196: invokevirtual #330                // Method getHeight:()I
     199: aload         9
     201: getfield      #362                // Field android/graphics/Rect.top:I
     204: isub
     205: invokestatic  #353                // Method java/lang/Math.max:(II)I
     208: putfield      #393                // Field android/graphics/Rect.bottom:I
     211: goto          232
     214: aload         8
     216: aload         8
     218: getfield      #362                // Field android/graphics/Rect.top:I
     221: aload         9
     223: getfield      #393                // Field android/graphics/Rect.bottom:I
     226: invokestatic  #353                // Method java/lang/Math.max:(II)I
     229: putfield      #362                // Field android/graphics/Rect.top:I
     232: iload_3
     233: bipush        7
     235: iand
     236: istore_3
     237: iload_3
     238: iconst_3
     239: if_icmpeq     276
     242: iload_3
     243: iconst_5
     244: if_icmpeq     250
     247: goto          294
     250: aload         8
     252: aload         8
     254: getfield      #387                // Field android/graphics/Rect.right:I
     257: aload_0
     258: invokevirtual #327                // Method getWidth:()I
     261: aload         9
     263: getfield      #339                // Field android/graphics/Rect.left:I
     266: isub
     267: invokestatic  #353                // Method java/lang/Math.max:(II)I
     270: putfield      #387                // Field android/graphics/Rect.right:I
     273: goto          294
     276: aload         8
     278: aload         8
     280: getfield      #339                // Field android/graphics/Rect.left:I
     283: aload         9
     285: getfield      #387                // Field android/graphics/Rect.right:I
     288: invokestatic  #353                // Method java/lang/Math.max:(II)I
     291: putfield      #339                // Field android/graphics/Rect.left:I
     294: aload         12
     296: getfield      #456                // Field android/support/design/widget/CoordinatorLayout$e.h:I
     299: ifeq          320
     302: aload         11
     304: invokevirtual #734                // Method android/view/View.getVisibility:()I
     307: ifne          320
     310: aload_0
     311: aload         11
     313: aload         8
     315: iload         4
     317: invokespecial #744                // Method a:(Landroid/view/View;Landroid/graphics/Rect;I)V
     320: iload_1
     321: iconst_2
     322: if_icmpeq     354
     325: aload_0
     326: aload         11
     328: aload         10
     330: invokevirtual #746                // Method c:(Landroid/view/View;Landroid/graphics/Rect;)V
     333: aload         10
     335: aload         9
     337: invokevirtual #749                // Method android/graphics/Rect.equals:(Ljava/lang/Object;)Z
     340: ifeq          346
     343: goto          486
     346: aload_0
     347: aload         11
     349: aload         9
     351: invokevirtual #751                // Method b:(Landroid/view/View;Landroid/graphics/Rect;)V
     354: iload_2
     355: iconst_1
     356: iadd
     357: istore_3
     358: iload_3
     359: iload         5
     361: if_icmpge     486
     364: aload_0
     365: getfield      #137                // Field g:Ljava/util/List;
     368: iload_3
     369: invokeinterface #541,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     374: checkcast     #404                // class android/view/View
     377: astore        12
     379: aload         12
     381: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     384: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
     387: astore        13
     389: aload         13
     391: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
     394: astore        14
     396: aload         14
     398: ifnull        479
     401: aload         14
     403: aload_0
     404: aload         12
     406: aload         11
     408: invokevirtual #752                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
     411: ifeq          479
     414: iload_1
     415: ifne          434
     418: aload         13
     420: invokevirtual #754                // Method android/support/design/widget/CoordinatorLayout$e.g:()Z
     423: ifeq          434
     426: aload         13
     428: invokevirtual #756                // Method android/support/design/widget/CoordinatorLayout$e.h:()V
     431: goto          479
     434: iload_1
     435: iconst_2
     436: if_icmpeq     454
     439: aload         14
     441: aload_0
     442: aload         12
     444: aload         11
     446: invokevirtual #758                // Method android/support/design/widget/CoordinatorLayout$b.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
     449: istore        7
     451: goto          467
     454: aload         14
     456: aload_0
     457: aload         12
     459: aload         11
     461: invokevirtual #761                // Method android/support/design/widget/CoordinatorLayout$b.d:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)V
     464: iconst_1
     465: istore        7
     467: iload_1
     468: iconst_1
     469: if_icmpne     479
     472: aload         13
     474: iload         7
     476: invokevirtual #763                // Method android/support/design/widget/CoordinatorLayout$e.a:(Z)V
     479: iload_3
     480: iconst_1
     481: iadd
     482: istore_3
     483: goto          358
     486: iload_2
     487: iconst_1
     488: iadd
     489: istore_2
     490: goto          34
     493: aload         8
     495: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
     498: aload         9
     500: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
     503: aload         10
     505: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
     508: return

  public void a(android.view.View, int);
    Code:
       0: aload_1
       1: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       7: astore_3
       8: aload_3
       9: invokevirtual #765                // Method android/support/design/widget/CoordinatorLayout$e.d:()Z
      12: ifeq          26
      15: new           #767                // class java/lang/IllegalStateException
      18: dup
      19: ldc_w         #769                // String An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.
      22: invokespecial #770                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      25: athrow
      26: aload_3
      27: getfield      #772                // Field android/support/design/widget/CoordinatorLayout$e.k:Landroid/view/View;
      30: ifnull        44
      33: aload_0
      34: aload_1
      35: aload_3
      36: getfield      #772                // Field android/support/design/widget/CoordinatorLayout$e.k:Landroid/view/View;
      39: iload_2
      40: invokespecial #774                // Method a:(Landroid/view/View;Landroid/view/View;I)V
      43: return
      44: aload_3
      45: getfield      #776                // Field android/support/design/widget/CoordinatorLayout$e.e:I
      48: iflt          62
      51: aload_0
      52: aload_1
      53: aload_3
      54: getfield      #776                // Field android/support/design/widget/CoordinatorLayout$e.e:I
      57: iload_2
      58: invokespecial #778                // Method b:(Landroid/view/View;II)V
      61: return
      62: aload_0
      63: aload_1
      64: iload_2
      65: invokespecial #780                // Method d:(Landroid/view/View;I)V
      68: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokevirtual #784                // Method measureChildWithMargins:(Landroid/view/View;IIII)V
      11: return

  public void a(android.view.View, int, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #487                // Method getChildCount:()I
       4: istore        9
       6: iconst_0
       7: istore        8
       9: iconst_0
      10: istore        7
      12: iload         7
      14: iload         9
      16: if_icmpge     104
      19: aload_0
      20: iload         7
      22: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      25: astore        10
      27: aload         10
      29: invokevirtual #734                // Method android/view/View.getVisibility:()I
      32: bipush        8
      34: if_icmpne     40
      37: goto          95
      40: aload         10
      42: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      45: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      48: astore        11
      50: aload         11
      52: iload         6
      54: invokevirtual #788                // Method android/support/design/widget/CoordinatorLayout$e.b:(I)Z
      57: ifne          63
      60: goto          95
      63: aload         11
      65: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      68: astore        11
      70: aload         11
      72: ifnull        95
      75: aload         11
      77: aload_0
      78: aload         10
      80: aload_1
      81: iload_2
      82: iload_3
      83: iload         4
      85: iload         5
      87: iload         6
      89: invokevirtual #791                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII)V
      92: iconst_1
      93: istore        8
      95: iload         7
      97: iconst_1
      98: iadd
      99: istore        7
     101: goto          12
     104: iload         8
     106: ifeq          114
     109: aload_0
     110: iconst_1
     111: invokevirtual #793                // Method a:(I)V
     114: return

  public void a(android.view.View, int, int, int[], int);
    Code:
       0: aload_0
       1: invokevirtual #487                // Method getChildCount:()I
       4: istore        12
       6: iconst_0
       7: istore        11
       9: iconst_0
      10: istore        8
      12: iconst_0
      13: istore        9
      15: iconst_0
      16: istore        7
      18: iload         8
      20: iload         12
      22: if_icmpge     234
      25: aload_0
      26: iload         8
      28: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      31: astore        13
      33: aload         13
      35: invokevirtual #734                // Method android/view/View.getVisibility:()I
      38: bipush        8
      40: if_icmpne     54
      43: iload         9
      45: istore        10
      47: iload         7
      49: istore        6
      51: goto          217
      54: aload         13
      56: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      59: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      62: astore        14
      64: aload         14
      66: iload         5
      68: invokevirtual #788                // Method android/support/design/widget/CoordinatorLayout$e.b:(I)Z
      71: ifne          85
      74: iload         9
      76: istore        10
      78: iload         7
      80: istore        6
      82: goto          217
      85: aload         14
      87: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      90: astore        14
      92: iload         9
      94: istore        10
      96: iload         7
      98: istore        6
     100: aload         14
     102: ifnull        217
     105: aload_0
     106: getfield      #148                // Field k:[I
     109: astore        15
     111: aload_0
     112: getfield      #148                // Field k:[I
     115: iconst_1
     116: iconst_0
     117: iastore
     118: aload         15
     120: iconst_0
     121: iconst_0
     122: iastore
     123: aload         14
     125: aload_0
     126: aload         13
     128: aload_1
     129: iload_2
     130: iload_3
     131: aload_0
     132: getfield      #148                // Field k:[I
     135: iload         5
     137: invokevirtual #797                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
     140: iload_2
     141: ifle          160
     144: iload         9
     146: aload_0
     147: getfield      #148                // Field k:[I
     150: iconst_0
     151: iaload
     152: invokestatic  #353                // Method java/lang/Math.max:(II)I
     155: istore        6
     157: goto          173
     160: iload         9
     162: aload_0
     163: getfield      #148                // Field k:[I
     166: iconst_0
     167: iaload
     168: invokestatic  #350                // Method java/lang/Math.min:(II)I
     171: istore        6
     173: iload_3
     174: ifle          193
     177: iload         7
     179: aload_0
     180: getfield      #148                // Field k:[I
     183: iconst_1
     184: iaload
     185: invokestatic  #353                // Method java/lang/Math.max:(II)I
     188: istore        7
     190: goto          206
     193: iload         7
     195: aload_0
     196: getfield      #148                // Field k:[I
     199: iconst_1
     200: iaload
     201: invokestatic  #350                // Method java/lang/Math.min:(II)I
     204: istore        7
     206: iload         6
     208: istore        10
     210: iload         7
     212: istore        6
     214: iconst_1
     215: istore        11
     217: iload         8
     219: iconst_1
     220: iadd
     221: istore        8
     223: iload         10
     225: istore        9
     227: iload         6
     229: istore        7
     231: goto          18
     234: aload         4
     236: iconst_0
     237: iload         9
     239: iastore
     240: aload         4
     242: iconst_1
     243: iload         7
     245: iastore
     246: iload         11
     248: ifeq          256
     251: aload_0
     252: iconst_1
     253: invokevirtual #793                // Method a:(I)V
     256: return

  void a(android.view.View, int, android.graphics.Rect, android.graphics.Rect);
    Code:
       0: aload_1
       1: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       7: astore        7
       9: aload_1
      10: invokevirtual #582                // Method android/view/View.getMeasuredWidth:()I
      13: istore        5
      15: aload_1
      16: invokevirtual #585                // Method android/view/View.getMeasuredHeight:()I
      19: istore        6
      21: aload_0
      22: aload_1
      23: iload_2
      24: aload_3
      25: aload         4
      27: aload         7
      29: iload         5
      31: iload         6
      33: invokespecial #799                // Method a:(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/support/design/widget/CoordinatorLayout$e;II)V
      36: aload_0
      37: aload         7
      39: aload         4
      41: iload         5
      43: iload         6
      45: invokespecial #801                // Method a:(Landroid/support/design/widget/CoordinatorLayout$e;Landroid/graphics/Rect;II)V
      48: return

  void a(android.view.View, android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokestatic  #806                // Method android/support/v4/widget/q.b:(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V
       6: return

  void a(android.view.View, boolean, android.graphics.Rect);
    Code:
       0: aload_1
       1: invokevirtual #809                // Method android/view/View.isLayoutRequested:()Z
       4: ifne          51
       7: aload_1
       8: invokevirtual #734                // Method android/view/View.getVisibility:()I
      11: bipush        8
      13: if_icmpne     19
      16: goto          51
      19: iload_2
      20: ifeq          30
      23: aload_0
      24: aload_1
      25: aload_3
      26: invokevirtual #469                // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      29: return
      30: aload_3
      31: aload_1
      32: invokevirtual #419                // Method android/view/View.getLeft:()I
      35: aload_1
      36: invokevirtual #422                // Method android/view/View.getTop:()I
      39: aload_1
      40: invokevirtual #425                // Method android/view/View.getRight:()I
      43: aload_1
      44: invokevirtual #428                // Method android/view/View.getBottom:()I
      47: invokevirtual #371                // Method android/graphics/Rect.set:(IIII)V
      50: return
      51: aload_3
      52: invokevirtual #317                // Method android/graphics/Rect.setEmpty:()V
      55: return

  public boolean a(android.view.View, int, int);
    Code:
       0: invokestatic  #416                // Method e:()Landroid/graphics/Rect;
       3: astore        5
       5: aload_0
       6: aload_1
       7: aload         5
       9: invokevirtual #469                // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      12: aload         5
      14: iload_2
      15: iload_3
      16: invokevirtual #813                // Method android/graphics/Rect.contains:(II)Z
      19: istore        4
      21: aload         5
      23: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
      26: iload         4
      28: ireturn
      29: astore_1
      30: aload         5
      32: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
      35: aload_1
      36: athrow
    Exception table:
       from    to  target type
          12    21    29   any

  public boolean a(android.view.View, android.view.View, int, int);
    Code:
       0: aload_0
       1: invokevirtual #487                // Method getChildCount:()I
       4: istore        6
       6: iconst_0
       7: istore        5
       9: iconst_0
      10: istore        7
      12: iload         5
      14: iload         6
      16: if_icmpge     113
      19: aload_0
      20: iload         5
      22: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      25: astore        9
      27: aload         9
      29: invokevirtual #734                // Method android/view/View.getVisibility:()I
      32: bipush        8
      34: if_icmpne     40
      37: goto          104
      40: aload         9
      42: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      45: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      48: astore        10
      50: aload         10
      52: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      55: astore        11
      57: aload         11
      59: ifnull        96
      62: aload         11
      64: aload_0
      65: aload         9
      67: aload_1
      68: aload_2
      69: iload_3
      70: iload         4
      72: invokevirtual #817                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
      75: istore        8
      77: aload         10
      79: iload         4
      81: iload         8
      83: invokevirtual #820                // Method android/support/design/widget/CoordinatorLayout$e.a:(IZ)V
      86: iload         7
      88: iload         8
      90: ior
      91: istore        7
      93: goto          104
      96: aload         10
      98: iload         4
     100: iconst_0
     101: invokevirtual #820                // Method android/support/design/widget/CoordinatorLayout$e.a:(IZ)V
     104: iload         5
     106: iconst_1
     107: iadd
     108: istore        5
     110: goto          12
     113: iload         7
     115: ireturn

  void b();
    Code:
       0: aload_0
       1: getfield      #822                // Field n:Z
       4: ifeq          37
       7: aload_0
       8: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      11: ifnonnull     26
      14: aload_0
      15: new           #25                 // class android/support/design/widget/CoordinatorLayout$f
      18: dup
      19: aload_0
      20: invokespecial #825                // Method android/support/design/widget/CoordinatorLayout$f."<init>":(Landroid/support/design/widget/CoordinatorLayout;)V
      23: putfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      26: aload_0
      27: invokevirtual #829                // Method getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      30: aload_0
      31: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      34: invokevirtual #835                // Method android/view/ViewTreeObserver.addOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      37: aload_0
      38: iconst_1
      39: putfield      #724                // Field s:Z
      42: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #142                // Field h:Landroid/support/v4/widget/f;
       4: aload_1
       5: invokevirtual #839                // Method android/support/v4/widget/f.c:(Ljava/lang/Object;)Ljava/util/List;
       8: astore_3
       9: aload_3
      10: ifnull        81
      13: aload_3
      14: invokeinterface #840,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      19: ifne          81
      22: iconst_0
      23: istore_2
      24: iload_2
      25: aload_3
      26: invokeinterface #538,  1          // InterfaceMethod java/util/List.size:()I
      31: if_icmpge     81
      34: aload_3
      35: iload_2
      36: invokeinterface #541,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      41: checkcast     #404                // class android/view/View
      44: astore        4
      46: aload         4
      48: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      51: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      54: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      57: astore        5
      59: aload         5
      61: ifnull        74
      64: aload         5
      66: aload_0
      67: aload         4
      69: aload_1
      70: invokevirtual #758                // Method android/support/design/widget/CoordinatorLayout$b.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
      73: pop
      74: iload_2
      75: iconst_1
      76: iadd
      77: istore_2
      78: goto          24
      81: return

  void b(android.view.View, int);
    Code:
       0: aload_1
       1: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       7: astore        6
       9: aload         6
      11: getfield      #772                // Field android/support/design/widget/CoordinatorLayout$e.k:Landroid/view/View;
      14: ifnull        212
      17: invokestatic  #416                // Method e:()Landroid/graphics/Rect;
      20: astore        7
      22: invokestatic  #416                // Method e:()Landroid/graphics/Rect;
      25: astore        8
      27: invokestatic  #416                // Method e:()Landroid/graphics/Rect;
      30: astore        9
      32: aload_0
      33: aload         6
      35: getfield      #772                // Field android/support/design/widget/CoordinatorLayout$e.k:Landroid/view/View;
      38: aload         7
      40: invokevirtual #469                // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      43: iconst_0
      44: istore_3
      45: aload_0
      46: aload_1
      47: iconst_0
      48: aload         8
      50: invokevirtual #740                // Method a:(Landroid/view/View;ZLandroid/graphics/Rect;)V
      53: aload_1
      54: invokevirtual #582                // Method android/view/View.getMeasuredWidth:()I
      57: istore        4
      59: aload_1
      60: invokevirtual #585                // Method android/view/View.getMeasuredHeight:()I
      63: istore        5
      65: aload_0
      66: aload_1
      67: iload_2
      68: aload         7
      70: aload         9
      72: aload         6
      74: iload         4
      76: iload         5
      78: invokespecial #799                // Method a:(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/support/design/widget/CoordinatorLayout$e;II)V
      81: aload         9
      83: getfield      #339                // Field android/graphics/Rect.left:I
      86: aload         8
      88: getfield      #339                // Field android/graphics/Rect.left:I
      91: if_icmpne     109
      94: iload_3
      95: istore_2
      96: aload         9
      98: getfield      #362                // Field android/graphics/Rect.top:I
     101: aload         8
     103: getfield      #362                // Field android/graphics/Rect.top:I
     106: if_icmpeq     111
     109: iconst_1
     110: istore_2
     111: aload_0
     112: aload         6
     114: aload         9
     116: iload         4
     118: iload         5
     120: invokespecial #801                // Method a:(Landroid/support/design/widget/CoordinatorLayout$e;Landroid/graphics/Rect;II)V
     123: aload         9
     125: getfield      #339                // Field android/graphics/Rect.left:I
     128: aload         8
     130: getfield      #339                // Field android/graphics/Rect.left:I
     133: isub
     134: istore_3
     135: aload         9
     137: getfield      #362                // Field android/graphics/Rect.top:I
     140: aload         8
     142: getfield      #362                // Field android/graphics/Rect.top:I
     145: isub
     146: istore        4
     148: iload_3
     149: ifeq          157
     152: aload_1
     153: iload_3
     154: invokestatic  #607                // Method android/support/v4/view/s.c:(Landroid/view/View;I)V
     157: iload         4
     159: ifeq          168
     162: aload_1
     163: iload         4
     165: invokestatic  #639                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
     168: iload_2
     169: ifeq          197
     172: aload         6
     174: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
     177: astore        10
     179: aload         10
     181: ifnull        197
     184: aload         10
     186: aload_0
     187: aload_1
     188: aload         6
     190: getfield      #772                // Field android/support/design/widget/CoordinatorLayout$e.k:Landroid/view/View;
     193: invokevirtual #758                // Method android/support/design/widget/CoordinatorLayout$b.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
     196: pop
     197: aload         7
     199: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
     202: aload         8
     204: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
     207: aload         9
     209: invokestatic  #451                // Method a:(Landroid/graphics/Rect;)V
     212: return

  void b(android.view.View, android.graphics.Rect);
    Code:
       0: aload_1
       1: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       7: aload_2
       8: invokevirtual #841                // Method android/support/design/widget/CoordinatorLayout$e.a:(Landroid/graphics/Rect;)V
      11: return

  public void b(android.view.View, android.view.View, int, int);
    Code:
       0: aload_0
       1: getfield      #155                // Field x:Landroid/support/v4/view/o;
       4: aload_1
       5: aload_2
       6: iload_3
       7: iload         4
       9: invokevirtual #844                // Method android/support/v4/view/o.a:(Landroid/view/View;Landroid/view/View;II)V
      12: aload_0
      13: aload_2
      14: putfield      #846                // Field q:Landroid/view/View;
      17: aload_0
      18: invokevirtual #487                // Method getChildCount:()I
      21: istore        6
      23: iconst_0
      24: istore        5
      26: iload         5
      28: iload         6
      30: if_icmpge     98
      33: aload_0
      34: iload         5
      36: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      39: astore        7
      41: aload         7
      43: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      46: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      49: astore        8
      51: aload         8
      53: iload         4
      55: invokevirtual #788                // Method android/support/design/widget/CoordinatorLayout$e.b:(I)Z
      58: ifne          64
      61: goto          89
      64: aload         8
      66: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      69: astore        8
      71: aload         8
      73: ifnull        89
      76: aload         8
      78: aload_0
      79: aload         7
      81: aload_1
      82: aload_2
      83: iload_3
      84: iload         4
      86: invokevirtual #849                // Method android/support/design/widget/CoordinatorLayout$b.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)V
      89: iload         5
      91: iconst_1
      92: iadd
      93: istore        5
      95: goto          26
      98: return

  public java.util.List<android.view.View> c(android.view.View);
    Code:
       0: aload_0
       1: getfield      #142                // Field h:Landroid/support/v4/widget/f;
       4: aload_1
       5: invokevirtual #852                // Method android/support/v4/widget/f.d:(Ljava/lang/Object;)Ljava/util/List;
       8: astore_1
       9: aload_0
      10: getfield      #146                // Field j:Ljava/util/List;
      13: invokeinterface #481,  1          // InterfaceMethod java/util/List.clear:()V
      18: aload_1
      19: ifnull        33
      22: aload_0
      23: getfield      #146                // Field j:Ljava/util/List;
      26: aload_1
      27: invokeinterface #634,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      32: pop
      33: aload_0
      34: getfield      #146                // Field j:Ljava/util/List;
      37: areturn

  void c();
    Code:
       0: aload_0
       1: getfield      #822                // Field n:Z
       4: ifeq          25
       7: aload_0
       8: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      11: ifnull        25
      14: aload_0
      15: invokevirtual #829                // Method getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      18: aload_0
      19: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      22: invokevirtual #856                // Method android/view/ViewTreeObserver.removeOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      25: aload_0
      26: iconst_0
      27: putfield      #724                // Field s:Z
      30: return

  public void c(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #155                // Field x:Landroid/support/v4/view/o;
       4: aload_1
       5: iload_2
       6: invokevirtual #858                // Method android/support/v4/view/o.a:(Landroid/view/View;I)V
       9: aload_0
      10: invokevirtual #487                // Method getChildCount:()I
      13: istore        4
      15: iconst_0
      16: istore_3
      17: iload_3
      18: iload         4
      20: if_icmpge     92
      23: aload_0
      24: iload_3
      25: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      28: astore        5
      30: aload         5
      32: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      35: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      38: astore        6
      40: aload         6
      42: iload_2
      43: invokevirtual #788                // Method android/support/design/widget/CoordinatorLayout$e.b:(I)Z
      46: ifne          52
      49: goto          85
      52: aload         6
      54: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      57: astore        7
      59: aload         7
      61: ifnull        74
      64: aload         7
      66: aload_0
      67: aload         5
      69: aload_1
      70: iload_2
      71: invokevirtual #861                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V
      74: aload         6
      76: iload_2
      77: invokevirtual #862                // Method android/support/design/widget/CoordinatorLayout$e.a:(I)V
      80: aload         6
      82: invokevirtual #756                // Method android/support/design/widget/CoordinatorLayout$e.h:()V
      85: iload_3
      86: iconst_1
      87: iadd
      88: istore_3
      89: goto          17
      92: aload_0
      93: aconst_null
      94: putfield      #846                // Field q:Landroid/view/View;
      97: return

  void c(android.view.View, android.graphics.Rect);
    Code:
       0: aload_2
       1: aload_1
       2: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       5: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       8: invokevirtual #864                // Method android/support/design/widget/CoordinatorLayout$e.c:()Landroid/graphics/Rect;
      11: invokevirtual #449                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
      14: return

  protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #22                 // class android/support/design/widget/CoordinatorLayout$e
       4: ifeq          17
       7: aload_0
       8: aload_1
       9: invokespecial #868                // Method android/view/ViewGroup.checkLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Z
      12: ifeq          17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn

  protected android.support.design.widget.CoordinatorLayout$e d();
    Code:
       0: new           #22                 // class android/support/design/widget/CoordinatorLayout$e
       3: dup
       4: bipush        -2
       6: bipush        -2
       8: invokespecial #872                // Method android/support/design/widget/CoordinatorLayout$e."<init>":(II)V
      11: areturn

  public java.util.List<android.view.View> d(android.view.View);
    Code:
       0: aload_0
       1: getfield      #142                // Field h:Landroid/support/v4/widget/f;
       4: aload_1
       5: invokevirtual #839                // Method android/support/v4/widget/f.c:(Ljava/lang/Object;)Ljava/util/List;
       8: astore_1
       9: aload_0
      10: getfield      #146                // Field j:Ljava/util/List;
      13: invokeinterface #481,  1          // InterfaceMethod java/util/List.clear:()V
      18: aload_1
      19: ifnull        33
      22: aload_0
      23: getfield      #146                // Field j:Ljava/util/List;
      26: aload_1
      27: invokeinterface #634,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      32: pop
      33: aload_0
      34: getfield      #146                // Field j:Ljava/util/List;
      37: areturn

  protected boolean drawChild(android.graphics.Canvas, android.view.View, long);
    Code:
       0: aload_2
       1: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       7: astore        7
       9: aload         7
      11: getfield      #877                // Field android/support/design/widget/CoordinatorLayout$e.a:Landroid/support/design/widget/CoordinatorLayout$b;
      14: ifnull        179
      17: aload         7
      19: getfield      #877                // Field android/support/design/widget/CoordinatorLayout$e.a:Landroid/support/design/widget/CoordinatorLayout$b;
      22: aload_0
      23: aload_2
      24: invokevirtual #880                // Method android/support/design/widget/CoordinatorLayout$b.d:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)F
      27: fstore        5
      29: fload         5
      31: fconst_0
      32: fcmpl
      33: ifle          179
      36: aload_0
      37: getfield      #882                // Field l:Landroid/graphics/Paint;
      40: ifnonnull     54
      43: aload_0
      44: new           #884                // class android/graphics/Paint
      47: dup
      48: invokespecial #885                // Method android/graphics/Paint."<init>":()V
      51: putfield      #882                // Field l:Landroid/graphics/Paint;
      54: aload_0
      55: getfield      #882                // Field l:Landroid/graphics/Paint;
      58: aload         7
      60: getfield      #877                // Field android/support/design/widget/CoordinatorLayout$e.a:Landroid/support/design/widget/CoordinatorLayout$b;
      63: aload_0
      64: aload_2
      65: invokevirtual #888                // Method android/support/design/widget/CoordinatorLayout$b.c:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)I
      68: invokevirtual #891                // Method android/graphics/Paint.setColor:(I)V
      71: aload_0
      72: getfield      #882                // Field l:Landroid/graphics/Paint;
      75: fload         5
      77: ldc_w         #892                // float 255.0f
      80: fmul
      81: invokestatic  #896                // Method java/lang/Math.round:(F)I
      84: iconst_0
      85: sipush        255
      88: invokestatic  #901                // Method android/support/v4/d/a.a:(III)I
      91: invokevirtual #904                // Method android/graphics/Paint.setAlpha:(I)V
      94: aload_1
      95: invokevirtual #909                // Method android/graphics/Canvas.save:()I
      98: istore        6
     100: aload_2
     101: invokevirtual #912                // Method android/view/View.isOpaque:()Z
     104: ifeq          135
     107: aload_1
     108: aload_2
     109: invokevirtual #419                // Method android/view/View.getLeft:()I
     112: i2f
     113: aload_2
     114: invokevirtual #422                // Method android/view/View.getTop:()I
     117: i2f
     118: aload_2
     119: invokevirtual #425                // Method android/view/View.getRight:()I
     122: i2f
     123: aload_2
     124: invokevirtual #428                // Method android/view/View.getBottom:()I
     127: i2f
     128: getstatic     #918                // Field android/graphics/Region$Op.DIFFERENCE:Landroid/graphics/Region$Op;
     131: invokevirtual #922                // Method android/graphics/Canvas.clipRect:(FFFFLandroid/graphics/Region$Op;)Z
     134: pop
     135: aload_1
     136: aload_0
     137: invokevirtual #333                // Method getPaddingLeft:()I
     140: i2f
     141: aload_0
     142: invokevirtual #356                // Method getPaddingTop:()I
     145: i2f
     146: aload_0
     147: invokevirtual #327                // Method getWidth:()I
     150: aload_0
     151: invokevirtual #342                // Method getPaddingRight:()I
     154: isub
     155: i2f
     156: aload_0
     157: invokevirtual #330                // Method getHeight:()I
     160: aload_0
     161: invokevirtual #365                // Method getPaddingBottom:()I
     164: isub
     165: i2f
     166: aload_0
     167: getfield      #882                // Field l:Landroid/graphics/Paint;
     170: invokevirtual #926                // Method android/graphics/Canvas.drawRect:(FFFFLandroid/graphics/Paint;)V
     173: aload_1
     174: iload         6
     176: invokevirtual #929                // Method android/graphics/Canvas.restoreToCount:(I)V
     179: aload_0
     180: aload_1
     181: aload_2
     182: lload_3
     183: invokespecial #931                // Method android/view/ViewGroup.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
     186: ireturn

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #934                // Method android/view/ViewGroup.drawableStateChanged:()V
       4: aload_0
       5: invokevirtual #938                // Method getDrawableState:()[I
       8: astore_3
       9: aload_0
      10: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
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
      28: invokevirtual #943                // Method android/graphics/drawable/Drawable.isStateful:()Z
      31: ifeq          43
      34: iconst_0
      35: aload         4
      37: aload_3
      38: invokevirtual #947                // Method android/graphics/drawable/Drawable.setState:([I)Z
      41: ior
      42: istore_1
      43: iload_1
      44: ifeq          51
      47: aload_0
      48: invokevirtual #950                // Method invalidate:()V
      51: return

  protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams();
    Code:
       0: aload_0
       1: invokevirtual #953                // Method d:()Landroid/support/design/widget/CoordinatorLayout$e;
       4: areturn

  public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #957                // Method a:(Landroid/util/AttributeSet;)Landroid/support/design/widget/CoordinatorLayout$e;
       5: areturn

  protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #960                // Method a:(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/design/widget/CoordinatorLayout$e;
       5: areturn

  final java.util.List<android.view.View> getDependencySortedChildren();
    Code:
       0: aload_0
       1: invokespecial #963                // Method f:()V
       4: aload_0
       5: getfield      #137                // Field g:Ljava/util/List;
       8: invokestatic  #967                // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
      11: areturn

  public final android.support.v4.view.ab getLastWindowInsets();
    Code:
       0: aload_0
       1: getfield      #591                // Field t:Landroid/support/v4/view/ab;
       4: areturn

  public int getNestedScrollAxes();
    Code:
       0: aload_0
       1: getfield      #155                // Field x:Landroid/support/v4/view/o;
       4: invokevirtual #972                // Method android/support/v4/view/o.a:()I
       7: ireturn

  public android.graphics.drawable.Drawable getStatusBarBackground();
    Code:
       0: aload_0
       1: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
       4: areturn

  protected int getSuggestedMinimumHeight();
    Code:
       0: aload_0
       1: invokespecial #976                // Method android/view/ViewGroup.getSuggestedMinimumHeight:()I
       4: aload_0
       5: invokevirtual #356                // Method getPaddingTop:()I
       8: aload_0
       9: invokevirtual #365                // Method getPaddingBottom:()I
      12: iadd
      13: invokestatic  #353                // Method java/lang/Math.max:(II)I
      16: ireturn

  protected int getSuggestedMinimumWidth();
    Code:
       0: aload_0
       1: invokespecial #979                // Method android/view/ViewGroup.getSuggestedMinimumWidth:()I
       4: aload_0
       5: invokevirtual #333                // Method getPaddingLeft:()I
       8: aload_0
       9: invokevirtual #342                // Method getPaddingRight:()I
      12: iadd
      13: invokestatic  #353                // Method java/lang/Math.max:(II)I
      16: ireturn

  public void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #982                // Method android/view/ViewGroup.onAttachedToWindow:()V
       4: aload_0
       5: iconst_0
       6: invokespecial #983                // Method a:(Z)V
       9: aload_0
      10: getfield      #724                // Field s:Z
      13: ifeq          46
      16: aload_0
      17: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      20: ifnonnull     35
      23: aload_0
      24: new           #25                 // class android/support/design/widget/CoordinatorLayout$f
      27: dup
      28: aload_0
      29: invokespecial #825                // Method android/support/design/widget/CoordinatorLayout$f."<init>":(Landroid/support/design/widget/CoordinatorLayout;)V
      32: putfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      35: aload_0
      36: invokevirtual #829                // Method getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      39: aload_0
      40: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      43: invokevirtual #835                // Method android/view/ViewTreeObserver.addOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      46: aload_0
      47: getfield      #591                // Field t:Landroid/support/v4/view/ab;
      50: ifnonnull     64
      53: aload_0
      54: invokestatic  #573                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
      57: ifeq          64
      60: aload_0
      61: invokestatic  #985                // Method android/support/v4/view/s.o:(Landroid/view/View;)V
      64: aload_0
      65: iconst_1
      66: putfield      #822                // Field n:Z
      69: return

  public void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #988                // Method android/view/ViewGroup.onDetachedFromWindow:()V
       4: aload_0
       5: iconst_0
       6: invokespecial #983                // Method a:(Z)V
       9: aload_0
      10: getfield      #724                // Field s:Z
      13: ifeq          34
      16: aload_0
      17: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      20: ifnull        34
      23: aload_0
      24: invokevirtual #829                // Method getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      27: aload_0
      28: getfield      #824                // Field r:Landroid/support/design/widget/CoordinatorLayout$f;
      31: invokevirtual #856                // Method android/view/ViewTreeObserver.removeOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      34: aload_0
      35: getfield      #846                // Field q:Landroid/view/View;
      38: ifnull        49
      41: aload_0
      42: aload_0
      43: getfield      #846                // Field q:Landroid/view/View;
      46: invokevirtual #991                // Method onStopNestedScroll:(Landroid/view/View;)V
      49: aload_0
      50: iconst_0
      51: putfield      #822                // Field n:Z
      54: return

  public void onDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #995                // Method android/view/ViewGroup.onDraw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #708                // Field u:Z
       9: ifeq          65
      12: aload_0
      13: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      16: ifnull        65
      19: aload_0
      20: getfield      #591                // Field t:Landroid/support/v4/view/ab;
      23: ifnull        37
      26: aload_0
      27: getfield      #591                // Field t:Landroid/support/v4/view/ab;
      30: invokevirtual #595                // Method android/support/v4/view/ab.b:()I
      33: istore_2
      34: goto          39
      37: iconst_0
      38: istore_2
      39: iload_2
      40: ifle          65
      43: aload_0
      44: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      47: iconst_0
      48: iconst_0
      49: aload_0
      50: invokevirtual #327                // Method getWidth:()I
      53: iload_2
      54: invokevirtual #998                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      57: aload_0
      58: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      61: aload_1
      62: invokevirtual #1001               // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      65: return

  public boolean onInterceptTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #533                // Method android/view/MotionEvent.getActionMasked:()I
       4: istore_2
       5: iload_2
       6: ifne          14
       9: aload_0
      10: iconst_1
      11: invokespecial #983                // Method a:(Z)V
      14: aload_0
      15: aload_1
      16: iconst_0
      17: invokespecial #1005               // Method a:(Landroid/view/MotionEvent;I)Z
      20: istore_3
      21: iload_2
      22: iconst_1
      23: if_icmpeq     31
      26: iload_2
      27: iconst_3
      28: if_icmpne     36
      31: aload_0
      32: iconst_1
      33: invokespecial #983                // Method a:(Z)V
      36: iload_3
      37: ireturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: invokestatic  #731                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       4: istore_3
       5: aload_0
       6: getfield      #137                // Field g:Ljava/util/List;
       9: invokeinterface #538,  1          // InterfaceMethod java/util/List.size:()I
      14: istore        4
      16: iconst_0
      17: istore_2
      18: iload_2
      19: iload         4
      21: if_icmpge     96
      24: aload_0
      25: getfield      #137                // Field g:Ljava/util/List;
      28: iload_2
      29: invokeinterface #541,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      34: checkcast     #404                // class android/view/View
      37: astore        6
      39: aload         6
      41: invokevirtual #734                // Method android/view/View.getVisibility:()I
      44: bipush        8
      46: if_icmpne     52
      49: goto          89
      52: aload         6
      54: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      57: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      60: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      63: astore        7
      65: aload         7
      67: ifnull        82
      70: aload         7
      72: aload_0
      73: aload         6
      75: iload_3
      76: invokevirtual #1010               // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)Z
      79: ifne          89
      82: aload_0
      83: aload         6
      85: iload_3
      86: invokevirtual #1011               // Method a:(Landroid/view/View;I)V
      89: iload_2
      90: iconst_1
      91: iadd
      92: istore_2
      93: goto          18
      96: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: invokespecial #963                // Method f:()V
       4: aload_0
       5: invokevirtual #1013               // Method a:()V
       8: aload_0
       9: invokevirtual #333                // Method getPaddingLeft:()I
      12: istore        13
      14: aload_0
      15: invokevirtual #356                // Method getPaddingTop:()I
      18: istore        14
      20: aload_0
      21: invokevirtual #342                // Method getPaddingRight:()I
      24: istore        15
      26: aload_0
      27: invokevirtual #365                // Method getPaddingBottom:()I
      30: istore        16
      32: aload_0
      33: invokestatic  #731                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
      36: istore        17
      38: iload         17
      40: iconst_1
      41: if_icmpne     50
      44: iconst_1
      45: istore        6
      47: goto          53
      50: iconst_0
      51: istore        6
      53: iload_1
      54: invokestatic  #1018               // Method android/view/View$MeasureSpec.getMode:(I)I
      57: istore        18
      59: iload_1
      60: invokestatic  #1021               // Method android/view/View$MeasureSpec.getSize:(I)I
      63: istore        19
      65: iload_2
      66: invokestatic  #1018               // Method android/view/View$MeasureSpec.getMode:(I)I
      69: istore        20
      71: iload_2
      72: invokestatic  #1021               // Method android/view/View$MeasureSpec.getSize:(I)I
      75: istore        21
      77: aload_0
      78: invokevirtual #1022               // Method getSuggestedMinimumWidth:()I
      81: istore        10
      83: aload_0
      84: invokevirtual #1023               // Method getSuggestedMinimumHeight:()I
      87: istore        4
      89: aload_0
      90: getfield      #591                // Field t:Landroid/support/v4/view/ab;
      93: ifnull        109
      96: aload_0
      97: invokestatic  #573                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
     100: ifeq          109
     103: iconst_1
     104: istore        7
     106: goto          112
     109: iconst_0
     110: istore        7
     112: aload_0
     113: getfield      #137                // Field g:Ljava/util/List;
     116: invokeinterface #538,  1          // InterfaceMethod java/util/List.size:()I
     121: istore        8
     123: iconst_0
     124: istore        5
     126: iconst_0
     127: istore        9
     129: iload         9
     131: iload         8
     133: if_icmpge     516
     136: aload_0
     137: getfield      #137                // Field g:Ljava/util/List;
     140: iload         9
     142: invokeinterface #541,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     147: checkcast     #404                // class android/view/View
     150: astore        24
     152: aload         24
     154: invokevirtual #734                // Method android/view/View.getVisibility:()I
     157: bipush        8
     159: if_icmpne     165
     162: goto          507
     165: aload         24
     167: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     170: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
     173: astore        25
     175: aload         25
     177: getfield      #776                // Field android/support/design/widget/CoordinatorLayout$e.e:I
     180: iflt          287
     183: iload         18
     185: ifeq          287
     188: aload_0
     189: aload         25
     191: getfield      #776                // Field android/support/design/widget/CoordinatorLayout$e.e:I
     194: invokespecial #587                // Method b:(I)I
     197: istore_3
     198: aload         25
     200: getfield      #374                // Field android/support/design/widget/CoordinatorLayout$e.c:I
     203: invokestatic  #579                // Method d:(I)I
     206: iload         17
     208: invokestatic  #380                // Method android/support/v4/view/e.a:(II)I
     211: bipush        7
     213: iand
     214: istore        11
     216: iload         11
     218: iconst_3
     219: if_icmpne     227
     222: iload         6
     224: ifeq          238
     227: iload         11
     229: iconst_5
     230: if_icmpne     253
     233: iload         6
     235: ifeq          253
     238: iconst_0
     239: iload         19
     241: iload         15
     243: isub
     244: iload_3
     245: isub
     246: invokestatic  #353                // Method java/lang/Math.max:(II)I
     249: istore_3
     250: goto          289
     253: iload         11
     255: iconst_5
     256: if_icmpne     264
     259: iload         6
     261: ifeq          275
     264: iload         11
     266: iconst_3
     267: if_icmpne     287
     270: iload         6
     272: ifeq          287
     275: iconst_0
     276: iload_3
     277: iload         13
     279: isub
     280: invokestatic  #353                // Method java/lang/Math.max:(II)I
     283: istore_3
     284: goto          289
     287: iconst_0
     288: istore_3
     289: iload         5
     291: istore        11
     293: iload         4
     295: istore        12
     297: iload         7
     299: ifeq          379
     302: aload         24
     304: invokestatic  #573                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
     307: ifne          379
     310: aload_0
     311: getfield      #591                // Field t:Landroid/support/v4/view/ab;
     314: invokevirtual #593                // Method android/support/v4/view/ab.a:()I
     317: istore        4
     319: aload_0
     320: getfield      #591                // Field t:Landroid/support/v4/view/ab;
     323: invokevirtual #597                // Method android/support/v4/view/ab.c:()I
     326: istore        23
     328: aload_0
     329: getfield      #591                // Field t:Landroid/support/v4/view/ab;
     332: invokevirtual #595                // Method android/support/v4/view/ab.b:()I
     335: istore        5
     337: aload_0
     338: getfield      #591                // Field t:Landroid/support/v4/view/ab;
     341: invokevirtual #599                // Method android/support/v4/view/ab.d:()I
     344: istore        22
     346: iload         19
     348: iload         4
     350: iload         23
     352: iadd
     353: isub
     354: iload         18
     356: invokestatic  #1026               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     359: istore        4
     361: iload         21
     363: iload         5
     365: iload         22
     367: iadd
     368: isub
     369: iload         20
     371: invokestatic  #1026               // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     374: istore        5
     376: goto          385
     379: iload_1
     380: istore        4
     382: iload_2
     383: istore        5
     385: aload         25
     387: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
     390: astore        26
     392: aload         26
     394: ifnull        420
     397: aload         26
     399: aload_0
     400: aload         24
     402: iload         4
     404: iload_3
     405: iload         5
     407: iconst_0
     408: invokevirtual #1029               // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
     411: ifne          417
     414: goto          420
     417: goto          435
     420: aload_0
     421: aload         24
     423: iload         4
     425: iload_3
     426: iload         5
     428: iconst_0
     429: invokevirtual #1031               // Method a:(Landroid/view/View;IIII)V
     432: goto          417
     435: iload         10
     437: iload         13
     439: iload         15
     441: iadd
     442: aload         24
     444: invokevirtual #582                // Method android/view/View.getMeasuredWidth:()I
     447: iadd
     448: aload         25
     450: getfield      #336                // Field android/support/design/widget/CoordinatorLayout$e.leftMargin:I
     453: iadd
     454: aload         25
     456: getfield      #345                // Field android/support/design/widget/CoordinatorLayout$e.rightMargin:I
     459: iadd
     460: invokestatic  #353                // Method java/lang/Math.max:(II)I
     463: istore        10
     465: iload         12
     467: iload         14
     469: iload         16
     471: iadd
     472: aload         24
     474: invokevirtual #585                // Method android/view/View.getMeasuredHeight:()I
     477: iadd
     478: aload         25
     480: getfield      #359                // Field android/support/design/widget/CoordinatorLayout$e.topMargin:I
     483: iadd
     484: aload         25
     486: getfield      #368                // Field android/support/design/widget/CoordinatorLayout$e.bottomMargin:I
     489: iadd
     490: invokestatic  #353                // Method java/lang/Math.max:(II)I
     493: istore        4
     495: iload         11
     497: aload         24
     499: invokevirtual #1034               // Method android/view/View.getMeasuredState:()I
     502: invokestatic  #1037               // Method android/view/View.combineMeasuredStates:(II)I
     505: istore        5
     507: iload         9
     509: iconst_1
     510: iadd
     511: istore        9
     513: goto          129
     516: aload_0
     517: iload         10
     519: iload_1
     520: ldc_w         #1038               // int -16777216
     523: iload         5
     525: iand
     526: invokestatic  #1041               // Method android/view/View.resolveSizeAndState:(III)I
     529: iload         4
     531: iload_2
     532: iload         5
     534: bipush        16
     536: ishl
     537: invokestatic  #1041               // Method android/view/View.resolveSizeAndState:(III)I
     540: invokevirtual #1044               // Method setMeasuredDimension:(II)V
     543: return

  public boolean onNestedFling(android.view.View, float, float, boolean);
    Code:
       0: aload_0
       1: invokevirtual #487                // Method getChildCount:()I
       4: istore        6
       6: iconst_0
       7: istore        5
       9: iconst_0
      10: istore        7
      12: iload         5
      14: iload         6
      16: if_icmpge     117
      19: aload_0
      20: iload         5
      22: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      25: astore        9
      27: aload         9
      29: invokevirtual #734                // Method android/view/View.getVisibility:()I
      32: bipush        8
      34: if_icmpne     44
      37: iload         7
      39: istore        8
      41: goto          104
      44: aload         9
      46: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      49: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      52: astore        10
      54: aload         10
      56: iconst_0
      57: invokevirtual #788                // Method android/support/design/widget/CoordinatorLayout$e.b:(I)Z
      60: ifne          70
      63: iload         7
      65: istore        8
      67: goto          104
      70: aload         10
      72: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      75: astore        10
      77: iload         7
      79: istore        8
      81: aload         10
      83: ifnull        104
      86: iload         7
      88: aload         10
      90: aload_0
      91: aload         9
      93: aload_1
      94: fload_2
      95: fload_3
      96: iload         4
      98: invokevirtual #1049               // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FFZ)Z
     101: ior
     102: istore        8
     104: iload         5
     106: iconst_1
     107: iadd
     108: istore        5
     110: iload         8
     112: istore        7
     114: goto          12
     117: iload         7
     119: ifeq          127
     122: aload_0
     123: iconst_1
     124: invokevirtual #793                // Method a:(I)V
     127: iload         7
     129: ireturn

  public boolean onNestedPreFling(android.view.View, float, float);
    Code:
       0: aload_0
       1: invokevirtual #487                // Method getChildCount:()I
       4: istore        5
       6: iconst_0
       7: istore        4
       9: iconst_0
      10: istore        6
      12: iload         4
      14: iload         5
      16: if_icmpge     115
      19: aload_0
      20: iload         4
      22: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      25: astore        8
      27: aload         8
      29: invokevirtual #734                // Method android/view/View.getVisibility:()I
      32: bipush        8
      34: if_icmpne     44
      37: iload         6
      39: istore        7
      41: goto          102
      44: aload         8
      46: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      49: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      52: astore        9
      54: aload         9
      56: iconst_0
      57: invokevirtual #788                // Method android/support/design/widget/CoordinatorLayout$e.b:(I)Z
      60: ifne          70
      63: iload         6
      65: istore        7
      67: goto          102
      70: aload         9
      72: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      75: astore        9
      77: iload         6
      79: istore        7
      81: aload         9
      83: ifnull        102
      86: iload         6
      88: aload         9
      90: aload_0
      91: aload         8
      93: aload_1
      94: fload_2
      95: fload_3
      96: invokevirtual #1054               // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z
      99: ior
     100: istore        7
     102: iload         4
     104: iconst_1
     105: iadd
     106: istore        4
     108: iload         7
     110: istore        6
     112: goto          12
     115: iload         6
     117: ireturn

  public void onNestedPreScroll(android.view.View, int, int, int[]);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: aload         4
       6: iconst_0
       7: invokevirtual #1058               // Method a:(Landroid/view/View;II[II)V
      10: return

  public void onNestedScroll(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: iconst_0
       9: invokevirtual #1061               // Method a:(Landroid/view/View;IIIII)V
      12: return

  public void onNestedScrollAccepted(android.view.View, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iconst_0
       5: invokevirtual #1064               // Method b:(Landroid/view/View;Landroid/view/View;II)V
       8: return

  protected void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_1
       1: instanceof    #28                 // class android/support/design/widget/CoordinatorLayout$g
       4: ifne          13
       7: aload_0
       8: aload_1
       9: invokespecial #1068               // Method android/view/ViewGroup.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      12: return
      13: aload_1
      14: checkcast     #28                 // class android/support/design/widget/CoordinatorLayout$g
      17: astore_1
      18: aload_0
      19: aload_1
      20: invokevirtual #1071               // Method android/support/design/widget/CoordinatorLayout$g.a:()Landroid/os/Parcelable;
      23: invokespecial #1068               // Method android/view/ViewGroup.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      26: aload_1
      27: getfield      #1074               // Field android/support/design/widget/CoordinatorLayout$g.a:Landroid/util/SparseArray;
      30: astore_1
      31: iconst_0
      32: istore_2
      33: aload_0
      34: invokevirtual #487                // Method getChildCount:()I
      37: istore_3
      38: iload_2
      39: iload_3
      40: if_icmpge     112
      43: aload_0
      44: iload_2
      45: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      48: astore        5
      50: aload         5
      52: invokevirtual #1077               // Method android/view/View.getId:()I
      55: istore        4
      57: aload_0
      58: aload         5
      60: invokevirtual #614                // Method a:(Landroid/view/View;)Landroid/support/design/widget/CoordinatorLayout$e;
      63: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      66: astore        6
      68: iload         4
      70: iconst_m1
      71: if_icmpeq     105
      74: aload         6
      76: ifnull        105
      79: aload_1
      80: iload         4
      82: invokevirtual #1080               // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
      85: checkcast     #1082               // class android/os/Parcelable
      88: astore        7
      90: aload         7
      92: ifnull        105
      95: aload         6
      97: aload_0
      98: aload         5
     100: aload         7
     102: invokevirtual #1085               // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
     105: iload_2
     106: iconst_1
     107: iadd
     108: istore_2
     109: goto          38
     112: return

  protected android.os.Parcelable onSaveInstanceState();
    Code:
       0: new           #28                 // class android/support/design/widget/CoordinatorLayout$g
       3: dup
       4: aload_0
       5: invokespecial #1088               // Method android/view/ViewGroup.onSaveInstanceState:()Landroid/os/Parcelable;
       8: invokespecial #1090               // Method android/support/design/widget/CoordinatorLayout$g."<init>":(Landroid/os/Parcelable;)V
      11: astore        4
      13: new           #1079               // class android/util/SparseArray
      16: dup
      17: invokespecial #1091               // Method android/util/SparseArray."<init>":()V
      20: astore        5
      22: aload_0
      23: invokevirtual #487                // Method getChildCount:()I
      26: istore_2
      27: iconst_0
      28: istore_1
      29: iload_1
      30: iload_2
      31: if_icmpge     100
      34: aload_0
      35: iload_1
      36: invokevirtual #494                // Method getChildAt:(I)Landroid/view/View;
      39: astore        6
      41: aload         6
      43: invokevirtual #1077               // Method android/view/View.getId:()I
      46: istore_3
      47: aload         6
      49: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      52: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      55: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      58: astore        7
      60: iload_3
      61: iconst_m1
      62: if_icmpeq     93
      65: aload         7
      67: ifnull        93
      70: aload         7
      72: aload_0
      73: aload         6
      75: invokevirtual #1094               // Method android/support/design/widget/CoordinatorLayout$b.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
      78: astore        6
      80: aload         6
      82: ifnull        93
      85: aload         5
      87: iload_3
      88: aload         6
      90: invokevirtual #1097               // Method android/util/SparseArray.append:(ILjava/lang/Object;)V
      93: iload_1
      94: iconst_1
      95: iadd
      96: istore_1
      97: goto          29
     100: aload         4
     102: aload         5
     104: putfield      #1074               // Field android/support/design/widget/CoordinatorLayout$g.a:Landroid/util/SparseArray;
     107: aload         4
     109: areturn

  public boolean onStartNestedScroll(android.view.View, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iconst_0
       5: invokevirtual #1101               // Method a:(Landroid/view/View;Landroid/view/View;II)Z
       8: ireturn

  public void onStopNestedScroll(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_0
       3: invokevirtual #1102               // Method c:(Landroid/view/View;I)V
       6: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #533                // Method android/view/MotionEvent.getActionMasked:()I
       4: istore_2
       5: aload_0
       6: getfield      #527                // Field p:Landroid/view/View;
       9: ifnonnull     42
      12: aload_0
      13: aload_1
      14: iconst_1
      15: invokespecial #1005               // Method a:(Landroid/view/MotionEvent;I)Z
      18: istore_3
      19: iload_3
      20: istore        4
      22: iload_3
      23: ifeq          29
      26: goto          44
      29: iconst_0
      30: istore        5
      32: iload         4
      34: istore_3
      35: iload         5
      37: istore        4
      39: goto          80
      42: iconst_0
      43: istore_3
      44: aload_0
      45: getfield      #527                // Field p:Landroid/view/View;
      48: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      51: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
      54: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      57: astore        8
      59: iload_3
      60: istore        4
      62: aload         8
      64: ifnull        29
      67: aload         8
      69: aload_0
      70: aload_0
      71: getfield      #527                // Field p:Landroid/view/View;
      74: aload_1
      75: invokevirtual #522                // Method android/support/design/widget/CoordinatorLayout$b.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
      78: istore        4
      80: aload_0
      81: getfield      #527                // Field p:Landroid/view/View;
      84: astore        9
      86: aconst_null
      87: astore        8
      89: aload         9
      91: ifnonnull     110
      94: iload         4
      96: aload_0
      97: aload_1
      98: invokespecial #1105               // Method android/view/ViewGroup.onTouchEvent:(Landroid/view/MotionEvent;)Z
     101: ior
     102: istore        5
     104: aload         8
     106: astore_1
     107: goto          148
     110: iload         4
     112: istore        5
     114: aload         8
     116: astore_1
     117: iload_3
     118: ifeq          148
     121: invokestatic  #511                // Method android/os/SystemClock.uptimeMillis:()J
     124: lstore        6
     126: lload         6
     128: lload         6
     130: iconst_3
     131: fconst_0
     132: fconst_0
     133: iconst_0
     134: invokestatic  #517                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
     137: astore_1
     138: aload_0
     139: aload_1
     140: invokespecial #1105               // Method android/view/ViewGroup.onTouchEvent:(Landroid/view/MotionEvent;)Z
     143: pop
     144: iload         4
     146: istore        5
     148: aload_1
     149: ifnull        156
     152: aload_1
     153: invokevirtual #523                // Method android/view/MotionEvent.recycle:()V
     156: iload_2
     157: iconst_1
     158: if_icmpeq     166
     161: iload_2
     162: iconst_3
     163: if_icmpne     171
     166: aload_0
     167: iconst_0
     168: invokespecial #983                // Method a:(Z)V
     171: iload         5
     173: ireturn

  public boolean requestChildRectangleOnScreen(android.view.View, android.graphics.Rect, boolean);
    Code:
       0: aload_1
       1: invokevirtual #410                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #22                 // class android/support/design/widget/CoordinatorLayout$e
       7: invokevirtual #413                // Method android/support/design/widget/CoordinatorLayout$e.b:()Landroid/support/design/widget/CoordinatorLayout$b;
      10: astore        4
      12: aload         4
      14: ifnull        31
      17: aload         4
      19: aload_0
      20: aload_1
      21: aload_2
      22: iload_3
      23: invokevirtual #1110               // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;Z)Z
      26: ifeq          31
      29: iconst_1
      30: ireturn
      31: aload_0
      32: aload_1
      33: aload_2
      34: iload_3
      35: invokespecial #1112               // Method android/view/ViewGroup.requestChildRectangleOnScreen:(Landroid/view/View;Landroid/graphics/Rect;Z)Z
      38: ireturn

  public void requestDisallowInterceptTouchEvent(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #1115               // Method android/view/ViewGroup.requestDisallowInterceptTouchEvent:(Z)V
       5: iload_1
       6: ifeq          26
       9: aload_0
      10: getfield      #529                // Field m:Z
      13: ifne          26
      16: aload_0
      17: iconst_0
      18: invokespecial #983                // Method a:(Z)V
      21: aload_0
      22: iconst_1
      23: putfield      #529                // Field m:Z
      26: return

  public void setFitsSystemWindows(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #1118               // Method android/view/ViewGroup.setFitsSystemWindows:(Z)V
       5: aload_0
       6: invokespecial #214                // Method g:()V
       9: return

  public void setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #1120               // Field e:Landroid/view/ViewGroup$OnHierarchyChangeListener;
       5: return

  public void setStatusBarBackground(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: if_acmpeq     122
       8: aload_0
       9: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      12: astore        4
      14: aconst_null
      15: astore_3
      16: aload         4
      18: ifnull        29
      21: aload_0
      22: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      25: aconst_null
      26: invokevirtual #1126               // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      29: aload_1
      30: ifnull        38
      33: aload_1
      34: invokevirtual #1129               // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      37: astore_3
      38: aload_0
      39: aload_3
      40: putfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      43: aload_0
      44: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      47: ifnull        118
      50: aload_0
      51: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      54: invokevirtual #943                // Method android/graphics/drawable/Drawable.isStateful:()Z
      57: ifeq          72
      60: aload_0
      61: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      64: aload_0
      65: invokevirtual #938                // Method getDrawableState:()[I
      68: invokevirtual #947                // Method android/graphics/drawable/Drawable.setState:([I)Z
      71: pop
      72: aload_0
      73: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      76: aload_0
      77: invokestatic  #731                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
      80: invokestatic  #1134               // Method android/support/v4/b/a/a.b:(Landroid/graphics/drawable/Drawable;I)Z
      83: pop
      84: aload_0
      85: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      88: astore_1
      89: aload_0
      90: invokevirtual #1135               // Method getVisibility:()I
      93: ifne          101
      96: iconst_1
      97: istore_2
      98: goto          103
     101: iconst_0
     102: istore_2
     103: aload_1
     104: iload_2
     105: iconst_0
     106: invokevirtual #1139               // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
     109: pop
     110: aload_0
     111: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
     114: aload_0
     115: invokevirtual #1126               // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
     118: aload_0
     119: invokestatic  #1141               // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     122: return

  public void setStatusBarBackgroundColor(int);
    Code:
       0: aload_0
       1: new           #1144               // class android/graphics/drawable/ColorDrawable
       4: dup
       5: iload_1
       6: invokespecial #1145               // Method android/graphics/drawable/ColorDrawable."<init>":(I)V
       9: invokevirtual #1147               // Method setStatusBarBackground:(Landroid/graphics/drawable/Drawable;)V
      12: return

  public void setStatusBarBackgroundResource(int);
    Code:
       0: iload_1
       1: ifeq          16
       4: aload_0
       5: invokevirtual #653                // Method getContext:()Landroid/content/Context;
       8: iload_1
       9: invokestatic  #1153               // Method android/support/v4/a/a.a:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      12: astore_2
      13: goto          18
      16: aconst_null
      17: astore_2
      18: aload_0
      19: aload_2
      20: invokevirtual #1147               // Method setStatusBarBackground:(Landroid/graphics/drawable/Drawable;)V
      23: return

  public void setVisibility(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #1156               // Method android/view/ViewGroup.setVisibility:(I)V
       5: iload_1
       6: ifne          14
       9: iconst_1
      10: istore_2
      11: goto          16
      14: iconst_0
      15: istore_2
      16: aload_0
      17: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      20: ifnull        44
      23: aload_0
      24: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      27: invokevirtual #1159               // Method android/graphics/drawable/Drawable.isVisible:()Z
      30: iload_2
      31: if_icmpeq     44
      34: aload_0
      35: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      38: iload_2
      39: iconst_0
      40: invokevirtual #1139               // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
      43: pop
      44: return

  protected boolean verifyDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #1163               // Method android/view/ViewGroup.verifyDrawable:(Landroid/graphics/drawable/Drawable;)Z
       5: ifne          21
       8: aload_1
       9: aload_0
      10: getfield      #209                // Field v:Landroid/graphics/drawable/Drawable;
      13: if_acmpne     19
      16: goto          21
      19: iconst_0
      20: ireturn
      21: iconst_1
      22: ireturn
}
