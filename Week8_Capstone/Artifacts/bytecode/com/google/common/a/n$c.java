abstract class com.google.common.a.n$c<E> extends com.google.common.a.p$a<com.google.common.a.m$a<E>> {
  com.google.common.a.n$c();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method com/google/common/a/p$a."<init>":()V
       4: return

  abstract com.google.common.a.m<E> a();

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Lcom/google/common/a/m;
       4: invokeinterface #22,  1           // InterfaceMethod com/google/common/a/m.clear:()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #26                 // class com/google/common/a/m$a
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          59
      15: aload_1
      16: checkcast     #26                 // class com/google/common/a/m$a
      19: astore_1
      20: aload_1
      21: invokeinterface #30,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      26: ifgt          31
      29: iconst_0
      30: ireturn
      31: iload_3
      32: istore_2
      33: aload_0
      34: invokevirtual #18                 // Method a:()Lcom/google/common/a/m;
      37: aload_1
      38: invokeinterface #33,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      43: invokeinterface #36,  2           // InterfaceMethod com/google/common/a/m.a:(Ljava/lang/Object;)I
      48: aload_1
      49: invokeinterface #30,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      54: if_icmpne     59
      57: iconst_1
      58: istore_2
      59: iload_2
      60: ireturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #26                 // class com/google/common/a/m$a
       4: ifeq          43
       7: aload_1
       8: checkcast     #26                 // class com/google/common/a/m$a
      11: astore_1
      12: aload_1
      13: invokeinterface #33,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      18: astore_3
      19: aload_1
      20: invokeinterface #30,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      25: istore_2
      26: iload_2
      27: ifeq          43
      30: aload_0
      31: invokevirtual #18                 // Method a:()Lcom/google/common/a/m;
      34: aload_3
      35: iload_2
      36: iconst_0
      37: invokeinterface #40,  4           // InterfaceMethod com/google/common/a/m.a:(Ljava/lang/Object;II)Z
      42: ireturn
      43: iconst_0
      44: ireturn
}
