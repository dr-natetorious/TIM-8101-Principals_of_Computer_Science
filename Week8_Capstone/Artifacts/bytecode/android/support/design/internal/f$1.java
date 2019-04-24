class android.support.design.internal.f$1 implements android.support.v4.view.p {
  final android.support.design.internal.f a;

  android.support.design.internal.f$1(android.support.design.internal.f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/design/internal/f;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public android.support.v4.view.ab a(android.view.View, android.support.v4.view.ab);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/design/internal/f;
       4: getfield      #25                 // Field android/support/design/internal/f.b:Landroid/graphics/Rect;
       7: ifnonnull     24
      10: aload_0
      11: getfield      #16                 // Field a:Landroid/support/design/internal/f;
      14: new           #27                 // class android/graphics/Rect
      17: dup
      18: invokespecial #28                 // Method android/graphics/Rect."<init>":()V
      21: putfield      #25                 // Field android/support/design/internal/f.b:Landroid/graphics/Rect;
      24: aload_0
      25: getfield      #16                 // Field a:Landroid/support/design/internal/f;
      28: getfield      #25                 // Field android/support/design/internal/f.b:Landroid/graphics/Rect;
      31: aload_2
      32: invokevirtual #33                 // Method android/support/v4/view/ab.a:()I
      35: aload_2
      36: invokevirtual #35                 // Method android/support/v4/view/ab.b:()I
      39: aload_2
      40: invokevirtual #38                 // Method android/support/v4/view/ab.c:()I
      43: aload_2
      44: invokevirtual #41                 // Method android/support/v4/view/ab.d:()I
      47: invokevirtual #45                 // Method android/graphics/Rect.set:(IIII)V
      50: aload_0
      51: getfield      #16                 // Field a:Landroid/support/design/internal/f;
      54: aload_2
      55: invokevirtual #48                 // Method android/support/design/internal/f.a:(Landroid/support/v4/view/ab;)V
      58: aload_0
      59: getfield      #16                 // Field a:Landroid/support/design/internal/f;
      62: astore_1
      63: aload_2
      64: invokevirtual #52                 // Method android/support/v4/view/ab.e:()Z
      67: ifeq          88
      70: aload_0
      71: getfield      #16                 // Field a:Landroid/support/design/internal/f;
      74: getfield      #55                 // Field android/support/design/internal/f.a:Landroid/graphics/drawable/Drawable;
      77: ifnonnull     83
      80: goto          88
      83: iconst_0
      84: istore_3
      85: goto          90
      88: iconst_1
      89: istore_3
      90: aload_1
      91: iload_3
      92: invokevirtual #59                 // Method android/support/design/internal/f.setWillNotDraw:(Z)V
      95: aload_0
      96: getfield      #16                 // Field a:Landroid/support/design/internal/f;
      99: invokestatic  #64                 // Method android/support/v4/view/s.c:(Landroid/view/View;)V
     102: aload_2
     103: invokevirtual #68                 // Method android/support/v4/view/ab.g:()Landroid/support/v4/view/ab;
     106: areturn
}
