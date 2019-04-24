final class com.google.common.a.f$1 extends com.google.common.a.q<F, T> {
  final com.google.common.base.Function a;

  com.google.common.a.f$1(java.util.Iterator, com.google.common.base.Function);
    Code:
       0: aload_0
       1: aload_2
       2: putfield      #15                 // Field a:Lcom/google/common/base/Function;
       5: aload_0
       6: aload_1
       7: invokespecial #18                 // Method com/google/common/a/q."<init>":(Ljava/util/Iterator;)V
      10: return

  T a(F);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Lcom/google/common/base/Function;
       4: aload_1
       5: invokeinterface #25,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      10: areturn
}
