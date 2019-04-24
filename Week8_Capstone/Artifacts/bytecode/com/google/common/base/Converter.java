public abstract class com.google.common.base.Converter<A, B> implements com.google.common.base.Function<A, B> {
  protected com.google.common.base.Converter();
    Code:
       0: aload_0
       1: iconst_1
       2: invokespecial #34                 // Method "<init>":(Z)V
       5: return

  com.google.common.base.Converter(boolean);
    Code:
       0: aload_0
       1: invokespecial #37                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #39                 // Field handleNullAutomatically:Z
       9: return

  public static <A, B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B>, com.google.common.base.Function<? super B, ? extends A>);
    Code:
       0: new           #16                 // class com/google/common/base/Converter$FunctionBasedConverter
       3: dup
       4: aload_0
       5: aload_1
       6: aconst_null
       7: invokespecial #44                 // Method com/google/common/base/Converter$FunctionBasedConverter."<init>":(Lcom/google/common/base/Function;Lcom/google/common/base/Function;Lcom/google/common/base/Converter$1;)V
      10: areturn

  public static <T> com.google.common.base.Converter<T, T> identity();
    Code:
       0: getstatic     #52                 // Field com/google/common/base/Converter$IdentityConverter.INSTANCE:Lcom/google/common/base/Converter$IdentityConverter;
       3: areturn

  public final <C> com.google.common.base.Converter<A, C> andThen(com.google.common.base.Converter<B, C>);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #58                 // Method doAndThen:(Lcom/google/common/base/Converter;)Lcom/google/common/base/Converter;
       5: areturn

  public final B apply(A);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #66                 // Method convert:(Ljava/lang/Object;)Ljava/lang/Object;
       5: areturn

  public final B convert(A);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #72                 // Method correctedDoForward:(Ljava/lang/Object;)Ljava/lang/Object;
       5: areturn

  public java.lang.Iterable<B> convertAll(java.lang.Iterable<? extends A>);
    Code:
       0: aload_1
       1: ldc           #76                 // String fromIterable
       3: invokestatic  #82                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       6: pop
       7: new           #9                  // class com/google/common/base/Converter$1
      10: dup
      11: aload_0
      12: aload_1
      13: invokespecial #85                 // Method com/google/common/base/Converter$1."<init>":(Lcom/google/common/base/Converter;Ljava/lang/Iterable;)V
      16: areturn

  A correctedDoBackward(B);
    Code:
       0: aload_0
       1: getfield      #39                 // Field handleNullAutomatically:Z
       4: ifeq          22
       7: aload_1
       8: ifnonnull     13
      11: aconst_null
      12: areturn
      13: aload_0
      14: aload_1
      15: invokevirtual #90                 // Method doBackward:(Ljava/lang/Object;)Ljava/lang/Object;
      18: invokestatic  #92                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      21: areturn
      22: aload_0
      23: aload_1
      24: invokevirtual #90                 // Method doBackward:(Ljava/lang/Object;)Ljava/lang/Object;
      27: areturn

  B correctedDoForward(A);
    Code:
       0: aload_0
       1: getfield      #39                 // Field handleNullAutomatically:Z
       4: ifeq          22
       7: aload_1
       8: ifnonnull     13
      11: aconst_null
      12: areturn
      13: aload_0
      14: aload_1
      15: invokevirtual #96                 // Method doForward:(Ljava/lang/Object;)Ljava/lang/Object;
      18: invokestatic  #92                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      21: areturn
      22: aload_0
      23: aload_1
      24: invokevirtual #96                 // Method doForward:(Ljava/lang/Object;)Ljava/lang/Object;
      27: areturn

  <C> com.google.common.base.Converter<A, C> doAndThen(com.google.common.base.Converter<B, C>);
    Code:
       0: new           #13                 // class com/google/common/base/Converter$ConverterComposition
       3: dup
       4: aload_0
       5: aload_1
       6: invokestatic  #92                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #2                  // class com/google/common/base/Converter
      12: invokespecial #99                 // Method com/google/common/base/Converter$ConverterComposition."<init>":(Lcom/google/common/base/Converter;Lcom/google/common/base/Converter;)V
      15: areturn

  protected abstract A doBackward(B);

  protected abstract B doForward(A);

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #104                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
       5: ireturn

  public com.google.common.base.Converter<B, A> reverse();
    Code:
       0: aload_0
       1: getfield      #106                // Field reverse:Lcom/google/common/base/Converter;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     25
      11: new           #22                 // class com/google/common/base/Converter$ReverseConverter
      14: dup
      15: aload_0
      16: invokespecial #109                // Method com/google/common/base/Converter$ReverseConverter."<init>":(Lcom/google/common/base/Converter;)V
      19: astore_1
      20: aload_0
      21: aload_1
      22: putfield      #106                // Field reverse:Lcom/google/common/base/Converter;
      25: aload_1
      26: areturn
}
