class com.google.common.base.Predicates$ContainsPatternPredicate implements com.google.common.base.Predicate<java.lang.CharSequence>, java.io.Serializable {
  final com.google.common.base.CommonPattern pattern;

  com.google.common.base.Predicates$ContainsPatternPredicate(com.google.common.base.CommonPattern);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #29                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #31                 // class com/google/common/base/CommonPattern
      12: putfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      15: return

  public boolean apply(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
       4: aload_1
       5: invokevirtual #40                 // Method com/google/common/base/CommonPattern.matcher:(Ljava/lang/CharSequence;)Lcom/google/common/base/CommonMatcher;
       8: invokevirtual #46                 // Method com/google/common/base/CommonMatcher.find:()Z
      11: ireturn

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #49                 // class java/lang/CharSequence
       5: invokevirtual #51                 // Method apply:(Ljava/lang/CharSequence;)Z
       8: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Predicates$ContainsPatternPredicate
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          63
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Predicates$ContainsPatternPredicate
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      26: invokevirtual #55                 // Method com/google/common/base/CommonPattern.pattern:()Ljava/lang/String;
      29: aload_1
      30: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      33: invokevirtual #55                 // Method com/google/common/base/CommonPattern.pattern:()Ljava/lang/String;
      36: invokestatic  #61                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      39: ifeq          63
      42: iload_3
      43: istore_2
      44: aload_0
      45: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      48: invokevirtual #65                 // Method com/google/common/base/CommonPattern.flags:()I
      51: aload_1
      52: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      55: invokevirtual #65                 // Method com/google/common/base/CommonPattern.flags:()I
      58: if_icmpne     63
      61: iconst_1
      62: istore_2
      63: iload_2
      64: ireturn

  public int hashCode();
    Code:
       0: iconst_2
       1: anewarray     #5                  // class java/lang/Object
       4: dup
       5: iconst_0
       6: aload_0
       7: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      10: invokevirtual #55                 // Method com/google/common/base/CommonPattern.pattern:()Ljava/lang/String;
      13: aastore
      14: dup
      15: iconst_1
      16: aload_0
      17: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      20: invokevirtual #65                 // Method com/google/common/base/CommonPattern.flags:()I
      23: invokestatic  #72                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      26: aastore
      27: invokestatic  #75                 // Method com/google/common/base/Objects.hashCode:([Ljava/lang/Object;)I
      30: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
       4: invokestatic  #82                 // Method com/google/common/base/MoreObjects.toStringHelper:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       7: ldc           #83                 // String pattern
       9: aload_0
      10: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      13: invokevirtual #55                 // Method com/google/common/base/CommonPattern.pattern:()Ljava/lang/String;
      16: invokevirtual #89                 // Method com/google/common/base/MoreObjects$ToStringHelper.add:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
      19: ldc           #91                 // String pattern.flags
      21: aload_0
      22: getfield      #33                 // Field pattern:Lcom/google/common/base/CommonPattern;
      25: invokevirtual #65                 // Method com/google/common/base/CommonPattern.flags:()I
      28: invokevirtual #94                 // Method com/google/common/base/MoreObjects$ToStringHelper.add:(Ljava/lang/String;I)Lcom/google/common/base/MoreObjects$ToStringHelper;
      31: invokevirtual #96                 // Method com/google/common/base/MoreObjects$ToStringHelper.toString:()Ljava/lang/String;
      34: astore_1
      35: new           #98                 // class java/lang/StringBuilder
      38: dup
      39: invokespecial #99                 // Method java/lang/StringBuilder."<init>":()V
      42: astore_2
      43: aload_2
      44: ldc           #101                // String Predicates.contains(
      46: invokevirtual #105                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: aload_2
      51: aload_1
      52: invokevirtual #105                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      55: pop
      56: aload_2
      57: ldc           #107                // String )
      59: invokevirtual #105                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_2
      64: invokevirtual #108                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      67: areturn
}
