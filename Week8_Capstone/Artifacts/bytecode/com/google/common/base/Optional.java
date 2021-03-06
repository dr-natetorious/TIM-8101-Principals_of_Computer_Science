public abstract class com.google.common.base.Optional<T> implements java.io.Serializable {
  com.google.common.base.Optional();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: return

  public static <T> com.google.common.base.Optional<T> absent();
    Code:
       0: invokestatic  #27                 // Method com/google/common/base/Absent.withType:()Lcom/google/common/base/Optional;
       3: areturn

  public static <T> com.google.common.base.Optional<T> fromNullable(T);
    Code:
       0: aload_0
       1: ifnonnull     8
       4: invokestatic  #33                 // Method absent:()Lcom/google/common/base/Optional;
       7: areturn
       8: new           #35                 // class com/google/common/base/Present
      11: dup
      12: aload_0
      13: invokespecial #38                 // Method com/google/common/base/Present."<init>":(Ljava/lang/Object;)V
      16: areturn

  public static <T> com.google.common.base.Optional<T> of(T);
    Code:
       0: new           #35                 // class com/google/common/base/Present
       3: dup
       4: aload_0
       5: invokestatic  #46                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       8: invokespecial #38                 // Method com/google/common/base/Present."<init>":(Ljava/lang/Object;)V
      11: areturn

  public static <T> java.lang.Iterable<T> presentInstances(java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>>);
    Code:
       0: aload_0
       1: invokestatic  #46                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: new           #9                  // class com/google/common/base/Optional$1
       8: dup
       9: aload_0
      10: invokespecial #51                 // Method com/google/common/base/Optional$1."<init>":(Ljava/lang/Iterable;)V
      13: areturn

  public abstract java.util.Set<T> asSet();

  public abstract boolean equals(java.lang.Object);

  public abstract T get();

  public abstract int hashCode();

  public abstract boolean isPresent();

  public abstract com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T>);

  public abstract T or(com.google.common.base.Supplier<? extends T>);

  public abstract T or(T);

  public abstract T orNull();

  public abstract java.lang.String toString();

  public abstract <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V>);
}
