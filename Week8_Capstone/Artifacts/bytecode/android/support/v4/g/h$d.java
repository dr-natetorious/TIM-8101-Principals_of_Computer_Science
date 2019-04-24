final class android.support.v4.g.h$d implements java.util.Iterator<java.util.Map$Entry<K, V>>, java.util.Map$Entry<K, V> {
  int a;

  int b;

  boolean c;

  final android.support.v4.g.h d;

  android.support.v4.g.h$d(android.support.v4.g.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field d:Landroid/support/v4/g/h;
       5: aload_0
       6: invokespecial #25                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: iconst_0
      11: putfield      #27                 // Field c:Z
      14: aload_0
      15: aload_1
      16: invokevirtual #30                 // Method android/support/v4/g/h.a:()I
      19: iconst_1
      20: isub
      21: putfield      #32                 // Field a:I
      24: aload_0
      25: iconst_m1
      26: putfield      #34                 // Field b:I
      29: return

  public java.util.Map$Entry<K, V> a();
    Code:
       0: aload_0
       1: invokevirtual #40                 // Method hasNext:()Z
       4: ifne          15
       7: new           #42                 // class java/util/NoSuchElementException
      10: dup
      11: invokespecial #43                 // Method java/util/NoSuchElementException."<init>":()V
      14: athrow
      15: aload_0
      16: aload_0
      17: getfield      #34                 // Field b:I
      20: iconst_1
      21: iadd
      22: putfield      #34                 // Field b:I
      25: aload_0
      26: iconst_1
      27: putfield      #27                 // Field c:Z
      30: aload_0
      31: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Z
       4: ifne          17
       7: new           #49                 // class java/lang/IllegalStateException
      10: dup
      11: ldc           #51                 // String This container does not support retaining Map.Entry objects
      13: invokespecial #54                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_1
      18: instanceof    #9                  // class java/util/Map$Entry
      21: istore_2
      22: iconst_0
      23: istore_3
      24: iload_2
      25: ifne          30
      28: iconst_0
      29: ireturn
      30: aload_1
      31: checkcast     #9                  // class java/util/Map$Entry
      34: astore_1
      35: iload_3
      36: istore_2
      37: aload_1
      38: invokeinterface #58,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      43: aload_0
      44: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      47: aload_0
      48: getfield      #34                 // Field b:I
      51: iconst_0
      52: invokevirtual #61                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      55: invokestatic  #66                 // Method android/support/v4/g/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      58: ifeq          89
      61: iload_3
      62: istore_2
      63: aload_1
      64: invokeinterface #69,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      69: aload_0
      70: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      73: aload_0
      74: getfield      #34                 // Field b:I
      77: iconst_1
      78: invokevirtual #61                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      81: invokestatic  #66                 // Method android/support/v4/g/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      84: ifeq          89
      87: iconst_1
      88: istore_2
      89: iload_2
      90: ireturn

  public K getKey();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Z
       4: ifne          17
       7: new           #49                 // class java/lang/IllegalStateException
      10: dup
      11: ldc           #51                 // String This container does not support retaining Map.Entry objects
      13: invokespecial #54                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_0
      18: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      21: aload_0
      22: getfield      #34                 // Field b:I
      25: iconst_0
      26: invokevirtual #61                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      29: areturn

  public V getValue();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Z
       4: ifne          17
       7: new           #49                 // class java/lang/IllegalStateException
      10: dup
      11: ldc           #51                 // String This container does not support retaining Map.Entry objects
      13: invokespecial #54                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_0
      18: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      21: aload_0
      22: getfield      #34                 // Field b:I
      25: iconst_1
      26: invokevirtual #61                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      29: areturn

  public boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #34                 // Field b:I
       4: aload_0
       5: getfield      #32                 // Field a:I
       8: if_icmpge     13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Z
       4: ifne          17
       7: new           #49                 // class java/lang/IllegalStateException
      10: dup
      11: ldc           #51                 // String This container does not support retaining Map.Entry objects
      13: invokespecial #54                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_0
      18: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      21: astore_3
      22: aload_0
      23: getfield      #34                 // Field b:I
      26: istore_1
      27: iconst_0
      28: istore_2
      29: aload_3
      30: iload_1
      31: iconst_0
      32: invokevirtual #61                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      35: astore_3
      36: aload_0
      37: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      40: aload_0
      41: getfield      #34                 // Field b:I
      44: iconst_1
      45: invokevirtual #61                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      48: astore        4
      50: aload_3
      51: ifnonnull     59
      54: iconst_0
      55: istore_1
      56: goto          64
      59: aload_3
      60: invokevirtual #74                 // Method java/lang/Object.hashCode:()I
      63: istore_1
      64: aload         4
      66: ifnonnull     72
      69: goto          78
      72: aload         4
      74: invokevirtual #74                 // Method java/lang/Object.hashCode:()I
      77: istore_2
      78: iload_1
      79: iload_2
      80: ixor
      81: ireturn

  public java.lang.Object next();
    Code:
       0: aload_0
       1: invokevirtual #77                 // Method a:()Ljava/util/Map$Entry;
       4: areturn

  public void remove();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Z
       4: ifne          15
       7: new           #49                 // class java/lang/IllegalStateException
      10: dup
      11: invokespecial #79                 // Method java/lang/IllegalStateException."<init>":()V
      14: athrow
      15: aload_0
      16: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      19: aload_0
      20: getfield      #34                 // Field b:I
      23: invokevirtual #82                 // Method android/support/v4/g/h.a:(I)V
      26: aload_0
      27: aload_0
      28: getfield      #34                 // Field b:I
      31: iconst_1
      32: isub
      33: putfield      #34                 // Field b:I
      36: aload_0
      37: aload_0
      38: getfield      #32                 // Field a:I
      41: iconst_1
      42: isub
      43: putfield      #32                 // Field a:I
      46: aload_0
      47: iconst_0
      48: putfield      #27                 // Field c:Z
      51: return

  public V setValue(V);
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Z
       4: ifne          17
       7: new           #49                 // class java/lang/IllegalStateException
      10: dup
      11: ldc           #51                 // String This container does not support retaining Map.Entry objects
      13: invokespecial #54                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_0
      18: getfield      #22                 // Field d:Landroid/support/v4/g/h;
      21: aload_0
      22: getfield      #34                 // Field b:I
      25: aload_1
      26: invokevirtual #87                 // Method android/support/v4/g/h.a:(ILjava/lang/Object;)Ljava/lang/Object;
      29: areturn

  public java.lang.String toString();
    Code:
       0: new           #92                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #93                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: invokevirtual #94                 // Method getKey:()Ljava/lang/Object;
      13: invokevirtual #98                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #100                // String =
      20: invokevirtual #103                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: invokevirtual #104                // Method getValue:()Ljava/lang/Object;
      29: invokevirtual #98                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: invokevirtual #106                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      37: areturn
}
