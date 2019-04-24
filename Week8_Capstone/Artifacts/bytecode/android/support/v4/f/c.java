public class android.support.v4.f.c {
  public android.support.v4.f.c(java.lang.String, int, int);
    Code:
       0: aload_0
       1: invokespecial #33                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #4                  // class java/lang/Object
       8: dup
       9: invokespecial #33                 // Method java/lang/Object."<init>":()V
      12: putfield      #35                 // Field a:Ljava/lang/Object;
      15: aload_0
      16: new           #6                  // class android/support/v4/f/c$1
      19: dup
      20: aload_0
      21: invokespecial #38                 // Method android/support/v4/f/c$1."<init>":(Landroid/support/v4/f/c;)V
      24: putfield      #40                 // Field e:Landroid/os/Handler$Callback;
      27: aload_0
      28: aload_1
      29: putfield      #42                 // Field h:Ljava/lang/String;
      32: aload_0
      33: iload_2
      34: putfield      #44                 // Field g:I
      37: aload_0
      38: iload_3
      39: putfield      #46                 // Field f:I
      42: aload_0
      43: iconst_0
      44: putfield      #48                 // Field d:I
      47: return

  static void a(android.support.v4.f.c);
    Code:
       0: aload_0
       1: invokespecial #67                 // Method a:()V
       4: return

  static void a(android.support.v4.f.c, java.lang.Runnable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #71                 // Method b:(Ljava/lang/Runnable;)V
       5: return

  public <T> T a(java.util.concurrent.Callable<T>, int);
    Code:
       0: new           #113                // class java/util/concurrent/locks/ReentrantLock
       3: dup
       4: invokespecial #114                // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
       7: astore        7
       9: aload         7
      11: invokevirtual #118                // Method java/util/concurrent/locks/ReentrantLock.newCondition:()Ljava/util/concurrent/locks/Condition;
      14: astore        8
      16: new           #120                // class java/util/concurrent/atomic/AtomicReference
      19: dup
      20: invokespecial #121                // Method java/util/concurrent/atomic/AtomicReference."<init>":()V
      23: astore        9
      25: new           #123                // class java/util/concurrent/atomic/AtomicBoolean
      28: dup
      29: iconst_1
      30: invokespecial #126                // Method java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
      33: astore        10
      35: aload_0
      36: new           #12                 // class android/support/v4/f/c$3
      39: dup
      40: aload_0
      41: aload         9
      43: aload_1
      44: aload         7
      46: aload         10
      48: aload         8
      50: invokespecial #129                // Method android/support/v4/f/c$3."<init>":(Landroid/support/v4/f/c;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/Callable;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/locks/Condition;)V
      53: invokespecial #131                // Method a:(Ljava/lang/Runnable;)V
      56: aload         7
      58: invokevirtual #134                // Method java/util/concurrent/locks/ReentrantLock.lock:()V
      61: aload         10
      63: invokevirtual #137                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
      66: ifne          82
      69: aload         9
      71: invokevirtual #140                // Method java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
      74: astore_1
      75: aload         7
      77: invokevirtual #143                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
      80: aload_1
      81: areturn
      82: getstatic     #149                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
      85: iload_2
      86: i2l
      87: invokevirtual #153                // Method java/util/concurrent/TimeUnit.toNanos:(J)J
      90: lstore_3
      91: aload         8
      93: lload_3
      94: invokeinterface #158,  3          // InterfaceMethod java/util/concurrent/locks/Condition.awaitNanos:(J)J
      99: lstore        5
     101: aload         10
     103: invokevirtual #137                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
     106: ifne          122
     109: aload         9
     111: invokevirtual #140                // Method java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
     114: astore_1
     115: aload         7
     117: invokevirtual #143                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
     120: aload_1
     121: areturn
     122: lload         5
     124: lstore_3
     125: lload         5
     127: lconst_0
     128: lcmp
     129: ifgt          91
     132: new           #111                // class java/lang/InterruptedException
     135: dup
     136: ldc           #160                // String timeout
     138: invokespecial #163                // Method java/lang/InterruptedException."<init>":(Ljava/lang/String;)V
     141: athrow
     142: astore_1
     143: aload         7
     145: invokevirtual #143                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
     148: aload_1
     149: athrow
     150: astore_1
     151: lload_3
     152: lstore        5
     154: goto          101
    Exception table:
       from    to  target type
          61    75   142   any
          82    91   142   any
          91   101   150   Class java/lang/InterruptedException
          91   101   142   any
         101   115   142   any
         132   142   142   any

  public <T> void a(java.util.concurrent.Callable<T>, android.support.v4.f.c$a<T>);
    Code:
       0: aload_0
       1: new           #8                  // class android/support/v4/f/c$2
       4: dup
       5: aload_0
       6: aload_1
       7: new           #53                 // class android/os/Handler
      10: dup
      11: invokespecial #167                // Method android/os/Handler."<init>":()V
      14: aload_2
      15: invokespecial #170                // Method android/support/v4/f/c$2."<init>":(Landroid/support/v4/f/c;Ljava/util/concurrent/Callable;Landroid/os/Handler;Landroid/support/v4/f/c$a;)V
      18: invokespecial #131                // Method a:(Ljava/lang/Runnable;)V
      21: return
}
