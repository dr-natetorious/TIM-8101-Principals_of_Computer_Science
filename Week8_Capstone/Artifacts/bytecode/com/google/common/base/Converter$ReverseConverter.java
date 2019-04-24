final class com.google.common.base.Converter$ReverseConverter<A, B> extends com.google.common.base.Converter<B, A> implements java.io.Serializable {
  final com.google.common.base.Converter<A, B> original;

  com.google.common.base.Converter$ReverseConverter(com.google.common.base.Converter<A, B>);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method com/google/common/base/Converter."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #22                 // Field original:Lcom/google/common/base/Converter;
       9: return

  B correctedDoBackward(A);
    Code:
       0: aload_0
       1: getfield      #22                 // Field original:Lcom/google/common/base/Converter;
       4: aload_1
       5: invokevirtual #30                 // Method com/google/common/base/Converter.correctedDoForward:(Ljava/lang/Object;)Ljava/lang/Object;
       8: areturn

  A correctedDoForward(B);
    Code:
       0: aload_0
       1: getfield      #22                 // Field original:Lcom/google/common/base/Converter;
       4: aload_1
       5: invokevirtual #33                 // Method com/google/common/base/Converter.correctedDoBackward:(Ljava/lang/Object;)Ljava/lang/Object;
       8: areturn

  protected B doBackward(A);
    Code:
       0: new           #37                 // class java/lang/AssertionError
       3: dup
       4: invokespecial #38                 // Method java/lang/AssertionError."<init>":()V
       7: athrow

  protected A doForward(B);
    Code:
       0: new           #37                 // class java/lang/AssertionError
       3: dup
       4: invokespecial #38                 // Method java/lang/AssertionError."<init>":()V
       7: athrow

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Converter$ReverseConverter
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Converter$ReverseConverter
      11: astore_1
      12: aload_0
      13: getfield      #22                 // Field original:Lcom/google/common/base/Converter;
      16: aload_1
      17: getfield      #22                 // Field original:Lcom/google/common/base/Converter;
      20: invokevirtual #43                 // Method com/google/common/base/Converter.equals:(Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #22                 // Field original:Lcom/google/common/base/Converter;
       4: invokevirtual #49                 // Method java/lang/Object.hashCode:()I
       7: iconst_m1
       8: ixor
       9: ireturn

  public com.google.common.base.Converter<A, B> reverse();
    Code:
       0: aload_0
       1: getfield      #22                 // Field original:Lcom/google/common/base/Converter;
       4: areturn

  public java.lang.String toString();
    Code:
       0: new           #56                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #57                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #22                 // Field original:Lcom/google/common/base/Converter;
      13: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #63                 // String .reverse()
      20: invokevirtual #66                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      28: areturn
}
