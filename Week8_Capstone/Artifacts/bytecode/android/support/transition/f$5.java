final class android.support.transition.f$5 extends android.util.Property<android.view.View, android.graphics.PointF> {
  android.support.transition.f$5(java.lang.Class, java.lang.String);
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
       1: aload_1
       2: invokevirtual #21                 // Method android/view/View.getLeft:()I
       5: aload_1
       6: invokevirtual #24                 // Method android/view/View.getTop:()I
       9: aload_2
      10: getfield      #30                 // Field android/graphics/PointF.x:F
      13: invokestatic  #36                 // Method java/lang/Math.round:(F)I
      16: aload_2
      17: getfield      #39                 // Field android/graphics/PointF.y:F
      20: invokestatic  #36                 // Method java/lang/Math.round:(F)I
      23: invokestatic  #44                 // Method android/support/transition/am.a:(Landroid/view/View;IIII)V
      26: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #17                 // class android/view/View
       5: invokevirtual #48                 // Method a:(Landroid/view/View;)Landroid/graphics/PointF;
       8: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #17                 // class android/view/View
       5: aload_2
       6: checkcast     #26                 // class android/graphics/PointF
       9: invokevirtual #52                 // Method a:(Landroid/view/View;Landroid/graphics/PointF;)V
      12: return
}
