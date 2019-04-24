final class android.support.transition.am$2 extends android.util.Property<android.view.View, android.graphics.Rect> {
  android.support.transition.am$2(java.lang.Class, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #11                 // Method android/util/Property."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
       6: return

  public android.graphics.Rect a(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #19                 // Method android/support/v4/view/s.y:(Landroid/view/View;)Landroid/graphics/Rect;
       4: areturn

  public void a(android.view.View, android.graphics.Rect);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #22                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/Rect;)V
       5: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #26                 // class android/view/View
       5: invokevirtual #28                 // Method a:(Landroid/view/View;)Landroid/graphics/Rect;
       8: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #26                 // class android/view/View
       5: aload_2
       6: checkcast     #32                 // class android/graphics/Rect
       9: invokevirtual #33                 // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      12: return
}
