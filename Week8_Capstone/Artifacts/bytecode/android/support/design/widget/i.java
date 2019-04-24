class android.support.design.widget.i extends android.support.v7.d.a.a {
  static final double a;

  final android.graphics.Paint b;

  final android.graphics.Paint c;

  final android.graphics.RectF d;

  float e;

  android.graphics.Path f;

  float g;

  float h;

  float i;

  float j;

  static {};
    Code:
       0: ldc2_w        #31                 // double 45.0d
       3: invokestatic  #38                 // Method java/lang/Math.toRadians:(D)D
       6: invokestatic  #41                 // Method java/lang/Math.cos:(D)D
       9: putstatic     #43                 // Field a:D
      12: return

  public android.support.design.widget.i(android.content.Context, android.graphics.drawable.Drawable, float, float, float);
    Code:
       0: aload_0
       1: aload_2
       2: invokespecial #49                 // Method android/support/v7/d/a/a."<init>":(Landroid/graphics/drawable/Drawable;)V
       5: aload_0
       6: iconst_1
       7: putfield      #51                 // Field k:Z
      10: aload_0
      11: iconst_1
      12: putfield      #53                 // Field o:Z
      15: aload_0
      16: iconst_0
      17: putfield      #55                 // Field q:Z
      20: aload_0
      21: aload_1
      22: getstatic     #60                 // Field android/support/design/a$c.design_fab_shadow_start_color:I
      25: invokestatic  #65                 // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      28: putfield      #67                 // Field l:I
      31: aload_0
      32: aload_1
      33: getstatic     #70                 // Field android/support/design/a$c.design_fab_shadow_mid_color:I
      36: invokestatic  #65                 // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      39: putfield      #72                 // Field m:I
      42: aload_0
      43: aload_1
      44: getstatic     #75                 // Field android/support/design/a$c.design_fab_shadow_end_color:I
      47: invokestatic  #65                 // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      50: putfield      #77                 // Field n:I
      53: aload_0
      54: new           #79                 // class android/graphics/Paint
      57: dup
      58: iconst_5
      59: invokespecial #82                 // Method android/graphics/Paint."<init>":(I)V
      62: putfield      #84                 // Field b:Landroid/graphics/Paint;
      65: aload_0
      66: getfield      #84                 // Field b:Landroid/graphics/Paint;
      69: getstatic     #90                 // Field android/graphics/Paint$Style.FILL:Landroid/graphics/Paint$Style;
      72: invokevirtual #94                 // Method android/graphics/Paint.setStyle:(Landroid/graphics/Paint$Style;)V
      75: aload_0
      76: fload_3
      77: invokestatic  #98                 // Method java/lang/Math.round:(F)I
      80: i2f
      81: putfield      #100                // Field e:F
      84: aload_0
      85: new           #102                // class android/graphics/RectF
      88: dup
      89: invokespecial #104                // Method android/graphics/RectF."<init>":()V
      92: putfield      #106                // Field d:Landroid/graphics/RectF;
      95: aload_0
      96: new           #79                 // class android/graphics/Paint
      99: dup
     100: aload_0
     101: getfield      #84                 // Field b:Landroid/graphics/Paint;
     104: invokespecial #109                // Method android/graphics/Paint."<init>":(Landroid/graphics/Paint;)V
     107: putfield      #111                // Field c:Landroid/graphics/Paint;
     110: aload_0
     111: getfield      #111                // Field c:Landroid/graphics/Paint;
     114: iconst_0
     115: invokevirtual #115                // Method android/graphics/Paint.setAntiAlias:(Z)V
     118: aload_0
     119: fload         4
     121: fload         5
     123: invokevirtual #118                // Method a:(FF)V
     126: return

  public static float a(float, float, boolean);
    Code:
       0: iload_2
       1: ifeq          20
       4: fload_0
       5: ldc           #120                // float 1.5f
       7: fmul
       8: f2d
       9: dconst_1
      10: getstatic     #43                 // Field a:D
      13: dsub
      14: fload_1
      15: f2d
      16: dmul
      17: dadd
      18: d2f
      19: freturn
      20: fload_0
      21: ldc           #120                // float 1.5f
      23: fmul
      24: freturn

  public static float b(float, float, boolean);
    Code:
       0: fload_0
       1: fstore_3
       2: iload_2
       3: ifeq          19
       6: fload_0
       7: f2d
       8: dconst_1
       9: getstatic     #43                 // Field a:D
      12: dsub
      13: fload_1
      14: f2d
      15: dmul
      16: dadd
      17: d2f
      18: fstore_3
      19: fload_3
      20: freturn

  public float a();
    Code:
       0: aload_0
       1: getfield      #150                // Field j:F
       4: freturn

  final void a(float);
    Code:
       0: aload_0
       1: getfield      #129                // Field p:F
       4: fload_1
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #129                // Field p:F
      14: aload_0
      15: invokevirtual #278                // Method invalidateSelf:()V
      18: return

  void a(float, float);
    Code:
       0: fload_1
       1: fconst_0
       2: fcmpg
       3: iflt          105
       6: fload_2
       7: fconst_0
       8: fcmpg
       9: ifge          15
      12: goto          105
      15: fload_1
      16: invokestatic  #280                // Method c:(F)I
      19: i2f
      20: fstore_3
      21: fload_2
      22: invokestatic  #280                // Method c:(F)I
      25: i2f
      26: fstore_2
      27: fload_3
      28: fstore_1
      29: fload_3
      30: fload_2
      31: fcmpl
      32: ifle          49
      35: aload_0
      36: getfield      #55                 // Field q:Z
      39: ifne          47
      42: aload_0
      43: iconst_1
      44: putfield      #55                 // Field q:Z
      47: fload_2
      48: fstore_1
      49: aload_0
      50: getfield      #150                // Field j:F
      53: fload_1
      54: fcmpl
      55: ifne          68
      58: aload_0
      59: getfield      #192                // Field h:F
      62: fload_2
      63: fcmpl
      64: ifne          68
      67: return
      68: aload_0
      69: fload_1
      70: putfield      #150                // Field j:F
      73: aload_0
      74: fload_2
      75: putfield      #192                // Field h:F
      78: aload_0
      79: fload_1
      80: ldc           #120                // float 1.5f
      82: fmul
      83: invokestatic  #98                 // Method java/lang/Math.round:(F)I
      86: i2f
      87: putfield      #142                // Field i:F
      90: aload_0
      91: fload_2
      92: putfield      #282                // Field g:F
      95: aload_0
      96: iconst_1
      97: putfield      #51                 // Field k:Z
     100: aload_0
     101: invokevirtual #278                // Method invalidateSelf:()V
     104: return
     105: new           #284                // class java/lang/IllegalArgumentException
     108: dup
     109: ldc_w         #286                // String invalid shadow size
     112: invokespecial #289                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     115: athrow

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #53                 // Field o:Z
       5: aload_0
       6: invokevirtual #278                // Method invalidateSelf:()V
       9: return

  public void b(float);
    Code:
       0: aload_0
       1: fload_1
       2: aload_0
       3: getfield      #192                // Field h:F
       6: invokevirtual #118                // Method a:(FF)V
       9: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #51                 // Field k:Z
       4: ifeq          20
       7: aload_0
       8: aload_0
       9: invokevirtual #294                // Method getBounds:()Landroid/graphics/Rect;
      12: invokespecial #296                // Method a:(Landroid/graphics/Rect;)V
      15: aload_0
      16: iconst_0
      17: putfield      #51                 // Field k:Z
      20: aload_0
      21: aload_1
      22: invokespecial #298                // Method a:(Landroid/graphics/Canvas;)V
      25: aload_0
      26: aload_1
      27: invokespecial #300                // Method android/support/v7/d/a/a.draw:(Landroid/graphics/Canvas;)V
      30: return

  public int getOpacity();
    Code:
       0: bipush        -3
       2: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #192                // Field h:F
       4: aload_0
       5: getfield      #100                // Field e:F
       8: aload_0
       9: getfield      #53                 // Field o:Z
      12: invokestatic  #305                // Method a:(FFZ)F
      15: f2d
      16: invokestatic  #308                // Method java/lang/Math.ceil:(D)D
      19: d2i
      20: istore_2
      21: aload_0
      22: getfield      #192                // Field h:F
      25: aload_0
      26: getfield      #100                // Field e:F
      29: aload_0
      30: getfield      #53                 // Field o:Z
      33: invokestatic  #310                // Method b:(FFZ)F
      36: f2d
      37: invokestatic  #308                // Method java/lang/Math.ceil:(D)D
      40: d2i
      41: istore_3
      42: aload_1
      43: iload_3
      44: iload_2
      45: iload_3
      46: iload_2
      47: invokevirtual #312                // Method android/graphics/Rect.set:(IIII)V
      50: iconst_1
      51: ireturn

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #51                 // Field k:Z
       5: return

  public void setAlpha(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #316                // Method android/support/v7/d/a/a.setAlpha:(I)V
       5: aload_0
       6: getfield      #84                 // Field b:Landroid/graphics/Paint;
       9: iload_1
      10: invokevirtual #317                // Method android/graphics/Paint.setAlpha:(I)V
      13: aload_0
      14: getfield      #111                // Field c:Landroid/graphics/Paint;
      17: iload_1
      18: invokevirtual #317                // Method android/graphics/Paint.setAlpha:(I)V
      21: return
}
