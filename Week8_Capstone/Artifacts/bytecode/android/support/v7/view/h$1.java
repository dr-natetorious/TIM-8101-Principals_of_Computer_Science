class android.support.v7.view.h$1 extends android.support.v4.view.z {
  final android.support.v7.view.h a;

  android.support.v7.view.h$1(android.support.v7.view.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v7/view/h;
       5: aload_0
       6: invokespecial #19                 // Method android/support/v4/view/z."<init>":()V
       9: aload_0
      10: iconst_0
      11: putfield      #21                 // Field b:Z
      14: aload_0
      15: iconst_0
      16: putfield      #23                 // Field c:I
      19: return

  void a();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #23                 // Field c:I
       5: aload_0
       6: iconst_0
       7: putfield      #21                 // Field b:Z
      10: aload_0
      11: getfield      #16                 // Field a:Landroid/support/v7/view/h;
      14: invokevirtual #26                 // Method android/support/v7/view/h.b:()V
      17: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: iconst_1
      10: putfield      #21                 // Field b:Z
      13: aload_0
      14: getfield      #16                 // Field a:Landroid/support/v7/view/h;
      17: getfield      #30                 // Field android/support/v7/view/h.b:Landroid/support/v4/view/y;
      20: ifnull        36
      23: aload_0
      24: getfield      #16                 // Field a:Landroid/support/v7/view/h;
      27: getfield      #30                 // Field android/support/v7/view/h.b:Landroid/support/v4/view/y;
      30: aconst_null
      31: invokeinterface #34,  2           // InterfaceMethod android/support/v4/view/y.a:(Landroid/view/View;)V
      36: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:I
       4: iconst_1
       5: iadd
       6: istore_2
       7: aload_0
       8: iload_2
       9: putfield      #23                 // Field c:I
      12: iload_2
      13: aload_0
      14: getfield      #16                 // Field a:Landroid/support/v7/view/h;
      17: getfield      #37                 // Field android/support/v7/view/h.a:Ljava/util/ArrayList;
      20: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      23: if_icmpne     53
      26: aload_0
      27: getfield      #16                 // Field a:Landroid/support/v7/view/h;
      30: getfield      #30                 // Field android/support/v7/view/h.b:Landroid/support/v4/view/y;
      33: ifnull        49
      36: aload_0
      37: getfield      #16                 // Field a:Landroid/support/v7/view/h;
      40: getfield      #30                 // Field android/support/v7/view/h.b:Landroid/support/v4/view/y;
      43: aconst_null
      44: invokeinterface #45,  2           // InterfaceMethod android/support/v4/view/y.b:(Landroid/view/View;)V
      49: aload_0
      50: invokevirtual #47                 // Method a:()V
      53: return
}
