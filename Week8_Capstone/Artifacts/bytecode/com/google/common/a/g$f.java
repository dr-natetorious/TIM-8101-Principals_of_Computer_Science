class com.google.common.a.g$f implements java.util.ListIterator<java.util.Map$Entry<K, V>> {
  int a;

  com.google.common.a.g$e<K, V> b;

  com.google.common.a.g$e<K, V> c;

  com.google.common.a.g$e<K, V> d;

  int e;

  final com.google.common.a.g f;

  com.google.common.a.g$f(com.google.common.a.g, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #23                 // Field f:Lcom/google/common/a/g;
       5: aload_0
       6: invokespecial #26                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_0
      11: getfield      #23                 // Field f:Lcom/google/common/a/g;
      14: invokestatic  #29                 // Method com/google/common/a/g.a:(Lcom/google/common/a/g;)I
      17: putfield      #31                 // Field e:I
      20: aload_1
      21: invokevirtual #35                 // Method com/google/common/a/g.l:()I
      24: istore_3
      25: iload_2
      26: iload_3
      27: invokestatic  #41                 // Method com/google/common/base/Preconditions.checkPositionIndex:(II)I
      30: pop
      31: iload_2
      32: iload_3
      33: iconst_2
      34: idiv
      35: if_icmplt     68
      38: aload_0
      39: aload_1
      40: invokestatic  #44                 // Method com/google/common/a/g.b:(Lcom/google/common/a/g;)Lcom/google/common/a/g$e;
      43: putfield      #46                 // Field d:Lcom/google/common/a/g$e;
      46: aload_0
      47: iload_3
      48: putfield      #48                 // Field a:I
      51: iload_2
      52: iload_3
      53: if_icmpge     92
      56: aload_0
      57: invokevirtual #51                 // Method b:()Lcom/google/common/a/g$e;
      60: pop
      61: iload_2
      62: iconst_1
      63: iadd
      64: istore_2
      65: goto          51
      68: aload_0
      69: aload_1
      70: invokestatic  #53                 // Method com/google/common/a/g.c:(Lcom/google/common/a/g;)Lcom/google/common/a/g$e;
      73: putfield      #55                 // Field b:Lcom/google/common/a/g$e;
      76: iload_2
      77: ifle          92
      80: aload_0
      81: invokevirtual #57                 // Method a:()Lcom/google/common/a/g$e;
      84: pop
      85: iload_2
      86: iconst_1
      87: isub
      88: istore_2
      89: goto          76
      92: aload_0
      93: aconst_null
      94: putfield      #59                 // Field c:Lcom/google/common/a/g$e;
      97: return

  public com.google.common.a.g$e<K, V> a();
    Code:
       0: aload_0
       1: invokespecial #66                 // Method c:()V
       4: aload_0
       5: getfield      #55                 // Field b:Lcom/google/common/a/g$e;
       8: invokestatic  #69                 // Method com/google/common/a/g.f:(Ljava/lang/Object;)V
      11: aload_0
      12: getfield      #55                 // Field b:Lcom/google/common/a/g$e;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #59                 // Field c:Lcom/google/common/a/g$e;
      21: aload_0
      22: aload_1
      23: putfield      #46                 // Field d:Lcom/google/common/a/g$e;
      26: aload_0
      27: aload_0
      28: getfield      #55                 // Field b:Lcom/google/common/a/g$e;
      31: getfield      #72                 // Field com/google/common/a/g$e.c:Lcom/google/common/a/g$e;
      34: putfield      #55                 // Field b:Lcom/google/common/a/g$e;
      37: aload_0
      38: aload_0
      39: getfield      #48                 // Field a:I
      42: iconst_1
      43: iadd
      44: putfield      #48                 // Field a:I
      47: aload_0
      48: getfield      #59                 // Field c:Lcom/google/common/a/g$e;
      51: areturn

  public void a(java.util.Map$Entry<K, V>);
    Code:
       0: new           #78                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #79                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public void add(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #83                 // class java/util/Map$Entry
       5: invokevirtual #85                 // Method b:(Ljava/util/Map$Entry;)V
       8: return

  public com.google.common.a.g$e<K, V> b();
    Code:
       0: aload_0
       1: invokespecial #66                 // Method c:()V
       4: aload_0
       5: getfield      #46                 // Field d:Lcom/google/common/a/g$e;
       8: invokestatic  #69                 // Method com/google/common/a/g.f:(Ljava/lang/Object;)V
      11: aload_0
      12: getfield      #46                 // Field d:Lcom/google/common/a/g$e;
      15: astore_1
      16: aload_0
      17: aload_1
      18: putfield      #59                 // Field c:Lcom/google/common/a/g$e;
      21: aload_0
      22: aload_1
      23: putfield      #55                 // Field b:Lcom/google/common/a/g$e;
      26: aload_0
      27: aload_0
      28: getfield      #46                 // Field d:Lcom/google/common/a/g$e;
      31: getfield      #86                 // Field com/google/common/a/g$e.d:Lcom/google/common/a/g$e;
      34: putfield      #46                 // Field d:Lcom/google/common/a/g$e;
      37: aload_0
      38: aload_0
      39: getfield      #48                 // Field a:I
      42: iconst_1
      43: isub
      44: putfield      #48                 // Field a:I
      47: aload_0
      48: getfield      #59                 // Field c:Lcom/google/common/a/g$e;
      51: areturn

  public void b(java.util.Map$Entry<K, V>);
    Code:
       0: new           #78                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #79                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public boolean hasNext();
    Code:
       0: aload_0
       1: invokespecial #66                 // Method c:()V
       4: aload_0
       5: getfield      #55                 // Field b:Lcom/google/common/a/g$e;
       8: ifnull        13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public boolean hasPrevious();
    Code:
       0: aload_0
       1: invokespecial #66                 // Method c:()V
       4: aload_0
       5: getfield      #46                 // Field d:Lcom/google/common/a/g$e;
       8: ifnull        13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public java.lang.Object next();
    Code:
       0: aload_0
       1: invokevirtual #57                 // Method a:()Lcom/google/common/a/g$e;
       4: areturn

  public int nextIndex();
    Code:
       0: aload_0
       1: getfield      #48                 // Field a:I
       4: ireturn

  public java.lang.Object previous();
    Code:
       0: aload_0
       1: invokevirtual #51                 // Method b:()Lcom/google/common/a/g$e;
       4: areturn

  public int previousIndex();
    Code:
       0: aload_0
       1: getfield      #48                 // Field a:I
       4: iconst_1
       5: isub
       6: ireturn

  public void remove();
    Code:
       0: aload_0
       1: invokespecial #66                 // Method c:()V
       4: aload_0
       5: getfield      #59                 // Field c:Lcom/google/common/a/g$e;
       8: ifnull        16
      11: iconst_1
      12: istore_1
      13: goto          18
      16: iconst_0
      17: istore_1
      18: iload_1
      19: invokestatic  #100                // Method com/google/common/a/d.a:(Z)V
      22: aload_0
      23: getfield      #59                 // Field c:Lcom/google/common/a/g$e;
      26: aload_0
      27: getfield      #55                 // Field b:Lcom/google/common/a/g$e;
      30: if_acmpeq     57
      33: aload_0
      34: aload_0
      35: getfield      #59                 // Field c:Lcom/google/common/a/g$e;
      38: getfield      #86                 // Field com/google/common/a/g$e.d:Lcom/google/common/a/g$e;
      41: putfield      #46                 // Field d:Lcom/google/common/a/g$e;
      44: aload_0
      45: aload_0
      46: getfield      #48                 // Field a:I
      49: iconst_1
      50: isub
      51: putfield      #48                 // Field a:I
      54: goto          68
      57: aload_0
      58: aload_0
      59: getfield      #59                 // Field c:Lcom/google/common/a/g$e;
      62: getfield      #72                 // Field com/google/common/a/g$e.c:Lcom/google/common/a/g$e;
      65: putfield      #55                 // Field b:Lcom/google/common/a/g$e;
      68: aload_0
      69: getfield      #23                 // Field f:Lcom/google/common/a/g;
      72: aload_0
      73: getfield      #59                 // Field c:Lcom/google/common/a/g$e;
      76: invokestatic  #103                // Method com/google/common/a/g.a:(Lcom/google/common/a/g;Lcom/google/common/a/g$e;)V
      79: aload_0
      80: aconst_null
      81: putfield      #59                 // Field c:Lcom/google/common/a/g$e;
      84: aload_0
      85: aload_0
      86: getfield      #23                 // Field f:Lcom/google/common/a/g;
      89: invokestatic  #29                 // Method com/google/common/a/g.a:(Lcom/google/common/a/g;)I
      92: putfield      #31                 // Field e:I
      95: return

  public void set(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #83                 // class java/util/Map$Entry
       5: invokevirtual #106                // Method a:(Ljava/util/Map$Entry;)V
       8: return
}
