final class com.google.common.base.Predicates$ObjectPredicate$3 extends com.google.common.base.Predicates$ObjectPredicate {
  com.google.common.base.Predicates$ObjectPredicate$3(java.lang.String, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aconst_null
       4: invokespecial #12                 // Method com/google/common/base/Predicates$ObjectPredicate."<init>":(Ljava/lang/String;ILcom/google/common/base/Predicates$1;)V
       7: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_1
       5: ireturn
       6: iconst_0
       7: ireturn

  public java.lang.String toString();
    Code:
       0: ldc           #19                 // String Predicates.isNull()
       2: areturn
}
