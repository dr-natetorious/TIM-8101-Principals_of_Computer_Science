class com.google.common.a.g$b extends com.google.common.a.p$a<K> {
  final com.google.common.a.g a;

  com.google.common.a.g$b(com.google.common.a.g);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lcom/google/common/a/g;
       5: aload_0
       6: invokespecial #17                 // Method com/google/common/a/p$a."<init>":()V
       9: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lcom/google/common/a/g;
       4: aload_1
       5: invokevirtual #22                 // Method com/google/common/a/g.a:(Ljava/lang/Object;)Z
       8: ireturn

  public java.util.Iterator<K> iterator();
    Code:
       0: new           #26                 // class com/google/common/a/g$c
       3: dup
       4: aload_0
       5: getfield      #14                 // Field a:Lcom/google/common/a/g;
       8: aconst_null
       9: invokespecial #29                 // Method com/google/common/a/g$c."<init>":(Lcom/google/common/a/g;Lcom/google/common/a/g$1;)V
      12: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lcom/google/common/a/g;
       4: aload_1
       5: invokevirtual #35                 // Method com/google/common/a/g.b:(Ljava/lang/Object;)Ljava/util/List;
       8: invokeinterface #41,  1           // InterfaceMethod java/util/List.isEmpty:()Z
      13: iconst_1
      14: ixor
      15: ireturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lcom/google/common/a/g;
       4: invokestatic  #47                 // Method com/google/common/a/g.d:(Lcom/google/common/a/g;)Ljava/util/Map;
       7: invokeinterface #51,  1           // InterfaceMethod java/util/Map.size:()I
      12: ireturn
}
