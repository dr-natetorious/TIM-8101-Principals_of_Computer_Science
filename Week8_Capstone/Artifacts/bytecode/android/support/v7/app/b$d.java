class android.support.v7.app.b$d implements android.support.v7.app.b$a {
  final android.app.Activity a;

  android.support.v7.app.b$d(android.app.Activity);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #18                 // Field a:Landroid/app/Activity;
       9: return

  public android.graphics.drawable.Drawable a();
    Code:
       0: aload_0
       1: invokevirtual #24                 // Method b:()Landroid/content/Context;
       4: aconst_null
       5: iconst_1
       6: newarray       int
       8: dup
       9: iconst_0
      10: ldc           #25                 // int 16843531
      12: iastore
      13: ldc           #26                 // int 16843470
      15: iconst_0
      16: invokevirtual #32                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      19: astore_1
      20: aload_1
      21: iconst_0
      22: invokevirtual #38                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      25: astore_2
      26: aload_1
      27: invokevirtual #41                 // Method android/content/res/TypedArray.recycle:()V
      30: aload_2
      31: areturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/app/Activity;
       4: invokevirtual #48                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
       7: astore_2
       8: aload_2
       9: ifnull        17
      12: aload_2
      13: iload_1
      14: invokevirtual #53                 // Method android/app/ActionBar.setHomeActionContentDescription:(I)V
      17: return

  public void a(android.graphics.drawable.Drawable, int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/app/Activity;
       4: invokevirtual #48                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
       7: astore_3
       8: aload_3
       9: ifnull        22
      12: aload_3
      13: aload_1
      14: invokevirtual #58                 // Method android/app/ActionBar.setHomeAsUpIndicator:(Landroid/graphics/drawable/Drawable;)V
      17: aload_3
      18: iload_2
      19: invokevirtual #53                 // Method android/app/ActionBar.setHomeActionContentDescription:(I)V
      22: return

  public android.content.Context b();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/app/Activity;
       4: invokevirtual #48                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
       7: astore_1
       8: aload_1
       9: ifnull        17
      12: aload_1
      13: invokevirtual #61                 // Method android/app/ActionBar.getThemedContext:()Landroid/content/Context;
      16: areturn
      17: aload_0
      18: getfield      #18                 // Field a:Landroid/app/Activity;
      21: areturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/app/Activity;
       4: invokevirtual #48                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
       7: astore_1
       8: aload_1
       9: ifnull        23
      12: aload_1
      13: invokevirtual #67                 // Method android/app/ActionBar.getDisplayOptions:()I
      16: iconst_4
      17: iand
      18: ifeq          23
      21: iconst_1
      22: ireturn
      23: iconst_0
      24: ireturn
}
