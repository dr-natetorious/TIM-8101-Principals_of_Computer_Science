class android.support.v4.widget.h$a implements android.support.v4.widget.h$b {
  android.support.v4.widget.h$a();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.content.res.ColorStateList a(android.widget.ImageView);
    Code:
       0: aload_1
       1: instanceof    #17                 // class android/support/v4/widget/o
       4: ifeq          17
       7: aload_1
       8: checkcast     #17                 // class android/support/v4/widget/o
      11: invokeinterface #21,  1           // InterfaceMethod android/support/v4/widget/o.getSupportImageTintList:()Landroid/content/res/ColorStateList;
      16: areturn
      17: aconst_null
      18: areturn

  public void a(android.widget.ImageView, android.content.res.ColorStateList);
    Code:
       0: aload_1
       1: instanceof    #17                 // class android/support/v4/widget/o
       4: ifeq          17
       7: aload_1
       8: checkcast     #17                 // class android/support/v4/widget/o
      11: aload_2
      12: invokeinterface #26,  2           // InterfaceMethod android/support/v4/widget/o.setSupportImageTintList:(Landroid/content/res/ColorStateList;)V
      17: return

  public void a(android.widget.ImageView, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_1
       1: instanceof    #17                 // class android/support/v4/widget/o
       4: ifeq          17
       7: aload_1
       8: checkcast     #17                 // class android/support/v4/widget/o
      11: aload_2
      12: invokeinterface #31,  2           // InterfaceMethod android/support/v4/widget/o.setSupportImageTintMode:(Landroid/graphics/PorterDuff$Mode;)V
      17: return

  public android.graphics.PorterDuff$Mode b(android.widget.ImageView);
    Code:
       0: aload_1
       1: instanceof    #17                 // class android/support/v4/widget/o
       4: ifeq          17
       7: aload_1
       8: checkcast     #17                 // class android/support/v4/widget/o
      11: invokeinterface #37,  1           // InterfaceMethod android/support/v4/widget/o.getSupportImageTintMode:()Landroid/graphics/PorterDuff$Mode;
      16: areturn
      17: aconst_null
      18: areturn
}
