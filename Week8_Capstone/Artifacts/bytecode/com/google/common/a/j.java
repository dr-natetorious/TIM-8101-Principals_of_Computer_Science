public final class com.google.common.a.j {
  static int a(int);
    Code:
       0: iload_0
       1: iconst_3
       2: if_icmpge     16
       5: iload_0
       6: ldc           #28                 // String expectedSize
       8: invokestatic  #33                 // Method com/google/common/a/d.a:(ILjava/lang/String;)I
      11: pop
      12: iload_0
      13: iconst_1
      14: iadd
      15: ireturn
      16: iload_0
      17: ldc           #34                 // int 1073741824
      19: if_icmpge     31
      22: iload_0
      23: i2f
      24: ldc           #35                 // float 0.75f
      26: fdiv
      27: fconst_1
      28: fadd
      29: f2i
      30: ireturn
      31: ldc           #36                 // int 2147483647
      33: ireturn

  static <K> com.google.common.base.Function<java.util.Map$Entry<K, ?>, K> a();
    Code:
       0: getstatic     #41                 // Field com/google/common/a/j$a.a:Lcom/google/common/a/j$a;
       3: areturn

  static <V> V a(java.util.Map<?, V>, java.lang.Object);
    Code:
       0: aload_0
       1: invokestatic  #54                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: aload_1
       7: invokeinterface #59,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      12: astore_0
      13: aload_0
      14: areturn
      15: aconst_null
      16: areturn
      17: astore_0
      18: goto          15
    Exception table:
       from    to  target type
           5    13    17   Class java/lang/ClassCastException
           5    13    17   Class java/lang/NullPointerException

  static <K, V> java.util.Iterator<K> a(java.util.Iterator<java.util.Map$Entry<K, V>>);
    Code:
       0: aload_0
       1: invokestatic  #63                 // Method a:()Lcom/google/common/base/Function;
       4: invokestatic  #68                 // Method com/google/common/a/f.a:(Ljava/util/Iterator;Lcom/google/common/base/Function;)Ljava/util/Iterator;
       7: areturn

  static <K, V> java.util.Iterator<java.util.Map$Entry<K, V>> a(java.util.Set<K>, com.google.common.base.Function<? super K, V>);
    Code:
       0: new           #6                  // class com/google/common/a/j$1
       3: dup
       4: aload_0
       5: invokeinterface #76,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      10: aload_1
      11: invokespecial #80                 // Method com/google/common/a/j$1."<init>":(Ljava/util/Iterator;Lcom/google/common/base/Function;)V
      14: areturn

  public static <K, V> java.util.Map$Entry<K, V> a(K, V);
    Code:
       0: new           #84                 // class com/google/common/a/e
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #87                 // Method com/google/common/a/e."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
       9: areturn

  static <V> com.google.common.base.Function<java.util.Map$Entry<?, V>, V> b();
    Code:
       0: getstatic     #90                 // Field com/google/common/a/j$a.b:Lcom/google/common/a/j$a;
       3: areturn

  static <K, V> java.util.Iterator<V> b(java.util.Iterator<java.util.Map$Entry<K, V>>);
    Code:
       0: aload_0
       1: invokestatic  #93                 // Method b:()Lcom/google/common/base/Function;
       4: invokestatic  #68                 // Method com/google/common/a/f.a:(Ljava/util/Iterator;Lcom/google/common/base/Function;)Ljava/util/Iterator;
       7: areturn

  public static <K, V> java.util.HashMap<K, V> c();
    Code:
       0: new           #97                 // class java/util/HashMap
       3: dup
       4: invokespecial #100                // Method java/util/HashMap."<init>":()V
       7: areturn
}
