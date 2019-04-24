class com.google.common.base.Predicates$ContainsPatternFromStringPredicate extends com.google.common.base.Predicates$ContainsPatternPredicate {
  com.google.common.base.Predicates$ContainsPatternFromStringPredicate(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #19                 // Method com/google/common/base/Platform.compilePattern:(Ljava/lang/String;)Lcom/google/common/base/CommonPattern;
       5: invokespecial #22                 // Method com/google/common/base/Predicates$ContainsPatternPredicate."<init>":(Lcom/google/common/base/CommonPattern;)V
       8: return

  public java.lang.String toString();
    Code:
       0: new           #27                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #30                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #32                 // String Predicates.containsPattern(
      11: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #40                 // Field pattern:Lcom/google/common/base/CommonPattern;
      20: invokevirtual #44                 // Method com/google/common/base/CommonPattern.pattern:()Ljava/lang/String;
      23: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #46                 // String )
      30: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: invokevirtual #48                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      38: areturn
}
