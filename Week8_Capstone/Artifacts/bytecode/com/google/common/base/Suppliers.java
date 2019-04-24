public final class com.google.common.base.Suppliers {
  public static <F, T> com.google.common.base.Supplier<T> compose(com.google.common.base.Function<? super F, T>, com.google.common.base.Supplier<F>);
    Code:
       0: aload_0
       1: invokestatic  #41                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: invokestatic  #41                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: new           #15                 // class com/google/common/base/Suppliers$SupplierComposition
      13: dup
      14: aload_0
      15: aload_1
      16: invokespecial #44                 // Method com/google/common/base/Suppliers$SupplierComposition."<init>":(Lcom/google/common/base/Function;Lcom/google/common/base/Supplier;)V
      19: areturn

  public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T>);
    Code:
       0: aload_0
       1: instanceof    #12                 // class com/google/common/base/Suppliers$NonSerializableMemoizingSupplier
       4: ifne          41
       7: aload_0
       8: instanceof    #9                  // class com/google/common/base/Suppliers$MemoizingSupplier
      11: ifeq          16
      14: aload_0
      15: areturn
      16: aload_0
      17: instanceof    #50                 // class java/io/Serializable
      20: ifeq          32
      23: new           #9                  // class com/google/common/base/Suppliers$MemoizingSupplier
      26: dup
      27: aload_0
      28: invokespecial #53                 // Method com/google/common/base/Suppliers$MemoizingSupplier."<init>":(Lcom/google/common/base/Supplier;)V
      31: areturn
      32: new           #12                 // class com/google/common/base/Suppliers$NonSerializableMemoizingSupplier
      35: dup
      36: aload_0
      37: invokespecial #54                 // Method com/google/common/base/Suppliers$NonSerializableMemoizingSupplier."<init>":(Lcom/google/common/base/Supplier;)V
      40: areturn
      41: aload_0
      42: areturn

  public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T>, long, java.util.concurrent.TimeUnit);
    Code:
       0: new           #6                  // class com/google/common/base/Suppliers$ExpiringMemoizingSupplier
       3: dup
       4: aload_0
       5: lload_1
       6: aload_3
       7: invokespecial #60                 // Method com/google/common/base/Suppliers$ExpiringMemoizingSupplier."<init>":(Lcom/google/common/base/Supplier;JLjava/util/concurrent/TimeUnit;)V
      10: areturn

  public static <T> com.google.common.base.Supplier<T> ofInstance(T);
    Code:
       0: new           #24                 // class com/google/common/base/Suppliers$SupplierOfInstance
       3: dup
       4: aload_0
       5: invokespecial #66                 // Method com/google/common/base/Suppliers$SupplierOfInstance."<init>":(Ljava/lang/Object;)V
       8: areturn

  public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction();
    Code:
       0: getstatic     #73                 // Field com/google/common/base/Suppliers$SupplierFunctionImpl.INSTANCE:Lcom/google/common/base/Suppliers$SupplierFunctionImpl;
       3: areturn

  public static <T> com.google.common.base.Supplier<T> synchronizedSupplier(com.google.common.base.Supplier<T>);
    Code:
       0: new           #27                 // class com/google/common/base/Suppliers$ThreadSafeSupplier
       3: dup
       4: aload_0
       5: invokestatic  #41                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #77                 // class com/google/common/base/Supplier
      11: invokespecial #78                 // Method com/google/common/base/Suppliers$ThreadSafeSupplier."<init>":(Lcom/google/common/base/Supplier;)V
      14: areturn
}
