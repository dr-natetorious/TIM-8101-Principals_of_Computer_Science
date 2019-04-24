public class com.google.common.a.g<K, V> extends com.google.common.a.b<K, V> implements com.google.common.a.h<K, V>, java.io.Serializable {
  com.google.common.a.g();
    Code:
       0: aload_0
       1: invokespecial #41                 // Method com/google/common/a/b."<init>":()V
       4: aload_0
       5: invokestatic  #46                 // Method com/google/common/a/j.c:()Ljava/util/HashMap;
       8: putfield      #48                 // Field c:Ljava/util/Map;
      11: return

  static int a(com.google.common.a.g);
    Code:
       0: aload_0
       1: getfield      #52                 // Field e:I
       4: ireturn

  static com.google.common.a.g$e a(com.google.common.a.g, java.lang.Object, java.lang.Object, com.google.common.a.g$e);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokespecial #56                 // Method a:(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/g$e;)Lcom/google/common/a/g$e;
       7: areturn

  static void a(com.google.common.a.g, com.google.common.a.g$e);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #104                // Method a:(Lcom/google/common/a/g$e;)V
       5: return

  static void a(com.google.common.a.g, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #108                // Method g:(Ljava/lang/Object;)V
       5: return

  static com.google.common.a.g$e b(com.google.common.a.g);
    Code:
       0: aload_0
       1: getfield      #64                 // Field b:Lcom/google/common/a/g$e;
       4: areturn

  static com.google.common.a.g$e c(com.google.common.a.g);
    Code:
       0: aload_0
       1: getfield      #62                 // Field a:Lcom/google/common/a/g$e;
       4: areturn

  static java.util.Map d(com.google.common.a.g);
    Code:
       0: aload_0
       1: getfield      #48                 // Field c:Ljava/util/Map;
       4: areturn

  static int e(com.google.common.a.g);
    Code:
       0: aload_0
       1: getfield      #91                 // Field d:I
       4: ireturn

  static void f(java.lang.Object);
    Code:
       0: aload_0
       1: invokestatic  #113                // Method h:(Ljava/lang/Object;)V
       4: return

  public static <K, V> com.google.common.a.g<K, V> k();
    Code:
       0: new           #2                  // class com/google/common/a/g
       3: dup
       4: invokespecial #140                // Method "<init>":()V
       7: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #62                 // Field a:Lcom/google/common/a/g$e;
       4: ifnonnull     9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public boolean a(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #48                 // Field c:Ljava/util/Map;
       4: aload_1
       5: invokeinterface #146,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      10: ireturn

  public boolean a(java.lang.Object, java.lang.Iterable);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #149                // Method com/google/common/a/b.a:(Ljava/lang/Object;Ljava/lang/Iterable;)Z
       6: ireturn

  public boolean a(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #152                // Method com/google/common/a/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
       6: ireturn

  public java.util.Collection b();
    Code:
       0: aload_0
       1: invokevirtual #157                // Method n:()Ljava/util/List;
       4: areturn

  public java.util.Collection b(java.lang.Object, java.lang.Iterable);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #161                // Method c:(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;
       6: areturn

  public java.util.List<V> b(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #163                // Method i:(Ljava/lang/Object;)Ljava/util/List;
       5: astore_2
       6: aload_0
       7: aload_1
       8: invokespecial #108                // Method g:(Ljava/lang/Object;)V
      11: aload_2
      12: areturn

  public boolean b(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #165                // Method com/google/common/a/b.b:(Ljava/lang/Object;Ljava/lang/Object;)Z
       6: ireturn

  java.util.Collection c();
    Code:
       0: aload_0
       1: invokevirtual #168                // Method o:()Ljava/util/List;
       4: areturn

  public java.util.List<V> c(K);
    Code:
       0: new           #11                 // class com/google/common/a/g$1
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #169                // Method com/google/common/a/g$1."<init>":(Lcom/google/common/a/g;Ljava/lang/Object;)V
       9: areturn

  public java.util.List<V> c(K, java.lang.Iterable<? extends V>);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #163                // Method i:(Ljava/lang/Object;)Ljava/util/List;
       5: astore_3
       6: new           #31                 // class com/google/common/a/g$g
       9: dup
      10: aload_0
      11: aload_1
      12: invokespecial #115                // Method com/google/common/a/g$g."<init>":(Lcom/google/common/a/g;Ljava/lang/Object;)V
      15: astore_1
      16: aload_2
      17: invokeinterface #176,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      22: astore_2
      23: aload_1
      24: invokeinterface #181,  1          // InterfaceMethod java/util/ListIterator.hasNext:()Z
      29: ifeq          63
      32: aload_2
      33: invokeinterface #184,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      38: ifeq          63
      41: aload_1
      42: invokeinterface #188,  1          // InterfaceMethod java/util/ListIterator.next:()Ljava/lang/Object;
      47: pop
      48: aload_1
      49: aload_2
      50: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      55: invokeinterface #192,  2          // InterfaceMethod java/util/ListIterator.set:(Ljava/lang/Object;)V
      60: goto          23
      63: aload_1
      64: invokeinterface #181,  1          // InterfaceMethod java/util/ListIterator.hasNext:()Z
      69: ifeq          88
      72: aload_1
      73: invokeinterface #188,  1          // InterfaceMethod java/util/ListIterator.next:()Ljava/lang/Object;
      78: pop
      79: aload_1
      80: invokeinterface #194,  1          // InterfaceMethod java/util/ListIterator.remove:()V
      85: goto          63
      88: aload_2
      89: invokeinterface #184,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      94: ifeq          112
      97: aload_1
      98: aload_2
      99: invokeinterface #189,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     104: invokeinterface #197,  2          // InterfaceMethod java/util/ListIterator.add:(Ljava/lang/Object;)V
     109: goto          88
     112: aload_3
     113: areturn

  public boolean c(K, V);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aconst_null
       4: invokespecial #56                 // Method a:(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/g$e;)Lcom/google/common/a/g$e;
       7: pop
       8: iconst_1
       9: ireturn

  public java.util.Collection d(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #202                // Method c:(Ljava/lang/Object;)Ljava/util/List;
       5: areturn

  java.util.Iterator<java.util.Map$Entry<K, V>> d();
    Code:
       0: new           #204                // class java/lang/AssertionError
       3: dup
       4: ldc           #206                // String should never be called
       6: invokespecial #208                // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
       9: athrow

  public java.util.Collection e(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #211                // Method b:(Ljava/lang/Object;)Ljava/util/List;
       5: areturn

  public java.util.Set e();
    Code:
       0: aload_0
       1: invokespecial #214                // Method com/google/common/a/b.e:()Ljava/util/Set;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #217                // Method com/google/common/a/b.equals:(Ljava/lang/Object;)Z
       5: ireturn

  java.util.Set<K> f();
    Code:
       0: new           #16                 // class com/google/common/a/g$b
       3: dup
       4: aload_0
       5: invokespecial #220                // Method com/google/common/a/g$b."<init>":(Lcom/google/common/a/g;)V
       8: areturn

  public com.google.common.a.m g();
    Code:
       0: aload_0
       1: invokespecial #224                // Method com/google/common/a/b.g:()Lcom/google/common/a/m;
       4: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: invokespecial #228                // Method com/google/common/a/b.hashCode:()I
       4: ireturn

  public java.util.Map i();
    Code:
       0: aload_0
       1: invokespecial #231                // Method com/google/common/a/b.i:()Ljava/util/Map;
       4: areturn

  java.util.Map<K, java.util.Collection<V>> j();
    Code:
       0: new           #234                // class com/google/common/a/l$a
       3: dup
       4: aload_0
       5: invokespecial #237                // Method com/google/common/a/l$a."<init>":(Lcom/google/common/a/k;)V
       8: areturn

  public int l();
    Code:
       0: aload_0
       1: getfield      #91                 // Field d:I
       4: ireturn

  public void m();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #62                 // Field a:Lcom/google/common/a/g$e;
       5: aload_0
       6: aconst_null
       7: putfield      #64                 // Field b:Lcom/google/common/a/g$e;
      10: aload_0
      11: getfield      #48                 // Field c:Ljava/util/Map;
      14: invokeinterface #243,  1          // InterfaceMethod java/util/Map.clear:()V
      19: aload_0
      20: iconst_0
      21: putfield      #91                 // Field d:I
      24: aload_0
      25: aload_0
      26: getfield      #52                 // Field e:I
      29: iconst_1
      30: iadd
      31: putfield      #52                 // Field e:I
      34: return

  public java.util.List<java.util.Map$Entry<K, V>> n();
    Code:
       0: aload_0
       1: invokespecial #245                // Method com/google/common/a/b.b:()Ljava/util/Collection;
       4: checkcast     #247                // class java/util/List
       7: areturn

  java.util.List<java.util.Map$Entry<K, V>> o();
    Code:
       0: new           #13                 // class com/google/common/a/g$a
       3: dup
       4: aload_0
       5: invokespecial #249                // Method com/google/common/a/g$a."<init>":(Lcom/google/common/a/g;)V
       8: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokespecial #253                // Method com/google/common/a/b.toString:()Ljava/lang/String;
       4: areturn
}
