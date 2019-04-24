class android.support.v7.widget.ap$a extends android.support.v7.d.a.a {
  android.support.v7.widget.ap$a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #12                 // Method android/support/v7/d/a/a."<init>":(Landroid/graphics/drawable/Drawable;)V
       5: aload_0
       6: iconst_1
       7: putfield      #14                 // Field a:Z
      10: return

  void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #14                 // Field a:Z
       5: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Z
       4: ifeq          12
       7: aload_0
       8: aload_1
       9: invokespecial #20                 // Method android/support/v7/d/a/a.draw:(Landroid/graphics/Canvas;)V
      12: return

  public void setHotspot(float, float);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Z
       4: ifeq          13
       7: aload_0
       8: fload_1
       9: fload_2
      10: invokespecial #24                 // Method android/support/v7/d/a/a.setHotspot:(FF)V
      13: return

  public void setHotspotBounds(int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Z
       4: ifeq          16
       7: aload_0
       8: iload_1
       9: iload_2
      10: iload_3
      11: iload         4
      13: invokespecial #28                 // Method android/support/v7/d/a/a.setHotspotBounds:(IIII)V
      16: return

  public boolean setState(int[]);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Z
       4: ifeq          13
       7: aload_0
       8: aload_1
       9: invokespecial #32                 // Method android/support/v7/d/a/a.setState:([I)Z
      12: ireturn
      13: iconst_0
      14: ireturn

  public boolean setVisible(boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Z
       4: ifeq          14
       7: aload_0
       8: iload_1
       9: iload_2
      10: invokespecial #36                 // Method android/support/v7/d/a/a.setVisible:(ZZ)Z
      13: ireturn
      14: iconst_0
      15: ireturn
}
