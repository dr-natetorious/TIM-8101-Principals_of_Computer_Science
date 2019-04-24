abstract class com.google.common.a.p$a<E> extends java.util.AbstractSet<E> {
  com.google.common.a.p$a();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/util/AbstractSet."<init>":()V
       4: return

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #18                 // Method com/google/common/a/p.a:(Ljava/util/Set;Ljava/util/Collection;)Z
       5: ireturn

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #27                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       5: checkcast     #29                 // class java/util/Collection
       8: invokespecial #31                 // Method java/util/AbstractSet.retainAll:(Ljava/util/Collection;)Z
      11: ireturn
}
