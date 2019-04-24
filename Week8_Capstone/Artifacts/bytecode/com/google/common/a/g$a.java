class com.google.common.a.g$a extends java.util.AbstractSequentialList<java.util.Map$Entry<K, V>> {
  final com.google.common.a.g a;

  com.google.common.a.g$a(com.google.common.a.g);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Lcom/google/common/a/g;
       5: aload_0
       6: invokespecial #16                 // Method java/util/AbstractSequentialList."<init>":()V
       9: return

  public java.util.ListIterator<java.util.Map$Entry<K, V>> listIterator(int);
    Code:
       0: new           #21                 // class com/google/common/a/g$f
       3: dup
       4: aload_0
       5: getfield      #13                 // Field a:Lcom/google/common/a/g;
       8: iload_1
       9: invokespecial #24                 // Method com/google/common/a/g$f."<init>":(Lcom/google/common/a/g;I)V
      12: areturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Lcom/google/common/a/g;
       4: invokestatic  #32                 // Method com/google/common/a/g.e:(Lcom/google/common/a/g;)I
       7: ireturn
}
