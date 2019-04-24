public final class ryey.easer.core.RemotePluginRegistryService$a extends android.os.Handler {
  public ryey.easer.core.RemotePluginRegistryService$a(ryey.easer.core.RemotePluginRegistryService, android.os.HandlerThread);
    Code:
       0: aload_1
       1: ldc           #12                 // String service
       3: invokestatic  #18                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #20                 // String handlerThread
       9: invokestatic  #18                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_0
      13: aload_2
      14: invokevirtual #26                 // Method android/os/HandlerThread.getLooper:()Landroid/os/Looper;
      17: invokespecial #29                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
      20: aload_0
      21: aload_1
      22: putfield      #31                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
      25: return

  public void handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: ldc           #36                 // String message
       3: invokestatic  #18                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: ldc           #38                 // String [RemotePluginRegistryService][handleMessage] %s
       8: iconst_1
       9: anewarray     #40                 // class java/lang/Object
      12: dup
      13: iconst_0
      14: aload_1
      15: aastore
      16: invokestatic  #45                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      19: aload_1
      20: getfield      #51                 // Field android/os/Message.replyTo:Landroid/os/Messenger;
      23: astore_2
      24: aload_1
      25: getfield      #55                 // Field android/os/Message.what:I
      28: ifne          96
      31: aload_1
      32: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
      35: ldc           #61                 // String ryey.easer.IPC.EXTRA.PLUGIN_ID
      37: invokevirtual #67                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      40: astore_1
      41: invokestatic  #71                 // Method android/os/Message.obtain:()Landroid/os/Message;
      44: astore_3
      45: aload_3
      46: iconst_0
      47: putfield      #55                 // Field android/os/Message.what:I
      50: aload_3
      51: ldc           #73                 // String reply
      53: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      56: aload_3
      57: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
      60: astore        4
      62: aload_0
      63: getfield      #31                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
      66: astore        5
      68: aload_1
      69: ldc           #77                 // String id
      71: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      74: aload         4
      76: ldc           #79                 // String ryey.easer.IPC.EXTRA.PLUGIN_INFO
      78: aload         5
      80: aload_1
      81: invokevirtual #82                 // Method ryey/easer/core/RemotePluginRegistryService.a:(Ljava/lang/String;)Lryey/easer/core/e;
      84: checkcast     #84                 // class android/os/Parcelable
      87: invokevirtual #88                 // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      90: aload_2
      91: aload_3
      92: invokevirtual #93                 // Method android/os/Messenger.send:(Landroid/os/Message;)V
      95: return
      96: aload_1
      97: getfield      #55                 // Field android/os/Message.what:I
     100: iconst_1
     101: if_icmpne     151
     104: invokestatic  #71                 // Method android/os/Message.obtain:()Landroid/os/Message;
     107: astore_1
     108: aload_1
     109: iconst_1
     110: putfield      #55                 // Field android/os/Message.what:I
     113: aload_1
     114: ldc           #73                 // String reply
     116: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     119: aload_1
     120: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     123: ldc           #95                 // String ryey.easer.IPC.EXTRA.PLUGIN_LIST
     125: new           #97                 // class java/util/ArrayList
     128: dup
     129: aload_0
     130: getfield      #31                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
     133: invokestatic  #100                // Method ryey/easer/core/RemotePluginRegistryService.a:(Lryey/easer/core/RemotePluginRegistryService;)Landroid/support/v4/g/b;
     136: checkcast     #102                // class java/util/Collection
     139: invokespecial #105                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
     142: invokevirtual #109                // Method android/os/Bundle.putParcelableArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
     145: aload_2
     146: aload_1
     147: invokevirtual #93                 // Method android/os/Messenger.send:(Landroid/os/Message;)V
     150: return
     151: aload_1
     152: getfield      #55                 // Field android/os/Message.what:I
     155: iconst_2
     156: if_icmpne     172
     159: new           #111                // class java/lang/IllegalAccessError
     162: dup
     163: ldc           #113                // String This message is not yet in use
     165: invokespecial #116                // Method java/lang/IllegalAccessError."<init>":(Ljava/lang/String;)V
     168: checkcast     #118                // class java/lang/Throwable
     171: athrow
     172: aload_1
     173: getfield      #55                 // Field android/os/Message.what:I
     176: iconst_3
     177: if_icmpne     322
     180: ldc           #120                // String RemoPlRegistry
     182: ldc           #122                // String MSG_TRIGGER_OPERATION
     184: invokestatic  #128                // Method android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
     187: pop
     188: aload_1
     189: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     192: astore_2
     193: aload_2
     194: ldc           #130                // String message.data
     196: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     199: aload_2
     200: ldc           #132                // class java/lang/String
     202: invokevirtual #138                // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
     205: invokevirtual #142                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
     208: aload_1
     209: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     212: ldc           #61                 // String ryey.easer.IPC.EXTRA.PLUGIN_ID
     214: invokevirtual #67                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
     217: astore_2
     218: aload_1
     219: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     222: astore_3
     223: aload_3
     224: ldc           #130                // String message.data
     226: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     229: aload_3
     230: ldc           #144                // class ryey/easer/c/a
     232: invokevirtual #138                // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
     235: invokevirtual #142                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
     238: aload_1
     239: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     242: ldc           #146                // String ryey.easer.IPC.EXTRA.PLUGIN_DATA
     244: invokevirtual #150                // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
     247: astore_1
     248: aload_1
     249: ldc           #152                // String message.data.getParcelable(C.EXTRA_PLUGIN_DATA)
     251: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     254: aload_1
     255: checkcast     #144                // class ryey/easer/c/a
     258: astore_1
     259: aload_0
     260: getfield      #31                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
     263: astore_3
     264: aload_2
     265: ldc           #77                 // String id
     267: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     270: aload_3
     271: aload_2
     272: invokevirtual #82                 // Method ryey/easer/core/RemotePluginRegistryService.a:(Ljava/lang/String;)Lryey/easer/core/e;
     275: astore_2
     276: aload_2
     277: ifnonnull     283
     280: invokestatic  #155                // Method a/b/b/c.a:()V
     283: new           #157                // class android/content/Intent
     286: dup
     287: ldc           #159                // String ryey.easer.remote_plugin.action.TRIGGER_ACTION
     289: invokespecial #160                // Method android/content/Intent."<init>":(Ljava/lang/String;)V
     292: astore_3
     293: aload_3
     294: aload_2
     295: invokevirtual #166                // Method ryey/easer/core/e.c:()Ljava/lang/String;
     298: invokevirtual #170                // Method android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
     301: pop
     302: aload_3
     303: ldc           #172                // String ryey.easer.remote_plugin.extra.DATA
     305: aload_1
     306: checkcast     #84                 // class android/os/Parcelable
     309: invokevirtual #176                // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
     312: pop
     313: aload_0
     314: getfield      #31                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
     317: aload_3
     318: invokevirtual #180                // Method ryey/easer/core/RemotePluginRegistryService.sendBroadcast:(Landroid/content/Intent;)V
     321: return
     322: aload_1
     323: getfield      #55                 // Field android/os/Message.what:I
     326: iconst_4
     327: if_icmpne     415
     330: aload_1
     331: invokevirtual #59                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     334: ldc           #61                 // String ryey.easer.IPC.EXTRA.PLUGIN_ID
     336: invokevirtual #67                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
     339: astore_1
     340: aload_0
     341: getfield      #31                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
     344: astore_3
     345: aload_1
     346: ldc           #77                 // String id
     348: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     351: aload_3
     352: aload_1
     353: invokevirtual #82                 // Method ryey/easer/core/RemotePluginRegistryService.a:(Ljava/lang/String;)Lryey/easer/core/e;
     356: astore_1
     357: aload_1
     358: ifnonnull     364
     361: invokestatic  #155                // Method a/b/b/c.a:()V
     364: new           #63                 // class android/os/Bundle
     367: dup
     368: invokespecial #182                // Method android/os/Bundle."<init>":()V
     371: astore_3
     372: aload_3
     373: ldc           #184                // String ryey.easer.IPC.EXTRA.PLUGIN_PACKAGE
     375: aload_1
     376: invokevirtual #166                // Method ryey/easer/core/e.c:()Ljava/lang/String;
     379: invokevirtual #188                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
     382: aload_3
     383: ldc           #190                // String ryey.easer.IPC.EXTRA.PLUGIN_EDIT_DATA_ACTIVITY
     385: aload_1
     386: invokevirtual #192                // Method ryey/easer/core/e.b:()Ljava/lang/String;
     389: invokevirtual #188                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
     392: invokestatic  #71                 // Method android/os/Message.obtain:()Landroid/os/Message;
     395: astore_1
     396: aload_1
     397: iconst_4
     398: putfield      #55                 // Field android/os/Message.what:I
     401: aload_1
     402: ldc           #73                 // String reply
     404: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     407: aload_1
     408: aload_3
     409: invokevirtual #196                // Method android/os/Message.setData:(Landroid/os/Bundle;)V
     412: goto          145
     415: return
}
