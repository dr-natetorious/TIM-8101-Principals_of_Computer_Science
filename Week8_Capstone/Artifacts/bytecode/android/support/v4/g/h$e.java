final class android.support.v4.g.h$e implements java.util.Collection<V> {
  final android.support.v4.g.h a;

  android.support.v4.g.h$e(android.support.v4.g.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v4/g/h;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean add(V);
    Code:
       0: new           #24                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #25                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public boolean addAll(java.util.Collection<? extends V>);
    Code:
       0: new           #24                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #25                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public void clear();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #34                 // Method android/support/v4/g/h.c:()V
       7: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: aload_1
       5: invokevirtual #39                 // Method android/support/v4/g/h.b:(Ljava/lang/Object;)I
       8: iflt          13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public boolean containsAll(java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokeinterface #44,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       6: astore_1
       7: aload_1
       8: invokeinterface #50,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      13: ifeq          31
      16: aload_0
      17: aload_1
      18: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: invokevirtual #56                 // Method contains:(Ljava/lang/Object;)Z
      26: ifne          7
      29: iconst_0
      30: ireturn
      31: iconst_1
      32: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #61                 // Method android/support/v4/g/h.a:()I
       7: ifne          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public java.util.Iterator<V> iterator();
    Code:
       0: new           #63                 // class android/support/v4/g/h$a
       3: dup
       4: aload_0
       5: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       8: iconst_1
       9: invokespecial #66                 // Method android/support/v4/g/h$a."<init>":(Landroid/support/v4/g/h;I)V
      12: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: aload_1
       5: invokevirtual #39                 // Method android/support/v4/g/h.b:(Ljava/lang/Object;)I
       8: istore_2
       9: iload_2
      10: iflt          23
      13: aload_0
      14: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      17: iload_2
      18: invokevirtual #71                 // Method android/support/v4/g/h.a:(I)V
      21: iconst_1
      22: ireturn
      23: iconst_0
      24: ireturn

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #61                 // Method android/support/v4/g/h.a:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iconst_0
      11: istore        6
      13: iload_2
      14: iload_3
      15: if_icmpge     74
      18: iload_3
      19: istore        4
      21: iload_2
      22: istore        5
      24: aload_1
      25: aload_0
      26: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      29: iload_2
      30: iconst_1
      31: invokevirtual #75                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      34: invokeinterface #76,  2           // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      39: ifeq          63
      42: aload_0
      43: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      46: iload_2
      47: invokevirtual #71                 // Method android/support/v4/g/h.a:(I)V
      50: iload_2
      51: iconst_1
      52: isub
      53: istore        5
      55: iload_3
      56: iconst_1
      57: isub
      58: istore        4
      60: iconst_1
      61: istore        6
      63: iload         5
      65: iconst_1
      66: iadd
      67: istore_2
      68: iload         4
      70: istore_3
      71: goto          13
      74: iload         6
      76: ireturn

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #61                 // Method android/support/v4/g/h.a:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iconst_0
      11: istore        6
      13: iload_2
      14: iload_3
      15: if_icmpge     74
      18: iload_3
      19: istore        4
      21: iload_2
      22: istore        5
      24: aload_1
      25: aload_0
      26: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      29: iload_2
      30: iconst_1
      31: invokevirtual #75                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      34: invokeinterface #76,  2           // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      39: ifne          63
      42: aload_0
      43: getfield      #16                 // Field a:Landroid/support/v4/g/h;
      46: iload_2
      47: invokevirtual #71                 // Method android/support/v4/g/h.a:(I)V
      50: iload_2
      51: iconst_1
      52: isub
      53: istore        5
      55: iload_3
      56: iconst_1
      57: isub
      58: istore        4
      60: iconst_1
      61: istore        6
      63: iload         5
      65: iconst_1
      66: iadd
      67: istore_2
      68: iload         4
      70: istore_3
      71: goto          13
      74: iload         6
      76: ireturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: invokevirtual #61                 // Method android/support/v4/g/h.a:()I
       7: ireturn

  public java.lang.Object[] toArray();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: iconst_1
       5: invokevirtual #83                 // Method android/support/v4/g/h.b:(I)[Ljava/lang/Object;
       8: areturn

  public <T> T[] toArray(T[]);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/h;
       4: aload_1
       5: iconst_1
       6: invokevirtual #87                 // Method android/support/v4/g/h.a:([Ljava/lang/Object;I)[Ljava/lang/Object;
       9: areturn
}
