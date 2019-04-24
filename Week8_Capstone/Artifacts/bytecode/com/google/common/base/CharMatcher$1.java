class com.google.common.base.CharMatcher$1 extends com.google.common.base.CharMatcher$NegatedFastMatcher {
  final com.google.common.base.CharMatcher this$0;

  final java.lang.String val$description;

  com.google.common.base.CharMatcher$1(com.google.common.base.CharMatcher, com.google.common.base.CharMatcher, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field this$0:Lcom/google/common/base/CharMatcher;
       5: aload_0
       6: aload_3
       7: putfield      #19                 // Field val$description:Ljava/lang/String;
      10: aload_0
      11: aload_2
      12: invokespecial #22                 // Method com/google/common/base/CharMatcher$NegatedFastMatcher."<init>":(Lcom/google/common/base/CharMatcher;)V
      15: return

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #19                 // Field val$description:Ljava/lang/String;
       4: areturn
}
