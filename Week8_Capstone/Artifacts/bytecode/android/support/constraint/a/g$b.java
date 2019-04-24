class android.support.constraint.a.g$b<T> implements android.support.constraint.a.g$a<T> {
  android.support.constraint.a.g$b(int);
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

  public void a(T[], int);
    Code:
       0: iload_2
       1: istore_3
       2: iload_2
       3: aload_1
       4: arraylength
       5: if_icmple     11
       8: aload_1
       9: arraylength
      10: istore_3
      11: iconst_0
      12: istore_2
      13: iload_2
      14: iload_3
      15: if_icmpge     63
      18: aload_1
      19: iload_2
      20: aaload
      21: astore        4
      23: aload_0
      24: getfield      #31                 // Field b:I
      27: aload_0
      28: getfield      #27                 // Field a:[Ljava/lang/Object;
      31: arraylength
      32: if_icmpge     56
      35: aload_0
      36: getfield      #27                 // Field a:[Ljava/lang/Object;
      39: aload_0
      40: getfield      #31                 // Field b:I
      43: aload         4
      45: aastore
      46: aload_0
      47: aload_0
      48: getfield      #31                 // Field b:I
      51: iconst_1
      52: iadd
      53: putfield      #31                 // Field b:I
      56: iload_2
      57: iconst_1
      58: iadd
      59: istore_2
      60: goto          13
      63: return

  public boolean a(T);
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:I
       4: aload_0
       5: getfield      #27                 // Field a:[Ljava/lang/Object;
       8: arraylength
       9: if_icmpge     34
      12: aload_0
      13: getfield      #27                 // Field a:[Ljava/lang/Object;
      16: aload_0
      17: getfield      #31                 // Field b:I
      20: aload_1
      21: aastore
      22: aload_0
      23: aload_0
      24: getfield      #31                 // Field b:I
      27: iconst_1
      28: iadd
      29: putfield      #31                 // Field b:I
      32: iconst_1
      33: ireturn
      34: iconst_0
      35: ireturn
}
