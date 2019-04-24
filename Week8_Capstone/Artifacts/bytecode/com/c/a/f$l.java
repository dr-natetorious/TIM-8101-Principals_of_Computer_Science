public final class com.c.a.f$l implements java.lang.Runnable {
  final com.c.a.f a;

  com.c.a.f$l();
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lcom/c/a/f;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lcom/c/a/f;
       4: invokestatic  #27                 // Method com/c/a/f.r:(Lcom/c/a/f;)Landroid/widget/OverScroller;
       7: invokevirtual #33                 // Method android/widget/OverScroller.isFinished:()Z
      10: ifeq          23
      13: aload_0
      14: getfield      #17                 // Field a:Lcom/c/a/f;
      17: iconst_0
      18: invokestatic  #36                 // Method com/c/a/f.a:(Lcom/c/a/f;I)Z
      21: pop
      22: return
      23: aload_0
      24: getfield      #17                 // Field a:Lcom/c/a/f;
      27: invokestatic  #27                 // Method com/c/a/f.r:(Lcom/c/a/f;)Landroid/widget/OverScroller;
      30: invokevirtual #39                 // Method android/widget/OverScroller.computeScrollOffset:()Z
      33: ifeq          100
      36: aload_0
      37: getfield      #17                 // Field a:Lcom/c/a/f;
      40: invokestatic  #27                 // Method com/c/a/f.r:(Lcom/c/a/f;)Landroid/widget/OverScroller;
      43: invokevirtual #43                 // Method android/widget/OverScroller.getCurrX:()I
      46: istore_1
      47: aload_0
      48: getfield      #17                 // Field a:Lcom/c/a/f;
      51: invokestatic  #27                 // Method com/c/a/f.r:(Lcom/c/a/f;)Landroid/widget/OverScroller;
      54: invokevirtual #46                 // Method android/widget/OverScroller.getCurrY:()I
      57: istore_2
      58: aload_0
      59: getfield      #17                 // Field a:Lcom/c/a/f;
      62: iload_1
      63: i2f
      64: aload_0
      65: getfield      #17                 // Field a:Lcom/c/a/f;
      68: invokestatic  #50                 // Method com/c/a/f.s:(Lcom/c/a/f;)F
      71: fsub
      72: iload_2
      73: i2f
      74: aload_0
      75: getfield      #17                 // Field a:Lcom/c/a/f;
      78: invokestatic  #53                 // Method com/c/a/f.t:(Lcom/c/a/f;)F
      81: fsub
      82: iconst_1
      83: invokestatic  #56                 // Method com/c/a/f.a:(Lcom/c/a/f;FFZ)V
      86: aload_0
      87: getfield      #17                 // Field a:Lcom/c/a/f;
      90: invokestatic  #60                 // Method com/c/a/f.u:(Lcom/c/a/f;)Landroid/view/View;
      93: aload_0
      94: checkcast     #6                  // class java/lang/Runnable
      97: invokevirtual #66                 // Method android/view/View.postOnAnimation:(Ljava/lang/Runnable;)V
     100: return
}
