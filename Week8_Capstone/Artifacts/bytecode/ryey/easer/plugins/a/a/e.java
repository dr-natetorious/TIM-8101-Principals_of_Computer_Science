public class ryey.easer.plugins.a.a.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.a.a> {
  ryey.easer.plugins.a.a.e(android.content.Context, ryey.easer.plugins.a.a.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #16                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/a/a/e$1
      13: dup
      14: aload_0
      15: invokespecial #19                 // Method ryey/easer/plugins/a/a/e$1."<init>":(Lryey/easer/plugins/a/a/e;)V
      18: putfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
      21: aload_0
      22: new           #23                 // class android/content/IntentFilter
      25: dup
      26: invokespecial #26                 // Method android/content/IntentFilter."<init>":()V
      29: putfield      #28                 // Field b:Landroid/content/IntentFilter;
      32: aload_0
      33: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      36: ldc           #30                 // String android.intent.action.ACTION_POWER_CONNECTED
      38: invokevirtual #34                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      41: aload_0
      42: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      45: ldc           #36                 // String android.intent.action.ACTION_POWER_DISCONNECTED
      47: invokevirtual #34                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      50: ldc           #38                 // String BatteryTracker constructed
      52: invokestatic  #43                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      55: return

  static void a(ryey.easer.plugins.a.a.e, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #48                 // Method a:(Z)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #86                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #28                 // Field b:Landroid/content/IntentFilter;
      12: invokevirtual #92                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #86                 // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/content/BroadcastReceiver;
       8: invokevirtual #96                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return

  public java.lang.Boolean c();
    Code:
       0: ldc           #100                // String BatteryTracker.state()
       2: invokestatic  #43                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
       5: new           #23                 // class android/content/IntentFilter
       8: dup
       9: ldc           #102                // String android.intent.action.BATTERY_CHANGED
      11: invokespecial #104                // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      14: astore        4
      16: aload_0
      17: getfield      #86                 // Field d:Landroid/content/Context;
      20: aconst_null
      21: aload         4
      23: invokevirtual #92                 // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      26: ldc           #106                // String status
      28: iconst_m1
      29: invokevirtual #112                // Method android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
      32: istore_1
      33: iconst_1
      34: istore_3
      35: iload_1
      36: iconst_2
      37: if_icmpeq     53
      40: iload_1
      41: iconst_5
      42: if_icmpne     48
      45: goto          53
      48: iconst_0
      49: istore_1
      50: goto          55
      53: iconst_1
      54: istore_1
      55: aload_0
      56: getfield      #54                 // Field e:Lryey/easer/commons/local_plugin/a/a;
      59: checkcast     #56                 // class ryey/easer/plugins/a/a/a
      62: getfield      #59                 // Field ryey/easer/plugins/a/a/a.a:Ljava/lang/Integer;
      65: invokevirtual #65                 // Method java/lang/Integer.intValue:()I
      68: ifne          76
      71: iconst_1
      72: istore_2
      73: goto          78
      76: iconst_0
      77: istore_2
      78: iload_2
      79: iload_1
      80: if_icmpne     86
      83: goto          88
      86: iconst_0
      87: istore_3
      88: iload_3
      89: invokestatic  #118                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      92: areturn
}
