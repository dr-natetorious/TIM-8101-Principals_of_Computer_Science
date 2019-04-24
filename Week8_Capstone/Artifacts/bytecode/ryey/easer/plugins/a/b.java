public abstract class ryey.easer.plugins.a.b<D extends ryey.easer.commons.local_plugin.a.a> implements ryey.easer.commons.local_plugin.a.d<D> {
  protected final android.content.Context d;

  protected final D e;

  protected final android.app.PendingIntent f;

  protected final android.app.PendingIntent g;

  java.util.concurrent.locks.Lock h;

  protected java.lang.Boolean i;

  protected ryey.easer.plugins.a.b(android.content.Context, D, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #26                 // class java/util/concurrent/locks/ReentrantLock
       8: dup
       9: invokespecial #27                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
      12: putfield      #29                 // Field h:Ljava/util/concurrent/locks/Lock;
      15: aload_0
      16: aload_1
      17: putfield      #31                 // Field d:Landroid/content/Context;
      20: aload_0
      21: aload_2
      22: putfield      #33                 // Field e:Lryey/easer/commons/local_plugin/a/a;
      25: aload_0
      26: aload_3
      27: putfield      #35                 // Field f:Landroid/app/PendingIntent;
      30: aload_0
      31: aload         4
      33: putfield      #37                 // Field g:Landroid/app/PendingIntent;
      36: return

  protected final void a(java.lang.Boolean);
    Code:
       0: aload_0
       1: getfield      #29                 // Field h:Ljava/util/concurrent/locks/Lock;
       4: invokeinterface #49,  1           // InterfaceMethod java/util/concurrent/locks/Lock.lock:()V
       9: aload_0
      10: getfield      #51                 // Field i:Ljava/lang/Boolean;
      13: astore_2
      14: aload_2
      15: aload_1
      16: if_acmpne     29
      19: aload_0
      20: getfield      #29                 // Field h:Ljava/util/concurrent/locks/Lock;
      23: invokeinterface #54,  1           // InterfaceMethod java/util/concurrent/locks/Lock.unlock:()V
      28: return
      29: aload_0
      30: aload_1
      31: putfield      #51                 // Field i:Ljava/lang/Boolean;
      34: aload_0
      35: getfield      #51                 // Field i:Ljava/lang/Boolean;
      38: ifnonnull     44
      41: goto          19
      44: aload_0
      45: getfield      #51                 // Field i:Ljava/lang/Boolean;
      48: invokevirtual #60                 // Method java/lang/Boolean.booleanValue:()Z
      51: ifeq          62
      54: aload_0
      55: getfield      #35                 // Field f:Landroid/app/PendingIntent;
      58: astore_1
      59: goto          67
      62: aload_0
      63: getfield      #37                 // Field g:Landroid/app/PendingIntent;
      66: astore_1
      67: aload_1
      68: invokevirtual #65                 // Method android/app/PendingIntent.send:()V
      71: goto          88
      74: astore_1
      75: ldc           #67                 // String PendingIntent for notify in SkeletonTracker cancelled before sending???
      77: iconst_0
      78: anewarray     #5                  // class java/lang/Object
      81: invokestatic  #72                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      84: aload_1
      85: invokestatic  #77                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      88: aload_0
      89: getfield      #29                 // Field h:Ljava/util/concurrent/locks/Lock;
      92: invokeinterface #54,  1           // InterfaceMethod java/util/concurrent/locks/Lock.unlock:()V
      97: return
      98: astore_1
      99: aload_0
     100: getfield      #29                 // Field h:Ljava/util/concurrent/locks/Lock;
     103: invokeinterface #54,  1           // InterfaceMethod java/util/concurrent/locks/Lock.unlock:()V
     108: aload_1
     109: athrow
    Exception table:
       from    to  target type
           9    14    98   any
          29    41    98   any
          44    59    98   any
          62    67    98   any
          67    71    74   Class android/app/PendingIntent$CanceledException
          67    71    98   any
          75    88    98   any

  public java.lang.Boolean c();
    Code:
       0: aload_0
       1: getfield      #51                 // Field i:Ljava/lang/Boolean;
       4: areturn
}
