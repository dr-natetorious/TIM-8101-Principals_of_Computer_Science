public abstract class ryey.easer.plugins.event.c<T extends ryey.easer.commons.local_plugin.eventplugin.EventData> extends ryey.easer.plugins.event.b<T> {
  protected final android.net.Uri g;

  protected final android.app.PendingIntent h;

  protected final android.app.PendingIntent i;

  protected ryey.easer.plugins.event.c(android.content.Context, T, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #23                 // Method ryey/easer/plugins/event/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/eventplugin/EventData;ZZ)V
       9: aload_0
      10: getstatic     #29                 // Field java/util/Locale.US:Ljava/util/Locale;
      13: ldc           #31                 // String slot://%s/%d
      15: iconst_2
      16: anewarray     #33                 // class java/lang/Object
      19: dup
      20: iconst_0
      21: aload_0
      22: invokevirtual #37                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      25: invokevirtual #43                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      28: aastore
      29: dup
      30: iconst_1
      31: aload_0
      32: invokevirtual #47                 // Method java/lang/Object.hashCode:()I
      35: invokestatic  #53                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      38: aastore
      39: invokestatic  #59                 // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      42: invokestatic  #65                 // Method android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
      45: putfield      #67                 // Field g:Landroid/net/Uri;
      48: aload_0
      49: new           #7                  // class ryey/easer/plugins/event/c$1
      52: dup
      53: aload_0
      54: invokespecial #70                 // Method ryey/easer/plugins/event/c$1."<init>":(Lryey/easer/plugins/event/c;)V
      57: putfield      #72                 // Field k:Landroid/content/BroadcastReceiver;
      60: aload_0
      61: new           #74                 // class android/content/IntentFilter
      64: dup
      65: invokespecial #77                 // Method android/content/IntentFilter."<init>":()V
      68: putfield      #79                 // Field j:Landroid/content/IntentFilter;
      71: aload_0
      72: getfield      #79                 // Field j:Landroid/content/IntentFilter;
      75: ldc           #81                 // String ryey.easer.triggerlotus.abstractslot.SATISFIED
      77: invokevirtual #85                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      80: aload_0
      81: getfield      #79                 // Field j:Landroid/content/IntentFilter;
      84: ldc           #87                 // String ryey.easer.triggerlotus.abstractslot.UNSATISFIED
      86: invokevirtual #85                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      89: aload_0
      90: getfield      #79                 // Field j:Landroid/content/IntentFilter;
      93: ldc           #89                 // String ryey.easer.triggetlotus.category.NOTIFY_SLOT
      95: invokevirtual #92                 // Method android/content/IntentFilter.addCategory:(Ljava/lang/String;)V
      98: aload_0
      99: getfield      #79                 // Field j:Landroid/content/IntentFilter;
     102: aload_0
     103: getfield      #67                 // Field g:Landroid/net/Uri;
     106: invokevirtual #95                 // Method android/net/Uri.getScheme:()Ljava/lang/String;
     109: invokevirtual #98                 // Method android/content/IntentFilter.addDataScheme:(Ljava/lang/String;)V
     112: aload_0
     113: getfield      #79                 // Field j:Landroid/content/IntentFilter;
     116: aload_0
     117: getfield      #67                 // Field g:Landroid/net/Uri;
     120: invokevirtual #101                // Method android/net/Uri.getAuthority:()Ljava/lang/String;
     123: aconst_null
     124: invokevirtual #105                // Method android/content/IntentFilter.addDataAuthority:(Ljava/lang/String;Ljava/lang/String;)V
     127: aload_0
     128: getfield      #79                 // Field j:Landroid/content/IntentFilter;
     131: aload_0
     132: getfield      #67                 // Field g:Landroid/net/Uri;
     135: invokevirtual #108                // Method android/net/Uri.getPath:()Ljava/lang/String;
     138: iconst_0
     139: invokevirtual #112                // Method android/content/IntentFilter.addDataPath:(Ljava/lang/String;I)V
     142: new           #114                // class android/content/Intent
     145: dup
     146: ldc           #81                 // String ryey.easer.triggerlotus.abstractslot.SATISFIED
     148: invokespecial #116                // Method android/content/Intent."<init>":(Ljava/lang/String;)V
     151: astore_1
     152: aload_1
     153: ldc           #89                 // String ryey.easer.triggetlotus.category.NOTIFY_SLOT
     155: invokevirtual #119                // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
     158: pop
     159: aload_1
     160: aload_0
     161: getfield      #67                 // Field g:Landroid/net/Uri;
     164: invokevirtual #123                // Method android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
     167: pop
     168: aload_0
     169: aload_0
     170: getfield      #126                // Field a:Landroid/content/Context;
     173: iconst_0
     174: aload_1
     175: iconst_0
     176: invokestatic  #132                // Method android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
     179: putfield      #134                // Field h:Landroid/app/PendingIntent;
     182: aload_1
     183: ldc           #87                 // String ryey.easer.triggerlotus.abstractslot.UNSATISFIED
     185: invokevirtual #137                // Method android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
     188: pop
     189: aload_0
     190: aload_0
     191: getfield      #126                // Field a:Landroid/content/Context;
     194: iconst_0
     195: aload_1
     196: iconst_0
     197: invokestatic  #132                // Method android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
     200: putfield      #139                // Field i:Landroid/app/PendingIntent;
     203: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #126                // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #72                 // Field k:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #79                 // Field j:Landroid/content/IntentFilter;
      12: invokevirtual #148                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  protected void a(android.content.Intent);
    Code:
       0: ldc           #151                // String onPositiveNotified
       2: iconst_0
       3: anewarray     #33                 // class java/lang/Object
       6: invokestatic  #157                // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: iconst_1
      11: invokevirtual #160                // Method a:(Z)V
      14: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #126                // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #72                 // Field k:Landroid/content/BroadcastReceiver;
       8: invokevirtual #165                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return

  protected void b(android.content.Intent);
    Code:
       0: ldc           #167                // String onNegativeNotified
       2: iconst_0
       3: anewarray     #33                 // class java/lang/Object
       6: invokestatic  #157                // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: iconst_0
      11: invokevirtual #160                // Method a:(Z)V
      14: return
}
