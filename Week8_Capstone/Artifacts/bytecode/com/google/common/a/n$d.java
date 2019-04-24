final class com.google.common.a.n$d<E> implements java.util.Iterator<E> {
  com.google.common.a.n$d(com.google.common.a.m<E>, java.util.Iterator<com.google.common.a.m$a<E>>);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #30                 // Field a:Lcom/google/common/a/m;
       9: aload_0
      10: aload_2
      11: putfield      #32                 // Field b:Ljava/util/Iterator;
      14: return

  public boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #39                 // Field d:I
       4: ifgt          24
       7: aload_0
       8: getfield      #32                 // Field b:Ljava/util/Iterator;
      11: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          22
      19: goto          24
      22: iconst_0
      23: ireturn
      24: iconst_1
      25: ireturn

  public E next();
    Code:
       0: aload_0
       1: invokevirtual #44                 // Method hasNext:()Z
       4: ifne          15
       7: new           #46                 // class java/util/NoSuchElementException
      10: dup
      11: invokespecial #47                 // Method java/util/NoSuchElementException."<init>":()V
      14: athrow
      15: aload_0
      16: getfield      #39                 // Field d:I
      19: ifne          58
      22: aload_0
      23: aload_0
      24: getfield      #32                 // Field b:Ljava/util/Iterator;
      27: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      32: checkcast     #51                 // class com/google/common/a/m$a
      35: putfield      #53                 // Field c:Lcom/google/common/a/m$a;
      38: aload_0
      39: getfield      #53                 // Field c:Lcom/google/common/a/m$a;
      42: invokeinterface #56,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      47: istore_1
      48: aload_0
      49: iload_1
      50: putfield      #39                 // Field d:I
      53: aload_0
      54: iload_1
      55: putfield      #58                 // Field e:I
      58: aload_0
      59: aload_0
      60: getfield      #39                 // Field d:I
      63: iconst_1
      64: isub
      65: putfield      #39                 // Field d:I
      68: aload_0
      69: iconst_1
      70: putfield      #60                 // Field f:Z
      73: aload_0
      74: getfield      #53                 // Field c:Lcom/google/common/a/m$a;
      77: invokeinterface #62,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      82: areturn

  public void remove();
    Code:
       0: aload_0
       1: getfield      #60                 // Field f:Z
       4: invokestatic  #69                 // Method com/google/common/a/d.a:(Z)V
       7: aload_0
       8: getfield      #58                 // Field e:I
      11: iconst_1
      12: if_icmpne     27
      15: aload_0
      16: getfield      #32                 // Field b:Ljava/util/Iterator;
      19: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.remove:()V
      24: goto          46
      27: aload_0
      28: getfield      #30                 // Field a:Lcom/google/common/a/m;
      31: aload_0
      32: getfield      #53                 // Field c:Lcom/google/common/a/m$a;
      35: invokeinterface #62,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      40: invokeinterface #76,  2           // InterfaceMethod com/google/common/a/m.remove:(Ljava/lang/Object;)Z
      45: pop
      46: aload_0
      47: aload_0
      48: getfield      #58                 // Field e:I
      51: iconst_1
      52: isub
      53: putfield      #58                 // Field e:I
      56: aload_0
      57: iconst_0
      58: putfield      #60                 // Field f:Z
      61: return
}
