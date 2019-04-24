class android.support.v4.widget.m$b extends android.support.v4.widget.m$a {
  android.support.v4.widget.m$b();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/widget/m$a."<init>":()V
       4: return

  public void a(android.widget.TextView, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable);
    Code:
       0: aload_1
       1: invokevirtual #20                 // Method android/widget/TextView.getLayoutDirection:()I
       4: istore        7
       6: iconst_1
       7: istore        6
       9: iload         7
      11: iconst_1
      12: if_icmpne     18
      15: goto          21
      18: iconst_0
      19: istore        6
      21: iload         6
      23: ifeq          33
      26: aload         4
      28: astore        8
      30: goto          36
      33: aload_2
      34: astore        8
      36: iload         6
      38: ifeq          44
      41: goto          47
      44: aload         4
      46: astore_2
      47: aload_1
      48: aload         8
      50: aload_3
      51: aload_2
      52: aload         5
      54: invokevirtual #24                 // Method android/widget/TextView.setCompoundDrawables:(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
      57: return
}
