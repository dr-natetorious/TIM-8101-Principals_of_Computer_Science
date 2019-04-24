abstract class com.google.common.a.j$e<K, V> extends java.util.AbstractMap<K, V> {
  com.google.common.a.j$e();
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/util/AbstractMap."<init>":()V
       4: return

  abstract java.util.Set<java.util.Map$Entry<K, V>> a();

  java.util.Set<K> b();
    Code:
       0: new           #24                 // class com/google/common/a/j$c
       3: dup
       4: aload_0
       5: invokespecial #27                 // Method com/google/common/a/j$c."<init>":(Ljava/util/Map;)V
       8: areturn

  java.util.Collection<V> c();
    Code:
       0: new           #32                 // class com/google/common/a/j$d
       3: dup
       4: aload_0
       5: invokespecial #33                 // Method com/google/common/a/j$d."<init>":(Ljava/util/Map;)V
       8: areturn

  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Ljava/util/Set;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #39                 // Method a:()Ljava/util/Set;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #37                 // Field a:Ljava/util/Set;
      21: aload_1
      22: areturn

  public java.util.Set<K> keySet();
    Code:
       0: aload_0
       1: getfield      #43                 // Field b:Ljava/util/Set;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #45                 // Method b:()Ljava/util/Set;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #43                 // Field b:Ljava/util/Set;
      21: aload_1
      22: areturn

  public java.util.Collection<V> values();
    Code:
       0: aload_0
       1: getfield      #48                 // Field c:Ljava/util/Collection;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #50                 // Method c:()Ljava/util/Collection;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #48                 // Field c:Ljava/util/Collection;
      21: aload_1
      22: areturn
}
