public class ryey.easer.plugins.event.c.a extends ryey.easer.plugins.event.b<ryey.easer.plugins.event.c.b> {
  public ryey.easer.plugins.event.c.a(android.content.Context, ryey.easer.plugins.event.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_1
       4: iconst_0
       5: invokespecial #18                 // Method "<init>":(Landroid/content/Context;Lryey/easer/plugins/event/c/b;ZZ)V
       8: return

  ryey.easer.plugins.event.c.a(android.content.Context, ryey.easer.plugins.event.c.b, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #22                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: aconst_null
      11: putfield      #24                 // Field g:Lryey/easer/plugins/event/c/f;
      14: aload_0
      15: new           #7                  // class ryey/easer/plugins/event/c/a$1
      18: dup
      19: aload_0
      20: invokespecial #27                 // Method ryey/easer/plugins/event/c/a$1."<init>":(Lryey/easer/plugins/event/c/a;)V
      23: putfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
      26: aload_0
      27: new           #31                 // class android/content/IntentFilter
      30: dup
      31: invokespecial #34                 // Method android/content/IntentFilter."<init>":()V
      34: putfield      #36                 // Field i:Landroid/content/IntentFilter;
      37: aload_0
      38: aload_2
      39: getfield      #41                 // Field ryey/easer/plugins/event/c/b.a:Lryey/easer/plugins/event/c/f;
      42: putfield      #24                 // Field g:Lryey/easer/plugins/event/c/f;
      45: aload_0
      46: new           #31                 // class android/content/IntentFilter
      49: dup
      50: invokespecial #34                 // Method android/content/IntentFilter."<init>":()V
      53: putfield      #36                 // Field i:Landroid/content/IntentFilter;
      56: aload_0
      57: getfield      #24                 // Field g:Lryey/easer/plugins/event/c/f;
      60: getfield      #46                 // Field ryey/easer/plugins/event/c/f.a:Ljava/util/List;
      63: ifnull        109
      66: aload_0
      67: getfield      #24                 // Field g:Lryey/easer/plugins/event/c/f;
      70: getfield      #46                 // Field ryey/easer/plugins/event/c/f.a:Ljava/util/List;
      73: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      78: astore_1
      79: aload_1
      80: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      85: ifeq          109
      88: aload_1
      89: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      94: checkcast     #64                 // class java/lang/String
      97: astore_2
      98: aload_0
      99: getfield      #36                 // Field i:Landroid/content/IntentFilter;
     102: aload_2
     103: invokevirtual #68                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
     106: goto          79
     109: aload_0
     110: getfield      #24                 // Field g:Lryey/easer/plugins/event/c/f;
     113: getfield      #71                 // Field ryey/easer/plugins/event/c/f.b:Ljava/util/List;
     116: ifnull        162
     119: aload_0
     120: getfield      #24                 // Field g:Lryey/easer/plugins/event/c/f;
     123: getfield      #71                 // Field ryey/easer/plugins/event/c/f.b:Ljava/util/List;
     126: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     131: astore_1
     132: aload_1
     133: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     138: ifeq          162
     141: aload_1
     142: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     147: checkcast     #64                 // class java/lang/String
     150: astore_2
     151: aload_0
     152: getfield      #36                 // Field i:Landroid/content/IntentFilter;
     155: aload_2
     156: invokevirtual #74                 // Method android/content/IntentFilter.addCategory:(Ljava/lang/String;)V
     159: goto          132
     162: return

  static android.os.Bundle a(android.content.Intent);
    Code:
       0: aload_0
       1: invokestatic  #77                 // Method b:(Landroid/content/Intent;)Landroid/os/Bundle;
       4: areturn

  static void a(ryey.easer.plugins.event.c.a, boolean, android.os.Bundle);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokevirtual #81                 // Method a:(ZLandroid/os/Bundle;)V
       6: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #127                // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #36                 // Field i:Landroid/content/IntentFilter;
      12: invokevirtual #133                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #127                // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #29                 // Field h:Landroid/content/BroadcastReceiver;
       8: invokevirtual #137                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
