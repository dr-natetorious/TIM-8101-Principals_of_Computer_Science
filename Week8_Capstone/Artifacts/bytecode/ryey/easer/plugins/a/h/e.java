public class ryey.easer.plugins.a.h.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.h.a> {
  static {};
    Code:
       0: getstatic     #21                 // Field android/os/Build$VERSION.SDK_INT:I
       3: istore_0
       4: ldc           #23                 // String android.intent.action.HEADSET_PLUG
       6: putstatic     #25                 // Field a:Ljava/lang/String;
       9: return

  ryey.easer.plugins.a.h.e(android.content.Context, ryey.easer.plugins.a.h.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #31                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #33                 // class android/content/IntentFilter
      13: dup
      14: getstatic     #25                 // Field a:Ljava/lang/String;
      17: invokespecial #36                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      20: putfield      #38                 // Field b:Landroid/content/IntentFilter;
      23: aload_0
      24: new           #7                  // class ryey/easer/plugins/a/h/e$1
      27: dup
      28: aload_0
      29: invokespecial #41                 // Method ryey/easer/plugins/a/h/e$1."<init>":(Lryey/easer/plugins/a/h/e;)V
      32: putfield      #43                 // Field c:Landroid/content/BroadcastReceiver;
      35: aload_1
      36: ldc           #45                 // String audio
      38: invokevirtual #51                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      41: checkcast     #53                 // class android/media/AudioManager
      44: astore_3
      45: getstatic     #21                 // Field android/os/Build$VERSION.SDK_INT:I
      48: istore        5
      50: aconst_null
      51: astore_1
      52: iconst_1
      53: istore        8
      55: iload         5
      57: bipush        23
      59: if_icmplt     152
      62: aload_3
      63: iconst_3
      64: invokevirtual #57                 // Method android/media/AudioManager.getDevices:(I)[Landroid/media/AudioDeviceInfo;
      67: astore        4
      69: aload         4
      71: arraylength
      72: istore        6
      74: aconst_null
      75: astore_3
      76: aload_3
      77: astore_1
      78: iconst_0
      79: istore        5
      81: iload         5
      83: iload         6
      85: if_icmpge     136
      88: aload         4
      90: iload         5
      92: aaload
      93: astore        10
      95: aload         10
      97: invokevirtual #63                 // Method android/media/AudioDeviceInfo.getType:()I
     100: iconst_4
     101: if_icmpeq     113
     104: aload         10
     106: invokevirtual #63                 // Method android/media/AudioDeviceInfo.getType:()I
     109: iconst_3
     110: if_icmpne     127
     113: iconst_1
     114: invokestatic  #69                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     117: astore_3
     118: aload         10
     120: invokevirtual #73                 // Method android/media/AudioDeviceInfo.isSource:()Z
     123: invokestatic  #69                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     126: astore_1
     127: iload         5
     129: iconst_1
     130: iadd
     131: istore        5
     133: goto          81
     136: aload_3
     137: astore        4
     139: aload_3
     140: ifnonnull     149
     143: iconst_0
     144: invokestatic  #69                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     147: astore        4
     149: goto          161
     152: aload_3
     153: invokevirtual #76                 // Method android/media/AudioManager.isWiredHeadsetOn:()Z
     156: invokestatic  #69                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     159: astore        4
     161: aload         4
     163: invokevirtual #79                 // Method java/lang/Boolean.booleanValue:()Z
     166: istore        9
     168: aload_2
     169: getfield      #84                 // Field ryey/easer/plugins/a/h/a.a:Lryey/easer/plugins/a/h/a$a;
     172: getstatic     #87                 // Field ryey/easer/plugins/a/h/a$a.a:Lryey/easer/plugins/a/h/a$a;
     175: if_acmpne     184
     178: iconst_1
     179: istore        7
     181: goto          187
     184: iconst_0
     185: istore        7
     187: iload         9
     189: iload         7
     191: if_icmpne     266
     194: aload_2
     195: getfield      #90                 // Field ryey/easer/plugins/a/h/a.b:Lryey/easer/plugins/a/h/a$b;
     198: getstatic     #94                 // Field ryey/easer/plugins/a/h/a$b.c:Lryey/easer/plugins/a/h/a$b;
     201: if_acmpne     217
     204: iload         8
     206: istore        7
     208: iload         7
     210: invokestatic  #69                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     213: astore_1
     214: goto          271
     217: aload_1
     218: ifnull        276
     221: aload_1
     222: invokevirtual #79                 // Method java/lang/Boolean.booleanValue:()Z
     225: istore        9
     227: aload_2
     228: getfield      #90                 // Field ryey/easer/plugins/a/h/a.b:Lryey/easer/plugins/a/h/a$b;
     231: getstatic     #96                 // Field ryey/easer/plugins/a/h/a$b.a:Lryey/easer/plugins/a/h/a$b;
     234: if_acmpne     243
     237: iconst_1
     238: istore        7
     240: goto          246
     243: iconst_0
     244: istore        7
     246: iload         9
     248: iload         7
     250: if_icmpne     260
     253: iload         8
     255: istore        7
     257: goto          208
     260: iconst_0
     261: istore        7
     263: goto          208
     266: iconst_0
     267: invokestatic  #69                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     270: astore_1
     271: aload_0
     272: aload_1
     273: invokevirtual #99                 // Method a:(Ljava/lang/Boolean;)V
     276: return

  static ryey.easer.commons.local_plugin.a.a a(ryey.easer.plugins.a.h.e);
    Code:
       0: aload_0
       1: getfield      #104                // Field e:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  static void a(ryey.easer.plugins.a.h.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #99                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  static boolean a(ryey.easer.plugins.a.h.a, boolean, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokestatic  #108                // Method b:(Lryey/easer/plugins/a/h/a;ZZ)Z
       6: ireturn

  static java.lang.String d();
    Code:
       0: getstatic     #25                 // Field a:Ljava/lang/String;
       3: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #113                // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #43                 // Field c:Landroid/content/BroadcastReceiver;
       8: aload_0
       9: getfield      #38                 // Field b:Landroid/content/IntentFilter;
      12: invokevirtual #117                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      15: pop
      16: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #113                // Field d:Landroid/content/Context;
       4: aload_0
       5: getfield      #43                 // Field c:Landroid/content/BroadcastReceiver;
       8: invokevirtual #121                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      11: return
}
