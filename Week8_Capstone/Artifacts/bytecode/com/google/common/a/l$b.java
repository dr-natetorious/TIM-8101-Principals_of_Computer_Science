abstract class com.google.common.a.l$b<K, V> extends java.util.AbstractCollection<java.util.Map$Entry<K, V>> {
  com.google.common.a.l$b();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/util/AbstractCollection."<init>":()V
       4: return

  abstract com.google.common.a.k<K, V> a();

  public void clear();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Lcom/google/common/a/k;
       4: invokeinterface #23,  1           // InterfaceMethod com/google/common/a/k.m:()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #27                 // class java/util/Map$Entry
       4: ifeq          34
       7: aload_1
       8: checkcast     #27                 // class java/util/Map$Entry
      11: astore_1
      12: aload_0
      13: invokevirtual #18                 // Method a:()Lcom/google/common/a/k;
      16: aload_1
      17: invokeinterface #31,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      22: aload_1
      23: invokeinterface #34,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      28: invokeinterface #37,  3           // InterfaceMethod com/google/common/a/k.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      33: ireturn
      34: iconst_0
      35: ireturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #27                 // class java/util/Map$Entry
       4: ifeq          34
       7: aload_1
       8: checkcast     #27                 // class java/util/Map$Entry
      11: astore_1
      12: aload_0
      13: invokevirtual #18                 // Method a:()Lcom/google/common/a/k;
      16: aload_1
      17: invokeinterface #31,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      22: aload_1
      23: invokeinterface #34,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      28: invokeinterface #40,  3           // InterfaceMethod com/google/common/a/k.b:(Ljava/lang/Object;Ljava/lang/Object;)Z
      33: ireturn
      34: iconst_0
      35: ireturn

  public int size();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Lcom/google/common/a/k;
       4: invokeinterface #45,  1           // InterfaceMethod com/google/common/a/k.l:()I
       9: ireturn
}
