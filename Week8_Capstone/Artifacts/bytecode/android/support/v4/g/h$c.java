final class android.support.v4.g.h$c implements java.util.Set<K> {
  final android.support.v4.g.h a;

  android.support.v4.g.h$c(android.support.v4.g.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v4/g/h;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean add(K);
    Code:
       0: new           #24                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #25                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public boolean addAll(java.util.Collection<? extends K>);
    Code:
       0: new           #24                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #25                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public void clear();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #33                 // Method android/support/v4/g/h.c:()V
       7: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: aload_1
       5: invokevirtual #37                 // Method android/support/v4/g/h.a:(Ljava/lang/Object;)I
       8: iflt          13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public boolean containsAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #42                 // Method android/support/v4/g/h.b:()Ljava/util/Map;
       7: aload_1
       8: invokestatic  #45                 // Method android/support/v4/g/h.a:(Ljava/util/Map;Ljava/util/Collection;)Z
      11: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #50                 // Method android/support/v4/g/h.a:(Ljava/util/Set;Ljava/lang/Object;)Z
       5: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #54                 // Method android/support/v4/g/h.a:()I
       7: iconst_1
       8: isub
       9: istore_1
      10: iconst_0
      11: istore_2
      12: iload_1
      13: iflt          54
      16: aload_0
      17: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      20: iload_1
      21: iconst_0
      22: invokevirtual #57                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      25: astore        4
      27: aload         4
      29: ifnonnull     37
      32: iconst_0
      33: istore_3
      34: goto          43
      37: aload         4
      39: invokevirtual #59                 // Method java/lang/Object.hashCode:()I
      42: istore_3
      43: iload_2
      44: iload_3
      45: iadd
      46: istore_2
      47: iload_1
      48: iconst_1
      49: isub
      50: istore_1
      51: goto          12
      54: iload_2
      55: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #54                 // Method android/support/v4/g/h.a:()I
       7: ifne          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public java.util.Iterator<K> iterator();
    Code:
       0: new           #65                 // class android/support/v4/g/h$a
       3: dup
       4: aload_0
       5: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       8: iconst_0
       9: invokespecial #68                 // Method android/support/v4/g/h$a."<init>":(Landroid/support/v4/g/h;I)V
      12: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: aload_1
       5: invokevirtual #37                 // Method android/support/v4/g/h.a:(Ljava/lang/Object;)I
       8: istore_2
       9: iload_2
      10: iflt          23
      13: aload_0
      14: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      17: iload_2
      18: invokevirtual #73                 // Method android/support/v4/g/h.a:(I)V
      21: iconst_1
      22: ireturn
      23: iconst_0
      24: ireturn

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #42                 // Method android/support/v4/g/h.b:()Ljava/util/Map;
       7: aload_1
       8: invokestatic  #76                 // Method android/support/v4/g/h.b:(Ljava/util/Map;Ljava/util/Collection;)Z
      11: ireturn

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #42                 // Method android/support/v4/g/h.b:()Ljava/util/Map;
       7: aload_1
       8: invokestatic  #79                 // Method android/support/v4/g/h.c:(Ljava/util/Map;Ljava/util/Collection;)Z
      11: ireturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #54                 // Method android/support/v4/g/h.a:()I
       7: ireturn

  public java.lang.Object[] toArray();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: iconst_0
       5: invokevirtual #85                 // Method android/support/v4/g/h.b:(I)[Ljava/lang/Object;
       8: areturn

  public <T> T[] toArray(T[]);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: aload_1
       5: iconst_0
       6: invokevirtual #89                 // Method android/support/v4/g/h.a:([Ljava/lang/Object;I)[Ljava/lang/Object;
       9: areturn
}
