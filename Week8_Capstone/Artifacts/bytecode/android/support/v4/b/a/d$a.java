public abstract class android.support.v4.b.a.d$a extends android.graphics.drawable.Drawable$ConstantState {
  int a;

  android.graphics.drawable.Drawable$ConstantState b;

  android.content.res.ColorStateList c;

  android.graphics.PorterDuff$Mode d;

  android.support.v4.b.a.d$a(android.support.v4.b.a.d$a, android.content.res.Resources);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method android/graphics/drawable/Drawable$ConstantState."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #21                 // Field c:Landroid/content/res/ColorStateList;
       9: aload_0
      10: getstatic     #23                 // Field android/support/v4/b/a/d.a:Landroid/graphics/PorterDuff$Mode;
      13: putfield      #25                 // Field d:Landroid/graphics/PorterDuff$Mode;
      16: aload_1
      17: ifnull        52
      20: aload_0
      21: aload_1
      22: getfield      #27                 // Field a:I
      25: putfield      #27                 // Field a:I
      28: aload_0
      29: aload_1
      30: getfield      #29                 // Field b:Landroid/graphics/drawable/Drawable$ConstantState;
      33: putfield      #29                 // Field b:Landroid/graphics/drawable/Drawable$ConstantState;
      36: aload_0
      37: aload_1
      38: getfield      #21                 // Field c:Landroid/content/res/ColorStateList;
      41: putfield      #21                 // Field c:Landroid/content/res/ColorStateList;
      44: aload_0
      45: aload_1
      46: getfield      #25                 // Field d:Landroid/graphics/PorterDuff$Mode;
      49: putfield      #25                 // Field d:Landroid/graphics/PorterDuff$Mode;
      52: return

  boolean a();
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/graphics/drawable/Drawable$ConstantState;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:I
       4: istore_2
       5: aload_0
       6: getfield      #29                 // Field b:Landroid/graphics/drawable/Drawable$ConstantState;
       9: ifnull        23
      12: aload_0
      13: getfield      #29                 // Field b:Landroid/graphics/drawable/Drawable$ConstantState;
      16: invokevirtual #35                 // Method android/graphics/drawable/Drawable$ConstantState.getChangingConfigurations:()I
      19: istore_1
      20: goto          25
      23: iconst_0
      24: istore_1
      25: iload_2
      26: iload_1
      27: ior
      28: ireturn

  public android.graphics.drawable.Drawable newDrawable();
    Code:
       0: aload_0
       1: aconst_null
       2: invokevirtual #40                 // Method newDrawable:(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
       5: areturn

  public abstract android.graphics.drawable.Drawable newDrawable(android.content.res.Resources);
}
