public class android.support.v4.widget.q {
  static {};
    Code:
       0: new           #13                 // class java/lang/ThreadLocal
       3: dup
       4: invokespecial #16                 // Method java/lang/ThreadLocal."<init>":()V
       7: putstatic     #18                 // Field a:Ljava/lang/ThreadLocal;
      10: new           #13                 // class java/lang/ThreadLocal
      13: dup
      14: invokespecial #16                 // Method java/lang/ThreadLocal."<init>":()V
      17: putstatic     #20                 // Field b:Ljava/lang/ThreadLocal;
      20: return

  static void a(android.view.ViewGroup, android.view.View, android.graphics.Rect);
    Code:
       0: getstatic     #18                 // Field a:Ljava/lang/ThreadLocal;
       3: invokevirtual #26                 // Method java/lang/ThreadLocal.get:()Ljava/lang/Object;
       6: checkcast     #28                 // class android/graphics/Matrix
       9: astore_3
      10: aload_3
      11: ifnonnull     32
      14: new           #28                 // class android/graphics/Matrix
      17: dup
      18: invokespecial #29                 // Method android/graphics/Matrix."<init>":()V
      21: astore_3
      22: getstatic     #18                 // Field a:Ljava/lang/ThreadLocal;
      25: aload_3
      26: invokevirtual #33                 // Method java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
      29: goto          36
      32: aload_3
      33: invokevirtual #36                 // Method android/graphics/Matrix.reset:()V
      36: aload_0
      37: aload_1
      38: aload_3
      39: invokestatic  #39                 // Method a:(Landroid/view/ViewParent;Landroid/view/View;Landroid/graphics/Matrix;)V
      42: getstatic     #20                 // Field b:Ljava/lang/ThreadLocal;
      45: invokevirtual #26                 // Method java/lang/ThreadLocal.get:()Ljava/lang/Object;
      48: checkcast     #41                 // class android/graphics/RectF
      51: astore_1
      52: aload_1
      53: astore_0
      54: aload_1
      55: ifnonnull     73
      58: new           #41                 // class android/graphics/RectF
      61: dup
      62: invokespecial #42                 // Method android/graphics/RectF."<init>":()V
      65: astore_0
      66: getstatic     #20                 // Field b:Ljava/lang/ThreadLocal;
      69: aload_0
      70: invokevirtual #33                 // Method java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
      73: aload_0
      74: aload_2
      75: invokevirtual #45                 // Method android/graphics/RectF.set:(Landroid/graphics/Rect;)V
      78: aload_3
      79: aload_0
      80: invokevirtual #49                 // Method android/graphics/Matrix.mapRect:(Landroid/graphics/RectF;)Z
      83: pop
      84: aload_2
      85: aload_0
      86: getfield      #53                 // Field android/graphics/RectF.left:F
      89: ldc           #54                 // float 0.5f
      91: fadd
      92: f2i
      93: aload_0
      94: getfield      #57                 // Field android/graphics/RectF.top:F
      97: ldc           #54                 // float 0.5f
      99: fadd
     100: f2i
     101: aload_0
     102: getfield      #60                 // Field android/graphics/RectF.right:F
     105: ldc           #54                 // float 0.5f
     107: fadd
     108: f2i
     109: aload_0
     110: getfield      #63                 // Field android/graphics/RectF.bottom:F
     113: ldc           #54                 // float 0.5f
     115: fadd
     116: f2i
     117: invokevirtual #68                 // Method android/graphics/Rect.set:(IIII)V
     120: return

  public static void b(android.view.ViewGroup, android.view.View, android.graphics.Rect);
    Code:
       0: aload_2
       1: iconst_0
       2: iconst_0
       3: aload_1
       4: invokevirtual #106                // Method android/view/View.getWidth:()I
       7: aload_1
       8: invokevirtual #109                // Method android/view/View.getHeight:()I
      11: invokevirtual #68                 // Method android/graphics/Rect.set:(IIII)V
      14: aload_0
      15: aload_1
      16: aload_2
      17: invokestatic  #111                // Method a:(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V
      20: return
}
