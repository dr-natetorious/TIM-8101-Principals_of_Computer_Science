class android.support.v7.widget.ab extends android.support.v7.widget.aa {
  android.support.v7.widget.ab(android.widget.TextView);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method android/support/v7/widget/aa."<init>":(Landroid/widget/TextView;)V
       5: return

  void a();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/support/v7/widget/aa.a:()V
       4: aload_0
       5: getfield      #18                 // Field b:Landroid/support/v7/widget/bn;
       8: ifnonnull     18
      11: aload_0
      12: getfield      #20                 // Field c:Landroid/support/v7/widget/bn;
      15: ifnull        48
      18: aload_0
      19: getfield      #23                 // Field a:Landroid/widget/TextView;
      22: invokevirtual #29                 // Method android/widget/TextView.getCompoundDrawablesRelative:()[Landroid/graphics/drawable/Drawable;
      25: astore_1
      26: aload_0
      27: aload_1
      28: iconst_0
      29: aaload
      30: aload_0
      31: getfield      #18                 // Field b:Landroid/support/v7/widget/bn;
      34: invokevirtual #32                 // Method a:(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/bn;)V
      37: aload_0
      38: aload_1
      39: iconst_2
      40: aaload
      41: aload_0
      42: getfield      #20                 // Field c:Landroid/support/v7/widget/bn;
      45: invokevirtual #32                 // Method a:(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/bn;)V
      48: return

  void a(android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #35                 // Method android/support/v7/widget/aa.a:(Landroid/util/AttributeSet;I)V
       6: aload_0
       7: getfield      #23                 // Field a:Landroid/widget/TextView;
      10: invokevirtual #39                 // Method android/widget/TextView.getContext:()Landroid/content/Context;
      13: astore_3
      14: invokestatic  #44                 // Method android/support/v7/widget/m.a:()Landroid/support/v7/widget/m;
      17: astore        4
      19: aload_3
      20: aload_1
      21: getstatic     #50                 // Field android/support/v7/a/a$j.AppCompatTextHelper:[I
      24: iload_2
      25: iconst_0
      26: invokevirtual #56                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      29: astore_1
      30: aload_1
      31: getstatic     #60                 // Field android/support/v7/a/a$j.AppCompatTextHelper_android_drawableStart:I
      34: invokevirtual #66                 // Method android/content/res/TypedArray.hasValue:(I)Z
      37: ifeq          58
      40: aload_0
      41: aload_3
      42: aload         4
      44: aload_1
      45: getstatic     #60                 // Field android/support/v7/a/a$j.AppCompatTextHelper_android_drawableStart:I
      48: iconst_0
      49: invokevirtual #70                 // Method android/content/res/TypedArray.getResourceId:(II)I
      52: invokestatic  #73                 // Method a:(Landroid/content/Context;Landroid/support/v7/widget/m;I)Landroid/support/v7/widget/bn;
      55: putfield      #18                 // Field b:Landroid/support/v7/widget/bn;
      58: aload_1
      59: getstatic     #76                 // Field android/support/v7/a/a$j.AppCompatTextHelper_android_drawableEnd:I
      62: invokevirtual #66                 // Method android/content/res/TypedArray.hasValue:(I)Z
      65: ifeq          86
      68: aload_0
      69: aload_3
      70: aload         4
      72: aload_1
      73: getstatic     #76                 // Field android/support/v7/a/a$j.AppCompatTextHelper_android_drawableEnd:I
      76: iconst_0
      77: invokevirtual #70                 // Method android/content/res/TypedArray.getResourceId:(II)I
      80: invokestatic  #73                 // Method a:(Landroid/content/Context;Landroid/support/v7/widget/m;I)Landroid/support/v7/widget/bn;
      83: putfield      #20                 // Field c:Landroid/support/v7/widget/bn;
      86: aload_1
      87: invokevirtual #79                 // Method android/content/res/TypedArray.recycle:()V
      90: return
}
