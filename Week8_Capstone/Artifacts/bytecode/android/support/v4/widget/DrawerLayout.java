public class android.support.v4.widget.DrawerLayout extends android.view.ViewGroup {
  static final int[] a;

  static final boolean b;

  static {};
    Code:
       0: iconst_1
       1: istore_1
       2: iconst_1
       3: newarray       int
       5: dup
       6: iconst_0
       7: ldc           #78                 // int 16843828
       9: iastore
      10: putstatic     #80                 // Field c:[I
      13: iconst_1
      14: newarray       int
      16: dup
      17: iconst_0
      18: ldc           #81                 // int 16842931
      20: iastore
      21: putstatic     #83                 // Field a:[I
      24: getstatic     #88                 // Field android/os/Build$VERSION.SDK_INT:I
      27: bipush        19
      29: if_icmplt     37
      32: iconst_1
      33: istore_0
      34: goto          39
      37: iconst_0
      38: istore_0
      39: iload_0
      40: putstatic     #90                 // Field b:Z
      43: getstatic     #88                 // Field android/os/Build$VERSION.SDK_INT:I
      46: bipush        21
      48: if_icmplt     56
      51: iload_1
      52: istore_0
      53: goto          58
      56: iconst_0
      57: istore_0
      58: iload_0
      59: putstatic     #92                 // Field d:Z
      62: return

  public android.support.v4.widget.DrawerLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #98                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v4.widget.DrawerLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #101                // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.v4.widget.DrawerLayout(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #102                // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #11                 // class android/support/v4/widget/DrawerLayout$b
      11: dup
      12: invokespecial #104                // Method android/support/v4/widget/DrawerLayout$b."<init>":()V
      15: putfield      #106                // Field e:Landroid/support/v4/widget/DrawerLayout$b;
      18: aload_0
      19: ldc           #107                // int -1728053248
      21: putfield      #109                // Field h:I
      24: aload_0
      25: new           #111                // class android/graphics/Paint
      28: dup
      29: invokespecial #112                // Method android/graphics/Paint."<init>":()V
      32: putfield      #114                // Field j:Landroid/graphics/Paint;
      35: aload_0
      36: iconst_1
      37: putfield      #116                // Field q:Z
      40: aload_0
      41: iconst_3
      42: putfield      #118                // Field r:I
      45: aload_0
      46: iconst_3
      47: putfield      #120                // Field s:I
      50: aload_0
      51: iconst_3
      52: putfield      #122                // Field t:I
      55: aload_0
      56: iconst_3
      57: putfield      #124                // Field u:I
      60: aload_0
      61: aconst_null
      62: putfield      #126                // Field I:Landroid/graphics/drawable/Drawable;
      65: aload_0
      66: aconst_null
      67: putfield      #128                // Field J:Landroid/graphics/drawable/Drawable;
      70: aload_0
      71: aconst_null
      72: putfield      #130                // Field K:Landroid/graphics/drawable/Drawable;
      75: aload_0
      76: aconst_null
      77: putfield      #132                // Field L:Landroid/graphics/drawable/Drawable;
      80: aload_0
      81: ldc           #133                // int 262144
      83: invokevirtual #137                // Method setDescendantFocusability:(I)V
      86: aload_0
      87: invokevirtual #141                // Method getResources:()Landroid/content/res/Resources;
      90: invokevirtual #147                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      93: getfield      #152                // Field android/util/DisplayMetrics.density:F
      96: fstore        4
      98: aload_0
      99: ldc           #153                // float 64.0f
     101: fload         4
     103: fmul
     104: ldc           #154                // float 0.5f
     106: fadd
     107: f2i
     108: putfield      #156                // Field g:I
     111: ldc           #157                // float 400.0f
     113: fload         4
     115: fmul
     116: fstore        5
     118: aload_0
     119: new           #25                 // class android/support/v4/widget/DrawerLayout$f
     122: dup
     123: aload_0
     124: iconst_3
     125: invokespecial #160                // Method android/support/v4/widget/DrawerLayout$f."<init>":(Landroid/support/v4/widget/DrawerLayout;I)V
     128: putfield      #162                // Field m:Landroid/support/v4/widget/DrawerLayout$f;
     131: aload_0
     132: new           #25                 // class android/support/v4/widget/DrawerLayout$f
     135: dup
     136: aload_0
     137: iconst_5
     138: invokespecial #160                // Method android/support/v4/widget/DrawerLayout$f."<init>":(Landroid/support/v4/widget/DrawerLayout;I)V
     141: putfield      #164                // Field n:Landroid/support/v4/widget/DrawerLayout$f;
     144: aload_0
     145: aload_0
     146: fconst_1
     147: aload_0
     148: getfield      #162                // Field m:Landroid/support/v4/widget/DrawerLayout$f;
     151: invokestatic  #169                // Method android/support/v4/widget/p.a:(Landroid/view/ViewGroup;FLandroid/support/v4/widget/p$a;)Landroid/support/v4/widget/p;
     154: putfield      #171                // Field k:Landroid/support/v4/widget/p;
     157: aload_0
     158: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     161: iconst_1
     162: invokevirtual #173                // Method android/support/v4/widget/p.a:(I)V
     165: aload_0
     166: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     169: fload         5
     171: invokevirtual #176                // Method android/support/v4/widget/p.a:(F)V
     174: aload_0
     175: getfield      #162                // Field m:Landroid/support/v4/widget/DrawerLayout$f;
     178: aload_0
     179: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     182: invokevirtual #179                // Method android/support/v4/widget/DrawerLayout$f.a:(Landroid/support/v4/widget/p;)V
     185: aload_0
     186: aload_0
     187: fconst_1
     188: aload_0
     189: getfield      #164                // Field n:Landroid/support/v4/widget/DrawerLayout$f;
     192: invokestatic  #169                // Method android/support/v4/widget/p.a:(Landroid/view/ViewGroup;FLandroid/support/v4/widget/p$a;)Landroid/support/v4/widget/p;
     195: putfield      #181                // Field l:Landroid/support/v4/widget/p;
     198: aload_0
     199: getfield      #181                // Field l:Landroid/support/v4/widget/p;
     202: iconst_2
     203: invokevirtual #173                // Method android/support/v4/widget/p.a:(I)V
     206: aload_0
     207: getfield      #181                // Field l:Landroid/support/v4/widget/p;
     210: fload         5
     212: invokevirtual #176                // Method android/support/v4/widget/p.a:(F)V
     215: aload_0
     216: getfield      #164                // Field n:Landroid/support/v4/widget/DrawerLayout$f;
     219: aload_0
     220: getfield      #181                // Field l:Landroid/support/v4/widget/p;
     223: invokevirtual #179                // Method android/support/v4/widget/DrawerLayout$f.a:(Landroid/support/v4/widget/p;)V
     226: aload_0
     227: iconst_1
     228: invokevirtual #185                // Method setFocusableInTouchMode:(Z)V
     231: aload_0
     232: iconst_1
     233: invokestatic  #190                // Method android/support/v4/view/s.a:(Landroid/view/View;I)V
     236: aload_0
     237: new           #8                  // class android/support/v4/widget/DrawerLayout$a
     240: dup
     241: aload_0
     242: invokespecial #193                // Method android/support/v4/widget/DrawerLayout$a."<init>":(Landroid/support/v4/widget/DrawerLayout;)V
     245: invokestatic  #196                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/b;)V
     248: aload_0
     249: iconst_0
     250: invokevirtual #199                // Method setMotionEventSplittingEnabled:(Z)V
     253: aload_0
     254: invokestatic  #202                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
     257: ifeq          323
     260: getstatic     #88                 // Field android/os/Build$VERSION.SDK_INT:I
     263: bipush        21
     265: if_icmplt     318
     268: aload_0
     269: new           #6                  // class android/support/v4/widget/DrawerLayout$1
     272: dup
     273: aload_0
     274: invokespecial #203                // Method android/support/v4/widget/DrawerLayout$1."<init>":(Landroid/support/v4/widget/DrawerLayout;)V
     277: invokevirtual #207                // Method setOnApplyWindowInsetsListener:(Landroid/view/View$OnApplyWindowInsetsListener;)V
     280: aload_0
     281: sipush        1280
     284: invokevirtual #210                // Method setSystemUiVisibility:(I)V
     287: aload_1
     288: getstatic     #80                 // Field c:[I
     291: invokevirtual #216                // Method android/content/Context.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
     294: astore_1
     295: aload_0
     296: aload_1
     297: iconst_0
     298: invokevirtual #222                // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
     301: putfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
     304: aload_1
     305: invokevirtual #227                // Method android/content/res/TypedArray.recycle:()V
     308: goto          323
     311: astore_2
     312: aload_1
     313: invokevirtual #227                // Method android/content/res/TypedArray.recycle:()V
     316: aload_2
     317: athrow
     318: aload_0
     319: aconst_null
     320: putfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
     323: aload_0
     324: fload         4
     326: ldc           #228                // float 10.0f
     328: fmul
     329: putfield      #230                // Field f:F
     332: aload_0
     333: new           #232                // class java/util/ArrayList
     336: dup
     337: invokespecial #233                // Method java/util/ArrayList."<init>":()V
     340: putfield      #235                // Field M:Ljava/util/ArrayList;
     343: return
    Exception table:
       from    to  target type
         295   304   311   any

  static java.lang.String d(int);
    Code:
       0: iload_0
       1: iconst_3
       2: iand
       3: iconst_3
       4: if_icmpne     11
       7: ldc_w         #257                // String LEFT
      10: areturn
      11: iload_0
      12: iconst_5
      13: iand
      14: iconst_5
      15: if_icmpne     22
      18: ldc_w         #259                // String RIGHT
      21: areturn
      22: iload_0
      23: invokestatic  #264                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      26: areturn

  static boolean l(android.view.View);
    Code:
       0: aload_0
       1: invokestatic  #292                // Method android/support/v4/view/s.d:(Landroid/view/View;)I
       4: iconst_4
       5: if_icmpeq     18
       8: aload_0
       9: invokestatic  #292                // Method android/support/v4/view/s.d:(Landroid/view/View;)I
      12: iconst_2
      13: if_icmpeq     18
      16: iconst_1
      17: ireturn
      18: iconst_0
      19: ireturn

  public int a(int);
    Code:
       0: aload_0
       1: invokestatic  #276                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       4: istore_2
       5: iload_1
       6: iconst_3
       7: if_icmpeq     143
      10: iload_1
      11: iconst_5
      12: if_icmpeq     106
      15: iload_1
      16: ldc_w         #302                // int 8388611
      19: if_icmpeq     69
      22: iload_1
      23: ldc_w         #303                // int 8388613
      26: if_icmpeq     32
      29: goto          180
      32: aload_0
      33: getfield      #124                // Field u:I
      36: iconst_3
      37: if_icmpeq     45
      40: aload_0
      41: getfield      #124                // Field u:I
      44: ireturn
      45: iload_2
      46: ifne          57
      49: aload_0
      50: getfield      #120                // Field s:I
      53: istore_1
      54: goto          62
      57: aload_0
      58: getfield      #118                // Field r:I
      61: istore_1
      62: iload_1
      63: iconst_3
      64: if_icmpeq     180
      67: iload_1
      68: ireturn
      69: aload_0
      70: getfield      #122                // Field t:I
      73: iconst_3
      74: if_icmpeq     82
      77: aload_0
      78: getfield      #122                // Field t:I
      81: ireturn
      82: iload_2
      83: ifne          94
      86: aload_0
      87: getfield      #118                // Field r:I
      90: istore_1
      91: goto          99
      94: aload_0
      95: getfield      #120                // Field s:I
      98: istore_1
      99: iload_1
     100: iconst_3
     101: if_icmpeq     180
     104: iload_1
     105: ireturn
     106: aload_0
     107: getfield      #120                // Field s:I
     110: iconst_3
     111: if_icmpeq     119
     114: aload_0
     115: getfield      #120                // Field s:I
     118: ireturn
     119: iload_2
     120: ifne          131
     123: aload_0
     124: getfield      #124                // Field u:I
     127: istore_1
     128: goto          136
     131: aload_0
     132: getfield      #122                // Field t:I
     135: istore_1
     136: iload_1
     137: iconst_3
     138: if_icmpeq     180
     141: iload_1
     142: ireturn
     143: aload_0
     144: getfield      #118                // Field r:I
     147: iconst_3
     148: if_icmpeq     156
     151: aload_0
     152: getfield      #118                // Field r:I
     155: ireturn
     156: iload_2
     157: ifne          168
     160: aload_0
     161: getfield      #122                // Field t:I
     164: istore_1
     165: goto          173
     168: aload_0
     169: getfield      #124                // Field u:I
     172: istore_1
     173: iload_1
     174: iconst_3
     175: if_icmpeq     180
     178: iload_1
     179: ireturn
     180: iconst_0
     181: ireturn

  public int a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #254                // Method g:(Landroid/view/View;)Z
       5: ifne          50
       8: new           #305                // class java/lang/StringBuilder
      11: dup
      12: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
      15: astore_2
      16: aload_2
      17: ldc_w         #308                // String View
      20: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_2
      25: aload_1
      26: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_2
      31: ldc_w         #317                // String  is not a drawer
      34: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: new           #319                // class java/lang/IllegalArgumentException
      41: dup
      42: aload_2
      43: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      46: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      49: athrow
      50: aload_0
      51: aload_1
      52: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      55: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      58: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
      61: invokevirtual #330                // Method a:(I)I
      64: ireturn

  android.view.View a();
    Code:
       0: aload_0
       1: invokevirtual #248                // Method getChildCount:()I
       4: istore_2
       5: iconst_0
       6: istore_1
       7: iload_1
       8: iload_2
       9: if_icmpge     43
      12: aload_0
      13: iload_1
      14: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      17: astore_3
      18: aload_3
      19: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      22: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      25: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      28: iconst_1
      29: iand
      30: iconst_1
      31: if_icmpne     36
      34: aload_3
      35: areturn
      36: iload_1
      37: iconst_1
      38: iadd
      39: istore_1
      40: goto          7
      43: aconst_null
      44: areturn

  public void a(int, int);
    Code:
       0: iload_2
       1: aload_0
       2: invokestatic  #276                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       5: invokestatic  #338                // Method android/support/v4/view/e.a:(II)I
       8: istore_3
       9: iload_2
      10: iconst_3
      11: if_icmpeq     60
      14: iload_2
      15: iconst_5
      16: if_icmpeq     52
      19: iload_2
      20: ldc_w         #302                // int 8388611
      23: if_icmpeq     44
      26: iload_2
      27: ldc_w         #303                // int 8388613
      30: if_icmpeq     36
      33: goto          65
      36: aload_0
      37: iload_1
      38: putfield      #124                // Field u:I
      41: goto          65
      44: aload_0
      45: iload_1
      46: putfield      #122                // Field t:I
      49: goto          65
      52: aload_0
      53: iload_1
      54: putfield      #120                // Field s:I
      57: goto          65
      60: aload_0
      61: iload_1
      62: putfield      #118                // Field r:I
      65: iload_1
      66: ifeq          94
      69: iload_3
      70: iconst_3
      71: if_icmpne     83
      74: aload_0
      75: getfield      #171                // Field k:Landroid/support/v4/widget/p;
      78: astore        4
      80: goto          89
      83: aload_0
      84: getfield      #181                // Field l:Landroid/support/v4/widget/p;
      87: astore        4
      89: aload         4
      91: invokevirtual #340                // Method android/support/v4/widget/p.e:()V
      94: iload_1
      95: tableswitch   { // 1 to 2
                     1: 136
                     2: 117
               default: 116
          }
     116: return
     117: aload_0
     118: iload_3
     119: invokevirtual #342                // Method c:(I)Landroid/view/View;
     122: astore        4
     124: aload         4
     126: ifnull        154
     129: aload_0
     130: aload         4
     132: invokevirtual #345                // Method h:(Landroid/view/View;)V
     135: return
     136: aload_0
     137: iload_3
     138: invokevirtual #342                // Method c:(I)Landroid/view/View;
     141: astore        4
     143: aload         4
     145: ifnull        154
     148: aload_0
     149: aload         4
     151: invokevirtual #347                // Method i:(Landroid/view/View;)V
     154: return

  void a(int, int, android.view.View);
    Code:
       0: aload_0
       1: getfield      #171                // Field k:Landroid/support/v4/widget/p;
       4: invokevirtual #350                // Method android/support/v4/widget/p.a:()I
       7: istore        5
       9: aload_0
      10: getfield      #181                // Field l:Landroid/support/v4/widget/p;
      13: invokevirtual #350                // Method android/support/v4/widget/p.a:()I
      16: istore        6
      18: iconst_2
      19: istore        4
      21: iload         5
      23: iconst_1
      24: if_icmpeq     62
      27: iload         6
      29: iconst_1
      30: if_icmpne     36
      33: goto          62
      36: iload         4
      38: istore_1
      39: iload         5
      41: iconst_2
      42: if_icmpeq     64
      45: iload         6
      47: iconst_2
      48: if_icmpne     57
      51: iload         4
      53: istore_1
      54: goto          64
      57: iconst_0
      58: istore_1
      59: goto          64
      62: iconst_1
      63: istore_1
      64: aload_3
      65: ifnull        114
      68: iload_2
      69: ifne          114
      72: aload_3
      73: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      76: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      79: astore        7
      81: aload         7
      83: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      86: fconst_0
      87: fcmpl
      88: ifne          99
      91: aload_0
      92: aload_3
      93: invokevirtual #354                // Method b:(Landroid/view/View;)V
      96: goto          114
      99: aload         7
     101: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
     104: fconst_1
     105: fcmpl
     106: ifne          114
     109: aload_0
     110: aload_3
     111: invokevirtual #356                // Method c:(Landroid/view/View;)V
     114: iload_1
     115: aload_0
     116: getfield      #358                // Field o:I
     119: if_icmpeq     176
     122: aload_0
     123: iload_1
     124: putfield      #358                // Field o:I
     127: aload_0
     128: getfield      #360                // Field y:Ljava/util/List;
     131: ifnull        176
     134: aload_0
     135: getfield      #360                // Field y:Ljava/util/List;
     138: invokeinterface #365,  1          // InterfaceMethod java/util/List.size:()I
     143: iconst_1
     144: isub
     145: istore_2
     146: iload_2
     147: iflt          176
     150: aload_0
     151: getfield      #360                // Field y:Ljava/util/List;
     154: iload_2
     155: invokeinterface #369,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     160: checkcast     #14                 // class android/support/v4/widget/DrawerLayout$c
     163: iload_1
     164: invokeinterface #370,  2          // InterfaceMethod android/support/v4/widget/DrawerLayout$c.a:(I)V
     169: iload_2
     170: iconst_1
     171: isub
     172: istore_2
     173: goto          146
     176: return

  public void a(int, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #342                // Method c:(I)Landroid/view/View;
       5: astore_3
       6: aload_3
       7: ifnonnull     47
      10: new           #305                // class java/lang/StringBuilder
      13: dup
      14: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
      17: astore_3
      18: aload_3
      19: ldc_w         #373                // String No drawer view found with gravity
      22: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: pop
      26: aload_3
      27: iload_1
      28: invokestatic  #375                // Method d:(I)Ljava/lang/String;
      31: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: new           #319                // class java/lang/IllegalArgumentException
      38: dup
      39: aload_3
      40: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      43: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      46: athrow
      47: aload_0
      48: aload_3
      49: iload_2
      50: invokevirtual #377                // Method a:(Landroid/view/View;Z)V
      53: return

  public void a(android.support.v4.widget.DrawerLayout$c);
    Code:
       0: aload_1
       1: ifnonnull     5
       4: return
       5: aload_0
       6: getfield      #360                // Field y:Ljava/util/List;
       9: ifnonnull     23
      12: aload_0
      13: new           #232                // class java/util/ArrayList
      16: dup
      17: invokespecial #233                // Method java/util/ArrayList."<init>":()V
      20: putfield      #360                // Field y:Ljava/util/List;
      23: aload_0
      24: getfield      #360                // Field y:Ljava/util/List;
      27: aload_1
      28: invokeinterface #382,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      33: pop
      34: return

  void a(android.view.View, float);
    Code:
       0: aload_0
       1: getfield      #360                // Field y:Ljava/util/List;
       4: ifnull        50
       7: aload_0
       8: getfield      #360                // Field y:Ljava/util/List;
      11: invokeinterface #365,  1          // InterfaceMethod java/util/List.size:()I
      16: iconst_1
      17: isub
      18: istore_3
      19: iload_3
      20: iflt          50
      23: aload_0
      24: getfield      #360                // Field y:Ljava/util/List;
      27: iload_3
      28: invokeinterface #369,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      33: checkcast     #14                 // class android/support/v4/widget/DrawerLayout$c
      36: aload_1
      37: fload_2
      38: invokeinterface #385,  3          // InterfaceMethod android/support/v4/widget/DrawerLayout$c.a:(Landroid/view/View;F)V
      43: iload_3
      44: iconst_1
      45: isub
      46: istore_3
      47: goto          19
      50: return

  public void a(android.view.View, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #254                // Method g:(Landroid/view/View;)Z
       5: ifne          50
       8: new           #305                // class java/lang/StringBuilder
      11: dup
      12: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
      15: astore_3
      16: aload_3
      17: ldc_w         #308                // String View
      20: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_3
      25: aload_1
      26: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_3
      31: ldc_w         #387                // String  is not a sliding drawer
      34: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: new           #319                // class java/lang/IllegalArgumentException
      41: dup
      42: aload_3
      43: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      46: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      49: athrow
      50: aload_1
      51: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      54: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      57: astore_3
      58: aload_0
      59: getfield      #116                // Field q:Z
      62: ifeq          84
      65: aload_3
      66: fconst_1
      67: putfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      70: aload_3
      71: iconst_1
      72: putfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      75: aload_0
      76: aload_1
      77: iconst_1
      78: invokespecial #389                // Method c:(Landroid/view/View;Z)V
      81: goto          170
      84: iload_2
      85: ifeq          149
      88: aload_3
      89: aload_3
      90: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      93: iconst_2
      94: ior
      95: putfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      98: aload_0
      99: aload_1
     100: iconst_3
     101: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
     104: ifeq          124
     107: aload_0
     108: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     111: aload_1
     112: iconst_0
     113: aload_1
     114: invokevirtual #395                // Method android/view/View.getTop:()I
     117: invokevirtual #398                // Method android/support/v4/widget/p.a:(Landroid/view/View;II)Z
     120: pop
     121: goto          170
     124: aload_0
     125: getfield      #181                // Field l:Landroid/support/v4/widget/p;
     128: aload_1
     129: aload_0
     130: invokevirtual #401                // Method getWidth:()I
     133: aload_1
     134: invokevirtual #402                // Method android/view/View.getWidth:()I
     137: isub
     138: aload_1
     139: invokevirtual #395                // Method android/view/View.getTop:()I
     142: invokevirtual #398                // Method android/support/v4/widget/p.a:(Landroid/view/View;II)Z
     145: pop
     146: goto          170
     149: aload_0
     150: aload_1
     151: fconst_1
     152: invokevirtual #404                // Method c:(Landroid/view/View;F)V
     155: aload_0
     156: aload_3
     157: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
     160: iconst_0
     161: aload_1
     162: invokevirtual #406                // Method a:(IILandroid/view/View;)V
     165: aload_1
     166: iconst_0
     167: invokevirtual #409                // Method android/view/View.setVisibility:(I)V
     170: aload_0
     171: invokevirtual #412                // Method invalidate:()V
     174: return

  public void a(java.lang.Object, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #415                // Field G:Ljava/lang/Object;
       5: aload_0
       6: iload_2
       7: putfield      #417                // Field H:Z
      10: iload_2
      11: ifne          26
      14: aload_0
      15: invokevirtual #418                // Method getBackground:()Landroid/graphics/drawable/Drawable;
      18: ifnonnull     26
      21: iconst_1
      22: istore_2
      23: goto          28
      26: iconst_0
      27: istore_2
      28: aload_0
      29: iload_2
      30: invokevirtual #421                // Method setWillNotDraw:(Z)V
      33: aload_0
      34: invokevirtual #424                // Method requestLayout:()V
      37: return

  void a(boolean);
    Code:
       0: aload_0
       1: invokevirtual #248                // Method getChildCount:()I
       4: istore        5
       6: iconst_0
       7: istore_2
       8: iconst_0
       9: istore_3
      10: iload_2
      11: iload         5
      13: if_icmpge     147
      16: aload_0
      17: iload_2
      18: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      21: astore        7
      23: aload         7
      25: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      28: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      31: astore        8
      33: iload_3
      34: istore        4
      36: aload_0
      37: aload         7
      39: invokevirtual #254                // Method g:(Landroid/view/View;)Z
      42: ifeq          137
      45: iload_1
      46: ifeq          63
      49: aload         8
      51: getfield      #287                // Field android/support/v4/widget/DrawerLayout$d.c:Z
      54: ifne          63
      57: iload_3
      58: istore        4
      60: goto          137
      63: aload         7
      65: invokevirtual #402                // Method android/view/View.getWidth:()I
      68: istore        4
      70: aload_0
      71: aload         7
      73: iconst_3
      74: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
      77: ifeq          108
      80: aload_0
      81: getfield      #171                // Field k:Landroid/support/v4/widget/p;
      84: aload         7
      86: iload         4
      88: ineg
      89: aload         7
      91: invokevirtual #395                // Method android/view/View.getTop:()I
      94: invokevirtual #398                // Method android/support/v4/widget/p.a:(Landroid/view/View;II)Z
      97: istore        6
      99: iload_3
     100: iload         6
     102: ior
     103: istore        4
     105: goto          131
     108: aload_0
     109: getfield      #181                // Field l:Landroid/support/v4/widget/p;
     112: aload         7
     114: aload_0
     115: invokevirtual #401                // Method getWidth:()I
     118: aload         7
     120: invokevirtual #395                // Method android/view/View.getTop:()I
     123: invokevirtual #398                // Method android/support/v4/widget/p.a:(Landroid/view/View;II)Z
     126: istore        6
     128: goto          99
     131: aload         8
     133: iconst_0
     134: putfield      #287                // Field android/support/v4/widget/DrawerLayout$d.c:Z
     137: iload_2
     138: iconst_1
     139: iadd
     140: istore_2
     141: iload         4
     143: istore_3
     144: goto          10
     147: aload_0
     148: getfield      #162                // Field m:Landroid/support/v4/widget/DrawerLayout$f;
     151: invokevirtual #426                // Method android/support/v4/widget/DrawerLayout$f.a:()V
     154: aload_0
     155: getfield      #164                // Field n:Landroid/support/v4/widget/DrawerLayout$f;
     158: invokevirtual #426                // Method android/support/v4/widget/DrawerLayout$f.a:()V
     161: iload_3
     162: ifeq          169
     165: aload_0
     166: invokevirtual #412                // Method invalidate:()V
     169: return

  boolean a(android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #427                // Method e:(Landroid/view/View;)I
       5: iload_2
       6: iand
       7: iload_2
       8: if_icmpne     13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public void addFocusables(java.util.ArrayList<android.view.View>, int, int);
    Code:
       0: aload_0
       1: invokevirtual #432                // Method getDescendantFocusability:()I
       4: ldc_w         #433                // int 393216
       7: if_icmpne     11
      10: return
      11: aload_0
      12: invokevirtual #248                // Method getChildCount:()I
      15: istore        7
      17: iconst_0
      18: istore        6
      20: iconst_0
      21: istore        4
      23: iconst_0
      24: istore        5
      26: iload         4
      28: iload         7
      30: if_icmpge     92
      33: aload_0
      34: iload         4
      36: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      39: astore        8
      41: aload_0
      42: aload         8
      44: invokevirtual #254                // Method g:(Landroid/view/View;)Z
      47: ifeq          73
      50: aload_0
      51: aload         8
      53: invokevirtual #435                // Method j:(Landroid/view/View;)Z
      56: ifeq          83
      59: aload         8
      61: aload_1
      62: iload_2
      63: iload_3
      64: invokevirtual #437                // Method android/view/View.addFocusables:(Ljava/util/ArrayList;II)V
      67: iconst_1
      68: istore        5
      70: goto          83
      73: aload_0
      74: getfield      #235                // Field M:Ljava/util/ArrayList;
      77: aload         8
      79: invokevirtual #438                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      82: pop
      83: iload         4
      85: iconst_1
      86: iadd
      87: istore        4
      89: goto          26
      92: iload         5
      94: ifne          156
      97: aload_0
      98: getfield      #235                // Field M:Ljava/util/ArrayList;
     101: invokevirtual #439                // Method java/util/ArrayList.size:()I
     104: istore        5
     106: iload         6
     108: istore        4
     110: iload         4
     112: iload         5
     114: if_icmpge     156
     117: aload_0
     118: getfield      #235                // Field M:Ljava/util/ArrayList;
     121: iload         4
     123: invokevirtual #440                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     126: checkcast     #281                // class android/view/View
     129: astore        8
     131: aload         8
     133: invokevirtual #443                // Method android/view/View.getVisibility:()I
     136: ifne          147
     139: aload         8
     141: aload_1
     142: iload_2
     143: iload_3
     144: invokevirtual #437                // Method android/view/View.addFocusables:(Ljava/util/ArrayList;II)V
     147: iload         4
     149: iconst_1
     150: iadd
     151: istore        4
     153: goto          110
     156: aload_0
     157: getfield      #235                // Field M:Ljava/util/ArrayList;
     160: invokevirtual #446                // Method java/util/ArrayList.clear:()V
     163: return

  public void addView(android.view.View, int, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokespecial #452                // Method android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
       7: aload_0
       8: invokevirtual #454                // Method a:()Landroid/view/View;
      11: ifnonnull     30
      14: aload_0
      15: aload_1
      16: invokevirtual #254                // Method g:(Landroid/view/View;)Z
      19: ifeq          25
      22: goto          30
      25: iconst_1
      26: istore_2
      27: goto          32
      30: iconst_4
      31: istore_2
      32: aload_1
      33: iload_2
      34: invokestatic  #190                // Method android/support/v4/view/s.a:(Landroid/view/View;I)V
      37: getstatic     #90                 // Field b:Z
      40: ifne          51
      43: aload_1
      44: aload_0
      45: getfield      #106                // Field e:Landroid/support/v4/widget/DrawerLayout$b;
      48: invokestatic  #196                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/b;)V
      51: return

  public java.lang.CharSequence b(int);
    Code:
       0: iload_1
       1: aload_0
       2: invokestatic  #276                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       5: invokestatic  #338                // Method android/support/v4/view/e.a:(II)I
       8: istore_1
       9: iload_1
      10: iconst_3
      11: if_icmpne     19
      14: aload_0
      15: getfield      #457                // Field E:Ljava/lang/CharSequence;
      18: areturn
      19: iload_1
      20: iconst_5
      21: if_icmpne     29
      24: aload_0
      25: getfield      #459                // Field F:Ljava/lang/CharSequence;
      28: areturn
      29: aconst_null
      30: areturn

  public void b();
    Code:
       0: aload_0
       1: iconst_0
       2: invokevirtual #461                // Method a:(Z)V
       5: return

  public void b(int, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #342                // Method c:(I)Landroid/view/View;
       5: astore_3
       6: aload_3
       7: ifnonnull     47
      10: new           #305                // class java/lang/StringBuilder
      13: dup
      14: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
      17: astore_3
      18: aload_3
      19: ldc_w         #373                // String No drawer view found with gravity
      22: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: pop
      26: aload_3
      27: iload_1
      28: invokestatic  #375                // Method d:(I)Ljava/lang/String;
      31: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: new           #319                // class java/lang/IllegalArgumentException
      38: dup
      39: aload_3
      40: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      43: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      46: athrow
      47: aload_0
      48: aload_3
      49: iload_2
      50: invokevirtual #463                // Method b:(Landroid/view/View;Z)V
      53: return

  public void b(android.support.v4.widget.DrawerLayout$c);
    Code:
       0: aload_1
       1: ifnonnull     5
       4: return
       5: aload_0
       6: getfield      #360                // Field y:Ljava/util/List;
       9: ifnonnull     13
      12: return
      13: aload_0
      14: getfield      #360                // Field y:Ljava/util/List;
      17: aload_1
      18: invokeinterface #466,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      23: pop
      24: return

  void b(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
       7: astore_3
       8: aload_3
       9: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      12: iconst_1
      13: iand
      14: iconst_1
      15: if_icmpne     100
      18: aload_3
      19: iconst_0
      20: putfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      23: aload_0
      24: getfield      #360                // Field y:Ljava/util/List;
      27: ifnull        72
      30: aload_0
      31: getfield      #360                // Field y:Ljava/util/List;
      34: invokeinterface #365,  1          // InterfaceMethod java/util/List.size:()I
      39: iconst_1
      40: isub
      41: istore_2
      42: iload_2
      43: iflt          72
      46: aload_0
      47: getfield      #360                // Field y:Ljava/util/List;
      50: iload_2
      51: invokeinterface #369,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      56: checkcast     #14                 // class android/support/v4/widget/DrawerLayout$c
      59: aload_1
      60: invokeinterface #467,  2          // InterfaceMethod android/support/v4/widget/DrawerLayout$c.b:(Landroid/view/View;)V
      65: iload_2
      66: iconst_1
      67: isub
      68: istore_2
      69: goto          42
      72: aload_0
      73: aload_1
      74: iconst_0
      75: invokespecial #389                // Method c:(Landroid/view/View;Z)V
      78: aload_0
      79: invokevirtual #470                // Method hasWindowFocus:()Z
      82: ifeq          100
      85: aload_0
      86: invokevirtual #473                // Method getRootView:()Landroid/view/View;
      89: astore_1
      90: aload_1
      91: ifnull        100
      94: aload_1
      95: bipush        32
      97: invokevirtual #476                // Method android/view/View.sendAccessibilityEvent:(I)V
     100: return

  void b(android.view.View, float);
    Code:
       0: aload_1
       1: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
       7: astore_3
       8: fload_2
       9: aload_3
      10: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      13: fcmpl
      14: ifne          18
      17: return
      18: aload_3
      19: fload_2
      20: putfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      23: aload_0
      24: aload_1
      25: fload_2
      26: invokevirtual #477                // Method a:(Landroid/view/View;F)V
      29: return

  public void b(android.view.View, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #254                // Method g:(Landroid/view/View;)Z
       5: ifne          55
       8: new           #305                // class java/lang/StringBuilder
      11: dup
      12: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
      15: astore        4
      17: aload         4
      19: ldc_w         #308                // String View
      22: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: pop
      26: aload         4
      28: aload_1
      29: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload         4
      35: ldc_w         #387                // String  is not a sliding drawer
      38: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      41: pop
      42: new           #319                // class java/lang/IllegalArgumentException
      45: dup
      46: aload         4
      48: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      54: athrow
      55: aload_1
      56: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      59: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      62: astore        4
      64: aload_0
      65: getfield      #116                // Field q:Z
      68: ifeq          86
      71: aload         4
      73: fconst_0
      74: putfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      77: aload         4
      79: iconst_0
      80: putfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      83: goto          174
      86: iload_2
      87: ifeq          152
      90: aload         4
      92: aload         4
      94: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      97: iconst_4
      98: ior
      99: putfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
     102: aload_0
     103: aload_1
     104: iconst_3
     105: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
     108: ifeq          138
     111: aload_0
     112: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     115: astore        4
     117: aload_1
     118: invokevirtual #402                // Method android/view/View.getWidth:()I
     121: ineg
     122: istore_3
     123: aload         4
     125: aload_1
     126: iload_3
     127: aload_1
     128: invokevirtual #395                // Method android/view/View.getTop:()I
     131: invokevirtual #398                // Method android/support/v4/widget/p.a:(Landroid/view/View;II)Z
     134: pop
     135: goto          174
     138: aload_0
     139: getfield      #181                // Field l:Landroid/support/v4/widget/p;
     142: astore        4
     144: aload_0
     145: invokevirtual #401                // Method getWidth:()I
     148: istore_3
     149: goto          123
     152: aload_0
     153: aload_1
     154: fconst_0
     155: invokevirtual #404                // Method c:(Landroid/view/View;F)V
     158: aload_0
     159: aload         4
     161: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
     164: iconst_0
     165: aload_1
     166: invokevirtual #406                // Method a:(IILandroid/view/View;)V
     169: aload_1
     170: iconst_4
     171: invokevirtual #409                // Method android/view/View.setVisibility:(I)V
     174: aload_0
     175: invokevirtual #412                // Method invalidate:()V
     178: return

  android.view.View c();
    Code:
       0: aload_0
       1: invokevirtual #248                // Method getChildCount:()I
       4: istore_2
       5: iconst_0
       6: istore_1
       7: iload_1
       8: iload_2
       9: if_icmpge     43
      12: aload_0
      13: iload_1
      14: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      17: astore_3
      18: aload_0
      19: aload_3
      20: invokevirtual #254                // Method g:(Landroid/view/View;)Z
      23: ifeq          36
      26: aload_0
      27: aload_3
      28: invokevirtual #479                // Method k:(Landroid/view/View;)Z
      31: ifeq          36
      34: aload_3
      35: areturn
      36: iload_1
      37: iconst_1
      38: iadd
      39: istore_1
      40: goto          7
      43: aconst_null
      44: areturn

  android.view.View c(int);
    Code:
       0: iload_1
       1: aload_0
       2: invokestatic  #276                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       5: invokestatic  #338                // Method android/support/v4/view/e.a:(II)I
       8: istore_2
       9: aload_0
      10: invokevirtual #248                // Method getChildCount:()I
      13: istore_3
      14: iconst_0
      15: istore_1
      16: iload_1
      17: iload_3
      18: if_icmpge     54
      21: aload_0
      22: iload_1
      23: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      26: astore        4
      28: aload_0
      29: aload         4
      31: invokevirtual #427                // Method e:(Landroid/view/View;)I
      34: bipush        7
      36: iand
      37: iload_2
      38: bipush        7
      40: iand
      41: if_icmpne     47
      44: aload         4
      46: areturn
      47: iload_1
      48: iconst_1
      49: iadd
      50: istore_1
      51: goto          16
      54: aconst_null
      55: areturn

  void c(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
       7: astore_3
       8: aload_3
       9: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      12: iconst_1
      13: iand
      14: ifne          90
      17: aload_3
      18: iconst_1
      19: putfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      22: aload_0
      23: getfield      #360                // Field y:Ljava/util/List;
      26: ifnull        71
      29: aload_0
      30: getfield      #360                // Field y:Ljava/util/List;
      33: invokeinterface #365,  1          // InterfaceMethod java/util/List.size:()I
      38: iconst_1
      39: isub
      40: istore_2
      41: iload_2
      42: iflt          71
      45: aload_0
      46: getfield      #360                // Field y:Ljava/util/List;
      49: iload_2
      50: invokeinterface #369,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      55: checkcast     #14                 // class android/support/v4/widget/DrawerLayout$c
      58: aload_1
      59: invokeinterface #481,  2          // InterfaceMethod android/support/v4/widget/DrawerLayout$c.a:(Landroid/view/View;)V
      64: iload_2
      65: iconst_1
      66: isub
      67: istore_2
      68: goto          41
      71: aload_0
      72: aload_1
      73: iconst_1
      74: invokespecial #389                // Method c:(Landroid/view/View;Z)V
      77: aload_0
      78: invokevirtual #470                // Method hasWindowFocus:()Z
      81: ifeq          90
      84: aload_0
      85: bipush        32
      87: invokevirtual #482                // Method sendAccessibilityEvent:(I)V
      90: return

  void c(android.view.View, float);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #485                // Method d:(Landroid/view/View;)F
       5: fstore_3
       6: aload_1
       7: invokevirtual #402                // Method android/view/View.getWidth:()I
      10: i2f
      11: fstore        4
      13: fload_3
      14: fload         4
      16: fmul
      17: f2i
      18: istore        5
      20: fload         4
      22: fload_2
      23: fmul
      24: f2i
      25: iload         5
      27: isub
      28: istore        5
      30: aload_0
      31: aload_1
      32: iconst_3
      33: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
      36: ifeq          42
      39: goto          47
      42: iload         5
      44: ineg
      45: istore        5
      47: aload_1
      48: iload         5
      50: invokevirtual #488                // Method android/view/View.offsetLeftAndRight:(I)V
      53: aload_0
      54: aload_1
      55: fload_2
      56: invokevirtual #490                // Method b:(Landroid/view/View;F)V
      59: return

  protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #17                 // class android/support/v4/widget/DrawerLayout$d
       4: ifeq          17
       7: aload_0
       8: aload_1
       9: invokespecial #494                // Method android/view/ViewGroup.checkLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Z
      12: ifeq          17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn

  public void computeScroll();
    Code:
       0: aload_0
       1: invokevirtual #248                // Method getChildCount:()I
       4: istore_3
       5: fconst_0
       6: fstore_1
       7: iconst_0
       8: istore_2
       9: iload_2
      10: iload_3
      11: if_icmpge     40
      14: fload_1
      15: aload_0
      16: iload_2
      17: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      20: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      23: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      26: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      29: invokestatic  #501                // Method java/lang/Math.max:(FF)F
      32: fstore_1
      33: iload_2
      34: iconst_1
      35: iadd
      36: istore_2
      37: goto          9
      40: aload_0
      41: fload_1
      42: putfield      #503                // Field i:F
      45: aload_0
      46: getfield      #171                // Field k:Landroid/support/v4/widget/p;
      49: iconst_1
      50: invokevirtual #506                // Method android/support/v4/widget/p.a:(Z)Z
      53: istore        4
      55: aload_0
      56: getfield      #181                // Field l:Landroid/support/v4/widget/p;
      59: iconst_1
      60: invokevirtual #506                // Method android/support/v4/widget/p.a:(Z)Z
      63: istore        5
      65: iload         4
      67: ifne          75
      70: iload         5
      72: ifeq          79
      75: aload_0
      76: invokestatic  #507                // Method android/support/v4/view/s.c:(Landroid/view/View;)V
      79: return

  float d(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
       7: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      10: freturn

  void d();
    Code:
       0: aload_0
       1: getfield      #509                // Field w:Z
       4: ifne          62
       7: invokestatic  #515                // Method android/os/SystemClock.uptimeMillis:()J
      10: lstore_3
      11: lload_3
      12: lload_3
      13: iconst_3
      14: fconst_0
      15: fconst_0
      16: iconst_0
      17: invokestatic  #521                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
      20: astore        5
      22: aload_0
      23: invokevirtual #248                // Method getChildCount:()I
      26: istore_2
      27: iconst_0
      28: istore_1
      29: iload_1
      30: iload_2
      31: if_icmpge     52
      34: aload_0
      35: iload_1
      36: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      39: aload         5
      41: invokevirtual #525                // Method android/view/View.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
      44: pop
      45: iload_1
      46: iconst_1
      47: iadd
      48: istore_1
      49: goto          29
      52: aload         5
      54: invokevirtual #526                // Method android/view/MotionEvent.recycle:()V
      57: aload_0
      58: iconst_1
      59: putfield      #509                // Field w:Z
      62: return

  protected boolean drawChild(android.graphics.Canvas, android.view.View, long);
    Code:
       0: aload_0
       1: invokevirtual #531                // Method getHeight:()I
       4: istore        13
       6: aload_0
       7: aload_2
       8: invokevirtual #533                // Method f:(Landroid/view/View;)Z
      11: istore        15
      13: aload_0
      14: invokevirtual #401                // Method getWidth:()I
      17: istore        6
      19: aload_1
      20: invokevirtual #538                // Method android/graphics/Canvas.save:()I
      23: istore        12
      25: iload         15
      27: ifeq          248
      30: aload_0
      31: invokevirtual #248                // Method getChildCount:()I
      34: istore        14
      36: iconst_0
      37: istore        8
      39: iconst_0
      40: istore        7
      42: iload         8
      44: iload         14
      46: if_icmpge     231
      49: aload_0
      50: iload         8
      52: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      55: astore        17
      57: iload         7
      59: istore        9
      61: iload         6
      63: istore        10
      65: aload         17
      67: aload_2
      68: if_acmpeq     214
      71: iload         7
      73: istore        9
      75: iload         6
      77: istore        10
      79: aload         17
      81: invokevirtual #443                // Method android/view/View.getVisibility:()I
      84: ifne          214
      87: iload         7
      89: istore        9
      91: iload         6
      93: istore        10
      95: aload         17
      97: invokestatic  #540                // Method m:(Landroid/view/View;)Z
     100: ifeq          214
     103: iload         7
     105: istore        9
     107: iload         6
     109: istore        10
     111: aload_0
     112: aload         17
     114: invokevirtual #254                // Method g:(Landroid/view/View;)Z
     117: ifeq          214
     120: aload         17
     122: invokevirtual #541                // Method android/view/View.getHeight:()I
     125: iload         13
     127: if_icmpge     141
     130: iload         7
     132: istore        9
     134: iload         6
     136: istore        10
     138: goto          214
     141: aload_0
     142: aload         17
     144: iconst_3
     145: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
     148: ifeq          184
     151: aload         17
     153: invokevirtual #544                // Method android/view/View.getRight:()I
     156: istore        11
     158: iload         7
     160: istore        9
     162: iload         6
     164: istore        10
     166: iload         11
     168: iload         7
     170: if_icmple     214
     173: iload         11
     175: istore        9
     177: iload         6
     179: istore        10
     181: goto          214
     184: aload         17
     186: invokevirtual #547                // Method android/view/View.getLeft:()I
     189: istore        11
     191: iload         7
     193: istore        9
     195: iload         6
     197: istore        10
     199: iload         11
     201: iload         6
     203: if_icmpge     214
     206: iload         11
     208: istore        10
     210: iload         7
     212: istore        9
     214: iload         8
     216: iconst_1
     217: iadd
     218: istore        8
     220: iload         9
     222: istore        7
     224: iload         10
     226: istore        6
     228: goto          42
     231: aload_1
     232: iload         7
     234: iconst_0
     235: iload         6
     237: aload_0
     238: invokevirtual #531                // Method getHeight:()I
     241: invokevirtual #551                // Method android/graphics/Canvas.clipRect:(IIII)Z
     244: pop
     245: goto          251
     248: iconst_0
     249: istore        7
     251: aload_0
     252: aload_1
     253: aload_2
     254: lload_3
     255: invokespecial #553                // Method android/view/ViewGroup.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
     258: istore        16
     260: aload_1
     261: iload         12
     263: invokevirtual #556                // Method android/graphics/Canvas.restoreToCount:(I)V
     266: aload_0
     267: getfield      #503                // Field i:F
     270: fconst_0
     271: fcmpl
     272: ifle          348
     275: iload         15
     277: ifeq          348
     280: aload_0
     281: getfield      #109                // Field h:I
     284: ldc_w         #557                // int -16777216
     287: iand
     288: bipush        24
     290: iushr
     291: i2f
     292: aload_0
     293: getfield      #503                // Field i:F
     296: fmul
     297: f2i
     298: istore        8
     300: aload_0
     301: getfield      #109                // Field h:I
     304: istore        9
     306: aload_0
     307: getfield      #114                // Field j:Landroid/graphics/Paint;
     310: iload         8
     312: bipush        24
     314: ishl
     315: iload         9
     317: ldc_w         #558                // int 16777215
     320: iand
     321: ior
     322: invokevirtual #561                // Method android/graphics/Paint.setColor:(I)V
     325: aload_1
     326: iload         7
     328: i2f
     329: fconst_0
     330: iload         6
     332: i2f
     333: aload_0
     334: invokevirtual #531                // Method getHeight:()I
     337: i2f
     338: aload_0
     339: getfield      #114                // Field j:Landroid/graphics/Paint;
     342: invokevirtual #565                // Method android/graphics/Canvas.drawRect:(FFFFLandroid/graphics/Paint;)V
     345: iload         16
     347: ireturn
     348: aload_0
     349: getfield      #269                // Field C:Landroid/graphics/drawable/Drawable;
     352: ifnull        454
     355: aload_0
     356: aload_2
     357: iconst_3
     358: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
     361: ifeq          454
     364: aload_0
     365: getfield      #269                // Field C:Landroid/graphics/drawable/Drawable;
     368: invokevirtual #568                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
     371: istore        6
     373: aload_2
     374: invokevirtual #544                // Method android/view/View.getRight:()I
     377: istore        7
     379: aload_0
     380: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     383: invokevirtual #570                // Method android/support/v4/widget/p.b:()I
     386: istore        8
     388: fconst_0
     389: iload         7
     391: i2f
     392: iload         8
     394: i2f
     395: fdiv
     396: fconst_1
     397: invokestatic  #573                // Method java/lang/Math.min:(FF)F
     400: invokestatic  #501                // Method java/lang/Math.max:(FF)F
     403: fstore        5
     405: aload_0
     406: getfield      #269                // Field C:Landroid/graphics/drawable/Drawable;
     409: iload         7
     411: aload_2
     412: invokevirtual #395                // Method android/view/View.getTop:()I
     415: iload         6
     417: iload         7
     419: iadd
     420: aload_2
     421: invokevirtual #576                // Method android/view/View.getBottom:()I
     424: invokevirtual #580                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     427: aload_0
     428: getfield      #269                // Field C:Landroid/graphics/drawable/Drawable;
     431: fload         5
     433: ldc_w         #581                // float 255.0f
     436: fmul
     437: f2i
     438: invokevirtual #584                // Method android/graphics/drawable/Drawable.setAlpha:(I)V
     441: aload_0
     442: getfield      #269                // Field C:Landroid/graphics/drawable/Drawable;
     445: astore_2
     446: aload_2
     447: aload_1
     448: invokevirtual #588                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     451: iload         16
     453: ireturn
     454: aload_0
     455: getfield      #273                // Field D:Landroid/graphics/drawable/Drawable;
     458: ifnull        564
     461: aload_0
     462: aload_2
     463: iconst_5
     464: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
     467: ifeq          564
     470: aload_0
     471: getfield      #273                // Field D:Landroid/graphics/drawable/Drawable;
     474: invokevirtual #568                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
     477: istore        6
     479: aload_2
     480: invokevirtual #547                // Method android/view/View.getLeft:()I
     483: istore        7
     485: aload_0
     486: invokevirtual #401                // Method getWidth:()I
     489: istore        8
     491: aload_0
     492: getfield      #181                // Field l:Landroid/support/v4/widget/p;
     495: invokevirtual #570                // Method android/support/v4/widget/p.b:()I
     498: istore        9
     500: fconst_0
     501: iload         8
     503: iload         7
     505: isub
     506: i2f
     507: iload         9
     509: i2f
     510: fdiv
     511: fconst_1
     512: invokestatic  #573                // Method java/lang/Math.min:(FF)F
     515: invokestatic  #501                // Method java/lang/Math.max:(FF)F
     518: fstore        5
     520: aload_0
     521: getfield      #273                // Field D:Landroid/graphics/drawable/Drawable;
     524: iload         7
     526: iload         6
     528: isub
     529: aload_2
     530: invokevirtual #395                // Method android/view/View.getTop:()I
     533: iload         7
     535: aload_2
     536: invokevirtual #576                // Method android/view/View.getBottom:()I
     539: invokevirtual #580                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     542: aload_0
     543: getfield      #273                // Field D:Landroid/graphics/drawable/Drawable;
     546: fload         5
     548: ldc_w         #581                // float 255.0f
     551: fmul
     552: f2i
     553: invokevirtual #584                // Method android/graphics/drawable/Drawable.setAlpha:(I)V
     556: aload_0
     557: getfield      #273                // Field D:Landroid/graphics/drawable/Drawable;
     560: astore_2
     561: goto          446
     564: iload         16
     566: ireturn

  int e(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
       7: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
      10: aload_0
      11: invokestatic  #276                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
      14: invokestatic  #338                // Method android/support/v4/view/e.a:(II)I
      17: ireturn

  public void e(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_1
       3: invokevirtual #590                // Method a:(IZ)V
       6: return

  public void f(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_1
       3: invokevirtual #592                // Method b:(IZ)V
       6: return

  boolean f(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
       7: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
      10: ifne          15
      13: iconst_1
      14: ireturn
      15: iconst_0
      16: ireturn

  public boolean g(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #342                // Method c:(I)Landroid/view/View;
       5: astore_2
       6: aload_2
       7: ifnull        16
      10: aload_0
      11: aload_2
      12: invokevirtual #435                // Method j:(Landroid/view/View;)Z
      15: ireturn
      16: iconst_0
      17: ireturn

  boolean g(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
       7: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
      10: aload_1
      11: invokestatic  #276                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
      14: invokestatic  #338                // Method android/support/v4/view/e.a:(II)I
      17: istore_2
      18: iload_2
      19: iconst_3
      20: iand
      21: ifeq          26
      24: iconst_1
      25: ireturn
      26: iload_2
      27: iconst_5
      28: iand
      29: ifeq          34
      32: iconst_1
      33: ireturn
      34: iconst_0
      35: ireturn

  protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams();
    Code:
       0: new           #17                 // class android/support/v4/widget/DrawerLayout$d
       3: dup
       4: iconst_m1
       5: iconst_m1
       6: invokespecial #596                // Method android/support/v4/widget/DrawerLayout$d."<init>":(II)V
       9: areturn

  public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: new           #17                 // class android/support/v4/widget/DrawerLayout$d
       3: dup
       4: aload_0
       5: invokevirtual #602                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: invokespecial #603                // Method android/support/v4/widget/DrawerLayout$d."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
      12: areturn

  protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #17                 // class android/support/v4/widget/DrawerLayout$d
       4: ifeq          19
       7: new           #17                 // class android/support/v4/widget/DrawerLayout$d
      10: dup
      11: aload_1
      12: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      15: invokespecial #607                // Method android/support/v4/widget/DrawerLayout$d."<init>":(Landroid/support/v4/widget/DrawerLayout$d;)V
      18: areturn
      19: aload_1
      20: instanceof    #609                // class android/view/ViewGroup$MarginLayoutParams
      23: ifeq          38
      26: new           #17                 // class android/support/v4/widget/DrawerLayout$d
      29: dup
      30: aload_1
      31: checkcast     #609                // class android/view/ViewGroup$MarginLayoutParams
      34: invokespecial #612                // Method android/support/v4/widget/DrawerLayout$d."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
      37: areturn
      38: new           #17                 // class android/support/v4/widget/DrawerLayout$d
      41: dup
      42: aload_1
      43: invokespecial #615                // Method android/support/v4/widget/DrawerLayout$d."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
      46: areturn

  public float getDrawerElevation();
    Code:
       0: getstatic     #92                 // Field d:Z
       3: ifeq          11
       6: aload_0
       7: getfield      #230                // Field f:F
      10: freturn
      11: fconst_0
      12: freturn

  public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable();
    Code:
       0: aload_0
       1: getfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
       4: areturn

  public void h(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_1
       3: invokevirtual #377                // Method a:(Landroid/view/View;Z)V
       6: return

  public boolean h(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #342                // Method c:(I)Landroid/view/View;
       5: astore_2
       6: aload_2
       7: ifnull        16
      10: aload_0
      11: aload_2
      12: invokevirtual #479                // Method k:(Landroid/view/View;)Z
      15: ireturn
      16: iconst_0
      17: ireturn

  public void i(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_1
       3: invokevirtual #463                // Method b:(Landroid/view/View;Z)V
       6: return

  public boolean j(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #254                // Method g:(Landroid/view/View;)Z
       5: ifne          50
       8: new           #305                // class java/lang/StringBuilder
      11: dup
      12: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
      15: astore_2
      16: aload_2
      17: ldc_w         #308                // String View
      20: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_2
      25: aload_1
      26: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_2
      31: ldc_w         #317                // String  is not a drawer
      34: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: new           #319                // class java/lang/IllegalArgumentException
      41: dup
      42: aload_2
      43: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      46: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      49: athrow
      50: aload_1
      51: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      54: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      57: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      60: iconst_1
      61: iand
      62: iconst_1
      63: if_icmpne     68
      66: iconst_1
      67: ireturn
      68: iconst_0
      69: ireturn

  public boolean k(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #254                // Method g:(Landroid/view/View;)Z
       5: ifne          50
       8: new           #305                // class java/lang/StringBuilder
      11: dup
      12: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
      15: astore_2
      16: aload_2
      17: ldc_w         #308                // String View
      20: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_2
      25: aload_1
      26: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_2
      31: ldc_w         #317                // String  is not a drawer
      34: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: new           #319                // class java/lang/IllegalArgumentException
      41: dup
      42: aload_2
      43: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      46: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      49: athrow
      50: aload_1
      51: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      54: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      57: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
      60: fconst_0
      61: fcmpl
      62: ifle          67
      65: iconst_1
      66: ireturn
      67: iconst_0
      68: ireturn

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #621                // Method android/view/ViewGroup.onAttachedToWindow:()V
       4: aload_0
       5: iconst_1
       6: putfield      #116                // Field q:Z
       9: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #624                // Method android/view/ViewGroup.onDetachedFromWindow:()V
       4: aload_0
       5: iconst_1
       6: putfield      #116                // Field q:Z
       9: return

  public void onDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #627                // Method android/view/ViewGroup.onDraw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #417                // Field H:Z
       9: ifeq          76
      12: aload_0
      13: getfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
      16: ifnull        76
      19: getstatic     #88                 // Field android/os/Build$VERSION.SDK_INT:I
      22: bipush        21
      24: if_icmplt     48
      27: aload_0
      28: getfield      #415                // Field G:Ljava/lang/Object;
      31: ifnull        48
      34: aload_0
      35: getfield      #415                // Field G:Ljava/lang/Object;
      38: checkcast     #629                // class android/view/WindowInsets
      41: invokevirtual #632                // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
      44: istore_2
      45: goto          50
      48: iconst_0
      49: istore_2
      50: iload_2
      51: ifle          76
      54: aload_0
      55: getfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
      58: iconst_0
      59: iconst_0
      60: aload_0
      61: invokevirtual #401                // Method getWidth:()I
      64: iload_2
      65: invokevirtual #580                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      68: aload_0
      69: getfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
      72: aload_1
      73: invokevirtual #588                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      76: return

  public boolean onInterceptTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #636                // Method android/view/MotionEvent.getActionMasked:()I
       4: istore        4
       6: aload_0
       7: getfield      #171                // Field k:Landroid/support/v4/widget/p;
      10: aload_1
      11: invokevirtual #638                // Method android/support/v4/widget/p.a:(Landroid/view/MotionEvent;)Z
      14: istore        7
      16: aload_0
      17: getfield      #181                // Field l:Landroid/support/v4/widget/p;
      20: aload_1
      21: invokevirtual #638                // Method android/support/v4/widget/p.a:(Landroid/view/MotionEvent;)Z
      24: istore        8
      26: iconst_1
      27: istore        6
      29: iload         4
      31: tableswitch   { // 0 to 3
                     0: 109
                     1: 91
                     2: 63
                     3: 91
               default: 60
          }
      60: goto          184
      63: aload_0
      64: getfield      #171                // Field k:Landroid/support/v4/widget/p;
      67: iconst_3
      68: invokevirtual #640                // Method android/support/v4/widget/p.d:(I)Z
      71: ifeq          184
      74: aload_0
      75: getfield      #162                // Field m:Landroid/support/v4/widget/DrawerLayout$f;
      78: invokevirtual #426                // Method android/support/v4/widget/DrawerLayout$f.a:()V
      81: aload_0
      82: getfield      #164                // Field n:Landroid/support/v4/widget/DrawerLayout$f;
      85: invokevirtual #426                // Method android/support/v4/widget/DrawerLayout$f.a:()V
      88: goto          184
      91: aload_0
      92: iconst_1
      93: invokevirtual #461                // Method a:(Z)V
      96: aload_0
      97: iconst_0
      98: putfield      #642                // Field v:Z
     101: aload_0
     102: iconst_0
     103: putfield      #509                // Field w:Z
     106: goto          184
     109: aload_1
     110: invokevirtual #645                // Method android/view/MotionEvent.getX:()F
     113: fstore_2
     114: aload_1
     115: invokevirtual #648                // Method android/view/MotionEvent.getY:()F
     118: fstore_3
     119: aload_0
     120: fload_2
     121: putfield      #650                // Field z:F
     124: aload_0
     125: fload_3
     126: putfield      #652                // Field A:F
     129: aload_0
     130: getfield      #503                // Field i:F
     133: fconst_0
     134: fcmpl
     135: ifle          168
     138: aload_0
     139: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     142: fload_2
     143: f2i
     144: fload_3
     145: f2i
     146: invokevirtual #655                // Method android/support/v4/widget/p.d:(II)Landroid/view/View;
     149: astore_1
     150: aload_1
     151: ifnull        168
     154: aload_0
     155: aload_1
     156: invokevirtual #533                // Method f:(Landroid/view/View;)Z
     159: ifeq          168
     162: iconst_1
     163: istore        4
     165: goto          171
     168: iconst_0
     169: istore        4
     171: aload_0
     172: iconst_0
     173: putfield      #642                // Field v:Z
     176: aload_0
     177: iconst_0
     178: putfield      #509                // Field w:Z
     181: goto          187
     184: iconst_0
     185: istore        4
     187: iload         6
     189: istore        5
     191: iload         7
     193: iload         8
     195: ior
     196: ifne          231
     199: iload         6
     201: istore        5
     203: iload         4
     205: ifne          231
     208: iload         6
     210: istore        5
     212: aload_0
     213: invokespecial #657                // Method h:()Z
     216: ifne          231
     219: aload_0
     220: getfield      #509                // Field w:Z
     223: ifeq          228
     226: iconst_1
     227: ireturn
     228: iconst_0
     229: istore        5
     231: iload         5
     233: ireturn

  public boolean onKeyDown(int, android.view.KeyEvent);
    Code:
       0: iload_1
       1: iconst_4
       2: if_icmpne     18
       5: aload_0
       6: invokespecial #661                // Method i:()Z
       9: ifeq          18
      12: aload_2
      13: invokevirtual #666                // Method android/view/KeyEvent.startTracking:()V
      16: iconst_1
      17: ireturn
      18: aload_0
      19: iload_1
      20: aload_2
      21: invokespecial #668                // Method android/view/ViewGroup.onKeyDown:(ILandroid/view/KeyEvent;)Z
      24: ireturn

  public boolean onKeyUp(int, android.view.KeyEvent);
    Code:
       0: iload_1
       1: iconst_4
       2: if_icmpne     34
       5: aload_0
       6: invokevirtual #290                // Method c:()Landroid/view/View;
       9: astore_2
      10: aload_2
      11: ifnull        26
      14: aload_0
      15: aload_2
      16: invokevirtual #671                // Method a:(Landroid/view/View;)I
      19: ifne          26
      22: aload_0
      23: invokevirtual #673                // Method b:()V
      26: aload_2
      27: ifnull        32
      30: iconst_1
      31: ireturn
      32: iconst_0
      33: ireturn
      34: aload_0
      35: iload_1
      36: aload_2
      37: invokespecial #675                // Method android/view/ViewGroup.onKeyUp:(ILandroid/view/KeyEvent;)Z
      40: ireturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #679                // Field p:Z
       5: iload         4
       7: iload_2
       8: isub
       9: istore        10
      11: aload_0
      12: invokevirtual #248                // Method getChildCount:()I
      15: istore        11
      17: iconst_0
      18: istore        4
      20: iload         4
      22: iload         11
      24: if_icmpge     442
      27: aload_0
      28: iload         4
      30: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      33: astore        15
      35: aload         15
      37: invokevirtual #443                // Method android/view/View.getVisibility:()I
      40: bipush        8
      42: if_icmpne     48
      45: goto          433
      48: aload         15
      50: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      53: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      56: astore        16
      58: aload_0
      59: aload         15
      61: invokevirtual #533                // Method f:(Landroid/view/View;)Z
      64: ifeq          107
      67: aload         15
      69: aload         16
      71: getfield      #682                // Field android/support/v4/widget/DrawerLayout$d.leftMargin:I
      74: aload         16
      76: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
      79: aload         16
      81: getfield      #682                // Field android/support/v4/widget/DrawerLayout$d.leftMargin:I
      84: aload         15
      86: invokevirtual #688                // Method android/view/View.getMeasuredWidth:()I
      89: iadd
      90: aload         16
      92: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
      95: aload         15
      97: invokevirtual #691                // Method android/view/View.getMeasuredHeight:()I
     100: iadd
     101: invokevirtual #694                // Method android/view/View.layout:(IIII)V
     104: goto          433
     107: aload         15
     109: invokevirtual #688                // Method android/view/View.getMeasuredWidth:()I
     112: istore        12
     114: aload         15
     116: invokevirtual #691                // Method android/view/View.getMeasuredHeight:()I
     119: istore        13
     121: aload_0
     122: aload         15
     124: iconst_3
     125: invokevirtual #392                // Method a:(Landroid/view/View;I)Z
     128: ifeq          167
     131: iload         12
     133: ineg
     134: istore_2
     135: iload         12
     137: i2f
     138: fstore        6
     140: iload_2
     141: aload         16
     143: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
     146: fload         6
     148: fmul
     149: f2i
     150: iadd
     151: istore        7
     153: iload         12
     155: iload         7
     157: iadd
     158: i2f
     159: fload         6
     161: fdiv
     162: fstore        6
     164: goto          197
     167: iload         12
     169: i2f
     170: fstore        6
     172: iload         10
     174: aload         16
     176: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
     179: fload         6
     181: fmul
     182: f2i
     183: isub
     184: istore        7
     186: iload         10
     188: iload         7
     190: isub
     191: i2f
     192: fload         6
     194: fdiv
     195: fstore        6
     197: fload         6
     199: aload         16
     201: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
     204: fcmpl
     205: ifeq          214
     208: iconst_1
     209: istore        8
     211: goto          217
     214: iconst_0
     215: istore        8
     217: aload         16
     219: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
     222: bipush        112
     224: iand
     225: istore_2
     226: iload_2
     227: bipush        16
     229: if_icmpeq     306
     232: iload_2
     233: bipush        80
     235: if_icmpeq     266
     238: aload         15
     240: iload         7
     242: aload         16
     244: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
     247: iload         12
     249: iload         7
     251: iadd
     252: aload         16
     254: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
     257: iload         13
     259: iadd
     260: invokevirtual #694                // Method android/view/View.layout:(IIII)V
     263: goto          388
     266: iload         5
     268: iload_3
     269: isub
     270: istore_2
     271: aload         15
     273: iload         7
     275: iload_2
     276: aload         16
     278: getfield      #697                // Field android/support/v4/widget/DrawerLayout$d.bottomMargin:I
     281: isub
     282: aload         15
     284: invokevirtual #691                // Method android/view/View.getMeasuredHeight:()I
     287: isub
     288: iload         12
     290: iload         7
     292: iadd
     293: iload_2
     294: aload         16
     296: getfield      #697                // Field android/support/v4/widget/DrawerLayout$d.bottomMargin:I
     299: isub
     300: invokevirtual #694                // Method android/view/View.layout:(IIII)V
     303: goto          388
     306: iload         5
     308: iload_3
     309: isub
     310: istore        14
     312: iload         14
     314: iload         13
     316: isub
     317: iconst_2
     318: idiv
     319: istore        9
     321: iload         9
     323: aload         16
     325: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
     328: if_icmpge     340
     331: aload         16
     333: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
     336: istore_2
     337: goto          371
     340: iload         9
     342: istore_2
     343: iload         9
     345: iload         13
     347: iadd
     348: iload         14
     350: aload         16
     352: getfield      #697                // Field android/support/v4/widget/DrawerLayout$d.bottomMargin:I
     355: isub
     356: if_icmple     371
     359: iload         14
     361: aload         16
     363: getfield      #697                // Field android/support/v4/widget/DrawerLayout$d.bottomMargin:I
     366: isub
     367: iload         13
     369: isub
     370: istore_2
     371: aload         15
     373: iload         7
     375: iload_2
     376: iload         12
     378: iload         7
     380: iadd
     381: iload         13
     383: iload_2
     384: iadd
     385: invokevirtual #694                // Method android/view/View.layout:(IIII)V
     388: iload         8
     390: ifeq          401
     393: aload_0
     394: aload         15
     396: fload         6
     398: invokevirtual #490                // Method b:(Landroid/view/View;F)V
     401: aload         16
     403: getfield      #352                // Field android/support/v4/widget/DrawerLayout$d.b:F
     406: fconst_0
     407: fcmpl
     408: ifle          416
     411: iconst_0
     412: istore_2
     413: goto          418
     416: iconst_4
     417: istore_2
     418: aload         15
     420: invokevirtual #443                // Method android/view/View.getVisibility:()I
     423: iload_2
     424: if_icmpeq     433
     427: aload         15
     429: iload_2
     430: invokevirtual #409                // Method android/view/View.setVisibility:(I)V
     433: iload         4
     435: iconst_1
     436: iadd
     437: istore        4
     439: goto          20
     442: aload_0
     443: iconst_0
     444: putfield      #679                // Field p:Z
     447: aload_0
     448: iconst_0
     449: putfield      #116                // Field q:Z
     452: return

  protected void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #703                // Method android/view/View$MeasureSpec.getMode:(I)I
       4: istore        8
       6: iload_2
       7: invokestatic  #703                // Method android/view/View$MeasureSpec.getMode:(I)I
      10: istore        7
      12: iload_1
      13: invokestatic  #706                // Method android/view/View$MeasureSpec.getSize:(I)I
      16: istore_3
      17: iload_2
      18: invokestatic  #706                // Method android/view/View$MeasureSpec.getSize:(I)I
      21: istore        4
      23: iload         8
      25: ldc_w         #707                // int 1073741824
      28: if_icmpne     46
      31: iload_3
      32: istore        5
      34: iload         4
      36: istore        6
      38: iload         7
      40: ldc_w         #707                // int 1073741824
      43: if_icmpeq     111
      46: aload_0
      47: invokevirtual #710                // Method isInEditMode:()Z
      50: ifeq          804
      53: iload         8
      55: ldc_w         #711                // int -2147483648
      58: if_icmpne     64
      61: goto          73
      64: iload         8
      66: ifne          73
      69: sipush        300
      72: istore_3
      73: iload         7
      75: ldc_w         #711                // int -2147483648
      78: if_icmpne     91
      81: iload_3
      82: istore        5
      84: iload         4
      86: istore        6
      88: goto          111
      91: iload_3
      92: istore        5
      94: iload         4
      96: istore        6
      98: iload         7
     100: ifne          111
     103: sipush        300
     106: istore        6
     108: iload_3
     109: istore        5
     111: aload_0
     112: iload         5
     114: iload         6
     116: invokevirtual #714                // Method setMeasuredDimension:(II)V
     119: aload_0
     120: getfield      #415                // Field G:Ljava/lang/Object;
     123: ifnull        139
     126: aload_0
     127: invokestatic  #202                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
     130: ifeq          139
     133: iconst_1
     134: istore        7
     136: goto          142
     139: iconst_0
     140: istore        7
     142: aload_0
     143: invokestatic  #276                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
     146: istore        10
     148: aload_0
     149: invokevirtual #248                // Method getChildCount:()I
     152: istore        11
     154: iconst_0
     155: istore        8
     157: iconst_0
     158: istore        4
     160: iconst_0
     161: istore_3
     162: iload         8
     164: iload         11
     166: if_icmpge     803
     169: aload_0
     170: iload         8
     172: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
     175: astore        15
     177: aload         15
     179: invokevirtual #443                // Method android/view/View.getVisibility:()I
     182: bipush        8
     184: if_icmpne     190
     187: goto          494
     190: aload         15
     192: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     195: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
     198: astore        16
     200: iload         7
     202: ifeq          440
     205: aload         16
     207: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
     210: iload         10
     212: invokestatic  #338                // Method android/support/v4/view/e.a:(II)I
     215: istore        9
     217: aload         15
     219: invokestatic  #202                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
     222: ifeq          318
     225: getstatic     #88                 // Field android/os/Build$VERSION.SDK_INT:I
     228: bipush        21
     230: if_icmplt     440
     233: aload_0
     234: getfield      #415                // Field G:Ljava/lang/Object;
     237: checkcast     #629                // class android/view/WindowInsets
     240: astore        14
     242: iload         9
     244: iconst_3
     245: if_icmpne     274
     248: aload         14
     250: aload         14
     252: invokevirtual #717                // Method android/view/WindowInsets.getSystemWindowInsetLeft:()I
     255: aload         14
     257: invokevirtual #632                // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
     260: iconst_0
     261: aload         14
     263: invokevirtual #720                // Method android/view/WindowInsets.getSystemWindowInsetBottom:()I
     266: invokevirtual #724                // Method android/view/WindowInsets.replaceSystemWindowInsets:(IIII)Landroid/view/WindowInsets;
     269: astore        13
     271: goto          307
     274: aload         14
     276: astore        13
     278: iload         9
     280: iconst_5
     281: if_icmpne     307
     284: aload         14
     286: iconst_0
     287: aload         14
     289: invokevirtual #632                // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
     292: aload         14
     294: invokevirtual #727                // Method android/view/WindowInsets.getSystemWindowInsetRight:()I
     297: aload         14
     299: invokevirtual #720                // Method android/view/WindowInsets.getSystemWindowInsetBottom:()I
     302: invokevirtual #724                // Method android/view/WindowInsets.replaceSystemWindowInsets:(IIII)Landroid/view/WindowInsets;
     305: astore        13
     307: aload         15
     309: aload         13
     311: invokevirtual #731                // Method android/view/View.dispatchApplyWindowInsets:(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
     314: pop
     315: goto          440
     318: getstatic     #88                 // Field android/os/Build$VERSION.SDK_INT:I
     321: bipush        21
     323: if_icmplt     440
     326: aload_0
     327: getfield      #415                // Field G:Ljava/lang/Object;
     330: checkcast     #629                // class android/view/WindowInsets
     333: astore        14
     335: iload         9
     337: iconst_3
     338: if_icmpne     367
     341: aload         14
     343: aload         14
     345: invokevirtual #717                // Method android/view/WindowInsets.getSystemWindowInsetLeft:()I
     348: aload         14
     350: invokevirtual #632                // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
     353: iconst_0
     354: aload         14
     356: invokevirtual #720                // Method android/view/WindowInsets.getSystemWindowInsetBottom:()I
     359: invokevirtual #724                // Method android/view/WindowInsets.replaceSystemWindowInsets:(IIII)Landroid/view/WindowInsets;
     362: astore        13
     364: goto          400
     367: aload         14
     369: astore        13
     371: iload         9
     373: iconst_5
     374: if_icmpne     400
     377: aload         14
     379: iconst_0
     380: aload         14
     382: invokevirtual #632                // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
     385: aload         14
     387: invokevirtual #727                // Method android/view/WindowInsets.getSystemWindowInsetRight:()I
     390: aload         14
     392: invokevirtual #720                // Method android/view/WindowInsets.getSystemWindowInsetBottom:()I
     395: invokevirtual #724                // Method android/view/WindowInsets.replaceSystemWindowInsets:(IIII)Landroid/view/WindowInsets;
     398: astore        13
     400: aload         16
     402: aload         13
     404: invokevirtual #717                // Method android/view/WindowInsets.getSystemWindowInsetLeft:()I
     407: putfield      #682                // Field android/support/v4/widget/DrawerLayout$d.leftMargin:I
     410: aload         16
     412: aload         13
     414: invokevirtual #632                // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
     417: putfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
     420: aload         16
     422: aload         13
     424: invokevirtual #727                // Method android/view/WindowInsets.getSystemWindowInsetRight:()I
     427: putfield      #734                // Field android/support/v4/widget/DrawerLayout$d.rightMargin:I
     430: aload         16
     432: aload         13
     434: invokevirtual #720                // Method android/view/WindowInsets.getSystemWindowInsetBottom:()I
     437: putfield      #697                // Field android/support/v4/widget/DrawerLayout$d.bottomMargin:I
     440: aload_0
     441: aload         15
     443: invokevirtual #533                // Method f:(Landroid/view/View;)Z
     446: ifeq          497
     449: aload         15
     451: iload         5
     453: aload         16
     455: getfield      #682                // Field android/support/v4/widget/DrawerLayout$d.leftMargin:I
     458: isub
     459: aload         16
     461: getfield      #734                // Field android/support/v4/widget/DrawerLayout$d.rightMargin:I
     464: isub
     465: ldc_w         #707                // int 1073741824
     468: invokestatic  #737                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     471: iload         6
     473: aload         16
     475: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
     478: isub
     479: aload         16
     481: getfield      #697                // Field android/support/v4/widget/DrawerLayout$d.bottomMargin:I
     484: isub
     485: ldc_w         #707                // int 1073741824
     488: invokestatic  #737                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     491: invokevirtual #740                // Method android/view/View.measure:(II)V
     494: goto          720
     497: aload_0
     498: aload         15
     500: invokevirtual #254                // Method g:(Landroid/view/View;)Z
     503: ifeq          729
     506: getstatic     #92                 // Field d:Z
     509: ifeq          534
     512: aload         15
     514: invokestatic  #742                // Method android/support/v4/view/s.l:(Landroid/view/View;)F
     517: aload_0
     518: getfield      #230                // Field f:F
     521: fcmpl
     522: ifeq          534
     525: aload         15
     527: aload_0
     528: getfield      #230                // Field f:F
     531: invokestatic  #743                // Method android/support/v4/view/s.a:(Landroid/view/View;F)V
     534: aload_0
     535: aload         15
     537: invokevirtual #427                // Method e:(Landroid/view/View;)I
     540: bipush        7
     542: iand
     543: istore        12
     545: iload         12
     547: iconst_3
     548: if_icmpne     557
     551: iconst_1
     552: istore        9
     554: goto          560
     557: iconst_0
     558: istore        9
     560: iload         9
     562: ifeq          570
     565: iload         4
     567: ifne          579
     570: iload         9
     572: ifne          657
     575: iload_3
     576: ifeq          657
     579: new           #305                // class java/lang/StringBuilder
     582: dup
     583: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
     586: astore        13
     588: aload         13
     590: ldc_w         #745                // String Child drawer has absolute gravity
     593: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     596: pop
     597: aload         13
     599: iload         12
     601: invokestatic  #375                // Method d:(I)Ljava/lang/String;
     604: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     607: pop
     608: aload         13
     610: ldc_w         #747                // String  but this
     613: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     616: pop
     617: aload         13
     619: ldc_w         #749                // String DrawerLayout
     622: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     625: pop
     626: aload         13
     628: ldc_w         #751                // String  already has a
     631: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     634: pop
     635: aload         13
     637: ldc_w         #753                // String drawer view along that edge
     640: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     643: pop
     644: new           #755                // class java/lang/IllegalStateException
     647: dup
     648: aload         13
     650: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     653: invokespecial #756                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     656: athrow
     657: iload         9
     659: ifeq          668
     662: iconst_1
     663: istore        4
     665: goto          670
     668: iconst_1
     669: istore_3
     670: aload         15
     672: iload_1
     673: aload_0
     674: getfield      #156                // Field g:I
     677: aload         16
     679: getfield      #682                // Field android/support/v4/widget/DrawerLayout$d.leftMargin:I
     682: iadd
     683: aload         16
     685: getfield      #734                // Field android/support/v4/widget/DrawerLayout$d.rightMargin:I
     688: iadd
     689: aload         16
     691: getfield      #759                // Field android/support/v4/widget/DrawerLayout$d.width:I
     694: invokestatic  #763                // Method getChildMeasureSpec:(III)I
     697: iload_2
     698: aload         16
     700: getfield      #685                // Field android/support/v4/widget/DrawerLayout$d.topMargin:I
     703: aload         16
     705: getfield      #697                // Field android/support/v4/widget/DrawerLayout$d.bottomMargin:I
     708: iadd
     709: aload         16
     711: getfield      #766                // Field android/support/v4/widget/DrawerLayout$d.height:I
     714: invokestatic  #763                // Method getChildMeasureSpec:(III)I
     717: invokevirtual #740                // Method android/view/View.measure:(II)V
     720: iload         8
     722: iconst_1
     723: iadd
     724: istore        8
     726: goto          162
     729: new           #305                // class java/lang/StringBuilder
     732: dup
     733: invokespecial #306                // Method java/lang/StringBuilder."<init>":()V
     736: astore        13
     738: aload         13
     740: ldc_w         #768                // String Child
     743: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     746: pop
     747: aload         13
     749: aload         15
     751: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     754: pop
     755: aload         13
     757: ldc_w         #770                // String  at index
     760: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     763: pop
     764: aload         13
     766: iload         8
     768: invokevirtual #773                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     771: pop
     772: aload         13
     774: ldc_w         #775                // String  does not have a valid layout_gravity - must be Gravity.LEFT,
     777: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     780: pop
     781: aload         13
     783: ldc_w         #777                // String Gravity.RIGHT or Gravity.NO_GRAVITY
     786: invokevirtual #312                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     789: pop
     790: new           #755                // class java/lang/IllegalStateException
     793: dup
     794: aload         13
     796: invokevirtual #323                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     799: invokespecial #756                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     802: athrow
     803: return
     804: new           #319                // class java/lang/IllegalArgumentException
     807: dup
     808: ldc_w         #779                // String DrawerLayout must be measured with MeasureSpec.EXACTLY.
     811: invokespecial #326                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     814: athrow

  protected void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_1
       1: instanceof    #20                 // class android/support/v4/widget/DrawerLayout$e
       4: ifne          13
       7: aload_0
       8: aload_1
       9: invokespecial #783                // Method android/view/ViewGroup.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      12: return
      13: aload_1
      14: checkcast     #20                 // class android/support/v4/widget/DrawerLayout$e
      17: astore_1
      18: aload_0
      19: aload_1
      20: invokevirtual #786                // Method android/support/v4/widget/DrawerLayout$e.a:()Landroid/os/Parcelable;
      23: invokespecial #783                // Method android/view/ViewGroup.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      26: aload_1
      27: getfield      #787                // Field android/support/v4/widget/DrawerLayout$e.a:I
      30: ifeq          51
      33: aload_0
      34: aload_1
      35: getfield      #787                // Field android/support/v4/widget/DrawerLayout$e.a:I
      38: invokevirtual #342                // Method c:(I)Landroid/view/View;
      41: astore_2
      42: aload_2
      43: ifnull        51
      46: aload_0
      47: aload_2
      48: invokevirtual #345                // Method h:(Landroid/view/View;)V
      51: aload_1
      52: getfield      #789                // Field android/support/v4/widget/DrawerLayout$e.b:I
      55: iconst_3
      56: if_icmpeq     68
      59: aload_0
      60: aload_1
      61: getfield      #789                // Field android/support/v4/widget/DrawerLayout$e.b:I
      64: iconst_3
      65: invokevirtual #791                // Method a:(II)V
      68: aload_1
      69: getfield      #793                // Field android/support/v4/widget/DrawerLayout$e.c:I
      72: iconst_3
      73: if_icmpeq     85
      76: aload_0
      77: aload_1
      78: getfield      #793                // Field android/support/v4/widget/DrawerLayout$e.c:I
      81: iconst_5
      82: invokevirtual #791                // Method a:(II)V
      85: aload_1
      86: getfield      #795                // Field android/support/v4/widget/DrawerLayout$e.e:I
      89: iconst_3
      90: if_icmpeq     104
      93: aload_0
      94: aload_1
      95: getfield      #795                // Field android/support/v4/widget/DrawerLayout$e.e:I
      98: ldc_w         #302                // int 8388611
     101: invokevirtual #791                // Method a:(II)V
     104: aload_1
     105: getfield      #797                // Field android/support/v4/widget/DrawerLayout$e.f:I
     108: iconst_3
     109: if_icmpeq     123
     112: aload_0
     113: aload_1
     114: getfield      #797                // Field android/support/v4/widget/DrawerLayout$e.f:I
     117: ldc_w         #303                // int 8388613
     120: invokevirtual #791                // Method a:(II)V
     123: return

  public void onRtlPropertiesChanged(int);
    Code:
       0: aload_0
       1: invokespecial #799                // Method e:()V
       4: return

  protected android.os.Parcelable onSaveInstanceState();
    Code:
       0: new           #20                 // class android/support/v4/widget/DrawerLayout$e
       3: dup
       4: aload_0
       5: invokespecial #802                // Method android/view/ViewGroup.onSaveInstanceState:()Landroid/os/Parcelable;
       8: invokespecial #804                // Method android/support/v4/widget/DrawerLayout$e."<init>":(Landroid/os/Parcelable;)V
      11: astore        5
      13: aload_0
      14: invokevirtual #248                // Method getChildCount:()I
      17: istore        4
      19: iconst_0
      20: istore_1
      21: iload_1
      22: iload         4
      24: if_icmpge     102
      27: aload_0
      28: iload_1
      29: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      32: invokevirtual #285                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      35: checkcast     #17                 // class android/support/v4/widget/DrawerLayout$d
      38: astore        6
      40: aload         6
      42: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      45: istore_2
      46: iconst_1
      47: istore_3
      48: iload_2
      49: iconst_1
      50: if_icmpne     58
      53: iconst_1
      54: istore_2
      55: goto          60
      58: iconst_0
      59: istore_2
      60: aload         6
      62: getfield      #332                // Field android/support/v4/widget/DrawerLayout$d.d:I
      65: iconst_2
      66: if_icmpne     72
      69: goto          74
      72: iconst_0
      73: istore_3
      74: iload_2
      75: ifne          92
      78: iload_3
      79: ifeq          85
      82: goto          92
      85: iload_1
      86: iconst_1
      87: iadd
      88: istore_1
      89: goto          21
      92: aload         5
      94: aload         6
      96: getfield      #328                // Field android/support/v4/widget/DrawerLayout$d.a:I
      99: putfield      #787                // Field android/support/v4/widget/DrawerLayout$e.a:I
     102: aload         5
     104: aload_0
     105: getfield      #118                // Field r:I
     108: putfield      #789                // Field android/support/v4/widget/DrawerLayout$e.b:I
     111: aload         5
     113: aload_0
     114: getfield      #120                // Field s:I
     117: putfield      #793                // Field android/support/v4/widget/DrawerLayout$e.c:I
     120: aload         5
     122: aload_0
     123: getfield      #122                // Field t:I
     126: putfield      #795                // Field android/support/v4/widget/DrawerLayout$e.e:I
     129: aload         5
     131: aload_0
     132: getfield      #124                // Field u:I
     135: putfield      #797                // Field android/support/v4/widget/DrawerLayout$e.f:I
     138: aload         5
     140: areturn

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #171                // Field k:Landroid/support/v4/widget/p;
       4: aload_1
       5: invokevirtual #808                // Method android/support/v4/widget/p.b:(Landroid/view/MotionEvent;)V
       8: aload_0
       9: getfield      #181                // Field l:Landroid/support/v4/widget/p;
      12: aload_1
      13: invokevirtual #808                // Method android/support/v4/widget/p.b:(Landroid/view/MotionEvent;)V
      16: aload_1
      17: invokevirtual #811                // Method android/view/MotionEvent.getAction:()I
      20: sipush        255
      23: iand
      24: istore        4
      26: iload         4
      28: iconst_3
      29: if_icmpeq     207
      32: iload         4
      34: tableswitch   { // 0 to 1
                     0: 175
                     1: 58
               default: 56
          }
      56: iconst_1
      57: ireturn
      58: aload_1
      59: invokevirtual #645                // Method android/view/MotionEvent.getX:()F
      62: fstore_3
      63: aload_1
      64: invokevirtual #648                // Method android/view/MotionEvent.getY:()F
      67: fstore_2
      68: aload_0
      69: getfield      #171                // Field k:Landroid/support/v4/widget/p;
      72: fload_3
      73: f2i
      74: fload_2
      75: f2i
      76: invokevirtual #655                // Method android/support/v4/widget/p.d:(II)Landroid/view/View;
      79: astore_1
      80: aload_1
      81: ifnull        159
      84: aload_0
      85: aload_1
      86: invokevirtual #533                // Method f:(Landroid/view/View;)Z
      89: ifeq          159
      92: fload_3
      93: aload_0
      94: getfield      #650                // Field z:F
      97: fsub
      98: fstore_3
      99: fload_2
     100: aload_0
     101: getfield      #652                // Field A:F
     104: fsub
     105: fstore_2
     106: aload_0
     107: getfield      #171                // Field k:Landroid/support/v4/widget/p;
     110: invokevirtual #813                // Method android/support/v4/widget/p.d:()I
     113: istore        4
     115: fload_3
     116: fload_3
     117: fmul
     118: fload_2
     119: fload_2
     120: fmul
     121: fadd
     122: iload         4
     124: iload         4
     126: imul
     127: i2f
     128: fcmpg
     129: ifge          159
     132: aload_0
     133: invokevirtual #454                // Method a:()Landroid/view/View;
     136: astore_1
     137: aload_1
     138: ifnull        159
     141: aload_0
     142: aload_1
     143: invokevirtual #671                // Method a:(Landroid/view/View;)I
     146: iconst_2
     147: if_icmpne     153
     150: goto          159
     153: iconst_0
     154: istore        5
     156: goto          162
     159: iconst_1
     160: istore        5
     162: aload_0
     163: iload         5
     165: invokevirtual #461                // Method a:(Z)V
     168: aload_0
     169: iconst_0
     170: putfield      #642                // Field v:Z
     173: iconst_1
     174: ireturn
     175: aload_1
     176: invokevirtual #645                // Method android/view/MotionEvent.getX:()F
     179: fstore_2
     180: aload_1
     181: invokevirtual #648                // Method android/view/MotionEvent.getY:()F
     184: fstore_3
     185: aload_0
     186: fload_2
     187: putfield      #650                // Field z:F
     190: aload_0
     191: fload_3
     192: putfield      #652                // Field A:F
     195: aload_0
     196: iconst_0
     197: putfield      #642                // Field v:Z
     200: aload_0
     201: iconst_0
     202: putfield      #509                // Field w:Z
     205: iconst_1
     206: ireturn
     207: aload_0
     208: iconst_1
     209: invokevirtual #461                // Method a:(Z)V
     212: goto          195

  public void requestDisallowInterceptTouchEvent(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #816                // Method android/view/ViewGroup.requestDisallowInterceptTouchEvent:(Z)V
       5: aload_0
       6: iload_1
       7: putfield      #642                // Field v:Z
      10: iload_1
      11: ifeq          19
      14: aload_0
      15: iconst_1
      16: invokevirtual #461                // Method a:(Z)V
      19: return

  public void requestLayout();
    Code:
       0: aload_0
       1: getfield      #679                // Field p:Z
       4: ifne          11
       7: aload_0
       8: invokespecial #817                // Method android/view/ViewGroup.requestLayout:()V
      11: return

  public void setDrawerElevation(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #230                // Field f:F
       5: iconst_0
       6: istore_2
       7: iload_2
       8: aload_0
       9: invokevirtual #248                // Method getChildCount:()I
      12: if_icmpge     44
      15: aload_0
      16: iload_2
      17: invokevirtual #252                // Method getChildAt:(I)Landroid/view/View;
      20: astore_3
      21: aload_0
      22: aload_3
      23: invokevirtual #254                // Method g:(Landroid/view/View;)Z
      26: ifeq          37
      29: aload_3
      30: aload_0
      31: getfield      #230                // Field f:F
      34: invokestatic  #743                // Method android/support/v4/view/s.a:(Landroid/view/View;F)V
      37: iload_2
      38: iconst_1
      39: iadd
      40: istore_2
      41: goto          7
      44: return

  public void setDrawerListener(android.support.v4.widget.DrawerLayout$c);
    Code:
       0: aload_0
       1: getfield      #822                // Field x:Landroid/support/v4/widget/DrawerLayout$c;
       4: ifnull        15
       7: aload_0
       8: aload_0
       9: getfield      #822                // Field x:Landroid/support/v4/widget/DrawerLayout$c;
      12: invokevirtual #824                // Method b:(Landroid/support/v4/widget/DrawerLayout$c;)V
      15: aload_1
      16: ifnull        24
      19: aload_0
      20: aload_1
      21: invokevirtual #826                // Method a:(Landroid/support/v4/widget/DrawerLayout$c;)V
      24: aload_0
      25: aload_1
      26: putfield      #822                // Field x:Landroid/support/v4/widget/DrawerLayout$c;
      29: return

  public void setDrawerLockMode(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_3
       3: invokevirtual #791                // Method a:(II)V
       6: aload_0
       7: iload_1
       8: iconst_5
       9: invokevirtual #791                // Method a:(II)V
      12: return

  public void setScrimColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #109                // Field h:I
       5: aload_0
       6: invokevirtual #412                // Method invalidate:()V
       9: return

  public void setStatusBarBackground(int);
    Code:
       0: iload_1
       1: ifeq          16
       4: aload_0
       5: invokevirtual #602                // Method getContext:()Landroid/content/Context;
       8: iload_1
       9: invokestatic  #835                // Method android/support/v4/a/a.a:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      12: astore_2
      13: goto          18
      16: aconst_null
      17: astore_2
      18: aload_0
      19: aload_2
      20: putfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
      23: aload_0
      24: invokevirtual #412                // Method invalidate:()V
      27: return

  public void setStatusBarBackground(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: invokevirtual #412                // Method invalidate:()V
       9: return

  public void setStatusBarBackgroundColor(int);
    Code:
       0: aload_0
       1: new           #839                // class android/graphics/drawable/ColorDrawable
       4: dup
       5: iload_1
       6: invokespecial #841                // Method android/graphics/drawable/ColorDrawable."<init>":(I)V
       9: putfield      #224                // Field B:Landroid/graphics/drawable/Drawable;
      12: aload_0
      13: invokevirtual #412                // Method invalidate:()V
      16: return
}
