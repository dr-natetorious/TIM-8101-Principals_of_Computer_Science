final class android.support.v4.g.h$b implements java.util.Set<java.util.Map$Entry<K, V>> {
  final android.support.v4.g.h a;

  android.support.v4.g.h$b(android.support.v4.g.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v4/g/h;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean a(java.util.Map$Entry<K, V>);
    Code:
       0: new           #23                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #24                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public boolean add(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #30                 // class java/util/Map$Entry
       5: invokevirtual #32                 // Method a:(Ljava/util/Map$Entry;)Z
       8: ireturn

  public boolean addAll(java.util.Collection<? extends java.util.Map$Entry<K, V>>);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #37                 // Method android/support/v4/g/h.a:()I
       7: istore_2
       8: aload_1
       9: invokeinterface #43,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      14: astore_1
      15: aload_1
      16: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      21: ifeq          56
      24: aload_1
      25: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      30: checkcast     #30                 // class java/util/Map$Entry
      33: astore_3
      34: aload_0
      35: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      38: aload_3
      39: invokeinterface #56,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      44: aload_3
      45: invokeinterface #59,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      50: invokevirtual #62                 // Method android/support/v4/g/h.a:(Ljava/lang/Object;Ljava/lang/Object;)V
      53: goto          15
      56: iload_2
      57: aload_0
      58: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      61: invokevirtual #37                 // Method android/support/v4/g/h.a:()I
      64: if_icmpeq     69
      67: iconst_1
      68: ireturn
      69: iconst_0
      70: ireturn

  public void clear();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #67                 // Method android/support/v4/g/h.c:()V
       7: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #30                 // class java/util/Map$Entry
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_1
      10: checkcast     #30                 // class java/util/Map$Entry
      13: astore_1
      14: aload_0
      15: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      18: aload_1
      19: invokeinterface #56,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      24: invokevirtual #71                 // Method android/support/v4/g/h.a:(Ljava/lang/Object;)I
      27: istore_2
      28: iload_2
      29: ifge          34
      32: iconst_0
      33: ireturn
      34: aload_0
      35: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      38: iload_2
      39: iconst_1
      40: invokevirtual #74                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      43: aload_1
      44: invokeinterface #59,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      49: invokestatic  #79                 // Method android/support/v4/g/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      52: ireturn

  public boolean containsAll(java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokeinterface #43,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       6: astore_1
       7: aload_1
       8: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      13: ifeq          31
      16: aload_0
      17: aload_1
      18: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: invokevirtual #82                 // Method contains:(Ljava/lang/Object;)Z
      26: ifne          7
      29: iconst_0
      30: ireturn
      31: iconst_1
      32: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #87                 // Method android/support/v4/g/h.a:(Ljava/util/Set;Ljava/lang/Object;)Z
       5: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #37                 // Method android/support/v4/g/h.a:()I
       7: iconst_1
       8: isub
       9: istore_1
      10: iconst_0
      11: istore_2
      12: iload_1
      13: iflt          86
      16: aload_0
      17: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      20: iload_1
      21: iconst_0
      22: invokevirtual #74                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      25: astore        5
      27: aload_0
      28: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      31: iload_1
      32: iconst_1
      33: invokevirtual #74                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      36: astore        6
      38: aload         5
      40: ifnonnull     48
      43: iconst_0
      44: istore_3
      45: goto          54
      48: aload         5
      50: invokevirtual #90                 // Method java/lang/Object.hashCode:()I
      53: istore_3
      54: aload         6
      56: ifnonnull     65
      59: iconst_0
      60: istore        4
      62: goto          72
      65: aload         6
      67: invokevirtual #90                 // Method java/lang/Object.hashCode:()I
      70: istore        4
      72: iload_2
      73: iload_3
      74: iload         4
      76: ixor
      77: iadd
      78: istore_2
      79: iload_1
      80: iconst_1
      81: isub
      82: istore_1
      83: goto          12
      86: iload_2
      87: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #37                 // Method android/support/v4/g/h.a:()I
       7: ifne          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public java.util.Iterator<java.util.Map$Entry<K, V>> iterator();
    Code:
       0: new           #93                 // class android/support/v4/g/h$d
       3: dup
       4: aload_0
       5: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       8: invokespecial #95                 // Method android/support/v4/g/h$d."<init>":(Landroid/support/v4/g/h;)V
      11: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: new           #23                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #24                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: new           #23                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #24                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: new           #23                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #24                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public int size();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #37                 // Method android/support/v4/g/h.a:()I
       7: ireturn

  public java.lang.Object[] toArray();
    Code:
       0: new           #23                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #24                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public <T> T[] toArray(T[]);
    Code:
       0: new           #23                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #24                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow
}
