public class android.support.v4.g.a<K, V> extends android.support.v4.g.m<K, V> implements java.util.Map<K, V> {
  android.support.v4.g.h<K, V> a;

  public android.support.v4.g.a();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/support/v4/g/m."<init>":()V
       4: return

  public android.support.v4.g.a(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #20                 // Method android/support/v4/g/m."<init>":(I)V
       5: return

  public android.support.v4.g.a(android.support.v4.g.m);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #23                 // Method android/support/v4/g/m."<init>":(Landroid/support/v4/g/m;)V
       5: return

  public boolean a(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #39                 // Method android/support/v4/g/h.c:(Ljava/util/Map;Ljava/util/Collection;)Z
       5: ireturn

  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
    Code:
       0: aload_0
       1: invokespecial #44                 // Method b:()Landroid/support/v4/g/h;
       4: invokevirtual #47                 // Method android/support/v4/g/h.d:()Ljava/util/Set;
       7: areturn

  public java.util.Set<K> keySet();
    Code:
       0: aload_0
       1: invokespecial #44                 // Method b:()Landroid/support/v4/g/h;
       4: invokevirtual #52                 // Method android/support/v4/g/h.e:()Ljava/util/Set;
       7: areturn

  public void putAll(java.util.Map<? extends K, ? extends V>);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #59                 // Field h:I
       5: aload_1
       6: invokeinterface #63,  1           // InterfaceMethod java/util/Map.size:()I
      11: iadd
      12: invokevirtual #65                 // Method a:(I)V
      15: aload_1
      16: invokeinterface #67,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
      21: invokeinterface #73,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      26: astore_1
      27: aload_1
      28: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          66
      36: aload_1
      37: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      42: checkcast     #85                 // class java/util/Map$Entry
      45: astore_2
      46: aload_0
      47: aload_2
      48: invokeinterface #88,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      53: aload_2
      54: invokeinterface #91,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      59: invokevirtual #95                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      62: pop
      63: goto          27
      66: return

  public java.util.Collection<V> values();
    Code:
       0: aload_0
       1: invokespecial #44                 // Method b:()Landroid/support/v4/g/h;
       4: invokevirtual #101                // Method android/support/v4/g/h.f:()Ljava/util/Collection;
       7: areturn
}
