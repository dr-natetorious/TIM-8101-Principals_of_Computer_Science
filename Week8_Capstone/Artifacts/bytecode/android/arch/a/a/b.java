public class android.arch.a.a.b extends android.arch.a.a.c {
  public android.arch.a.a.b();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/arch/a/a/c."<init>":()V
       4: aload_0
       5: new           #16                 // class java/lang/Object
       8: dup
       9: invokespecial #17                 // Method java/lang/Object."<init>":()V
      12: putfield      #19                 // Field a:Ljava/lang/Object;
      15: aload_0
      16: iconst_2
      17: invokestatic  #25                 // Method java/util/concurrent/Executors.newFixedThreadPool:(I)Ljava/util/concurrent/ExecutorService;
      20: putfield      #27                 // Field b:Ljava/util/concurrent/ExecutorService;
      23: return

  public void a(java.lang.Runnable);
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Ljava/util/concurrent/ExecutorService;
       4: aload_1
       5: invokeinterface #34,  2           // InterfaceMethod java/util/concurrent/ExecutorService.execute:(Ljava/lang/Runnable;)V
      10: return

  public void b(java.lang.Runnable);
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:Landroid/os/Handler;
       4: ifnonnull     45
       7: aload_0
       8: getfield      #19                 // Field a:Ljava/lang/Object;
      11: astore_2
      12: aload_2
      13: monitorenter
      14: aload_0
      15: getfield      #36                 // Field c:Landroid/os/Handler;
      18: ifnonnull     35
      21: aload_0
      22: new           #38                 // class android/os/Handler
      25: dup
      26: invokestatic  #44                 // Method android/os/Looper.getMainLooper:()Landroid/os/Looper;
      29: invokespecial #47                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
      32: putfield      #36                 // Field c:Landroid/os/Handler;
      35: aload_2
      36: monitorexit
      37: goto          45
      40: astore_1
      41: aload_2
      42: monitorexit
      43: aload_1
      44: athrow
      45: aload_0
      46: getfield      #36                 // Field c:Landroid/os/Handler;
      49: aload_1
      50: invokevirtual #51                 // Method android/os/Handler.post:(Ljava/lang/Runnable;)Z
      53: pop
      54: return
    Exception table:
       from    to  target type
          14    35    40   any
          35    37    40   any
          41    43    40   any

  public boolean b();
    Code:
       0: invokestatic  #44                 // Method android/os/Looper.getMainLooper:()Landroid/os/Looper;
       3: invokevirtual #56                 // Method android/os/Looper.getThread:()Ljava/lang/Thread;
       6: invokestatic  #61                 // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
       9: if_acmpne     14
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn
}
