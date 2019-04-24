class android.support.v4.view.s$j {
  static java.lang.reflect.Field b;

  static boolean c;

  java.util.WeakHashMap<android.view.View, android.support.v4.view.x> a;

  static {};
    Code:
       0: new           #27                 // class java/util/concurrent/atomic/AtomicInteger
       3: dup
       4: iconst_1
       5: invokespecial #31                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
       8: putstatic     #33                 // Field i:Ljava/util/concurrent/atomic/AtomicInteger;
      11: return

  android.support.v4.view.s$j();
    Code:
       0: aload_0
       1: invokespecial #36                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #38                 // Field a:Ljava/util/WeakHashMap;
       9: return

  public float A(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #55                 // Method v:(Landroid/view/View;)F
       5: aload_0
       6: aload_1
       7: invokevirtual #58                 // Method u:(Landroid/view/View;)F
      10: fadd
      11: freturn

  public boolean B(android.view.View);
    Code:
       0: getstatic     #64                 // Field c:Z
       3: istore_3
       4: iconst_0
       5: istore_2
       6: iload_3
       7: ifeq          12
      10: iconst_0
      11: ireturn
      12: getstatic     #66                 // Field b:Ljava/lang/reflect/Field;
      15: ifnonnull     44
      18: ldc           #42                 // class android/view/View
      20: ldc           #68                 // String mAccessibilityDelegate
      22: invokevirtual #74                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      25: putstatic     #66                 // Field b:Ljava/lang/reflect/Field;
      28: getstatic     #66                 // Field b:Ljava/lang/reflect/Field;
      31: iconst_1
      32: invokevirtual #80                 // Method java/lang/reflect/Field.setAccessible:(Z)V
      35: goto          44
      38: iconst_1
      39: putstatic     #64                 // Field c:Z
      42: iconst_0
      43: ireturn
      44: getstatic     #66                 // Field b:Ljava/lang/reflect/Field;
      47: aload_1
      48: invokevirtual #84                 // Method java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
      51: astore_1
      52: aload_1
      53: ifnull        58
      56: iconst_1
      57: istore_2
      58: iload_2
      59: ireturn
      60: iconst_1
      61: putstatic     #64                 // Field c:Z
      64: iconst_0
      65: ireturn
      66: astore_1
      67: goto          38
      70: astore_1
      71: goto          60
    Exception table:
       from    to  target type
          18    35    66   Class java/lang/Throwable
          44    52    70   Class java/lang/Throwable

  public android.support.v4.view.x C(android.view.View);
    Code:
       0: aload_0
       1: getfield      #38                 // Field a:Ljava/util/WeakHashMap;
       4: ifnonnull     18
       7: aload_0
       8: new           #88                 // class java/util/WeakHashMap
      11: dup
      12: invokespecial #89                 // Method java/util/WeakHashMap."<init>":()V
      15: putfield      #38                 // Field a:Ljava/util/WeakHashMap;
      18: aload_0
      19: getfield      #38                 // Field a:Ljava/util/WeakHashMap;
      22: aload_1
      23: invokevirtual #90                 // Method java/util/WeakHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      26: checkcast     #92                 // class android/support/v4/view/x
      29: astore_3
      30: aload_3
      31: astore_2
      32: aload_3
      33: ifnonnull     55
      36: new           #92                 // class android/support/v4/view/x
      39: dup
      40: aload_1
      41: invokespecial #94                 // Method android/support/v4/view/x."<init>":(Landroid/view/View;)V
      44: astore_2
      45: aload_0
      46: getfield      #38                 // Field a:Ljava/util/WeakHashMap;
      49: aload_1
      50: aload_2
      51: invokevirtual #98                 // Method java/util/WeakHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      54: pop
      55: aload_2
      56: areturn

  long a();
    Code:
       0: invokestatic  #104                // Method android/animation/ValueAnimator.getFrameDelay:()J
       3: lreturn

  public android.support.v4.view.ab a(android.view.View, android.support.v4.view.ab);
    Code:
       0: aload_2
       1: areturn

  public void a(android.view.View, float);
    Code:
       0: return

  public void a(android.view.View, int);
    Code:
       0: return

  public void a(android.view.View, int, int);
    Code:
       0: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_1
       1: iload_2
       2: iload_3
       3: iload         4
       5: iload         5
       7: invokevirtual #113                // Method android/view/View.setPadding:(IIII)V
      10: return

  public void a(android.view.View, android.content.res.ColorStateList);
    Code:
       0: aload_1
       1: instanceof    #116                // class android/support/v4/view/r
       4: ifeq          17
       7: aload_1
       8: checkcast     #116                // class android/support/v4/view/r
      11: aload_2
      12: invokeinterface #120,  2          // InterfaceMethod android/support/v4/view/r.setSupportBackgroundTintList:(Landroid/content/res/ColorStateList;)V
      17: return

  public void a(android.view.View, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_1
       1: instanceof    #116                // class android/support/v4/view/r
       4: ifeq          17
       7: aload_1
       8: checkcast     #116                // class android/support/v4/view/r
      11: aload_2
      12: invokeinterface #125,  2          // InterfaceMethod android/support/v4/view/r.setSupportBackgroundTintMode:(Landroid/graphics/PorterDuff$Mode;)V
      17: return

  public void a(android.view.View, android.graphics.Rect);
    Code:
       0: return

  public void a(android.view.View, android.graphics.drawable.Drawable);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #131                // Method android/view/View.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
       5: return

  public void a(android.view.View, android.support.v4.view.b);
    Code:
       0: aload_2
       1: ifnonnull     9
       4: aconst_null
       5: astore_2
       6: goto          14
       9: aload_2
      10: invokevirtual #137                // Method android/support/v4/view/b.a:()Landroid/view/View$AccessibilityDelegate;
      13: astore_2
      14: aload_1
      15: aload_2
      16: invokevirtual #141                // Method android/view/View.setAccessibilityDelegate:(Landroid/view/View$AccessibilityDelegate;)V
      19: return

  public void a(android.view.View, android.support.v4.view.p);
    Code:
       0: return

  public void a(android.view.View, java.lang.Runnable);
    Code:
       0: aload_1
       1: aload_2
       2: aload_0
       3: invokevirtual #145                // Method a:()J
       6: invokevirtual #149                // Method android/view/View.postDelayed:(Ljava/lang/Runnable;J)Z
       9: pop
      10: return

  public void a(android.view.View, java.lang.Runnable, long);
    Code:
       0: aload_1
       1: aload_2
       2: aload_0
       3: invokevirtual #145                // Method a:()J
       6: lload_3
       7: ladd
       8: invokevirtual #149                // Method android/view/View.postDelayed:(Ljava/lang/Runnable;J)Z
      11: pop
      12: return

  public void a(android.view.View, java.lang.String);
    Code:
       0: getstatic     #153                // Field h:Ljava/util/WeakHashMap;
       3: ifnonnull     16
       6: new           #88                 // class java/util/WeakHashMap
       9: dup
      10: invokespecial #89                 // Method java/util/WeakHashMap."<init>":()V
      13: putstatic     #153                // Field h:Ljava/util/WeakHashMap;
      16: getstatic     #153                // Field h:Ljava/util/WeakHashMap;
      19: aload_1
      20: aload_2
      21: invokevirtual #98                 // Method java/util/WeakHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      24: pop
      25: return

  public void a(android.view.View, boolean);
    Code:
       0: return

  public boolean a(android.view.View);
    Code:
       0: iconst_0
       1: ireturn

  public android.support.v4.view.ab b(android.view.View, android.support.v4.view.ab);
    Code:
       0: aload_2
       1: areturn

  public void b(android.view.View, int);
    Code:
       0: aload_1
       1: iload_2
       2: invokevirtual #157                // Method android/view/View.offsetLeftAndRight:(I)V
       5: aload_1
       6: invokevirtual #161                // Method android/view/View.getVisibility:()I
       9: ifne          35
      12: aload_1
      13: invokestatic  #163                // Method D:(Landroid/view/View;)V
      16: aload_1
      17: invokevirtual #167                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      20: astore_1
      21: aload_1
      22: instanceof    #42                 // class android/view/View
      25: ifeq          35
      28: aload_1
      29: checkcast     #42                 // class android/view/View
      32: invokestatic  #163                // Method D:(Landroid/view/View;)V
      35: return

  public boolean b(android.view.View);
    Code:
       0: iconst_0
       1: ireturn

  public void c(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #170                // Method android/view/View.postInvalidate:()V
       4: return

  public void c(android.view.View, int);
    Code:
       0: aload_1
       1: iload_2
       2: invokevirtual #173                // Method android/view/View.offsetTopAndBottom:(I)V
       5: aload_1
       6: invokevirtual #161                // Method android/view/View.getVisibility:()I
       9: ifne          35
      12: aload_1
      13: invokestatic  #163                // Method D:(Landroid/view/View;)V
      16: aload_1
      17: invokevirtual #167                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      20: astore_1
      21: aload_1
      22: instanceof    #42                 // class android/view/View
      25: ifeq          35
      28: aload_1
      29: checkcast     #42                 // class android/view/View
      32: invokestatic  #163                // Method D:(Landroid/view/View;)V
      35: return

  public int d(android.view.View);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.ViewParent e(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #167                // Method android/view/View.getParent:()Landroid/view/ViewParent;
       4: areturn

  public int f(android.view.View);
    Code:
       0: getstatic     #181                // Field e:Z
       3: ifne          27
       6: ldc           #42                 // class android/view/View
       8: ldc           #183                // String mMinWidth
      10: invokevirtual #74                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      13: putstatic     #185                // Field d:Ljava/lang/reflect/Field;
      16: getstatic     #185                // Field d:Ljava/lang/reflect/Field;
      19: iconst_1
      20: invokevirtual #80                 // Method java/lang/reflect/Field.setAccessible:(Z)V
      23: iconst_1
      24: putstatic     #181                // Field e:Z
      27: getstatic     #185                // Field d:Ljava/lang/reflect/Field;
      30: ifnull        49
      33: getstatic     #185                // Field d:Ljava/lang/reflect/Field;
      36: aload_1
      37: invokevirtual #84                 // Method java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
      40: checkcast     #187                // class java/lang/Integer
      43: invokevirtual #190                // Method java/lang/Integer.intValue:()I
      46: istore_2
      47: iload_2
      48: ireturn
      49: iconst_0
      50: ireturn
      51: astore_3
      52: goto          23
      55: astore_1
      56: goto          49
    Exception table:
       from    to  target type
           6    23    51   Class java/lang/NoSuchFieldException
          33    47    55   Class java/lang/Exception

  public int g(android.view.View);
    Code:
       0: getstatic     #192                // Field g:Z
       3: ifne          27
       6: ldc           #42                 // class android/view/View
       8: ldc           #194                // String mMinHeight
      10: invokevirtual #74                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      13: putstatic     #196                // Field f:Ljava/lang/reflect/Field;
      16: getstatic     #196                // Field f:Ljava/lang/reflect/Field;
      19: iconst_1
      20: invokevirtual #80                 // Method java/lang/reflect/Field.setAccessible:(Z)V
      23: iconst_1
      24: putstatic     #192                // Field g:Z
      27: getstatic     #196                // Field f:Ljava/lang/reflect/Field;
      30: ifnull        49
      33: getstatic     #196                // Field f:Ljava/lang/reflect/Field;
      36: aload_1
      37: invokevirtual #84                 // Method java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
      40: checkcast     #187                // class java/lang/Integer
      43: invokevirtual #190                // Method java/lang/Integer.intValue:()I
      46: istore_2
      47: iload_2
      48: ireturn
      49: iconst_0
      50: ireturn
      51: astore_3
      52: goto          23
      55: astore_1
      56: goto          49
    Exception table:
       from    to  target type
           6    23    51   Class java/lang/NoSuchFieldException
          33    47    55   Class java/lang/Exception

  public void h(android.view.View);
    Code:
       0: return

  public boolean i(android.view.View);
    Code:
       0: iconst_0
       1: ireturn

  public boolean j(android.view.View);
    Code:
       0: iconst_1
       1: ireturn

  public int k(android.view.View);
    Code:
       0: iconst_0
       1: ireturn

  public int l(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #201                // Method android/view/View.getPaddingLeft:()I
       4: ireturn

  public int m(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #205                // Method android/view/View.getPaddingRight:()I
       4: ireturn

  public int n(android.view.View);
    Code:
       0: iconst_0
       1: ireturn

  public boolean o(android.view.View);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.Display p(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #212                // Method s:(Landroid/view/View;)Z
       5: ifeq          26
       8: aload_1
       9: invokevirtual #216                // Method android/view/View.getContext:()Landroid/content/Context;
      12: ldc           #218                // String window
      14: invokevirtual #224                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      17: checkcast     #226                // class android/view/WindowManager
      20: invokeinterface #230,  1          // InterfaceMethod android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
      25: areturn
      26: aconst_null
      27: areturn

  public android.graphics.Rect q(android.view.View);
    Code:
       0: aconst_null
       1: areturn

  public boolean r(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #236                // Method android/view/View.getWidth:()I
       4: ifle          16
       7: aload_1
       8: invokevirtual #239                // Method android/view/View.getHeight:()I
      11: ifle          16
      14: iconst_1
      15: ireturn
      16: iconst_0
      17: ireturn

  public boolean s(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #243                // Method android/view/View.getWindowToken:()Landroid/os/IBinder;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public java.lang.String t(android.view.View);
    Code:
       0: getstatic     #153                // Field h:Ljava/util/WeakHashMap;
       3: ifnonnull     8
       6: aconst_null
       7: areturn
       8: getstatic     #153                // Field h:Ljava/util/WeakHashMap;
      11: aload_1
      12: invokevirtual #90                 // Method java/util/WeakHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      15: checkcast     #247                // class java/lang/String
      18: areturn

  public float u(android.view.View);
    Code:
       0: fconst_0
       1: freturn

  public float v(android.view.View);
    Code:
       0: fconst_0
       1: freturn

  public boolean w(android.view.View);
    Code:
       0: aload_1
       1: instanceof    #250                // class android/support/v4/view/j
       4: ifeq          17
       7: aload_1
       8: checkcast     #250                // class android/support/v4/view/j
      11: invokeinterface #254,  1          // InterfaceMethod android/support/v4/view/j.isNestedScrollingEnabled:()Z
      16: ireturn
      17: iconst_0
      18: ireturn

  public void x(android.view.View);
    Code:
       0: aload_1
       1: instanceof    #250                // class android/support/v4/view/j
       4: ifeq          16
       7: aload_1
       8: checkcast     #250                // class android/support/v4/view/j
      11: invokeinterface #258,  1          // InterfaceMethod android/support/v4/view/j.stopNestedScroll:()V
      16: return

  public android.content.res.ColorStateList y(android.view.View);
    Code:
       0: aload_1
       1: instanceof    #116                // class android/support/v4/view/r
       4: ifeq          17
       7: aload_1
       8: checkcast     #116                // class android/support/v4/view/r
      11: invokeinterface #264,  1          // InterfaceMethod android/support/v4/view/r.getSupportBackgroundTintList:()Landroid/content/res/ColorStateList;
      16: areturn
      17: aconst_null
      18: areturn

  public android.graphics.PorterDuff$Mode z(android.view.View);
    Code:
       0: aload_1
       1: instanceof    #116                // class android/support/v4/view/r
       4: ifeq          17
       7: aload_1
       8: checkcast     #116                // class android/support/v4/view/r
      11: invokeinterface #270,  1          // InterfaceMethod android/support/v4/view/r.getSupportBackgroundTintMode:()Landroid/graphics/PorterDuff$Mode;
      16: areturn
      17: aconst_null
      18: areturn
}
