public final class com.google.common.a.f {
  public static <F, T> java.util.Iterator<T> a(java.util.Iterator<F>, com.google.common.base.Function<? super F, ? extends T>);
    Code:
       0: aload_1
       1: invokestatic  #14                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: new           #6                  // class com/google/common/a/f$1
       8: dup
       9: aload_0
      10: aload_1
      11: invokespecial #18                 // Method com/google/common/a/f$1."<init>":(Ljava/util/Iterator;Lcom/google/common/base/Function;)V
      14: areturn

  static void a(java.util.Iterator<?>);
    Code:
       0: aload_0
       1: invokestatic  #14                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: invokeinterface #28,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      11: ifeq          30
      14: aload_0
      15: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      20: pop
      21: aload_0
      22: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.remove:()V
      27: goto          5
      30: return

  public static <T> boolean a(java.util.Collection<T>, java.util.Iterator<? extends T>);
    Code:
       0: aload_0
       1: invokestatic  #14                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: invokestatic  #14                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: iconst_0
      11: istore_2
      12: aload_1
      13: invokeinterface #28,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      18: ifeq          39
      21: iload_2
      22: aload_0
      23: aload_1
      24: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      29: invokeinterface #45,  2           // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
      34: ior
      35: istore_2
      36: goto          12
      39: iload_2
      40: ireturn

  public static boolean a(java.util.Iterator<?>, java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokestatic  #14                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: iconst_0
       6: istore_2
       7: aload_0
       8: invokeinterface #28,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      13: ifeq          42
      16: aload_1
      17: aload_0
      18: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: invokeinterface #51,  2           // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      28: ifeq          7
      31: aload_0
      32: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.remove:()V
      37: iconst_1
      38: istore_2
      39: goto          7
      42: iload_2
      43: ireturn
}
