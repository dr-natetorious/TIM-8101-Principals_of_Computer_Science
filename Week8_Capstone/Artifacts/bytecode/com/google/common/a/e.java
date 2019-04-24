class com.google.common.a.e<K, V> extends com.google.common.a.a<K, V> implements java.io.Serializable {
  final K a;

  final V b;

  com.google.common.a.e(K, V);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method com/google/common/a/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #19                 // Field a:Ljava/lang/Object;
       9: aload_0
      10: aload_2
      11: putfield      #21                 // Field b:Ljava/lang/Object;
      14: return

  public final K getKey();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Ljava/lang/Object;
       4: areturn

  public final V getValue();
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:Ljava/lang/Object;
       4: areturn

  public final V setValue(V);
    Code:
       0: new           #33                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #34                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow
}
