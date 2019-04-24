public final class com.google.common.a.n {
  static <E> int a(com.google.common.a.m<E>, E, int);
    Code:
       0: iload_2
       1: ldc           #21                 // String count
       3: invokestatic  #26                 // Method com/google/common/a/d.a:(ILjava/lang/String;)I
       6: pop
       7: aload_0
       8: aload_1
       9: invokeinterface #31,  2           // InterfaceMethod com/google/common/a/m.a:(Ljava/lang/Object;)I
      14: istore_3
      15: iload_2
      16: iload_3
      17: isub
      18: istore_2
      19: iload_2
      20: ifle          34
      23: aload_0
      24: aload_1
      25: iload_2
      26: invokeinterface #34,  3           // InterfaceMethod com/google/common/a/m.a:(Ljava/lang/Object;I)I
      31: pop
      32: iload_3
      33: ireturn
      34: iload_2
      35: ifge          48
      38: aload_0
      39: aload_1
      40: iload_2
      41: ineg
      42: invokeinterface #36,  3           // InterfaceMethod com/google/common/a/m.b:(Ljava/lang/Object;I)I
      47: pop
      48: iload_3
      49: ireturn

  static <T> com.google.common.a.m<T> a(java.lang.Iterable<T>);
    Code:
       0: aload_0
       1: checkcast     #28                 // class com/google/common/a/m
       4: areturn

  static <E> java.util.Iterator<E> a(com.google.common.a.m<E>);
    Code:
       0: new           #17                 // class com/google/common/a/n$d
       3: dup
       4: aload_0
       5: aload_0
       6: invokeinterface #46,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
      11: invokeinterface #52,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      16: invokespecial #56                 // Method com/google/common/a/n$d."<init>":(Lcom/google/common/a/m;Ljava/util/Iterator;)V
      19: areturn

  static boolean a(com.google.common.a.m<?>, java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #28                 // class com/google/common/a/m
      11: ifeq          117
      14: aload_1
      15: checkcast     #28                 // class com/google/common/a/m
      18: astore_1
      19: aload_0
      20: invokeinterface #62,  1           // InterfaceMethod com/google/common/a/m.size:()I
      25: aload_1
      26: invokeinterface #62,  1           // InterfaceMethod com/google/common/a/m.size:()I
      31: if_icmpne     117
      34: aload_0
      35: invokeinterface #46,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
      40: invokeinterface #63,  1           // InterfaceMethod java/util/Set.size:()I
      45: aload_1
      46: invokeinterface #46,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
      51: invokeinterface #63,  1           // InterfaceMethod java/util/Set.size:()I
      56: if_icmpeq     61
      59: iconst_0
      60: ireturn
      61: aload_1
      62: invokeinterface #46,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
      67: invokeinterface #52,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      72: astore_1
      73: aload_1
      74: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      79: ifeq          115
      82: aload_1
      83: invokeinterface #73,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      88: checkcast     #75                 // class com/google/common/a/m$a
      91: astore_2
      92: aload_0
      93: aload_2
      94: invokeinterface #77,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      99: invokeinterface #31,  2           // InterfaceMethod com/google/common/a/m.a:(Ljava/lang/Object;)I
     104: aload_2
     105: invokeinterface #79,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
     110: if_icmpeq     73
     113: iconst_0
     114: ireturn
     115: iconst_1
     116: ireturn
     117: iconst_0
     118: ireturn

  static <E> boolean a(com.google.common.a.m<E>, E, int, int);
    Code:
       0: iload_2
       1: ldc           #83                 // String oldCount
       3: invokestatic  #26                 // Method com/google/common/a/d.a:(ILjava/lang/String;)I
       6: pop
       7: iload_3
       8: ldc           #85                 // String newCount
      10: invokestatic  #26                 // Method com/google/common/a/d.a:(ILjava/lang/String;)I
      13: pop
      14: aload_0
      15: aload_1
      16: invokeinterface #31,  2           // InterfaceMethod com/google/common/a/m.a:(Ljava/lang/Object;)I
      21: iload_2
      22: if_icmpne     36
      25: aload_0
      26: aload_1
      27: iload_3
      28: invokeinterface #87,  3           // InterfaceMethod com/google/common/a/m.c:(Ljava/lang/Object;I)I
      33: pop
      34: iconst_1
      35: ireturn
      36: iconst_0
      37: ireturn

  static <E> boolean a(com.google.common.a.m<E>, java.util.Collection<? extends E>);
    Code:
       0: aload_1
       1: invokeinterface #94,  1           // InterfaceMethod java/util/Collection.isEmpty:()Z
       6: ifeq          11
       9: iconst_0
      10: ireturn
      11: aload_1
      12: instanceof    #28                 // class com/google/common/a/m
      15: ifeq          74
      18: aload_1
      19: invokestatic  #96                 // Method a:(Ljava/lang/Iterable;)Lcom/google/common/a/m;
      22: invokeinterface #46,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
      27: invokeinterface #52,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      32: astore_1
      33: aload_1
      34: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      39: ifeq          85
      42: aload_1
      43: invokeinterface #73,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      48: checkcast     #75                 // class com/google/common/a/m$a
      51: astore_2
      52: aload_0
      53: aload_2
      54: invokeinterface #77,  1           // InterfaceMethod com/google/common/a/m$a.a:()Ljava/lang/Object;
      59: aload_2
      60: invokeinterface #79,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      65: invokeinterface #34,  3           // InterfaceMethod com/google/common/a/m.a:(Ljava/lang/Object;I)I
      70: pop
      71: goto          33
      74: aload_0
      75: aload_1
      76: invokeinterface #97,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      81: invokestatic  #102                // Method com/google/common/a/f.a:(Ljava/util/Collection;Ljava/util/Iterator;)Z
      84: pop
      85: iconst_1
      86: ireturn

  static int b(com.google.common.a.m<?>);
    Code:
       0: aload_0
       1: invokeinterface #46,  1           // InterfaceMethod com/google/common/a/m.e:()Ljava/util/Set;
       6: invokeinterface #52,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      11: astore_0
      12: lconst_0
      13: lstore_1
      14: aload_0
      15: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      20: ifeq          44
      23: lload_1
      24: aload_0
      25: invokeinterface #73,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      30: checkcast     #75                 // class com/google/common/a/m$a
      33: invokeinterface #79,  1           // InterfaceMethod com/google/common/a/m$a.b:()I
      38: i2l
      39: ladd
      40: lstore_1
      41: goto          14
      44: lload_1
      45: invokestatic  #109                // Method com/google/common/b/a.a:(J)I
      48: ireturn

  static boolean b(com.google.common.a.m<?>, java.util.Collection<?>);
    Code:
       0: aload_1
       1: astore_2
       2: aload_1
       3: instanceof    #28                 // class com/google/common/a/m
       6: ifeq          19
       9: aload_1
      10: checkcast     #28                 // class com/google/common/a/m
      13: invokeinterface #112,  1          // InterfaceMethod com/google/common/a/m.a:()Ljava/util/Set;
      18: astore_2
      19: aload_0
      20: invokeinterface #112,  1          // InterfaceMethod com/google/common/a/m.a:()Ljava/util/Set;
      25: aload_2
      26: invokeinterface #116,  2          // InterfaceMethod java/util/Set.removeAll:(Ljava/util/Collection;)Z
      31: ireturn

  static boolean c(com.google.common.a.m<?>, java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokestatic  #123                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: astore_2
       7: aload_1
       8: instanceof    #28                 // class com/google/common/a/m
      11: ifeq          24
      14: aload_1
      15: checkcast     #28                 // class com/google/common/a/m
      18: invokeinterface #112,  1          // InterfaceMethod com/google/common/a/m.a:()Ljava/util/Set;
      23: astore_2
      24: aload_0
      25: invokeinterface #112,  1          // InterfaceMethod com/google/common/a/m.a:()Ljava/util/Set;
      30: aload_2
      31: invokeinterface #126,  2          // InterfaceMethod java/util/Set.retainAll:(Ljava/util/Collection;)Z
      36: ireturn
}
