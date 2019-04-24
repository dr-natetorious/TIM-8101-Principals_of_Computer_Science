class com.google.common.base.Suppliers$MemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
  final com.google.common.base.Supplier<T> delegate;

  volatile transient boolean initialized;

  transient T value;

  com.google.common.base.Suppliers$MemoizingSupplier(com.google.common.base.Supplier<T>);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #35                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #7                  // class com/google/common/base/Supplier
      12: putfield      #37                 // Field delegate:Lcom/google/common/base/Supplier;
      15: return

  public T get();
    Code:
       0: aload_0
       1: getfield      #44                 // Field initialized:Z
       4: ifne          50
       7: aload_0
       8: monitorenter
       9: aload_0
      10: getfield      #44                 // Field initialized:Z
      13: ifne          40
      16: aload_0
      17: getfield      #37                 // Field delegate:Lcom/google/common/base/Supplier;
      20: invokeinterface #46,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
      25: astore_1
      26: aload_0
      27: aload_1
      28: putfield      #48                 // Field value:Ljava/lang/Object;
      31: aload_0
      32: iconst_1
      33: putfield      #44                 // Field initialized:Z
      36: aload_0
      37: monitorexit
      38: aload_1
      39: areturn
      40: aload_0
      41: monitorexit
      42: goto          50
      45: astore_1
      46: aload_0
      47: monitorexit
      48: aload_1
      49: athrow
      50: aload_0
      51: getfield      #48                 // Field value:Ljava/lang/Object;
      54: areturn
    Exception table:
       from    to  target type
           9    38    45   any
          40    42    45   any
          46    48    45   any

  public java.lang.String toString();
    Code:
       0: new           #53                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #54                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #56                 // String Suppliers.memoize(
      11: invokevirtual #60                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #37                 // Field delegate:Lcom/google/common/base/Supplier;
      20: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #65                 // String )
      27: invokevirtual #60                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #67                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
