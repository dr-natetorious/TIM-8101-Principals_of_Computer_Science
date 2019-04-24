class android.arch.a.b.b$c<K, V> implements java.util.Map$Entry<K, V> {
  final K a;

  final V b;

  android.arch.a.b.b$c<K, V> c;

  android.arch.a.b.b$c<K, V> d;

  android.arch.a.b.b$c(K, V);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #25                 // Field a:Ljava/lang/Object;
       9: aload_0
      10: aload_2
      11: putfield      #27                 // Field b:Ljava/lang/Object;
      14: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class android/arch/a/b/b$c
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_1
      17: checkcast     #2                  // class android/arch/a/b/b$c
      20: astore_1
      21: aload_0
      22: getfield      #25                 // Field a:Ljava/lang/Object;
      25: aload_1
      26: getfield      #25                 // Field a:Ljava/lang/Object;
      29: invokevirtual #34                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      32: ifeq          51
      35: aload_0
      36: getfield      #27                 // Field b:Ljava/lang/Object;
      39: aload_1
      40: getfield      #27                 // Field b:Ljava/lang/Object;
      43: invokevirtual #34                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      46: ifeq          51
      49: iconst_1
      50: ireturn
      51: iconst_0
      52: ireturn

  public K getKey();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Ljava/lang/Object;
       4: areturn

  public V getValue();
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Ljava/lang/Object;
       4: areturn

  public V setValue(V);
    Code:
       0: new           #43                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #45                 // String An entry modification is not supported
       6: invokespecial #48                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow

  public java.lang.String toString();
    Code:
       0: new           #53                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #54                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #25                 // Field a:Ljava/lang/Object;
      13: invokevirtual #58                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #60                 // String =
      20: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #27                 // Field b:Ljava/lang/Object;
      29: invokevirtual #58                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: invokevirtual #65                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      37: areturn
}
