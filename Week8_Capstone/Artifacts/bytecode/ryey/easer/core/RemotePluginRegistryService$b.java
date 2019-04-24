public final class ryey.easer.core.RemotePluginRegistryService$b extends android.content.BroadcastReceiver {
  final ryey.easer.core.RemotePluginRegistryService a;

  ryey.easer.core.RemotePluginRegistryService$b();
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aload_1
       1: ldc           #23                 // String context
       3: invokestatic  #29                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #31                 // String intent
       9: invokestatic  #29                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: ldc           #33                 // String ryey.easer.remote_plugin.action.RESPONSE_PLUGIN_INFO
      14: aload_2
      15: invokevirtual #39                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      18: invokestatic  #42                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      21: ifeq          179
      24: ldc           #44                 // String [RemotePluginRegistryService][onReceive] %s
      26: iconst_1
      27: anewarray     #46                 // class java/lang/Object
      30: dup
      31: iconst_0
      32: aload_2
      33: aastore
      34: invokestatic  #51                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      37: aload_2
      38: ldc           #53                 // String ryey.easer.remote_plugin.extra.PACKAGE_NAME
      40: invokevirtual #57                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      43: astore        4
      45: aload_2
      46: ldc           #59                 // String ryey.easer.remote_plugin.extra.PLUGIN_ID
      48: invokevirtual #57                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      51: astore        5
      53: aload_2
      54: ldc           #61                 // String ryey.easer.remote_plugin.extra.PLUGIN_NAME
      56: invokevirtual #57                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      59: astore        6
      61: aload_2
      62: ldc           #63                 // String ryey.easer.remote_plugin.extra.ACTIVITY_EDIT_DATA
      64: invokevirtual #57                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      67: astore        7
      69: aload_2
      70: ldc           #65                 // String ryey.easer.remote_plugin.extra.PLUGIN_TYPE
      72: invokevirtual #57                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      75: ldc           #67                 // String ryey.easer.remote_plugin.TYPE.OPERATION
      77: invokestatic  #42                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      80: istore_3
      81: getstatic     #72                 // Field a/d.a:Z
      84: ifeq          104
      87: iload_3
      88: ifne          104
      91: new           #74                 // class java/lang/AssertionError
      94: dup
      95: ldc           #76                 // String Assertion failed
      97: invokespecial #79                 // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
     100: checkcast     #81                 // class java/lang/Throwable
     103: athrow
     104: aload_2
     105: ldc           #83                 // String ryey.easer.remote_plugin.extra.PLUGIN_CATEGORY
     107: invokevirtual #57                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
     110: astore_1
     111: aload_1
     112: ldc           #85                 // String categoryString
     114: invokestatic  #87                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     117: aload_1
     118: invokestatic  #93                 // Method ryey/easer/b/a/a.valueOf:(Ljava/lang/String;)Lryey/easer/b/a/a;
     121: astore_1
     122: goto          129
     125: getstatic     #97                 // Field ryey/easer/b/a/a.e:Lryey/easer/b/a/a;
     128: astore_1
     129: aload         4
     131: ldc           #99                 // String packageName
     133: invokestatic  #87                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     136: aload         5
     138: ldc           #101                // String pluginId
     140: invokestatic  #87                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     143: aload         6
     145: ldc           #103                // String pluginName
     147: invokestatic  #87                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     150: new           #105                // class ryey/easer/core/e
     153: dup
     154: aload         4
     156: aload         5
     158: aload         6
     160: aload         7
     162: aload_1
     163: invokespecial #108                // Method ryey/easer/core/e."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lryey/easer/b/a/a;)V
     166: astore_1
     167: aload_0
     168: getfield      #14                 // Field a:Lryey/easer/core/RemotePluginRegistryService;
     171: invokestatic  #111                // Method ryey/easer/core/RemotePluginRegistryService.a:(Lryey/easer/core/RemotePluginRegistryService;)Landroid/support/v4/g/b;
     174: aload_1
     175: invokevirtual #117                // Method android/support/v4/g/b.add:(Ljava/lang/Object;)Z
     178: pop
     179: return
     180: astore_1
     181: goto          125
    Exception table:
       from    to  target type
         111   122   180   Class java/lang/RuntimeException
}
