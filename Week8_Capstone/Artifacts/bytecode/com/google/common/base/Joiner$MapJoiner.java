public final class com.google.common.base.Joiner$MapJoiner {
  com.google.common.base.Joiner$MapJoiner(com.google.common.base.Joiner, java.lang.String, com.google.common.base.Joiner$1);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #32                 // Method "<init>":(Lcom/google/common/base/Joiner;Ljava/lang/String;)V
       6: return

  public <A extends java.lang.Appendable> A appendTo(A, java.lang.Iterable<? extends java.util.Map$Entry<?, ?>>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokeinterface #41,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       8: invokevirtual #44                 // Method appendTo:(Ljava/lang/Appendable;Ljava/util/Iterator;)Ljava/lang/Appendable;
      11: areturn

  public <A extends java.lang.Appendable> A appendTo(A, java.util.Iterator<? extends java.util.Map$Entry<?, ?>>);
    Code:
       0: aload_1
       1: invokestatic  #24                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_2
       6: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      11: ifeq          101
      14: aload_2
      15: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      20: checkcast     #59                 // class java/util/Map$Entry
      23: astore_3
      24: aload_1
      25: aload_0
      26: getfield      #18                 // Field joiner:Lcom/google/common/base/Joiner;
      29: aload_3
      30: invokeinterface #62,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      35: invokevirtual #66                 // Method com/google/common/base/Joiner.toString:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      38: invokeinterface #72,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      43: pop
      44: aload_1
      45: aload_0
      46: getfield      #28                 // Field keyValueSeparator:Ljava/lang/String;
      49: invokeinterface #72,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      54: pop
      55: aload_1
      56: aload_0
      57: getfield      #18                 // Field joiner:Lcom/google/common/base/Joiner;
      60: aload_3
      61: invokeinterface #75,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      66: invokevirtual #66                 // Method com/google/common/base/Joiner.toString:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      69: invokeinterface #72,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      74: pop
      75: aload_2
      76: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      81: ifeq          101
      84: aload_1
      85: aload_0
      86: getfield      #18                 // Field joiner:Lcom/google/common/base/Joiner;
      89: invokestatic  #79                 // Method com/google/common/base/Joiner.access$100:(Lcom/google/common/base/Joiner;)Ljava/lang/String;
      92: invokeinterface #72,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      97: pop
      98: goto          14
     101: aload_1
     102: areturn

  public <A extends java.lang.Appendable> A appendTo(A, java.util.Map<?, ?>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokeinterface #87,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       8: invokevirtual #89                 // Method appendTo:(Ljava/lang/Appendable;Ljava/lang/Iterable;)Ljava/lang/Appendable;
      11: areturn

  public java.lang.StringBuilder appendTo(java.lang.StringBuilder, java.lang.Iterable<? extends java.util.Map$Entry<?, ?>>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokeinterface #41,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       8: invokevirtual #94                 // Method appendTo:(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;
      11: areturn

  public java.lang.StringBuilder appendTo(java.lang.StringBuilder, java.util.Iterator<? extends java.util.Map$Entry<?, ?>>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #44                 // Method appendTo:(Ljava/lang/Appendable;Ljava/util/Iterator;)Ljava/lang/Appendable;
       6: pop
       7: aload_1
       8: areturn
       9: astore_1
      10: new           #99                 // class java/lang/AssertionError
      13: dup
      14: aload_1
      15: invokespecial #102                // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
      18: athrow
    Exception table:
       from    to  target type
           0     7     9   Class java/io/IOException

  public java.lang.StringBuilder appendTo(java.lang.StringBuilder, java.util.Map<?, ?>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokeinterface #87,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       8: invokevirtual #106                // Method appendTo:(Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;
      11: areturn

  public java.lang.String join(java.lang.Iterable<? extends java.util.Map$Entry<?, ?>>);
    Code:
       0: aload_0
       1: aload_1
       2: invokeinterface #41,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       7: invokevirtual #112                // Method join:(Ljava/util/Iterator;)Ljava/lang/String;
      10: areturn

  public java.lang.String join(java.util.Iterator<? extends java.util.Map$Entry<?, ?>>);
    Code:
       0: aload_0
       1: new           #115                // class java/lang/StringBuilder
       4: dup
       5: invokespecial #116                // Method java/lang/StringBuilder."<init>":()V
       8: aload_1
       9: invokevirtual #94                 // Method appendTo:(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;
      12: invokevirtual #119                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      15: areturn

  public java.lang.String join(java.util.Map<?, ?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokeinterface #87,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       7: invokevirtual #123                // Method join:(Ljava/lang/Iterable;)Ljava/lang/String;
      10: areturn

  public com.google.common.base.Joiner$MapJoiner useForNull(java.lang.String);
    Code:
       0: new           #2                  // class com/google/common/base/Joiner$MapJoiner
       3: dup
       4: aload_0
       5: getfield      #18                 // Field joiner:Lcom/google/common/base/Joiner;
       8: aload_1
       9: invokevirtual #129                // Method com/google/common/base/Joiner.useForNull:(Ljava/lang/String;)Lcom/google/common/base/Joiner;
      12: aload_0
      13: getfield      #28                 // Field keyValueSeparator:Ljava/lang/String;
      16: invokespecial #32                 // Method "<init>":(Lcom/google/common/base/Joiner;Ljava/lang/String;)V
      19: areturn
}
