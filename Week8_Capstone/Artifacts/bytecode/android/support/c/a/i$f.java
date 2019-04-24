class android.support.c.a.i$f extends android.graphics.drawable.Drawable$ConstantState {
  int a;

  android.support.c.a.i$e b;

  android.content.res.ColorStateList c;

  android.graphics.PorterDuff$Mode d;

  boolean e;

  android.graphics.Bitmap f;

  android.content.res.ColorStateList g;

  android.graphics.PorterDuff$Mode h;

  int i;

  boolean j;

  boolean k;

  android.graphics.Paint l;

  public android.support.c.a.i$f();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method android/graphics/drawable/Drawable$ConstantState."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #31                 // Field c:Landroid/content/res/ColorStateList;
       9: aload_0
      10: getstatic     #33                 // Field android/support/c/a/i.a:Landroid/graphics/PorterDuff$Mode;
      13: putfield      #35                 // Field d:Landroid/graphics/PorterDuff$Mode;
      16: aload_0
      17: new           #37                 // class android/support/c/a/i$e
      20: dup
      21: invokespecial #38                 // Method android/support/c/a/i$e."<init>":()V
      24: putfield      #40                 // Field b:Landroid/support/c/a/i$e;
      27: return

  public android.support.c.a.i$f(android.support.c.a.i$f);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method android/graphics/drawable/Drawable$ConstantState."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #31                 // Field c:Landroid/content/res/ColorStateList;
       9: aload_0
      10: getstatic     #33                 // Field android/support/c/a/i.a:Landroid/graphics/PorterDuff$Mode;
      13: putfield      #35                 // Field d:Landroid/graphics/PorterDuff$Mode;
      16: aload_1
      17: ifnull        131
      20: aload_0
      21: aload_1
      22: getfield      #44                 // Field a:I
      25: putfield      #44                 // Field a:I
      28: aload_0
      29: new           #37                 // class android/support/c/a/i$e
      32: dup
      33: aload_1
      34: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      37: invokespecial #47                 // Method android/support/c/a/i$e."<init>":(Landroid/support/c/a/i$e;)V
      40: putfield      #40                 // Field b:Landroid/support/c/a/i$e;
      43: aload_1
      44: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      47: invokestatic  #50                 // Method android/support/c/a/i$e.a:(Landroid/support/c/a/i$e;)Landroid/graphics/Paint;
      50: ifnull        75
      53: aload_0
      54: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      57: new           #52                 // class android/graphics/Paint
      60: dup
      61: aload_1
      62: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      65: invokestatic  #50                 // Method android/support/c/a/i$e.a:(Landroid/support/c/a/i$e;)Landroid/graphics/Paint;
      68: invokespecial #55                 // Method android/graphics/Paint."<init>":(Landroid/graphics/Paint;)V
      71: invokestatic  #58                 // Method android/support/c/a/i$e.a:(Landroid/support/c/a/i$e;Landroid/graphics/Paint;)Landroid/graphics/Paint;
      74: pop
      75: aload_1
      76: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      79: invokestatic  #60                 // Method android/support/c/a/i$e.b:(Landroid/support/c/a/i$e;)Landroid/graphics/Paint;
      82: ifnull        107
      85: aload_0
      86: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      89: new           #52                 // class android/graphics/Paint
      92: dup
      93: aload_1
      94: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      97: invokestatic  #60                 // Method android/support/c/a/i$e.b:(Landroid/support/c/a/i$e;)Landroid/graphics/Paint;
     100: invokespecial #55                 // Method android/graphics/Paint."<init>":(Landroid/graphics/Paint;)V
     103: invokestatic  #62                 // Method android/support/c/a/i$e.b:(Landroid/support/c/a/i$e;Landroid/graphics/Paint;)Landroid/graphics/Paint;
     106: pop
     107: aload_0
     108: aload_1
     109: getfield      #31                 // Field c:Landroid/content/res/ColorStateList;
     112: putfield      #31                 // Field c:Landroid/content/res/ColorStateList;
     115: aload_0
     116: aload_1
     117: getfield      #35                 // Field d:Landroid/graphics/PorterDuff$Mode;
     120: putfield      #35                 // Field d:Landroid/graphics/PorterDuff$Mode;
     123: aload_0
     124: aload_1
     125: getfield      #64                 // Field e:Z
     128: putfield      #64                 // Field e:Z
     131: return

  public android.graphics.Paint a(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: invokevirtual #68                 // Method a:()Z
       4: ifne          13
       7: aload_1
       8: ifnonnull     13
      11: aconst_null
      12: areturn
      13: aload_0
      14: getfield      #70                 // Field l:Landroid/graphics/Paint;
      17: ifnonnull     39
      20: aload_0
      21: new           #52                 // class android/graphics/Paint
      24: dup
      25: invokespecial #71                 // Method android/graphics/Paint."<init>":()V
      28: putfield      #70                 // Field l:Landroid/graphics/Paint;
      31: aload_0
      32: getfield      #70                 // Field l:Landroid/graphics/Paint;
      35: iconst_1
      36: invokevirtual #75                 // Method android/graphics/Paint.setFilterBitmap:(Z)V
      39: aload_0
      40: getfield      #70                 // Field l:Landroid/graphics/Paint;
      43: aload_0
      44: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      47: invokevirtual #79                 // Method android/support/c/a/i$e.getRootAlpha:()I
      50: invokevirtual #83                 // Method android/graphics/Paint.setAlpha:(I)V
      53: aload_0
      54: getfield      #70                 // Field l:Landroid/graphics/Paint;
      57: aload_1
      58: invokevirtual #87                 // Method android/graphics/Paint.setColorFilter:(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
      61: pop
      62: aload_0
      63: getfield      #70                 // Field l:Landroid/graphics/Paint;
      66: areturn

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #90                 // Field f:Landroid/graphics/Bitmap;
       4: iconst_0
       5: invokevirtual #95                 // Method android/graphics/Bitmap.eraseColor:(I)V
       8: new           #97                 // class android/graphics/Canvas
      11: dup
      12: aload_0
      13: getfield      #90                 // Field f:Landroid/graphics/Bitmap;
      16: invokespecial #100                // Method android/graphics/Canvas."<init>":(Landroid/graphics/Bitmap;)V
      19: astore_3
      20: aload_0
      21: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      24: aload_3
      25: iload_1
      26: iload_2
      27: aconst_null
      28: invokevirtual #103                // Method android/support/c/a/i$e.a:(Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
      31: return

  public void a(android.graphics.Canvas, android.graphics.ColorFilter, android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_2
       2: invokevirtual #106                // Method a:(Landroid/graphics/ColorFilter;)Landroid/graphics/Paint;
       5: astore_2
       6: aload_1
       7: aload_0
       8: getfield      #90                 // Field f:Landroid/graphics/Bitmap;
      11: aconst_null
      12: aload_3
      13: aload_2
      14: invokevirtual #110                // Method android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
      17: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
       4: invokevirtual #79                 // Method android/support/c/a/i$e.getRootAlpha:()I
       7: sipush        255
      10: if_icmpge     15
      13: iconst_1
      14: ireturn
      15: iconst_0
      16: ireturn

  public void b(int, int);
    Code:
       0: aload_0
       1: getfield      #90                 // Field f:Landroid/graphics/Bitmap;
       4: ifnull        16
       7: aload_0
       8: iload_1
       9: iload_2
      10: invokevirtual #113                // Method c:(II)Z
      13: ifne          33
      16: aload_0
      17: iload_1
      18: iload_2
      19: getstatic     #119                // Field android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
      22: invokestatic  #123                // Method android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
      25: putfield      #90                 // Field f:Landroid/graphics/Bitmap;
      28: aload_0
      29: iconst_1
      30: putfield      #125                // Field k:Z
      33: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #125                // Field k:Z
       4: ifne          56
       7: aload_0
       8: getfield      #127                // Field g:Landroid/content/res/ColorStateList;
      11: aload_0
      12: getfield      #31                 // Field c:Landroid/content/res/ColorStateList;
      15: if_acmpne     56
      18: aload_0
      19: getfield      #129                // Field h:Landroid/graphics/PorterDuff$Mode;
      22: aload_0
      23: getfield      #35                 // Field d:Landroid/graphics/PorterDuff$Mode;
      26: if_acmpne     56
      29: aload_0
      30: getfield      #131                // Field j:Z
      33: aload_0
      34: getfield      #64                 // Field e:Z
      37: if_icmpne     56
      40: aload_0
      41: getfield      #133                // Field i:I
      44: aload_0
      45: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      48: invokevirtual #79                 // Method android/support/c/a/i$e.getRootAlpha:()I
      51: if_icmpne     56
      54: iconst_1
      55: ireturn
      56: iconst_0
      57: ireturn

  public void c();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #31                 // Field c:Landroid/content/res/ColorStateList;
       5: putfield      #127                // Field g:Landroid/content/res/ColorStateList;
       8: aload_0
       9: aload_0
      10: getfield      #35                 // Field d:Landroid/graphics/PorterDuff$Mode;
      13: putfield      #129                // Field h:Landroid/graphics/PorterDuff$Mode;
      16: aload_0
      17: aload_0
      18: getfield      #40                 // Field b:Landroid/support/c/a/i$e;
      21: invokevirtual #79                 // Method android/support/c/a/i$e.getRootAlpha:()I
      24: putfield      #133                // Field i:I
      27: aload_0
      28: aload_0
      29: getfield      #64                 // Field e:Z
      32: putfield      #131                // Field j:Z
      35: aload_0
      36: iconst_0
      37: putfield      #125                // Field k:Z
      40: return

  public boolean c(int, int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #90                 // Field f:Landroid/graphics/Bitmap;
       5: invokevirtual #136                // Method android/graphics/Bitmap.getWidth:()I
       8: if_icmpne     24
      11: iload_2
      12: aload_0
      13: getfield      #90                 // Field f:Landroid/graphics/Bitmap;
      16: invokevirtual #139                // Method android/graphics/Bitmap.getHeight:()I
      19: if_icmpne     24
      22: iconst_1
      23: ireturn
      24: iconst_0
      25: ireturn

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: getfield      #44                 // Field a:I
       4: ireturn

  public android.graphics.drawable.Drawable newDrawable();
    Code:
       0: new           #6                  // class android/support/c/a/i
       3: dup
       4: aload_0
       5: invokespecial #144                // Method android/support/c/a/i."<init>":(Landroid/support/c/a/i$f;)V
       8: areturn

  public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources);
    Code:
       0: new           #6                  // class android/support/c/a/i
       3: dup
       4: aload_0
       5: invokespecial #144                // Method android/support/c/a/i."<init>":(Landroid/support/c/a/i$f;)V
       8: areturn
}
