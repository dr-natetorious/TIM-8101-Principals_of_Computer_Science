class com.google.common.base.Suppliers$NonSerializableMemoizingSupplier<T> implements com.google.common.base.Supplier<T> {
  volatile com.google.common.base.Supplier<T> delegate;

  volatile boolean initialized;

  T value;

  com.google.common.base.Suppliers$NonSerializableMemoizingSupplier(com.google.common.base.Supplier<T>);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #29                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #7                  // class com/google/common/base/Supplier
      12: putfield      #31                 // Field delegate:Lcom/google/common/base/Supplier;
      15: return

  public T get();
    Code:
       0: aload_0
       1: getfield      #38                 // Field initialized:Z
       4: ifne          55
       7: aload_0
       8: monitorenter
       9: aload_0
      10: getfield      #38                 // Field initialized:Z
      13: ifne          45
      16: aload_0
      17: getfield      #31                 // Field delegate:Lcom/google/common/base/Supplier;
      20: invokeinterface #40,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
      25: astore_1
      26: aload_0
      27: aload_1
      28: putfield      #42                 // Field value:Ljava/lang/Object;
      31: aload_0
      32: iconst_1
      33: putfield      #38                 // Field initialized:Z
      36: aload_0
      37: aconst_null
      38: putfield      #31                 // Field delegate:Lcom/google/common/base/Supplier;
      41: aload_0
      42: monitorexit
      43: aload_1
      44: areturn
      45: aload_0
      46: monitorexit
      47: goto          55
      50: astore_1
      51: aload_0
      52: monitorexit
      53: aload_1
      54: athrow
      55: aload_0
      56: getfield      #42                 // Field value:Ljava/lang/Object;
      59: areturn
    Exception table:
       from    to  target type
           9    43    50   any
          45    47    50   any
          51    53    50   any

  public java.lang.String toString();
    Code:
       0: new           #47                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #48                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #50                 // String Suppliers.memoize(
      11: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #31                 // Field delegate:Lcom/google/common/base/Supplier;
      20: invokevirtual #57                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #59                 // String )
      27: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #61                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
