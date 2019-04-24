public final class com.google.common.base.Splitter$MapSplitter {
  com.google.common.base.Splitter$MapSplitter(com.google.common.base.Splitter, com.google.common.base.Splitter, com.google.common.base.Splitter$1);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #33                 // Method "<init>":(Lcom/google/common/base/Splitter;Lcom/google/common/base/Splitter;)V
       6: return

  public java.util.Map<java.lang.String, java.lang.String> split(java.lang.CharSequence);
    Code:
       0: new           #37                 // class java/util/LinkedHashMap
       3: dup
       4: invokespecial #38                 // Method java/util/LinkedHashMap."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #21                 // Field outerSplitter:Lcom/google/common/base/Splitter;
      12: aload_1
      13: invokevirtual #41                 // Method com/google/common/base/Splitter.split:(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
      16: invokeinterface #47,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      21: astore_1
      22: aload_1
      23: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      28: ifeq          143
      31: aload_1
      32: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      37: checkcast     #59                 // class java/lang/String
      40: astore_3
      41: aload_0
      42: getfield      #29                 // Field entrySplitter:Lcom/google/common/base/Splitter;
      45: aload_3
      46: invokestatic  #63                 // Method com/google/common/base/Splitter.access$000:(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)Ljava/util/Iterator;
      49: astore        4
      51: aload         4
      53: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      58: ldc           #11                 // String Chunk [%s] is not a valid entry
      60: aload_3
      61: invokestatic  #67                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;Ljava/lang/Object;)V
      64: aload         4
      66: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      71: checkcast     #59                 // class java/lang/String
      74: astore        5
      76: aload_2
      77: aload         5
      79: invokeinterface #73,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      84: iconst_1
      85: ixor
      86: ldc           #75                 // String Duplicate key [%s] found.
      88: aload         5
      90: invokestatic  #67                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;Ljava/lang/Object;)V
      93: aload         4
      95: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     100: ldc           #11                 // String Chunk [%s] is not a valid entry
     102: aload_3
     103: invokestatic  #67                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;Ljava/lang/Object;)V
     106: aload_2
     107: aload         5
     109: aload         4
     111: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     116: checkcast     #59                 // class java/lang/String
     119: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     124: pop
     125: aload         4
     127: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     132: iconst_1
     133: ixor
     134: ldc           #11                 // String Chunk [%s] is not a valid entry
     136: aload_3
     137: invokestatic  #67                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;Ljava/lang/Object;)V
     140: goto          22
     143: aload_2
     144: invokestatic  #85                 // Method java/util/Collections.unmodifiableMap:(Ljava/util/Map;)Ljava/util/Map;
     147: areturn
}
