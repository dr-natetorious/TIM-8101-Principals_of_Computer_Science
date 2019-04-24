class com.google.common.base.Predicates$IsEqualToPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
  com.google.common.base.Predicates$IsEqualToPredicate(java.lang.Object, com.google.common.base.Predicates$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #32                 // Method "<init>":(Ljava/lang/Object;)V
       5: return

  public boolean apply(T);
    Code:
       0: aload_0
       1: getfield      #26                 // Field target:Ljava/lang/Object;
       4: aload_1
       5: invokevirtual #37                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
       8: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Predicates$IsEqualToPredicate
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Predicates$IsEqualToPredicate
      11: astore_1
      12: aload_0
      13: getfield      #26                 // Field target:Ljava/lang/Object;
      16: aload_1
      17: getfield      #26                 // Field target:Ljava/lang/Object;
      20: invokevirtual #37                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #26                 // Field target:Ljava/lang/Object;
       4: invokevirtual #42                 // Method java/lang/Object.hashCode:()I
       7: ireturn

  public java.lang.String toString();
    Code:
       0: new           #46                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #47                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #49                 // String Predicates.equalTo(
      11: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #26                 // Field target:Ljava/lang/Object;
      20: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #58                 // String )
      27: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #60                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
