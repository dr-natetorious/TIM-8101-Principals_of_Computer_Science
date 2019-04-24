public final class com.google.common.base.Splitter {
  static java.util.Iterator access$000(com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #69                 // Method splittingIterator:(Ljava/lang/CharSequence;)Ljava/util/Iterator;
       5: areturn

  static com.google.common.base.CharMatcher access$200(com.google.common.base.Splitter);
    Code:
       0: aload_0
       1: getfield      #61                 // Field trimmer:Lcom/google/common/base/CharMatcher;
       4: areturn

  static boolean access$300(com.google.common.base.Splitter);
    Code:
       0: aload_0
       1: getfield      #59                 // Field omitEmptyStrings:Z
       4: ireturn

  static int access$400(com.google.common.base.Splitter);
    Code:
       0: aload_0
       1: getfield      #63                 // Field limit:I
       4: ireturn

  public static com.google.common.base.Splitter fixedLength(int);
    Code:
       0: iload_0
       1: ifle          9
       4: iconst_1
       5: istore_1
       6: goto          11
       9: iconst_0
      10: istore_1
      11: iload_1
      12: ldc           #79                 // String The length may not be less than 1
      14: invokestatic  #85                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/Object;)V
      17: new           #2                  // class com/google/common/base/Splitter
      20: dup
      21: new           #18                 // class com/google/common/base/Splitter$4
      24: dup
      25: iload_0
      26: invokespecial #88                 // Method com/google/common/base/Splitter$4."<init>":(I)V
      29: invokespecial #90                 // Method "<init>":(Lcom/google/common/base/Splitter$Strategy;)V
      32: areturn

  public static com.google.common.base.Splitter on(char);
    Code:
       0: iload_0
       1: invokestatic  #96                 // Method com/google/common/base/CharMatcher.is:(C)Lcom/google/common/base/CharMatcher;
       4: invokestatic  #99                 // Method on:(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/Splitter;
       7: areturn

  public static com.google.common.base.Splitter on(com.google.common.base.CharMatcher);
    Code:
       0: aload_0
       1: invokestatic  #103                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: new           #2                  // class com/google/common/base/Splitter
       8: dup
       9: new           #6                  // class com/google/common/base/Splitter$1
      12: dup
      13: aload_0
      14: invokespecial #106                // Method com/google/common/base/Splitter$1."<init>":(Lcom/google/common/base/CharMatcher;)V
      17: invokespecial #90                 // Method "<init>":(Lcom/google/common/base/Splitter$Strategy;)V
      20: areturn

  public static com.google.common.base.Splitter on(java.lang.String);
    Code:
       0: aload_0
       1: invokevirtual #136                // Method java/lang/String.length:()I
       4: ifeq          12
       7: iconst_1
       8: istore_1
       9: goto          14
      12: iconst_0
      13: istore_1
      14: iload_1
      15: ldc           #138                // String The separator may not be the empty string.
      17: invokestatic  #85                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/Object;)V
      20: aload_0
      21: invokevirtual #136                // Method java/lang/String.length:()I
      24: iconst_1
      25: if_icmpne     37
      28: aload_0
      29: iconst_0
      30: invokevirtual #142                // Method java/lang/String.charAt:(I)C
      33: invokestatic  #144                // Method on:(C)Lcom/google/common/base/Splitter;
      36: areturn
      37: new           #2                  // class com/google/common/base/Splitter
      40: dup
      41: new           #10                 // class com/google/common/base/Splitter$2
      44: dup
      45: aload_0
      46: invokespecial #147                // Method com/google/common/base/Splitter$2."<init>":(Ljava/lang/String;)V
      49: invokespecial #90                 // Method "<init>":(Lcom/google/common/base/Splitter$Strategy;)V
      52: areturn

  public static com.google.common.base.Splitter on(java.util.regex.Pattern);
    Code:
       0: new           #150                // class com/google/common/base/JdkPattern
       3: dup
       4: aload_0
       5: invokespecial #153                // Method com/google/common/base/JdkPattern."<init>":(Ljava/util/regex/Pattern;)V
       8: invokestatic  #155                // Method on:(Lcom/google/common/base/CommonPattern;)Lcom/google/common/base/Splitter;
      11: areturn

  public static com.google.common.base.Splitter onPattern(java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #162                // Method com/google/common/base/Platform.compilePattern:(Ljava/lang/String;)Lcom/google/common/base/CommonPattern;
       4: invokestatic  #155                // Method on:(Lcom/google/common/base/CommonPattern;)Lcom/google/common/base/Splitter;
       7: areturn

  public com.google.common.base.Splitter limit(int);
    Code:
       0: iload_1
       1: ifle          9
       4: iconst_1
       5: istore_2
       6: goto          11
       9: iconst_0
      10: istore_2
      11: iload_2
      12: ldc           #169                // String must be greater than zero: %s
      14: iload_1
      15: invokestatic  #172                // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;I)V
      18: new           #2                  // class com/google/common/base/Splitter
      21: dup
      22: aload_0
      23: getfield      #57                 // Field strategy:Lcom/google/common/base/Splitter$Strategy;
      26: aload_0
      27: getfield      #59                 // Field omitEmptyStrings:Z
      30: aload_0
      31: getfield      #61                 // Field trimmer:Lcom/google/common/base/CharMatcher;
      34: iload_1
      35: invokespecial #51                 // Method "<init>":(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V
      38: areturn

  public com.google.common.base.Splitter omitEmptyStrings();
    Code:
       0: new           #2                  // class com/google/common/base/Splitter
       3: dup
       4: aload_0
       5: getfield      #57                 // Field strategy:Lcom/google/common/base/Splitter$Strategy;
       8: iconst_1
       9: aload_0
      10: getfield      #61                 // Field trimmer:Lcom/google/common/base/CharMatcher;
      13: aload_0
      14: getfield      #63                 // Field limit:I
      17: invokespecial #51                 // Method "<init>":(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V
      20: areturn

  public java.lang.Iterable<java.lang.String> split(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #103                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: new           #22                 // class com/google/common/base/Splitter$5
       8: dup
       9: aload_0
      10: aload_1
      11: invokespecial #178                // Method com/google/common/base/Splitter$5."<init>":(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)V
      14: areturn

  public java.util.List<java.lang.String> splitToList(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokestatic  #103                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: aload_1
       7: invokespecial #69                 // Method splittingIterator:(Ljava/lang/CharSequence;)Ljava/util/Iterator;
      10: astore_1
      11: new           #183                // class java/util/ArrayList
      14: dup
      15: invokespecial #184                // Method java/util/ArrayList."<init>":()V
      18: astore_2
      19: aload_1
      20: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      25: ifeq          44
      28: aload_2
      29: aload_1
      30: invokeinterface #193,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      35: invokeinterface #199,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      40: pop
      41: goto          19
      44: aload_2
      45: invokestatic  #205                // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
      48: areturn

  public com.google.common.base.Splitter trimResults();
    Code:
       0: aload_0
       1: invokestatic  #210                // Method com/google/common/base/CharMatcher.whitespace:()Lcom/google/common/base/CharMatcher;
       4: invokevirtual #212                // Method trimResults:(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/Splitter;
       7: areturn

  public com.google.common.base.Splitter trimResults(com.google.common.base.CharMatcher);
    Code:
       0: aload_1
       1: invokestatic  #103                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: new           #2                  // class com/google/common/base/Splitter
       8: dup
       9: aload_0
      10: getfield      #57                 // Field strategy:Lcom/google/common/base/Splitter$Strategy;
      13: aload_0
      14: getfield      #59                 // Field omitEmptyStrings:Z
      17: aload_1
      18: aload_0
      19: getfield      #63                 // Field limit:I
      22: invokespecial #51                 // Method "<init>":(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V
      25: areturn

  public com.google.common.base.Splitter$MapSplitter withKeyValueSeparator(char);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #144                // Method on:(C)Lcom/google/common/base/Splitter;
       5: invokevirtual #217                // Method withKeyValueSeparator:(Lcom/google/common/base/Splitter;)Lcom/google/common/base/Splitter$MapSplitter;
       8: areturn

  public com.google.common.base.Splitter$MapSplitter withKeyValueSeparator(com.google.common.base.Splitter);
    Code:
       0: new           #24                 // class com/google/common/base/Splitter$MapSplitter
       3: dup
       4: aload_0
       5: aload_1
       6: aconst_null
       7: invokespecial #220                // Method com/google/common/base/Splitter$MapSplitter."<init>":(Lcom/google/common/base/Splitter;Lcom/google/common/base/Splitter;Lcom/google/common/base/Splitter$1;)V
      10: areturn

  public com.google.common.base.Splitter$MapSplitter withKeyValueSeparator(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #223                // Method on:(Ljava/lang/String;)Lcom/google/common/base/Splitter;
       5: invokevirtual #217                // Method withKeyValueSeparator:(Lcom/google/common/base/Splitter;)Lcom/google/common/base/Splitter$MapSplitter;
       8: areturn
}
