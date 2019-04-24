class android.support.transition.s implements android.animation.TypeEvaluator<android.graphics.Rect> {
  android.support.transition.s();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.graphics.Rect a(float, android.graphics.Rect, android.graphics.Rect);
    Code:
       0: aload_2
       1: getfield      #21                 // Field android/graphics/Rect.left:I
       4: aload_3
       5: getfield      #21                 // Field android/graphics/Rect.left:I
       8: aload_2
       9: getfield      #21                 // Field android/graphics/Rect.left:I
      12: isub
      13: i2f
      14: fload_1
      15: fmul
      16: f2i
      17: iadd
      18: istore        4
      20: aload_2
      21: getfield      #24                 // Field android/graphics/Rect.top:I
      24: aload_3
      25: getfield      #24                 // Field android/graphics/Rect.top:I
      28: aload_2
      29: getfield      #24                 // Field android/graphics/Rect.top:I
      32: isub
      33: i2f
      34: fload_1
      35: fmul
      36: f2i
      37: iadd
      38: istore        5
      40: aload_2
      41: getfield      #27                 // Field android/graphics/Rect.right:I
      44: aload_3
      45: getfield      #27                 // Field android/graphics/Rect.right:I
      48: aload_2
      49: getfield      #27                 // Field android/graphics/Rect.right:I
      52: isub
      53: i2f
      54: fload_1
      55: fmul
      56: f2i
      57: iadd
      58: istore        6
      60: aload_2
      61: getfield      #30                 // Field android/graphics/Rect.bottom:I
      64: aload_3
      65: getfield      #30                 // Field android/graphics/Rect.bottom:I
      68: aload_2
      69: getfield      #30                 // Field android/graphics/Rect.bottom:I
      72: isub
      73: i2f
      74: fload_1
      75: fmul
      76: f2i
      77: iadd
      78: istore        7
      80: aload_0
      81: getfield      #32                 // Field a:Landroid/graphics/Rect;
      84: ifnonnull     103
      87: new           #17                 // class android/graphics/Rect
      90: dup
      91: iload         4
      93: iload         5
      95: iload         6
      97: iload         7
      99: invokespecial #35                 // Method android/graphics/Rect."<init>":(IIII)V
     102: areturn
     103: aload_0
     104: getfield      #32                 // Field a:Landroid/graphics/Rect;
     107: iload         4
     109: iload         5
     111: iload         6
     113: iload         7
     115: invokevirtual #38                 // Method android/graphics/Rect.set:(IIII)V
     118: aload_0
     119: getfield      #32                 // Field a:Landroid/graphics/Rect;
     122: areturn

  public java.lang.Object evaluate(float, java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: fload_1
       2: aload_2
       3: checkcast     #17                 // class android/graphics/Rect
       6: aload_3
       7: checkcast     #17                 // class android/graphics/Rect
      10: invokevirtual #42                 // Method a:(FLandroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Rect;
      13: areturn
}
