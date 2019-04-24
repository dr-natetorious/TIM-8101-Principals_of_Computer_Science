class android.support.design.widget.o {
  public android.support.design.widget.o(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #18                 // Field a:Landroid/view/View;
       9: return

  public void a();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #18                 // Field a:Landroid/view/View;
       5: invokevirtual #27                 // Method android/view/View.getTop:()I
       8: putfield      #29                 // Field b:I
      11: aload_0
      12: aload_0
      13: getfield      #18                 // Field a:Landroid/view/View;
      16: invokevirtual #39                 // Method android/view/View.getLeft:()I
      19: putfield      #41                 // Field c:I
      22: aload_0
      23: invokespecial #45                 // Method c:()V
      26: return

  public boolean a(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field d:I
       4: iload_1
       5: if_icmpeq     19
       8: aload_0
       9: iload_1
      10: putfield      #21                 // Field d:I
      13: aload_0
      14: invokespecial #45                 // Method c:()V
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #21                 // Field d:I
       4: ireturn

  public boolean b(int);
    Code:
       0: aload_0
       1: getfield      #36                 // Field e:I
       4: iload_1
       5: if_icmpeq     19
       8: aload_0
       9: iload_1
      10: putfield      #36                 // Field e:I
      13: aload_0
      14: invokespecial #45                 // Method c:()V
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn
}
