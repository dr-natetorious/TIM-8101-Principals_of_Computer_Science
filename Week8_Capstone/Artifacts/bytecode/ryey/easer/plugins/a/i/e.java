public class ryey.easer.plugins.a.i.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.i.a> {
  ryey.easer.plugins.a.i.e(android.content.Context, ryey.easer.plugins.a.i.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #16                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/a/i/e$1
      13: dup
      14: aload_0
      15: invokespecial #19                 // Method ryey/easer/plugins/a/i/e$1."<init>":(Lryey/easer/plugins/a/i/e;)V
      18: putfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #23                 // class android/content/IntentFilter
      25: dup
      26: invokespecial #26                 // Method android/content/IntentFilter."<init>":()V
      29: putfield      #28                 // Field b:Landroid/content/IntentFilter;
      32: aload_0
      33: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      36: ldc           #30                 // String android.intent.action.SCREEN_ON
      38: invokevirtual #34                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      41: aload_0
      42: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      45: ldc           #36                 // String android.intent.action.SCREEN_OFF
      47: invokevirtual #34                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      50: aload_0
      51: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      54: ldc           #38                 // String android.intent.action.USER_PRESENT
      56: invokevirtual #34                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      59: aload_1
      60: ldc           #40                 // String power
      62: invokevirtual #46                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      65: checkcast     #48                 // class android/os/PowerManager
      68: astore_1
      69: iconst_0
      70: istore        5
      72: aload_1
      73: ifnonnull     86
      76: ldc           #50                 // String ScreenTracker can't get PowerManager
      78: iconst_0
      79: anewarray     #52                 // class java/lang/Object
      82: invokestatic  #57                 // Method com/b/a/i.b:(Ljava/lang/String;[Ljava/lang/Object;)V
      85: return
      86: aload_1
      87: invokevirtual #61                 // Method android/os/PowerManager.isScreenOn:()Z
      90: ifeq          116
      93: aload_2
      94: getfield      #66                 // Field ryey/easer/plugins/a/i/a.a:Lryey/easer/plugins/a/i/a$a;
      97: getstatic     #69                 // Field ryey/easer/plugins/a/i/a$a.a:Lryey/easer/plugins/a/i/a$a;
     100: if_acmpne     106
     103: iconst_1
     104: istore        5
     106: aload_0
     107: iload         5
     109: invokestatic  #75                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     112: invokevirtual #78                 // Method a:(Ljava/lang/Boolean;)V
     115: return
     116: aload_2
     117: getfield      #66                 // Field ryey/easer/plugins/a/i/a.a:Lryey/easer/plugins/a/i/a$a;
     120: getstatic     #80                 // Field ryey/easer/plugins/a/i/a$a.b:Lryey/easer/plugins/a/i/a$a;
     123: if_acmpne     106
     126: goto          103

  static ryey.easer.commons.local_plugin.a.a a(ryey.easer.plugins.a.i.e);
    Code:
       0: aload_0
       1: getfield      #86                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void a(ryey.easer.plugins.a.i.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #78                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static ryey.easer.commons.local_plugin.a.a b(ryey.easer.plugins.a.i.e);
    Code:
       0: aload_0
       1: getfield      #86                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void b(ryey.easer.plugins.a.i.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #78                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static ryey.easer.commons.local_plugin.a.a c(ryey.easer.plugins.a.i.e);
    Code:
       0: aload_0
       1: getfield      #86                 // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void c(ryey.easer.plugins.a.i.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #78                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #92                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      12: invokevirtual #96                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #92                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      12: invokevirtual #96                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return
}
