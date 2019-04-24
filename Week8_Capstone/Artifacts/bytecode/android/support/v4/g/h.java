abstract class android.support.v4.g.h<K, V> {
  android.support.v4.g.h<K, V>.b b;

  android.support.v4.g.h<K, V>.c c;

  android.support.v4.g.h<K, V>.e d;

  android.support.v4.g.h();
    Code:
       0: aload_0
       1: invokespecial #30                 // Method java/lang/Object."<init>":()V
       4: return

  public static <K, V> boolean a(java.util.Map<K, V>, java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokeinterface #38,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       6: astore_1
       7: aload_1
       8: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      13: ifeq          33
      16: aload_0
      17: aload_1
      18: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: invokeinterface #54,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      28: ifne          7
      31: iconst_0
      32: ireturn
      33: iconst_1
      34: ireturn

  public static <T> boolean a(java.util.Set<T>, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #63                 // class java/util/Set
      11: ifeq          50
      14: aload_1
      15: checkcast     #63                 // class java/util/Set
      18: astore_1
      19: aload_0
      20: invokeinterface #67,  1           // InterfaceMethod java/util/Set.size:()I
      25: aload_1
      26: invokeinterface #67,  1           // InterfaceMethod java/util/Set.size:()I
      31: if_icmpne     48
      34: aload_0
      35: aload_1
      36: invokeinterface #71,  2           // InterfaceMethod java/util/Set.containsAll:(Ljava/util/Collection;)Z
      41: istore_2
      42: iload_2
      43: ifeq          48
      46: iconst_1
      47: ireturn
      48: iconst_0
      49: ireturn
      50: iconst_0
      51: ireturn
      52: astore_0
      53: iconst_0
      54: ireturn
    Exception table:
       from    to  target type
          19    42    52   Class java/lang/NullPointerException
          19    42    52   Class java/lang/ClassCastException

  public static <K, V> boolean b(java.util.Map<K, V>, java.util.Collection<?>);
    Code:
       0: aload_0
       1: invokeinterface #73,  1           // InterfaceMethod java/util/Map.size:()I
       6: istore_2
       7: aload_1
       8: invokeinterface #38,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      13: astore_1
      14: aload_1
      15: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      20: ifeq          39
      23: aload_0
      24: aload_1
      25: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      30: invokeinterface #77,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      35: pop
      36: goto          14
      39: iload_2
      40: aload_0
      41: invokeinterface #73,  1           // InterfaceMethod java/util/Map.size:()I
      46: if_icmpeq     51
      49: iconst_1
      50: ireturn
      51: iconst_0
      52: ireturn

  public static <K, V> boolean c(java.util.Map<K, V>, java.util.Collection<?>);
    Code:
       0: aload_0
       1: invokeinterface #73,  1           // InterfaceMethod java/util/Map.size:()I
       6: istore_2
       7: aload_0
       8: invokeinterface #81,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      13: invokeinterface #82,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      18: astore_3
      19: aload_3
      20: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      25: ifeq          52
      28: aload_1
      29: aload_3
      30: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      35: invokeinterface #85,  2           // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      40: ifne          19
      43: aload_3
      44: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.remove:()V
      49: goto          19
      52: iload_2
      53: aload_0
      54: invokeinterface #73,  1           // InterfaceMethod java/util/Map.size:()I
      59: if_icmpeq     64
      62: iconst_1
      63: ireturn
      64: iconst_0
      65: ireturn

  protected abstract int a();

  protected abstract int a(java.lang.Object);

  protected abstract java.lang.Object a(int, int);

  protected abstract V a(int, V);

  protected abstract void a(int);

  protected abstract void a(K, V);

  public <T> T[] a(T[], int);
    Code:
       0: aload_0
       1: invokevirtual #95                 // Method a:()I
       4: istore        4
       6: aload_1
       7: astore        5
       9: aload_1
      10: arraylength
      11: iload         4
      13: if_icmpge     33
      16: aload_1
      17: invokevirtual #99                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      20: invokevirtual #104                // Method java/lang/Class.getComponentType:()Ljava/lang/Class;
      23: iload         4
      25: invokestatic  #110                // Method java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
      28: checkcast     #112                // class "[Ljava/lang/Object;"
      31: astore        5
      33: iconst_0
      34: istore_3
      35: iload_3
      36: iload         4
      38: if_icmpge     58
      41: aload         5
      43: iload_3
      44: aload_0
      45: iload_3
      46: iload_2
      47: invokevirtual #114                // Method a:(II)Ljava/lang/Object;
      50: aastore
      51: iload_3
      52: iconst_1
      53: iadd
      54: istore_3
      55: goto          35
      58: aload         5
      60: arraylength
      61: iload         4
      63: if_icmple     72
      66: aload         5
      68: iload         4
      70: aconst_null
      71: aastore
      72: aload         5
      74: areturn

  protected abstract int b(java.lang.Object);

  protected abstract java.util.Map<K, V> b();

  public java.lang.Object[] b(int);
    Code:
       0: aload_0
       1: invokevirtual #95                 // Method a:()I
       4: istore_3
       5: iload_3
       6: anewarray     #5                  // class java/lang/Object
       9: astore        4
      11: iconst_0
      12: istore_2
      13: iload_2
      14: iload_3
      15: if_icmpge     35
      18: aload         4
      20: iload_2
      21: aload_0
      22: iload_2
      23: iload_1
      24: invokevirtual #114                // Method a:(II)Ljava/lang/Object;
      27: aastore
      28: iload_2
      29: iconst_1
      30: iadd
      31: istore_2
      32: goto          13
      35: aload         4
      37: areturn

  protected abstract void c();

  public java.util.Set<java.util.Map$Entry<K, V>> d();
    Code:
       0: aload_0
       1: getfield      #119                // Field b:Landroid/support/v4/g/h$b;
       4: ifnonnull     19
       7: aload_0
       8: new           #10                 // class android/support/v4/g/h$b
      11: dup
      12: aload_0
      13: invokespecial #122                // Method android/support/v4/g/h$b."<init>":(Landroid/support/v4/g/h;)V
      16: putfield      #119                // Field b:Landroid/support/v4/g/h$b;
      19: aload_0
      20: getfield      #119                // Field b:Landroid/support/v4/g/h$b;
      23: areturn

  public java.util.Set<K> e();
    Code:
       0: aload_0
       1: getfield      #125                // Field c:Landroid/support/v4/g/h$c;
       4: ifnonnull     19
       7: aload_0
       8: new           #13                 // class android/support/v4/g/h$c
      11: dup
      12: aload_0
      13: invokespecial #126                // Method android/support/v4/g/h$c."<init>":(Landroid/support/v4/g/h;)V
      16: putfield      #125                // Field c:Landroid/support/v4/g/h$c;
      19: aload_0
      20: getfield      #125                // Field c:Landroid/support/v4/g/h$c;
      23: areturn

  public java.util.Collection<V> f();
    Code:
       0: aload_0
       1: getfield      #131                // Field d:Landroid/support/v4/g/h$e;
       4: ifnonnull     19
       7: aload_0
       8: new           #19                 // class android/support/v4/g/h$e
      11: dup
      12: aload_0
      13: invokespecial #132                // Method android/support/v4/g/h$e."<init>":(Landroid/support/v4/g/h;)V
      16: putfield      #131                // Field d:Landroid/support/v4/g/h$e;
      19: aload_0
      20: getfield      #131                // Field d:Landroid/support/v4/g/h$e;
      23: areturn
}
