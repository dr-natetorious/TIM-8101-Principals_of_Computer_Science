public final class android.support.v4.b.a.a {
  public static void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
       4: return

  public static void a(android.graphics.drawable.Drawable, float, float);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: fload_1
      10: fload_2
      11: invokevirtual #31                 // Method android/graphics/drawable/Drawable.setHotspot:(FF)V
      14: return

  public static void a(android.graphics.drawable.Drawable, int);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokevirtual #36                 // Method android/graphics/drawable/Drawable.setTint:(I)V
      13: return
      14: aload_0
      15: instanceof    #38                 // class android/support/v4/b/a/b
      18: ifeq          31
      21: aload_0
      22: checkcast     #38                 // class android/support/v4/b/a/b
      25: iload_1
      26: invokeinterface #39,  2           // InterfaceMethod android/support/v4/b/a/b.setTint:(I)V
      31: return

  public static void a(android.graphics.drawable.Drawable, int, int, int, int);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     17
       8: aload_0
       9: iload_1
      10: iload_2
      11: iload_3
      12: iload         4
      14: invokevirtual #44                 // Method android/graphics/drawable/Drawable.setHotspotBounds:(IIII)V
      17: return

  public static void a(android.graphics.drawable.Drawable, android.content.res.ColorStateList);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokevirtual #49                 // Method android/graphics/drawable/Drawable.setTintList:(Landroid/content/res/ColorStateList;)V
      13: return
      14: aload_0
      15: instanceof    #38                 // class android/support/v4/b/a/b
      18: ifeq          31
      21: aload_0
      22: checkcast     #38                 // class android/support/v4/b/a/b
      25: aload_1
      26: invokeinterface #50,  2           // InterfaceMethod android/support/v4/b/a/b.setTintList:(Landroid/content/res/ColorStateList;)V
      31: return

  public static void a(android.graphics.drawable.Drawable, android.content.res.Resources$Theme);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     13
       8: aload_0
       9: aload_1
      10: invokevirtual #55                 // Method android/graphics/drawable/Drawable.applyTheme:(Landroid/content/res/Resources$Theme;)V
      13: return

  public static void a(android.graphics.drawable.Drawable, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     18
       8: aload_0
       9: aload_1
      10: aload_2
      11: aload_3
      12: aload         4
      14: invokevirtual #60                 // Method android/graphics/drawable/Drawable.inflate:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
      17: return
      18: aload_0
      19: aload_1
      20: aload_2
      21: aload_3
      22: invokevirtual #63                 // Method android/graphics/drawable/Drawable.inflate:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
      25: return

  public static void a(android.graphics.drawable.Drawable, android.graphics.PorterDuff$Mode);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokevirtual #68                 // Method android/graphics/drawable/Drawable.setTintMode:(Landroid/graphics/PorterDuff$Mode;)V
      13: return
      14: aload_0
      15: instanceof    #38                 // class android/support/v4/b/a/b
      18: ifeq          31
      21: aload_0
      22: checkcast     #38                 // class android/support/v4/b/a/b
      25: aload_1
      26: invokeinterface #69,  2           // InterfaceMethod android/support/v4/b/a/b.setTintMode:(Landroid/graphics/PorterDuff$Mode;)V
      31: return

  public static void a(android.graphics.drawable.Drawable, boolean);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     13
       8: aload_0
       9: iload_1
      10: invokevirtual #74                 // Method android/graphics/drawable/Drawable.setAutoMirrored:(Z)V
      13: return

  public static boolean b(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #79                 // Method android/graphics/drawable/Drawable.isAutoMirrored:()Z
      12: ireturn
      13: iconst_0
      14: ireturn

  public static boolean b(android.graphics.drawable.Drawable, int);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokevirtual #88                 // Method android/graphics/drawable/Drawable.setLayoutDirection:(I)Z
      13: ireturn
      14: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      17: bipush        17
      19: if_icmplt     113
      22: getstatic     #90                 // Field b:Z
      25: ifne          72
      28: ldc           #14                 // class android/graphics/drawable/Drawable
      30: ldc           #91                 // String setLayoutDirection
      32: iconst_1
      33: anewarray     #93                 // class java/lang/Class
      36: dup
      37: iconst_0
      38: getstatic     #99                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      41: aastore
      42: invokevirtual #103                // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      45: putstatic     #105                // Field a:Ljava/lang/reflect/Method;
      48: getstatic     #105                // Field a:Ljava/lang/reflect/Method;
      51: iconst_1
      52: invokevirtual #110                // Method java/lang/reflect/Method.setAccessible:(Z)V
      55: goto          68
      58: astore_2
      59: ldc           #112                // String DrawableCompat
      61: ldc           #114                // String Failed to retrieve setLayoutDirection(int) method
      63: aload_2
      64: invokestatic  #120                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      67: pop
      68: iconst_1
      69: putstatic     #90                 // Field b:Z
      72: getstatic     #105                // Field a:Ljava/lang/reflect/Method;
      75: ifnull        113
      78: getstatic     #105                // Field a:Ljava/lang/reflect/Method;
      81: aload_0
      82: iconst_1
      83: anewarray     #4                  // class java/lang/Object
      86: dup
      87: iconst_0
      88: iload_1
      89: invokestatic  #124                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      92: aastore
      93: invokevirtual #128                // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      96: pop
      97: iconst_1
      98: ireturn
      99: astore_0
     100: ldc           #112                // String DrawableCompat
     102: ldc           #130                // String Failed to invoke setLayoutDirection(int) via reflection
     104: aload_0
     105: invokestatic  #120                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     108: pop
     109: aconst_null
     110: putstatic     #105                // Field a:Ljava/lang/reflect/Method;
     113: iconst_0
     114: ireturn
    Exception table:
       from    to  target type
          28    55    58   Class java/lang/NoSuchMethodException
          78    97    99   Class java/lang/Exception

  public static int c(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #135                // Method android/graphics/drawable/Drawable.getAlpha:()I
      12: ireturn
      13: iconst_0
      14: ireturn

  public static boolean d(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #138                // Method android/graphics/drawable/Drawable.canApplyTheme:()Z
      12: ireturn
      13: iconst_0
      14: ireturn

  public static android.graphics.ColorFilter e(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #144                // Method android/graphics/drawable/Drawable.getColorFilter:()Landroid/graphics/ColorFilter;
      12: areturn
      13: aconst_null
      14: areturn

  public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     10
       8: aload_0
       9: areturn
      10: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      13: bipush        21
      15: if_icmplt     36
      18: aload_0
      19: instanceof    #38                 // class android/support/v4/b/a/b
      22: ifne          34
      25: new           #148                // class android/support/v4/b/a/f
      28: dup
      29: aload_0
      30: invokespecial #151                // Method android/support/v4/b/a/f."<init>":(Landroid/graphics/drawable/Drawable;)V
      33: areturn
      34: aload_0
      35: areturn
      36: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      39: bipush        19
      41: if_icmplt     62
      44: aload_0
      45: instanceof    #38                 // class android/support/v4/b/a/b
      48: ifne          60
      51: new           #153                // class android/support/v4/b/a/e
      54: dup
      55: aload_0
      56: invokespecial #154                // Method android/support/v4/b/a/e."<init>":(Landroid/graphics/drawable/Drawable;)V
      59: areturn
      60: aload_0
      61: areturn
      62: aload_0
      63: instanceof    #38                 // class android/support/v4/b/a/b
      66: ifne          78
      69: new           #156                // class android/support/v4/b/a/d
      72: dup
      73: aload_0
      74: invokespecial #157                // Method android/support/v4/b/a/d."<init>":(Landroid/graphics/drawable/Drawable;)V
      77: areturn
      78: aload_0
      79: areturn

  public static <T extends android.graphics.drawable.Drawable> T g(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: astore_1
       2: aload_0
       3: instanceof    #160                // class android/support/v4/b/a/c
       6: ifeq          19
       9: aload_0
      10: checkcast     #160                // class android/support/v4/b/a/c
      13: invokeinterface #163,  1          // InterfaceMethod android/support/v4/b/a/c.a:()Landroid/graphics/drawable/Drawable;
      18: astore_1
      19: aload_1
      20: areturn

  public static int h(android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #169                // Method android/graphics/drawable/Drawable.getLayoutDirection:()I
      12: ireturn
      13: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      16: bipush        17
      18: if_icmplt     105
      21: getstatic     #171                // Field d:Z
      24: ifne          65
      27: ldc           #14                 // class android/graphics/drawable/Drawable
      29: ldc           #172                // String getLayoutDirection
      31: iconst_0
      32: anewarray     #93                 // class java/lang/Class
      35: invokevirtual #103                // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      38: putstatic     #174                // Field c:Ljava/lang/reflect/Method;
      41: getstatic     #174                // Field c:Ljava/lang/reflect/Method;
      44: iconst_1
      45: invokevirtual #110                // Method java/lang/reflect/Method.setAccessible:(Z)V
      48: goto          61
      51: astore_2
      52: ldc           #112                // String DrawableCompat
      54: ldc           #176                // String Failed to retrieve getLayoutDirection() method
      56: aload_2
      57: invokestatic  #120                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      60: pop
      61: iconst_1
      62: putstatic     #171                // Field d:Z
      65: getstatic     #174                // Field c:Ljava/lang/reflect/Method;
      68: ifnull        105
      71: getstatic     #174                // Field c:Ljava/lang/reflect/Method;
      74: aload_0
      75: iconst_0
      76: anewarray     #4                  // class java/lang/Object
      79: invokevirtual #128                // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      82: checkcast     #95                 // class java/lang/Integer
      85: invokevirtual #179                // Method java/lang/Integer.intValue:()I
      88: istore_1
      89: iload_1
      90: ireturn
      91: astore_0
      92: ldc           #112                // String DrawableCompat
      94: ldc           #181                // String Failed to invoke getLayoutDirection() via reflection
      96: aload_0
      97: invokestatic  #120                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     100: pop
     101: aconst_null
     102: putstatic     #174                // Field c:Ljava/lang/reflect/Method;
     105: iconst_0
     106: ireturn
    Exception table:
       from    to  target type
          27    48    51   Class java/lang/NoSuchMethodException
          71    89    91   Class java/lang/Exception
}
