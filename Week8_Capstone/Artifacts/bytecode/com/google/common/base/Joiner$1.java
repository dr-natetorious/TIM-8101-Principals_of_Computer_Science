class com.google.common.base.Joiner$1 extends com.google.common.base.Joiner {
  final com.google.common.base.Joiner this$0;

  final java.lang.String val$nullText;

  com.google.common.base.Joiner$1(com.google.common.base.Joiner, com.google.common.base.Joiner, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field this$0:Lcom/google/common/base/Joiner;
       5: aload_0
       6: aload_3
       7: putfield      #17                 // Field val$nullText:Ljava/lang/String;
      10: aload_0
      11: aload_2
      12: aconst_null
      13: invokespecial #20                 // Method com/google/common/base/Joiner."<init>":(Lcom/google/common/base/Joiner;Lcom/google/common/base/Joiner$1;)V
      16: return

  public com.google.common.base.Joiner skipNulls();
    Code:
       0: new           #25                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #27                 // String already specified useForNull
       6: invokespecial #30                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow

  java.lang.CharSequence toString(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     9
       4: aload_0
       5: getfield      #17                 // Field val$nullText:Ljava/lang/String;
       8: areturn
       9: aload_0
      10: getfield      #15                 // Field this$0:Lcom/google/common/base/Joiner;
      13: aload_1
      14: invokevirtual #34                 // Method com/google/common/base/Joiner.toString:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      17: areturn

  public com.google.common.base.Joiner useForNull(java.lang.String);
    Code:
       0: new           #25                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #27                 // String already specified useForNull
       6: invokespecial #30                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow
}
