final class com.c.a.g$b implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
  final com.c.a.g a;

  final android.view.View b;

  com.c.a.g$b(com.c.a.g, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Lcom/c/a/g;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field b:Landroid/view/View;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public final void onGlobalLayout();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Lcom/c/a/g;
       4: invokevirtual #30                 // Method com/c/a/g.getEngine:()Lcom/c/a/f;
       7: aload_0
       8: getfield      #21                 // Field b:Landroid/view/View;
      11: invokevirtual #36                 // Method android/view/View.getWidth:()I
      14: i2f
      15: aload_0
      16: getfield      #21                 // Field b:Landroid/view/View;
      19: invokevirtual #39                 // Method android/view/View.getHeight:()I
      22: i2f
      23: iconst_0
      24: iconst_4
      25: aconst_null
      26: invokestatic  #44                 // Method com/c/a/f.a:(Lcom/c/a/f;FFZILjava/lang/Object;)V
      29: return
}
