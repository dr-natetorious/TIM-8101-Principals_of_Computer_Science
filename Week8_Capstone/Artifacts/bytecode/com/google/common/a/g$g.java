class com.google.common.a.g$g implements java.util.ListIterator<V> {
  final java.lang.Object a;

  int b;

  com.google.common.a.g$e<K, V> c;

  com.google.common.a.g$e<K, V> d;

  com.google.common.a.g$e<K, V> e;

  final com.google.common.a.g f;

  com.google.common.a.g$g(com.google.common.a.g, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #25                 // Field f:Lcom/google/common/a/g;
       5: aload_0
       6: invokespecial #28                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #30                 // Field a:Ljava/lang/Object;
      14: aload_1
      15: invokestatic  #33                 // Method com/google/common/a/g.d:(Lcom/google/common/a/g;)Ljava/util/Map;
      18: aload_2
      19: invokeinterface #39,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      24: checkcast     #41                 // class com/google/common/a/g$d
      27: astore_1
      28: aload_1
      29: ifnonnull     37
      32: aconst_null
      33: astore_1
      34: goto          42
      37: aload_1
      38: getfield      #43                 // Field com/google/common/a/g$d.a:Lcom/google/common/a/g$e;
      41: astore_1
      42: aload_0
      43: aload_1
      44: putfield      #45                 // Field c:Lcom/google/common/a/g$e;
      47: return

  public com.google.common.a.g$g(com.google.common.a.g, java.lang.Object, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #25                 // Field f:Lcom/google/common/a/g;
       5: aload_0
       6: invokespecial #28                 // Method java/lang/Object."<init>":()V
       9: aload_1
      10: invokestatic  #33                 // Method com/google/common/a/g.d:(Lcom/google/common/a/g;)Ljava/util/Map;
      13: aload_2
      14: invokeinterface #39,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      19: checkcast     #41                 // class com/google/common/a/g$d
      22: astore_1
      23: aload_1
      24: ifnonnull     33
      27: iconst_0
      28: istore        4
      30: goto          39
      33: aload_1
      34: getfield      #49                 // Field com/google/common/a/g$d.c:I
      37: istore        4
      39: iload_3
      40: iload         4
      42: invokestatic  #55                 // Method com/google/common/base/Preconditions.checkPositionIndex:(II)I
      45: pop
      46: iload_3
      47: iload         4
      49: iconst_2
      50: idiv
      51: if_icmplt     97
      54: aload_1
      55: ifnonnull     63
      58: aconst_null
      59: astore_1
      60: goto          68
      63: aload_1
      64: getfield      #57                 // Field com/google/common/a/g$d.b:Lcom/google/common/a/g$e;
      67: astore_1
      68: aload_0
      69: aload_1
      70: putfield      #59                 // Field e:Lcom/google/common/a/g$e;
      73: aload_0
      74: iload         4
      76: putfield      #61                 // Field b:I
      79: iload_3
      80: iload         4
      82: if_icmpge     132
      85: aload_0
      86: invokevirtual #65                 // Method previous:()Ljava/lang/Object;
      89: pop
      90: iload_3
      91: iconst_1
      92: iadd
      93: istore_3
      94: goto          79
      97: aload_1
      98: ifnonnull     106
     101: aconst_null
     102: astore_1
     103: goto          111
     106: aload_1
     107: getfield      #43                 // Field com/google/common/a/g$d.a:Lcom/google/common/a/g$e;
     110: astore_1
     111: aload_0
     112: aload_1
     113: putfield      #45                 // Field c:Lcom/google/common/a/g$e;
     116: iload_3
     117: ifle          132
     120: aload_0
     121: invokevirtual #68                 // Method next:()Ljava/lang/Object;
     124: pop
     125: iload_3
     126: iconst_1
     127: isub
     128: istore_3
     129: goto          116
     132: aload_0
     133: aload_2
     134: putfield      #30                 // Field a:Ljava/lang/Object;
     137: aload_0
     138: aconst_null
     139: putfield      #70                 // Field d:Lcom/google/common/a/g$e;
     142: return

  public void add(V);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #25                 // Field f:Lcom/google/common/a/g;
       5: aload_0
       6: getfield      #30                 // Field a:Ljava/lang/Object;
       9: aload_1
      10: aload_0
      11: getfield      #45                 // Field c:Lcom/google/common/a/g$e;
      14: invokestatic  #75                 // Method com/google/common/a/g.a:(Lcom/google/common/a/g;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/g$e;)Lcom/google/common/a/g$e;
      17: putfield      #59                 // Field e:Lcom/google/common/a/g$e;
      20: aload_0
      21: aload_0
      22: getfield      #61                 // Field b:I
      25: iconst_1
      26: iadd
      27: putfield      #61                 // Field b:I
      30: aload_0
      31: aconst_null
      32: putfield      #70                 // Field d:Lcom/google/common/a/g$e;
      35: return

  public boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #45                 // Field c:Lcom/google/common/a/g$e;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public boolean hasPrevious();
    Code:
       0: aload_0
       1: getfield      #59                 // Field e:Lcom/google/common/a/g$e;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public V next();
    Code:
       0: aload_0
       1: getfield      #45                 // Field c:Lcom/google/common/a/g$e;
       4: invokestatic  #83                 // Method com/google/common/a/g.f:(Ljava/lang/Object;)V
       7: aload_0
       8: getfield      #45                 // Field c:Lcom/google/common/a/g$e;
      11: astore_1
      12: aload_0
      13: aload_1
      14: putfield      #70                 // Field d:Lcom/google/common/a/g$e;
      17: aload_0
      18: aload_1
      19: putfield      #59                 // Field e:Lcom/google/common/a/g$e;
      22: aload_0
      23: aload_0
      24: getfield      #45                 // Field c:Lcom/google/common/a/g$e;
      27: getfield      #86                 // Field com/google/common/a/g$e.e:Lcom/google/common/a/g$e;
      30: putfield      #45                 // Field c:Lcom/google/common/a/g$e;
      33: aload_0
      34: aload_0
      35: getfield      #61                 // Field b:I
      38: iconst_1
      39: iadd
      40: putfield      #61                 // Field b:I
      43: aload_0
      44: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
      47: getfield      #88                 // Field com/google/common/a/g$e.b:Ljava/lang/Object;
      50: areturn

  public int nextIndex();
    Code:
       0: aload_0
       1: getfield      #61                 // Field b:I
       4: ireturn

  public V previous();
    Code:
       0: aload_0
       1: getfield      #59                 // Field e:Lcom/google/common/a/g$e;
       4: invokestatic  #83                 // Method com/google/common/a/g.f:(Ljava/lang/Object;)V
       7: aload_0
       8: getfield      #59                 // Field e:Lcom/google/common/a/g$e;
      11: astore_1
      12: aload_0
      13: aload_1
      14: putfield      #70                 // Field d:Lcom/google/common/a/g$e;
      17: aload_0
      18: aload_1
      19: putfield      #45                 // Field c:Lcom/google/common/a/g$e;
      22: aload_0
      23: aload_0
      24: getfield      #59                 // Field e:Lcom/google/common/a/g$e;
      27: getfield      #94                 // Field com/google/common/a/g$e.f:Lcom/google/common/a/g$e;
      30: putfield      #59                 // Field e:Lcom/google/common/a/g$e;
      33: aload_0
      34: aload_0
      35: getfield      #61                 // Field b:I
      38: iconst_1
      39: isub
      40: putfield      #61                 // Field b:I
      43: aload_0
      44: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
      47: getfield      #88                 // Field com/google/common/a/g$e.b:Ljava/lang/Object;
      50: areturn

  public int previousIndex();
    Code:
       0: aload_0
       1: getfield      #61                 // Field b:I
       4: iconst_1
       5: isub
       6: ireturn

  public void remove();
    Code:
       0: aload_0
       1: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
       4: ifnull        12
       7: iconst_1
       8: istore_1
       9: goto          14
      12: iconst_0
      13: istore_1
      14: iload_1
      15: invokestatic  #101                // Method com/google/common/a/d.a:(Z)V
      18: aload_0
      19: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
      22: aload_0
      23: getfield      #45                 // Field c:Lcom/google/common/a/g$e;
      26: if_acmpeq     53
      29: aload_0
      30: aload_0
      31: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
      34: getfield      #94                 // Field com/google/common/a/g$e.f:Lcom/google/common/a/g$e;
      37: putfield      #59                 // Field e:Lcom/google/common/a/g$e;
      40: aload_0
      41: aload_0
      42: getfield      #61                 // Field b:I
      45: iconst_1
      46: isub
      47: putfield      #61                 // Field b:I
      50: goto          64
      53: aload_0
      54: aload_0
      55: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
      58: getfield      #86                 // Field com/google/common/a/g$e.e:Lcom/google/common/a/g$e;
      61: putfield      #45                 // Field c:Lcom/google/common/a/g$e;
      64: aload_0
      65: getfield      #25                 // Field f:Lcom/google/common/a/g;
      68: aload_0
      69: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
      72: invokestatic  #104                // Method com/google/common/a/g.a:(Lcom/google/common/a/g;Lcom/google/common/a/g$e;)V
      75: aload_0
      76: aconst_null
      77: putfield      #70                 // Field d:Lcom/google/common/a/g$e;
      80: return

  public void set(V);
    Code:
       0: aload_0
       1: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
       4: ifnull        12
       7: iconst_1
       8: istore_2
       9: goto          14
      12: iconst_0
      13: istore_2
      14: iload_2
      15: invokestatic  #108                // Method com/google/common/base/Preconditions.checkState:(Z)V
      18: aload_0
      19: getfield      #70                 // Field d:Lcom/google/common/a/g$e;
      22: aload_1
      23: putfield      #88                 // Field com/google/common/a/g$e.b:Ljava/lang/Object;
      26: return
}
