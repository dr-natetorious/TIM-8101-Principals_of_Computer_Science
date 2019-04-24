final class com.google.common.a.j$1 extends com.google.common.a.q<K, java.util.Map$Entry<K, V>> {
  final com.google.common.base.Function a;

  com.google.common.a.j$1(java.util.Iterator, com.google.common.base.Function);
    Code:
       0: aload_0
       1: aload_2
       2: putfield      #15                 // Field a:Lcom/google/common/base/Function;
       5: aload_0
       6: aload_1
       7: invokespecial #18                 // Method com/google/common/a/q."<init>":(Ljava/util/Iterator;)V
      10: return

  java.lang.Object a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #24                 // Method b:(Ljava/lang/Object;)Ljava/util/Map$Entry;
       5: areturn

  java.util.Map$Entry<K, V> b(K);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #15                 // Field a:Lcom/google/common/base/Function;
       5: aload_1
       6: invokeinterface #29,  2           // InterfaceMethod com/google/common/base/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      11: invokestatic  #32                 // Method com/google/common/a/j.a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
      14: areturn
}
