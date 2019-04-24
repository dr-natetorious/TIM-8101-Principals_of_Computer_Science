class android.support.design.widget.c extends android.graphics.drawable.Drawable {
  final android.graphics.Paint a;

  final android.graphics.Rect b;

  final android.graphics.RectF c;

  float d;

  public android.support.design.widget.c();
    Code:
       0: aload_0
       1: invokespecial #27                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: aload_0
       5: new           #29                 // class android/graphics/Rect
       8: dup
       9: invokespecial #30                 // Method android/graphics/Rect."<init>":()V
      12: putfield      #32                 // Field b:Landroid/graphics/Rect;
      15: aload_0
      16: new           #34                 // class android/graphics/RectF
      19: dup
      20: invokespecial #35                 // Method android/graphics/RectF."<init>":()V
      23: putfield      #37                 // Field c:Landroid/graphics/RectF;
      26: aload_0
      27: iconst_1
      28: putfield      #39                 // Field k:Z
      31: aload_0
      32: new           #41                 // class android/graphics/Paint
      35: dup
      36: iconst_1
      37: invokespecial #44                 // Method android/graphics/Paint."<init>":(I)V
      40: putfield      #46                 // Field a:Landroid/graphics/Paint;
      43: aload_0
      44: getfield      #46                 // Field a:Landroid/graphics/Paint;
      47: getstatic     #52                 // Field android/graphics/Paint$Style.STROKE:Landroid/graphics/Paint$Style;
      50: invokevirtual #56                 // Method android/graphics/Paint.setStyle:(Landroid/graphics/Paint$Style;)V
      53: return

  void a(float);
    Code:
       0: aload_0
       1: getfield      #64                 // Field d:F
       4: fload_1
       5: fcmpl
       6: ifeq          34
       9: aload_0
      10: fload_1
      11: putfield      #64                 // Field d:F
      14: aload_0
      15: getfield      #46                 // Field a:Landroid/graphics/Paint;
      18: fload_1
      19: ldc           #105                // float 1.3333f
      21: fmul
      22: invokevirtual #108                // Method android/graphics/Paint.setStrokeWidth:(F)V
      25: aload_0
      26: iconst_1
      27: putfield      #39                 // Field k:Z
      30: aload_0
      31: invokevirtual #111                // Method invalidateSelf:()V
      34: return

  void a(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #70                 // Field e:I
       5: aload_0
       6: iload_2
       7: putfield      #79                 // Field f:I
      10: aload_0
      11: iload_3
      12: putfield      #85                 // Field g:I
      15: aload_0
      16: iload         4
      18: putfield      #83                 // Field h:I
      21: return

  void a(android.content.res.ColorStateList);
    Code:
       0: aload_1
       1: ifnull        20
       4: aload_0
       5: aload_1
       6: aload_0
       7: invokevirtual #117                // Method getState:()[I
      10: aload_0
      11: getfield      #72                 // Field j:I
      14: invokevirtual #123                // Method android/content/res/ColorStateList.getColorForState:([II)I
      17: putfield      #72                 // Field j:I
      20: aload_0
      21: aload_1
      22: putfield      #125                // Field i:Landroid/content/res/ColorStateList;
      25: aload_0
      26: iconst_1
      27: putfield      #39                 // Field k:Z
      30: aload_0
      31: invokevirtual #111                // Method invalidateSelf:()V
      34: return

  final void b(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #127                // Field l:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #127                // Field l:F
      14: aload_0
      15: invokevirtual #111                // Method invalidateSelf:()V
      18: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #39                 // Field k:Z
       4: ifeq          24
       7: aload_0
       8: getfield      #46                 // Field a:Landroid/graphics/Paint;
      11: aload_0
      12: invokespecial #131                // Method a:()Landroid/graphics/Shader;
      15: invokevirtual #135                // Method android/graphics/Paint.setShader:(Landroid/graphics/Shader;)Landroid/graphics/Shader;
      18: pop
      19: aload_0
      20: iconst_0
      21: putfield      #39                 // Field k:Z
      24: aload_0
      25: getfield      #46                 // Field a:Landroid/graphics/Paint;
      28: invokevirtual #139                // Method android/graphics/Paint.getStrokeWidth:()F
      31: fconst_2
      32: fdiv
      33: fstore_2
      34: aload_0
      35: getfield      #37                 // Field c:Landroid/graphics/RectF;
      38: astore_3
      39: aload_0
      40: aload_0
      41: getfield      #32                 // Field b:Landroid/graphics/Rect;
      44: invokevirtual #62                 // Method copyBounds:(Landroid/graphics/Rect;)V
      47: aload_3
      48: aload_0
      49: getfield      #32                 // Field b:Landroid/graphics/Rect;
      52: invokevirtual #142                // Method android/graphics/RectF.set:(Landroid/graphics/Rect;)V
      55: aload_3
      56: aload_3
      57: getfield      #145                // Field android/graphics/RectF.left:F
      60: fload_2
      61: fadd
      62: putfield      #145                // Field android/graphics/RectF.left:F
      65: aload_3
      66: aload_3
      67: getfield      #147                // Field android/graphics/RectF.top:F
      70: fload_2
      71: fadd
      72: putfield      #147                // Field android/graphics/RectF.top:F
      75: aload_3
      76: aload_3
      77: getfield      #150                // Field android/graphics/RectF.right:F
      80: fload_2
      81: fsub
      82: putfield      #150                // Field android/graphics/RectF.right:F
      85: aload_3
      86: aload_3
      87: getfield      #152                // Field android/graphics/RectF.bottom:F
      90: fload_2
      91: fsub
      92: putfield      #152                // Field android/graphics/RectF.bottom:F
      95: aload_1
      96: invokevirtual #157                // Method android/graphics/Canvas.save:()I
      99: pop
     100: aload_1
     101: aload_0
     102: getfield      #127                // Field l:F
     105: aload_3
     106: invokevirtual #160                // Method android/graphics/RectF.centerX:()F
     109: aload_3
     110: invokevirtual #163                // Method android/graphics/RectF.centerY:()F
     113: invokevirtual #167                // Method android/graphics/Canvas.rotate:(FFF)V
     116: aload_1
     117: aload_3
     118: aload_0
     119: getfield      #46                 // Field a:Landroid/graphics/Paint;
     122: invokevirtual #171                // Method android/graphics/Canvas.drawOval:(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
     125: aload_1
     126: invokevirtual #174                // Method android/graphics/Canvas.restore:()V
     129: return

  public int getOpacity();
    Code:
       0: aload_0
       1: getfield      #64                 // Field d:F
       4: fconst_0
       5: fcmpl
       6: ifle          12
       9: bipush        -3
      11: ireturn
      12: bipush        -2
      14: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #64                 // Field d:F
       4: invokestatic  #183                // Method java/lang/Math.round:(F)I
       7: istore_2
       8: aload_1
       9: iload_2
      10: iload_2
      11: iload_2
      12: iload_2
      13: invokevirtual #185                // Method android/graphics/Rect.set:(IIII)V
      16: iconst_1
      17: ireturn

  public boolean isStateful();
    Code:
       0: aload_0
       1: getfield      #125                // Field i:Landroid/content/res/ColorStateList;
       4: ifnull        17
       7: aload_0
       8: getfield      #125                // Field i:Landroid/content/res/ColorStateList;
      11: invokevirtual #189                // Method android/content/res/ColorStateList.isStateful:()Z
      14: ifne          24
      17: aload_0
      18: invokespecial #190                // Method android/graphics/drawable/Drawable.isStateful:()Z
      21: ifeq          26
      24: iconst_1
      25: ireturn
      26: iconst_0
      27: ireturn

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #39                 // Field k:Z
       5: return

  protected boolean onStateChange(int[]);
    Code:
       0: aload_0
       1: getfield      #125                // Field i:Landroid/content/res/ColorStateList;
       4: ifnull        38
       7: aload_0
       8: getfield      #125                // Field i:Landroid/content/res/ColorStateList;
      11: aload_1
      12: aload_0
      13: getfield      #72                 // Field j:I
      16: invokevirtual #123                // Method android/content/res/ColorStateList.getColorForState:([II)I
      19: istore_2
      20: iload_2
      21: aload_0
      22: getfield      #72                 // Field j:I
      25: if_icmpeq     38
      28: aload_0
      29: iconst_1
      30: putfield      #39                 // Field k:Z
      33: aload_0
      34: iload_2
      35: putfield      #72                 // Field j:I
      38: aload_0
      39: getfield      #39                 // Field k:Z
      42: ifeq          49
      45: aload_0
      46: invokevirtual #111                // Method invalidateSelf:()V
      49: aload_0
      50: getfield      #39                 // Field k:Z
      53: ireturn

  public void setAlpha(int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Landroid/graphics/Paint;
       4: iload_1
       5: invokevirtual #196                // Method android/graphics/Paint.setAlpha:(I)V
       8: aload_0
       9: invokevirtual #111                // Method invalidateSelf:()V
      12: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Landroid/graphics/Paint;
       4: aload_1
       5: invokevirtual #201                // Method android/graphics/Paint.setColorFilter:(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
       8: pop
       9: aload_0
      10: invokevirtual #111                // Method invalidateSelf:()V
      13: return
}
