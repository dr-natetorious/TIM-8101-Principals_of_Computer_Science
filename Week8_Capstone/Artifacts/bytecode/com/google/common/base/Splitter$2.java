final class com.google.common.base.Splitter$2 implements com.google.common.base.Splitter$Strategy {
  final java.lang.String val$separator;

  com.google.common.base.Splitter$2(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field val$separator:Ljava/lang/String;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public com.google.common.base.Splitter$SplittingIterator iterator(com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: new           #13                 // class com/google/common/base/Splitter$2$1
       3: dup
       4: aload_0
       5: aload_1
       6: aload_2
       7: invokespecial #28                 // Method com/google/common/base/Splitter$2$1."<init>":(Lcom/google/common/base/Splitter$2;Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)V
      10: areturn

  public java.util.Iterator iterator(com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #31                 // Method iterator:(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)Lcom/google/common/base/Splitter$SplittingIterator;
       6: areturn
}
