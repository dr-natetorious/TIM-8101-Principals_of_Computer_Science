final class com.google.common.base.Optional$1 implements java.lang.Iterable<T> {
  final java.lang.Iterable val$optionals;

  com.google.common.base.Optional$1(java.lang.Iterable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field val$optionals:Ljava/lang/Iterable;
       5: aload_0
       6: invokespecial #23                 // Method java/lang/Object."<init>":()V
       9: return

  public java.util.Iterator<T> iterator();
    Code:
       0: new           #14                 // class com/google/common/base/Optional$1$1
       3: dup
       4: aload_0
       5: invokespecial #29                 // Method com/google/common/base/Optional$1$1."<init>":(Lcom/google/common/base/Optional$1;)V
       8: areturn
}
