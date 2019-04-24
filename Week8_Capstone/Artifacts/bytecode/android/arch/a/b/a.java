public class android.arch.a.b.a<K, V> extends android.arch.a.b.b<K, V> {
  public android.arch.a.b.a();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/arch/a/b/b."<init>":()V
       4: aload_0
       5: new           #14                 // class java/util/HashMap
       8: dup
       9: invokespecial #15                 // Method java/util/HashMap."<init>":()V
      12: putfield      #17                 // Field a:Ljava/util/HashMap;
      15: return

  protected android.arch.a.b.b$c<K, V> a(K);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Ljava/util/HashMap;
       4: aload_1
       5: invokevirtual #23                 // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #25                 // class android/arch/a/b/b$c
      11: areturn

  public V a(K, V);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #30                 // Method a:(Ljava/lang/Object;)Landroid/arch/a/b/b$c;
       5: astore_3
       6: aload_3
       7: ifnull        15
      10: aload_3
      11: getfield      #34                 // Field android/arch/a/b/b$c.b:Ljava/lang/Object;
      14: areturn
      15: aload_0
      16: getfield      #17                 // Field a:Ljava/util/HashMap;
      19: aload_1
      20: aload_0
      21: aload_1
      22: aload_2
      23: invokevirtual #37                 // Method b:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/arch/a/b/b$c;
      26: invokevirtual #40                 // Method java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      29: pop
      30: aconst_null
      31: areturn

  public V b(K);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #43                 // Method android/arch/a/b/b.b:(Ljava/lang/Object;)Ljava/lang/Object;
       5: astore_2
       6: aload_0
       7: getfield      #17                 // Field a:Ljava/util/HashMap;
      10: aload_1
      11: invokevirtual #46                 // Method java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      14: pop
      15: aload_2
      16: areturn

  public boolean c(K);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Ljava/util/HashMap;
       4: aload_1
       5: invokevirtual #52                 // Method java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
       8: ireturn

  public java.util.Map$Entry<K, V> d(K);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #57                 // Method c:(Ljava/lang/Object;)Z
       5: ifeq          23
       8: aload_0
       9: getfield      #17                 // Field a:Ljava/util/HashMap;
      12: aload_1
      13: invokevirtual #23                 // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      16: checkcast     #25                 // class android/arch/a/b/b$c
      19: getfield      #60                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
      22: areturn
      23: aconst_null
      24: areturn
}
