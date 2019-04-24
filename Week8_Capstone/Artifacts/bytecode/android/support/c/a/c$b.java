class android.support.c.a.c$b extends android.graphics.drawable.Drawable$ConstantState {
  public android.support.c.a.c$b(android.graphics.drawable.Drawable$ConstantState);
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
       0: new           #6                  // class android/support/c/a/c
       3: dup
       4: invokespecial #28                 // Method android/support/c/a/c."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
      13: invokevirtual #30                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:()Landroid/graphics/drawable/Drawable;
      16: putfield      #33                 // Field android/support/c/a/c.b:Landroid/graphics/drawable/Drawable;
      19: aload_1
      20: getfield      #33                 // Field android/support/c/a/c.b:Landroid/graphics/drawable/Drawable;
      23: aload_1
      24: getfield      #36                 // Field android/support/c/a/c.a:Landroid/graphics/drawable/Drawable$Callback;
      27: invokevirtual #42                 // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      30: aload_1
      31: areturn

  public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources);
    Code:
       0: new           #6                  // class android/support/c/a/c
       3: dup
       4: invokespecial #28                 // Method android/support/c/a/c."<init>":()V
       7: astore_2
       8: aload_2
       9: aload_0
      10: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
      13: aload_1
      14: invokevirtual #45                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
      17: putfield      #33                 // Field android/support/c/a/c.b:Landroid/graphics/drawable/Drawable;
      20: aload_2
      21: getfield      #33                 // Field android/support/c/a/c.b:Landroid/graphics/drawable/Drawable;
      24: aload_2
      25: getfield      #36                 // Field android/support/c/a/c.a:Landroid/graphics/drawable/Drawable$Callback;
      28: invokevirtual #42                 // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      31: aload_2
      32: areturn

  public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources, android.content.res.Resources$Theme);
    Code:
       0: new           #6                  // class android/support/c/a/c
       3: dup
       4: invokespecial #28                 // Method android/support/c/a/c."<init>":()V
       7: astore_3
       8: aload_3
       9: aload_0
      10: getfield      #16                 // Field a:Landroid/graphics/drawable/Drawable$ConstantState;
      13: aload_1
      14: aload_2
      15: invokevirtual #48                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
      18: putfield      #33                 // Field android/support/c/a/c.b:Landroid/graphics/drawable/Drawable;
      21: aload_3
      22: getfield      #33                 // Field android/support/c/a/c.b:Landroid/graphics/drawable/Drawable;
      25: aload_3
      26: getfield      #36                 // Field android/support/c/a/c.a:Landroid/graphics/drawable/Drawable$Callback;
      29: invokevirtual #42                 // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      32: aload_3
      33: areturn
}
