class com.google.common.base.Suppliers$ThreadSafeSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
  final com.google.common.base.Supplier<T> delegate;

  com.google.common.base.Suppliers$ThreadSafeSupplier(com.google.common.base.Supplier<T>);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #26                 // Field delegate:Lcom/google/common/base/Supplier;
       9: return

  public T get();
    Code:
       0: aload_0
       1: getfield      #26                 // Field delegate:Lcom/google/common/base/Supplier;
       4: astore_1
       5: aload_1
       6: monitorenter
       7: aload_0
       8: getfield      #26                 // Field delegate:Lcom/google/common/base/Supplier;
      11: invokeinterface #33,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
      16: astore_2
      17: aload_1
      18: monitorexit
      19: aload_2
      20: areturn
      21: astore_2
      22: aload_1
      23: monitorexit
      24: aload_2
      25: athrow
    Exception table:
       from    to  target type
           7    19    21   any
          22    24    21   any

  public java.lang.String toString();
    Code:
       0: new           #38                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #39                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #41                 // String Suppliers.synchronizedSupplier(
      11: invokevirtual #45                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #26                 // Field delegate:Lcom/google/common/base/Supplier;
      20: invokevirtual #48                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #50                 // String )
      27: invokevirtual #45                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #52                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
