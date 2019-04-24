abstract class com.google.common.a.n$a<E> implements com.google.common.a.m$a<E> {
  com.google.common.a.n$a();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #7                  // class com/google/common/a/m$a
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          55
      15: aload_1
      16: checkcast     #7                  // class com/google/common/a/m$a
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: invokevirtual #21                 // Method b:()I
      26: aload_1
      27: invokeinterface #22,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      32: if_icmpne     55
      35: iload_3
      36: istore_2
      37: aload_0
      38: invokevirtual #25                 // Method a:()Ljava/lang/Object;
      41: aload_1
      42: invokeinterface #26,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      47: invokestatic  #32                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      50: ifeq          55
      53: iconst_1
      54: istore_2
      55: iload_2
      56: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: invokevirtual #25                 // Method a:()Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: ifnonnull     14
       9: iconst_0
      10: istore_1
      11: goto          19
      14: aload_2
      15: invokevirtual #35                 // Method java/lang/Object.hashCode:()I
      18: istore_1
      19: iload_1
      20: aload_0
      21: invokevirtual #21                 // Method b:()I
      24: ixor
      25: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokevirtual #25                 // Method a:()Ljava/lang/Object;
       4: invokestatic  #43                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       7: astore_2
       8: aload_0
       9: invokevirtual #21                 // Method b:()I
      12: istore_1
      13: iload_1
      14: iconst_1
      15: if_icmpne     20
      18: aload_2
      19: areturn
      20: new           #45                 // class java/lang/StringBuilder
      23: dup
      24: invokespecial #46                 // Method java/lang/StringBuilder."<init>":()V
      27: astore_3
      28: aload_3
      29: aload_2
      30: invokevirtual #50                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_3
      35: ldc           #52                 // String  x
      37: invokevirtual #50                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: pop
      41: aload_3
      42: iload_1
      43: invokevirtual #55                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      46: pop
      47: aload_3
      48: invokevirtual #57                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
