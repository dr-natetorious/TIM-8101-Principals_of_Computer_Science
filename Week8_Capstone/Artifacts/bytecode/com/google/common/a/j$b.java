abstract class com.google.common.a.j$b<K, V> extends com.google.common.a.p$a<java.util.Map$Entry<K, V>> {
  com.google.common.a.j$b();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method com/google/common/a/p$a."<init>":()V
       4: return

  abstract java.util.Map<K, V> a();

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Ljava/util/Map;
       4: invokeinterface #22,  1           // InterfaceMethod java/util/Map.clear:()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #26                 // class java/util/Map$Entry
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          78
      15: aload_1
      16: checkcast     #26                 // class java/util/Map$Entry
      19: astore_1
      20: aload_1
      21: invokeinterface #30,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      26: astore        5
      28: aload_0
      29: invokevirtual #18                 // Method a:()Ljava/util/Map;
      32: aload         5
      34: invokestatic  #33                 // Method com/google/common/a/j.a:(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
      37: astore        6
      39: iload_3
      40: istore_2
      41: aload         6
      43: aload_1
      44: invokeinterface #36,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      49: invokestatic  #42                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      52: ifeq          78
      55: aload         6
      57: ifnonnull     76
      60: iload_3
      61: istore_2
      62: aload_0
      63: invokevirtual #18                 // Method a:()Ljava/util/Map;
      66: aload         5
      68: invokeinterface #45,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      73: ifeq          78
      76: iconst_1
      77: istore_2
      78: iload_2
      79: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Ljava/util/Map;
       4: invokeinterface #49,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
       9: ireturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #52                 // Method contains:(Ljava/lang/Object;)Z
       5: ifeq          34
       8: aload_1
       9: checkcast     #26                 // class java/util/Map$Entry
      12: astore_1
      13: aload_0
      14: invokevirtual #18                 // Method a:()Ljava/util/Map;
      17: invokeinterface #56,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      22: aload_1
      23: invokeinterface #30,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      28: invokeinterface #60,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
      33: ireturn
      34: iconst_0
      35: ireturn

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #70                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       5: checkcast     #72                 // class java/util/Collection
       8: invokespecial #74                 // Method com/google/common/a/p$a.removeAll:(Ljava/util/Collection;)Z
      11: istore_2
      12: iload_2
      13: ireturn
      14: aload_0
      15: aload_1
      16: invokeinterface #78,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      21: invokestatic  #83                 // Method com/google/common/a/p.a:(Ljava/util/Set;Ljava/util/Iterator;)Z
      24: ireturn
      25: astore_3
      26: goto          14
    Exception table:
       from    to  target type
           0    12    25   Class java/lang/UnsupportedOperationException

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #70                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       5: checkcast     #72                 // class java/util/Collection
       8: invokespecial #88                 // Method com/google/common/a/p$a.retainAll:(Ljava/util/Collection;)Z
      11: istore_2
      12: iload_2
      13: ireturn
      14: aload_1
      15: invokeinterface #92,  1           // InterfaceMethod java/util/Collection.size:()I
      20: invokestatic  #95                 // Method com/google/common/a/p.a:(I)Ljava/util/HashSet;
      23: astore_3
      24: aload_1
      25: invokeinterface #78,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      30: astore_1
      31: aload_1
      32: invokeinterface #100,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      37: ifeq          77
      40: aload_1
      41: invokeinterface #103,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      46: astore        4
      48: aload_0
      49: aload         4
      51: invokevirtual #52                 // Method contains:(Ljava/lang/Object;)Z
      54: ifeq          31
      57: aload_3
      58: aload         4
      60: checkcast     #26                 // class java/util/Map$Entry
      63: invokeinterface #30,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      68: invokeinterface #106,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      73: pop
      74: goto          31
      77: aload_0
      78: invokevirtual #18                 // Method a:()Ljava/util/Map;
      81: invokeinterface #56,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      86: aload_3
      87: invokeinterface #107,  2          // InterfaceMethod java/util/Set.retainAll:(Ljava/util/Collection;)Z
      92: ireturn
      93: astore_3
      94: goto          14
    Exception table:
       from    to  target type
           0    12    93   Class java/lang/UnsupportedOperationException

  public int size();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Ljava/util/Map;
       4: invokeinterface #108,  1          // InterfaceMethod java/util/Map.size:()I
       9: ireturn
}
