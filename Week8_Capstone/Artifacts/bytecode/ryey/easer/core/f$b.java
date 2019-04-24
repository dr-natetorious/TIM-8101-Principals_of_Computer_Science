class ryey.easer.core.f$b extends android.os.Handler {
  static final boolean b;

  java.lang.ref.WeakReference<ryey.easer.core.f> a;

  static {};
    Code:
       0: return

  ryey.easer.core.f$b(java.lang.ref.WeakReference<ryey.easer.core.f>);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method android/os/Handler."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
       9: return

  public void handleMessage(android.os.Message);
    Code:
       0: ldc           #27                 // String [RemotePluginCommunicationHelper][handleMessage] %s
       2: iconst_1
       3: anewarray     #29                 // class java/lang/Object
       6: dup
       7: iconst_0
       8: aload_1
       9: aastore
      10: invokestatic  #34                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      13: aload_1
      14: getfield      #40                 // Field android/os/Message.what:I
      17: ifne          96
      20: aload_1
      21: invokevirtual #44                 // Method android/os/Message.getData:()Landroid/os/Bundle;
      24: ldc           #46                 // class ryey/easer/core/g
      26: invokevirtual #52                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      29: invokevirtual #58                 // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      32: aload_1
      33: invokevirtual #44                 // Method android/os/Message.getData:()Landroid/os/Bundle;
      36: ldc           #60                 // String ryey.easer.IPC.EXTRA.PLUGIN_INFO
      38: invokevirtual #64                 // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
      41: checkcast     #46                 // class ryey/easer/core/g
      44: astore_1
      45: aload_0
      46: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
      49: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      52: checkcast     #6                  // class ryey/easer/core/f
      55: invokestatic  #74                 // Method ryey/easer/core/f.f:(Lryey/easer/core/f;)Lryey/easer/core/f$g;
      58: ifnull        408
      61: aload_0
      62: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
      65: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      68: checkcast     #6                  // class ryey/easer/core/f
      71: invokestatic  #74                 // Method ryey/easer/core/f.f:(Lryey/easer/core/f;)Lryey/easer/core/f$g;
      74: aload_1
      75: invokeinterface #79,  2           // InterfaceMethod ryey/easer/core/f$g.a:(Lryey/easer/core/g;)V
      80: aload_0
      81: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
      84: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      87: checkcast     #6                  // class ryey/easer/core/f
      90: aconst_null
      91: invokestatic  #82                 // Method ryey/easer/core/f.a:(Lryey/easer/core/f;Lryey/easer/core/f$g;)Lryey/easer/core/f$g;
      94: pop
      95: return
      96: aload_1
      97: getfield      #40                 // Field android/os/Message.what:I
     100: iconst_1
     101: if_icmpne     184
     104: aload_1
     105: invokevirtual #44                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     108: ldc           #84                 // class ryey/easer/core/e
     110: invokevirtual #52                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
     113: invokevirtual #58                 // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
     116: new           #86                 // class android/support/v4/g/b
     119: dup
     120: aload_1
     121: invokevirtual #44                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     124: ldc           #88                 // String ryey.easer.IPC.EXTRA.PLUGIN_LIST
     126: invokevirtual #92                 // Method android/os/Bundle.getParcelableArrayList:(Ljava/lang/String;)Ljava/util/ArrayList;
     129: invokespecial #95                 // Method android/support/v4/g/b."<init>":(Ljava/util/Collection;)V
     132: astore_1
     133: aload_0
     134: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     137: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     140: checkcast     #6                  // class ryey/easer/core/f
     143: invokestatic  #99                 // Method ryey/easer/core/f.g:(Lryey/easer/core/f;)Lryey/easer/core/f$f;
     146: ifnull        408
     149: aload_0
     150: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     153: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     156: checkcast     #6                  // class ryey/easer/core/f
     159: invokestatic  #99                 // Method ryey/easer/core/f.g:(Lryey/easer/core/f;)Lryey/easer/core/f$f;
     162: aload_1
     163: invokeinterface #104,  2          // InterfaceMethod ryey/easer/core/f$f.a:(Ljava/util/Set;)V
     168: aload_0
     169: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     172: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     175: checkcast     #6                  // class ryey/easer/core/f
     178: aconst_null
     179: invokestatic  #107                // Method ryey/easer/core/f.a:(Lryey/easer/core/f;Lryey/easer/core/f$f;)Lryey/easer/core/f$f;
     182: pop
     183: return
     184: aload_1
     185: getfield      #40                 // Field android/os/Message.what:I
     188: iconst_2
     189: if_icmpne     304
     192: aload_1
     193: invokevirtual #44                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     196: ldc           #109                // String ryey.easer.IPC.EXTRA.PLUGIN_DATA
     198: invokevirtual #64                 // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
     201: checkcast     #111                // class ryey/easer/commons/local_plugin/c/b
     204: astore_2
     205: aload_1
     206: invokevirtual #44                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     209: ldc           #113                // String ryey.easer.IPC.EXTRA.MESSAGE_ID
     211: invokevirtual #64                 // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
     214: checkcast     #115                // class android/os/ParcelUuid
     217: astore_1
     218: aload_0
     219: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     222: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     225: checkcast     #6                  // class ryey/easer/core/f
     228: invokestatic  #119                // Method ryey/easer/core/f.d:(Lryey/easer/core/f;)Ljava/util/concurrent/locks/Lock;
     231: invokeinterface #124,  1          // InterfaceMethod java/util/concurrent/locks/Lock.lock:()V
     236: aload_0
     237: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     240: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     243: checkcast     #6                  // class ryey/easer/core/f
     246: invokestatic  #128                // Method ryey/easer/core/f.e:(Lryey/easer/core/f;)Ljava/util/Map;
     249: aload_1
     250: invokeinterface #133,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     255: checkcast     #135                // class ryey/easer/core/f$e
     258: aload_2
     259: invokeinterface #138,  2          // InterfaceMethod ryey/easer/core/f$e.a:(Lryey/easer/commons/local_plugin/c/b;)V
     264: aload_0
     265: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     268: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     271: checkcast     #6                  // class ryey/easer/core/f
     274: invokestatic  #119                // Method ryey/easer/core/f.d:(Lryey/easer/core/f;)Ljava/util/concurrent/locks/Lock;
     277: invokeinterface #141,  1          // InterfaceMethod java/util/concurrent/locks/Lock.unlock:()V
     282: return
     283: astore_1
     284: aload_0
     285: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     288: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     291: checkcast     #6                  // class ryey/easer/core/f
     294: invokestatic  #119                // Method ryey/easer/core/f.d:(Lryey/easer/core/f;)Ljava/util/concurrent/locks/Lock;
     297: invokeinterface #141,  1          // InterfaceMethod java/util/concurrent/locks/Lock.unlock:()V
     302: aload_1
     303: athrow
     304: aload_1
     305: getfield      #40                 // Field android/os/Message.what:I
     308: iconst_4
     309: if_icmpne     408
     312: aload_1
     313: invokevirtual #44                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     316: astore_2
     317: aload_2
     318: ldc           #143                // String ryey.easer.IPC.EXTRA.PLUGIN_PACKAGE
     320: invokevirtual #147                // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
     323: astore_1
     324: aload_2
     325: ldc           #149                // String ryey.easer.IPC.EXTRA.PLUGIN_EDIT_DATA_ACTIVITY
     327: invokevirtual #147                // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
     330: astore_2
     331: getstatic     #151                // Field b:Z
     334: ifne          349
     337: aload_1
     338: ifnonnull     349
     341: new           #153                // class java/lang/AssertionError
     344: dup
     345: invokespecial #154                // Method java/lang/AssertionError."<init>":()V
     348: athrow
     349: getstatic     #151                // Field b:Z
     352: ifne          367
     355: aload_2
     356: ifnonnull     367
     359: new           #153                // class java/lang/AssertionError
     362: dup
     363: invokespecial #154                // Method java/lang/AssertionError."<init>":()V
     366: athrow
     367: new           #156                // class android/content/Intent
     370: dup
     371: invokespecial #157                // Method android/content/Intent."<init>":()V
     374: astore_3
     375: aload_3
     376: new           #159                // class android/content/ComponentName
     379: dup
     380: aload_1
     381: aload_2
     382: invokespecial #162                // Method android/content/ComponentName."<init>":(Ljava/lang/String;Ljava/lang/String;)V
     385: invokevirtual #166                // Method android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
     388: pop
     389: aload_0
     390: getfield      #21                 // Field a:Ljava/lang/ref/WeakReference;
     393: invokevirtual #70                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     396: checkcast     #6                  // class ryey/easer/core/f
     399: invokestatic  #170                // Method ryey/easer/core/f.h:(Lryey/easer/core/f;)Lryey/easer/core/f$d;
     402: aload_3
     403: invokeinterface #175,  2          // InterfaceMethod ryey/easer/core/f$d.a:(Landroid/content/Intent;)V
     408: return
    Exception table:
       from    to  target type
         236   264   283   any
}
