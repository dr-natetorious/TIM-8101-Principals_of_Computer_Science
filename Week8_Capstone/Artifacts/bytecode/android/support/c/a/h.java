abstract class android.support.c.a.h extends android.graphics.drawable.Drawable implements android.support.v4.b.a.b {
  android.graphics.drawable.Drawable b;

  android.support.c.a.h();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: return

  public void applyTheme(android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #23                 // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V
      15: return

  public void clearColorFilter();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #26                 // Method android/graphics/drawable/Drawable.clearColorFilter:()V
      14: return
      15: aload_0
      16: invokespecial #26                 // Method android/graphics/drawable/Drawable.clearColorFilter:()V
      19: return

  public android.graphics.ColorFilter getColorFilter();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #32                 // Method android/support/v4/b/a/a.e:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;
      14: areturn
      15: aconst_null
      16: areturn

  public android.graphics.drawable.Drawable getCurrent();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #36                 // Method android/graphics/drawable/Drawable.getCurrent:()Landroid/graphics/drawable/Drawable;
      14: areturn
      15: aload_0
      16: invokespecial #36                 // Method android/graphics/drawable/Drawable.getCurrent:()Landroid/graphics/drawable/Drawable;
      19: areturn

  public int getMinimumHeight();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #40                 // Method android/graphics/drawable/Drawable.getMinimumHeight:()I
      14: ireturn
      15: aload_0
      16: invokespecial #40                 // Method android/graphics/drawable/Drawable.getMinimumHeight:()I
      19: ireturn

  public int getMinimumWidth();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #43                 // Method android/graphics/drawable/Drawable.getMinimumWidth:()I
      14: ireturn
      15: aload_0
      16: invokespecial #43                 // Method android/graphics/drawable/Drawable.getMinimumWidth:()I
      19: ireturn

  public boolean getPadding(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #47                 // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      15: ireturn
      16: aload_0
      17: aload_1
      18: invokespecial #47                 // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      21: ireturn

  public int[] getState();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #51                 // Method android/graphics/drawable/Drawable.getState:()[I
      14: areturn
      15: aload_0
      16: invokespecial #51                 // Method android/graphics/drawable/Drawable.getState:()[I
      19: areturn

  public android.graphics.Region getTransparentRegion();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokevirtual #55                 // Method android/graphics/drawable/Drawable.getTransparentRegion:()Landroid/graphics/Region;
      14: areturn
      15: aload_0
      16: invokespecial #55                 // Method android/graphics/drawable/Drawable.getTransparentRegion:()Landroid/graphics/Region;
      19: areturn

  public void jumpToCurrentState();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        14
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: invokestatic  #59                 // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;)V
      14: return

  protected void onBoundsChange(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #64                 // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
      15: return
      16: aload_0
      17: aload_1
      18: invokespecial #66                 // Method android/graphics/drawable/Drawable.onBoundsChange:(Landroid/graphics/Rect;)V
      21: return

  protected boolean onLevelChange(int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokevirtual #71                 // Method android/graphics/drawable/Drawable.setLevel:(I)Z
      15: ireturn
      16: aload_0
      17: iload_1
      18: invokespecial #73                 // Method android/graphics/drawable/Drawable.onLevelChange:(I)Z
      21: ireturn

  public void setChangingConfigurations(int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokevirtual #77                 // Method android/graphics/drawable/Drawable.setChangingConfigurations:(I)V
      15: return
      16: aload_0
      17: iload_1
      18: invokespecial #77                 // Method android/graphics/drawable/Drawable.setChangingConfigurations:(I)V
      21: return

  public void setColorFilter(int, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        17
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: aload_2
      13: invokevirtual #81                 // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      16: return
      17: aload_0
      18: iload_1
      19: aload_2
      20: invokespecial #81                 // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      23: return

  public void setFilterBitmap(boolean);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokevirtual #85                 // Method android/graphics/drawable/Drawable.setFilterBitmap:(Z)V
      15: return

  public void setHotspot(float, float);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: fload_1
      12: fload_2
      13: invokestatic  #90                 // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;FF)V
      16: return

  public void setHotspotBounds(int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        19
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: iload_2
      13: iload_3
      14: iload         4
      16: invokestatic  #95                 // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;IIII)V
      19: return

  public boolean setState(int[]);
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        16
       7: aload_0
       8: getfield      #17                 // Field b:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokevirtual #99                 // Method android/graphics/drawable/Drawable.setState:([I)Z
      15: ireturn
      16: aload_0
      17: aload_1
      18: invokespecial #99                 // Method android/graphics/drawable/Drawable.setState:([I)Z
      21: ireturn
}
