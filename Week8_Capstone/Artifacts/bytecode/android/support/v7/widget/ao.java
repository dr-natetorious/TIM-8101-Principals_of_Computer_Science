public class android.support.v7.widget.ao {
  public static final android.graphics.Rect a;

  static {};
    Code:
       0: new           #15                 // class android/graphics/Rect
       3: dup
       4: invokespecial #18                 // Method android/graphics/Rect."<init>":()V
       7: putstatic     #20                 // Field a:Landroid/graphics/Rect;
      10: getstatic     #26                 // Field android/os/Build$VERSION.SDK_INT:I
      13: bipush        18
      15: if_icmplt     26
      18: ldc           #28                 // String android.graphics.Insets
      20: invokestatic  #34                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
      23: putstatic     #36                 // Field b:Ljava/lang/Class;
      26: return
      27: astore_0
      28: return
    Exception table:
       from    to  target type
          18    26    27   Class java/lang/ClassNotFoundException

  public static android.graphics.PorterDuff$Mode a(int, android.graphics.PorterDuff$Mode);
    Code:
       0: iload_0
       1: iconst_3
       2: if_icmpeq     66
       5: iload_0
       6: iconst_5
       7: if_icmpeq     62
      10: iload_0
      11: bipush        9
      13: if_icmpeq     58
      16: iload_0
      17: tableswitch   { // 14 to 16
                    14: 54
                    15: 50
                    16: 46
               default: 44
          }
      44: aload_1
      45: areturn
      46: getstatic     #44                 // Field android/graphics/PorterDuff$Mode.ADD:Landroid/graphics/PorterDuff$Mode;
      49: areturn
      50: getstatic     #47                 // Field android/graphics/PorterDuff$Mode.SCREEN:Landroid/graphics/PorterDuff$Mode;
      53: areturn
      54: getstatic     #50                 // Field android/graphics/PorterDuff$Mode.MULTIPLY:Landroid/graphics/PorterDuff$Mode;
      57: areturn
      58: getstatic     #53                 // Field android/graphics/PorterDuff$Mode.SRC_ATOP:Landroid/graphics/PorterDuff$Mode;
      61: areturn
      62: getstatic     #56                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      65: areturn
      66: getstatic     #59                 // Field android/graphics/PorterDuff$Mode.SRC_OVER:Landroid/graphics/PorterDuff$Mode;
      69: areturn

  public static android.graphics.Rect a(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #36                 // Field b:Ljava/lang/Class;
       3: ifnull        242
       6: aload_0
       7: invokestatic  #68                 // Method android/support/v4/b/a/a.g:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
      10: astore_0
      11: aload_0
      12: invokevirtual #72                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: ldc           #74                 // String getOpticalInsets
      17: iconst_0
      18: anewarray     #30                 // class java/lang/Class
      21: invokevirtual #78                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      24: aload_0
      25: iconst_0
      26: anewarray     #4                  // class java/lang/Object
      29: invokevirtual #84                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      32: astore_0
      33: aload_0
      34: ifnull        242
      37: new           #15                 // class android/graphics/Rect
      40: dup
      41: invokespecial #18                 // Method android/graphics/Rect."<init>":()V
      44: astore        4
      46: getstatic     #36                 // Field b:Ljava/lang/Class;
      49: invokevirtual #88                 // Method java/lang/Class.getFields:()[Ljava/lang/reflect/Field;
      52: astore        5
      54: aload         5
      56: arraylength
      57: istore_3
      58: iconst_0
      59: istore_2
      60: iload_2
      61: iload_3
      62: if_icmpge     231
      65: aload         5
      67: iload_2
      68: aaload
      69: astore        6
      71: aload         6
      73: invokevirtual #94                 // Method java/lang/reflect/Field.getName:()Ljava/lang/String;
      76: astore        7
      78: aload         7
      80: invokevirtual #100                // Method java/lang/String.hashCode:()I
      83: istore_1
      84: iload_1
      85: ldc           #101                // int -1383228885
      87: if_icmpeq     156
      90: iload_1
      91: ldc           #102                // int 115029
      93: if_icmpeq     141
      96: iload_1
      97: ldc           #103                // int 3317767
      99: if_icmpeq     126
     102: iload_1
     103: ldc           #104                // int 108511772
     105: if_icmpeq     111
     108: goto          250
     111: aload         7
     113: ldc           #106                // String right
     115: invokevirtual #110                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     118: ifeq          250
     121: iconst_2
     122: istore_1
     123: goto          252
     126: aload         7
     128: ldc           #112                // String left
     130: invokevirtual #110                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     133: ifeq          250
     136: iconst_0
     137: istore_1
     138: goto          252
     141: aload         7
     143: ldc           #114                // String top
     145: invokevirtual #110                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     148: ifeq          250
     151: iconst_1
     152: istore_1
     153: goto          252
     156: aload         7
     158: ldc           #116                // String bottom
     160: invokevirtual #110                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     163: ifeq          250
     166: iconst_3
     167: istore_1
     168: goto          252
     171: aload         4
     173: aload         6
     175: aload_0
     176: invokevirtual #120                // Method java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
     179: putfield      #122                // Field android/graphics/Rect.bottom:I
     182: goto          224
     185: aload         4
     187: aload         6
     189: aload_0
     190: invokevirtual #120                // Method java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
     193: putfield      #124                // Field android/graphics/Rect.right:I
     196: goto          224
     199: aload         4
     201: aload         6
     203: aload_0
     204: invokevirtual #120                // Method java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
     207: putfield      #126                // Field android/graphics/Rect.top:I
     210: goto          224
     213: aload         4
     215: aload         6
     217: aload_0
     218: invokevirtual #120                // Method java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
     221: putfield      #128                // Field android/graphics/Rect.left:I
     224: iload_2
     225: iconst_1
     226: iadd
     227: istore_2
     228: goto          60
     231: aload         4
     233: areturn
     234: ldc           #130                // String DrawableUtils
     236: ldc           #132                // String Couldn't obtain the optical insets. Ignoring.
     238: invokestatic  #138                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
     241: pop
     242: getstatic     #20                 // Field a:Landroid/graphics/Rect;
     245: areturn
     246: astore_0
     247: goto          234
     250: iconst_m1
     251: istore_1
     252: iload_1
     253: tableswitch   { // 0 to 3
                     0: 213
                     1: 199
                     2: 185
                     3: 171
               default: 284
          }
     284: goto          224
    Exception table:
       from    to  target type
           6    33   246   Class java/lang/Exception
          37    58   246   Class java/lang/Exception
          71    84   246   Class java/lang/Exception
         111   121   246   Class java/lang/Exception
         126   136   246   Class java/lang/Exception
         141   151   246   Class java/lang/Exception
         156   166   246   Class java/lang/Exception
         171   182   246   Class java/lang/Exception
         185   196   246   Class java/lang/Exception
         199   210   246   Class java/lang/Exception
         213   224   246   Class java/lang/Exception

  static void b(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #26                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmpne     27
       8: ldc           #141                // String android.graphics.drawable.VectorDrawable
      10: aload_0
      11: invokevirtual #72                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      14: invokevirtual #142                // Method java/lang/Class.getName:()Ljava/lang/String;
      17: invokevirtual #110                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      20: ifeq          27
      23: aload_0
      24: invokestatic  #145                // Method d:(Landroid/graphics/drawable/Drawable;)V
      27: return

  public static boolean c(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #26                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        15
       5: if_icmpge     17
       8: aload_0
       9: instanceof    #149                // class android/graphics/drawable/InsetDrawable
      12: ifeq          17
      15: iconst_0
      16: ireturn
      17: getstatic     #26                 // Field android/os/Build$VERSION.SDK_INT:I
      20: bipush        15
      22: if_icmpge     34
      25: aload_0
      26: instanceof    #151                // class android/graphics/drawable/GradientDrawable
      29: ifeq          34
      32: iconst_0
      33: ireturn
      34: getstatic     #26                 // Field android/os/Build$VERSION.SDK_INT:I
      37: bipush        17
      39: if_icmpge     51
      42: aload_0
      43: instanceof    #153                // class android/graphics/drawable/LayerDrawable
      46: ifeq          51
      49: iconst_0
      50: ireturn
      51: aload_0
      52: instanceof    #155                // class android/graphics/drawable/DrawableContainer
      55: ifeq          106
      58: aload_0
      59: invokevirtual #161                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      62: astore_0
      63: aload_0
      64: instanceof    #163                // class android/graphics/drawable/DrawableContainer$DrawableContainerState
      67: ifeq          164
      70: aload_0
      71: checkcast     #163                // class android/graphics/drawable/DrawableContainer$DrawableContainerState
      74: invokevirtual #167                // Method android/graphics/drawable/DrawableContainer$DrawableContainerState.getChildren:()[Landroid/graphics/drawable/Drawable;
      77: astore_0
      78: aload_0
      79: arraylength
      80: istore_2
      81: iconst_0
      82: istore_1
      83: iload_1
      84: iload_2
      85: if_icmpge     164
      88: aload_0
      89: iload_1
      90: aaload
      91: invokestatic  #169                // Method c:(Landroid/graphics/drawable/Drawable;)Z
      94: ifne          99
      97: iconst_0
      98: ireturn
      99: iload_1
     100: iconst_1
     101: iadd
     102: istore_1
     103: goto          83
     106: aload_0
     107: instanceof    #171                // class android/support/v4/b/a/c
     110: ifeq          128
     113: aload_0
     114: checkcast     #171                // class android/support/v4/b/a/c
     117: invokeinterface #174,  1          // InterfaceMethod android/support/v4/b/a/c.a:()Landroid/graphics/drawable/Drawable;
     122: astore_0
     123: aload_0
     124: invokestatic  #169                // Method c:(Landroid/graphics/drawable/Drawable;)Z
     127: ireturn
     128: aload_0
     129: instanceof    #176                // class android/support/v7/d/a/a
     132: ifeq          146
     135: aload_0
     136: checkcast     #176                // class android/support/v7/d/a/a
     139: invokevirtual #178                // Method android/support/v7/d/a/a.b:()Landroid/graphics/drawable/Drawable;
     142: astore_0
     143: goto          123
     146: aload_0
     147: instanceof    #180                // class android/graphics/drawable/ScaleDrawable
     150: ifeq          164
     153: aload_0
     154: checkcast     #180                // class android/graphics/drawable/ScaleDrawable
     157: invokevirtual #183                // Method android/graphics/drawable/ScaleDrawable.getDrawable:()Landroid/graphics/drawable/Drawable;
     160: astore_0
     161: goto          123
     164: iconst_1
     165: ireturn
}
