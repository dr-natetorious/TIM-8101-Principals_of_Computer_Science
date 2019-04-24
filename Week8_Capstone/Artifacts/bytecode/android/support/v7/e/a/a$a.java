public final class android.support.v7.e.a.a$a<T> {
  static {};
    Code:
       0: new           #5                  // class java/lang/Object
       3: dup
       4: invokespecial #24                 // Method java/lang/Object."<init>":()V
       7: putstatic     #26                 // Field d:Ljava/lang/Object;
      10: new           #10                 // class android/support/v7/e/a/a$a$a
      13: dup
      14: aconst_null
      15: invokespecial #29                 // Method android/support/v7/e/a/a$a$a."<init>":(Landroid/support/v7/e/a/a$1;)V
      18: putstatic     #31                 // Field f:Ljava/util/concurrent/Executor;
      21: return

  public android.support.v7.e.a.a$a(android.support.v7.g.c$c<T>);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #35                 // Field c:Landroid/support/v7/g/c$c;
       9: return

  public android.support.v7.e.a.a<T> a();
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Ljava/util/concurrent/Executor;
       4: ifnonnull     14
       7: aload_0
       8: getstatic     #31                 // Field f:Ljava/util/concurrent/Executor;
      11: putfield      #40                 // Field a:Ljava/util/concurrent/Executor;
      14: aload_0
      15: getfield      #42                 // Field b:Ljava/util/concurrent/Executor;
      18: ifnonnull     57
      21: getstatic     #26                 // Field d:Ljava/lang/Object;
      24: astore_1
      25: aload_1
      26: monitorenter
      27: getstatic     #44                 // Field e:Ljava/util/concurrent/Executor;
      30: ifnonnull     40
      33: iconst_2
      34: invokestatic  #50                 // Method java/util/concurrent/Executors.newFixedThreadPool:(I)Ljava/util/concurrent/ExecutorService;
      37: putstatic     #44                 // Field e:Ljava/util/concurrent/Executor;
      40: aload_1
      41: monitorexit
      42: aload_0
      43: getstatic     #44                 // Field e:Ljava/util/concurrent/Executor;
      46: putfield      #42                 // Field b:Ljava/util/concurrent/Executor;
      49: goto          57
      52: astore_2
      53: aload_1
      54: monitorexit
      55: aload_2
      56: athrow
      57: new           #7                  // class android/support/v7/e/a/a
      60: dup
      61: aload_0
      62: getfield      #40                 // Field a:Ljava/util/concurrent/Executor;
      65: aload_0
      66: getfield      #42                 // Field b:Ljava/util/concurrent/Executor;
      69: aload_0
      70: getfield      #35                 // Field c:Landroid/support/v7/g/c$c;
      73: aconst_null
      74: invokespecial #53                 // Method android/support/v7/e/a/a."<init>":(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/support/v7/g/c$c;Landroid/support/v7/e/a/a$1;)V
      77: areturn
    Exception table:
       from    to  target type
          27    40    52   any
          40    42    52   any
          53    55    52   any
}
