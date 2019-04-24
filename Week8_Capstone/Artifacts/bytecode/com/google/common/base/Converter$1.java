class com.google.common.base.Converter$1 implements java.lang.Iterable<B> {
  final com.google.common.base.Converter this$0;

  final java.lang.Iterable val$fromIterable;

  com.google.common.base.Converter$1(com.google.common.base.Converter, java.lang.Iterable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field this$0:Lcom/google/common/base/Converter;
       5: aload_0
       6: aload_2
       7: putfield      #24                 // Field val$fromIterable:Ljava/lang/Iterable;
      10: aload_0
      11: invokespecial #27                 // Method java/lang/Object."<init>":()V
      14: return

  public java.util.Iterator<B> iterator();
    Code:
       0: new           #14                 // class com/google/common/base/Converter$1$1
       3: dup
       4: aload_0
       5: invokespecial #33                 // Method com/google/common/base/Converter$1$1."<init>":(Lcom/google/common/base/Converter$1;)V
       8: areturn
}
