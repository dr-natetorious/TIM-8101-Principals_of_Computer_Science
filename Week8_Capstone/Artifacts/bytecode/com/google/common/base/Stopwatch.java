public final class com.google.common.base.Stopwatch {
  com.google.common.base.Stopwatch();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: invokestatic  #23                 // Method com/google/common/base/Ticker.systemTicker:()Lcom/google/common/base/Ticker;
       8: putfield      #25                 // Field ticker:Lcom/google/common/base/Ticker;
      11: return

  com.google.common.base.Stopwatch(com.google.common.base.Ticker);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: ldc           #28                 // String ticker
       8: invokestatic  #34                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      11: checkcast     #19                 // class com/google/common/base/Ticker
      14: putfield      #25                 // Field ticker:Lcom/google/common/base/Ticker;
      17: return

  public static com.google.common.base.Stopwatch createStarted();
    Code:
       0: new           #2                  // class com/google/common/base/Stopwatch
       3: dup
       4: invokespecial #94                 // Method "<init>":()V
       7: invokevirtual #97                 // Method start:()Lcom/google/common/base/Stopwatch;
      10: areturn

  public static com.google.common.base.Stopwatch createStarted(com.google.common.base.Ticker);
    Code:
       0: new           #2                  // class com/google/common/base/Stopwatch
       3: dup
       4: aload_0
       5: invokespecial #100                // Method "<init>":(Lcom/google/common/base/Ticker;)V
       8: invokevirtual #97                 // Method start:()Lcom/google/common/base/Stopwatch;
      11: areturn

  public static com.google.common.base.Stopwatch createUnstarted();
    Code:
       0: new           #2                  // class com/google/common/base/Stopwatch
       3: dup
       4: invokespecial #94                 // Method "<init>":()V
       7: areturn

  public static com.google.common.base.Stopwatch createUnstarted(com.google.common.base.Ticker);
    Code:
       0: new           #2                  // class com/google/common/base/Stopwatch
       3: dup
       4: aload_0
       5: invokespecial #100                // Method "<init>":(Lcom/google/common/base/Ticker;)V
       8: areturn

  public long elapsed(java.util.concurrent.TimeUnit);
    Code:
       0: aload_1
       1: aload_0
       2: invokespecial #115                // Method elapsedNanos:()J
       5: getstatic     #72                 // Field java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
       8: invokevirtual #76                 // Method java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
      11: lreturn

  public boolean isRunning();
    Code:
       0: aload_0
       1: getfield      #104                // Field isRunning:Z
       4: ireturn

  public com.google.common.base.Stopwatch reset();
    Code:
       0: aload_0
       1: lconst_0
       2: putfield      #111                // Field elapsedNanos:J
       5: aload_0
       6: iconst_0
       7: putfield      #104                // Field isRunning:Z
      10: aload_0
      11: areturn

  public com.google.common.base.Stopwatch start();
    Code:
       0: aload_0
       1: getfield      #104                // Field isRunning:Z
       4: iconst_1
       5: ixor
       6: ldc           #121                // String This stopwatch is already running.
       8: invokestatic  #125                // Method com/google/common/base/Preconditions.checkState:(ZLjava/lang/Object;)V
      11: aload_0
      12: iconst_1
      13: putfield      #104                // Field isRunning:Z
      16: aload_0
      17: aload_0
      18: getfield      #25                 // Field ticker:Lcom/google/common/base/Ticker;
      21: invokevirtual #107                // Method com/google/common/base/Ticker.read:()J
      24: putfield      #109                // Field startTick:J
      27: aload_0
      28: areturn

  public com.google.common.base.Stopwatch stop();
    Code:
       0: aload_0
       1: getfield      #25                 // Field ticker:Lcom/google/common/base/Ticker;
       4: invokevirtual #107                // Method com/google/common/base/Ticker.read:()J
       7: lstore_1
       8: aload_0
       9: getfield      #104                // Field isRunning:Z
      12: ldc           #128                // String This stopwatch is already stopped.
      14: invokestatic  #125                // Method com/google/common/base/Preconditions.checkState:(ZLjava/lang/Object;)V
      17: aload_0
      18: iconst_0
      19: putfield      #104                // Field isRunning:Z
      22: aload_0
      23: aload_0
      24: getfield      #111                // Field elapsedNanos:J
      27: lload_1
      28: aload_0
      29: getfield      #109                // Field startTick:J
      32: lsub
      33: ladd
      34: putfield      #111                // Field elapsedNanos:J
      37: aload_0
      38: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokespecial #115                // Method elapsedNanos:()J
       4: lstore_3
       5: lload_3
       6: invokestatic  #132                // Method chooseUnit:(J)Ljava/util/concurrent/TimeUnit;
       9: astore        5
      11: lload_3
      12: l2d
      13: getstatic     #72                 // Field java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
      16: lconst_1
      17: aload         5
      19: invokevirtual #76                 // Method java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
      22: l2d
      23: ddiv
      24: dstore_1
      25: new           #134                // class java/lang/StringBuilder
      28: dup
      29: invokespecial #135                // Method java/lang/StringBuilder."<init>":()V
      32: astore        6
      34: aload         6
      36: dload_1
      37: invokestatic  #141                // Method com/google/common/base/Platform.formatCompact4Digits:(D)Ljava/lang/String;
      40: invokevirtual #145                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      43: pop
      44: aload         6
      46: ldc           #147                // String
      48: invokevirtual #145                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload         6
      54: aload         5
      56: invokestatic  #149                // Method abbreviate:(Ljava/util/concurrent/TimeUnit;)Ljava/lang/String;
      59: invokevirtual #145                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload         6
      65: invokevirtual #151                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      68: areturn
}
