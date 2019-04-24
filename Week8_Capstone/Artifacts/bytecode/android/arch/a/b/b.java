public class android.arch.a.b.b<K, V> implements java.lang.Iterable<java.util.Map$Entry<K, V>> {
  public android.arch.a.b.b();
    Code:
       0: aload_0
       1: invokespecial #36                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #38                 // class java/util/WeakHashMap
       8: dup
       9: invokespecial #39                 // Method java/util/WeakHashMap."<init>":()V
      12: putfield      #41                 // Field c:Ljava/util/WeakHashMap;
      15: aload_0
      16: iconst_0
      17: putfield      #43                 // Field d:I
      20: return

  static android.arch.a.b.b$c a(android.arch.a.b.b);
    Code:
       0: aload_0
       1: getfield      #47                 // Field a:Landroid/arch/a/b/b$c;
       4: areturn

  public int a();
    Code:
       0: aload_0
       1: getfield      #43                 // Field d:I
       4: ireturn

  protected android.arch.a.b.b$c<K, V> a(K);
    Code:
       0: aload_0
       1: getfield      #47                 // Field a:Landroid/arch/a/b/b$c;
       4: astore_2
       5: aload_2
       6: ifnull        30
       9: aload_2
      10: getfield      #52                 // Field android/arch/a/b/b$c.a:Ljava/lang/Object;
      13: aload_1
      14: invokevirtual #56                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      17: ifeq          22
      20: aload_2
      21: areturn
      22: aload_2
      23: getfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
      26: astore_2
      27: goto          5
      30: aload_2
      31: areturn

  public V a(K, V);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #63                 // Method a:(Ljava/lang/Object;)Landroid/arch/a/b/b$c;
       5: astore_3
       6: aload_3
       7: ifnull        15
      10: aload_3
      11: getfield      #65                 // Field android/arch/a/b/b$c.b:Ljava/lang/Object;
      14: areturn
      15: aload_0
      16: aload_1
      17: aload_2
      18: invokevirtual #68                 // Method b:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/arch/a/b/b$c;
      21: pop
      22: aconst_null
      23: areturn

  protected android.arch.a.b.b$c<K, V> b(K, V);
    Code:
       0: new           #17                 // class android/arch/a/b/b$c
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #72                 // Method android/arch/a/b/b$c."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
       9: astore_1
      10: aload_0
      11: aload_0
      12: getfield      #43                 // Field d:I
      15: iconst_1
      16: iadd
      17: putfield      #43                 // Field d:I
      20: aload_0
      21: getfield      #74                 // Field b:Landroid/arch/a/b/b$c;
      24: ifnonnull     42
      27: aload_0
      28: aload_1
      29: putfield      #47                 // Field a:Landroid/arch/a/b/b$c;
      32: aload_0
      33: aload_0
      34: getfield      #47                 // Field a:Landroid/arch/a/b/b$c;
      37: putfield      #74                 // Field b:Landroid/arch/a/b/b$c;
      40: aload_1
      41: areturn
      42: aload_0
      43: getfield      #74                 // Field b:Landroid/arch/a/b/b$c;
      46: aload_1
      47: putfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
      50: aload_1
      51: aload_0
      52: getfield      #74                 // Field b:Landroid/arch/a/b/b$c;
      55: putfield      #76                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
      58: aload_0
      59: aload_1
      60: putfield      #74                 // Field b:Landroid/arch/a/b/b$c;
      63: aload_1
      64: areturn

  public V b(K);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #63                 // Method a:(Ljava/lang/Object;)Landroid/arch/a/b/b$c;
       5: astore_1
       6: aload_1
       7: ifnonnull     12
      10: aconst_null
      11: areturn
      12: aload_0
      13: aload_0
      14: getfield      #43                 // Field d:I
      17: iconst_1
      18: isub
      19: putfield      #43                 // Field d:I
      22: aload_0
      23: getfield      #41                 // Field c:Ljava/util/WeakHashMap;
      26: invokevirtual #82                 // Method java/util/WeakHashMap.isEmpty:()Z
      29: ifne          72
      32: aload_0
      33: getfield      #41                 // Field c:Ljava/util/WeakHashMap;
      36: invokevirtual #86                 // Method java/util/WeakHashMap.keySet:()Ljava/util/Set;
      39: invokeinterface #92,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      44: astore_2
      45: aload_2
      46: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          72
      54: aload_2
      55: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      60: checkcast     #26                 // class android/arch/a/b/b$f
      63: aload_1
      64: invokeinterface #105,  2          // InterfaceMethod android/arch/a/b/b$f.a_:(Landroid/arch/a/b/b$c;)V
      69: goto          45
      72: aload_1
      73: getfield      #76                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
      76: ifnull        93
      79: aload_1
      80: getfield      #76                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
      83: aload_1
      84: getfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
      87: putfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
      90: goto          101
      93: aload_0
      94: aload_1
      95: getfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
      98: putfield      #47                 // Field a:Landroid/arch/a/b/b$c;
     101: aload_1
     102: getfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
     105: ifnull        122
     108: aload_1
     109: getfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
     112: aload_1
     113: getfield      #76                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
     116: putfield      #76                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
     119: goto          130
     122: aload_0
     123: aload_1
     124: getfield      #76                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
     127: putfield      #74                 // Field b:Landroid/arch/a/b/b$c;
     130: aload_1
     131: aconst_null
     132: putfield      #58                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
     135: aload_1
     136: aconst_null
     137: putfield      #76                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
     140: aload_1
     141: getfield      #65                 // Field android/arch/a/b/b$c.b:Ljava/lang/Object;
     144: areturn

  public java.util.Iterator<java.util.Map$Entry<K, V>> b();
    Code:
       0: new           #14                 // class android/arch/a/b/b$b
       3: dup
       4: aload_0
       5: getfield      #74                 // Field b:Landroid/arch/a/b/b$c;
       8: aload_0
       9: getfield      #47                 // Field a:Landroid/arch/a/b/b$c;
      12: invokespecial #109                // Method android/arch/a/b/b$b."<init>":(Landroid/arch/a/b/b$c;Landroid/arch/a/b/b$c;)V
      15: astore_1
      16: aload_0
      17: getfield      #41                 // Field c:Ljava/util/WeakHashMap;
      20: aload_1
      21: iconst_0
      22: invokestatic  #115                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      25: invokevirtual #118                // Method java/util/WeakHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      28: pop
      29: aload_1
      30: areturn

  public android.arch.a.b.b<K, V>.d c();
    Code:
       0: new           #20                 // class android/arch/a/b/b$d
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #123                // Method android/arch/a/b/b$d."<init>":(Landroid/arch/a/b/b;Landroid/arch/a/b/b$1;)V
       9: astore_1
      10: aload_0
      11: getfield      #41                 // Field c:Ljava/util/WeakHashMap;
      14: aload_1
      15: iconst_0
      16: invokestatic  #115                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      19: invokevirtual #118                // Method java/util/WeakHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      22: pop
      23: aload_1
      24: areturn

  public java.util.Map$Entry<K, V> d();
    Code:
       0: aload_0
       1: getfield      #47                 // Field a:Landroid/arch/a/b/b$c;
       4: areturn

  public java.util.Map$Entry<K, V> e();
    Code:
       0: aload_0
       1: getfield      #74                 // Field b:Landroid/arch/a/b/b$c;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class android/arch/a/b/b
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_1
      17: checkcast     #2                  // class android/arch/a/b/b
      20: astore_2
      21: aload_0
      22: invokevirtual #128                // Method a:()I
      25: aload_2
      26: invokevirtual #128                // Method a:()I
      29: if_icmpeq     34
      32: iconst_0
      33: ireturn
      34: aload_0
      35: invokevirtual #129                // Method iterator:()Ljava/util/Iterator;
      38: astore_1
      39: aload_2
      40: invokevirtual #129                // Method iterator:()Ljava/util/Iterator;
      43: astore_2
      44: aload_1
      45: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      50: ifeq          106
      53: aload_2
      54: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      59: ifeq          106
      62: aload_1
      63: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      68: checkcast     #131                // class java/util/Map$Entry
      71: astore_3
      72: aload_2
      73: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      78: astore        4
      80: aload_3
      81: ifnonnull     89
      84: aload         4
      86: ifnonnull     104
      89: aload_3
      90: ifnull        44
      93: aload_3
      94: aload         4
      96: invokeinterface #132,  2          // InterfaceMethod java/util/Map$Entry.equals:(Ljava/lang/Object;)Z
     101: ifne          44
     104: iconst_0
     105: ireturn
     106: aload_1
     107: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     112: ifne          126
     115: aload_2
     116: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     121: ifne          126
     124: iconst_1
     125: ireturn
     126: iconst_0
     127: ireturn

  public java.util.Iterator<java.util.Map$Entry<K, V>> iterator();
    Code:
       0: new           #11                 // class android/arch/a/b/b$a
       3: dup
       4: aload_0
       5: getfield      #47                 // Field a:Landroid/arch/a/b/b$c;
       8: aload_0
       9: getfield      #74                 // Field b:Landroid/arch/a/b/b$c;
      12: invokespecial #133                // Method android/arch/a/b/b$a."<init>":(Landroid/arch/a/b/b$c;Landroid/arch/a/b/b$c;)V
      15: astore_1
      16: aload_0
      17: getfield      #41                 // Field c:Ljava/util/WeakHashMap;
      20: aload_1
      21: iconst_0
      22: invokestatic  #115                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      25: invokevirtual #118                // Method java/util/WeakHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      28: pop
      29: aload_1
      30: areturn

  public java.lang.String toString();
    Code:
       0: new           #137                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #138                // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #140                // String [
      11: invokevirtual #144                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_0
      16: invokevirtual #129                // Method iterator:()Ljava/util/Iterator;
      19: astore_2
      20: aload_2
      21: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      26: ifeq          65
      29: aload_1
      30: aload_2
      31: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      36: checkcast     #131                // class java/util/Map$Entry
      39: invokevirtual #146                // Method java/lang/Object.toString:()Ljava/lang/String;
      42: invokevirtual #144                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      45: pop
      46: aload_2
      47: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      52: ifeq          20
      55: aload_1
      56: ldc           #148                // String ,
      58: invokevirtual #144                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      61: pop
      62: goto          20
      65: aload_1
      66: ldc           #150                // String ]
      68: invokevirtual #144                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      71: pop
      72: aload_1
      73: invokevirtual #151                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      76: areturn
}
