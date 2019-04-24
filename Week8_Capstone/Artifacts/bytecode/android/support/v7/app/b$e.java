class android.support.v7.app.b$e implements android.support.v7.app.b$a {
  final android.support.v7.widget.Toolbar a;

  final android.graphics.drawable.Drawable b;

  final java.lang.CharSequence c;

  android.support.v7.app.b$e(android.support.v7.widget.Toolbar);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #22                 // Field a:Landroid/support/v7/widget/Toolbar;
       9: aload_0
      10: aload_1
      11: invokevirtual #28                 // Method android/support/v7/widget/Toolbar.getNavigationIcon:()Landroid/graphics/drawable/Drawable;
      14: putfield      #30                 // Field b:Landroid/graphics/drawable/Drawable;
      17: aload_0
      18: aload_1
      19: invokevirtual #34                 // Method android/support/v7/widget/Toolbar.getNavigationContentDescription:()Ljava/lang/CharSequence;
      22: putfield      #36                 // Field c:Ljava/lang/CharSequence;
      25: return

  public android.graphics.drawable.Drawable a();
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Landroid/graphics/drawable/Drawable;
       4: areturn

  public void a(int);
    Code:
       0: iload_1
       1: ifne          16
       4: aload_0
       5: getfield      #22                 // Field a:Landroid/support/v7/widget/Toolbar;
       8: aload_0
       9: getfield      #36                 // Field c:Ljava/lang/CharSequence;
      12: invokevirtual #42                 // Method android/support/v7/widget/Toolbar.setNavigationContentDescription:(Ljava/lang/CharSequence;)V
      15: return
      16: aload_0
      17: getfield      #22                 // Field a:Landroid/support/v7/widget/Toolbar;
      20: iload_1
      21: invokevirtual #44                 // Method android/support/v7/widget/Toolbar.setNavigationContentDescription:(I)V
      24: return

  public void a(android.graphics.drawable.Drawable, int);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: aload_1
       5: invokevirtual #49                 // Method android/support/v7/widget/Toolbar.setNavigationIcon:(Landroid/graphics/drawable/Drawable;)V
       8: aload_0
       9: iload_2
      10: invokevirtual #51                 // Method a:(I)V
      13: return

  public android.content.Context b();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #55                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
       7: areturn

  public boolean c();
    Code:
       0: iconst_1
       1: ireturn
}
