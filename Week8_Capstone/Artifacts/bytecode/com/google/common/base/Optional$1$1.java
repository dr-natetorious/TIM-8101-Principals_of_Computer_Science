class com.google.common.base.Optional$1$1 extends com.google.common.base.AbstractIterator<T> {
  final com.google.common.base.Optional$1 this$0;

  com.google.common.base.Optional$1$1(com.google.common.base.Optional$1);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field this$0:Lcom/google/common/base/Optional$1;
       5: aload_0
       6: invokespecial #21                 // Method com/google/common/base/AbstractIterator."<init>":()V
       9: aload_0
      10: aload_0
      11: getfield      #18                 // Field this$0:Lcom/google/common/base/Optional$1;
      14: getfield      #25                 // Field com/google/common/base/Optional$1.val$optionals:Ljava/lang/Iterable;
      17: invokeinterface #28,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      22: invokestatic  #34                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      25: checkcast     #36                 // class java/util/Iterator
      28: putfield      #38                 // Field iterator:Ljava/util/Iterator;
      31: return

  protected T computeNext();
    Code:
       0: aload_0
       1: getfield      #38                 // Field iterator:Ljava/util/Iterator;
       4: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       9: ifeq          37
      12: aload_0
      13: getfield      #38                 // Field iterator:Ljava/util/Iterator;
      16: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      21: checkcast     #50                 // class com/google/common/base/Optional
      24: astore_1
      25: aload_1
      26: invokevirtual #53                 // Method com/google/common/base/Optional.isPresent:()Z
      29: ifeq          0
      32: aload_1
      33: invokevirtual #56                 // Method com/google/common/base/Optional.get:()Ljava/lang/Object;
      36: areturn
      37: aload_0
      38: invokevirtual #59                 // Method endOfData:()Ljava/lang/Object;
      41: areturn
}
