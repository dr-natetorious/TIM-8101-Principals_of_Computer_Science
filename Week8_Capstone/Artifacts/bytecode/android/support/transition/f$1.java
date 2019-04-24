final class android.support.transition.f$1 extends android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> {
  android.support.transition.f$1(java.lang.Class, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #13                 // Method android/util/Property."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
       6: aload_0
       7: new           #15                 // class android/graphics/Rect
      10: dup
      11: invokespecial #18                 // Method android/graphics/Rect."<init>":()V
      14: putfield      #20                 // Field a:Landroid/graphics/Rect;
      17: return

  public android.graphics.PointF a(android.graphics.drawable.Drawable);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #20                 // Field a:Landroid/graphics/Rect;
       5: invokevirtual #28                 // Method android/graphics/drawable/Drawable.copyBounds:(Landroid/graphics/Rect;)V
       8: new           #30                 // class android/graphics/PointF
      11: dup
      12: aload_0
      13: getfield      #20                 // Field a:Landroid/graphics/Rect;
      16: getfield      #34                 // Field android/graphics/Rect.left:I
      19: i2f
      20: aload_0
      21: getfield      #20                 // Field a:Landroid/graphics/Rect;
      24: getfield      #37                 // Field android/graphics/Rect.top:I
      27: i2f
      28: invokespecial #40                 // Method android/graphics/PointF."<init>":(FF)V
      31: areturn

  public void a(android.graphics.drawable.Drawable, android.graphics.PointF);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #20                 // Field a:Landroid/graphics/Rect;
       5: invokevirtual #28                 // Method android/graphics/drawable/Drawable.copyBounds:(Landroid/graphics/Rect;)V
       8: aload_0
       9: getfield      #20                 // Field a:Landroid/graphics/Rect;
      12: aload_2
      13: getfield      #45                 // Field android/graphics/PointF.x:F
      16: invokestatic  #51                 // Method java/lang/Math.round:(F)I
      19: aload_2
      20: getfield      #54                 // Field android/graphics/PointF.y:F
      23: invokestatic  #51                 // Method java/lang/Math.round:(F)I
      26: invokevirtual #58                 // Method android/graphics/Rect.offsetTo:(II)V
      29: aload_1
      30: aload_0
      31: getfield      #20                 // Field a:Landroid/graphics/Rect;
      34: invokevirtual #61                 // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
      37: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #24                 // class android/graphics/drawable/Drawable
       5: invokevirtual #65                 // Method a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/PointF;
       8: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #24                 // class android/graphics/drawable/Drawable
       5: aload_2
       6: checkcast     #30                 // class android/graphics/PointF
       9: invokevirtual #69                 // Method a:(Landroid/graphics/drawable/Drawable;Landroid/graphics/PointF;)V
      12: return
}
