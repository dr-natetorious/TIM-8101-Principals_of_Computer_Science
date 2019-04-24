final class com.google.common.base.Converter$FunctionBasedConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
  com.google.common.base.Converter$FunctionBasedConverter(com.google.common.base.Function, com.google.common.base.Function, com.google.common.base.Converter$1);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #36                 // Method "<init>":(Lcom/google/common/base/Function;Lcom/google/common/base/Function;)V
       6: return

  protected A doBackward(B);
    Code:
       0: aload_0
       1: getfield      #30                 // Field backwardFunction:Lcom/google/common/base/Function;
       4: aload_1
       5: invokeinterface #40,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      10: areturn

  protected B doForward(A);
    Code:
       0: aload_0
       1: getfield      #28                 // Field forwardFunction:Lcom/google/common/base/Function;
       4: aload_1
       5: invokeinterface #40,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      10: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Converter$FunctionBasedConverter
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          58
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Converter$FunctionBasedConverter
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #28                 // Field forwardFunction:Lcom/google/common/base/Function;
      26: aload_1
      27: getfield      #28                 // Field forwardFunction:Lcom/google/common/base/Function;
      30: invokeinterface #47,  2           // InterfaceMethod com/google/common/base/Function.equals:(Ljava/lang/Object;)Z
      35: ifeq          58
      38: iload_3
      39: istore_2
      40: aload_0
      41: getfield      #30                 // Field backwardFunction:Lcom/google/common/base/Function;
      44: aload_1
      45: getfield      #30                 // Field backwardFunction:Lcom/google/common/base/Function;
      48: invokeinterface #47,  2           // InterfaceMethod com/google/common/base/Function.equals:(Ljava/lang/Object;)Z
      53: ifeq          58
      56: iconst_1
      57: istore_2
      58: iload_2
      59: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #28                 // Field forwardFunction:Lcom/google/common/base/Function;
       4: invokevirtual #53                 // Method java/lang/Object.hashCode:()I
       7: bipush        31
       9: imul
      10: aload_0
      11: getfield      #30                 // Field backwardFunction:Lcom/google/common/base/Function;
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
       9: ldc           #60                 // String Converter.from(
      11: invokevirtual #64                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #28                 // Field forwardFunction:Lcom/google/common/base/Function;
      20: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #69                 // String ,
      27: invokevirtual #64                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #30                 // Field backwardFunction:Lcom/google/common/base/Function;
      36: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #71                 // String )
      43: invokevirtual #64                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #73                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
