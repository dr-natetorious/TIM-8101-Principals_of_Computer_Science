class android.support.v7.widget.u {
  static {};
    Code:
       0: iconst_2
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #13                 // int 16843067
       7: iastore
       8: dup
       9: iconst_1
      10: ldc           #14                 // int 16843068
      12: iastore
      13: putstatic     #16                 // Field a:[I
      16: return

  android.support.v7.widget.u(android.widget.ProgressBar);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #23                 // Field b:Landroid/widget/ProgressBar;
       9: return

  android.graphics.Bitmap a();
    Code:
       0: aload_0
       1: getfield      #97                 // Field c:Landroid/graphics/Bitmap;
       4: areturn

  void a(android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Landroid/widget/ProgressBar;
       4: invokevirtual #156                // Method android/widget/ProgressBar.getContext:()Landroid/content/Context;
       7: aload_1
       8: getstatic     #16                 // Field a:[I
      11: iload_2
      12: iconst_0
      13: invokestatic  #161                // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
      16: astore_1
      17: aload_1
      18: iconst_0
      19: invokevirtual #163                // Method android/support/v7/widget/bp.b:(I)Landroid/graphics/drawable/Drawable;
      22: astore_3
      23: aload_3
      24: ifnull        39
      27: aload_0
      28: getfield      #23                 // Field b:Landroid/widget/ProgressBar;
      31: aload_0
      32: aload_3
      33: invokespecial #165                // Method a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
      36: invokevirtual #168                // Method android/widget/ProgressBar.setIndeterminateDrawable:(Landroid/graphics/drawable/Drawable;)V
      39: aload_1
      40: iconst_1
      41: invokevirtual #163                // Method android/support/v7/widget/bp.b:(I)Landroid/graphics/drawable/Drawable;
      44: astore_3
      45: aload_3
      46: ifnull        62
      49: aload_0
      50: getfield      #23                 // Field b:Landroid/widget/ProgressBar;
      53: aload_0
      54: aload_3
      55: iconst_0
      56: invokespecial #46                 // Method a:(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
      59: invokevirtual #171                // Method android/widget/ProgressBar.setProgressDrawable:(Landroid/graphics/drawable/Drawable;)V
      62: aload_1
      63: invokevirtual #173                // Method android/support/v7/widget/bp.a:()V
      66: return
}
