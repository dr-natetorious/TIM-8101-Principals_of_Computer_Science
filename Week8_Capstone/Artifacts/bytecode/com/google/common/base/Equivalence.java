public abstract class com.google.common.base.Equivalence<T> {
  protected com.google.common.base.Equivalence();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: return

  public static com.google.common.base.Equivalence<java.lang.Object> equals();
    Code:
       0: getstatic     #30                 // Field com/google/common/base/Equivalence$Equals.INSTANCE:Lcom/google/common/base/Equivalence$Equals;
       3: areturn

  public static com.google.common.base.Equivalence<java.lang.Object> identity();
    Code:
       0: getstatic     #36                 // Field com/google/common/base/Equivalence$Identity.INSTANCE:Lcom/google/common/base/Equivalence$Identity;
       3: areturn

  protected abstract boolean doEquivalent(T, T);

  protected abstract int doHash(T);

  public final boolean equivalent(T, T);
    Code:
       0: aload_1
       1: aload_2
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        25
      11: aload_2
      12: ifnonnull     18
      15: goto          25
      18: aload_0
      19: aload_1
      20: aload_2
      21: invokevirtual #44                 // Method doEquivalent:(Ljava/lang/Object;Ljava/lang/Object;)Z
      24: ireturn
      25: iconst_0
      26: ireturn

  public final com.google.common.base.Predicate<T> equivalentTo(T);
    Code:
       0: new           #12                 // class com/google/common/base/Equivalence$EquivalentToPredicate
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #50                 // Method com/google/common/base/Equivalence$EquivalentToPredicate."<init>":(Lcom/google/common/base/Equivalence;Ljava/lang/Object;)V
       9: areturn

  public final int hash(T);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_0
       7: aload_1
       8: invokevirtual #54                 // Method doHash:(Ljava/lang/Object;)I
      11: ireturn

  public final <F> com.google.common.base.Equivalence<F> onResultOf(com.google.common.base.Function<F, ? extends T>);
    Code:
       0: new           #59                 // class com/google/common/base/FunctionalEquivalence
       3: dup
       4: aload_1
       5: aload_0
       6: invokespecial #62                 // Method com/google/common/base/FunctionalEquivalence."<init>":(Lcom/google/common/base/Function;Lcom/google/common/base/Equivalence;)V
       9: areturn

  public final <S extends T> com.google.common.base.Equivalence<java.lang.Iterable<S>> pairwise();
    Code:
       0: new           #66                 // class com/google/common/base/PairwiseEquivalence
       3: dup
       4: aload_0
       5: invokespecial #69                 // Method com/google/common/base/PairwiseEquivalence."<init>":(Lcom/google/common/base/Equivalence;)V
       8: areturn

  public final <S extends T> com.google.common.base.Equivalence$Wrapper<S> wrap(S);
    Code:
       0: new           #18                 // class com/google/common/base/Equivalence$Wrapper
       3: dup
       4: aload_0
       5: aload_1
       6: aconst_null
       7: invokespecial #75                 // Method com/google/common/base/Equivalence$Wrapper."<init>":(Lcom/google/common/base/Equivalence;Ljava/lang/Object;Lcom/google/common/base/Equivalence$1;)V
      10: areturn
}
