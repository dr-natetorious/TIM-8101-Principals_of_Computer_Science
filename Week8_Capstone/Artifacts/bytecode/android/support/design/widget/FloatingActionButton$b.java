class android.support.design.widget.FloatingActionButton$b implements android.support.design.widget.j {
  final android.support.design.widget.FloatingActionButton a;

  android.support.design.widget.FloatingActionButton$b(android.support.design.widget.FloatingActionButton);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public float a();
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
       4: invokevirtual #24                 // Method android/support/design/widget/FloatingActionButton.getSizeDimension:()I
       7: i2f
       8: fconst_2
       9: fdiv
      10: freturn

  public void a(int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
       4: getfield      #29                 // Field android/support/design/widget/FloatingActionButton.c:Landroid/graphics/Rect;
       7: iload_1
       8: iload_2
       9: iload_3
      10: iload         4
      12: invokevirtual #34                 // Method android/graphics/Rect.set:(IIII)V
      15: aload_0
      16: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
      19: iload_1
      20: aload_0
      21: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
      24: getfield      #37                 // Field android/support/design/widget/FloatingActionButton.a:I
      27: iadd
      28: iload_2
      29: aload_0
      30: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
      33: getfield      #37                 // Field android/support/design/widget/FloatingActionButton.a:I
      36: iadd
      37: iload_3
      38: aload_0
      39: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
      42: getfield      #37                 // Field android/support/design/widget/FloatingActionButton.a:I
      45: iadd
      46: iload         4
      48: aload_0
      49: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
      52: getfield      #37                 // Field android/support/design/widget/FloatingActionButton.a:I
      55: iadd
      56: invokevirtual #40                 // Method android/support/design/widget/FloatingActionButton.setPadding:(IIII)V
      59: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
       4: aload_1
       5: invokestatic  #44                 // Method android/support/design/widget/FloatingActionButton.a:(Landroid/support/design/widget/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V
       8: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/FloatingActionButton;
       4: getfield      #48                 // Field android/support/design/widget/FloatingActionButton.b:Z
       7: ireturn
}
