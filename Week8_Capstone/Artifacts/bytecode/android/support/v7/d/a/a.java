public class android.support.v7.d.a.a extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback {
  public android.support.v7.d.a.a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #15                 // Method a:(Landroid/graphics/drawable/Drawable;)V
       9: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
      11: aconst_null
      12: invokevirtual #22                 // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      15: aload_0
      16: aload_1
      17: putfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
      20: aload_1
      21: ifnull        29
      24: aload_1
      25: aload_0
      26: invokevirtual #22                 // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      29: return

  public android.graphics.drawable.Drawable b();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: areturn

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #28                 // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
       8: return

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #32                 // Method android/graphics/drawable/Drawable.getChangingConfigurations:()I
       7: ireturn

  public android.graphics.drawable.Drawable getCurrent();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #35                 // Method android/graphics/drawable/Drawable.getCurrent:()Landroid/graphics/drawable/Drawable;
       7: areturn

  public int getIntrinsicHeight();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #38                 // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
       7: ireturn

  public int getIntrinsicWidth();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #41                 // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
       7: ireturn

  public int getMinimumHeight();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #44                 // Method android/graphics/drawable/Drawable.getMinimumHeight:()I
       7: ireturn

  public int getMinimumWidth();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #47                 // Method android/graphics/drawable/Drawable.getMinimumWidth:()I
       7: ireturn

  public int getOpacity();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #50                 // Method android/graphics/drawable/Drawable.getOpacity:()I
       7: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #54                 // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
       8: ireturn

  public int[] getState();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #58                 // Method android/graphics/drawable/Drawable.getState:()[I
       7: areturn

  public android.graphics.Region getTransparentRegion();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #62                 // Method android/graphics/drawable/Drawable.getTransparentRegion:()Landroid/graphics/Region;
       7: areturn

  public void invalidateDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokevirtual #66                 // Method invalidateSelf:()V
       4: return

  public boolean isAutoMirrored();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokestatic  #73                 // Method android/support/v4/b/a/a.b:(Landroid/graphics/drawable/Drawable;)Z
       7: ireturn

  public boolean isStateful();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #76                 // Method android/graphics/drawable/Drawable.isStateful:()Z
       7: ireturn

  public void jumpToCurrentState();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: invokestatic  #78                 // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;)V
       7: return

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #83                 // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
       8: return

  protected boolean onLevelChange(int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #88                 // Method android/graphics/drawable/Drawable.setLevel:(I)Z
       8: ireturn

  public void scheduleDrawable(android.graphics.drawable.Drawable, java.lang.Runnable, long);
    Code:
       0: aload_0
       1: aload_2
       2: lload_3
       3: invokevirtual #94                 // Method scheduleSelf:(Ljava/lang/Runnable;J)V
       6: return

  public void setAlpha(int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #98                 // Method android/graphics/drawable/Drawable.setAlpha:(I)V
       8: return

  public void setAutoMirrored(boolean);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokestatic  #103                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Z)V
       8: return

  public void setChangingConfigurations(int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #106                // Method android/graphics/drawable/Drawable.setChangingConfigurations:(I)V
       8: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #110                // Method android/graphics/drawable/Drawable.setColorFilter:(Landroid/graphics/ColorFilter;)V
       8: return

  public void setDither(boolean);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #113                // Method android/graphics/drawable/Drawable.setDither:(Z)V
       8: return

  public void setFilterBitmap(boolean);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #116                // Method android/graphics/drawable/Drawable.setFilterBitmap:(Z)V
       8: return

  public void setHotspot(float, float);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: fload_1
       5: fload_2
       6: invokestatic  #121                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;FF)V
       9: return

  public void setHotspotBounds(int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: invokestatic  #126                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;IIII)V
      12: return

  public boolean setState(int[]);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokevirtual #130                // Method android/graphics/drawable/Drawable.setState:([I)Z
       8: ireturn

  public void setTint(int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokestatic  #134                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;I)V
       8: return

  public void setTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokestatic  #139                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
       8: return

  public void setTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: invokestatic  #144                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
       8: return

  public boolean setVisible(boolean, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #148                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
       6: ifne          26
       9: aload_0
      10: getfield      #18                 // Field a:Landroid/graphics/drawable/Drawable;
      13: iload_1
      14: iload_2
      15: invokevirtual #148                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
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
       2: invokevirtual #154                // Method unscheduleSelf:(Ljava/lang/Runnable;)V
       5: return
}
