abstract class com.google.common.base.Predicates$ObjectPredicate extends java.lang.Enum<com.google.common.base.Predicates$ObjectPredicate> implements com.google.common.base.Predicate<java.lang.Object> {
  public static final com.google.common.base.Predicates$ObjectPredicate ALWAYS_FALSE;

  public static final com.google.common.base.Predicates$ObjectPredicate ALWAYS_TRUE;

  public static final com.google.common.base.Predicates$ObjectPredicate IS_NULL;

  public static final com.google.common.base.Predicates$ObjectPredicate NOT_NULL;

  static {};
    Code:
       0: new           #12                 // class com/google/common/base/Predicates$ObjectPredicate$1
       3: dup
       4: ldc           #28                 // String ALWAYS_TRUE
       6: iconst_0
       7: invokespecial #32                 // Method com/google/common/base/Predicates$ObjectPredicate$1."<init>":(Ljava/lang/String;I)V
      10: putstatic     #34                 // Field ALWAYS_TRUE:Lcom/google/common/base/Predicates$ObjectPredicate;
      13: new           #14                 // class com/google/common/base/Predicates$ObjectPredicate$2
      16: dup
      17: ldc           #35                 // String ALWAYS_FALSE
      19: iconst_1
      20: invokespecial #36                 // Method com/google/common/base/Predicates$ObjectPredicate$2."<init>":(Ljava/lang/String;I)V
      23: putstatic     #38                 // Field ALWAYS_FALSE:Lcom/google/common/base/Predicates$ObjectPredicate;
      26: new           #16                 // class com/google/common/base/Predicates$ObjectPredicate$3
      29: dup
      30: ldc           #39                 // String IS_NULL
      32: iconst_2
      33: invokespecial #40                 // Method com/google/common/base/Predicates$ObjectPredicate$3."<init>":(Ljava/lang/String;I)V
      36: putstatic     #42                 // Field IS_NULL:Lcom/google/common/base/Predicates$ObjectPredicate;
      39: new           #18                 // class com/google/common/base/Predicates$ObjectPredicate$4
      42: dup
      43: ldc           #43                 // String NOT_NULL
      45: iconst_3
      46: invokespecial #44                 // Method com/google/common/base/Predicates$ObjectPredicate$4."<init>":(Ljava/lang/String;I)V
      49: putstatic     #46                 // Field NOT_NULL:Lcom/google/common/base/Predicates$ObjectPredicate;
      52: iconst_4
      53: anewarray     #2                  // class com/google/common/base/Predicates$ObjectPredicate
      56: dup
      57: iconst_0
      58: getstatic     #34                 // Field ALWAYS_TRUE:Lcom/google/common/base/Predicates$ObjectPredicate;
      61: aastore
      62: dup
      63: iconst_1
      64: getstatic     #38                 // Field ALWAYS_FALSE:Lcom/google/common/base/Predicates$ObjectPredicate;
      67: aastore
      68: dup
      69: iconst_2
      70: getstatic     #42                 // Field IS_NULL:Lcom/google/common/base/Predicates$ObjectPredicate;
      73: aastore
      74: dup
      75: iconst_3
      76: getstatic     #46                 // Field NOT_NULL:Lcom/google/common/base/Predicates$ObjectPredicate;
      79: aastore
      80: putstatic     #48                 // Field $VALUES:[Lcom/google/common/base/Predicates$ObjectPredicate;
      83: return

  com.google.common.base.Predicates$ObjectPredicate(java.lang.String, int, com.google.common.base.Predicates$1);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #53                 // Method "<init>":(Ljava/lang/String;I)V
       6: return

  public static com.google.common.base.Predicates$ObjectPredicate valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/base/Predicates$ObjectPredicate
       2: aload_0
       3: invokestatic  #58                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/base/Predicates$ObjectPredicate
       9: areturn

  public static com.google.common.base.Predicates$ObjectPredicate[] values();
    Code:
       0: getstatic     #48                 // Field $VALUES:[Lcom/google/common/base/Predicates$ObjectPredicate;
       3: invokevirtual #65                 // Method "[Lcom/google/common/base/Predicates$ObjectPredicate;".clone:()Ljava/lang/Object;
       6: checkcast     #61                 // class "[Lcom/google/common/base/Predicates$ObjectPredicate;"
       9: areturn

  <T> com.google.common.base.Predicate<T> withNarrowedType();
    Code:
       0: aload_0
       1: areturn
}
