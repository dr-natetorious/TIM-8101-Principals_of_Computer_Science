final class com.google.common.base.CharMatcher$And extends com.google.common.base.CharMatcher {
  final com.google.common.base.CharMatcher first;

  final com.google.common.base.CharMatcher second;

  com.google.common.base.CharMatcher$And(com.google.common.base.CharMatcher, com.google.common.base.CharMatcher);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method com/google/common/base/CharMatcher."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #19                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #4                  // class com/google/common/base/CharMatcher
      12: putfield      #21                 // Field first:Lcom/google/common/base/CharMatcher;
      15: aload_0
      16: aload_2
      17: invokestatic  #19                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      20: checkcast     #4                  // class com/google/common/base/CharMatcher
      23: putfield      #23                 // Field second:Lcom/google/common/base/CharMatcher;
      26: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #29                 // class java/lang/Character
       5: invokespecial #32                 // Method com/google/common/base/CharMatcher.apply:(Ljava/lang/Character;)Z
       8: ireturn

  public boolean matches(char);
    Code:
       0: aload_0
       1: getfield      #21                 // Field first:Lcom/google/common/base/CharMatcher;
       4: iload_1
       5: invokevirtual #37                 // Method com/google/common/base/CharMatcher.matches:(C)Z
       8: ifeq          24
      11: aload_0
      12: getfield      #23                 // Field second:Lcom/google/common/base/CharMatcher;
      15: iload_1
      16: invokevirtual #37                 // Method com/google/common/base/CharMatcher.matches:(C)Z
      19: ifeq          24
      22: iconst_1
      23: ireturn
      24: iconst_0
      25: ireturn

  void setBits(java.util.BitSet);
    Code:
       0: new           #41                 // class java/util/BitSet
       3: dup
       4: invokespecial #42                 // Method java/util/BitSet."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #21                 // Field first:Lcom/google/common/base/CharMatcher;
      12: aload_2
      13: invokevirtual #44                 // Method com/google/common/base/CharMatcher.setBits:(Ljava/util/BitSet;)V
      16: new           #41                 // class java/util/BitSet
      19: dup
      20: invokespecial #42                 // Method java/util/BitSet."<init>":()V
      23: astore_3
      24: aload_0
      25: getfield      #23                 // Field second:Lcom/google/common/base/CharMatcher;
      28: aload_3
      29: invokevirtual #44                 // Method com/google/common/base/CharMatcher.setBits:(Ljava/util/BitSet;)V
      32: aload_2
      33: aload_3
      34: invokevirtual #47                 // Method java/util/BitSet.and:(Ljava/util/BitSet;)V
      37: aload_1
      38: aload_2
      39: invokevirtual #50                 // Method java/util/BitSet.or:(Ljava/util/BitSet;)V
      42: return

  public java.lang.String toString();
    Code:
       0: new           #54                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #55                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #57                 // String CharMatcher.and(
      11: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #21                 // Field first:Lcom/google/common/base/CharMatcher;
      20: invokevirtual #64                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #66                 // String ,
      27: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #23                 // Field second:Lcom/google/common/base/CharMatcher;
      36: invokevirtual #64                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #68                 // String )
      43: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #70                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
