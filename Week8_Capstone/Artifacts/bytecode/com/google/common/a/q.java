abstract class com.google.common.a.q<F, T> implements java.util.Iterator<T> {
  final java.util.Iterator<? extends F> b;

  com.google.common.a.q(java.util.Iterator<? extends F>);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #21                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #7                  // class java/util/Iterator
      12: putfield      #23                 // Field b:Ljava/util/Iterator;
      15: return

  abstract T a(F);

  public final boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Ljava/util/Iterator;
       4: invokeinterface #31,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       9: ireturn

  public final T next();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #23                 // Field b:Ljava/util/Iterator;
       5: invokeinterface #35,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      10: invokevirtual #37                 // Method a:(Ljava/lang/Object;)Ljava/lang/Object;
      13: areturn

  public final void remove();
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Ljava/util/Iterator;
       4: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.remove:()V
       9: return
}
