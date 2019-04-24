class android.support.transition.z {
  static android.animation.Animator a(android.animation.Animator, android.animation.Animator);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aload_1
       5: areturn
       6: aload_1
       7: ifnonnull     12
      10: aload_0
      11: areturn
      12: new           #8                  // class android/animation/AnimatorSet
      15: dup
      16: invokespecial #12                 // Method android/animation/AnimatorSet."<init>":()V
      19: astore_2
      20: aload_2
      21: iconst_2
      22: anewarray     #14                 // class android/animation/Animator
      25: dup
      26: iconst_0
      27: aload_0
      28: aastore
      29: dup
      30: iconst_1
      31: aload_1
      32: aastore
      33: invokevirtual #18                 // Method android/animation/AnimatorSet.playTogether:([Landroid/animation/Animator;)V
      36: aload_2
      37: areturn

  static android.view.View a(android.view.ViewGroup, android.view.View, android.view.View);
    Code:
       0: new           #49                 // class android/graphics/Matrix
       3: dup
       4: invokespecial #85                 // Method android/graphics/Matrix."<init>":()V
       7: astore        7
       9: aload         7
      11: aload_2
      12: invokevirtual #89                 // Method android/view/View.getScrollX:()I
      15: ineg
      16: i2f
      17: aload_2
      18: invokevirtual #92                 // Method android/view/View.getScrollY:()I
      21: ineg
      22: i2f
      23: invokevirtual #96                 // Method android/graphics/Matrix.setTranslate:(FF)V
      26: aload_1
      27: aload         7
      29: invokestatic  #101                // Method android/support/transition/am.a:(Landroid/view/View;Landroid/graphics/Matrix;)V
      32: aload_0
      33: aload         7
      35: invokestatic  #104                // Method android/support/transition/am.b:(Landroid/view/View;Landroid/graphics/Matrix;)V
      38: new           #22                 // class android/graphics/RectF
      41: dup
      42: fconst_0
      43: fconst_0
      44: aload_1
      45: invokevirtual #107                // Method android/view/View.getWidth:()I
      48: i2f
      49: aload_1
      50: invokevirtual #110                // Method android/view/View.getHeight:()I
      53: i2f
      54: invokespecial #113                // Method android/graphics/RectF."<init>":(FFFF)V
      57: astore_2
      58: aload         7
      60: aload_2
      61: invokevirtual #117                // Method android/graphics/Matrix.mapRect:(Landroid/graphics/RectF;)Z
      64: pop
      65: aload_2
      66: getfield      #44                 // Field android/graphics/RectF.left:F
      69: invokestatic  #32                 // Method java/lang/Math.round:(F)I
      72: istore_3
      73: aload_2
      74: getfield      #47                 // Field android/graphics/RectF.top:F
      77: invokestatic  #32                 // Method java/lang/Math.round:(F)I
      80: istore        4
      82: aload_2
      83: getfield      #120                // Field android/graphics/RectF.right:F
      86: invokestatic  #32                 // Method java/lang/Math.round:(F)I
      89: istore        5
      91: aload_2
      92: getfield      #123                // Field android/graphics/RectF.bottom:F
      95: invokestatic  #32                 // Method java/lang/Math.round:(F)I
      98: istore        6
     100: new           #125                // class android/widget/ImageView
     103: dup
     104: aload_1
     105: invokevirtual #129                // Method android/view/View.getContext:()Landroid/content/Context;
     108: invokespecial #132                // Method android/widget/ImageView."<init>":(Landroid/content/Context;)V
     111: astore_0
     112: aload_0
     113: getstatic     #138                // Field android/widget/ImageView$ScaleType.CENTER_CROP:Landroid/widget/ImageView$ScaleType;
     116: invokevirtual #142                // Method android/widget/ImageView.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
     119: aload_1
     120: aload         7
     122: aload_2
     123: invokestatic  #144                // Method a:(Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/graphics/Bitmap;
     126: astore_1
     127: aload_1
     128: ifnull        136
     131: aload_0
     132: aload_1
     133: invokevirtual #147                // Method android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
     136: aload_0
     137: iload         5
     139: iload_3
     140: isub
     141: ldc           #148                // int 1073741824
     143: invokestatic  #154                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     146: iload         6
     148: iload         4
     150: isub
     151: ldc           #148                // int 1073741824
     153: invokestatic  #154                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     156: invokevirtual #158                // Method android/widget/ImageView.measure:(II)V
     159: aload_0
     160: iload_3
     161: iload         4
     163: iload         5
     165: iload         6
     167: invokevirtual #162                // Method android/widget/ImageView.layout:(IIII)V
     170: aload_0
     171: areturn
}
