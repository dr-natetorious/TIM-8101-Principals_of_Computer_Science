public final class com.google.common.a.p {
  static int a(java.util.Set<?>);
    Code:
       0: aload_0
       1: invokeinterface #14,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       6: astore_0
       7: iconst_0
       8: istore_1
       9: aload_0
      10: invokeinterface #20,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      15: ifeq          50
      18: aload_0
      19: invokeinterface #24,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      24: astore_3
      25: aload_3
      26: ifnull        37
      29: aload_3
      30: invokevirtual #28                 // Method java/lang/Object.hashCode:()I
      33: istore_2
      34: goto          39
      37: iconst_0
      38: istore_2
      39: iload_1
      40: iload_2
      41: iadd
      42: iconst_m1
      43: ixor
      44: iconst_m1
      45: ixor
      46: istore_1
      47: goto          9
      50: iload_1
      51: ireturn

  public static <E> java.util.HashSet<E> a();
    Code:
       0: new           #34                 // class java/util/HashSet
       3: dup
       4: invokespecial #38                 // Method java/util/HashSet."<init>":()V
       7: areturn

  public static <E> java.util.HashSet<E> a(int);
    Code:
       0: new           #34                 // class java/util/HashSet
       3: dup
       4: iload_0
       5: invokestatic  #45                 // Method com/google/common/a/j.a:(I)I
       8: invokespecial #48                 // Method java/util/HashSet."<init>":(I)V
      11: areturn

  static boolean a(java.util.Set<?>, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #10                 // class java/util/Set
      11: ifeq          50
      14: aload_1
      15: checkcast     #10                 // class java/util/Set
      18: astore_1
      19: aload_0
      20: invokeinterface #57,  1           // InterfaceMethod java/util/Set.size:()I
      25: aload_1
      26: invokeinterface #57,  1           // InterfaceMethod java/util/Set.size:()I
      31: if_icmpne     48
      34: aload_0
      35: aload_1
      36: invokeinterface #61,  2           // InterfaceMethod java/util/Set.containsAll:(Ljava/util/Collection;)Z
      41: istore_2
      42: iload_2
      43: ifeq          48
      46: iconst_1
      47: ireturn
      48: iconst_0
      49: ireturn
      50: iconst_0
      51: ireturn
      52: astore_0
      53: iconst_0
      54: ireturn
    Exception table:
       from    to  target type
          19    42    52   Class java/lang/NullPointerException
          19    42    52   Class java/lang/ClassCastException

  static boolean a(java.util.Set<?>, java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokestatic  #69                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: astore_2
       7: aload_1
       8: instanceof    #71                 // class com/google/common/a/m
      11: ifeq          24
      14: aload_1
      15: checkcast     #71                 // class com/google/common/a/m
      18: invokeinterface #74,  1           // InterfaceMethod com/google/common/a/m.a:()Ljava/util/Set;
      23: astore_2
      24: aload_2
      25: instanceof    #10                 // class java/util/Set
      28: ifeq          57
      31: aload_2
      32: invokeinterface #77,  1           // InterfaceMethod java/util/Collection.size:()I
      37: aload_0
      38: invokeinterface #57,  1           // InterfaceMethod java/util/Set.size:()I
      43: if_icmple     57
      46: aload_0
      47: invokeinterface #14,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      52: aload_2
      53: invokestatic  #82                 // Method com/google/common/a/f.a:(Ljava/util/Iterator;Ljava/util/Collection;)Z
      56: ireturn
      57: aload_0
      58: aload_2
      59: invokeinterface #83,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      64: invokestatic  #86                 // Method a:(Ljava/util/Set;Ljava/util/Iterator;)Z
      67: ireturn

  static boolean a(java.util.Set<?>, java.util.Iterator<?>);
    Code:
       0: iconst_0
       1: istore_2
       2: aload_1
       3: invokeinterface #20,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       8: ifeq          29
      11: iload_2
      12: aload_0
      13: aload_1
      14: invokeinterface #24,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      19: invokeinterface #91,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
      24: ior
      25: istore_2
      26: goto          2
      29: iload_2
      30: ireturn
}
