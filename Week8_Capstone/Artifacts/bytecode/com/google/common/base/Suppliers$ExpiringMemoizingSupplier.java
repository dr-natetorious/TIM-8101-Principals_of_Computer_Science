class com.google.common.base.Suppliers$ExpiringMemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
  final com.google.common.base.Supplier<T> delegate;

  final long durationNanos;

  volatile transient long expirationNanos;

  volatile transient T value;

  com.google.common.base.Suppliers$ExpiringMemoizingSupplier(com.google.common.base.Supplier<T>, long, java.util.concurrent.TimeUnit);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #35                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #7                  // class com/google/common/base/Supplier
      12: putfield      #37                 // Field delegate:Lcom/google/common/base/Supplier;
      15: aload_0
      16: aload         4
      18: lload_2
      19: invokevirtual #43                 // Method java/util/concurrent/TimeUnit.toNanos:(J)J
      22: putfield      #45                 // Field durationNanos:J
      25: lload_2
      26: lconst_0
      27: lcmp
      28: ifle          37
      31: iconst_1
      32: istore        5
      34: goto          40
      37: iconst_0
      38: istore        5
      40: iload         5
      42: invokestatic  #49                 // Method com/google/common/base/Preconditions.checkArgument:(Z)V
      45: return

  public T get();
    Code:
       0: aload_0
       1: getfield      #56                 // Field expirationNanos:J
       4: lstore_1
       5: invokestatic  #62                 // Method com/google/common/base/Platform.systemNanoTime:()J
       8: lstore_3
       9: lload_1
      10: lconst_0
      11: lcmp
      12: ifeq          23
      15: lload_3
      16: lload_1
      17: lsub
      18: lconst_0
      19: lcmp
      20: iflt          80
      23: aload_0
      24: monitorenter
      25: lload_1
      26: aload_0
      27: getfield      #56                 // Field expirationNanos:J
      30: lcmp
      31: ifne          78
      34: aload_0
      35: getfield      #37                 // Field delegate:Lcom/google/common/base/Supplier;
      38: invokeinterface #64,  1           // InterfaceMethod com/google/common/base/Supplier.get:()Ljava/lang/Object;
      43: astore        5
      45: aload_0
      46: aload         5
      48: putfield      #66                 // Field value:Ljava/lang/Object;
      51: lload_3
      52: aload_0
      53: getfield      #45                 // Field durationNanos:J
      56: ladd
      57: lstore_3
      58: lload_3
      59: lstore_1
      60: lload_3
      61: lconst_0
      62: lcmp
      63: ifne          68
      66: lconst_1
      67: lstore_1
      68: aload_0
      69: lload_1
      70: putfield      #56                 // Field expirationNanos:J
      73: aload_0
      74: monitorexit
      75: aload         5
      77: areturn
      78: aload_0
      79: monitorexit
      80: aload_0
      81: getfield      #66                 // Field value:Ljava/lang/Object;
      84: areturn
      85: astore        5
      87: aload_0
      88: monitorexit
      89: aload         5
      91: athrow
    Exception table:
       from    to  target type
          25    58    85   any
          68    75    85   any
          78    80    85   any
          87    89    85   any

  public java.lang.String toString();
    Code:
       0: new           #71                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #72                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #74                 // String Suppliers.memoizeWithExpiration(
      11: invokevirtual #78                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #37                 // Field delegate:Lcom/google/common/base/Supplier;
      20: invokevirtual #81                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #83                 // String ,
      27: invokevirtual #78                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #45                 // Field durationNanos:J
      36: invokevirtual #86                 // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #88                 // String , NANOS)
      43: invokevirtual #78                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #90                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
