final class com.google.common.base.Converter$IdentityConverter<T> extends com.google.common.base.Converter<T, T> implements java.io.Serializable {
  static final com.google.common.base.Converter$IdentityConverter INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/Converter$IdentityConverter
       3: dup
       4: invokespecial #19                 // Method "<init>":()V
       7: putstatic     #21                 // Field INSTANCE:Lcom/google/common/base/Converter$IdentityConverter;
      10: return

  <S> com.google.common.base.Converter<T, S> doAndThen(com.google.common.base.Converter<T, S>);
    Code:
       0: aload_1
       1: ldc           #29                 // String otherConverter
       3: invokestatic  #35                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       6: checkcast     #5                  // class com/google/common/base/Converter
       9: areturn

  protected T doBackward(T);
    Code:
       0: aload_1
       1: areturn

  protected T doForward(T);
    Code:
       0: aload_1
       1: areturn

  public com.google.common.base.Converter$IdentityConverter<T> reverse();
    Code:
       0: aload_0
       1: areturn

  public com.google.common.base.Converter reverse();
    Code:
       0: aload_0
       1: invokevirtual #47                 // Method reverse:()Lcom/google/common/base/Converter$IdentityConverter;
       4: areturn

  public java.lang.String toString();
    Code:
       0: ldc           #51                 // String Converter.identity()
       2: areturn
}
