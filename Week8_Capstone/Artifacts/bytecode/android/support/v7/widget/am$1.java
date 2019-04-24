class android.support.v7.widget.am$1 implements java.lang.Runnable {
  final java.util.ArrayList a;

  final android.support.v7.widget.am b;

  android.support.v7.widget.am$1(android.support.v7.widget.am, java.util.ArrayList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/support/v7/widget/am;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field a:Ljava/util/ArrayList;
      10: aload_0
      11: invokespecial #22                 // Method java/lang/Object."<init>":()V
      14: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #30                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
       7: astore_1
       8: aload_1
       9: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      14: ifeq          57
      17: aload_1
      18: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: checkcast     #42                 // class android/support/v7/widget/am$b
      26: astore_2
      27: aload_0
      28: getfield      #18                 // Field b:Landroid/support/v7/widget/am;
      31: aload_2
      32: getfield      #45                 // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
      35: aload_2
      36: getfield      #48                 // Field android/support/v7/widget/am$b.b:I
      39: aload_2
      40: getfield      #51                 // Field android/support/v7/widget/am$b.c:I
      43: aload_2
      44: getfield      #54                 // Field android/support/v7/widget/am$b.d:I
      47: aload_2
      48: getfield      #57                 // Field android/support/v7/widget/am$b.e:I
      51: invokevirtual #60                 // Method android/support/v7/widget/am.b:(Landroid/support/v7/widget/RecyclerView$x;IIII)V
      54: goto          8
      57: aload_0
      58: getfield      #20                 // Field a:Ljava/util/ArrayList;
      61: invokevirtual #63                 // Method java/util/ArrayList.clear:()V
      64: aload_0
      65: getfield      #18                 // Field b:Landroid/support/v7/widget/am;
      68: getfield      #65                 // Field android/support/v7/widget/am.b:Ljava/util/ArrayList;
      71: aload_0
      72: getfield      #20                 // Field a:Ljava/util/ArrayList;
      75: invokevirtual #69                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      78: pop
      79: return
}
