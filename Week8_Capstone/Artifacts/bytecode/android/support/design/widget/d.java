class android.support.design.widget.d extends android.support.design.widget.c {
  android.support.design.widget.d();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/support/design/widget/c."<init>":()V
       4: return

  public void getOutline(android.graphics.Outline);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #15                 // Field b:Landroid/graphics/Rect;
       5: invokevirtual #19                 // Method copyBounds:(Landroid/graphics/Rect;)V
       8: aload_1
       9: aload_0
      10: getfield      #15                 // Field b:Landroid/graphics/Rect;
      13: invokevirtual #24                 // Method android/graphics/Outline.setOval:(Landroid/graphics/Rect;)V
      16: return
}
