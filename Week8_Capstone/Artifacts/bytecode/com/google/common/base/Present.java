final class com.google.common.base.Present<T> extends com.google.common.base.Optional<T> {
  com.google.common.base.Present(T);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method com/google/common/base/Optional."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #19                 // Field reference:Ljava/lang/Object;
       9: return

  public java.util.Set<T> asSet();
    Code:
       0: aload_0
       1: getfield      #19                 // Field reference:Ljava/lang/Object;
       4: invokestatic  #30                 // Method java/util/Collections.singleton:(Ljava/lang/Object;)Ljava/util/Set;
       7: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Present
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Present
      11: astore_1
      12: aload_0
      13: getfield      #19                 // Field reference:Ljava/lang/Object;
      16: aload_1
      17: getfield      #19                 // Field reference:Ljava/lang/Object;
      20: invokevirtual #37                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public T get();
    Code:
       0: aload_0
       1: getfield      #19                 // Field reference:Ljava/lang/Object;
       4: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #19                 // Field reference:Ljava/lang/Object;
       4: invokevirtual #44                 // Method java/lang/Object.hashCode:()I
       7: ldc           #45                 // int 1502476572
       9: iadd
      10: ireturn

  public boolean isPresent();
    Code:
       0: iconst_1
       1: ireturn

  public com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T>);
    Code:
       0: aload_1
       1: invokestatic  #55                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: areturn

  public T or(com.google.common.base.Supplier<? extends T>);
    Code:
       0: aload_1
       1: invokestatic  #55                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: getfield      #19                 // Field reference:Ljava/lang/Object;
       9: areturn

  public T or(T);
    Code:
       0: aload_1
       1: ldc           #60                 // String use Optional.orNull() instead of Optional.or(null)
       3: invokestatic  #63                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       6: pop
       7: aload_0
       8: getfield      #19                 // Field reference:Ljava/lang/Object;
      11: areturn

  public T orNull();
    Code:
       0: aload_0
       1: getfield      #19                 // Field reference:Ljava/lang/Object;
       4: areturn

  public java.lang.String toString();
    Code:
       0: new           #69                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #70                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #72                 // String Optional.of(
      11: invokevirtual #76                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #19                 // Field reference:Ljava/lang/Object;
      20: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #81                 // String )
      27: invokevirtual #76                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #83                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn

  public <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V>);
    Code:
       0: new           #2                  // class com/google/common/base/Present
       3: dup
       4: aload_1
       5: aload_0
       6: getfield      #19                 // Field reference:Ljava/lang/Object;
       9: invokeinterface #90,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      14: ldc           #92                 // String the Function passed to Optional.transform() must not return null.
      16: invokestatic  #63                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      19: invokespecial #94                 // Method "<init>":(Ljava/lang/Object;)V
      22: areturn
}
