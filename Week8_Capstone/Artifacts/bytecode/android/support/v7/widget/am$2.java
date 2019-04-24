class android.support.v7.widget.am$2 implements java.lang.Runnable {
  final java.util.ArrayList a;

  final android.support.v7.widget.am b;

  android.support.v7.widget.am$2(android.support.v7.widget.am, java.util.ArrayList);
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
      14: ifeq          38
      17: aload_1
      18: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: checkcast     #42                 // class android/support/v7/widget/am$a
      26: astore_2
      27: aload_0
      28: getfield      #18                 // Field b:Landroid/support/v7/widget/am;
      31: aload_2
      32: invokevirtual #45                 // Method android/support/v7/widget/am.a:(Landroid/support/v7/widget/am$a;)V
      35: goto          8
      38: aload_0
      39: getfield      #20                 // Field a:Ljava/util/ArrayList;
      42: invokevirtual #48                 // Method java/util/ArrayList.clear:()V
      45: aload_0
      46: getfield      #18                 // Field b:Landroid/support/v7/widget/am;
      49: getfield      #51                 // Field android/support/v7/widget/am.c:Ljava/util/ArrayList;
      52: aload_0
      53: getfield      #20                 // Field a:Ljava/util/ArrayList;
      56: invokevirtual #55                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      59: pop
      60: return
}
