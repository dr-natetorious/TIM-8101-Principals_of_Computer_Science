abstract class android.arch.a.b.b$e<K, V> implements android.arch.a.b.b$f<K, V>, java.util.Iterator<java.util.Map$Entry<K, V>> {
  android.arch.a.b.b$c<K, V> a;

  android.arch.a.b.b$c<K, V> b;

  android.arch.a.b.b$e(android.arch.a.b.b$c<K, V>, android.arch.a.b.b$c<K, V>);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_2
       6: putfield      #23                 // Field a:Landroid/arch/a/b/b$c;
       9: aload_0
      10: aload_1
      11: putfield      #25                 // Field b:Landroid/arch/a/b/b$c;
      14: return

  abstract android.arch.a.b.b$c<K, V> a(android.arch.a.b.b$c<K, V>);

  public java.util.Map$Entry<K, V> a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/arch/a/b/b$c;
       4: astore_1
       5: aload_0
       6: aload_0
       7: invokespecial #36                 // Method b:()Landroid/arch/a/b/b$c;
      10: putfield      #25                 // Field b:Landroid/arch/a/b/b$c;
      13: aload_1
      14: areturn

  public void a_(android.arch.a.b.b$c<K, V>);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/arch/a/b/b$c;
       4: aload_1
       5: if_acmpne     26
       8: aload_1
       9: aload_0
      10: getfield      #25                 // Field b:Landroid/arch/a/b/b$c;
      13: if_acmpne     26
      16: aload_0
      17: aconst_null
      18: putfield      #25                 // Field b:Landroid/arch/a/b/b$c;
      21: aload_0
      22: aconst_null
      23: putfield      #23                 // Field a:Landroid/arch/a/b/b$c;
      26: aload_0
      27: getfield      #23                 // Field a:Landroid/arch/a/b/b$c;
      30: aload_1
      31: if_acmpne     46
      34: aload_0
      35: aload_0
      36: aload_0
      37: getfield      #23                 // Field a:Landroid/arch/a/b/b$c;
      40: invokevirtual #41                 // Method b:(Landroid/arch/a/b/b$c;)Landroid/arch/a/b/b$c;
      43: putfield      #23                 // Field a:Landroid/arch/a/b/b$c;
      46: aload_0
      47: getfield      #25                 // Field b:Landroid/arch/a/b/b$c;
      50: aload_1
      51: if_acmpne     62
      54: aload_0
      55: aload_0
      56: invokespecial #36                 // Method b:()Landroid/arch/a/b/b$c;
      59: putfield      #25                 // Field b:Landroid/arch/a/b/b$c;
      62: return

  abstract android.arch.a.b.b$c<K, V> b(android.arch.a.b.b$c<K, V>);

  public boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/arch/a/b/b$c;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public java.lang.Object next();
    Code:
       0: aload_0
       1: invokevirtual #48                 // Method a:()Ljava/util/Map$Entry;
       4: areturn
}
