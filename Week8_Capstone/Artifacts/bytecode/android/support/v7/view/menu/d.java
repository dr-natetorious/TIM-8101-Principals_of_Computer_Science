class android.support.v7.view.menu.d<T> {
  final T b;

  android.support.v7.view.menu.d(T);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_1
       5: ifnonnull     18
       8: new           #15                 // class java/lang/IllegalArgumentException
      11: dup
      12: ldc           #17                 // String Wrapped Object can not be null.
      14: invokespecial #20                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: putfield      #22                 // Field b:Ljava/lang/Object;
      23: return
}
