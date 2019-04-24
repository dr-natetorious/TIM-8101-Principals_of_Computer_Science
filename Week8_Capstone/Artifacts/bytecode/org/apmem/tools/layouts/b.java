class org.apmem.tools.layouts.b {
  public org.apmem.tools.layouts.b(int);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #20                 // class java/util/ArrayList
       8: dup
       9: invokespecial #21                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #23                 // Field a:Ljava/util/List;
      15: aload_0
      16: iconst_0
      17: putfield      #25                 // Field e:I
      20: aload_0
      21: iconst_0
      22: putfield      #27                 // Field f:I
      25: aload_0
      26: iload_1
      27: putfield      #29                 // Field b:I
      30: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field e:I
       4: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #25                 // Field e:I
       5: return

  public void a(int, android.view.View);
    Code:
       0: aload_2
       1: invokevirtual #38                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #40                 // class org/apmem/tools/layouts/FlowLayout$a
       7: astore_3
       8: aload_0
       9: getfield      #23                 // Field a:Ljava/util/List;
      12: iload_1
      13: aload_2
      14: invokeinterface #46,  3           // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
      19: aload_0
      20: aload_0
      21: getfield      #48                 // Field c:I
      24: aload_3
      25: invokevirtual #50                 // Method org/apmem/tools/layouts/FlowLayout$a.d:()I
      28: iadd
      29: aload_3
      30: invokevirtual #53                 // Method org/apmem/tools/layouts/FlowLayout$a.g:()I
      33: iadd
      34: putfield      #48                 // Field c:I
      37: aload_0
      38: aload_0
      39: getfield      #55                 // Field d:I
      42: aload_3
      43: invokevirtual #57                 // Method org/apmem/tools/layouts/FlowLayout$a.e:()I
      46: aload_3
      47: invokevirtual #60                 // Method org/apmem/tools/layouts/FlowLayout$a.h:()I
      50: iadd
      51: invokestatic  #66                 // Method java/lang/Math.max:(II)I
      54: putfield      #55                 // Field d:I
      57: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #23                 // Field a:Ljava/util/List;
       5: invokeinterface #70,  1           // InterfaceMethod java/util/List.size:()I
      10: aload_1
      11: invokevirtual #72                 // Method a:(ILandroid/view/View;)V
      14: return

  public int b();
    Code:
       0: aload_0
       1: getfield      #55                 // Field d:I
       4: ireturn

  public void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #27                 // Field f:I
       5: return

  public boolean b(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #38                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #40                 // class org/apmem/tools/layouts/FlowLayout$a
       7: astore_1
       8: aload_0
       9: getfield      #48                 // Field c:I
      12: aload_1
      13: invokevirtual #50                 // Method org/apmem/tools/layouts/FlowLayout$a.d:()I
      16: iadd
      17: aload_1
      18: invokevirtual #53                 // Method org/apmem/tools/layouts/FlowLayout$a.g:()I
      21: iadd
      22: aload_0
      23: getfield      #29                 // Field b:I
      26: if_icmpgt     31
      29: iconst_1
      30: ireturn
      31: iconst_0
      32: ireturn

  public int c();
    Code:
       0: aload_0
       1: getfield      #48                 // Field c:I
       4: ireturn

  public void c(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #55                 // Field d:I
       5: return

  public int d();
    Code:
       0: aload_0
       1: getfield      #27                 // Field f:I
       4: ireturn

  public void d(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #48                 // Field c:I
       5: return

  public java.util.List<android.view.View> e();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Ljava/util/List;
       4: areturn
}
