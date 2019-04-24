public final class android.support.v4.a.c {
  static {};
    Code:
       0: new           #4                  // class java/lang/Object
       3: dup
       4: invokespecial #31                 // Method java/lang/Object."<init>":()V
       7: putstatic     #33                 // Field f:Ljava/lang/Object;
      10: return

  public static android.support.v4.a.c a(android.content.Context);
    Code:
       0: getstatic     #33                 // Field f:Ljava/lang/Object;
       3: astore_1
       4: aload_1
       5: monitorenter
       6: getstatic     #63                 // Field g:Landroid/support/v4/a/c;
       9: ifnonnull     26
      12: new           #2                  // class android/support/v4/a/c
      15: dup
      16: aload_0
      17: invokevirtual #67                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      20: invokespecial #69                 // Method "<init>":(Landroid/content/Context;)V
      23: putstatic     #63                 // Field g:Landroid/support/v4/a/c;
      26: getstatic     #63                 // Field g:Landroid/support/v4/a/c;
      29: astore_0
      30: aload_1
      31: monitorexit
      32: aload_0
      33: areturn
      34: astore_0
      35: aload_1
      36: monitorexit
      37: aload_0
      38: athrow
    Exception table:
       from    to  target type
           6    26    34   any
          26    32    34   any
          35    37    34   any

  static void a(android.support.v4.a.c);
    Code:
       0: aload_0
       1: invokespecial #104                // Method a:()V
       4: return

  public void a(android.content.BroadcastReceiver);
    Code:
       0: aload_0
       1: getfield      #40                 // Field b:Ljava/util/HashMap;
       4: astore        5
       6: aload         5
       8: monitorenter
       9: aload_0
      10: getfield      #40                 // Field b:Ljava/util/HashMap;
      13: aload_1
      14: invokevirtual #109                // Method java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      17: checkcast     #44                 // class java/util/ArrayList
      20: astore        6
      22: aload         6
      24: ifnonnull     31
      27: aload         5
      29: monitorexit
      30: return
      31: aload         6
      33: invokevirtual #73                 // Method java/util/ArrayList.size:()I
      36: iconst_1
      37: isub
      38: istore_2
      39: iload_2
      40: iflt          177
      43: aload         6
      45: iload_2
      46: invokevirtual #86                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      49: checkcast     #11                 // class android/support/v4/a/c$b
      52: astore        7
      54: aload         7
      56: iconst_1
      57: putfield      #89                 // Field android/support/v4/a/c$b.d:Z
      60: iconst_0
      61: istore_3
      62: iload_3
      63: aload         7
      65: getfield      #112                // Field android/support/v4/a/c$b.a:Landroid/content/IntentFilter;
      68: invokevirtual #117                // Method android/content/IntentFilter.countActions:()I
      71: if_icmpge     203
      74: aload         7
      76: getfield      #112                // Field android/support/v4/a/c$b.a:Landroid/content/IntentFilter;
      79: iload_3
      80: invokevirtual #121                // Method android/content/IntentFilter.getAction:(I)Ljava/lang/String;
      83: astore        8
      85: aload_0
      86: getfield      #42                 // Field c:Ljava/util/HashMap;
      89: aload         8
      91: invokevirtual #123                // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      94: checkcast     #44                 // class java/util/ArrayList
      97: astore        9
      99: aload         9
     101: ifnull        196
     104: aload         9
     106: invokevirtual #73                 // Method java/util/ArrayList.size:()I
     109: iconst_1
     110: isub
     111: istore        4
     113: iload         4
     115: iflt          156
     118: aload         9
     120: iload         4
     122: invokevirtual #86                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     125: checkcast     #11                 // class android/support/v4/a/c$b
     128: astore        10
     130: aload         10
     132: getfield      #92                 // Field android/support/v4/a/c$b.b:Landroid/content/BroadcastReceiver;
     135: aload_1
     136: if_acmpne     187
     139: aload         10
     141: iconst_1
     142: putfield      #89                 // Field android/support/v4/a/c$b.d:Z
     145: aload         9
     147: iload         4
     149: invokevirtual #125                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     152: pop
     153: goto          187
     156: aload         9
     158: invokevirtual #73                 // Method java/util/ArrayList.size:()I
     161: ifgt          196
     164: aload_0
     165: getfield      #42                 // Field c:Ljava/util/HashMap;
     168: aload         8
     170: invokevirtual #109                // Method java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
     173: pop
     174: goto          196
     177: aload         5
     179: monitorexit
     180: return
     181: astore_1
     182: aload         5
     184: monitorexit
     185: aload_1
     186: athrow
     187: iload         4
     189: iconst_1
     190: isub
     191: istore        4
     193: goto          113
     196: iload_3
     197: iconst_1
     198: iadd
     199: istore_3
     200: goto          62
     203: iload_2
     204: iconst_1
     205: isub
     206: istore_2
     207: goto          39
    Exception table:
       from    to  target type
           9    22   181   any
          27    30   181   any
          31    39   181   any
          43    60   181   any
          62    99   181   any
         104   113   181   any
         118   153   181   any
         156   174   181   any
         177   180   181   any
         182   185   181   any

  public void a(android.content.BroadcastReceiver, android.content.IntentFilter);
    Code:
       0: aload_0
       1: getfield      #40                 // Field b:Ljava/util/HashMap;
       4: astore        6
       6: aload         6
       8: monitorenter
       9: new           #11                 // class android/support/v4/a/c$b
      12: dup
      13: aload_2
      14: aload_1
      15: invokespecial #129                // Method android/support/v4/a/c$b."<init>":(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V
      18: astore        7
      20: aload_0
      21: getfield      #40                 // Field b:Ljava/util/HashMap;
      24: aload_1
      25: invokevirtual #123                // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      28: checkcast     #44                 // class java/util/ArrayList
      31: astore        5
      33: aload         5
      35: astore        4
      37: aload         5
      39: ifnonnull     63
      42: new           #44                 // class java/util/ArrayList
      45: dup
      46: iconst_1
      47: invokespecial #132                // Method java/util/ArrayList."<init>":(I)V
      50: astore        4
      52: aload_0
      53: getfield      #40                 // Field b:Ljava/util/HashMap;
      56: aload_1
      57: aload         4
      59: invokevirtual #136                // Method java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      62: pop
      63: aload         4
      65: aload         7
      67: invokevirtual #140                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      70: pop
      71: iconst_0
      72: istore_3
      73: iload_3
      74: aload_2
      75: invokevirtual #117                // Method android/content/IntentFilter.countActions:()I
      78: if_icmpge     144
      81: aload_2
      82: iload_3
      83: invokevirtual #121                // Method android/content/IntentFilter.getAction:(I)Ljava/lang/String;
      86: astore        5
      88: aload_0
      89: getfield      #42                 // Field c:Ljava/util/HashMap;
      92: aload         5
      94: invokevirtual #123                // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      97: checkcast     #44                 // class java/util/ArrayList
     100: astore        4
     102: aload         4
     104: astore_1
     105: aload         4
     107: ifnonnull     130
     110: new           #44                 // class java/util/ArrayList
     113: dup
     114: iconst_1
     115: invokespecial #132                // Method java/util/ArrayList."<init>":(I)V
     118: astore_1
     119: aload_0
     120: getfield      #42                 // Field c:Ljava/util/HashMap;
     123: aload         5
     125: aload_1
     126: invokevirtual #136                // Method java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     129: pop
     130: aload_1
     131: aload         7
     133: invokevirtual #140                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     136: pop
     137: iload_3
     138: iconst_1
     139: iadd
     140: istore_3
     141: goto          73
     144: aload         6
     146: monitorexit
     147: return
     148: astore_1
     149: aload         6
     151: monitorexit
     152: aload_1
     153: athrow
    Exception table:
       from    to  target type
           9    33   148   any
          42    63   148   any
          63    71   148   any
          73   102   148   any
         110   130   148   any
         130   137   148   any
         144   147   148   any
         149   152   148   any

  public boolean a(android.content.Intent);
    Code:
       0: aload_0
       1: getfield      #40                 // Field b:Ljava/util/HashMap;
       4: astore        11
       6: aload         11
       8: monitorenter
       9: aload_1
      10: invokevirtual #146                // Method android/content/Intent.getAction:()Ljava/lang/String;
      13: astore        8
      15: aload_1
      16: aload_0
      17: getfield      #49                 // Field a:Landroid/content/Context;
      20: invokevirtual #150                // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
      23: invokevirtual #154                // Method android/content/Intent.resolveTypeIfNeeded:(Landroid/content/ContentResolver;)Ljava/lang/String;
      26: astore        9
      28: aload_1
      29: invokevirtual #158                // Method android/content/Intent.getData:()Landroid/net/Uri;
      32: astore        10
      34: aload_1
      35: invokevirtual #161                // Method android/content/Intent.getScheme:()Ljava/lang/String;
      38: astore        12
      40: aload_1
      41: invokevirtual #165                // Method android/content/Intent.getCategories:()Ljava/util/Set;
      44: astore        13
      46: aload_1
      47: invokevirtual #168                // Method android/content/Intent.getFlags:()I
      50: bipush        8
      52: iand
      53: ifeq          516
      56: iconst_1
      57: istore_2
      58: goto          61
      61: iload_2
      62: ifeq          132
      65: new           #170                // class java/lang/StringBuilder
      68: dup
      69: invokespecial #171                // Method java/lang/StringBuilder."<init>":()V
      72: astore        5
      74: aload         5
      76: ldc           #173                // String Resolving type
      78: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      81: pop
      82: aload         5
      84: aload         9
      86: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      89: pop
      90: aload         5
      92: ldc           #179                // String  scheme
      94: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      97: pop
      98: aload         5
     100: aload         12
     102: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     105: pop
     106: aload         5
     108: ldc           #181                // String  of intent
     110: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     113: pop
     114: aload         5
     116: aload_1
     117: invokevirtual #184                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     120: pop
     121: ldc           #186                // String LocalBroadcastManager
     123: aload         5
     125: invokevirtual #189                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     128: invokestatic  #195                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     131: pop
     132: aload_0
     133: getfield      #42                 // Field c:Ljava/util/HashMap;
     136: aload_1
     137: invokevirtual #146                // Method android/content/Intent.getAction:()Ljava/lang/String;
     140: invokevirtual #123                // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
     143: checkcast     #44                 // class java/util/ArrayList
     146: astore        7
     148: aload         7
     150: ifnull        505
     153: iload_2
     154: ifeq          521
     157: new           #170                // class java/lang/StringBuilder
     160: dup
     161: invokespecial #171                // Method java/lang/StringBuilder."<init>":()V
     164: astore        5
     166: aload         5
     168: ldc           #197                // String Action list:
     170: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     173: pop
     174: aload         5
     176: aload         7
     178: invokevirtual #184                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     181: pop
     182: ldc           #186                // String LocalBroadcastManager
     184: aload         5
     186: invokevirtual #189                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     189: invokestatic  #195                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     192: pop
     193: goto          521
     196: iload_3
     197: aload         7
     199: invokevirtual #73                 // Method java/util/ArrayList.size:()I
     202: if_icmpge     618
     205: aload         7
     207: iload_3
     208: invokevirtual #86                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     211: checkcast     #11                 // class android/support/v4/a/c$b
     214: astore        14
     216: iload_2
     217: ifeq          259
     220: new           #170                // class java/lang/StringBuilder
     223: dup
     224: invokespecial #171                // Method java/lang/StringBuilder."<init>":()V
     227: astore        5
     229: aload         5
     231: ldc           #199                // String Matching against filter
     233: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     236: pop
     237: aload         5
     239: aload         14
     241: getfield      #112                // Field android/support/v4/a/c$b.a:Landroid/content/IntentFilter;
     244: invokevirtual #184                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     247: pop
     248: ldc           #186                // String LocalBroadcastManager
     250: aload         5
     252: invokevirtual #189                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     255: invokestatic  #195                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     258: pop
     259: aload         14
     261: getfield      #201                // Field android/support/v4/a/c$b.c:Z
     264: ifeq          282
     267: iload_2
     268: ifeq          529
     271: ldc           #186                // String LocalBroadcastManager
     273: ldc           #203                // String   Filter's target already added
     275: invokestatic  #195                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     278: pop
     279: goto          529
     282: aload         14
     284: getfield      #112                // Field android/support/v4/a/c$b.a:Landroid/content/IntentFilter;
     287: astore        15
     289: aload         6
     291: astore        5
     293: aload         15
     295: aload         8
     297: aload         9
     299: aload         12
     301: aload         10
     303: aload         13
     305: ldc           #186                // String LocalBroadcastManager
     307: invokevirtual #207                // Method android/content/IntentFilter.match:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I
     310: istore        4
     312: iload         4
     314: iflt          539
     317: iload_2
     318: ifeq          360
     321: new           #170                // class java/lang/StringBuilder
     324: dup
     325: invokespecial #171                // Method java/lang/StringBuilder."<init>":()V
     328: astore        6
     330: aload         6
     332: ldc           #209                // String   Filter matched!  match=0x
     334: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     337: pop
     338: aload         6
     340: iload         4
     342: invokestatic  #214                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     345: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     348: pop
     349: ldc           #186                // String LocalBroadcastManager
     351: aload         6
     353: invokevirtual #189                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     356: invokestatic  #195                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     359: pop
     360: aload         5
     362: ifnonnull     532
     365: new           #44                 // class java/util/ArrayList
     368: dup
     369: invokespecial #45                 // Method java/util/ArrayList."<init>":()V
     372: astore        6
     374: goto          377
     377: aload         6
     379: aload         14
     381: invokevirtual #140                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     384: pop
     385: aload         14
     387: iconst_1
     388: putfield      #201                // Field android/support/v4/a/c$b.c:Z
     391: goto          611
     394: new           #170                // class java/lang/StringBuilder
     397: dup
     398: invokespecial #171                // Method java/lang/StringBuilder."<init>":()V
     401: astore        14
     403: aload         14
     405: ldc           #216                // String   Filter did not match:
     407: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     410: pop
     411: aload         14
     413: aload         5
     415: invokevirtual #177                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     418: pop
     419: ldc           #186                // String LocalBroadcastManager
     421: aload         14
     423: invokevirtual #189                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     426: invokestatic  #195                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     429: pop
     430: goto          611
     433: iload_2
     434: aload         6
     436: invokevirtual #73                 // Method java/util/ArrayList.size:()I
     439: if_icmpge     462
     442: aload         6
     444: iload_2
     445: invokevirtual #86                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     448: checkcast     #11                 // class android/support/v4/a/c$b
     451: iconst_0
     452: putfield      #201                // Field android/support/v4/a/c$b.c:Z
     455: iload_2
     456: iconst_1
     457: iadd
     458: istore_2
     459: goto          433
     462: aload_0
     463: getfield      #47                 // Field d:Ljava/util/ArrayList;
     466: new           #8                  // class android/support/v4/a/c$a
     469: dup
     470: aload_1
     471: aload         6
     473: invokespecial #219                // Method android/support/v4/a/c$a."<init>":(Landroid/content/Intent;Ljava/util/ArrayList;)V
     476: invokevirtual #140                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     479: pop
     480: aload_0
     481: getfield      #60                 // Field e:Landroid/os/Handler;
     484: iconst_1
     485: invokevirtual #225                // Method android/os/Handler.hasMessages:(I)Z
     488: ifne          500
     491: aload_0
     492: getfield      #60                 // Field e:Landroid/os/Handler;
     495: iconst_1
     496: invokevirtual #228                // Method android/os/Handler.sendEmptyMessage:(I)Z
     499: pop
     500: aload         11
     502: monitorexit
     503: iconst_1
     504: ireturn
     505: aload         11
     507: monitorexit
     508: iconst_0
     509: ireturn
     510: astore_1
     511: aload         11
     513: monitorexit
     514: aload_1
     515: athrow
     516: iconst_0
     517: istore_2
     518: goto          61
     521: aconst_null
     522: astore        6
     524: iconst_0
     525: istore_3
     526: goto          196
     529: goto          611
     532: aload         5
     534: astore        6
     536: goto          377
     539: iload_2
     540: ifeq          611
     543: iload         4
     545: tableswitch   { // -4 to -1
                    -4: 604
                    -3: 597
                    -2: 590
                    -1: 583
               default: 576
          }
     576: ldc           #230                // String unknown reason
     578: astore        5
     580: goto          394
     583: ldc           #232                // String type
     585: astore        5
     587: goto          394
     590: ldc           #234                // String data
     592: astore        5
     594: goto          394
     597: ldc           #236                // String action
     599: astore        5
     601: goto          394
     604: ldc           #238                // String category
     606: astore        5
     608: goto          394
     611: iload_3
     612: iconst_1
     613: iadd
     614: istore_3
     615: goto          196
     618: aload         6
     620: ifnull        505
     623: iconst_0
     624: istore_2
     625: goto          433
    Exception table:
       from    to  target type
           9    56   510   any
          65   132   510   any
         132   148   510   any
         157   193   510   any
         196   216   510   any
         220   259   510   any
         259   267   510   any
         271   279   510   any
         282   289   510   any
         293   312   510   any
         321   360   510   any
         365   374   510   any
         377   391   510   any
         394   430   510   any
         433   455   510   any
         462   500   510   any
         500   503   510   any
         505   508   510   any
         511   514   510   any
}
