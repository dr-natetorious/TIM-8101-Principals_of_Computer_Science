public final class ryey.easer.core.h$a {
  public ryey.easer.core.h$a(a.b.b.a);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method "<init>":()V
       4: return

  public final void a(android.app.Service);
    Code:
       0: aload_1
       1: ldc           #17                 // String service
       3: invokestatic  #23                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: invokestatic  #26                 // Method ryey/easer/core/h.a:()I
       9: iconst_1
      10: iadd
      11: invokestatic  #29                 // Method ryey/easer/core/h.a:(I)V
      14: aload_1
      15: checkcast     #31                 // class android/content/Context
      18: astore_3
      19: aload_3
      20: invokestatic  #37                 // Method ryey/easer/a.d:(Landroid/content/Context;)Z
      23: ifne          27
      26: return
      27: aload_1
      28: ldc           #39                 // String notification
      30: invokevirtual #45                 // Method android/app/Service.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      33: checkcast     #47                 // class android/app/NotificationManager
      36: astore        4
      38: getstatic     #53                 // Field android/os/Build$VERSION.SDK_INT:I
      41: bipush        26
      43: if_icmplt     96
      46: new           #55                 // class android/app/NotificationChannel
      49: dup
      50: ldc           #57                 // String easer_ind
      52: ldc           #59                 // String Easer Service Indicator
      54: checkcast     #61                 // class java/lang/CharSequence
      57: iconst_2
      58: invokespecial #64                 // Method android/app/NotificationChannel."<init>":(Ljava/lang/String;Ljava/lang/CharSequence;I)V
      61: astore_2
      62: aload         4
      64: ifnonnull     70
      67: invokestatic  #66                 // Method a/b/b/c.a:()V
      70: aload         4
      72: aload_2
      73: invokevirtual #70                 // Method android/app/NotificationManager.createNotificationChannel:(Landroid/app/NotificationChannel;)V
      76: new           #72                 // class android/support/v4/app/ac$b
      79: dup
      80: aload_3
      81: ldc           #57                 // String easer_ind
      83: invokespecial #75                 // Method android/support/v4/app/ac$b."<init>":(Landroid/content/Context;Ljava/lang/String;)V
      86: astore_2
      87: aload_2
      88: iconst_1
      89: invokevirtual #78                 // Method android/support/v4/app/ac$b.b:(Z)Landroid/support/v4/app/ac$b;
      92: pop
      93: goto          116
      96: new           #72                 // class android/support/v4/app/ac$b
      99: dup
     100: aload_3
     101: invokespecial #81                 // Method android/support/v4/app/ac$b."<init>":(Landroid/content/Context;)V
     104: bipush        -2
     106: invokevirtual #84                 // Method android/support/v4/app/ac$b.b:(I)Landroid/support/v4/app/ac$b;
     109: astore_2
     110: aload_2
     111: ldc           #86                 // String NotificationCompat.Build?ationCompat.PRIORITY_MIN)
     113: invokestatic  #88                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     116: aload_3
     117: iconst_0
     118: new           #90                 // class android/content/Intent
     121: dup
     122: aload_3
     123: ldc           #92                 // class ryey/easer/core/ui/MainActivity
     125: invokespecial #95                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
     128: iconst_0
     129: invokestatic  #101                // Method android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
     132: astore        5
     134: aload_2
     135: ldc           #102                // int 2131558400
     137: invokevirtual #104                // Method android/support/v4/app/ac$b.a:(I)Landroid/support/v4/app/ac$b;
     140: aload_1
     141: ldc           #105                // int 2131624037
     143: invokevirtual #109                // Method android/app/Service.getString:(I)Ljava/lang/String;
     146: checkcast     #61                 // class java/lang/CharSequence
     149: invokevirtual #112                // Method android/support/v4/app/ac$b.a:(Ljava/lang/CharSequence;)Landroid/support/v4/app/ac$b;
     152: aload_1
     153: ldc           #113                // int 2131624274
     155: iconst_1
     156: anewarray     #4                  // class java/lang/Object
     159: dup
     160: iconst_0
     161: aload_1
     162: ldc           #105                // int 2131624037
     164: invokevirtual #109                // Method android/app/Service.getString:(I)Ljava/lang/String;
     167: aastore
     168: invokevirtual #116                // Method android/app/Service.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
     171: checkcast     #61                 // class java/lang/CharSequence
     174: invokevirtual #118                // Method android/support/v4/app/ac$b.b:(Ljava/lang/CharSequence;)Landroid/support/v4/app/ac$b;
     177: iconst_1
     178: invokevirtual #120                // Method android/support/v4/app/ac$b.a:(Z)Landroid/support/v4/app/ac$b;
     181: iconst_m1
     182: invokevirtual #123                // Method android/support/v4/app/ac$b.c:(I)Landroid/support/v4/app/ac$b;
     185: aload         5
     187: invokevirtual #126                // Method android/support/v4/app/ac$b.a:(Landroid/app/PendingIntent;)Landroid/support/v4/app/ac$b;
     190: pop
     191: aload_2
     192: invokevirtual #129                // Method android/support/v4/app/ac$b.a:()Landroid/app/Notification;
     195: astore_2
     196: aload_3
     197: invokestatic  #132                // Method ryey/easer/a.e:(Landroid/content/Context;)Z
     200: ifeq          212
     203: aload_1
     204: invokestatic  #134                // Method ryey/easer/core/h.b:()I
     207: aload_2
     208: invokevirtual #138                // Method android/app/Service.startForeground:(ILandroid/app/Notification;)V
     211: return
     212: aload         4
     214: ifnonnull     220
     217: invokestatic  #66                 // Method a/b/b/c.a:()V
     220: aload         4
     222: invokestatic  #134                // Method ryey/easer/core/h.b:()I
     225: aload_2
     226: invokevirtual #141                // Method android/app/NotificationManager.notify:(ILandroid/app/Notification;)V
     229: return

  public final void b(android.app.Service);
    Code:
       0: aload_1
       1: ldc           #17                 // String service
       3: invokestatic  #23                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: invokestatic  #143                // Method ryey/easer/core/h.c:()I
       9: iconst_1
      10: iadd
      11: invokestatic  #145                // Method ryey/easer/core/h.b:(I)V
      14: aload_1
      15: checkcast     #31                 // class android/content/Context
      18: astore_2
      19: aload_2
      20: invokestatic  #37                 // Method ryey/easer/a.d:(Landroid/content/Context;)Z
      23: ifne          27
      26: return
      27: aload_2
      28: invokestatic  #132                // Method ryey/easer/a.e:(Landroid/content/Context;)Z
      31: ifne          58
      34: aload_1
      35: ldc           #39                 // String notification
      37: invokevirtual #45                 // Method android/app/Service.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      40: checkcast     #47                 // class android/app/NotificationManager
      43: astore_1
      44: aload_1
      45: ifnonnull     51
      48: invokestatic  #66                 // Method a/b/b/c.a:()V
      51: aload_1
      52: invokestatic  #134                // Method ryey/easer/core/h.b:()I
      55: invokevirtual #148                // Method android/app/NotificationManager.cancel:(I)V
      58: return
}
