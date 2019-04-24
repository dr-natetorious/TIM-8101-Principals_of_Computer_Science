class android.support.v4.b.a.f extends android.support.v4.b.a.e {
  android.support.v4.b.a.f(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #13                 // Method android/support/v4/b/a/e."<init>":(Landroid/graphics/drawable/Drawable;)V
       5: aload_0
       6: invokespecial #16                 // Method d:()V
       9: return

  android.support.v4.b.a.f(android.support.v4.b.a.d$a, android.content.res.Resources);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #20                 // Method android/support/v4/b/a/e."<init>":(Landroid/support/v4/b/a/d$a;Landroid/content/res/Resources;)V
       6: aload_0
       7: invokespecial #16                 // Method d:()V
      10: return

  android.support.v4.b.a.d$a b();
    Code:
       0: new           #6                  // class android/support/v4/b/a/f$a
       3: dup
       4: aload_0
       5: getfield      #49                 // Field b:Landroid/support/v4/b/a/d$a;
       8: aconst_null
       9: invokespecial #50                 // Method android/support/v4/b/a/f$a."<init>":(Landroid/support/v4/b/a/d$a;Landroid/content/res/Resources;)V
      12: areturn

  protected boolean c();
    Code:
       0: getstatic     #58                 // Field android/os/Build$VERSION.SDK_INT:I
       3: istore_1
       4: iconst_0
       5: istore_3
       6: iload_3
       7: istore_2
       8: iload_1
       9: bipush        21
      11: if_icmpne     56
      14: aload_0
      15: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
      18: astore        4
      20: aload         4
      22: instanceof    #63                 // class android/graphics/drawable/GradientDrawable
      25: ifne          54
      28: aload         4
      30: instanceof    #65                 // class android/graphics/drawable/DrawableContainer
      33: ifne          54
      36: aload         4
      38: instanceof    #67                 // class android/graphics/drawable/InsetDrawable
      41: ifne          54
      44: iload_3
      45: istore_2
      46: aload         4
      48: instanceof    #69                 // class android/graphics/drawable/RippleDrawable
      51: ifeq          56
      54: iconst_1
      55: istore_2
      56: iload_2
      57: ireturn

  public android.graphics.Rect getDirtyBounds();
    Code:
       0: aload_0
       1: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #73                 // Method android/graphics/drawable/Drawable.getDirtyBounds:()Landroid/graphics/Rect;
       7: areturn

  public void getOutline(android.graphics.Outline);
    Code:
       0: aload_0
       1: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #77                 // Method android/graphics/drawable/Drawable.getOutline:(Landroid/graphics/Outline;)V
       8: return

  public void setHotspot(float, float);
    Code:
       0: aload_0
       1: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
       4: fload_1
       5: fload_2
       6: invokevirtual #81                 // Method android/graphics/drawable/Drawable.setHotspot:(FF)V
       9: return

  public void setHotspotBounds(int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: invokevirtual #85                 // Method android/graphics/drawable/Drawable.setHotspotBounds:(IIII)V
      12: return

  public boolean setState(int[]);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #89                 // Method android/support/v4/b/a/e.setState:([I)Z
       5: ifeq          14
       8: aload_0
       9: invokevirtual #92                 // Method invalidateSelf:()V
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn

  public void setTint(int);
    Code:
       0: aload_0
       1: invokevirtual #96                 // Method c:()Z
       4: ifeq          13
       7: aload_0
       8: iload_1
       9: invokespecial #98                 // Method android/support/v4/b/a/e.setTint:(I)V
      12: return
      13: aload_0
      14: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
      17: iload_1
      18: invokevirtual #99                 // Method android/graphics/drawable/Drawable.setTint:(I)V
      21: return

  public void setTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: invokevirtual #96                 // Method c:()Z
       4: ifeq          13
       7: aload_0
       8: aload_1
       9: invokespecial #103                // Method android/support/v4/b/a/e.setTintList:(Landroid/content/res/ColorStateList;)V
      12: return
      13: aload_0
      14: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
      17: aload_1
      18: invokevirtual #104                // Method android/graphics/drawable/Drawable.setTintList:(Landroid/content/res/ColorStateList;)V
      21: return

  public void setTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: invokevirtual #96                 // Method c:()Z
       4: ifeq          13
       7: aload_0
       8: aload_1
       9: invokespecial #108                // Method android/support/v4/b/a/e.setTintMode:(Landroid/graphics/PorterDuff$Mode;)V
      12: return
      13: aload_0
      14: getfield      #61                 // Field c:Landroid/graphics/drawable/Drawable;
      17: aload_1
      18: invokevirtual #109                // Method android/graphics/drawable/Drawable.setTintMode:(Landroid/graphics/PorterDuff$Mode;)V
      21: return
}
