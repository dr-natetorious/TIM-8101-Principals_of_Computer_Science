class com.google.common.base.Converter$1$1 implements java.util.Iterator<B> {
  final com.google.common.base.Converter$1 this$1;

  com.google.common.base.Converter$1$1(com.google.common.base.Converter$1);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field this$1:Lcom/google/common/base/Converter$1;
       5: aload_0
       6: invokespecial #24                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_0
      11: getfield      #21                 // Field this$1:Lcom/google/common/base/Converter$1;
      14: getfield      #28                 // Field com/google/common/base/Converter$1.val$fromIterable:Ljava/lang/Iterable;
      17: invokeinterface #31,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      22: putfield      #33                 // Field fromIterator:Ljava/util/Iterator;
      25: return

  public boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #33                 // Field fromIterator:Ljava/util/Iterator;
       4: invokeinterface #38,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       9: ireturn

  public B next();
    Code:
       0: aload_0
       1: getfield      #21                 // Field this$1:Lcom/google/common/base/Converter$1;
       4: getfield      #44                 // Field com/google/common/base/Converter$1.this$0:Lcom/google/common/base/Converter;
       7: aload_0
       8: getfield      #33                 // Field fromIterator:Ljava/util/Iterator;
      11: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      16: invokevirtual #52                 // Method com/google/common/base/Converter.convert:(Ljava/lang/Object;)Ljava/lang/Object;
      19: areturn

  public void remove();
    Code:
       0: aload_0
       1: getfield      #33                 // Field fromIterator:Ljava/util/Iterator;
       4: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.remove:()V
       9: return
}
