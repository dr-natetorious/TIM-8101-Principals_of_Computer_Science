public class ryey.easer.core.f {
  public final android.os.Messenger a;

  public ryey.easer.core.f(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #57                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #21                 // class ryey/easer/core/f$b
       8: dup
       9: new           #59                 // class java/lang/ref/WeakReference
      12: dup
      13: aload_0
      14: invokespecial #62                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      17: invokespecial #65                 // Method ryey/easer/core/f$b."<init>":(Ljava/lang/ref/WeakReference;)V
      20: putfield      #67                 // Field d:Lryey/easer/core/f$b;
      23: aload_0
      24: new           #69                 // class android/os/Messenger
      27: dup
      28: aload_0
      29: getfield      #67                 // Field d:Lryey/easer/core/f$b;
      32: invokespecial #72                 // Method android/os/Messenger."<init>":(Landroid/os/Handler;)V
      35: putfield      #74                 // Field a:Landroid/os/Messenger;
      38: aload_0
      39: new           #6                  // class ryey/easer/core/f$1
      42: dup
      43: aload_0
      44: invokespecial #77                 // Method ryey/easer/core/f$1."<init>":(Lryey/easer/core/f;)V
      47: putfield      #79                 // Field e:Landroid/content/ServiceConnection;
      50: aload_0
      51: new           #16                 // class ryey/easer/core/f$a
      54: dup
      55: invokespecial #80                 // Method ryey/easer/core/f$a."<init>":()V
      58: putfield      #82                 // Field i:Lryey/easer/core/f$a;
      61: aload_0
      62: new           #84                 // class java/util/concurrent/locks/ReentrantLock
      65: dup
      66: invokespecial #85                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
      69: putfield      #87                 // Field j:Ljava/util/concurrent/locks/Lock;
      72: aload_0
      73: new           #89                 // class android/support/v4/g/a
      76: dup
      77: invokespecial #90                 // Method android/support/v4/g/a."<init>":()V
      80: putfield      #92                 // Field k:Ljava/util/Map;
      83: aload_0
      84: aload_1
      85: putfield      #94                 // Field b:Landroid/content/Context;
      88: return

  static android.content.Context a(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #94                 // Field b:Landroid/content/Context;
       4: areturn

  static android.os.Messenger a(ryey.easer.core.f, android.os.Messenger);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #99                 // Field c:Landroid/os/Messenger;
       5: aload_1
       6: areturn

  static ryey.easer.core.f$f a(ryey.easer.core.f, ryey.easer.core.f$f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #102                // Field g:Lryey/easer/core/f$f;
       5: aload_1
       6: areturn

  static ryey.easer.core.f$g a(ryey.easer.core.f, ryey.easer.core.f$g);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #105                // Field f:Lryey/easer/core/f$g;
       5: aload_1
       6: areturn

  static android.os.Messenger b(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #99                 // Field c:Landroid/os/Messenger;
       4: areturn

  static ryey.easer.core.f$a c(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #82                 // Field i:Lryey/easer/core/f$a;
       4: areturn

  static java.util.concurrent.locks.Lock d(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #87                 // Field j:Ljava/util/concurrent/locks/Lock;
       4: areturn

  static java.util.Map e(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #92                 // Field k:Ljava/util/Map;
       4: areturn

  static ryey.easer.core.f$g f(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #105                // Field f:Lryey/easer/core/f$g;
       4: areturn

  static ryey.easer.core.f$f g(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #102                // Field g:Lryey/easer/core/f$f;
       4: areturn

  static ryey.easer.core.f$d h(ryey.easer.core.f);
    Code:
       0: aload_0
       1: getfield      #114                // Field h:Lryey/easer/core/f$d;
       4: areturn

  public void a();
    Code:
       0: ldc           #116                // String [RemotePluginCommunicationHelper] begin()
       2: invokestatic  #120                // Method com/b/a/i.a:(Ljava/lang/Object;)V
       5: new           #122                // class android/content/Intent
       8: dup
       9: aload_0
      10: getfield      #94                 // Field b:Landroid/content/Context;
      13: ldc           #124                // class ryey/easer/core/RemotePluginRegistryService
      15: invokespecial #127                // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      18: astore_1
      19: aload_0
      20: getfield      #94                 // Field b:Landroid/content/Context;
      23: aload_1
      24: aload_0
      25: getfield      #79                 // Field e:Landroid/content/ServiceConnection;
      28: iconst_1
      29: invokevirtual #133                // Method android/content/Context.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      32: pop
      33: return

  public void a(java.lang.String, ryey.easer.c.a);
    Code:
       0: aload_0
       1: aload_0
       2: aload_1
       3: aload_2
       4: invokevirtual #137                // Method b:(Ljava/lang/String;Lryey/easer/c/a;)Ljava/util/concurrent/Callable;
       7: invokevirtual #140                // Method a:(Ljava/util/concurrent/Callable;)V
      10: return

  public void a(java.lang.String, ryey.easer.core.f$d);
    Code:
       0: aload_0
       1: aload_0
       2: aload_1
       3: aload_2
       4: invokevirtual #144                // Method b:(Ljava/lang/String;Lryey/easer/core/f$d;)Ljava/util/concurrent/Callable;
       7: invokevirtual #140                // Method a:(Ljava/util/concurrent/Callable;)V
      10: return

  public void a(java.lang.String, ryey.easer.core.f$g);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: aload_2
       4: putfield      #105                // Field f:Lryey/easer/core/f$g;
       7: aload_0
       8: new           #8                  // class ryey/easer/core/f$2
      11: dup
      12: aload_0
      13: aload_1
      14: invokespecial #148                // Method ryey/easer/core/f$2."<init>":(Lryey/easer/core/f;Ljava/lang/String;)V
      17: invokevirtual #140                // Method a:(Ljava/util/concurrent/Callable;)V
      20: aload_0
      21: monitorexit
      22: return
      23: astore_1
      24: aload_0
      25: monitorexit
      26: aload_1
      27: athrow
    Exception table:
       from    to  target type
           2    20    23   any

  public void a(java.util.concurrent.Callable<java.lang.Void>);
    Code:
       0: aload_0
       1: getfield      #82                 // Field i:Lryey/easer/core/f$a;
       4: aload_1
       5: invokevirtual #149                // Method ryey/easer/core/f$a.a:(Ljava/util/concurrent/Callable;)V
       8: return

  public void a(ryey.easer.core.f$f);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: aload_1
       4: putfield      #102                // Field g:Lryey/easer/core/f$f;
       7: aload_0
       8: new           #10                 // class ryey/easer/core/f$3
      11: dup
      12: aload_0
      13: invokespecial #153                // Method ryey/easer/core/f$3."<init>":(Lryey/easer/core/f;)V
      16: invokevirtual #140                // Method a:(Ljava/util/concurrent/Callable;)V
      19: aload_0
      20: monitorexit
      21: return
      22: astore_1
      23: aload_0
      24: monitorexit
      25: aload_1
      26: athrow
    Exception table:
       from    to  target type
           2    19    22   any

  public java.util.concurrent.Callable<java.lang.Void> b(java.lang.String, ryey.easer.c.a);
    Code:
       0: new           #12                 // class ryey/easer/core/f$4
       3: dup
       4: aload_0
       5: aload_1
       6: aload_2
       7: invokespecial #156                // Method ryey/easer/core/f$4."<init>":(Lryey/easer/core/f;Ljava/lang/String;Lryey/easer/c/a;)V
      10: areturn

  public java.util.concurrent.Callable<java.lang.Void> b(java.lang.String, ryey.easer.core.f$d);
    Code:
       0: aload_0
       1: aload_2
       2: putfield      #114                // Field h:Lryey/easer/core/f$d;
       5: new           #14                 // class ryey/easer/core/f$5
       8: dup
       9: aload_0
      10: aload_1
      11: invokespecial #158                // Method ryey/easer/core/f$5."<init>":(Lryey/easer/core/f;Ljava/lang/String;)V
      14: areturn

  public void b();
    Code:
       0: aload_0
       1: getfield      #94                 // Field b:Landroid/content/Context;
       4: aload_0
       5: getfield      #79                 // Field e:Landroid/content/ServiceConnection;
       8: invokevirtual #163                // Method android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
      11: return
}
