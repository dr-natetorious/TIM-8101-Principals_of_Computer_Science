public class android.support.v4.g.k$c<T> extends android.support.v4.g.k$b<T> {
  public android.support.v4.g.k$c(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #14                 // Method android/support/v4/g/k$b."<init>":(I)V
       5: aload_0
       6: new           #16                 // class java/lang/Object
       9: dup
      10: invokespecial #19                 // Method java/lang/Object."<init>":()V
      13: putfield      #21                 // Field a:Ljava/lang/Object;
      16: return

  public T a();
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Ljava/lang/Object;
       4: astore_1
       5: aload_1
       6: monitorenter
       7: aload_0
       8: invokespecial #25                 // Method android/support/v4/g/k$b.a:()Ljava/lang/Object;
      11: astore_2
      12: aload_1
      13: monitorexit
      14: aload_2
      15: areturn
      16: astore_2
      17: aload_1
      18: monitorexit
      19: aload_2
      20: athrow
    Exception table:
       from    to  target type
           7    14    16   any
          17    19    16   any

  public boolean a(T);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Ljava/lang/Object;
       4: astore_3
       5: aload_3
       6: monitorenter
       7: aload_0
       8: aload_1
       9: invokespecial #30                 // Method android/support/v4/g/k$b.a:(Ljava/lang/Object;)Z
      12: istore_2
      13: aload_3
      14: monitorexit
      15: iload_2
      16: ireturn
      17: astore_1
      18: aload_3
      19: monitorexit
      20: aload_1
      21: athrow
    Exception table:
       from    to  target type
           7    15    17   any
          18    20    17   any
}
