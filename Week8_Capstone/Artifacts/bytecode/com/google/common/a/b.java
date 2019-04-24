abstract class com.google.common.a.b<K, V> implements com.google.common.a.k<K, V> {
  com.google.common.a.b();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: return

  public boolean a();
    Code:
       0: aload_0
       1: invokevirtual #35                 // Method l:()I
       4: ifne          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public boolean a(K, java.lang.Iterable<? extends V>);
    Code:
       0: aload_2
       1: invokestatic  #43                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_2
       6: instanceof    #45                 // class java/util/Collection
       9: istore_3
      10: iconst_0
      11: istore        5
      13: iconst_0
      14: istore        4
      16: iload_3
      17: ifeq          58
      20: aload_2
      21: checkcast     #45                 // class java/util/Collection
      24: astore_2
      25: iload         4
      27: istore_3
      28: aload_2
      29: invokeinterface #48,  1           // InterfaceMethod java/util/Collection.isEmpty:()Z
      34: ifne          56
      37: iload         4
      39: istore_3
      40: aload_0
      41: aload_1
      42: invokevirtual #51                 // Method d:(Ljava/lang/Object;)Ljava/util/Collection;
      45: aload_2
      46: invokeinterface #55,  2           // InterfaceMethod java/util/Collection.addAll:(Ljava/util/Collection;)Z
      51: ifeq          56
      54: iconst_1
      55: istore_3
      56: iload_3
      57: ireturn
      58: aload_2
      59: invokeinterface #61,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      64: astore_2
      65: iload         5
      67: istore_3
      68: aload_2
      69: invokeinterface #66,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      74: ifeq          94
      77: iload         5
      79: istore_3
      80: aload_0
      81: aload_1
      82: invokevirtual #51                 // Method d:(Ljava/lang/Object;)Ljava/util/Collection;
      85: aload_2
      86: invokestatic  #71                 // Method com/google/common/a/f.a:(Ljava/util/Collection;Ljava/util/Iterator;)Z
      89: ifeq          94
      92: iconst_1
      93: istore_3
      94: iload_3
      95: ireturn

  public boolean a(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: invokevirtual #79                 // Method i:()Ljava/util/Map;
       4: aload_1
       5: invokeinterface #84,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      10: checkcast     #45                 // class java/util/Collection
      13: astore_1
      14: aload_1
      15: ifnull        30
      18: aload_1
      19: aload_2
      20: invokeinterface #88,  2           // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      25: ifeq          30
      28: iconst_1
      29: ireturn
      30: iconst_0
      31: ireturn

  public java.util.Collection<java.util.Map$Entry<K, V>> b();
    Code:
       0: aload_0
       1: getfield      #91                 // Field a:Ljava/util/Collection;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #93                 // Method c:()Ljava/util/Collection;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #91                 // Field a:Ljava/util/Collection;
      21: aload_1
      22: areturn

  public java.util.Collection<V> b(K, java.lang.Iterable<? extends V>);
    Code:
       0: aload_2
       1: invokestatic  #43                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: aload_1
       7: invokevirtual #98                 // Method e:(Ljava/lang/Object;)Ljava/util/Collection;
      10: astore_3
      11: aload_0
      12: aload_1
      13: aload_2
      14: invokevirtual #100                // Method a:(Ljava/lang/Object;Ljava/lang/Iterable;)Z
      17: pop
      18: aload_3
      19: areturn

  public boolean b(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: invokevirtual #79                 // Method i:()Ljava/util/Map;
       4: aload_1
       5: invokeinterface #84,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      10: checkcast     #45                 // class java/util/Collection
      13: astore_1
      14: aload_1
      15: ifnull        30
      18: aload_1
      19: aload_2
      20: invokeinterface #104,  2          // InterfaceMethod java/util/Collection.remove:(Ljava/lang/Object;)Z
      25: ifeq          30
      28: iconst_1
      29: ireturn
      30: iconst_0
      31: ireturn

  java.util.Collection<java.util.Map$Entry<K, V>> c();
    Code:
       0: aload_0
       1: instanceof    #106                // class com/google/common/a/o
       4: ifeq          17
       7: new           #14                 // class com/google/common/a/b$b
      10: dup
      11: aload_0
      12: aconst_null
      13: invokespecial #109                // Method com/google/common/a/b$b."<init>":(Lcom/google/common/a/b;Lcom/google/common/a/b$1;)V
      16: areturn
      17: new           #11                 // class com/google/common/a/b$a
      20: dup
      21: aload_0
      22: aconst_null
      23: invokespecial #110                // Method com/google/common/a/b$a."<init>":(Lcom/google/common/a/b;Lcom/google/common/a/b$1;)V
      26: areturn

  public boolean c(K, V);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #51                 // Method d:(Ljava/lang/Object;)Ljava/util/Collection;
       5: aload_2
       6: invokeinterface #113,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
      11: ireturn

  abstract java.util.Iterator<java.util.Map$Entry<K, V>> d();

  public java.util.Set<K> e();
    Code:
       0: aload_0
       1: getfield      #117                // Field b:Ljava/util/Set;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #120                // Method f:()Ljava/util/Set;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #117                // Field b:Ljava/util/Set;
      21: aload_1
      22: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #127                // Method com/google/common/a/l.a:(Lcom/google/common/a/k;Ljava/lang/Object;)Z
       5: ireturn

  java.util.Set<K> f();
    Code:
       0: new           #129                // class com/google/common/a/j$c
       3: dup
       4: aload_0
       5: invokevirtual #79                 // Method i:()Ljava/util/Map;
       8: invokespecial #132                // Method com/google/common/a/j$c."<init>":(Ljava/util/Map;)V
      11: areturn

  public com.google.common.a.m<K> g();
    Code:
       0: aload_0
       1: getfield      #136                // Field c:Lcom/google/common/a/m;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #139                // Method h:()Lcom/google/common/a/m;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #136                // Field c:Lcom/google/common/a/m;
      21: aload_1
      22: areturn

  com.google.common.a.m<K> h();
    Code:
       0: new           #142                // class com/google/common/a/l$c
       3: dup
       4: aload_0
       5: invokespecial #145                // Method com/google/common/a/l$c."<init>":(Lcom/google/common/a/k;)V
       8: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: invokevirtual #79                 // Method i:()Ljava/util/Map;
       4: invokeinterface #148,  1          // InterfaceMethod java/util/Map.hashCode:()I
       9: ireturn

  public java.util.Map<K, java.util.Collection<V>> i();
    Code:
       0: aload_0
       1: getfield      #150                // Field d:Ljava/util/Map;
       4: astore_2
       5: aload_2
       6: astore_1
       7: aload_2
       8: ifnonnull     21
      11: aload_0
      12: invokevirtual #153                // Method j:()Ljava/util/Map;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #150                // Field d:Ljava/util/Map;
      21: aload_1
      22: areturn

  abstract java.util.Map<K, java.util.Collection<V>> j();

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokevirtual #79                 // Method i:()Ljava/util/Map;
       4: invokevirtual #158                // Method java/lang/Object.toString:()Ljava/lang/String;
       7: areturn
}
