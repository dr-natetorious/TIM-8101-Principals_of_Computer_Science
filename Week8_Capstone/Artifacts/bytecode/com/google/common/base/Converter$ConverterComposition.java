final class com.google.common.base.Converter$ConverterComposition<A, B, C> extends com.google.common.base.Converter<A, C> implements java.io.Serializable {
  final com.google.common.base.Converter<A, B> first;

  final com.google.common.base.Converter<B, C> second;

  com.google.common.base.Converter$ConverterComposition(com.google.common.base.Converter<A, B>, com.google.common.base.Converter<B, C>);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method com/google/common/base/Converter."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #24                 // Field first:Lcom/google/common/base/Converter;
       9: aload_0
      10: aload_2
      11: putfield      #26                 // Field second:Lcom/google/common/base/Converter;
      14: return

  A correctedDoBackward(C);
    Code:
       0: aload_0
       1: getfield      #24                 // Field first:Lcom/google/common/base/Converter;
       4: aload_0
       5: getfield      #26                 // Field second:Lcom/google/common/base/Converter;
       8: aload_1
       9: invokevirtual #33                 // Method com/google/common/base/Converter.correctedDoBackward:(Ljava/lang/Object;)Ljava/lang/Object;
      12: invokevirtual #33                 // Method com/google/common/base/Converter.correctedDoBackward:(Ljava/lang/Object;)Ljava/lang/Object;
      15: areturn

  C correctedDoForward(A);
    Code:
       0: aload_0
       1: getfield      #26                 // Field second:Lcom/google/common/base/Converter;
       4: aload_0
       5: getfield      #24                 // Field first:Lcom/google/common/base/Converter;
       8: aload_1
       9: invokevirtual #37                 // Method com/google/common/base/Converter.correctedDoForward:(Ljava/lang/Object;)Ljava/lang/Object;
      12: invokevirtual #37                 // Method com/google/common/base/Converter.correctedDoForward:(Ljava/lang/Object;)Ljava/lang/Object;
      15: areturn

  protected A doBackward(C);
    Code:
       0: new           #41                 // class java/lang/AssertionError
       3: dup
       4: invokespecial #42                 // Method java/lang/AssertionError."<init>":()V
       7: athrow

  protected C doForward(A);
    Code:
       0: new           #41                 // class java/lang/AssertionError
       3: dup
       4: invokespecial #42                 // Method java/lang/AssertionError."<init>":()V
       7: athrow

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Converter$ConverterComposition
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          54
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Converter$ConverterComposition
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #24                 // Field first:Lcom/google/common/base/Converter;
      26: aload_1
      27: getfield      #24                 // Field first:Lcom/google/common/base/Converter;
      30: invokevirtual #47                 // Method com/google/common/base/Converter.equals:(Ljava/lang/Object;)Z
      33: ifeq          54
      36: iload_3
      37: istore_2
      38: aload_0
      39: getfield      #26                 // Field second:Lcom/google/common/base/Converter;
      42: aload_1
      43: getfield      #26                 // Field second:Lcom/google/common/base/Converter;
      46: invokevirtual #47                 // Method com/google/common/base/Converter.equals:(Ljava/lang/Object;)Z
      49: ifeq          54
      52: iconst_1
      53: istore_2
      54: iload_2
      55: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #24                 // Field first:Lcom/google/common/base/Converter;
       4: invokevirtual #53                 // Method java/lang/Object.hashCode:()I
       7: bipush        31
       9: imul
      10: aload_0
      11: getfield      #26                 // Field second:Lcom/google/common/base/Converter;
      14: invokevirtual #53                 // Method java/lang/Object.hashCode:()I
      17: iadd
      18: ireturn

  public java.lang.String toString();
    Code:
       0: new           #57                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #58                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #24                 // Field first:Lcom/google/common/base/Converter;
      13: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #64                 // String .andThen(
      20: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #26                 // Field second:Lcom/google/common/base/Converter;
      29: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: ldc           #69                 // String )
      36: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: invokevirtual #71                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: areturn
}
