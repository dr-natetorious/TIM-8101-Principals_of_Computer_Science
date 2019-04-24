class com.google.common.base.Predicates$NotPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
  final com.google.common.base.Predicate<T> predicate;

  com.google.common.base.Predicates$NotPredicate(com.google.common.base.Predicate<T>);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #7                  // class com/google/common/base/Predicate
      12: putfield      #32                 // Field predicate:Lcom/google/common/base/Predicate;
      15: return

  public boolean apply(T);
    Code:
       0: aload_0
       1: getfield      #32                 // Field predicate:Lcom/google/common/base/Predicate;
       4: aload_1
       5: invokeinterface #39,  2           // InterfaceMethod com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
      10: iconst_1
      11: ixor
      12: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Predicates$NotPredicate
       4: ifeq          26
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Predicates$NotPredicate
      11: astore_1
      12: aload_0
      13: getfield      #32                 // Field predicate:Lcom/google/common/base/Predicate;
      16: aload_1
      17: getfield      #32                 // Field predicate:Lcom/google/common/base/Predicate;
      20: invokeinterface #43,  2           // InterfaceMethod com/google/common/base/Predicate.equals:(Ljava/lang/Object;)Z
      25: ireturn
      26: iconst_0
      27: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #32                 // Field predicate:Lcom/google/common/base/Predicate;
       4: invokevirtual #47                 // Method java/lang/Object.hashCode:()I
       7: iconst_m1
       8: ixor
       9: ireturn

  public java.lang.String toString();
    Code:
       0: new           #51                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #52                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #54                 // String Predicates.not(
      11: invokevirtual #58                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #32                 // Field predicate:Lcom/google/common/base/Predicate;
      20: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #63                 // String )
      27: invokevirtual #58                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #65                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
