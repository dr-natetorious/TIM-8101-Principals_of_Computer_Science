public class android.support.v4.g.k$b<T> implements android.support.v4.g.k$a<T> {
  public android.support.v4.g.k$b(int);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: iload_1
       5: ifgt          18
       8: new           #20                 // class java/lang/IllegalArgumentException
      11: dup
      12: ldc           #22                 // String The max pool size must be > 0
      14: invokespecial #25                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: iload_1
      20: anewarray     #5                  // class java/lang/Object
      23: putfield      #27                 // Field a:[Ljava/lang/Object;
      26: return

  public T a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:I
       4: ifle          40
       7: aload_0
       8: getfield      #31                 // Field b:I
      11: iconst_1
      12: isub
      13: istore_1
      14: aload_0
      15: getfield      #27                 // Field a:[Ljava/lang/Object;
      18: iload_1
      19: aaload
      20: astore_2
      21: aload_0
      22: getfield      #27                 // Field a:[Ljava/lang/Object;
      25: iload_1
      26: aconst_null
      27: aastore
      28: aload_0
      29: aload_0
      30: getfield      #31                 // Field b:I
      33: iconst_1
      34: isub
      35: putfield      #31                 // Field b:I
      38: aload_2
      39: areturn
      40: aconst_null
      41: areturn

  public boolean a(T);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #37                 // Method b:(Ljava/lang/Object;)Z
       5: ifeq          18
       8: new           #39                 // class java/lang/IllegalStateException
      11: dup
      12: ldc           #41                 // String Already in the pool!
      14: invokespecial #42                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: getfield      #31                 // Field b:I
      22: aload_0
      23: getfield      #27                 // Field a:[Ljava/lang/Object;
      26: arraylength
      27: if_icmpge     52
      30: aload_0
      31: getfield      #27                 // Field a:[Ljava/lang/Object;
      34: aload_0
      35: getfield      #31                 // Field b:I
      38: aload_1
      39: aastore
      40: aload_0
      41: aload_0
      42: getfield      #31                 // Field b:I
      45: iconst_1
      46: iadd
      47: putfield      #31                 // Field b:I
      50: iconst_1
      51: ireturn
      52: iconst_0
      53: ireturn
}
