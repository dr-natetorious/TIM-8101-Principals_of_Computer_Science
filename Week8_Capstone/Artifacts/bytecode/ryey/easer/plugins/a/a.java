public abstract class ryey.easer.plugins.a.a<D extends ryey.easer.commons.local_plugin.a.a> extends ryey.easer.plugins.a.b<D> {
  protected final android.net.Uri a;

  protected final android.app.PendingIntent b;

  protected final android.app.PendingIntent c;

  protected ryey.easer.plugins.a.a(android.content.Context, D, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #20                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: getstatic     #26                 // Field java/util/Locale.US:Ljava/util/Locale;
      13: ldc           #28                 // String slot://%s/%d
      15: iconst_2
      16: anewarray     #30                 // class java/lang/Object
      19: dup
      20: iconst_0
      21: aload_0
      22: invokevirtual #34                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      25: invokevirtual #40                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      28: aastore
      29: dup
      30: iconst_1
      31: aload_0
      32: invokevirtual #44                 // Method java/lang/Object.hashCode:()I
      35: invokestatic  #50                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      38: aastore
      39: invokestatic  #56                 // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      42: invokestatic  #62                 // Method android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
      45: putfield      #64                 // Field a:Landroid/net/Uri;
      48: aload_0
      49: new           #7                  // class ryey/easer/plugins/a/a$1
      52: dup
      53: aload_0
      54: invokespecial #67                 // Method ryey/easer/plugins/a/a$1."<init>":(Lryey/easer/plugins/a/a;)V
      57: putfield      #69                 // Field k:Landroid/content/BroadcastReceiver;
      60: aload_0
      61: new           #71                 // class android/content/IntentFilter
      64: dup
      65: invokespecial #74                 // Method android/content/IntentFilter."<init>":()V
      68: putfield      #76                 // Field j:Landroid/content/IntentFilter;
      71: aload_0
      72: getfield      #76                 // Field j:Landroid/content/IntentFilter;
      75: ldc           #78                 // String ryey.easer.tracker.SATISFIED
      77: invokevirtual #82                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      80: aload_0
      81: getfield      #76                 // Field j:Landroid/content/IntentFilter;
      84: ldc           #84                 // String ryey.easer.tracker.UNSATISFIED
      86: invokevirtual #82                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      89: aload_0
      90: getfield      #76                 // Field j:Landroid/content/IntentFilter;
      93: ldc           #86                 // String ryey.easer.tracker.category.NOTIFY_SLOT
      95: invokevirtual #89                 // Method android/content/IntentFilter.addCategory:(Ljava/lang/String;)V
      98: aload_0
      99: getfield      #76                 // Field j:Landroid/content/IntentFilter;
     102: aload_0
     103: getfield      #64                 // Field a:Landroid/net/Uri;
     106: invokevirtual #92                 // Method android/net/Uri.getScheme:()Ljava/lang/String;
     109: invokevirtual #95                 // Method android/content/IntentFilter.addDataScheme:(Ljava/lang/String;)V
     112: aload_0
     113: getfield      #76                 // Field j:Landroid/content/IntentFilter;
     116: aload_0
     117: getfield      #64                 // Field a:Landroid/net/Uri;
     120: invokevirtual #98                 // Method android/net/Uri.getAuthority:()Ljava/lang/String;
     123: aconst_null
     124: invokevirtual #102                // Method android/content/IntentFilter.addDataAuthority:(Ljava/lang/String;Ljava/lang/String;)V
     127: aload_0
     128: getfield      #76                 // Field j:Landroid/content/IntentFilter;
     131: aload_0
     132: getfield      #64                 // Field a:Landroid/net/Uri;
     135: invokevirtual #105                // Method android/net/Uri.getPath:()Ljava/lang/String;
     138: iconst_0
     139: invokevirtual #109                // Method android/content/IntentFilter.addDataPath:(Ljava/lang/String;I)V
     142: new           #111                // class android/content/Intent
     145: dup
     146: ldc           #78                 // String ryey.easer.tracker.SATISFIED
     148: invokespecial #113                // Method android/content/Intent."<init>":(Ljava/lang/String;)V
     151: astore_1
     152: aload_1
     153: ldc           #86                 // String ryey.easer.tracker.category.NOTIFY_SLOT
     155: invokevirtual #116                // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
     158: pop
     159: aload_1
     160: aload_0
     161: getfield      #64                 // Field a:Landroid/net/Uri;
     164: invokevirtual #120                // Method android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
     167: pop
     168: aload_0
     169: aload_0
     170: getfield      #124                // Field d:Landroid/content/Context;
     173: iconst_0
     174: aload_1
     175: iconst_0
     176: invokestatic  #130                // Method android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
     179: putfield      #132                // Field b:Landroid/app/PendingIntent;
     182: aload_1
     183: ldc           #84                 // String ryey.easer.tracker.UNSATISFIED
     185: invokevirtual #135                // Method android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
     188: pop
     189: aload_0
     190: aload_0
     191: getfield      #124                // Field d:Landroid/content/Context;
     194: iconst_0
     195: aload_1
     196: iconst_0
     197: invokestatic  #130                // Method android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
     200: putfield      #137                // Field c:Landroid/app/PendingIntent;
     203: return

  protected void d();
    Code:
       0: ldc           #142                // String onPositiveNotified
       2: iconst_0
       3: anewarray     #30                 // class java/lang/Object
       6: invokestatic  #147                // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: iconst_1
      11: invokestatic  #152                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      14: invokevirtual #155                // Method a:(Ljava/lang/Boolean;)V
      17: return

  protected void e();
    Code:
       0: ldc           #158                // String onNegativeNotified
       2: iconst_0
       3: anewarray     #30                 // class java/lang/Object
       6: invokestatic  #147                // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
       9: aload_0
      10: iconst_0
      11: invokestatic  #152                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      14: invokevirtual #155                // Method a:(Ljava/lang/Boolean;)V
      17: return
}
