class android.support.transition.f$a {
  android.support.transition.f$a(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #22                 // Field e:Landroid/view/View;
       9: return

  void a(android.graphics.PointF);
    Code:
       0: aload_0
       1: aload_1
       2: getfield      #47                 // Field android/graphics/PointF.x:F
       5: invokestatic  #53                 // Method java/lang/Math.round:(F)I
       8: putfield      #25                 // Field a:I
      11: aload_0
      12: aload_1
      13: getfield      #56                 // Field android/graphics/PointF.y:F
      16: invokestatic  #53                 // Method java/lang/Math.round:(F)I
      19: putfield      #27                 // Field b:I
      22: aload_0
      23: aload_0
      24: getfield      #38                 // Field f:I
      27: iconst_1
      28: iadd
      29: putfield      #38                 // Field f:I
      32: aload_0
      33: getfield      #38                 // Field f:I
      36: aload_0
      37: getfield      #40                 // Field g:I
      40: if_icmpne     47
      43: aload_0
      44: invokespecial #58                 // Method a:()V
      47: return

  void b(android.graphics.PointF);
    Code:
       0: aload_0
       1: aload_1
       2: getfield      #47                 // Field android/graphics/PointF.x:F
       5: invokestatic  #53                 // Method java/lang/Math.round:(F)I
       8: putfield      #29                 // Field c:I
      11: aload_0
      12: aload_1
      13: getfield      #56                 // Field android/graphics/PointF.y:F
      16: invokestatic  #53                 // Method java/lang/Math.round:(F)I
      19: putfield      #31                 // Field d:I
      22: aload_0
      23: aload_0
      24: getfield      #40                 // Field g:I
      27: iconst_1
      28: iadd
      29: putfield      #40                 // Field g:I
      32: aload_0
      33: getfield      #38                 // Field f:I
      36: aload_0
      37: getfield      #40                 // Field g:I
      40: if_icmpne     47
      43: aload_0
      44: invokespecial #58                 // Method a:()V
      47: return
}
