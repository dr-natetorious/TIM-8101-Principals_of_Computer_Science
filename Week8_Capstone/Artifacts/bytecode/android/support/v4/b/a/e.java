class android.support.v4.b.a.e extends android.support.v4.b.a.d {
  android.support.v4.b.a.e(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method android/support/v4/b/a/d."<init>":(Landroid/graphics/drawable/Drawable;)V
       5: return

  android.support.v4.b.a.e(android.support.v4.b.a.d$a, android.content.res.Resources);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #15                 // Method android/support/v4/b/a/d."<init>":(Landroid/support/v4/b/a/d$a;Landroid/content/res/Resources;)V
       6: return

  android.support.v4.b.a.d$a b();
    Code:
       0: new           #6                  // class android/support/v4/b/a/e$a
       3: dup
       4: aload_0
       5: getfield      #20                 // Field b:Landroid/support/v4/b/a/d$a;
       8: aconst_null
       9: invokespecial #21                 // Method android/support/v4/b/a/e$a."<init>":(Landroid/support/v4/b/a/d$a;Landroid/content/res/Resources;)V
      12: areturn

  public boolean isAutoMirrored();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Landroid/graphics/drawable/Drawable;
       4: invokevirtual #31                 // Method android/graphics/drawable/Drawable.isAutoMirrored:()Z
       7: ireturn

  public void setAutoMirrored(boolean);
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Landroid/graphics/drawable/Drawable;
       4: iload_1
       5: invokevirtual #35                 // Method android/graphics/drawable/Drawable.setAutoMirrored:(Z)V
       8: return
}
