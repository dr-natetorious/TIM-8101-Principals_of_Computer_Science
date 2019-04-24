class android.support.v7.app.b$c implements android.support.v7.app.b$a {
  final android.app.Activity a;

  android.support.v7.app.c$a b;

  android.support.v7.app.b$c(android.app.Activity);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #20                 // Field a:Landroid/app/Activity;
       9: return

  public android.graphics.drawable.Drawable a();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/app/Activity;
       4: invokestatic  #27                 // Method android/support/v7/app/c.a:(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;
       7: areturn

  public void a(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #30                 // Field b:Landroid/support/v7/app/c$a;
       5: aload_0
       6: getfield      #20                 // Field a:Landroid/app/Activity;
       9: iload_1
      10: invokestatic  #33                 // Method android/support/v7/app/c.a:(Landroid/support/v7/app/c$a;Landroid/app/Activity;I)Landroid/support/v7/app/c$a;
      13: putfield      #30                 // Field b:Landroid/support/v7/app/c$a;
      16: return

  public void a(android.graphics.drawable.Drawable, int);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/app/Activity;
       4: invokevirtual #40                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
       7: astore_3
       8: aload_3
       9: ifnull        39
      12: aload_3
      13: iconst_1
      14: invokevirtual #46                 // Method android/app/ActionBar.setDisplayShowHomeEnabled:(Z)V
      17: aload_0
      18: aload_0
      19: getfield      #30                 // Field b:Landroid/support/v7/app/c$a;
      22: aload_0
      23: getfield      #20                 // Field a:Landroid/app/Activity;
      26: aload_1
      27: iload_2
      28: invokestatic  #49                 // Method android/support/v7/app/c.a:(Landroid/support/v7/app/c$a;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Landroid/support/v7/app/c$a;
      31: putfield      #30                 // Field b:Landroid/support/v7/app/c$a;
      34: aload_3
      35: iconst_0
      36: invokevirtual #46                 // Method android/app/ActionBar.setDisplayShowHomeEnabled:(Z)V
      39: return

  public android.content.Context b();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/app/Activity;
       4: invokevirtual #40                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
       7: astore_1
       8: aload_1
       9: ifnull        17
      12: aload_1
      13: invokevirtual #53                 // Method android/app/ActionBar.getThemedContext:()Landroid/content/Context;
      16: areturn
      17: aload_0
      18: getfield      #20                 // Field a:Landroid/app/Activity;
      21: areturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/app/Activity;
       4: invokevirtual #40                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
       7: astore_1
       8: aload_1
       9: ifnull        23
      12: aload_1
      13: invokevirtual #58                 // Method android/app/ActionBar.getDisplayOptions:()I
      16: iconst_4
      17: iand
      18: ifeq          23
      21: iconst_1
      22: ireturn
      23: iconst_0
      24: ireturn
}
