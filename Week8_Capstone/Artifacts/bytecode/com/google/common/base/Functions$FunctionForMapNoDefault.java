class com.google.common.base.Functions$FunctionForMapNoDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
  final java.util.Map<K, V> map;

  com.google.common.base.Functions$FunctionForMapNoDefault(java.util.Map<K, V>);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #30                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #32                 // class java/util/Map
      12: putfield      #34                 // Field map:Ljava/util/Map;
      15: return

  public V apply(K);
    Code:
       0: aload_0
       1: getfield      #34                 // Field map:Ljava/util/Map;
       4: aload_1
       5: invokeinterface #41,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      10: astore_3
      11: aload_3
      12: ifnonnull     36
      15: aload_0
      16: getfield      #34                 // Field map:Ljava/util/Map;
      19: aload_1
      20: invokeinterface #45,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      25: ifeq          31
      28: goto          36
      31: iconst_0
      32: istore_2
      33: goto          38
      36: iconst_1
      37: istore_2
      38: iload_2
      39: ldc           #47                 // String Key '%s' not present in map
      41: aload_1
      42: invokestatic  #51                 // Method com/google/common/base/Preconditions.checkArgument:(ZLjava/lang/String;Ljava/lang/Object;)V
      45: aload_3
      46: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Functions$FunctionForMapNoDefault
       4: ifeq          26
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Functions$FunctionForMapNoDefault
      11: astore_1
      12: aload_0
      13: getfield      #34                 // Field map:Ljava/util/Map;
      16: aload_1
      17: getfield      #34                 // Field map:Ljava/util/Map;
      20: invokeinterface #55,  2           // InterfaceMethod java/util/Map.equals:(Ljava/lang/Object;)Z
      25: ireturn
      26: iconst_0
      27: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #34                 // Field map:Ljava/util/Map;
       4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.hashCode:()I
       9: ireturn

  public java.lang.String toString();
    Code:
       0: new           #63                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #64                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #66                 // String Functions.forMap(
      11: invokevirtual #70                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #34                 // Field map:Ljava/util/Map;
      20: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #75                 // String )
      27: invokevirtual #70                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #77                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
