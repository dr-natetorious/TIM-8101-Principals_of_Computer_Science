class com.google.common.a.l$c$1 extends com.google.common.a.q<java.util.Map$Entry<K, java.util.Collection<V>>, com.google.common.a.m$a<K>> {
  final com.google.common.a.l$c a;

  com.google.common.a.l$c$1(com.google.common.a.l$c, java.util.Iterator);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field a:Lcom/google/common/a/l$c;
       5: aload_0
       6: aload_2
       7: invokespecial #23                 // Method com/google/common/a/q."<init>":(Ljava/util/Iterator;)V
      10: return

  com.google.common.a.m$a<K> a(java.util.Map$Entry<K, java.util.Collection<V>>);
    Code:
       0: new           #14                 // class com/google/common/a/l$c$1$1
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #28                 // Method com/google/common/a/l$c$1$1."<init>":(Lcom/google/common/a/l$c$1;Ljava/util/Map$Entry;)V
       9: areturn

  java.lang.Object a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #33                 // class java/util/Map$Entry
       5: invokevirtual #35                 // Method a:(Ljava/util/Map$Entry;)Lcom/google/common/a/m$a;
       8: areturn
}
