public final class android.support.v4.a.a.b {
  public static android.graphics.Typeface a(android.content.Context, int, android.util.TypedValue, int, android.support.v4.a.a.b$a);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method android/content/Context.isRestricted:()Z
       4: ifeq          9
       7: aconst_null
       8: areturn
       9: aload_0
      10: iload_1
      11: aload_2
      12: iload_3
      13: aload         4
      15: aconst_null
      16: iconst_1
      17: invokestatic  #21                 // Method a:(Landroid/content/Context;ILandroid/util/TypedValue;ILandroid/support/v4/a/a/b$a;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
      20: areturn

  public static android.graphics.drawable.Drawable a(android.content.res.Resources, int, android.content.res.Resources$Theme);
    Code:
       0: getstatic     #155                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     15
       8: aload_0
       9: iload_1
      10: aload_2
      11: invokevirtual #159                // Method android/content/res/Resources.getDrawable:(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
      14: areturn
      15: aload_0
      16: iload_1
      17: invokevirtual #162                // Method android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      20: areturn
}
