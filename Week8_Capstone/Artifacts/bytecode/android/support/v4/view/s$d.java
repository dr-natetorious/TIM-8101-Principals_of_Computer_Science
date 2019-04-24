class android.support.v4.view.s$d extends android.support.v4.view.s$c {
  android.support.v4.view.s$d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/view/s$c."<init>":()V
       4: return

  public void a(android.view.View, android.graphics.Rect);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #20                 // Method android/view/View.setClipBounds:(Landroid/graphics/Rect;)V
       5: return

  public android.graphics.Rect q(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #26                 // Method android/view/View.getClipBounds:()Landroid/graphics/Rect;
       4: areturn
}
