class android.arch.a.b.b$d implements android.arch.a.b.b$f<K, V>, java.util.Iterator<java.util.Map$Entry<K, V>> {
  final android.arch.a.b.b a;

  android.arch.a.b.b$d(android.arch.a.b.b, android.arch.a.b.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #32                 // Method "<init>":(Landroid/arch/a/b/b;)V
       5: return

  public java.util.Map$Entry<K, V> a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field c:Z
       4: ifeq          28
       7: aload_0
       8: iconst_0
       9: putfield      #28                 // Field c:Z
      12: aload_0
      13: getfield      #23                 // Field a:Landroid/arch/a/b/b;
      16: invokestatic  #36                 // Method android/arch/a/b/b.a:(Landroid/arch/a/b/b;)Landroid/arch/a/b/b$c;
      19: astore_1
      20: aload_0
      21: aload_1
      22: putfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      25: goto          51
      28: aload_0
      29: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      32: ifnull        46
      35: aload_0
      36: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      39: getfield      #42                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
      42: astore_1
      43: goto          20
      46: aconst_null
      47: astore_1
      48: goto          20
      51: aload_0
      52: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      55: areturn

  public void a_(android.arch.a.b.b$c<K, V>);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
       5: if_acmpne     38
       8: aload_0
       9: aload_0
      10: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      13: getfield      #48                 // Field android/arch/a/b/b$c.d:Landroid/arch/a/b/b$c;
      16: putfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      19: aload_0
      20: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      23: ifnonnull     31
      26: iconst_1
      27: istore_2
      28: goto          33
      31: iconst_0
      32: istore_2
      33: aload_0
      34: iload_2
      35: putfield      #28                 // Field c:Z
      38: return

  public boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #28                 // Field c:Z
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iconst_0
       8: istore_1
       9: iload_3
      10: ifeq          27
      13: aload_0
      14: getfield      #23                 // Field a:Landroid/arch/a/b/b;
      17: invokestatic  #36                 // Method android/arch/a/b/b.a:(Landroid/arch/a/b/b;)Landroid/arch/a/b/b$c;
      20: ifnull        25
      23: iconst_1
      24: istore_1
      25: iload_1
      26: ireturn
      27: iload_2
      28: istore_1
      29: aload_0
      30: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      33: ifnull        50
      36: iload_2
      37: istore_1
      38: aload_0
      39: getfield      #38                 // Field b:Landroid/arch/a/b/b$c;
      42: getfield      #42                 // Field android/arch/a/b/b$c.c:Landroid/arch/a/b/b$c;
      45: ifnull        50
      48: iconst_1
      49: istore_1
      50: iload_1
      51: ireturn

  public java.lang.Object next();
    Code:
       0: aload_0
       1: invokevirtual #55                 // Method a:()Ljava/util/Map$Entry;
       4: areturn
}
