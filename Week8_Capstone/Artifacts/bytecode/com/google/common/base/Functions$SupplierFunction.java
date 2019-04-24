class com.google.common.base.Functions$SupplierFunction<T> implements com.google.common.base.Function<java.lang.Object, T>, java.io.Serializable {
  com.google.common.base.Functions$SupplierFunction(com.google.common.base.Supplier, com.google.common.base.Functions$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Lcom/google/common/base/Supplier;)V
       5: return

  public T apply(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #34                 // Field supplier:Lcom/google/common/base/Supplier;
       4: invokeinterface #45,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
       9: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Functions$SupplierFunction
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Functions$SupplierFunction
      11: astore_1
      12: aload_0
      13: getfield      #34                 // Field supplier:Lcom/google/common/base/Supplier;
      16: aload_1
      17: getfield      #34                 // Field supplier:Lcom/google/common/base/Supplier;
      20: invokevirtual #50                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #34                 // Field supplier:Lcom/google/common/base/Supplier;
       4: invokevirtual #54                 // Method java/lang/Object.hashCode:()I
       7: ireturn

  public java.lang.String toString();
    Code:
       0: new           #58                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #59                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #61                 // String Functions.forSupplier(
      11: invokevirtual #65                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #34                 // Field supplier:Lcom/google/common/base/Supplier;
      20: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #70                 // String )
      27: invokevirtual #65                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #72                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
