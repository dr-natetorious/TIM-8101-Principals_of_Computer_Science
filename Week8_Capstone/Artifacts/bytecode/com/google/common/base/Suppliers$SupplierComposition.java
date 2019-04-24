class com.google.common.base.Suppliers$SupplierComposition<F, T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
  final com.google.common.base.Function<? super F, T> function;

  final com.google.common.base.Supplier<F> supplier;

  com.google.common.base.Suppliers$SupplierComposition(com.google.common.base.Function<? super F, T>, com.google.common.base.Supplier<F>);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #29                 // Field function:Lcom/google/common/base/Function;
       9: aload_0
      10: aload_2
      11: putfield      #31                 // Field supplier:Lcom/google/common/base/Supplier;
      14: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Suppliers$SupplierComposition
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          56
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Suppliers$SupplierComposition
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #29                 // Field function:Lcom/google/common/base/Function;
      26: aload_1
      27: getfield      #29                 // Field function:Lcom/google/common/base/Function;
      30: invokeinterface #40,  2           // InterfaceMethod com/google/common/base/Function.equals:(Ljava/lang/Object;)Z
      35: ifeq          56
      38: iload_3
      39: istore_2
      40: aload_0
      41: getfield      #31                 // Field supplier:Lcom/google/common/base/Supplier;
      44: aload_1
      45: getfield      #31                 // Field supplier:Lcom/google/common/base/Supplier;
      48: invokevirtual #41                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      51: ifeq          56
      54: iconst_1
      55: istore_2
      56: iload_2
      57: ireturn

  public T get();
    Code:
       0: aload_0
       1: getfield      #29                 // Field function:Lcom/google/common/base/Function;
       4: aload_0
       5: getfield      #31                 // Field supplier:Lcom/google/common/base/Supplier;
       8: invokeinterface #45,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
      13: invokeinterface #49,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      18: areturn

  public int hashCode();
    Code:
       0: iconst_2
       1: anewarray     #5                  // class java/lang/Object
       4: dup
       5: iconst_0
       6: aload_0
       7: getfield      #29                 // Field function:Lcom/google/common/base/Function;
      10: aastore
      11: dup
      12: iconst_1
      13: aload_0
      14: getfield      #31                 // Field supplier:Lcom/google/common/base/Supplier;
      17: aastore
      18: invokestatic  #57                 // Method com/google/common/base/Objects.hashCode:([Ljava/lang/Object;)I
      21: ireturn

  public java.lang.String toString();
    Code:
       0: new           #61                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #64                 // String Suppliers.compose(
      11: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #29                 // Field function:Lcom/google/common/base/Function;
      20: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #73                 // String ,
      27: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #31                 // Field supplier:Lcom/google/common/base/Supplier;
      36: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #75                 // String )
      43: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #77                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
