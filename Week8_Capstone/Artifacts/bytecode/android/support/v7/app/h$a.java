class android.support.v7.app.h$a implements android.support.v7.app.b$a {
  final android.support.v7.app.h a;

  android.support.v7.app.h$a(android.support.v7.app.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/app/h;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public android.graphics.drawable.Drawable a();
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Landroid/content/Context;
       4: aconst_null
       5: iconst_1
       6: newarray       int
       8: dup
       9: iconst_0
      10: getstatic     #29                 // Field android/support/v7/a/a$a.homeAsUpIndicator:I
      13: iastore
      14: invokestatic  #34                 // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroid/support/v7/widget/bp;
      17: astore_1
      18: aload_1
      19: iconst_0
      20: invokevirtual #37                 // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
      23: astore_2
      24: aload_1
      25: invokevirtual #39                 // Method android/support/v7/widget/bp.a:()V
      28: aload_2
      29: areturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/h;
       4: invokevirtual #43                 // Method android/support/v7/app/h.a:()Landroid/support/v7/app/a;
       7: astore_2
       8: aload_2
       9: ifnull        17
      12: aload_2
      13: iload_1
      14: invokevirtual #47                 // Method android/support/v7/app/a.b:(I)V
      17: return

  public void a(android.graphics.drawable.Drawable, int);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/h;
       4: invokevirtual #43                 // Method android/support/v7/app/h.a:()Landroid/support/v7/app/a;
       7: astore_3
       8: aload_3
       9: ifnull        22
      12: aload_3
      13: aload_1
      14: invokevirtual #51                 // Method android/support/v7/app/a.a:(Landroid/graphics/drawable/Drawable;)V
      17: aload_3
      18: iload_2
      19: invokevirtual #47                 // Method android/support/v7/app/a.b:(I)V
      22: return

  public android.content.Context b();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/h;
       4: invokevirtual #54                 // Method android/support/v7/app/h.o:()Landroid/content/Context;
       7: areturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/app/h;
       4: invokevirtual #43                 // Method android/support/v7/app/h.a:()Landroid/support/v7/app/a;
       7: astore_1
       8: aload_1
       9: ifnull        23
      12: aload_1
      13: invokevirtual #59                 // Method android/support/v7/app/a.a:()I
      16: iconst_4
      17: iand
      18: ifeq          23
      21: iconst_1
      22: ireturn
      23: iconst_0
      24: ireturn
}
