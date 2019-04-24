class android.support.transition.aj$a extends android.view.ViewGroup {
  static java.lang.reflect.Method a;

  android.view.ViewGroup b;

  android.view.View c;

  java.util.ArrayList<android.graphics.drawable.Drawable> d;

  android.support.transition.aj e;

  static {};
    Code:
       0: ldc           #4                  // class android/view/ViewGroup
       2: ldc           #23                 // String invalidateChildInParentFast
       4: iconst_3
       5: anewarray     #25                 // class java/lang/Class
       8: dup
       9: iconst_0
      10: getstatic     #31                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      13: aastore
      14: dup
      15: iconst_1
      16: getstatic     #31                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      19: aastore
      20: dup
      21: iconst_2
      22: ldc           #33                 // class android/graphics/Rect
      24: aastore
      25: invokevirtual #37                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      28: putstatic     #39                 // Field a:Ljava/lang/reflect/Method;
      31: return
      32: astore_0
      33: return
    Exception table:
       from    to  target type
           0    31    32   Class java/lang/NoSuchMethodException

  android.support.transition.aj$a(android.content.Context, android.view.ViewGroup, android.view.View, android.support.transition.aj);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #45                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: aconst_null
       7: putfield      #47                 // Field d:Ljava/util/ArrayList;
      10: aload_0
      11: aload_2
      12: putfield      #49                 // Field b:Landroid/view/ViewGroup;
      15: aload_0
      16: aload_3
      17: putfield      #51                 // Field c:Landroid/view/View;
      20: aload_0
      21: aload_2
      22: invokevirtual #55                 // Method android/view/ViewGroup.getWidth:()I
      25: invokevirtual #59                 // Method setRight:(I)V
      28: aload_0
      29: aload_2
      30: invokevirtual #62                 // Method android/view/ViewGroup.getHeight:()I
      33: invokevirtual #65                 // Method setBottom:(I)V
      36: aload_2
      37: aload_0
      38: invokevirtual #69                 // Method android/view/ViewGroup.addView:(Landroid/view/View;)V
      41: aload_0
      42: aload         4
      44: putfield      #71                 // Field e:Landroid/support/transition/aj;
      47: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #47                 // Field d:Ljava/util/ArrayList;
       4: ifnonnull     18
       7: aload_0
       8: new           #81                 // class java/util/ArrayList
      11: dup
      12: invokespecial #83                 // Method java/util/ArrayList."<init>":()V
      15: putfield      #47                 // Field d:Ljava/util/ArrayList;
      18: aload_0
      19: getfield      #47                 // Field d:Ljava/util/ArrayList;
      22: aload_1
      23: invokevirtual #87                 // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      26: ifne          51
      29: aload_0
      30: getfield      #47                 // Field d:Ljava/util/ArrayList;
      33: aload_1
      34: invokevirtual #90                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      37: pop
      38: aload_0
      39: aload_1
      40: invokevirtual #96                 // Method android/graphics/drawable/Drawable.getBounds:()Landroid/graphics/Rect;
      43: invokevirtual #100                // Method invalidate:(Landroid/graphics/Rect;)V
      46: aload_1
      47: aload_0
      48: invokevirtual #104                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      51: return

  public void a(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #108                // Method android/view/View.getParent:()Landroid/view/ViewParent;
       4: instanceof    #4                  // class android/view/ViewGroup
       7: ifeq          104
      10: aload_1
      11: invokevirtual #108                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      14: checkcast     #4                  // class android/view/ViewGroup
      17: astore_2
      18: aload_2
      19: aload_0
      20: getfield      #49                 // Field b:Landroid/view/ViewGroup;
      23: if_acmpeq     87
      26: aload_2
      27: invokevirtual #109                // Method android/view/ViewGroup.getParent:()Landroid/view/ViewParent;
      30: ifnull        87
      33: aload_2
      34: invokestatic  #115                // Method android/support/v4/view/s.z:(Landroid/view/View;)Z
      37: ifeq          87
      40: iconst_2
      41: newarray       int
      43: astore_3
      44: iconst_2
      45: newarray       int
      47: astore        4
      49: aload_2
      50: aload_3
      51: invokevirtual #75                 // Method android/view/ViewGroup.getLocationOnScreen:([I)V
      54: aload_0
      55: getfield      #49                 // Field b:Landroid/view/ViewGroup;
      58: aload         4
      60: invokevirtual #75                 // Method android/view/ViewGroup.getLocationOnScreen:([I)V
      63: aload_1
      64: aload_3
      65: iconst_0
      66: iaload
      67: aload         4
      69: iconst_0
      70: iaload
      71: isub
      72: invokestatic  #118                // Method android/support/v4/view/s.c:(Landroid/view/View;I)V
      75: aload_1
      76: aload_3
      77: iconst_1
      78: iaload
      79: aload         4
      81: iconst_1
      82: iaload
      83: isub
      84: invokestatic  #120                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
      87: aload_2
      88: aload_1
      89: invokevirtual #123                // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
      92: aload_1
      93: invokevirtual #108                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      96: ifnull        104
      99: aload_2
     100: aload_1
     101: invokevirtual #123                // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
     104: aload_0
     105: aload_1
     106: aload_0
     107: invokevirtual #126                // Method getChildCount:()I
     110: iconst_1
     111: isub
     112: invokespecial #128                // Method android/view/ViewGroup.addView:(Landroid/view/View;I)V
     115: return

  boolean a();
    Code:
       0: aload_0
       1: invokevirtual #126                // Method getChildCount:()I
       4: ifne          26
       7: aload_0
       8: getfield      #47                 // Field d:Ljava/util/ArrayList;
      11: ifnull        24
      14: aload_0
      15: getfield      #47                 // Field d:Ljava/util/ArrayList;
      18: invokevirtual #132                // Method java/util/ArrayList.size:()I
      21: ifne          26
      24: iconst_1
      25: ireturn
      26: iconst_0
      27: ireturn

  public void b(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #47                 // Field d:Ljava/util/ArrayList;
       4: ifnull        29
       7: aload_0
       8: getfield      #47                 // Field d:Ljava/util/ArrayList;
      11: aload_1
      12: invokevirtual #135                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      15: pop
      16: aload_0
      17: aload_1
      18: invokevirtual #96                 // Method android/graphics/drawable/Drawable.getBounds:()Landroid/graphics/Rect;
      21: invokevirtual #100                // Method invalidate:(Landroid/graphics/Rect;)V
      24: aload_1
      25: aconst_null
      26: invokevirtual #104                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      29: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #123                // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
       5: aload_0
       6: invokevirtual #137                // Method a:()Z
       9: ifeq          20
      12: aload_0
      13: getfield      #49                 // Field b:Landroid/view/ViewGroup;
      16: aload_0
      17: invokevirtual #123                // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
      20: return

  protected void dispatchDraw(android.graphics.Canvas);
    Code:
       0: iconst_2
       1: newarray       int
       3: astore        4
       5: iconst_2
       6: newarray       int
       8: astore        5
      10: aload_0
      11: getfield      #49                 // Field b:Landroid/view/ViewGroup;
      14: aload         4
      16: invokevirtual #75                 // Method android/view/ViewGroup.getLocationOnScreen:([I)V
      19: aload_0
      20: getfield      #51                 // Field c:Landroid/view/View;
      23: aload         5
      25: invokevirtual #78                 // Method android/view/View.getLocationOnScreen:([I)V
      28: iconst_0
      29: istore_3
      30: aload_1
      31: aload         5
      33: iconst_0
      34: iaload
      35: aload         4
      37: iconst_0
      38: iaload
      39: isub
      40: i2f
      41: aload         5
      43: iconst_1
      44: iaload
      45: aload         4
      47: iconst_1
      48: iaload
      49: isub
      50: i2f
      51: invokevirtual #145                // Method android/graphics/Canvas.translate:(FF)V
      54: aload_1
      55: new           #33                 // class android/graphics/Rect
      58: dup
      59: iconst_0
      60: iconst_0
      61: aload_0
      62: getfield      #51                 // Field c:Landroid/view/View;
      65: invokevirtual #146                // Method android/view/View.getWidth:()I
      68: aload_0
      69: getfield      #51                 // Field c:Landroid/view/View;
      72: invokevirtual #147                // Method android/view/View.getHeight:()I
      75: invokespecial #150                // Method android/graphics/Rect."<init>":(IIII)V
      78: invokevirtual #154                // Method android/graphics/Canvas.clipRect:(Landroid/graphics/Rect;)Z
      81: pop
      82: aload_0
      83: aload_1
      84: invokespecial #156                // Method android/view/ViewGroup.dispatchDraw:(Landroid/graphics/Canvas;)V
      87: aload_0
      88: getfield      #47                 // Field d:Ljava/util/ArrayList;
      91: ifnonnull     99
      94: iconst_0
      95: istore_2
      96: goto          107
      99: aload_0
     100: getfield      #47                 // Field d:Ljava/util/ArrayList;
     103: invokevirtual #132                // Method java/util/ArrayList.size:()I
     106: istore_2
     107: iload_3
     108: iload_2
     109: if_icmpge     134
     112: aload_0
     113: getfield      #47                 // Field d:Ljava/util/ArrayList;
     116: iload_3
     117: invokevirtual #160                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     120: checkcast     #92                 // class android/graphics/drawable/Drawable
     123: aload_1
     124: invokevirtual #163                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     127: iload_3
     128: iconst_1
     129: iadd
     130: istore_3
     131: goto          107
     134: return

  public boolean dispatchTouchEvent(android.view.MotionEvent);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.ViewParent invalidateChildInParent(int[], android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #49                 // Field b:Landroid/view/ViewGroup;
       4: ifnull        66
       7: aload_2
       8: aload_1
       9: iconst_0
      10: iaload
      11: aload_1
      12: iconst_1
      13: iaload
      14: invokevirtual #171                // Method android/graphics/Rect.offset:(II)V
      17: aload_0
      18: getfield      #49                 // Field b:Landroid/view/ViewGroup;
      21: instanceof    #4                  // class android/view/ViewGroup
      24: ifeq          61
      27: aload_1
      28: iconst_0
      29: iconst_0
      30: iastore
      31: aload_1
      32: iconst_1
      33: iconst_0
      34: iastore
      35: iconst_2
      36: newarray       int
      38: astore_3
      39: aload_0
      40: aload_3
      41: invokespecial #173                // Method a:([I)V
      44: aload_2
      45: aload_3
      46: iconst_0
      47: iaload
      48: aload_3
      49: iconst_1
      50: iaload
      51: invokevirtual #171                // Method android/graphics/Rect.offset:(II)V
      54: aload_0
      55: aload_1
      56: aload_2
      57: invokespecial #175                // Method android/view/ViewGroup.invalidateChildInParent:([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
      60: areturn
      61: aload_0
      62: aload_2
      63: invokevirtual #100                // Method invalidate:(Landroid/graphics/Rect;)V
      66: aconst_null
      67: areturn

  public void invalidateDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #96                 // Method android/graphics/drawable/Drawable.getBounds:()Landroid/graphics/Rect;
       5: invokevirtual #100                // Method invalidate:(Landroid/graphics/Rect;)V
       8: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: return

  protected boolean verifyDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #182                // Method android/view/ViewGroup.verifyDrawable:(Landroid/graphics/drawable/Drawable;)Z
       5: ifne          31
       8: aload_0
       9: getfield      #47                 // Field d:Ljava/util/ArrayList;
      12: ifnull        29
      15: aload_0
      16: getfield      #47                 // Field d:Ljava/util/ArrayList;
      19: aload_1
      20: invokevirtual #87                 // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      23: ifeq          29
      26: goto          31
      29: iconst_0
      30: ireturn
      31: iconst_1
      32: ireturn
}
