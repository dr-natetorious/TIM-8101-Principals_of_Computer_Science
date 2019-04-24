class com.google.common.base.Functions$ForMapWithDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
  final V defaultValue;

  final java.util.Map<K, ? extends V> map;

  com.google.common.base.Functions$ForMapWithDefault(java.util.Map<K, ? extends V>, V);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #33                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #35                 // class java/util/Map
      12: putfield      #37                 // Field map:Ljava/util/Map;
      15: aload_0
      16: aload_2
      17: putfield      #39                 // Field defaultValue:Ljava/lang/Object;
      20: return

  public V apply(K);
    Code:
       0: aload_0
       1: getfield      #37                 // Field map:Ljava/util/Map;
       4: aload_1
       5: invokeinterface #46,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      10: astore_3
      11: aload_3
      12: astore_2
      13: aload_3
      14: ifnonnull     37
      17: aload_0
      18: getfield      #37                 // Field map:Ljava/util/Map;
      21: aload_1
      22: invokeinterface #50,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      27: ifeq          32
      30: aload_3
      31: areturn
      32: aload_0
      33: getfield      #39                 // Field defaultValue:Ljava/lang/Object;
      36: astore_2
      37: aload_2
      38: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Functions$ForMapWithDefault
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          56
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/Functions$ForMapWithDefault
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #37                 // Field map:Ljava/util/Map;
      26: aload_1
      27: getfield      #37                 // Field map:Ljava/util/Map;
      30: invokeinterface #54,  2           // InterfaceMethod java/util/Map.equals:(Ljava/lang/Object;)Z
      35: ifeq          56
      38: iload_3
      39: istore_2
      40: aload_0
      41: getfield      #39                 // Field defaultValue:Ljava/lang/Object;
      44: aload_1
      45: getfield      #39                 // Field defaultValue:Ljava/lang/Object;
      48: invokestatic  #60                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      51: ifeq          56
      54: iconst_1
      55: istore_2
      56: iload_2
      57: ireturn

  public int hashCode();
    Code:
       0: iconst_2
       1: anewarray     #5                  // class java/lang/Object
       4: dup
       5: iconst_0
       6: aload_0
       7: getfield      #37                 // Field map:Ljava/util/Map;
      10: aastore
      11: dup
      12: iconst_1
      13: aload_0
      14: getfield      #39                 // Field defaultValue:Ljava/lang/Object;
      17: aastore
      18: invokestatic  #65                 // Method com/google/common/base/Objects.hashCode:([Ljava/lang/Object;)I
      21: ireturn

  public java.lang.String toString();
    Code:
       0: new           #69                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #70                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #72                 // String Functions.forMap(
      11: invokevirtual #76                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #37                 // Field map:Ljava/util/Map;
      20: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #81                 // String , defaultValue=
      27: invokevirtual #76                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #39                 // Field defaultValue:Ljava/lang/Object;
      36: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #83                 // String )
      43: invokevirtual #76                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #85                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
