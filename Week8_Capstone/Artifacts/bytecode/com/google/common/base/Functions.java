public final class com.google.common.base.Functions {
  public static <A, B, C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C>, com.google.common.base.Function<A, ? extends B>);
    Code:
       0: new           #14                 // class com/google/common/base/Functions$FunctionComposition
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #40                 // Method com/google/common/base/Functions$FunctionComposition."<init>":(Lcom/google/common/base/Function;Lcom/google/common/base/Function;)V
       9: areturn

  public static <E> com.google.common.base.Function<java.lang.Object, E> constant(E);
    Code:
       0: new           #8                  // class com/google/common/base/Functions$ConstantFunction
       3: dup
       4: aload_0
       5: invokespecial #47                 // Method com/google/common/base/Functions$ConstantFunction."<init>":(Ljava/lang/Object;)V
       8: areturn

  public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V>);
    Code:
       0: new           #17                 // class com/google/common/base/Functions$FunctionForMapNoDefault
       3: dup
       4: aload_0
       5: invokespecial #53                 // Method com/google/common/base/Functions$FunctionForMapNoDefault."<init>":(Ljava/util/Map;)V
       8: areturn

  public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V>, V);
    Code:
       0: new           #11                 // class com/google/common/base/Functions$ForMapWithDefault
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #58                 // Method com/google/common/base/Functions$ForMapWithDefault."<init>":(Ljava/util/Map;Ljava/lang/Object;)V
       9: areturn

  public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T>);
    Code:
       0: new           #23                 // class com/google/common/base/Functions$PredicateFunction
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #64                 // Method com/google/common/base/Functions$PredicateFunction."<init>":(Lcom/google/common/base/Predicate;Lcom/google/common/base/Functions$1;)V
       9: areturn

  public static <T> com.google.common.base.Function<java.lang.Object, T> forSupplier(com.google.common.base.Supplier<T>);
    Code:
       0: new           #26                 // class com/google/common/base/Functions$SupplierFunction
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #70                 // Method com/google/common/base/Functions$SupplierFunction."<init>":(Lcom/google/common/base/Supplier;Lcom/google/common/base/Functions$1;)V
       9: areturn

  public static <E> com.google.common.base.Function<E, E> identity();
    Code:
       0: getstatic     #77                 // Field com/google/common/base/Functions$IdentityFunction.INSTANCE:Lcom/google/common/base/Functions$IdentityFunction;
       3: areturn

  public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction();
    Code:
       0: getstatic     #82                 // Field com/google/common/base/Functions$ToStringFunction.INSTANCE:Lcom/google/common/base/Functions$ToStringFunction;
       3: areturn
}
