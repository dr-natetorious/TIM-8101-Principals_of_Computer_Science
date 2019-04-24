abstract class com.google.common.a.a<K, V> implements java.util.Map$Entry<K, V> {
  com.google.common.a.a();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #7                  // class java/util/Map$Entry
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          58
      15: aload_1
      16: checkcast     #7                  // class java/util/Map$Entry
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: invokevirtual #18                 // Method getKey:()Ljava/lang/Object;
      26: aload_1
      27: invokeinterface #19,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      32: invokestatic  #25                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      35: ifeq          58
      38: iload_3
      39: istore_2
      40: aload_0
      41: invokevirtual #28                 // Method getValue:()Ljava/lang/Object;
      44: aload_1
      45: invokeinterface #29,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      50: invokestatic  #25                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      53: ifeq          58
      56: iconst_1
      57: istore_2
      58: iload_2
      59: ireturn

  public abstract K getKey();

  public abstract V getValue();

  public int hashCode();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method getKey:()Ljava/lang/Object;
       4: astore_3
       5: aload_0
       6: invokevirtual #28                 // Method getValue:()Ljava/lang/Object;
       9: astore        4
      11: iconst_0
      12: istore_2
      13: aload_3
      14: ifnonnull     22
      17: iconst_0
      18: istore_1
      19: goto          27
      22: aload_3
      23: invokevirtual #33                 // Method java/lang/Object.hashCode:()I
      26: istore_1
      27: aload         4
      29: ifnonnull     35
      32: goto          41
      35: aload         4
      37: invokevirtual #33                 // Method java/lang/Object.hashCode:()I
      40: istore_2
      41: iload_1
      42: iload_2
      43: ixor
      44: ireturn

  public V setValue(V);
    Code:
       0: new           #37                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #38                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public java.lang.String toString();
    Code:
       0: new           #44                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: invokevirtual #18                 // Method getKey:()Ljava/lang/Object;
      13: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #51                 // String =
      20: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: invokevirtual #28                 // Method getValue:()Ljava/lang/Object;
      29: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: invokevirtual #56                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      37: areturn
}
