final class com.google.common.base.Suppliers$SupplierFunctionImpl extends java.lang.Enum<com.google.common.base.Suppliers$SupplierFunctionImpl> implements com.google.common.base.Suppliers$SupplierFunction<java.lang.Object> {
  public static final com.google.common.base.Suppliers$SupplierFunctionImpl INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/Suppliers$SupplierFunctionImpl
       3: dup
       4: ldc           #17                 // String INSTANCE
       6: iconst_0
       7: invokespecial #21                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #23                 // Field INSTANCE:Lcom/google/common/base/Suppliers$SupplierFunctionImpl;
      13: iconst_1
      14: anewarray     #2                  // class com/google/common/base/Suppliers$SupplierFunctionImpl
      17: dup
      18: iconst_0
      19: getstatic     #23                 // Field INSTANCE:Lcom/google/common/base/Suppliers$SupplierFunctionImpl;
      22: aastore
      23: putstatic     #25                 // Field $VALUES:[Lcom/google/common/base/Suppliers$SupplierFunctionImpl;
      26: return

  public static com.google.common.base.Suppliers$SupplierFunctionImpl valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/base/Suppliers$SupplierFunctionImpl
       2: aload_0
       3: invokestatic  #33                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/base/Suppliers$SupplierFunctionImpl
       9: areturn

  public static com.google.common.base.Suppliers$SupplierFunctionImpl[] values();
    Code:
       0: getstatic     #25                 // Field $VALUES:[Lcom/google/common/base/Suppliers$SupplierFunctionImpl;
       3: invokevirtual #40                 // Method "[Lcom/google/common/base/Suppliers$SupplierFunctionImpl;".clone:()Ljava/lang/Object;
       6: checkcast     #36                 // class "[Lcom/google/common/base/Suppliers$SupplierFunctionImpl;"
       9: areturn

  public java.lang.Object apply(com.google.common.base.Supplier<java.lang.Object>);
    Code:
       0: aload_1
       1: invokeinterface #47,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
       6: areturn

  public java.lang.Object apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #44                 // class com/google/common/base/Supplier
       5: invokevirtual #51                 // Method apply:(Lcom/google/common/base/Supplier;)Ljava/lang/Object;
       8: areturn

  public java.lang.String toString();
    Code:
       0: ldc           #55                 // String Suppliers.supplierFunction()
       2: areturn
}
