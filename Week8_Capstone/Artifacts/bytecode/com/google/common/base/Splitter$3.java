final class com.google.common.base.Splitter$3 implements com.google.common.base.Splitter$Strategy {
  final com.google.common.base.CommonPattern val$separatorPattern;

  com.google.common.base.Splitter$3(com.google.common.base.CommonPattern);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field val$separatorPattern:Lcom/google/common/base/CommonPattern;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public com.google.common.base.Splitter$SplittingIterator iterator(com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: new           #13                 // class com/google/common/base/Splitter$3$1
       3: dup
       4: aload_0
       5: aload_1
       6: aload_2
       7: aload_0
       8: getfield      #19                 // Field val$separatorPattern:Lcom/google/common/base/CommonPattern;
      11: aload_2
      12: invokevirtual #31                 // Method com/google/common/base/CommonPattern.matcher:(Ljava/lang/CharSequence;)Lcom/google/common/base/CommonMatcher;
      15: invokespecial #34                 // Method com/google/common/base/Splitter$3$1."<init>":(Lcom/google/common/base/Splitter$3;Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;Lcom/google/common/base/CommonMatcher;)V
      18: areturn

  public java.util.Iterator iterator(com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #37                 // Method iterator:(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)Lcom/google/common/base/Splitter$SplittingIterator;
       6: areturn
}
