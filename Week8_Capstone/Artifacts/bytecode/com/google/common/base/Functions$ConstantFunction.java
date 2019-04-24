class com.google.common.base.Functions$ConstantFunction<E> implements com.google.common.base.Function<java.lang.Object, E>, java.io.Serializable {
  public com.google.common.base.Functions$ConstantFunction(E);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #26                 // Field value:Ljava/lang/Object;
       9: return

  public E apply(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #26                 // Field value:Ljava/lang/Object;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Functions$ConstantFunction
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Functions$ConstantFunction
      11: astore_1
      12: aload_0
      13: getfield      #26                 // Field value:Ljava/lang/Object;
      16: aload_1
      17: getfield      #26                 // Field value:Ljava/lang/Object;
      20: invokestatic  #40                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #26                 // Field value:Ljava/lang/Object;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #26                 // Field value:Ljava/lang/Object;
      13: invokevirtual #44                 // Method java/lang/Object.hashCode:()I
      16: ireturn

  public java.lang.String toString();
    Code:
       0: new           #48                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #49                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #51                 // String Functions.constant(
      11: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #26                 // Field value:Ljava/lang/Object;
      20: invokevirtual #58                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #60                 // String )
      27: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
