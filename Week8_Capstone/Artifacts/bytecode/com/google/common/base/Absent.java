final class com.google.common.base.Absent<T> extends com.google.common.base.Optional<T> {
  static final com.google.common.base.Absent<java.lang.Object> INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/Absent
       3: dup
       4: invokespecial #17                 // Method "<init>":()V
       7: putstatic     #19                 // Field INSTANCE:Lcom/google/common/base/Absent;
      10: return

  static <T> com.google.common.base.Optional<T> withType();
    Code:
       0: getstatic     #19                 // Field INSTANCE:Lcom/google/common/base/Absent;
       3: areturn

  public java.util.Set<T> asSet();
    Code:
       0: invokestatic  #34                 // Method java/util/Collections.emptySet:()Ljava/util/Set;
       3: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: iconst_0
       8: ireturn

  public T get();
    Code:
       0: new           #40                 // class java/lang/IllegalStateException
       3: dup
       4: ldc           #42                 // String Optional.get() cannot be called on an absent value
       6: invokespecial #45                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       9: athrow

  public int hashCode();
    Code:
       0: ldc           #49                 // int 2040732332
       2: ireturn

  public boolean isPresent();
    Code:
       0: iconst_0
       1: ireturn

  public com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T>);
    Code:
       0: aload_1
       1: invokestatic  #59                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: checkcast     #5                  // class com/google/common/base/Optional
       7: areturn

  public T or(com.google.common.base.Supplier<? extends T>);
    Code:
       0: aload_1
       1: invokeinterface #65,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
       6: ldc           #67                 // String use Optional.orNull() instead of a Supplier that returns null
       8: invokestatic  #70                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      11: areturn

  public T or(T);
    Code:
       0: aload_1
       1: ldc           #73                 // String use Optional.orNull() instead of Optional.or(null)
       3: invokestatic  #70                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       6: areturn

  public T orNull();
    Code:
       0: aconst_null
       1: areturn

  public java.lang.String toString();
    Code:
       0: ldc           #79                 // String Optional.absent()
       2: areturn

  public <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V>);
    Code:
       0: aload_1
       1: invokestatic  #59                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: invokestatic  #84                 // Method com/google/common/base/Optional.absent:()Lcom/google/common/base/Optional;
       8: areturn
}
