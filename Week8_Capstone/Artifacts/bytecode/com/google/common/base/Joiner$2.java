class com.google.common.base.Joiner$2 extends com.google.common.base.Joiner {
  final com.google.common.base.Joiner this$0;

  com.google.common.base.Joiner$2(com.google.common.base.Joiner, com.google.common.base.Joiner);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field this$0:Lcom/google/common/base/Joiner;
       5: aload_0
       6: aload_2
       7: aconst_null
       8: invokespecial #16                 // Method com/google/common/base/Joiner."<init>":(Lcom/google/common/base/Joiner;Lcom/google/common/base/Joiner$1;)V
      11: return

  public <A extends java.lang.Appendable> A appendTo(A, java.util.Iterator<?>);
    Code:
       0: aload_1
       1: ldc           #21                 // String appendable
       3: invokestatic  #27                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       6: pop
       7: aload_2
       8: ldc           #29                 // String parts
      10: invokestatic  #27                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      13: pop
      14: aload_2
      15: invokeinterface #35,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      20: ifeq          49
      23: aload_2
      24: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      29: astore_3
      30: aload_3
      31: ifnull        14
      34: aload_1
      35: aload_0
      36: getfield      #13                 // Field this$0:Lcom/google/common/base/Joiner;
      39: aload_3
      40: invokevirtual #43                 // Method com/google/common/base/Joiner.toString:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      43: invokeinterface #49,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      48: pop
      49: aload_2
      50: invokeinterface #35,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      55: ifeq          86
      58: aload_2
      59: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      64: astore_3
      65: aload_3
      66: ifnull        49
      69: aload_1
      70: aload_0
      71: getfield      #13                 // Field this$0:Lcom/google/common/base/Joiner;
      74: invokestatic  #53                 // Method com/google/common/base/Joiner.access$100:(Lcom/google/common/base/Joiner;)Ljava/lang/String;
      77: invokeinterface #49,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      82: pop
      83: goto          34
      86: aload_1
      87: areturn

  public com.google.common.base.Joiner useForNull(java.lang.String);
    Code:
       0: new           #59                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #61                 // String already specified skipNulls
       6: invokespecial #64                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow

  public com.google.common.base.Joiner$MapJoiner withKeyValueSeparator(java.lang.String);
    Code:
       0: new           #59                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #68                 // String can't use .skipNulls() with maps
       6: invokespecial #64                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow
}
