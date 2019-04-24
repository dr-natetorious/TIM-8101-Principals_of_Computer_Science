final class com.google.common.base.Functions$IdentityFunction extends java.lang.Enum<com.google.common.base.Functions$IdentityFunction> implements com.google.common.base.Function<java.lang.Object, java.lang.Object> {
  public static final com.google.common.base.Functions$IdentityFunction INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/Functions$IdentityFunction
       3: dup
       4: ldc           #17                 // String INSTANCE
       6: iconst_0
       7: invokespecial #21                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #23                 // Field INSTANCE:Lcom/google/common/base/Functions$IdentityFunction;
      13: iconst_1
      14: anewarray     #2                  // class com/google/common/base/Functions$IdentityFunction
      17: dup
      18: iconst_0
      19: getstatic     #23                 // Field INSTANCE:Lcom/google/common/base/Functions$IdentityFunction;
      22: aastore
      23: putstatic     #25                 // Field $VALUES:[Lcom/google/common/base/Functions$IdentityFunction;
      26: return

  public static com.google.common.base.Functions$IdentityFunction valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/base/Functions$IdentityFunction
       2: aload_0
       3: invokestatic  #33                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/base/Functions$IdentityFunction
       9: areturn

  public static com.google.common.base.Functions$IdentityFunction[] values();
    Code:
       0: getstatic     #25                 // Field $VALUES:[Lcom/google/common/base/Functions$IdentityFunction;
       3: invokevirtual #40                 // Method "[Lcom/google/common/base/Functions$IdentityFunction;".clone:()Ljava/lang/Object;
       6: checkcast     #36                 // class "[Lcom/google/common/base/Functions$IdentityFunction;"
       9: areturn

  public java.lang.Object apply(java.lang.Object);
    Code:
       0: aload_1
       1: areturn

  public java.lang.String toString();
    Code:
       0: ldc           #46                 // String Functions.identity()
       2: areturn
}
