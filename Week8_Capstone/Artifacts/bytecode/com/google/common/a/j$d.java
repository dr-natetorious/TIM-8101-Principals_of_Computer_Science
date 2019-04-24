class com.google.common.a.j$d<K, V> extends java.util.AbstractCollection<V> {
  final java.util.Map<K, V> a;

  com.google.common.a.j$d(java.util.Map<K, V>);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/util/AbstractCollection."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #22                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #24                 // class java/util/Map
      12: putfield      #26                 // Field a:Ljava/util/Map;
      15: return

  final java.util.Map<K, V> a();
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/util/Map;
       4: areturn

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #36,  1           // InterfaceMethod java/util/Map.clear:()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: aload_1
       5: invokeinterface #41,  2           // InterfaceMethod java/util/Map.containsValue:(Ljava/lang/Object;)Z
      10: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #45,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
       9: ireturn

  public java.util.Iterator<V> iterator();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #51,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       9: invokeinterface #55,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      14: invokestatic  #59                 // Method com/google/common/a/j.b:(Ljava/util/Iterator;)Ljava/util/Iterator;
      17: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #65                 // Method java/util/AbstractCollection.remove:(Ljava/lang/Object;)Z
       5: istore_2
       6: iload_2
       7: ireturn
       8: aload_0
       9: invokevirtual #34                 // Method a:()Ljava/util/Map;
      12: invokeinterface #51,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
      17: invokeinterface #55,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      22: astore_3
      23: aload_3
      24: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      29: ifeq          76
      32: aload_3
      33: invokeinterface #74,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      38: checkcast     #76                 // class java/util/Map$Entry
      41: astore        4
      43: aload_1
      44: aload         4
      46: invokeinterface #79,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      51: invokestatic  #85                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      54: ifeq          23
      57: aload_0
      58: invokevirtual #34                 // Method a:()Ljava/util/Map;
      61: aload         4
      63: invokeinterface #88,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      68: invokeinterface #90,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      73: pop
      74: iconst_1
      75: ireturn
      76: iconst_0
      77: ireturn
      78: astore_3
      79: goto          8
    Exception table:
       from    to  target type
           0     6    78   Class java/lang/UnsupportedOperationException

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #22                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       5: checkcast     #94                 // class java/util/Collection
       8: invokespecial #96                 // Method java/util/AbstractCollection.removeAll:(Ljava/util/Collection;)Z
      11: istore_2
      12: iload_2
      13: ireturn
      14: invokestatic  #101                // Method com/google/common/a/p.a:()Ljava/util/HashSet;
      17: astore_3
      18: aload_0
      19: invokevirtual #34                 // Method a:()Ljava/util/Map;
      22: invokeinterface #51,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
      27: invokeinterface #55,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      32: astore        4
      34: aload         4
      36: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      41: ifeq          89
      44: aload         4
      46: invokeinterface #74,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      51: checkcast     #76                 // class java/util/Map$Entry
      54: astore        5
      56: aload_1
      57: aload         5
      59: invokeinterface #79,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      64: invokeinterface #103,  2          // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      69: ifeq          34
      72: aload_3
      73: aload         5
      75: invokeinterface #88,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      80: invokeinterface #106,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      85: pop
      86: goto          34
      89: aload_0
      90: invokevirtual #34                 // Method a:()Ljava/util/Map;
      93: invokeinterface #109,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      98: aload_3
      99: invokeinterface #110,  2          // InterfaceMethod java/util/Set.removeAll:(Ljava/util/Collection;)Z
     104: ireturn
     105: astore_3
     106: goto          14
    Exception table:
       from    to  target type
           0    12   105   Class java/lang/UnsupportedOperationException

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #22                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       5: checkcast     #94                 // class java/util/Collection
       8: invokespecial #114                // Method java/util/AbstractCollection.retainAll:(Ljava/util/Collection;)Z
      11: istore_2
      12: iload_2
      13: ireturn
      14: invokestatic  #101                // Method com/google/common/a/p.a:()Ljava/util/HashSet;
      17: astore_3
      18: aload_0
      19: invokevirtual #34                 // Method a:()Ljava/util/Map;
      22: invokeinterface #51,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
      27: invokeinterface #55,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      32: astore        4
      34: aload         4
      36: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      41: ifeq          89
      44: aload         4
      46: invokeinterface #74,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      51: checkcast     #76                 // class java/util/Map$Entry
      54: astore        5
      56: aload_1
      57: aload         5
      59: invokeinterface #79,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      64: invokeinterface #103,  2          // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      69: ifeq          34
      72: aload_3
      73: aload         5
      75: invokeinterface #88,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      80: invokeinterface #106,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      85: pop
      86: goto          34
      89: aload_0
      90: invokevirtual #34                 // Method a:()Ljava/util/Map;
      93: invokeinterface #109,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      98: aload_3
      99: invokeinterface #115,  2          // InterfaceMethod java/util/Set.retainAll:(Ljava/util/Collection;)Z
     104: ireturn
     105: astore_3
     106: goto          14
    Exception table:
       from    to  target type
           0    12   105   Class java/lang/UnsupportedOperationException

  public int size();
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method a:()Ljava/util/Map;
       4: invokeinterface #119,  1          // InterfaceMethod java/util/Map.size:()I
       9: ireturn
}
