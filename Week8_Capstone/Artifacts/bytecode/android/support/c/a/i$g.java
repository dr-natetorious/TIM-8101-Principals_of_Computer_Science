class android.support.c.a.i$g extends android.graphics.drawable.Drawable$ConstantState {
  public android.support.c.a.i$g(android.graphics.drawable.Drawable$ConstantState);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/graphics/drawable/Drawable$ConstantState."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
       9: return

  public boolean canApplyTheme();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
       4: invokevirtual #21                 // Method android/graphics/drawable/Drawable$ConstantState.canApplyTheme:()Z
       7: ireturn

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
       4: invokevirtual #25                 // Method android/graphics/drawable/Drawable$ConstantState.getChangingConfigurations:()I
       7: ireturn

  public android.graphics.drawable.Drawable newDrawable();
    Code:
       0: new           #6                  // class android/support/c/a/i
       3: dup
       4: invokespecial #28                 // Method android/support/c/a/i."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
      13: invokevirtual #30                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:()Landroid/graphics/drawable/Drawable;
      16: checkcast     #32                 // class android/graphics/drawable/VectorDrawable
      19: putfield      #36                 // Field android/support/c/a/i.b:Landroid/graphics/drawable/Drawable;
      22: aload_1
      23: areturn

  public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources);
    Code:
       0: new           #6                  // class android/support/c/a/i
       3: dup
       4: invokespecial #28                 // Method android/support/c/a/i."<init>":()V
       7: astore_2
       8: aload_2
       9: aload_0
      10: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
      13: aload_1
      14: invokevirtual #39                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
      17: checkcast     #32                 // class android/graphics/drawable/VectorDrawable
      20: putfield      #36                 // Field android/support/c/a/i.b:Landroid/graphics/drawable/Drawable;
      23: aload_2
      24: areturn

  public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources, android.content.res.Resources$Theme);
    Code:
       0: new           #6                  // class android/support/c/a/i
       3: dup
       4: invokespecial #28                 // Method android/support/c/a/i."<init>":()V
       7: astore_3
       8: aload_3
       9: aload_0
      10: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
      13: aload_1
      14: aload_2
      15: invokevirtual #42                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
      18: checkcast     #32                 // class android/graphics/drawable/VectorDrawable
      21: putfield      #36                 // Field android/support/c/a/i.b:Landroid/graphics/drawable/Drawable;
      24: aload_3
      25: areturn
}
