class android.support.v4.b.a.d extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback,android.support.v4.b.a.b,android.support.v4.b.a.c {
  static final android.graphics.PorterDuff$Mode a;

  android.support.v4.b.a.d$a b;

  android.graphics.drawable.Drawable c;

  static {};
    Code:
       0: getstatic     #33                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
       3: putstatic     #35                 // Field a:Landroid/graphics/PorterDuff$Mode;
       6: return

  android.support.v4.b.a.d(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokespecial #40                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: aload_0
       5: aload_0
       6: invokevirtual #43                 // Method b:()Landroid/support/v4/b/a/d$a;
       9: putfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      12: aload_0
      13: aload_1
      14: invokevirtual #47                 // Method a:(Landroid/graphics/drawable/Drawable;)V
      17: return

  android.support.v4.b.a.d(android.support.v4.b.a.d$a, android.content.res.Resources);
    Code:
       0: aload_0
       1: invokespecial #40                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
       9: aload_0
      10: aload_2
      11: invokespecial #51                 // Method a:(Landroid/content/res/Resources;)V
      14: return

  public final android.graphics.drawable.Drawable a();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: areturn

  public final void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      11: aconst_null
      12: invokevirtual #99                 // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      15: aload_0
      16: aload_1
      17: putfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      20: aload_1
      21: ifnull        83
      24: aload_1
      25: aload_0
      26: invokevirtual #99                 // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      29: aload_0
      30: aload_1
      31: invokevirtual #102                // Method android/graphics/drawable/Drawable.isVisible:()Z
      34: iconst_1
      35: invokevirtual #106                // Method setVisible:(ZZ)Z
      38: pop
      39: aload_0
      40: aload_1
      41: invokevirtual #110                // Method android/graphics/drawable/Drawable.getState:()[I
      44: invokevirtual #113                // Method setState:([I)Z
      47: pop
      48: aload_0
      49: aload_1
      50: invokevirtual #116                // Method android/graphics/drawable/Drawable.getLevel:()I
      53: invokevirtual #120                // Method setLevel:(I)Z
      56: pop
      57: aload_0
      58: aload_1
      59: invokevirtual #124                // Method android/graphics/drawable/Drawable.getBounds:()Landroid/graphics/Rect;
      62: invokevirtual #128                // Method setBounds:(Landroid/graphics/Rect;)V
      65: aload_0
      66: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      69: ifnull        83
      72: aload_0
      73: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      76: aload_1
      77: invokevirtual #132                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      80: putfield      #54                 // Field android/support/v4/b/a/d$a.b:Landroid/graphics/drawable/Drawable$ConstantState;
      83: aload_0
      84: invokevirtual #135                // Method invalidateSelf:()V
      87: return

  android.support.v4.b.a.d$a b();
    Code:
       0: new           #15                 // class android/support/v4/b/a/d$b
       3: dup
       4: aload_0
       5: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
       8: aconst_null
       9: invokespecial #137                // Method android/support/v4/b/a/d$b."<init>":(Landroid/support/v4/b/a/d$a;Landroid/content/res/Resources;)V
      12: areturn

  protected boolean c();
    Code:
       0: iconst_1
       1: ireturn

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #141                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
       8: return

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: invokespecial #144                // Method android/graphics/drawable/Drawable.getChangingConfigurations:()I
       4: istore_2
       5: aload_0
       6: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
       9: ifnull        23
      12: aload_0
      13: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      16: invokevirtual #145                // Method android/support/v4/b/a/d$a.getChangingConfigurations:()I
      19: istore_1
      20: goto          25
      23: iconst_0
      24: istore_1
      25: iload_2
      26: iload_1
      27: ior
      28: aload_0
      29: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      32: invokevirtual #144                // Method android/graphics/drawable/Drawable.getChangingConfigurations:()I
      35: ior
      36: ireturn

  public android.graphics.drawable.Drawable$ConstantState getConstantState();
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
       4: ifnull        33
       7: aload_0
       8: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      11: invokevirtual #147                // Method android/support/v4/b/a/d$a.a:()Z
      14: ifeq          33
      17: aload_0
      18: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      21: aload_0
      22: invokevirtual #148                // Method getChangingConfigurations:()I
      25: putfield      #150                // Field android/support/v4/b/a/d$a.a:I
      28: aload_0
      29: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      32: areturn
      33: aconst_null
      34: areturn

  public android.graphics.drawable.Drawable getCurrent();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #153                // Method android/graphics/drawable/Drawable.getCurrent:()Landroid/graphics/drawable/Drawable;
       7: areturn

  public int getIntrinsicHeight();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #156                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
       7: ireturn

  public int getIntrinsicWidth();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #159                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
       7: ireturn

  public int getMinimumHeight();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #162                // Method android/graphics/drawable/Drawable.getMinimumHeight:()I
       7: ireturn

  public int getMinimumWidth();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #165                // Method android/graphics/drawable/Drawable.getMinimumWidth:()I
       7: ireturn

  public int getOpacity();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #168                // Method android/graphics/drawable/Drawable.getOpacity:()I
       7: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #172                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
       8: ireturn

  public int[] getState();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #110                // Method android/graphics/drawable/Drawable.getState:()[I
       7: areturn

  public android.graphics.Region getTransparentRegion();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #176                // Method android/graphics/drawable/Drawable.getTransparentRegion:()Landroid/graphics/Region;
       7: areturn

  public void invalidateDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokevirtual #135                // Method invalidateSelf:()V
       4: return

  public boolean isStateful();
    Code:
       0: aload_0
       1: invokevirtual #64                 // Method c:()Z
       4: ifeq          25
       7: aload_0
       8: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      11: ifnull        25
      14: aload_0
      15: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      18: getfield      #67                 // Field android/support/v4/b/a/d$a.c:Landroid/content/res/ColorStateList;
      21: astore_1
      22: goto          27
      25: aconst_null
      26: astore_1
      27: aload_1
      28: ifnull        38
      31: aload_1
      32: invokevirtual #180                // Method android/content/res/ColorStateList.isStateful:()Z
      35: ifne          48
      38: aload_0
      39: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      42: invokevirtual #181                // Method android/graphics/drawable/Drawable.isStateful:()Z
      45: ifeq          50
      48: iconst_1
      49: ireturn
      50: iconst_0
      51: ireturn

  public void jumpToCurrentState();
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #184                // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
       7: return

  public android.graphics.drawable.Drawable mutate();
    Code:
       0: aload_0
       1: getfield      #187                // Field g:Z
       4: ifne          80
       7: aload_0
       8: invokespecial #189                // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      11: aload_0
      12: if_acmpne     80
      15: aload_0
      16: aload_0
      17: invokevirtual #43                 // Method b:()Landroid/support/v4/b/a/d$a;
      20: putfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      23: aload_0
      24: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      27: ifnull        38
      30: aload_0
      31: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      34: invokevirtual #189                // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      37: pop
      38: aload_0
      39: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      42: ifnull        75
      45: aload_0
      46: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
      49: astore_2
      50: aload_0
      51: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      54: ifnull        68
      57: aload_0
      58: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      61: invokevirtual #132                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      64: astore_1
      65: goto          70
      68: aconst_null
      69: astore_1
      70: aload_2
      71: aload_1
      72: putfield      #54                 // Field android/support/v4/b/a/d$a.b:Landroid/graphics/drawable/Drawable$ConstantState;
      75: aload_0
      76: iconst_1
      77: putfield      #187                // Field g:Z
      80: aload_0
      81: areturn

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #191                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
      15: return

  protected boolean onLevelChange(int);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #193                // Method android/graphics/drawable/Drawable.setLevel:(I)Z
       8: ireturn

  public void scheduleDrawable(android.graphics.drawable.Drawable, java.lang.Runnable, long);
    Code:
       0: aload_0
       1: aload_2
       2: lload_3
       3: invokevirtual #199                // Method scheduleSelf:(Ljava/lang/Runnable;J)V
       6: return

  public void setAlpha(int);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #203                // Method android/graphics/drawable/Drawable.setAlpha:(I)V
       8: return

  public void setChangingConfigurations(int);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #206                // Method android/graphics/drawable/Drawable.setChangingConfigurations:(I)V
       8: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #209                // Method android/graphics/drawable/Drawable.setColorFilter:(Landroid/graphics/ColorFilter;)V
       8: return

  public void setDither(boolean);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #213                // Method android/graphics/drawable/Drawable.setDither:(Z)V
       8: return

  public void setFilterBitmap(boolean);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #216                // Method android/graphics/drawable/Drawable.setFilterBitmap:(Z)V
       8: return

  public boolean setState(int[]);
    Code:
       0: aload_0
       1: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #217                // Method android/graphics/drawable/Drawable.setState:([I)Z
       8: istore_2
       9: aload_0
      10: aload_1
      11: invokespecial #219                // Method a:([I)Z
      14: ifne          26
      17: iload_2
      18: ifeq          24
      21: goto          26
      24: iconst_0
      25: ireturn
      26: iconst_1
      27: ireturn

  public void setTint(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #224                // Method android/content/res/ColorStateList.valueOf:(I)Landroid/content/res/ColorStateList;
       5: invokevirtual #228                // Method setTintList:(Landroid/content/res/ColorStateList;)V
       8: return

  public void setTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
       4: aload_1
       5: putfield      #67                 // Field android/support/v4/b/a/d$a.c:Landroid/content/res/ColorStateList;
       8: aload_0
       9: aload_0
      10: invokevirtual #229                // Method getState:()[I
      13: invokespecial #219                // Method a:([I)Z
      16: pop
      17: return

  public void setTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Landroid/support/v4/b/a/d$a;
       4: aload_1
       5: putfield      #69                 // Field android/support/v4/b/a/d$a.d:Landroid/graphics/PorterDuff$Mode;
       8: aload_0
       9: aload_0
      10: invokevirtual #229                // Method getState:()[I
      13: invokespecial #219                // Method a:([I)Z
      16: pop
      17: return

  public boolean setVisible(boolean, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #232                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
       6: ifne          26
       9: aload_0
      10: getfield      #95                 // Field c:Landroid/graphics/drawable/Drawable;
      13: iload_1
      14: iload_2
      15: invokevirtual #232                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
      18: ifeq          24
      21: goto          26
      24: iconst_0
      25: ireturn
      26: iconst_1
      27: ireturn

  public void unscheduleDrawable(android.graphics.drawable.Drawable, java.lang.Runnable);
    Code:
       0: aload_0
       1: aload_2
       2: invokevirtual #238                // Method unscheduleSelf:(Ljava/lang/Runnable;)V
       5: return
}
