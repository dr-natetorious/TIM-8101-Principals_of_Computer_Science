public final class com.google.common.base.Predicates {
  static java.lang.String access$800(java.lang.String, java.lang.Iterable);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #57                 // Method toStringHelper:(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;
       5: areturn

  public static <T> com.google.common.base.Predicate<T> alwaysFalse();
    Code:
       0: getstatic     #63                 // Field com/google/common/base/Predicates$ObjectPredicate.ALWAYS_FALSE:Lcom/google/common/base/Predicates$ObjectPredicate;
       3: invokevirtual #66                 // Method com/google/common/base/Predicates$ObjectPredicate.withNarrowedType:()Lcom/google/common/base/Predicate;
       6: areturn

  public static <T> com.google.common.base.Predicate<T> alwaysTrue();
    Code:
       0: getstatic     #72                 // Field com/google/common/base/Predicates$ObjectPredicate.ALWAYS_TRUE:Lcom/google/common/base/Predicates$ObjectPredicate;
       3: invokevirtual #66                 // Method com/google/common/base/Predicates$ObjectPredicate.withNarrowedType:()Lcom/google/common/base/Predicate;
       6: areturn

  public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>, com.google.common.base.Predicate<? super T>);
    Code:
       0: new           #8                  // class com/google/common/base/Predicates$AndPredicate
       3: dup
       4: aload_0
       5: invokestatic  #80                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #82                 // class com/google/common/base/Predicate
      11: aload_1
      12: invokestatic  #80                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      15: checkcast     #82                 // class com/google/common/base/Predicate
      18: invokestatic  #86                 // Method asList:(Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Ljava/util/List;
      21: aconst_null
      22: invokespecial #89                 // Method com/google/common/base/Predicates$AndPredicate."<init>":(Ljava/util/List;Lcom/google/common/base/Predicates$1;)V
      25: areturn

  public static <T> com.google.common.base.Predicate<T> and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>);
    Code:
       0: new           #8                  // class com/google/common/base/Predicates$AndPredicate
       3: dup
       4: aload_0
       5: invokestatic  #95                 // Method defensiveCopy:(Ljava/lang/Iterable;)Ljava/util/List;
       8: aconst_null
       9: invokespecial #89                 // Method com/google/common/base/Predicates$AndPredicate."<init>":(Ljava/util/List;Lcom/google/common/base/Predicates$1;)V
      12: areturn

  public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>...);
    Code:
       0: new           #8                  // class com/google/common/base/Predicates$AndPredicate
       3: dup
       4: aload_0
       5: invokestatic  #101                // Method defensiveCopy:([Ljava/lang/Object;)Ljava/util/List;
       8: aconst_null
       9: invokespecial #89                 // Method com/google/common/base/Predicates$AndPredicate."<init>":(Ljava/util/List;Lcom/google/common/base/Predicates$1;)V
      12: areturn

  public static com.google.common.base.Predicate<java.lang.Class<?>> assignableFrom(java.lang.Class<?>);
    Code:
       0: aload_0
       1: invokestatic  #114                // Method subtypeOf:(Ljava/lang/Class;)Lcom/google/common/base/Predicate;
       4: areturn

  public static <A, B> com.google.common.base.Predicate<A> compose(com.google.common.base.Predicate<B>, com.google.common.base.Function<A, ? extends B>);
    Code:
       0: new           #11                 // class com/google/common/base/Predicates$CompositionPredicate
       3: dup
       4: aload_0
       5: aload_1
       6: aconst_null
       7: invokespecial #120                // Method com/google/common/base/Predicates$CompositionPredicate."<init>":(Lcom/google/common/base/Predicate;Lcom/google/common/base/Function;Lcom/google/common/base/Predicates$1;)V
      10: areturn

  public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern);
    Code:
       0: new           #17                 // class com/google/common/base/Predicates$ContainsPatternPredicate
       3: dup
       4: new           #125                // class com/google/common/base/JdkPattern
       7: dup
       8: aload_0
       9: invokespecial #128                // Method com/google/common/base/JdkPattern."<init>":(Ljava/util/regex/Pattern;)V
      12: invokespecial #131                // Method com/google/common/base/Predicates$ContainsPatternPredicate."<init>":(Lcom/google/common/base/CommonPattern;)V
      15: areturn

  public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String);
    Code:
       0: new           #14                 // class com/google/common/base/Predicates$ContainsPatternFromStringPredicate
       3: dup
       4: aload_0
       5: invokespecial #137                // Method com/google/common/base/Predicates$ContainsPatternFromStringPredicate."<init>":(Ljava/lang/String;)V
       8: areturn

  static <T> java.util.List<T> defensiveCopy(java.lang.Iterable<T>);
    Code:
       0: new           #140                // class java/util/ArrayList
       3: dup
       4: invokespecial #141                // Method java/util/ArrayList."<init>":()V
       7: astore_1
       8: aload_0
       9: invokeinterface #147,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      14: astore_0
      15: aload_0
      16: invokeinterface #153,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      21: ifeq          41
      24: aload_1
      25: aload_0
      26: invokeinterface #157,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      31: invokestatic  #80                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      34: invokevirtual #161                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      37: pop
      38: goto          15
      41: aload_1
      42: areturn

  public static <T> com.google.common.base.Predicate<T> equalTo(T);
    Code:
       0: aload_0
       1: ifnonnull     8
       4: invokestatic  #168                // Method isNull:()Lcom/google/common/base/Predicate;
       7: areturn
       8: new           #26                 // class com/google/common/base/Predicates$IsEqualToPredicate
      11: dup
      12: aload_0
      13: aconst_null
      14: invokespecial #171                // Method com/google/common/base/Predicates$IsEqualToPredicate."<init>":(Ljava/lang/Object;Lcom/google/common/base/Predicates$1;)V
      17: areturn

  public static <T> com.google.common.base.Predicate<T> in(java.util.Collection<? extends T>);
    Code:
       0: new           #20                 // class com/google/common/base/Predicates$InPredicate
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #177                // Method com/google/common/base/Predicates$InPredicate."<init>":(Ljava/util/Collection;Lcom/google/common/base/Predicates$1;)V
       9: areturn

  public static com.google.common.base.Predicate<java.lang.Object> instanceOf(java.lang.Class<?>);
    Code:
       0: new           #23                 // class com/google/common/base/Predicates$InstanceOfPredicate
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #182                // Method com/google/common/base/Predicates$InstanceOfPredicate."<init>":(Ljava/lang/Class;Lcom/google/common/base/Predicates$1;)V
       9: areturn

  public static <T> com.google.common.base.Predicate<T> isNull();
    Code:
       0: getstatic     #186                // Field com/google/common/base/Predicates$ObjectPredicate.IS_NULL:Lcom/google/common/base/Predicates$ObjectPredicate;
       3: invokevirtual #66                 // Method com/google/common/base/Predicates$ObjectPredicate.withNarrowedType:()Lcom/google/common/base/Predicate;
       6: areturn

  public static <T> com.google.common.base.Predicate<T> not(com.google.common.base.Predicate<T>);
    Code:
       0: new           #29                 // class com/google/common/base/Predicates$NotPredicate
       3: dup
       4: aload_0
       5: invokespecial #191                // Method com/google/common/base/Predicates$NotPredicate."<init>":(Lcom/google/common/base/Predicate;)V
       8: areturn

  public static <T> com.google.common.base.Predicate<T> notNull();
    Code:
       0: getstatic     #196                // Field com/google/common/base/Predicates$ObjectPredicate.NOT_NULL:Lcom/google/common/base/Predicates$ObjectPredicate;
       3: invokevirtual #66                 // Method com/google/common/base/Predicates$ObjectPredicate.withNarrowedType:()Lcom/google/common/base/Predicate;
       6: areturn

  public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>, com.google.common.base.Predicate<? super T>);
    Code:
       0: new           #43                 // class com/google/common/base/Predicates$OrPredicate
       3: dup
       4: aload_0
       5: invokestatic  #80                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #82                 // class com/google/common/base/Predicate
      11: aload_1
      12: invokestatic  #80                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      15: checkcast     #82                 // class com/google/common/base/Predicate
      18: invokestatic  #86                 // Method asList:(Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Ljava/util/List;
      21: aconst_null
      22: invokespecial #198                // Method com/google/common/base/Predicates$OrPredicate."<init>":(Ljava/util/List;Lcom/google/common/base/Predicates$1;)V
      25: areturn

  public static <T> com.google.common.base.Predicate<T> or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>>);
    Code:
       0: new           #43                 // class com/google/common/base/Predicates$OrPredicate
       3: dup
       4: aload_0
       5: invokestatic  #95                 // Method defensiveCopy:(Ljava/lang/Iterable;)Ljava/util/List;
       8: aconst_null
       9: invokespecial #198                // Method com/google/common/base/Predicates$OrPredicate."<init>":(Ljava/util/List;Lcom/google/common/base/Predicates$1;)V
      12: areturn

  public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>...);
    Code:
       0: new           #43                 // class com/google/common/base/Predicates$OrPredicate
       3: dup
       4: aload_0
       5: invokestatic  #101                // Method defensiveCopy:([Ljava/lang/Object;)Ljava/util/List;
       8: aconst_null
       9: invokespecial #198                // Method com/google/common/base/Predicates$OrPredicate."<init>":(Ljava/util/List;Lcom/google/common/base/Predicates$1;)V
      12: areturn

  public static com.google.common.base.Predicate<java.lang.Class<?>> subtypeOf(java.lang.Class<?>);
    Code:
       0: new           #46                 // class com/google/common/base/Predicates$SubtypeOfPredicate
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #199                // Method com/google/common/base/Predicates$SubtypeOfPredicate."<init>":(Ljava/lang/Class;Lcom/google/common/base/Predicates$1;)V
       9: areturn
}
