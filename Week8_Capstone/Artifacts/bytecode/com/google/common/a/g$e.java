final class com.google.common.a.g$e<K, V> extends com.google.common.a.a<K, V> {
  final K a;

  V b;

  com.google.common.a.g$e<K, V> c;

  com.google.common.a.g$e<K, V> d;

  com.google.common.a.g$e<K, V> e;

  com.google.common.a.g$e<K, V> f;

  com.google.common.a.g$e(K, V);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method com/google/common/a/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #25                 // Field a:Ljava/lang/Object;
       9: aload_0
      10: aload_2
      11: putfield      #27                 // Field b:Ljava/lang/Object;
      14: return

  public K getKey();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Ljava/lang/Object;
       4: areturn

  public V getValue();
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Ljava/lang/Object;
       4: areturn

  public V setValue(V);
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Ljava/lang/Object;
       4: astore_2
       5: aload_0
       6: aload_1
       7: putfield      #27                 // Field b:Ljava/lang/Object;
      10: aload_2
      11: areturn
}
