final class android.support.v7.app.j$b {
  final android.support.v7.app.j a;

  android.support.v7.app.j$b(android.support.v7.app.j, android.support.v7.app.q);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field a:Landroid/support/v7/app/j;
       5: aload_0
       6: invokespecial #25                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #27                 // Field b:Landroid/support/v7/app/q;
      14: aload_0
      15: aload_2
      16: invokevirtual #32                 // Method android/support/v7/app/q.a:()Z
      19: putfield      #34                 // Field c:Z
      22: return

  final int a();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #27                 // Field b:Landroid/support/v7/app/q;
       5: invokevirtual #32                 // Method android/support/v7/app/q.a:()Z
       8: putfield      #34                 // Field c:Z
      11: aload_0
      12: getfield      #34                 // Field c:Z
      15: ifeq          20
      18: iconst_2
      19: ireturn
      20: iconst_1
      21: ireturn

  final void b();
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Landroid/support/v7/app/q;
       4: invokevirtual #32                 // Method android/support/v7/app/q.a:()Z
       7: istore_1
       8: iload_1
       9: aload_0
      10: getfield      #34                 // Field c:Z
      13: if_icmpeq     29
      16: aload_0
      17: iload_1
      18: putfield      #34                 // Field c:Z
      21: aload_0
      22: getfield      #22                 // Field a:Landroid/support/v7/app/j;
      25: invokevirtual #39                 // Method android/support/v7/app/j.j:()Z
      28: pop
      29: return

  final void c();
    Code:
       0: aload_0
       1: invokevirtual #41                 // Method d:()V
       4: aload_0
       5: getfield      #43                 // Field d:Landroid/content/BroadcastReceiver;
       8: ifnonnull     23
      11: aload_0
      12: new           #9                  // class android/support/v7/app/j$b$1
      15: dup
      16: aload_0
      17: invokespecial #46                 // Method android/support/v7/app/j$b$1."<init>":(Landroid/support/v7/app/j$b;)V
      20: putfield      #43                 // Field d:Landroid/content/BroadcastReceiver;
      23: aload_0
      24: getfield      #48                 // Field e:Landroid/content/IntentFilter;
      27: ifnonnull     68
      30: aload_0
      31: new           #50                 // class android/content/IntentFilter
      34: dup
      35: invokespecial #51                 // Method android/content/IntentFilter."<init>":()V
      38: putfield      #48                 // Field e:Landroid/content/IntentFilter;
      41: aload_0
      42: getfield      #48                 // Field e:Landroid/content/IntentFilter;
      45: ldc           #53                 // String android.intent.action.TIME_SET
      47: invokevirtual #57                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      50: aload_0
      51: getfield      #48                 // Field e:Landroid/content/IntentFilter;
      54: ldc           #59                 // String android.intent.action.TIMEZONE_CHANGED
      56: invokevirtual #57                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      59: aload_0
      60: getfield      #48                 // Field e:Landroid/content/IntentFilter;
      63: ldc           #61                 // String android.intent.action.TIME_TICK
      65: invokevirtual #57                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      68: aload_0
      69: getfield      #22                 // Field a:Landroid/support/v7/app/j;
      72: getfield      #64                 // Field android/support/v7/app/j.a:Landroid/content/Context;
      75: aload_0
      76: getfield      #43                 // Field d:Landroid/content/BroadcastReceiver;
      79: aload_0
      80: getfield      #48                 // Field e:Landroid/content/IntentFilter;
      83: invokevirtual #70                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      86: pop
      87: return

  final void d();
    Code:
       0: aload_0
       1: getfield      #43                 // Field d:Landroid/content/BroadcastReceiver;
       4: ifnull        26
       7: aload_0
       8: getfield      #22                 // Field a:Landroid/support/v7/app/j;
      11: getfield      #64                 // Field android/support/v7/app/j.a:Landroid/content/Context;
      14: aload_0
      15: getfield      #43                 // Field d:Landroid/content/BroadcastReceiver;
      18: invokevirtual #74                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      21: aload_0
      22: aconst_null
      23: putfield      #43                 // Field d:Landroid/content/BroadcastReceiver;
      26: return
}
