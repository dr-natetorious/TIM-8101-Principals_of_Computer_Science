class android.support.transition.am {
  static final android.util.Property<android.view.View, java.lang.Float> a;

  static final android.util.Property<android.view.View, android.graphics.Rect> b;

  static {};
    Code:
       0: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        22
       5: if_icmplt     23
       8: new           #29                 // class android/support/transition/ar
      11: dup
      12: invokespecial #32                 // Method android/support/transition/ar."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #34                 // Field c:Landroid/support/transition/as;
      20: goto          91
      23: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      26: bipush        21
      28: if_icmplt     42
      31: new           #36                 // class android/support/transition/aq
      34: dup
      35: invokespecial #37                 // Method android/support/transition/aq."<init>":()V
      38: astore_0
      39: goto          16
      42: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      45: bipush        19
      47: if_icmplt     61
      50: new           #39                 // class android/support/transition/ap
      53: dup
      54: invokespecial #40                 // Method android/support/transition/ap."<init>":()V
      57: astore_0
      58: goto          16
      61: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      64: bipush        18
      66: if_icmplt     80
      69: new           #42                 // class android/support/transition/ao
      72: dup
      73: invokespecial #43                 // Method android/support/transition/ao."<init>":()V
      76: astore_0
      77: goto          16
      80: new           #45                 // class android/support/transition/an
      83: dup
      84: invokespecial #46                 // Method android/support/transition/an."<init>":()V
      87: astore_0
      88: goto          16
      91: new           #6                  // class android/support/transition/am$1
      94: dup
      95: ldc           #48                 // class java/lang/Float
      97: ldc           #50                 // String translationAlpha
      99: invokespecial #53                 // Method android/support/transition/am$1."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
     102: putstatic     #55                 // Field a:Landroid/util/Property;
     105: new           #8                  // class android/support/transition/am$2
     108: dup
     109: ldc           #57                 // class android/graphics/Rect
     111: ldc           #59                 // String clipBounds
     113: invokespecial #60                 // Method android/support/transition/am$2."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
     116: putstatic     #62                 // Field b:Landroid/util/Property;
     119: return

  static android.support.transition.al a(android.view.View);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: invokeinterface #68,  2           // InterfaceMethod android/support/transition/as.a:(Landroid/view/View;)Landroid/support/transition/al;
       9: areturn

  static void a(android.view.View, float);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: fload_1
       5: invokeinterface #103,  3          // InterfaceMethod android/support/transition/as.a:(Landroid/view/View;F)V
      10: return

  static void a(android.view.View, int);
    Code:
       0: invokestatic  #108                // Method a:()V
       3: getstatic     #84                 // Field d:Ljava/lang/reflect/Field;
       6: ifnull        30
       9: getstatic     #84                 // Field d:Ljava/lang/reflect/Field;
      12: aload_0
      13: invokevirtual #112                // Method java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
      16: istore_2
      17: getstatic     #84                 // Field d:Ljava/lang/reflect/Field;
      20: aload_0
      21: iload_1
      22: iload_2
      23: bipush        -13
      25: iand
      26: ior
      27: invokevirtual #116                // Method java/lang/reflect/Field.setInt:(Ljava/lang/Object;I)V
      30: return
      31: astore_0
      32: return
    Exception table:
       from    to  target type
           9    30    31   Class java/lang/IllegalAccessException

  static void a(android.view.View, int, int, int, int);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: iload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: invokeinterface #119,  6          // InterfaceMethod android/support/transition/as.a:(Landroid/view/View;IIII)V
      14: return

  static void a(android.view.View, android.graphics.Matrix);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: aload_1
       5: invokeinterface #122,  3          // InterfaceMethod android/support/transition/as.a:(Landroid/view/View;Landroid/graphics/Matrix;)V
      10: return

  static android.support.transition.aw b(android.view.View);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: invokeinterface #125,  2          // InterfaceMethod android/support/transition/as.b:(Landroid/view/View;)Landroid/support/transition/aw;
       9: areturn

  static void b(android.view.View, android.graphics.Matrix);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: aload_1
       5: invokeinterface #127,  3          // InterfaceMethod android/support/transition/as.b:(Landroid/view/View;Landroid/graphics/Matrix;)V
      10: return

  static float c(android.view.View);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: invokeinterface #130,  2          // InterfaceMethod android/support/transition/as.c:(Landroid/view/View;)F
       9: freturn

  static void d(android.view.View);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: invokeinterface #133,  2          // InterfaceMethod android/support/transition/as.d:(Landroid/view/View;)V
       9: return

  static void e(android.view.View);
    Code:
       0: getstatic     #34                 // Field c:Landroid/support/transition/as;
       3: aload_0
       4: invokeinterface #135,  2          // InterfaceMethod android/support/transition/as.e:(Landroid/view/View;)V
       9: return
}
