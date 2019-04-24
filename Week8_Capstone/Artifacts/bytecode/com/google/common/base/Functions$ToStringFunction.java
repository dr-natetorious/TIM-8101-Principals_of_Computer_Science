final class com.google.common.base.Functions$ToStringFunction extends java.lang.Enum<com.google.common.base.Functions$ToStringFunction> implements com.google.common.base.Function<java.lang.Object, java.lang.String> {
  public static final com.google.common.base.Functions$ToStringFunction INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/Functions$ToStringFunction
       3: dup
       4: ldc           #17                 // String INSTANCE
       6: iconst_0
       7: invokespecial #21                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #23                 // Field INSTANCE:Lcom/google/common/base/Functions$ToStringFunction;
      13: iconst_1
      14: anewarray     #2                  // class com/google/common/base/Functions$ToStringFunction
      17: dup
      18: iconst_0
      19: getstatic     #23                 // Field INSTANCE:Lcom/google/common/base/Functions$ToStringFunction;
      22: aastore
      23: putstatic     #25                 // Field $VALUES:[Lcom/google/common/base/Functions$ToStringFunction;
      26: return

  public static com.google.common.base.Functions$ToStringFunction valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/base/Functions$ToStringFunction
       2: aload_0
       3: invokestatic  #33                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/base/Functions$ToStringFunction
       9: areturn

  public static com.google.common.base.Functions$ToStringFunction[] values();
    Code:
       0: getstatic     #25                 // Field $VALUES:[Lcom/google/common/base/Functions$ToStringFunction;
       3: invokevirtual #40                 // Method "[Lcom/google/common/base/Functions$ToStringFunction;".clone:()Ljava/lang/Object;
       6: checkcast     #36                 // class "[Lcom/google/common/base/Functions$ToStringFunction;"
       9: areturn

  public java.lang.Object apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #45                 // Method apply:(Ljava/lang/Object;)Ljava/lang/String;
       5: areturn

  public java.lang.String apply(java.lang.Object);
    Code:
       0: aload_1
       1: invokestatic  #50                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: invokevirtual #56                 // Method java/lang/Object.toString:()Ljava/lang/String;
       9: areturn

  public java.lang.String toString();
    Code:
       0: ldc           #58                 // String Functions.toStringFunction()
       2: areturn
}
