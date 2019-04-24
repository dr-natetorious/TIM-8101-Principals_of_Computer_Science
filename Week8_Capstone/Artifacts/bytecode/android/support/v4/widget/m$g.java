class android.support.v4.widget.m$g {
  android.support.v4.widget.m$g();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public void a(android.widget.TextView, int);
    Code:
       0: aload_1
       1: aload_1
       2: invokevirtual #20                 // Method android/widget/TextView.getContext:()Landroid/content/Context;
       5: iload_2
       6: invokevirtual #24                 // Method android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
       9: return

  public void a(android.widget.TextView, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable);
    Code:
       0: aload_1
       1: aload_2
       2: aload_3
       3: aload         4
       5: aload         5
       7: invokevirtual #29                 // Method android/widget/TextView.setCompoundDrawables:(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
      10: return
}
