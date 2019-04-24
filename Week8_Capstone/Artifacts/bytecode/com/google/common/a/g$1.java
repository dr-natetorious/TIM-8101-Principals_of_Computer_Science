class com.google.common.a.g$1 extends java.util.AbstractSequentialList<V> {
  final java.lang.Object a;

  final com.google.common.a.g b;

  com.google.common.a.g$1(com.google.common.a.g, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Lcom/google/common/a/g;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field a:Ljava/lang/Object;
      10: aload_0
      11: invokespecial #23                 // Method java/util/AbstractSequentialList."<init>":()V
      14: return

  public java.util.ListIterator<V> listIterator(int);
    Code:
       0: new           #28                 // class com/google/common/a/g$g
       3: dup
       4: aload_0
       5: getfield      #18                 // Field b:Lcom/google/common/a/g;
       8: aload_0
       9: getfield      #20                 // Field a:Ljava/lang/Object;
      12: iload_1
      13: invokespecial #31                 // Method com/google/common/a/g$g."<init>":(Lcom/google/common/a/g;Ljava/lang/Object;I)V
      16: areturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #18                 // Field b:Lcom/google/common/a/g;
       4: invokestatic  #39                 // Method com/google/common/a/g.d:(Lcom/google/common/a/g;)Ljava/util/Map;
       7: aload_0
       8: getfield      #20                 // Field a:Ljava/lang/Object;
      11: invokeinterface #45,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      16: checkcast     #47                 // class com/google/common/a/g$d
      19: astore_1
      20: aload_1
      21: ifnonnull     26
      24: iconst_0
      25: ireturn
      26: aload_1
      27: getfield      #50                 // Field com/google/common/a/g$d.c:I
      30: ireturn
}
