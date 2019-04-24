class android.support.v4.widget.h$c extends android.support.v4.widget.h$a {
  android.support.v4.widget.h$c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/widget/h$a."<init>":()V
       4: return

  public android.content.res.ColorStateList a(android.widget.ImageView);
    Code:
       0: aload_1
       1: invokevirtual #20                 // Method android/widget/ImageView.getImageTintList:()Landroid/content/res/ColorStateList;
       4: areturn

  public void a(android.widget.ImageView, android.content.res.ColorStateList);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #25                 // Method android/widget/ImageView.setImageTintList:(Landroid/content/res/ColorStateList;)V
       5: getstatic     #31                 // Field android/os/Build$VERSION.SDK_INT:I
       8: bipush        21
      10: if_icmpne     68
      13: aload_1
      14: invokevirtual #35                 // Method android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
      17: astore_2
      18: aload_1
      19: invokevirtual #20                 // Method android/widget/ImageView.getImageTintList:()Landroid/content/res/ColorStateList;
      22: ifnull        37
      25: aload_1
      26: invokevirtual #39                 // Method android/widget/ImageView.getImageTintMode:()Landroid/graphics/PorterDuff$Mode;
      29: ifnull        37
      32: iconst_1
      33: istore_3
      34: goto          39
      37: iconst_0
      38: istore_3
      39: aload_2
      40: ifnull        68
      43: iload_3
      44: ifeq          68
      47: aload_2
      48: invokevirtual #45                 // Method android/graphics/drawable/Drawable.isStateful:()Z
      51: ifeq          63
      54: aload_2
      55: aload_1
      56: invokevirtual #49                 // Method android/widget/ImageView.getDrawableState:()[I
      59: invokevirtual #53                 // Method android/graphics/drawable/Drawable.setState:([I)Z
      62: pop
      63: aload_1
      64: aload_2
      65: invokevirtual #57                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      68: return

  public void a(android.widget.ImageView, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #62                 // Method android/widget/ImageView.setImageTintMode:(Landroid/graphics/PorterDuff$Mode;)V
       5: getstatic     #31                 // Field android/os/Build$VERSION.SDK_INT:I
       8: bipush        21
      10: if_icmpne     68
      13: aload_1
      14: invokevirtual #35                 // Method android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
      17: astore_2
      18: aload_1
      19: invokevirtual #20                 // Method android/widget/ImageView.getImageTintList:()Landroid/content/res/ColorStateList;
      22: ifnull        37
      25: aload_1
      26: invokevirtual #39                 // Method android/widget/ImageView.getImageTintMode:()Landroid/graphics/PorterDuff$Mode;
      29: ifnull        37
      32: iconst_1
      33: istore_3
      34: goto          39
      37: iconst_0
      38: istore_3
      39: aload_2
      40: ifnull        68
      43: iload_3
      44: ifeq          68
      47: aload_2
      48: invokevirtual #45                 // Method android/graphics/drawable/Drawable.isStateful:()Z
      51: ifeq          63
      54: aload_2
      55: aload_1
      56: invokevirtual #49                 // Method android/widget/ImageView.getDrawableState:()[I
      59: invokevirtual #53                 // Method android/graphics/drawable/Drawable.setState:([I)Z
      62: pop
      63: aload_1
      64: aload_2
      65: invokevirtual #57                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      68: return

  public android.graphics.PorterDuff$Mode b(android.widget.ImageView);
    Code:
       0: aload_1
       1: invokevirtual #39                 // Method android/widget/ImageView.getImageTintMode:()Landroid/graphics/PorterDuff$Mode;
       4: areturn
}
