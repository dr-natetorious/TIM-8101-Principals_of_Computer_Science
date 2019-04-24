public final class ryey.easer.core.RemotePluginRegistryService extends android.app.Service {
  public ryey.easer.core.RemotePluginRegistryService();
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/app/Service."<init>":()V
       4: aload_0
       5: new           #9                  // class ryey/easer/core/RemotePluginRegistryService$b
       8: dup
       9: aload_0
      10: invokespecial #28                 // Method ryey/easer/core/RemotePluginRegistryService$b."<init>":(Lryey/easer/core/RemotePluginRegistryService;)V
      13: putfield      #30                 // Field a:Lryey/easer/core/RemotePluginRegistryService$b;
      16: aload_0
      17: new           #32                 // class android/content/IntentFilter
      20: dup
      21: invokespecial #33                 // Method android/content/IntentFilter."<init>":()V
      24: putfield      #35                 // Field b:Landroid/content/IntentFilter;
      27: aload_0
      28: getfield      #35                 // Field b:Landroid/content/IntentFilter;
      31: ldc           #37                 // String ryey.easer.remote_plugin.action.RESPONSE_PLUGIN_INFO
      33: invokevirtual #41                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      36: aload_0
      37: new           #43                 // class android/support/v4/g/b
      40: dup
      41: invokespecial #44                 // Method android/support/v4/g/b."<init>":()V
      44: putfield      #46                 // Field c:Landroid/support/v4/g/b;
      47: aload_0
      48: new           #48                 // class android/os/HandlerThread
      51: dup
      52: ldc           #50                 // String RemotePluginRegistryService_HandlerThread
      54: invokespecial #52                 // Method android/os/HandlerThread."<init>":(Ljava/lang/String;)V
      57: putfield      #54                 // Field d:Landroid/os/HandlerThread;
      60: return

  public static final android.support.v4.g.b a(ryey.easer.core.RemotePluginRegistryService);
    Code:
       0: aload_0
       1: getfield      #46                 // Field c:Landroid/support/v4/g/b;
       4: areturn

  public final ryey.easer.core.e a(java.lang.String);
    Code:
       0: aload_1
       1: ldc           #136                // String id
       3: invokestatic  #141                // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: getfield      #46                 // Field c:Landroid/support/v4/g/b;
      10: invokevirtual #142                // Method android/support/v4/g/b.iterator:()Ljava/util/Iterator;
      13: astore_2
      14: aload_2
      15: invokeinterface #105,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      20: ifeq          46
      23: aload_2
      24: invokeinterface #109,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      29: checkcast     #144                // class ryey/easer/core/e
      32: astore_3
      33: aload_3
      34: invokevirtual #147                // Method ryey/easer/core/e.d:()Ljava/lang/String;
      37: aload_1
      38: invokestatic  #150                // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      41: ifeq          14
      44: aload_3
      45: areturn
      46: aconst_null
      47: areturn

  public android.os.IBinder onBind(android.content.Intent);
    Code:
       0: aload_1
       1: ldc           #154                // String intent
       3: invokestatic  #141                // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: getfield      #156                // Field f:Landroid/os/Messenger;
      10: astore_1
      11: aload_1
      12: ifnonnull     20
      15: ldc           #158                // String incomingMessenger
      17: invokestatic  #160                // Method a/b/b/c.b:(Ljava/lang/String;)V
      20: aload_1
      21: invokevirtual #166                // Method android/os/Messenger.getBinder:()Landroid/os/IBinder;
      24: astore_1
      25: aload_1
      26: ldc           #168                // String incomingMessenger.binder
      28: invokestatic  #170                // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      31: aload_1
      32: areturn

  public void onCreate();
    Code:
       0: getstatic     #176                // Field ryey/easer/core/h.a:Lryey/easer/core/h$a;
       3: aload_0
       4: checkcast     #4                  // class android/app/Service
       7: invokevirtual #181                // Method ryey/easer/core/h$a.a:(Landroid/app/Service;)V
      10: aload_0
      11: getfield      #54                 // Field d:Landroid/os/HandlerThread;
      14: invokevirtual #184                // Method android/os/HandlerThread.start:()V
      17: aload_0
      18: new           #6                  // class ryey/easer/core/RemotePluginRegistryService$a
      21: dup
      22: aload_0
      23: aload_0
      24: getfield      #54                 // Field d:Landroid/os/HandlerThread;
      27: invokespecial #187                // Method ryey/easer/core/RemotePluginRegistryService$a."<init>":(Lryey/easer/core/RemotePluginRegistryService;Landroid/os/HandlerThread;)V
      30: checkcast     #189                // class android/os/Handler
      33: putfield      #191                // Field e:Landroid/os/Handler;
      36: aload_0
      37: getfield      #191                // Field e:Landroid/os/Handler;
      40: astore_1
      41: aload_1
      42: ifnonnull     50
      45: ldc           #193                // String incomingHandler
      47: invokestatic  #160                // Method a/b/b/c.b:(Ljava/lang/String;)V
      50: aload_0
      51: new           #162                // class android/os/Messenger
      54: dup
      55: aload_1
      56: invokespecial #196                // Method android/os/Messenger."<init>":(Landroid/os/Handler;)V
      59: putfield      #156                // Field f:Landroid/os/Messenger;
      62: aload_0
      63: aload_0
      64: getfield      #30                 // Field a:Lryey/easer/core/RemotePluginRegistryService$b;
      67: checkcast     #198                // class android/content/BroadcastReceiver
      70: aload_0
      71: getfield      #35                 // Field b:Landroid/content/IntentFilter;
      74: invokevirtual #202                // Method registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      77: pop
      78: aload_0
      79: invokespecial #204                // Method a:()V
      82: return

  public void onDestroy();
    Code:
       0: getstatic     #176                // Field ryey/easer/core/h.a:Lryey/easer/core/h$a;
       3: aload_0
       4: checkcast     #4                  // class android/app/Service
       7: invokevirtual #207                // Method ryey/easer/core/h$a.b:(Landroid/app/Service;)V
      10: aload_0
      11: aload_0
      12: getfield      #30                 // Field a:Lryey/easer/core/RemotePluginRegistryService$b;
      15: checkcast     #198                // class android/content/BroadcastReceiver
      18: invokevirtual #211                // Method unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      21: getstatic     #217                // Field android/os/Build$VERSION.SDK_INT:I
      24: bipush        18
      26: if_icmplt     38
      29: aload_0
      30: getfield      #54                 // Field d:Landroid/os/HandlerThread;
      33: invokevirtual #220                // Method android/os/HandlerThread.quitSafely:()Z
      36: pop
      37: return
      38: aload_0
      39: getfield      #54                 // Field d:Landroid/os/HandlerThread;
      42: invokevirtual #223                // Method android/os/HandlerThread.quit:()Z
      45: pop
      46: return
}
