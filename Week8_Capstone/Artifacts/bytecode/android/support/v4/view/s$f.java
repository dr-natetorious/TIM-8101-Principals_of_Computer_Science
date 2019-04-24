class android.support.v4.view.s$f extends android.support.v4.view.s$e {
  android.support.v4.view.s$f();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/support/v4/view/s$e."<init>":()V
       4: return

  public float A(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #46                 // Method android/view/View.getZ:()F
       4: freturn

  public android.support.v4.view.ab a(android.view.View, android.support.v4.view.ab);
    Code:
       0: aload_2
       1: invokestatic  #53                 // Method android/support/v4/view/ab.a:(Landroid/support/v4/view/ab;)Ljava/lang/Object;
       4: checkcast     #55                 // class android/view/WindowInsets
       7: astore_2
       8: aload_1
       9: aload_2
      10: invokevirtual #59                 // Method android/view/View.onApplyWindowInsets:(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
      13: astore_3
      14: aload_2
      15: astore_1
      16: aload_3
      17: aload_2
      18: if_acmpeq     30
      21: new           #55                 // class android/view/WindowInsets
      24: dup
      25: aload_3
      26: invokespecial #62                 // Method android/view/WindowInsets."<init>":(Landroid/view/WindowInsets;)V
      29: astore_1
      30: aload_1
      31: invokestatic  #65                 // Method android/support/v4/view/ab.a:(Ljava/lang/Object;)Landroid/support/v4/view/ab;
      34: areturn

  public void a(android.view.View, float);
    Code:
       0: aload_1
       1: fload_2
       2: invokevirtual #70                 // Method android/view/View.setElevation:(F)V
       5: return

  public void a(android.view.View, android.content.res.ColorStateList);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #75                 // Method android/view/View.setBackgroundTintList:(Landroid/content/res/ColorStateList;)V
       5: getstatic     #81                 // Field android/os/Build$VERSION.SDK_INT:I
       8: bipush        21
      10: if_icmpne     71
      13: aload_1
      14: invokevirtual #85                 // Method android/view/View.getBackground:()Landroid/graphics/drawable/Drawable;
      17: astore_2
      18: aload_1
      19: invokevirtual #89                 // Method android/view/View.getBackgroundTintList:()Landroid/content/res/ColorStateList;
      22: ifnonnull     40
      25: aload_1
      26: invokevirtual #93                 // Method android/view/View.getBackgroundTintMode:()Landroid/graphics/PorterDuff$Mode;
      29: ifnull        35
      32: goto          40
      35: iconst_0
      36: istore_3
      37: goto          42
      40: iconst_1
      41: istore_3
      42: aload_2
      43: ifnull        71
      46: iload_3
      47: ifeq          71
      50: aload_2
      51: invokevirtual #99                 // Method android/graphics/drawable/Drawable.isStateful:()Z
      54: ifeq          66
      57: aload_2
      58: aload_1
      59: invokevirtual #103                // Method android/view/View.getDrawableState:()[I
      62: invokevirtual #107                // Method android/graphics/drawable/Drawable.setState:([I)Z
      65: pop
      66: aload_1
      67: aload_2
      68: invokevirtual #111                // Method android/view/View.setBackground:(Landroid/graphics/drawable/Drawable;)V
      71: return

  public void a(android.view.View, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #116                // Method android/view/View.setBackgroundTintMode:(Landroid/graphics/PorterDuff$Mode;)V
       5: getstatic     #81                 // Field android/os/Build$VERSION.SDK_INT:I
       8: bipush        21
      10: if_icmpne     71
      13: aload_1
      14: invokevirtual #85                 // Method android/view/View.getBackground:()Landroid/graphics/drawable/Drawable;
      17: astore_2
      18: aload_1
      19: invokevirtual #89                 // Method android/view/View.getBackgroundTintList:()Landroid/content/res/ColorStateList;
      22: ifnonnull     40
      25: aload_1
      26: invokevirtual #93                 // Method android/view/View.getBackgroundTintMode:()Landroid/graphics/PorterDuff$Mode;
      29: ifnull        35
      32: goto          40
      35: iconst_0
      36: istore_3
      37: goto          42
      40: iconst_1
      41: istore_3
      42: aload_2
      43: ifnull        71
      46: iload_3
      47: ifeq          71
      50: aload_2
      51: invokevirtual #99                 // Method android/graphics/drawable/Drawable.isStateful:()Z
      54: ifeq          66
      57: aload_2
      58: aload_1
      59: invokevirtual #103                // Method android/view/View.getDrawableState:()[I
      62: invokevirtual #107                // Method android/graphics/drawable/Drawable.setState:([I)Z
      65: pop
      66: aload_1
      67: aload_2
      68: invokevirtual #111                // Method android/view/View.setBackground:(Landroid/graphics/drawable/Drawable;)V
      71: return

  public void a(android.view.View, android.support.v4.view.p);
    Code:
       0: aload_2
       1: ifnonnull     10
       4: aload_1
       5: aconst_null
       6: invokevirtual #121                // Method android/view/View.setOnApplyWindowInsetsListener:(Landroid/view/View$OnApplyWindowInsetsListener;)V
       9: return
      10: aload_1
      11: new           #9                  // class android/support/v4/view/s$f$1
      14: dup
      15: aload_0
      16: aload_2
      17: invokespecial #124                // Method android/support/v4/view/s$f$1."<init>":(Landroid/support/v4/view/s$f;Landroid/support/v4/view/p;)V
      20: invokevirtual #121                // Method android/view/View.setOnApplyWindowInsetsListener:(Landroid/view/View$OnApplyWindowInsetsListener;)V
      23: return

  public void a(android.view.View, java.lang.String);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #129                // Method android/view/View.setTransitionName:(Ljava/lang/String;)V
       5: return

  public android.support.v4.view.ab b(android.view.View, android.support.v4.view.ab);
    Code:
       0: aload_2
       1: invokestatic  #53                 // Method android/support/v4/view/ab.a:(Landroid/support/v4/view/ab;)Ljava/lang/Object;
       4: checkcast     #55                 // class android/view/WindowInsets
       7: astore_2
       8: aload_1
       9: aload_2
      10: invokevirtual #132                // Method android/view/View.dispatchApplyWindowInsets:(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
      13: astore_3
      14: aload_2
      15: astore_1
      16: aload_3
      17: aload_2
      18: if_acmpeq     30
      21: new           #55                 // class android/view/WindowInsets
      24: dup
      25: aload_3
      26: invokespecial #62                 // Method android/view/WindowInsets."<init>":(Landroid/view/WindowInsets;)V
      29: astore_1
      30: aload_1
      31: invokestatic  #65                 // Method android/support/v4/view/ab.a:(Ljava/lang/Object;)Landroid/support/v4/view/ab;
      34: areturn

  public void b(android.view.View, int);
    Code:
       0: invokestatic  #135                // Method b:()Landroid/graphics/Rect;
       3: astore        4
       5: aload_1
       6: invokevirtual #139                // Method android/view/View.getParent:()Landroid/view/ViewParent;
       9: astore        5
      11: aload         5
      13: instanceof    #42                 // class android/view/View
      16: ifeq          78
      19: aload         5
      21: checkcast     #42                 // class android/view/View
      24: astore        6
      26: aload         4
      28: aload         6
      30: invokevirtual #143                // Method android/view/View.getLeft:()I
      33: aload         6
      35: invokevirtual #146                // Method android/view/View.getTop:()I
      38: aload         6
      40: invokevirtual #149                // Method android/view/View.getRight:()I
      43: aload         6
      45: invokevirtual #152                // Method android/view/View.getBottom:()I
      48: invokevirtual #155                // Method android/graphics/Rect.set:(IIII)V
      51: aload         4
      53: aload_1
      54: invokevirtual #143                // Method android/view/View.getLeft:()I
      57: aload_1
      58: invokevirtual #146                // Method android/view/View.getTop:()I
      61: aload_1
      62: invokevirtual #149                // Method android/view/View.getRight:()I
      65: aload_1
      66: invokevirtual #152                // Method android/view/View.getBottom:()I
      69: invokevirtual #159                // Method android/graphics/Rect.intersects:(IIII)Z
      72: iconst_1
      73: ixor
      74: istore_3
      75: goto          80
      78: iconst_0
      79: istore_3
      80: aload_0
      81: aload_1
      82: iload_2
      83: invokespecial #161                // Method android/support/v4/view/s$e.b:(Landroid/view/View;I)V
      86: iload_3
      87: ifeq          124
      90: aload         4
      92: aload_1
      93: invokevirtual #143                // Method android/view/View.getLeft:()I
      96: aload_1
      97: invokevirtual #146                // Method android/view/View.getTop:()I
     100: aload_1
     101: invokevirtual #149                // Method android/view/View.getRight:()I
     104: aload_1
     105: invokevirtual #152                // Method android/view/View.getBottom:()I
     108: invokevirtual #164                // Method android/graphics/Rect.intersect:(IIII)Z
     111: ifeq          124
     114: aload         5
     116: checkcast     #42                 // class android/view/View
     119: aload         4
     121: invokevirtual #168                // Method android/view/View.invalidate:(Landroid/graphics/Rect;)V
     124: return

  public void c(android.view.View, int);
    Code:
       0: invokestatic  #135                // Method b:()Landroid/graphics/Rect;
       3: astore        4
       5: aload_1
       6: invokevirtual #139                // Method android/view/View.getParent:()Landroid/view/ViewParent;
       9: astore        5
      11: aload         5
      13: instanceof    #42                 // class android/view/View
      16: ifeq          78
      19: aload         5
      21: checkcast     #42                 // class android/view/View
      24: astore        6
      26: aload         4
      28: aload         6
      30: invokevirtual #143                // Method android/view/View.getLeft:()I
      33: aload         6
      35: invokevirtual #146                // Method android/view/View.getTop:()I
      38: aload         6
      40: invokevirtual #149                // Method android/view/View.getRight:()I
      43: aload         6
      45: invokevirtual #152                // Method android/view/View.getBottom:()I
      48: invokevirtual #155                // Method android/graphics/Rect.set:(IIII)V
      51: aload         4
      53: aload_1
      54: invokevirtual #143                // Method android/view/View.getLeft:()I
      57: aload_1
      58: invokevirtual #146                // Method android/view/View.getTop:()I
      61: aload_1
      62: invokevirtual #149                // Method android/view/View.getRight:()I
      65: aload_1
      66: invokevirtual #152                // Method android/view/View.getBottom:()I
      69: invokevirtual #159                // Method android/graphics/Rect.intersects:(IIII)Z
      72: iconst_1
      73: ixor
      74: istore_3
      75: goto          80
      78: iconst_0
      79: istore_3
      80: aload_0
      81: aload_1
      82: iload_2
      83: invokespecial #171                // Method android/support/v4/view/s$e.c:(Landroid/view/View;I)V
      86: iload_3
      87: ifeq          124
      90: aload         4
      92: aload_1
      93: invokevirtual #143                // Method android/view/View.getLeft:()I
      96: aload_1
      97: invokevirtual #146                // Method android/view/View.getTop:()I
     100: aload_1
     101: invokevirtual #149                // Method android/view/View.getRight:()I
     104: aload_1
     105: invokevirtual #152                // Method android/view/View.getBottom:()I
     108: invokevirtual #164                // Method android/graphics/Rect.intersect:(IIII)Z
     111: ifeq          124
     114: aload         5
     116: checkcast     #42                 // class android/view/View
     119: aload         4
     121: invokevirtual #168                // Method android/view/View.invalidate:(Landroid/graphics/Rect;)V
     124: return

  public void h(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #176                // Method android/view/View.requestApplyInsets:()V
       4: return

  public java.lang.String t(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #182                // Method android/view/View.getTransitionName:()Ljava/lang/String;
       4: areturn

  public float u(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #186                // Method android/view/View.getElevation:()F
       4: freturn

  public float v(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #190                // Method android/view/View.getTranslationZ:()F
       4: freturn

  public boolean w(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #195                // Method android/view/View.isNestedScrollingEnabled:()Z
       4: ireturn

  public void x(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #199                // Method android/view/View.stopNestedScroll:()V
       4: return

  public android.content.res.ColorStateList y(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #89                 // Method android/view/View.getBackgroundTintList:()Landroid/content/res/ColorStateList;
       4: areturn

  public android.graphics.PorterDuff$Mode z(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #93                 // Method android/view/View.getBackgroundTintMode:()Landroid/graphics/PorterDuff$Mode;
       4: areturn
}
