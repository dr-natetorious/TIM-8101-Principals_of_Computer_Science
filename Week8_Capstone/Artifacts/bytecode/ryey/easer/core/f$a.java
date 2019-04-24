class ryey.easer.core.f$a {
  java.util.concurrent.locks.Lock a;

  java.util.List<java.util.concurrent.Callable<java.lang.Void>> b;

  ryey.easer.core.f$a();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #23                 // class java/util/concurrent/atomic/AtomicBoolean
       8: dup
       9: iconst_0
      10: invokespecial #26                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
      13: putfield      #28                 // Field c:Ljava/util/concurrent/atomic/AtomicBoolean;
      16: aload_0
      17: new           #30                 // class java/util/concurrent/locks/ReentrantLock
      20: dup
      21: invokespecial #31                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
      24: putfield      #33                 // Field a:Ljava/util/concurrent/locks/Lock;
      27: aload_0
      28: new           #35                 // class java/util/ArrayList
      31: dup
      32: invokespecial #36                 // Method java/util/ArrayList."<init>":()V
      35: putfield      #38                 // Field b:Ljava/util/List;
      38: aload_0
      39: new           #9                  // class ryey/easer/core/f$a$1
      42: dup
      43: aload_0
      44: invokespecial #41                 // Method ryey/easer/core/f$a$1."<init>":(Lryey/easer/core/f$a;)V
      47: putfield      #43                 // Field d:Lryey/easer/core/f$c;
      50: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field c:Ljava/util/concurrent/atomic/AtomicBoolean;
       4: iconst_0
       5: invokevirtual #47                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
       8: return

  public void a(android.os.Messenger);
    Code:
       0: aload_0
       1: getfield      #28                 // Field c:Ljava/util/concurrent/atomic/AtomicBoolean;
       4: iconst_1
       5: invokevirtual #47                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
       8: aload_0
       9: getfield      #43                 // Field d:Lryey/easer/core/f$c;
      12: aload_1
      13: invokeinterface #52,  2           // InterfaceMethod ryey/easer/core/f$c.a:(Landroid/os/Messenger;)V
      18: return

  public void a(java.util.concurrent.Callable<java.lang.Void>);
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Ljava/util/concurrent/locks/Lock;
       4: invokeinterface #60,  1           // InterfaceMethod java/util/concurrent/locks/Lock.lock:()V
       9: aload_0
      10: getfield      #28                 // Field c:Ljava/util/concurrent/atomic/AtomicBoolean;
      13: invokevirtual #64                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
      16: istore_2
      17: iload_2
      18: ifeq          39
      21: aload_1
      22: invokeinterface #70,  1           // InterfaceMethod java/util/concurrent/Callable.call:()Ljava/lang/Object;
      27: pop
      28: goto          50
      31: astore_1
      32: aload_1
      33: invokestatic  #75                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      36: goto          50
      39: aload_0
      40: getfield      #38                 // Field b:Ljava/util/List;
      43: aload_1
      44: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      49: pop
      50: aload_0
      51: getfield      #33                 // Field a:Ljava/util/concurrent/locks/Lock;
      54: invokeinterface #84,  1           // InterfaceMethod java/util/concurrent/locks/Lock.unlock:()V
      59: return
      60: astore_1
      61: aload_0
      62: getfield      #33                 // Field a:Ljava/util/concurrent/locks/Lock;
      65: invokeinterface #84,  1           // InterfaceMethod java/util/concurrent/locks/Lock.unlock:()V
      70: aload_1
      71: athrow
    Exception table:
       from    to  target type
           9    17    60   any
          21    28    31   Class java/lang/Exception
          21    28    60   any
          32    36    60   any
          39    50    60   any
}
