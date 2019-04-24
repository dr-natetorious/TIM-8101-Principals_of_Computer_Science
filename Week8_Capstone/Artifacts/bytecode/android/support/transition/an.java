class android.support.transition.an implements android.support.transition.as {
  android.support.transition.an();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.transition.al a(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #19                 // Method android/support/transition/aj.d:(Landroid/view/View;)Landroid/support/transition/aj;
       4: areturn

  public void a(android.view.View, float);
    Code:
       0: aload_1
       1: getstatic     #26                 // Field android/support/transition/r$a.save_non_transition_alpha:I
       4: invokevirtual #32                 // Method android/view/View.getTag:(I)Ljava/lang/Object;
       7: checkcast     #34                 // class java/lang/Float
      10: astore_3
      11: aload_3
      12: ifnull        26
      15: aload_1
      16: aload_3
      17: invokevirtual #38                 // Method java/lang/Float.floatValue:()F
      20: fload_2
      21: fmul
      22: invokevirtual #42                 // Method android/view/View.setAlpha:(F)V
      25: return
      26: aload_1
      27: fload_2
      28: invokevirtual #42                 // Method android/view/View.setAlpha:(F)V
      31: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_1
       1: iload_2
       2: invokevirtual #47                 // Method android/view/View.setLeft:(I)V
       5: aload_1
       6: iload_3
       7: invokevirtual #50                 // Method android/view/View.setTop:(I)V
      10: aload_1
      11: iload         4
      13: invokevirtual #53                 // Method android/view/View.setRight:(I)V
      16: aload_1
      17: iload         5
      19: invokevirtual #56                 // Method android/view/View.setBottom:(I)V
      22: return

  public void a(android.view.View, android.graphics.Matrix);
    Code:
       0: aload_1
       1: invokevirtual #61                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
       4: astore_3
       5: aload_3
       6: instanceof    #28                 // class android/view/View
       9: ifeq          40
      12: aload_3
      13: checkcast     #28                 // class android/view/View
      16: astore_3
      17: aload_0
      18: aload_3
      19: aload_2
      20: invokevirtual #63                 // Method a:(Landroid/view/View;Landroid/graphics/Matrix;)V
      23: aload_2
      24: aload_3
      25: invokevirtual #67                 // Method android/view/View.getScrollX:()I
      28: ineg
      29: i2f
      30: aload_3
      31: invokevirtual #70                 // Method android/view/View.getScrollY:()I
      34: ineg
      35: i2f
      36: invokevirtual #76                 // Method android/graphics/Matrix.preTranslate:(FF)Z
      39: pop
      40: aload_2
      41: aload_1
      42: invokevirtual #79                 // Method android/view/View.getLeft:()I
      45: i2f
      46: aload_1
      47: invokevirtual #82                 // Method android/view/View.getTop:()I
      50: i2f
      51: invokevirtual #76                 // Method android/graphics/Matrix.preTranslate:(FF)Z
      54: pop
      55: aload_1
      56: invokevirtual #86                 // Method android/view/View.getMatrix:()Landroid/graphics/Matrix;
      59: astore_1
      60: aload_1
      61: invokevirtual #90                 // Method android/graphics/Matrix.isIdentity:()Z
      64: ifne          73
      67: aload_2
      68: aload_1
      69: invokevirtual #94                 // Method android/graphics/Matrix.preConcat:(Landroid/graphics/Matrix;)Z
      72: pop
      73: return

  public android.support.transition.aw b(android.view.View);
    Code:
       0: new           #98                 // class android/support/transition/au
       3: dup
       4: aload_1
       5: invokevirtual #102                // Method android/view/View.getWindowToken:()Landroid/os/IBinder;
       8: invokespecial #105                // Method android/support/transition/au."<init>":(Landroid/os/IBinder;)V
      11: areturn

  public void b(android.view.View, android.graphics.Matrix);
    Code:
       0: aload_1
       1: invokevirtual #61                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
       4: astore_3
       5: aload_3
       6: instanceof    #28                 // class android/view/View
       9: ifeq          38
      12: aload_3
      13: checkcast     #28                 // class android/view/View
      16: astore_3
      17: aload_0
      18: aload_3
      19: aload_2
      20: invokevirtual #107                // Method b:(Landroid/view/View;Landroid/graphics/Matrix;)V
      23: aload_2
      24: aload_3
      25: invokevirtual #67                 // Method android/view/View.getScrollX:()I
      28: i2f
      29: aload_3
      30: invokevirtual #70                 // Method android/view/View.getScrollY:()I
      33: i2f
      34: invokevirtual #110                // Method android/graphics/Matrix.postTranslate:(FF)Z
      37: pop
      38: aload_2
      39: aload_1
      40: invokevirtual #79                 // Method android/view/View.getLeft:()I
      43: i2f
      44: aload_1
      45: invokevirtual #82                 // Method android/view/View.getTop:()I
      48: i2f
      49: invokevirtual #110                // Method android/graphics/Matrix.postTranslate:(FF)Z
      52: pop
      53: aload_1
      54: invokevirtual #86                 // Method android/view/View.getMatrix:()Landroid/graphics/Matrix;
      57: astore_1
      58: aload_1
      59: invokevirtual #90                 // Method android/graphics/Matrix.isIdentity:()Z
      62: ifne          87
      65: new           #72                 // class android/graphics/Matrix
      68: dup
      69: invokespecial #111                // Method android/graphics/Matrix."<init>":()V
      72: astore_3
      73: aload_1
      74: aload_3
      75: invokevirtual #114                // Method android/graphics/Matrix.invert:(Landroid/graphics/Matrix;)Z
      78: ifeq          87
      81: aload_2
      82: aload_3
      83: invokevirtual #117                // Method android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
      86: pop
      87: return

  public float c(android.view.View);
    Code:
       0: aload_1
       1: getstatic     #26                 // Field android/support/transition/r$a.save_non_transition_alpha:I
       4: invokevirtual #32                 // Method android/view/View.getTag:(I)Ljava/lang/Object;
       7: checkcast     #34                 // class java/lang/Float
      10: astore_2
      11: aload_2
      12: ifnull        25
      15: aload_1
      16: invokevirtual #122                // Method android/view/View.getAlpha:()F
      19: aload_2
      20: invokevirtual #38                 // Method java/lang/Float.floatValue:()F
      23: fdiv
      24: freturn
      25: aload_1
      26: invokevirtual #122                // Method android/view/View.getAlpha:()F
      29: freturn

  public void d(android.view.View);
    Code:
       0: aload_1
       1: getstatic     #26                 // Field android/support/transition/r$a.save_non_transition_alpha:I
       4: invokevirtual #32                 // Method android/view/View.getTag:(I)Ljava/lang/Object;
       7: ifnonnull     24
      10: aload_1
      11: getstatic     #26                 // Field android/support/transition/r$a.save_non_transition_alpha:I
      14: aload_1
      15: invokevirtual #122                // Method android/view/View.getAlpha:()F
      18: invokestatic  #127                // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      21: invokevirtual #131                // Method android/view/View.setTag:(ILjava/lang/Object;)V
      24: return

  public void e(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #135                // Method android/view/View.getVisibility:()I
       4: ifne          15
       7: aload_1
       8: getstatic     #26                 // Field android/support/transition/r$a.save_non_transition_alpha:I
      11: aconst_null
      12: invokevirtual #131                // Method android/view/View.setTag:(ILjava/lang/Object;)V
      15: return
}
