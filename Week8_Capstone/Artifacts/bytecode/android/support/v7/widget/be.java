class android.support.v7.widget.be extends android.graphics.drawable.Drawable {
  static android.support.v7.widget.be$a a;

  static {};
    Code:
       0: ldc2_w        #36                 // double 45.0d
       3: invokestatic  #43                 // Method java/lang/Math.toRadians:(D)D
       6: invokestatic  #46                 // Method java/lang/Math.cos:(D)D
       9: putstatic     #48                 // Field b:D
      12: return

  android.support.v7.widget.be(android.content.res.Resources, android.content.res.ColorStateList, float, float, float);
    Code:
       0: aload_0
       1: invokespecial #53                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #55                 // Field n:Z
       9: aload_0
      10: iconst_1
      11: putfield      #57                 // Field q:Z
      14: aload_0
      15: iconst_0
      16: putfield      #59                 // Field r:Z
      19: aload_0
      20: aload_1
      21: getstatic     #64                 // Field android/support/v7/b/a$b.cardview_shadow_start_color:I
      24: invokevirtual #70                 // Method android/content/res/Resources.getColor:(I)I
      27: putfield      #72                 // Field o:I
      30: aload_0
      31: aload_1
      32: getstatic     #75                 // Field android/support/v7/b/a$b.cardview_shadow_end_color:I
      35: invokevirtual #70                 // Method android/content/res/Resources.getColor:(I)I
      38: putfield      #77                 // Field p:I
      41: aload_0
      42: aload_1
      43: getstatic     #82                 // Field android/support/v7/b/a$c.cardview_compat_inset_shadow:I
      46: invokevirtual #85                 // Method android/content/res/Resources.getDimensionPixelSize:(I)I
      49: putfield      #87                 // Field c:I
      52: aload_0
      53: new           #89                 // class android/graphics/Paint
      56: dup
      57: iconst_5
      58: invokespecial #92                 // Method android/graphics/Paint."<init>":(I)V
      61: putfield      #94                 // Field d:Landroid/graphics/Paint;
      64: aload_0
      65: aload_2
      66: invokespecial #97                 // Method b:(Landroid/content/res/ColorStateList;)V
      69: aload_0
      70: new           #89                 // class android/graphics/Paint
      73: dup
      74: iconst_5
      75: invokespecial #92                 // Method android/graphics/Paint."<init>":(I)V
      78: putfield      #99                 // Field e:Landroid/graphics/Paint;
      81: aload_0
      82: getfield      #99                 // Field e:Landroid/graphics/Paint;
      85: getstatic     #105                // Field android/graphics/Paint$Style.FILL:Landroid/graphics/Paint$Style;
      88: invokevirtual #109                // Method android/graphics/Paint.setStyle:(Landroid/graphics/Paint$Style;)V
      91: aload_0
      92: fload_3
      93: ldc           #110                // float 0.5f
      95: fadd
      96: f2i
      97: i2f
      98: putfield      #112                // Field h:F
     101: aload_0
     102: new           #114                // class android/graphics/RectF
     105: dup
     106: invokespecial #115                // Method android/graphics/RectF."<init>":()V
     109: putfield      #117                // Field g:Landroid/graphics/RectF;
     112: aload_0
     113: new           #89                 // class android/graphics/Paint
     116: dup
     117: aload_0
     118: getfield      #99                 // Field e:Landroid/graphics/Paint;
     121: invokespecial #120                // Method android/graphics/Paint."<init>":(Landroid/graphics/Paint;)V
     124: putfield      #122                // Field f:Landroid/graphics/Paint;
     127: aload_0
     128: getfield      #122                // Field f:Landroid/graphics/Paint;
     131: iconst_0
     132: invokevirtual #126                // Method android/graphics/Paint.setAntiAlias:(Z)V
     135: aload_0
     136: fload         4
     138: fload         5
     140: invokespecial #129                // Method a:(FF)V
     143: return

  static float a(float, float, boolean);
    Code:
       0: iload_2
       1: ifeq          20
       4: fload_0
       5: ldc           #131                // float 1.5f
       7: fmul
       8: f2d
       9: dconst_1
      10: getstatic     #48                 // Field b:D
      13: dsub
      14: fload_1
      15: f2d
      16: dmul
      17: dadd
      18: d2f
      19: freturn
      20: fload_0
      21: ldc           #131                // float 1.5f
      23: fmul
      24: freturn

  static float b(float, float, boolean);
    Code:
       0: fload_0
       1: fstore_3
       2: iload_2
       3: ifeq          19
       6: fload_0
       7: f2d
       8: dconst_1
       9: getstatic     #48                 // Field b:D
      12: dsub
      13: fload_1
      14: f2d
      15: dmul
      16: dadd
      17: d2f
      18: fstore_3
      19: fload_3
      20: freturn

  float a();
    Code:
       0: aload_0
       1: getfield      #112                // Field h:F
       4: freturn

  void a(float);
    Code:
       0: fload_1
       1: fconst_0
       2: fcmpg
       3: ifge          47
       6: new           #133                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #134                // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: ldc_w         #316                // String Invalid radius
      18: invokevirtual #140                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_2
      23: fload_1
      24: invokevirtual #143                // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      27: pop
      28: aload_2
      29: ldc           #145                // String . Must be >= 0
      31: invokevirtual #140                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: new           #147                // class java/lang/IllegalArgumentException
      38: dup
      39: aload_2
      40: invokevirtual #151                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      43: invokespecial #154                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      46: athrow
      47: fload_1
      48: ldc           #110                // float 0.5f
      50: fadd
      51: f2i
      52: i2f
      53: fstore_1
      54: aload_0
      55: getfield      #112                // Field h:F
      58: fload_1
      59: fcmpl
      60: ifne          64
      63: return
      64: aload_0
      65: fload_1
      66: putfield      #112                // Field h:F
      69: aload_0
      70: iconst_1
      71: putfield      #55                 // Field n:Z
      74: aload_0
      75: invokevirtual #168                // Method invalidateSelf:()V
      78: return

  void a(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #97                 // Method b:(Landroid/content/res/ColorStateList;)V
       5: aload_0
       6: invokevirtual #168                // Method invalidateSelf:()V
       9: return

  void a(android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #320                // Method getPadding:(Landroid/graphics/Rect;)Z
       5: pop
       6: return

  void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #57                 // Field q:Z
       5: aload_0
       6: invokevirtual #168                // Method invalidateSelf:()V
       9: return

  float b();
    Code:
       0: aload_0
       1: getfield      #161                // Field l:F
       4: freturn

  void b(float);
    Code:
       0: aload_0
       1: fload_1
       2: aload_0
       3: getfield      #163                // Field j:F
       6: invokespecial #129                // Method a:(FF)V
       9: return

  float c();
    Code:
       0: aload_0
       1: getfield      #163                // Field j:F
       4: freturn

  void c(float);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #161                // Field l:F
       5: fload_1
       6: invokespecial #129                // Method a:(FF)V
       9: return

  float d();
    Code:
       0: aload_0
       1: getfield      #163                // Field j:F
       4: aload_0
       5: getfield      #112                // Field h:F
       8: aload_0
       9: getfield      #87                 // Field c:I
      12: i2f
      13: fadd
      14: aload_0
      15: getfield      #163                // Field j:F
      18: fconst_2
      19: fdiv
      20: fadd
      21: invokestatic  #324                // Method java/lang/Math.max:(FF)F
      24: fconst_2
      25: fmul
      26: aload_0
      27: getfield      #163                // Field j:F
      30: aload_0
      31: getfield      #87                 // Field c:I
      34: i2f
      35: fadd
      36: fconst_2
      37: fmul
      38: fadd
      39: freturn

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #55                 // Field n:Z
       4: ifeq          20
       7: aload_0
       8: aload_0
       9: invokevirtual #329                // Method getBounds:()Landroid/graphics/Rect;
      12: invokespecial #331                // Method b:(Landroid/graphics/Rect;)V
      15: aload_0
      16: iconst_0
      17: putfield      #55                 // Field n:Z
      20: aload_1
      21: fconst_0
      22: aload_0
      23: getfield      #161                // Field l:F
      26: fconst_2
      27: fdiv
      28: invokevirtual #191                // Method android/graphics/Canvas.translate:(FF)V
      31: aload_0
      32: aload_1
      33: invokespecial #333                // Method a:(Landroid/graphics/Canvas;)V
      36: aload_1
      37: fconst_0
      38: aload_0
      39: getfield      #161                // Field l:F
      42: fneg
      43: fconst_2
      44: fdiv
      45: invokevirtual #191                // Method android/graphics/Canvas.translate:(FF)V
      48: getstatic     #335                // Field a:Landroid/support/v7/widget/be$a;
      51: aload_1
      52: aload_0
      53: getfield      #117                // Field g:Landroid/graphics/RectF;
      56: aload_0
      57: getfield      #112                // Field h:F
      60: aload_0
      61: getfield      #94                 // Field d:Landroid/graphics/Paint;
      64: invokeinterface #338,  5          // InterfaceMethod android/support/v7/widget/be$a.a:(Landroid/graphics/Canvas;Landroid/graphics/RectF;FLandroid/graphics/Paint;)V
      69: return

  float e();
    Code:
       0: aload_0
       1: getfield      #163                // Field j:F
       4: aload_0
       5: getfield      #112                // Field h:F
       8: aload_0
       9: getfield      #87                 // Field c:I
      12: i2f
      13: fadd
      14: aload_0
      15: getfield      #163                // Field j:F
      18: ldc           #131                // float 1.5f
      20: fmul
      21: fconst_2
      22: fdiv
      23: fadd
      24: invokestatic  #324                // Method java/lang/Math.max:(FF)F
      27: fconst_2
      28: fmul
      29: aload_0
      30: getfield      #163                // Field j:F
      33: ldc           #131                // float 1.5f
      35: fmul
      36: aload_0
      37: getfield      #87                 // Field c:I
      40: i2f
      41: fadd
      42: fconst_2
      43: fmul
      44: fadd
      45: freturn

  android.content.res.ColorStateList f();
    Code:
       0: aload_0
       1: getfield      #225                // Field m:Landroid/content/res/ColorStateList;
       4: areturn

  public int getOpacity();
    Code:
       0: bipush        -3
       2: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #163                // Field j:F
       4: aload_0
       5: getfield      #112                // Field h:F
       8: aload_0
       9: getfield      #57                 // Field q:Z
      12: invokestatic  #342                // Method a:(FFZ)F
      15: f2d
      16: invokestatic  #345                // Method java/lang/Math.ceil:(D)D
      19: d2i
      20: istore_2
      21: aload_0
      22: getfield      #163                // Field j:F
      25: aload_0
      26: getfield      #112                // Field h:F
      29: aload_0
      30: getfield      #57                 // Field q:Z
      33: invokestatic  #347                // Method b:(FFZ)F
      36: f2d
      37: invokestatic  #345                // Method java/lang/Math.ceil:(D)D
      40: d2i
      41: istore_3
      42: aload_1
      43: iload_3
      44: iload_2
      45: iload_3
      46: iload_2
      47: invokevirtual #350                // Method android/graphics/Rect.set:(IIII)V
      50: iconst_1
      51: ireturn

  public boolean isStateful();
    Code:
       0: aload_0
       1: getfield      #225                // Field m:Landroid/content/res/ColorStateList;
       4: ifnull        17
       7: aload_0
       8: getfield      #225                // Field m:Landroid/content/res/ColorStateList;
      11: invokevirtual #354                // Method android/content/res/ColorStateList.isStateful:()Z
      14: ifne          24
      17: aload_0
      18: invokespecial #355                // Method android/graphics/drawable/Drawable.isStateful:()Z
      21: ifeq          26
      24: iconst_1
      25: ireturn
      26: iconst_0
      27: ireturn

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #358                // Method android/graphics/drawable/Drawable.onBoundsChange:(Landroid/graphics/Rect;)V
       5: aload_0
       6: iconst_1
       7: putfield      #55                 // Field n:Z
      10: return

  protected boolean onStateChange(int[]);
    Code:
       0: aload_0
       1: getfield      #225                // Field m:Landroid/content/res/ColorStateList;
       4: aload_1
       5: aload_0
       6: getfield      #225                // Field m:Landroid/content/res/ColorStateList;
       9: invokevirtual #232                // Method android/content/res/ColorStateList.getDefaultColor:()I
      12: invokevirtual #236                // Method android/content/res/ColorStateList.getColorForState:([II)I
      15: istore_2
      16: aload_0
      17: getfield      #94                 // Field d:Landroid/graphics/Paint;
      20: invokevirtual #362                // Method android/graphics/Paint.getColor:()I
      23: iload_2
      24: if_icmpne     29
      27: iconst_0
      28: ireturn
      29: aload_0
      30: getfield      #94                 // Field d:Landroid/graphics/Paint;
      33: iload_2
      34: invokevirtual #239                // Method android/graphics/Paint.setColor:(I)V
      37: aload_0
      38: iconst_1
      39: putfield      #55                 // Field n:Z
      42: aload_0
      43: invokevirtual #168                // Method invalidateSelf:()V
      46: iconst_1
      47: ireturn

  public void setAlpha(int);
    Code:
       0: aload_0
       1: getfield      #94                 // Field d:Landroid/graphics/Paint;
       4: iload_1
       5: invokevirtual #365                // Method android/graphics/Paint.setAlpha:(I)V
       8: aload_0
       9: getfield      #99                 // Field e:Landroid/graphics/Paint;
      12: iload_1
      13: invokevirtual #365                // Method android/graphics/Paint.setAlpha:(I)V
      16: aload_0
      17: getfield      #122                // Field f:Landroid/graphics/Paint;
      20: iload_1
      21: invokevirtual #365                // Method android/graphics/Paint.setAlpha:(I)V
      24: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: getfield      #94                 // Field d:Landroid/graphics/Paint;
       4: aload_1
       5: invokevirtual #370                // Method android/graphics/Paint.setColorFilter:(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
       8: pop
       9: return
}
