final class android.support.transition.f$6 extends android.util.Property<android.view.View, android.graphics.PointF> {
  android.support.transition.f$6(java.lang.Class, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #11                 // Method android/util/Property."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
       6: return

  public android.graphics.PointF a(android.view.View);
    Code:
       0: aconst_null
       1: areturn

  public void a(android.view.View, android.graphics.PointF);
    Code:
       0: aload_1
       1: aload_2
       2: getfield      #21                 // Field android/graphics/PointF.x:F
       5: invokestatic  #27                 // Method java/lang/Math.round:(F)I
       8: aload_2
       9: getfield      #30                 // Field android/graphics/PointF.y:F
      12: invokestatic  #27                 // Method java/lang/Math.round:(F)I
      15: aload_1
      16: invokevirtual #36                 // Method android/view/View.getRight:()I
      19: aload_1
      20: invokevirtual #39                 // Method android/view/View.getBottom:()I
      23: invokestatic  #44                 // Method android/support/transition/am.a:(Landroid/view/View;IIII)V
      26: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #32                 // class android/view/View
       5: invokevirtual #48                 // Method a:(Landroid/view/View;)Landroid/graphics/PointF;
       8: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #32                 // class android/view/View
       5: aload_2
       6: checkcast     #17                 // class android/graphics/PointF
       9: invokevirtual #52                 // Method a:(Landroid/view/View;Landroid/graphics/PointF;)V
      12: return
}
